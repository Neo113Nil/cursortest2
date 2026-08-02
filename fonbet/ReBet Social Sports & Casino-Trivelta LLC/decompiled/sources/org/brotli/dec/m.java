package org.brotli.dec;

/* loaded from: classes5.dex */
public abstract class m {
    private static final byte[] BYTE_ZEROES = new byte[1024];
    private static final int[] INT_ZEROES = new int[1024];

    public static void a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(BYTE_ZEROES, 0, bArr, i10 + i12, min);
            i12 += min;
        }
    }

    public static void b(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(INT_ZEROES, 0, iArr, i10 + i12, min);
            i12 += min;
        }
    }
}
