package Aj;

import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public abstract class f {
    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public static void b(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = a(bArr, i10);
            i10 += 4;
        }
    }

    public static long c(byte[] bArr, int i10) {
        int a10 = a(bArr, i10);
        return (a(bArr, i10 + 4) & BodyPartID.bodyIdMax) | ((a10 & BodyPartID.bodyIdMax) << 32);
    }

    public static void d(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void e(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            d(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static byte[] f(int i10) {
        byte[] bArr = new byte[4];
        d(i10, bArr, 0);
        return bArr;
    }

    public static void g(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void h(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            g(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void j(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = i(bArr, i10);
            i10 += 4;
        }
    }

    public static int[] k(byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i(bArr, i10);
            i10 += 4;
        }
        return iArr;
    }

    public static long l(byte[] bArr, int i10) {
        return ((i(bArr, i10 + 4) & BodyPartID.bodyIdMax) << 32) | (i(bArr, i10) & BodyPartID.bodyIdMax);
    }

    public static void m(long j10, byte[] bArr, int i10) {
        d((int) (j10 >>> 32), bArr, i10);
        d((int) (j10 & BodyPartID.bodyIdMax), bArr, i10 + 4);
    }

    public static void n(long j10, byte[] bArr, int i10) {
        g((int) (BodyPartID.bodyIdMax & j10), bArr, i10);
        g((int) (j10 >>> 32), bArr, i10 + 4);
    }
}
