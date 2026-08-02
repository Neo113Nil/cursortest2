package org.spongycastle.crypto.digests;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class r extends g {
    public r() {
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        super.i((r) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new r(this);
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
        reset();
        return 48;
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA384;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 48;
    }

    @Override // org.spongycastle.crypto.digests.g, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62329d = -3766243637369397544L;
        this.f62330e = 7105036623409894663L;
        this.f62331f = -7973340178411365097L;
        this.f62332g = 1526699215303891257L;
        this.f62333h = 7436329637833083697L;
        this.f62334i = -8163818279084223215L;
        this.f62335j = -2662702644619276377L;
        this.f62336k = 5167115440072839076L;
    }

    public r(r rVar) {
        super(rVar);
    }
}
