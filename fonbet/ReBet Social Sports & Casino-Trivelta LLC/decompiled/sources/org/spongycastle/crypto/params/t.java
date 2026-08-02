package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public abstract class t implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public int f62677a;
    private byte[] derivation;
    private byte[] encoding;

    public t(byte[] bArr, byte[] bArr2, int i10) {
        this.derivation = bArr;
        this.encoding = bArr2;
        this.f62677a = i10;
    }

    public byte[] a() {
        return this.derivation;
    }

    public byte[] b() {
        return this.encoding;
    }

    public int c() {
        return this.f62677a;
    }
}
