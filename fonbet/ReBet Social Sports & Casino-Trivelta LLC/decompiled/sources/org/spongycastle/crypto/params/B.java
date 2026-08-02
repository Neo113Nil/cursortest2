package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class B implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.j f62632a;
    private byte[] sBox;

    public B(org.spongycastle.crypto.j jVar, byte[] bArr) {
        this.f62632a = jVar;
        this.sBox = bArr;
    }

    public org.spongycastle.crypto.j a() {
        return this.f62632a;
    }

    public byte[] b() {
        return this.sBox;
    }
}
