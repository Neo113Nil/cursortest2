package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class d0 extends c0 {
    public static String w(int i5, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String substring = str.substring(i5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static Character x(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char y(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.q(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String z(int i5, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String substring = str.substring(0, i5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
