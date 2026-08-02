package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class r extends g.b {
    public r(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        C6013q c6013q = (C6013q) this.f62850c;
        if (c6013q.i()) {
            return h10.u();
        }
        C6013q c6013q2 = (C6013q) this.f62849b;
        C6013q c6013q3 = (C6013q) this.zs[0];
        int[] e10 = pj.e.e();
        AbstractC6011p.i(c6013q.f62804x, e10);
        int[] e11 = pj.e.e();
        AbstractC6011p.i(e10, e11);
        int[] e12 = pj.e.e();
        AbstractC6011p.i(c6013q2.f62804x, e12);
        AbstractC6011p.h(pj.e.b(e12, e12, e12), e12);
        AbstractC6011p.d(e10, c6013q2.f62804x, e10);
        AbstractC6011p.h(pj.m.F(6, e10, 2, 0), e10);
        int[] e13 = pj.e.e();
        AbstractC6011p.h(pj.m.G(6, e11, 3, 0, e13), e13);
        C6013q c6013q4 = new C6013q(e11);
        AbstractC6011p.i(e12, c6013q4.f62804x);
        int[] iArr = c6013q4.f62804x;
        AbstractC6011p.k(iArr, e10, iArr);
        int[] iArr2 = c6013q4.f62804x;
        AbstractC6011p.k(iArr2, e10, iArr2);
        C6013q c6013q5 = new C6013q(e10);
        AbstractC6011p.k(e10, c6013q4.f62804x, c6013q5.f62804x);
        int[] iArr3 = c6013q5.f62804x;
        AbstractC6011p.d(iArr3, e12, iArr3);
        int[] iArr4 = c6013q5.f62804x;
        AbstractC6011p.k(iArr4, e13, iArr4);
        C6013q c6013q6 = new C6013q(e12);
        AbstractC6011p.l(c6013q.f62804x, c6013q6.f62804x);
        if (!c6013q3.h()) {
            int[] iArr5 = c6013q6.f62804x;
            AbstractC6011p.d(iArr5, c6013q3.f62804x, iArr5);
        }
        return new r(h10, c6013q4, c6013q5, new org.spongycastle.math.ec.e[]{c6013q6}, this.f62851d);
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
        C6013q c6013q = (C6013q) this.f62849b;
        C6013q c6013q2 = (C6013q) this.f62850c;
        C6013q c6013q3 = (C6013q) gVar.o();
        C6013q c6013q4 = (C6013q) gVar.p();
        C6013q c6013q5 = (C6013q) this.zs[0];
        C6013q c6013q6 = (C6013q) gVar.q(0);
        int[] g10 = pj.e.g();
        int[] e10 = pj.e.e();
        int[] e11 = pj.e.e();
        int[] e12 = pj.e.e();
        boolean h11 = c6013q5.h();
        if (h11) {
            iArr = c6013q3.f62804x;
            iArr2 = c6013q4.f62804x;
        } else {
            AbstractC6011p.i(c6013q5.f62804x, e11);
            AbstractC6011p.d(e11, c6013q3.f62804x, e10);
            AbstractC6011p.d(e11, c6013q5.f62804x, e11);
            AbstractC6011p.d(e11, c6013q4.f62804x, e11);
            iArr = e10;
            iArr2 = e11;
        }
        boolean h12 = c6013q6.h();
        if (h12) {
            iArr3 = c6013q.f62804x;
            iArr4 = c6013q2.f62804x;
        } else {
            AbstractC6011p.i(c6013q6.f62804x, e12);
            AbstractC6011p.d(e12, c6013q.f62804x, g10);
            AbstractC6011p.d(e12, c6013q6.f62804x, e12);
            AbstractC6011p.d(e12, c6013q2.f62804x, e12);
            iArr3 = g10;
            iArr4 = e12;
        }
        int[] e13 = pj.e.e();
        AbstractC6011p.k(iArr3, iArr, e13);
        AbstractC6011p.k(iArr4, iArr2, e10);
        if (pj.e.s(e13)) {
            return pj.e.s(e10) ? D() : h10.u();
        }
        AbstractC6011p.i(e13, e11);
        int[] e14 = pj.e.e();
        AbstractC6011p.d(e11, e13, e14);
        AbstractC6011p.d(e11, iArr3, e11);
        AbstractC6011p.f(e14, e14);
        pj.e.v(iArr4, e14, g10);
        AbstractC6011p.h(pj.e.b(e11, e11, e14), e14);
        C6013q c6013q7 = new C6013q(e12);
        AbstractC6011p.i(e10, c6013q7.f62804x);
        int[] iArr5 = c6013q7.f62804x;
        AbstractC6011p.k(iArr5, e14, iArr5);
        C6013q c6013q8 = new C6013q(e14);
        AbstractC6011p.k(e11, c6013q7.f62804x, c6013q8.f62804x);
        AbstractC6011p.e(c6013q8.f62804x, e10, g10);
        AbstractC6011p.g(g10, c6013q8.f62804x);
        C6013q c6013q9 = new C6013q(e13);
        if (!h11) {
            int[] iArr6 = c6013q9.f62804x;
            AbstractC6011p.d(iArr6, c6013q5.f62804x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c6013q9.f62804x;
            AbstractC6011p.d(iArr7, c6013q6.f62804x, iArr7);
        }
        return new r(h10, c6013q7, c6013q8, new org.spongycastle.math.ec.e[]{c6013q9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new r(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public r(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public r(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
