package com.facebook.hermes.intl;

/* loaded from: classes2.dex */
public class IntlTextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static boolean isASCIIDigit(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean isASCIILetter(char c10) {
        if (c10 < 'a' || c10 > 'z') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean isASCIILetterOrDigit(char c10) {
        return isASCIILetter(c10) || isASCIIDigit(c10);
    }

    public static boolean isAlpha(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 >= charSequence.length() || (i14 = (i11 - i10) + 1) < i12 || i14 > i13) {
            return false;
        }
        while (i10 <= i11) {
            if (!isASCIILetter(charSequence.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isAlphaNum(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 >= charSequence.length() || (i14 = (i11 - i10) + 1) < i12 || i14 > i13) {
            return false;
        }
        while (i10 <= i11) {
            if (!isASCIILetterOrDigit(charSequence.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isDigit(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 >= charSequence.length() || (i14 = (i11 - i10) + 1) < i12 || i14 > i13) {
            return false;
        }
        while (i10 <= i11) {
            if (!isASCIIDigit(charSequence.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isDigitAlphanum3(CharSequence charSequence, int i10, int i11) {
        return (i11 - i10) + 1 == 4 && isASCIILetter(charSequence.charAt(i10)) && isAlphaNum(charSequence, i10 + 1, i11, 3, 3);
    }

    public static boolean isExtensionSingleton(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 1, 1);
    }

    public static boolean isOtherExtension(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 2, 8);
    }

    public static boolean isPrivateUseExtension(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 1, 8);
    }

    public static boolean isTranformedExtensionTKey(CharSequence charSequence, int i10, int i11) {
        return i11 == i10 + 1 && isASCIILetter(charSequence.charAt(i10)) && isASCIIDigit(charSequence.charAt(i11));
    }

    public static boolean isTranformedExtensionTValueItem(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 3, 8);
    }

    public static boolean isUnicodeExtensionAttribute(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 3, 8);
    }

    public static boolean isUnicodeExtensionKey(CharSequence charSequence, int i10, int i11) {
        return i11 == i10 + 1 && isASCIILetterOrDigit(charSequence.charAt(i10)) && isASCIILetter(charSequence.charAt(i11));
    }

    public static boolean isUnicodeExtensionKeyTypeItem(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 3, 8);
    }

    public static boolean isUnicodeLanguageSubtag(CharSequence charSequence, int i10, int i11) {
        return isAlpha(charSequence, i10, i11, 2, 3) || isAlpha(charSequence, i10, i11, 5, 8) || ((i11 - i10) + 1 == 4 && charSequence.charAt(i10) == 'r' && charSequence.charAt(i10 + 1) == 'o' && charSequence.charAt(i10 + 2) == 'o' && charSequence.charAt(i10 + 3) == 't');
    }

    public static boolean isUnicodeRegionSubtag(CharSequence charSequence, int i10, int i11) {
        return isAlpha(charSequence, i10, i11, 2, 2) || isDigit(charSequence, i10, i11, 3, 3);
    }

    public static boolean isUnicodeScriptSubtag(CharSequence charSequence, int i10, int i11) {
        return isAlpha(charSequence, i10, i11, 4, 4);
    }

    public static boolean isUnicodeVariantSubtag(CharSequence charSequence, int i10, int i11) {
        return isAlphaNum(charSequence, i10, i11, 5, 8) || isDigitAlphanum3(charSequence, i10, i11);
    }
}
