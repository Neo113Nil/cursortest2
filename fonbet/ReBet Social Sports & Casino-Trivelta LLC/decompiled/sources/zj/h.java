package zj;

import kotlin.UByte;

/* loaded from: classes5.dex */
public abstract class h {
    public static void a(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            bArr[i11 + i13] = (byte) (i10 >>> (i13 * 8));
        }
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE);
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int d(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            i12 |= (bArr[i10 + i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    public static byte[] e(int[] iArr, int i10) {
        int length = iArr.length;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 <= length - 2) {
            a(iArr[i11], bArr, i12);
            i11++;
            i12 += 4;
        }
        b(iArr[length - 1], bArr, i12, i10 - i12);
        return bArr;
    }

    public static int[] f(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i10 = 0;
        int i11 = 0;
        while (i10 <= length - 2) {
            iArr[i10] = c(bArr, i11);
            i10++;
            i11 += 4;
        }
        if (length2 != 0) {
            iArr[length - 1] = d(bArr, i11, length2);
            return iArr;
        }
        iArr[length - 1] = c(bArr, i11);
        return iArr;
    }
}
