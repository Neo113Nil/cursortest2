package zj;

/* loaded from: classes5.dex */
public abstract class b {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z10 &= bArr[length] == bArr2[length];
        }
        return z10;
    }

    public static byte[][] c(byte[] bArr, int i10) {
        if (i10 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] bArr2 = {new byte[i10], new byte[bArr.length - i10]};
        System.arraycopy(bArr, 0, bArr2[0], 0, i10);
        System.arraycopy(bArr, i10, bArr2[1], 0, bArr.length - i10);
        return bArr2;
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        return bArr2;
    }
}
