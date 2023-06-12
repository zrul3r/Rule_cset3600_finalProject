package rule_cset3600_finalproject;

import java.util.Arrays;
import java.util.Scanner;

public class Rule_cset3600_finalProject {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();    //save name
        System.out.println("Enter mailing address: ");
        String address = sc.nextLine(); //save address
        
        //create array holding all of the books
        String[] book = new String[]{"0: I will Marry When I want", "1: Chronicles from the Land of the Happiest People on Earth", "2: Weep Not, Child", "3: The Essentials of Modern Software Engineering", "4: Software Engineering at Google", "5: Fundamentals of Software Architecture"};
        double[] bookPrice = new double[]{9.82, 28.95, 15.94, 69.80, 36.49, 43.49}; //create array holding prices
        System.out.println("Select the number of the book you want: " + Arrays.toString(book));
        int bookNum = sc.nextInt(); //save book picked
        
        //create array holding all baby items
        String[] baby = new String[]{"0: Burp clothes", "1: Newborn clothes", "2: Diapers", "3: Onesies", "4: Jacket"};
        double[] babyPrice = new double[]{12.95, 1799, 13.86, 11.98, 15.24};    //create array holding prices
        System.out.println("Select the number of the baby item you want: " + Arrays.toString(baby));
        int babyNum = sc.nextInt(); //save baby item picked
        
        //create array holding kitchen items
        String[] kitchen = new String[]{"0: 11 piece pots & pans", "1: cookware set", "2: Pancake rings", "3: Bean sauce", "4: Saucepan"};
        double[] kitchenPrice = new double[]{59.95, 199, 13.92, 26.99, 14.95};  //create array holding prices
        System.out.println("Select the number of the item you want: " + Arrays.toString(kitchen));
        int kitchenNum = sc.nextInt();  //save kitchen item picked
        
        //create array holding cars
        String[] car = new String[]{"0: 2020 Toyota Land Cruiser Heritage Edition", "1: 2013 Nissan Armada Platinum", "2: 2019 Dodge Charger GT", "3: 2020 Toyota Tacoma SR5", "4: 2020 Toyota RAV4"};
        double[] carPrice = new double[]{89140, 16275, 33240, 34122, 22000};    //create array holding prices
        System.out.println("Select the number of the item you want: " + Arrays.toString(car));
        int carNum = sc.nextInt();  //save car picked
        
        //calculate the total shipping
        double shipping = (carPrice[carNum] * 0.00003) + (bookPrice[bookNum] * 0.00003) + (babyPrice[babyNum] * 0.00003) + (kitchenPrice[kitchenNum] * 0.00003);
        
        //add together prices and shipping
        double total = carPrice[carNum] + bookPrice[bookNum] + babyPrice[babyNum] + kitchenPrice[kitchenNum] + shipping;
        
        //create an array of all the things you bought
        String[] bought = new String[]{car[carNum], book[bookNum], baby[babyNum], kitchen[kitchenNum]};
        
        System.out.println("Dear " + name + ", You bought " + Arrays.toString(bought) + ". The total cost of the items is $" + total + ". The items will be shipped to " + address);
    }
}
