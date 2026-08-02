package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class z extends StringsKt__StringNumberConversionsKt {
    public static String g(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String h(char[] cArr, int i5, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int length = cArr.length;
        cVar.getClass();
        kotlin.collections.c.a(i5, i10, length);
        return new String(cArr, i5, i10 - i5);
    }

    public static boolean i(String str, String suffix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z5 ? str.endsWith(suffix) : k(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean j(String str, String str2, boolean z5) {
        return str == null ? str2 == null : !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean k(int i5, int i10, int i11, String str, String other, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z5 ? str.regionMatches(i5, other, i10, i11) : str.regionMatches(z5, i5, other, i10, i11);
    }

    public static String l(String str, char c2, char c8, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z5) {
            String replace = str.replace(c2, c8);
            Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (a.c(charAt, c2, z5)) {
                charAt = c8;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String m(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int E = StringsKt.E(0, str, oldValue, false);
        if (E < 0) {
            return str;
        }
        int length = oldValue.length();
        int i5 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, E);
            sb2.append(newValue);
            i10 = E + length;
            if (E >= str.length()) {
                break;
            }
            E = StringsKt.E(E + i5, str, oldValue, false);
        } while (E > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static boolean n(String str, String prefix, int i5, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix, i5) : k(i5, 0, prefix.length(), str, prefix, z5);
    }

    public static boolean o(String str, String prefix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix) : k(0, 0, prefix.length(), str, prefix, z5);
    }
}
