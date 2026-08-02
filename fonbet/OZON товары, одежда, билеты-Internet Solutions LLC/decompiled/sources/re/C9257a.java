package re;

import kd.C7665d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9257a {
    @NotNull
    public static final String a(@NotNull String str) {
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(charAt));
        sb2.append((CharSequence) str, 1, str.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static final String b(@NotNull String str) {
        char charAt;
        Object obj;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || !c(0, str)) {
            return str;
        }
        if (str.length() == 1 || !c(1, str)) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
                return str;
            }
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return lowerCase + substring;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        C7665d it = new IntRange(0, str.length() - 1, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!c(((Number) obj).intValue(), str)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return d(str);
        }
        int intValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(d(substring2));
        String substring3 = str.substring(intValue);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        sb2.append(substring3);
        return sb2.toString();
    }

    private static final boolean c(int i11, String str) {
        char charAt = str.charAt(i11);
        return 'A' <= charAt && charAt < '[';
    }

    @NotNull
    public static final String d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
