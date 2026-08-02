package fi;

/* renamed from: fi.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC4292h {
    public static /* synthetic */ String a(long j10, int i10) {
        if (j10 == 0) {
            return "0";
        }
        if (j10 > 0) {
            return Long.toString(j10, i10);
        }
        if (i10 < 2 || i10 > 36) {
            i10 = 10;
        }
        int i11 = 64;
        char[] cArr = new char[64];
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
            do {
                i11--;
                cArr[i11] = Character.forDigit(((int) j10) & i12, i10);
                j10 >>>= numberOfTrailingZeros;
            } while (j10 != 0);
        } else {
            long a10 = (i10 & 1) == 0 ? (j10 >>> 1) / (i10 >>> 1) : kotlin.d.a(j10, i10);
            long j11 = i10;
            cArr[63] = Character.forDigit((int) (j10 - (a10 * j11)), i10);
            i11 = 63;
            while (a10 > 0) {
                i11--;
                cArr[i11] = Character.forDigit((int) (a10 % j11), i10);
                a10 /= j11;
            }
        }
        return new String(cArr, i11, 64 - i11);
    }
}
