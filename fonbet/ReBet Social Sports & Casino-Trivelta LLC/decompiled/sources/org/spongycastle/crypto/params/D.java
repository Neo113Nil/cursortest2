package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class D implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public int f62634a;
    private byte[] key;

    public D(byte[] bArr, int i10) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.key = bArr2;
        this.f62634a = i10;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public byte[] a() {
        return this.key;
    }

    public int b() {
        return this.f62634a;
    }
}
