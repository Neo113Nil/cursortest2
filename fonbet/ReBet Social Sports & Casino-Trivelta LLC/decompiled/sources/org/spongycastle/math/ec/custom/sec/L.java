package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class L extends g.b {
    public L(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        K k10 = (K) this.f62850c;
        if (k10.i()) {
            return h10.u();
        }
        K k11 = (K) this.f62849b;
        K k12 = (K) this.zs[0];
        int[] f10 = pj.g.f();
        int[] f11 = pj.g.f();
        int[] f12 = pj.g.f();
        J.j(k10.f62754x, f12);
        int[] f13 = pj.g.f();
        J.j(f12, f13);
        boolean h11 = k12.h();
        int[] iArr = k12.f62754x;
        if (!h11) {
            J.j(iArr, f11);
            iArr = f11;
        }
        J.m(k11.f62754x, iArr, f10);
        J.a(k11.f62754x, iArr, f11);
        J.e(f11, f10, f11);
        J.i(pj.g.b(f11, f11, f11), f11);
        J.e(f12, k11.f62754x, f12);
        J.i(pj.m.F(8, f12, 2, 0), f12);
        J.i(pj.m.G(8, f13, 3, 0, f10), f10);
        K k13 = new K(f13);
        J.j(f11, k13.f62754x);
        int[] iArr2 = k13.f62754x;
        J.m(iArr2, f12, iArr2);
        int[] iArr3 = k13.f62754x;
        J.m(iArr3, f12, iArr3);
        K k14 = new K(f12);
        J.m(f12, k13.f62754x, k14.f62754x);
        int[] iArr4 = k14.f62754x;
        J.e(iArr4, f11, iArr4);
        int[] iArr5 = k14.f62754x;
        J.m(iArr5, f10, iArr5);
        K k15 = new K(f11);
        J.n(k10.f62754x, k15.f62754x);
        if (!h11) {
            int[] iArr6 = k15.f62754x;
            J.e(iArr6, k12.f62754x, iArr6);
        }
        return new L(h10, k13, k14, new org.spongycastle.math.ec.e[]{k15}, this.f62851d);
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
        K k10 = (K) this.f62849b;
        K k11 = (K) this.f62850c;
        K k12 = (K) gVar.o();
        K k13 = (K) gVar.p();
        K k14 = (K) this.zs[0];
        K k15 = (K) gVar.q(0);
        int[] h11 = pj.g.h();
        int[] f10 = pj.g.f();
        int[] f11 = pj.g.f();
        int[] f12 = pj.g.f();
        boolean h12 = k14.h();
        if (h12) {
            iArr = k12.f62754x;
            iArr2 = k13.f62754x;
        } else {
            J.j(k14.f62754x, f11);
            J.e(f11, k12.f62754x, f10);
            J.e(f11, k14.f62754x, f11);
            J.e(f11, k13.f62754x, f11);
            iArr = f10;
            iArr2 = f11;
        }
        boolean h13 = k15.h();
        if (h13) {
            iArr3 = k10.f62754x;
            iArr4 = k11.f62754x;
        } else {
            J.j(k15.f62754x, f12);
            J.e(f12, k10.f62754x, h11);
            J.e(f12, k15.f62754x, f12);
            J.e(f12, k11.f62754x, f12);
            iArr3 = h11;
            iArr4 = f12;
        }
        int[] f13 = pj.g.f();
        J.m(iArr3, iArr, f13);
        J.m(iArr4, iArr2, f10);
        if (pj.g.t(f13)) {
            return pj.g.t(f10) ? D() : h10.u();
        }
        J.j(f13, f11);
        int[] f14 = pj.g.f();
        J.e(f11, f13, f14);
        J.e(f11, iArr3, f11);
        J.g(f14, f14);
        pj.g.w(iArr4, f14, h11);
        J.i(pj.g.b(f11, f11, f14), f14);
        K k16 = new K(f12);
        J.j(f10, k16.f62754x);
        int[] iArr5 = k16.f62754x;
        J.m(iArr5, f14, iArr5);
        K k17 = new K(f14);
        J.m(f11, k16.f62754x, k17.f62754x);
        J.f(k17.f62754x, f10, h11);
        J.h(h11, k17.f62754x);
        K k18 = new K(f13);
        if (!h12) {
            int[] iArr6 = k18.f62754x;
            J.e(iArr6, k14.f62754x, iArr6);
        }
        if (!h13) {
            int[] iArr7 = k18.f62754x;
            J.e(iArr7, k15.f62754x, iArr7);
        }
        return new L(h10, k16, k17, new org.spongycastle.math.ec.e[]{k18}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new L(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public L(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public L(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
