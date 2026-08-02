package vi;

/* loaded from: classes5.dex */
public abstract class b {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLowerCase(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isUpperCase(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        if (c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
