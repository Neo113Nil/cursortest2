package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class D extends g.b {
    public D(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        C c10 = (C) this.f62850c;
        if (c10.i()) {
            return h10.u();
        }
        C c11 = (C) this.f62849b;
        C c12 = (C) this.zs[0];
        int[] d10 = pj.f.d();
        int[] d11 = pj.f.d();
        int[] d12 = pj.f.d();
        B.j(c10.f62739x, d12);
        int[] d13 = pj.f.d();
        B.j(d12, d13);
        boolean h11 = c12.h();
        int[] iArr = c12.f62739x;
        if (!h11) {
            B.j(iArr, d11);
            iArr = d11;
        }
        B.m(c11.f62739x, iArr, d10);
        B.a(c11.f62739x, iArr, d11);
        B.e(d11, d10, d11);
        B.i(pj.f.b(d11, d11, d11), d11);
        B.e(d12, c11.f62739x, d12);
        B.i(pj.m.F(7, d12, 2, 0), d12);
        B.i(pj.m.G(7, d13, 3, 0, d10), d10);
        C c13 = new C(d13);
        B.j(d11, c13.f62739x);
        int[] iArr2 = c13.f62739x;
        B.m(iArr2, d12, iArr2);
        int[] iArr3 = c13.f62739x;
        B.m(iArr3, d12, iArr3);
        C c14 = new C(d12);
        B.m(d12, c13.f62739x, c14.f62739x);
        int[] iArr4 = c14.f62739x;
        B.e(iArr4, d11, iArr4);
        int[] iArr5 = c14.f62739x;
        B.m(iArr5, d10, iArr5);
        C c15 = new C(d11);
        B.n(c10.f62739x, c15.f62739x);
        if (!h11) {
            int[] iArr6 = c15.f62739x;
            B.e(iArr6, c12.f62739x, iArr6);
        }
        return new D(h10, c13, c14, new org.spongycastle.math.ec.e[]{c15}, this.f62851d);
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
        C c10 = (C) this.f62849b;
        C c11 = (C) this.f62850c;
        C c12 = (C) gVar.o();
        C c13 = (C) gVar.p();
        C c14 = (C) this.zs[0];
        C c15 = (C) gVar.q(0);
        int[] e10 = pj.f.e();
        int[] d10 = pj.f.d();
        int[] d11 = pj.f.d();
        int[] d12 = pj.f.d();
        boolean h11 = c14.h();
        if (h11) {
            iArr = c12.f62739x;
            iArr2 = c13.f62739x;
        } else {
            B.j(c14.f62739x, d11);
            B.e(d11, c12.f62739x, d10);
            B.e(d11, c14.f62739x, d11);
            B.e(d11, c13.f62739x, d11);
            iArr = d10;
            iArr2 = d11;
        }
        boolean h12 = c15.h();
        if (h12) {
            iArr3 = c10.f62739x;
            iArr4 = c11.f62739x;
        } else {
            B.j(c15.f62739x, d12);
            B.e(d12, c10.f62739x, e10);
            B.e(d12, c15.f62739x, d12);
            B.e(d12, c11.f62739x, d12);
            iArr3 = e10;
            iArr4 = d12;
        }
        int[] d13 = pj.f.d();
        B.m(iArr3, iArr, d13);
        B.m(iArr4, iArr2, d10);
        if (pj.f.k(d13)) {
            return pj.f.k(d10) ? D() : h10.u();
        }
        B.j(d13, d11);
        int[] d14 = pj.f.d();
        B.e(d11, d13, d14);
        B.e(d11, iArr3, d11);
        B.g(d14, d14);
        pj.f.l(iArr4, d14, e10);
        B.i(pj.f.b(d11, d11, d14), d14);
        C c16 = new C(d12);
        B.j(d10, c16.f62739x);
        int[] iArr5 = c16.f62739x;
        B.m(iArr5, d14, iArr5);
        C c17 = new C(d14);
        B.m(d11, c16.f62739x, c17.f62739x);
        B.f(c17.f62739x, d10, e10);
        B.h(e10, c17.f62739x);
        C c18 = new C(d13);
        if (!h11) {
            int[] iArr6 = c18.f62739x;
            B.e(iArr6, c14.f62739x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c18.f62739x;
            B.e(iArr7, c15.f62739x, iArr7);
        }
        return new D(h10, c16, c17, new org.spongycastle.math.ec.e[]{c18}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new D(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public D(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public D(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
