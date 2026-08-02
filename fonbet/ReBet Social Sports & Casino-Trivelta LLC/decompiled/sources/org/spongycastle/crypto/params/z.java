package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class z implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.j f62679a;
    private byte[] iv;

    public z(org.spongycastle.crypto.j jVar, byte[] bArr) {
        this(jVar, bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.iv;
    }

    public org.spongycastle.crypto.j b() {
        return this.f62679a;
    }

    public z(org.spongycastle.crypto.j jVar, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.iv = bArr2;
        this.f62679a = jVar;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
