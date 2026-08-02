package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* renamed from: org.spongycastle.math.ec.custom.sec.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6022v extends g.b {
    public C6022v(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        C6020u c6020u = (C6020u) this.f62850c;
        if (c6020u.i()) {
            return h10.u();
        }
        C6020u c6020u2 = (C6020u) this.f62849b;
        C6020u c6020u3 = (C6020u) this.zs[0];
        int[] e10 = pj.e.e();
        int[] e11 = pj.e.e();
        int[] e12 = pj.e.e();
        AbstractC6018t.j(c6020u.f62812x, e12);
        int[] e13 = pj.e.e();
        AbstractC6018t.j(e12, e13);
        boolean h11 = c6020u3.h();
        int[] iArr = c6020u3.f62812x;
        if (!h11) {
            AbstractC6018t.j(iArr, e11);
            iArr = e11;
        }
        AbstractC6018t.m(c6020u2.f62812x, iArr, e10);
        AbstractC6018t.a(c6020u2.f62812x, iArr, e11);
        AbstractC6018t.e(e11, e10, e11);
        AbstractC6018t.i(pj.e.b(e11, e11, e11), e11);
        AbstractC6018t.e(e12, c6020u2.f62812x, e12);
        AbstractC6018t.i(pj.m.F(6, e12, 2, 0), e12);
        AbstractC6018t.i(pj.m.G(6, e13, 3, 0, e10), e10);
        C6020u c6020u4 = new C6020u(e13);
        AbstractC6018t.j(e11, c6020u4.f62812x);
        int[] iArr2 = c6020u4.f62812x;
        AbstractC6018t.m(iArr2, e12, iArr2);
        int[] iArr3 = c6020u4.f62812x;
        AbstractC6018t.m(iArr3, e12, iArr3);
        C6020u c6020u5 = new C6020u(e12);
        AbstractC6018t.m(e12, c6020u4.f62812x, c6020u5.f62812x);
        int[] iArr4 = c6020u5.f62812x;
        AbstractC6018t.e(iArr4, e11, iArr4);
        int[] iArr5 = c6020u5.f62812x;
        AbstractC6018t.m(iArr5, e10, iArr5);
        C6020u c6020u6 = new C6020u(e11);
        AbstractC6018t.n(c6020u.f62812x, c6020u6.f62812x);
        if (!h11) {
            int[] iArr6 = c6020u6.f62812x;
            AbstractC6018t.e(iArr6, c6020u3.f62812x, iArr6);
        }
        return new C6022v(h10, c6020u4, c6020u5, new org.spongycastle.math.ec.e[]{c6020u6}, this.f62851d);
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
        C6020u c6020u = (C6020u) this.f62849b;
        C6020u c6020u2 = (C6020u) this.f62850c;
        C6020u c6020u3 = (C6020u) gVar.o();
        C6020u c6020u4 = (C6020u) gVar.p();
        C6020u c6020u5 = (C6020u) this.zs[0];
        C6020u c6020u6 = (C6020u) gVar.q(0);
        int[] g10 = pj.e.g();
        int[] e10 = pj.e.e();
        int[] e11 = pj.e.e();
        int[] e12 = pj.e.e();
        boolean h11 = c6020u5.h();
        if (h11) {
            iArr = c6020u3.f62812x;
            iArr2 = c6020u4.f62812x;
        } else {
            AbstractC6018t.j(c6020u5.f62812x, e11);
            AbstractC6018t.e(e11, c6020u3.f62812x, e10);
            AbstractC6018t.e(e11, c6020u5.f62812x, e11);
            AbstractC6018t.e(e11, c6020u4.f62812x, e11);
            iArr = e10;
            iArr2 = e11;
        }
        boolean h12 = c6020u6.h();
        if (h12) {
            iArr3 = c6020u.f62812x;
            iArr4 = c6020u2.f62812x;
        } else {
            AbstractC6018t.j(c6020u6.f62812x, e12);
            AbstractC6018t.e(e12, c6020u.f62812x, g10);
            AbstractC6018t.e(e12, c6020u6.f62812x, e12);
            AbstractC6018t.e(e12, c6020u2.f62812x, e12);
            iArr3 = g10;
            iArr4 = e12;
        }
        int[] e13 = pj.e.e();
        AbstractC6018t.m(iArr3, iArr, e13);
        AbstractC6018t.m(iArr4, iArr2, e10);
        if (pj.e.s(e13)) {
            return pj.e.s(e10) ? D() : h10.u();
        }
        AbstractC6018t.j(e13, e11);
        int[] e14 = pj.e.e();
        AbstractC6018t.e(e11, e13, e14);
        AbstractC6018t.e(e11, iArr3, e11);
        AbstractC6018t.g(e14, e14);
        pj.e.v(iArr4, e14, g10);
        AbstractC6018t.i(pj.e.b(e11, e11, e14), e14);
        C6020u c6020u7 = new C6020u(e12);
        AbstractC6018t.j(e10, c6020u7.f62812x);
        int[] iArr5 = c6020u7.f62812x;
        AbstractC6018t.m(iArr5, e14, iArr5);
        C6020u c6020u8 = new C6020u(e14);
        AbstractC6018t.m(e11, c6020u7.f62812x, c6020u8.f62812x);
        AbstractC6018t.f(c6020u8.f62812x, e10, g10);
        AbstractC6018t.h(g10, c6020u8.f62812x);
        C6020u c6020u9 = new C6020u(e13);
        if (!h11) {
            int[] iArr6 = c6020u9.f62812x;
            AbstractC6018t.e(iArr6, c6020u5.f62812x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c6020u9.f62812x;
            AbstractC6018t.e(iArr7, c6020u6.f62812x, iArr7);
        }
        return new C6022v(h10, c6020u7, c6020u8, new org.spongycastle.math.ec.e[]{c6020u9}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new C6022v(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public C6022v(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public C6022v(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
