package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class w implements org.spongycastle.crypto.j {
    private byte[] key;

    public w(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.key;
    }

    public w(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.key = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
