package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public int f62682a;
    protected byte[] password;
    protected byte[] salt;

    public static byte[] a(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i10 = 0; i10 != cArr.length; i10++) {
            int i11 = i10 * 2;
            char c10 = cArr[i10];
            bArr[i11] = (byte) (c10 >>> '\b');
            bArr[i11 + 1] = (byte) c10;
        }
        return bArr;
    }

    public static byte[] b(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) cArr[i10];
        }
        return bArr;
    }

    public static byte[] c(char[] cArr) {
        return cArr != null ? Aj.h.j(cArr) : new byte[0];
    }

    public abstract j d(int i10);

    public abstract j e(int i10);

    public abstract j f(int i10, int i11);

    public void g(byte[] bArr, byte[] bArr2, int i10) {
        this.password = bArr;
        this.salt = bArr2;
        this.f62682a = i10;
    }
}
