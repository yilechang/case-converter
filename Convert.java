import java.util.Scanner;
 
public class Convert {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string: ");
        str = input.nextLine();
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Lowercase: "+str.toLowerCase());
    }
 
}