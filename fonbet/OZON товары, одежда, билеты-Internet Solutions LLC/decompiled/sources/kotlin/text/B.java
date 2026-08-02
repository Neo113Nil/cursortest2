package kotlin.text;

import Sc.A;
import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B {
    @NotNull
    public static final String a(byte b11) {
        String num = Integer.toString(b11 & 255, CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    public static final C b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.i(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long j11 = 10;
        C.Companion companion = C.INSTANCE;
        long j12 = 0;
        long j13 = 512409557603043100L;
        while (i11 < length) {
            int digit = Character.digit((int) str.charAt(i11), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j12, j13) > 0) {
                if (j13 != 512409557603043100L) {
                    return null;
                }
                j13 = Long.divideUnsigned(-1L, j11);
                if (Long.compareUnsigned(j12, j13) > 0) {
                    return null;
                }
            }
            long j14 = j12 * j11;
            A.Companion companion2 = Sc.A.INSTANCE;
            long j15 = (digit & 4294967295L) + j14;
            if (Long.compareUnsigned(j15, j14) < 0) {
                return null;
            }
            i11++;
            j12 = j15;
        }
        return C.a(j12);
    }
}
