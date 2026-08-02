package org.mp4parser.tools;

/* loaded from: classes10.dex */
public final class Mp4Arrays {
    private Mp4Arrays() {
    }

    public static long[] copyOfAndAppend(long[] jArr, long... jArr2) {
        if (jArr == null) {
            jArr = new long[0];
        }
        if (jArr2 == null) {
            jArr2 = new long[0];
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static int[] copyOfAndAppend(int[] iArr, int... iArr2) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (iArr2 == null) {
            iArr2 = new int[0];
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static byte[] copyOfAndAppend(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static double[] copyOfAndAppend(double[] dArr, double... dArr2) {
        if (dArr == null) {
            dArr = new double[0];
        }
        if (dArr2 == null) {
            dArr2 = new double[0];
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }
}
