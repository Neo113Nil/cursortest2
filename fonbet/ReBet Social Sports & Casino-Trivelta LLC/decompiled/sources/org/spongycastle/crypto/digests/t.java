package org.spongycastle.crypto.digests;

/* loaded from: classes5.dex */
public class t extends g {
    public t() {
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        i((t) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new t(this);
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        j();
        Aj.f.m(this.f62329d, bArr, i10);
        Aj.f.m(this.f62330e, bArr, i10 + 8);
        Aj.f.m(this.f62331f, bArr, i10 + 16);
        Aj.f.m(this.f62332g, bArr, i10 + 24);
        Aj.f.m(this.f62333h, bArr, i10 + 32);
        Aj.f.m(this.f62334i, bArr, i10 + 40);
        Aj.f.m(this.f62335j, bArr, i10 + 48);
        Aj.f.m(this.f62336k, bArr, i10 + 56);
        reset();
        return 64;
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 64;
    }

    @Override // org.spongycastle.crypto.digests.g, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62329d = 7640891576956012808L;
        this.f62330e = -4942790177534073029L;
        this.f62331f = 4354685564936845355L;
        this.f62332g = -6534734903238641935L;
        this.f62333h = 5840696475078001361L;
        this.f62334i = -7276294671716946913L;
        this.f62335j = 2270897969802886507L;
        this.f62336k = 6620516959819538809L;
    }

    public t(t tVar) {
        super(tVar);
    }
}
