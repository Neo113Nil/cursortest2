package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.params.G;

/* loaded from: classes5.dex */
public class w implements org.spongycastle.crypto.q, Aj.d {

    /* renamed from: a, reason: collision with root package name */
    public x f62430a;

    public w(int i10, int i11) {
        this.f62430a = new x(i10, i11);
        b(null);
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        this.f62430a.a(((w) dVar).f62430a);
    }

    public void b(G g10) {
        this.f62430a.i(g10);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new w(this);
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        return this.f62430a.f(bArr, i10);
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "Skein-" + (this.f62430a.g() * 8) + "-" + (this.f62430a.h() * 8);
    }

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return this.f62430a.g();
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return this.f62430a.h();
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        this.f62430a.m();
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        this.f62430a.r(b10);
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        this.f62430a.s(bArr, i10, i11);
    }

    public w(w wVar) {
        this.f62430a = new x(wVar.f62430a);
    }
}
