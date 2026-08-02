package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CharsKt extends C7750a {
    private CharsKt() {
    }

    public static int b(char c11) {
        int digit = Character.digit((int) c11, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a decimal digit");
    }

    public static boolean c(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }

    @NotNull
    public static String d(char c11) {
        String valueOf = String.valueOf(c11);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c11));
        }
        if (c11 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }

    @NotNull
    public static String e(char c11, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c11);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String valueOf2 = String.valueOf(c11);
            Intrinsics.g(valueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c11));
            }
        } else if (c11 != 329) {
            char charAt = upperCase.charAt(0);
            String substring = upperCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
        return upperCase;
    }
}
