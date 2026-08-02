package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CapitalizeDecapitalizeKt {
    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || charAt >= '{') {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' > charAt || charAt >= '[') {
            return str;
        }
        return Character.toLowerCase(charAt) + str.substring(1);
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z) {
        Object obj;
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        if (!isUpperCaseCharAt(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z)) {
            if (z) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            return Character.toLowerCase(str.charAt(0)) + str.substring(1);
        }
        Iterator it = new IntRange(0, str.length() - 1, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!isUpperCaseCharAt(str, ((Number) obj).intValue(), z)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return toLowerCase(str, z);
        }
        int intValue = num.intValue() - 1;
        return toLowerCase(str.substring(0, intValue), z) + str.substring(intValue);
    }

    private static final boolean isUpperCaseCharAt(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        return z ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
