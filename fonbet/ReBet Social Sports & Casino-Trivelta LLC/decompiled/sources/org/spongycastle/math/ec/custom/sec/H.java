package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class H extends g.b {
    public H(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        G g10 = (G) this.f62850c;
        if (g10.i()) {
            return h10.u();
        }
        G g11 = (G) this.f62849b;
        G g12 = (G) this.zs[0];
        int[] f10 = pj.g.f();
        F.i(g10.f62746x, f10);
        int[] f11 = pj.g.f();
        F.i(f10, f11);
        int[] f12 = pj.g.f();
        F.i(g11.f62746x, f12);
        F.h(pj.g.b(f12, f12, f12), f12);
        F.d(f10, g11.f62746x, f10);
        F.h(pj.m.F(8, f10, 2, 0), f10);
        int[] f13 = pj.g.f();
        F.h(pj.m.G(8, f11, 3, 0, f13), f13);
        G g13 = new G(f11);
        F.i(f12, g13.f62746x);
        int[] iArr = g13.f62746x;
        F.k(iArr, f10, iArr);
        int[] iArr2 = g13.f62746x;
        F.k(iArr2, f10, iArr2);
        G g14 = new G(f10);
        F.k(f10, g13.f62746x, g14.f62746x);
        int[] iArr3 = g14.f62746x;
        F.d(iArr3, f12, iArr3);
        int[] iArr4 = g14.f62746x;
        F.k(iArr4, f13, iArr4);
        G g15 = new G(f12);
        F.l(g10.f62746x, g15.f62746x);
        if (!g12.h()) {
            int[] iArr5 = g15.f62746x;
            F.d(iArr5, g12.f62746x, iArr5);
        }
        return new H(h10, g13, g14, new org.spongycastle.math.ec.e[]{g15}, this.f62851d);
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
        G g10 = (G) this.f62849b;
        G g11 = (G) this.f62850c;
        G g12 = (G) gVar.o();
        G g13 = (G) gVar.p();
        G g14 = (G) this.zs[0];
        G g15 = (G) gVar.q(0);
        int[] h11 = pj.g.h();
        int[] f10 = pj.g.f();
        int[] f11 = pj.g.f();
        int[] f12 = pj.g.f();
        boolean h12 = g14.h();
        if (h12) {
            iArr = g12.f62746x;
            iArr2 = g13.f62746x;
        } else {
            F.i(g14.f62746x, f11);
            F.d(f11, g12.f62746x, f10);
            F.d(f11, g14.f62746x, f11);
            F.d(f11, g13.f62746x, f11);
            iArr = f10;
            iArr2 = f11;
        }
        boolean h13 = g15.h();
        if (h13) {
            iArr3 = g10.f62746x;
            iArr4 = g11.f62746x;
        } else {
            F.i(g15.f62746x, f12);
            F.d(f12, g10.f62746x, h11);
            F.d(f12, g15.f62746x, f12);
            F.d(f12, g11.f62746x, f12);
            iArr3 = h11;
            iArr4 = f12;
        }
        int[] f13 = pj.g.f();
        F.k(iArr3, iArr, f13);
        F.k(iArr4, iArr2, f10);
        if (pj.g.t(f13)) {
            return pj.g.t(f10) ? D() : h10.u();
        }
        F.i(f13, f11);
        int[] f14 = pj.g.f();
        F.d(f11, f13, f14);
        F.d(f11, iArr3, f11);
        F.f(f14, f14);
        pj.g.w(iArr4, f14, h11);
        F.h(pj.g.b(f11, f11, f14), f14);
        G g16 = new G(f12);
        F.i(f10, g16.f62746x);
        int[] iArr5 = g16.f62746x;
        F.k(iArr5, f14, iArr5);
        G g17 = new G(f14);
        F.k(f11, g16.f62746x, g17.f62746x);
        F.e(g17.f62746x, f10, h11);
        F.g(h11, g17.f62746x);
        G g18 = new G(f13);
        if (!h12) {
            int[] iArr6 = g18.f62746x;
            F.d(iArr6, g14.f62746x, iArr6);
        }
        if (!h13) {
            int[] iArr7 = g18.f62746x;
            F.d(iArr7, g15.f62746x, iArr7);
        }
        return new H(h10, g16, g17, new org.spongycastle.math.ec.e[]{g18}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new H(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public H(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public H(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
