package org.spongycastle.crypto.params;

/* renamed from: org.spongycastle.crypto.params.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5974a implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public w f62646a;
    private byte[] associatedText;

    /* renamed from: b, reason: collision with root package name */
    public int f62647b;
    private byte[] nonce;

    public C5974a(w wVar, int i10, byte[] bArr) {
        this(wVar, i10, bArr, null);
    }

    public byte[] a() {
        return this.associatedText;
    }

    public w b() {
        return this.f62646a;
    }

    public int c() {
        return this.f62647b;
    }

    public byte[] d() {
        return this.nonce;
    }

    public C5974a(w wVar, int i10, byte[] bArr, byte[] bArr2) {
        this.f62646a = wVar;
        this.nonce = bArr;
        this.f62647b = i10;
        this.associatedText = bArr2;
    }
}
