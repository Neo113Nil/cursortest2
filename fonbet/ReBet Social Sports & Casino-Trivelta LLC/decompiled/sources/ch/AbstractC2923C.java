package ch;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ch.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2923C {
    public static final j a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new j(str);
    }

    public static final char b(char c10) {
        return ('A' > c10 || c10 >= '[') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 + ' ');
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char charAt = str.charAt(i10);
            if (b(charAt) != charAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int lastIndex = StringsKt.getLastIndex(str);
        if (i10 <= lastIndex) {
            while (true) {
                sb2.append(b(str.charAt(i10)));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
