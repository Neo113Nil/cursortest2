package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6028z extends g.b {
    public C6028z(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g B() {
        return (r() || this.f62850c.i()) ? this : D().a(this);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g D() {
        if (r()) {
            return this;
        }
        org.spongycastle.math.ec.d h10 = h();
        C6027y c6027y = (C6027y) this.f62850c;
        if (c6027y.i()) {
            return h10.u();
        }
        C6027y c6027y2 = (C6027y) this.f62849b;
        C6027y c6027y3 = (C6027y) this.zs[0];
        int[] d10 = pj.f.d();
        AbstractC6026x.i(c6027y.f62819x, d10);
        int[] d11 = pj.f.d();
        AbstractC6026x.i(d10, d11);
        int[] d12 = pj.f.d();
        AbstractC6026x.i(c6027y2.f62819x, d12);
        AbstractC6026x.h(pj.f.b(d12, d12, d12), d12);
        AbstractC6026x.d(d10, c6027y2.f62819x, d10);
        AbstractC6026x.h(pj.m.F(7, d10, 2, 0), d10);
        int[] d13 = pj.f.d();
        AbstractC6026x.h(pj.m.G(7, d11, 3, 0, d13), d13);
        C6027y c6027y4 = new C6027y(d11);
        AbstractC6026x.i(d12, c6027y4.f62819x);
        int[] iArr = c6027y4.f62819x;
        AbstractC6026x.k(iArr, d10, iArr);
        int[] iArr2 = c6027y4.f62819x;
        AbstractC6026x.k(iArr2, d10, iArr2);
        C6027y c6027y5 = new C6027y(d10);
        AbstractC6026x.k(d10, c6027y4.f62819x, c6027y5.f62819x);
        int[] iArr3 = c6027y5.f62819x;
        AbstractC6026x.d(iArr3, d12, iArr3);
        int[] iArr4 = c6027y5.f62819x;
        AbstractC6026x.k(iArr4, d13, iArr4);
        C6027y c6027y6 = new C6027y(d12);
        AbstractC6026x.l(c6027y.f62819x, c6027y6.f62819x);
        if (!c6027y3.h()) {
            int[] iArr5 = c6027y6.f62819x;
            AbstractC6026x.d(iArr5, c6027y3.f62819x, iArr5);
        }
        return new C6028z(h10, c6027y4, c6027y5, new org.spongycastle.math.ec.e[]{c6027y6}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g E(org.spongycastle.math.ec.g gVar) {
        return this == gVar ? B() : r() ? gVar : gVar.r() ? D() : this.f62850c.i() ? gVar : D().a(gVar);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g a(org.spongycastle.math.ec.g gVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (r()) {
            return gVar;
        }
        if (gVar.r()) {
            return this;
        }
        if (this == gVar) {
            return D();
        }
        org.spongycastle.math.ec.d h10 = h();
        C6027y c6027y = (C6027y) this.f62849b;
        C6027y c6027y2 = (C6027y) this.f62850c;
        C6027y c6027y3 = (C6027y) gVar.o();
        C6027y c6027y4 = (C6027y) gVar.p();
        C6027y c6027y5 = (C6027y) this.zs[0];
        C6027y c6027y6 = (C6027y) gVar.q(0);
        int[] e10 = pj.f.e();
        int[] d10 = pj.f.d();
        int[] d11 = pj.f.d();
        int[] d12 = pj.f.d();
        boolean h11 = c6027y5.h();
        if (h11) {
            iArr = c6027y3.f62819x;
            iArr2 = c6027y4.f62819x;
        } else {
            AbstractC6026x.i(c6027y5.f62819x, d11);
            AbstractC6026x.d(d11, c6027y3.f62819x, d10);
            AbstractC6026x.d(d11, c6027y5.f62819x, d11);
            AbstractC6026x.d(d11, c6027y4.f62819x, d11);
            iArr = d10;
            iArr2 = d11;
        }
        boolean h12 = c6027y6.h();
        if (h12) {
            iArr3 = c6027y.f62819x;
            iArr4 = c6027y2.f62819x;
        } else {
            AbstractC6026x.i(c6027y6.f62819x, d12);
            AbstractC6026x.d(d12, c6027y.f62819x, e10);
            AbstractC6026x.d(d12, c6027y6.f62819x, d12);
            AbstractC6026x.d(d12, c6027y2.f62819x, d12);
            iArr3 = e10;
            iArr4 = d12;
        }
        int[] d13 = pj.f.d();
        AbstractC6026x.k(iArr3, iArr, d13);
        AbstractC6026x.k(iArr4, iArr2, d10);
        if (pj.f.k(d13)) {
            return pj.f.k(d10) ? D() : h10.u();
        }
        AbstractC6026x.i(d13, d11);
        int[] d14 = pj.f.d();
        AbstractC6026x.d(d11, d13, d14);
        AbstractC6026x.d(d11, iArr3, d11);
        AbstractC6026x.f(d14, d14);
        pj.f.l(iArr4, d14, e10);
        AbstractC6026x.h(pj.f.b(d11, d11, d14), d14);
        C6027y c6027y7 = new C6027y(d12);
        AbstractC6026x.i(d10, c6027y7.f62819x);
        int[] iArr5 = c6027y7.f62819x;
        AbstractC6026x.k(iArr5, d14, iArr5);
        C6027y c6027y8 = new C6027y(d14);
        AbstractC6026x.k(d11, c6027y7.f62819x, c6027y8.f62819x);
        AbstractC6026x.e(c6027y8.f62819x, d10, e10);
        AbstractC6026x.g(e10, c6027y8.f62819x);
        C6027y c6027y9 = new C6027y(d13);
        if (!h11) {
            int[] iArr6 = c6027y9.f62819x;
            AbstractC6026x.d(iArr6, c6027y5.f62819x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c6027y9.f62819x;
            AbstractC6026x.d(iArr7, c6027y6.f62819x, iArr7);
        }
        return new C6028z(h10, c6027y7, c6027y8, new org.spongycastle.math.ec.e[]{c6027y9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new C6028z(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public C6028z(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C6028z(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
