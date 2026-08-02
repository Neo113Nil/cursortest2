package org.spongycastle.math.ec.custom.djb;

import org.spongycastle.math.ec.e;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class d extends g.b {
    public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    @Override // org.spongycastle.math.ec.g
    public g B() {
        return (r() || this.f62850c.i()) ? this : H(false).a(this);
    }

    @Override // org.spongycastle.math.ec.g
    public g D() {
        if (r()) {
            return this;
        }
        return this.f62850c.i() ? h().u() : H(true);
    }

    @Override // org.spongycastle.math.ec.g
    public g E(g gVar) {
        return this == gVar ? B() : r() ? gVar : gVar.r() ? D() : this.f62850c.i() ? gVar : H(false).a(gVar);
    }

    public c F(c cVar, int[] iArr) {
        c cVar2 = (c) h().n();
        if (cVar.h()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f62734x;
            b.j(cVar.f62734x, iArr);
        }
        b.j(iArr, cVar3.f62734x);
        int[] iArr2 = cVar3.f62734x;
        b.e(iArr2, cVar2.f62734x, iArr2);
        return cVar3;
    }

    public c G() {
        e[] eVarArr = this.zs;
        c cVar = (c) eVarArr[1];
        if (cVar != null) {
            return cVar;
        }
        c F10 = F((c) eVarArr[0], null);
        eVarArr[1] = F10;
        return F10;
    }

    public d H(boolean z10) {
        c cVar;
        c cVar2 = (c) this.f62849b;
        c cVar3 = (c) this.f62850c;
        c cVar4 = (c) this.zs[0];
        c G10 = G();
        int[] f10 = pj.g.f();
        b.j(cVar2.f62734x, f10);
        b.i(pj.g.b(f10, f10, f10) + pj.g.d(G10.f62734x, f10), f10);
        int[] f11 = pj.g.f();
        b.o(cVar3.f62734x, f11);
        int[] f12 = pj.g.f();
        b.e(f11, cVar3.f62734x, f12);
        int[] f13 = pj.g.f();
        b.e(f12, cVar2.f62734x, f13);
        b.o(f13, f13);
        int[] f14 = pj.g.f();
        b.j(f12, f14);
        b.o(f14, f14);
        c cVar5 = new c(f12);
        b.j(f10, cVar5.f62734x);
        int[] iArr = cVar5.f62734x;
        b.n(iArr, f13, iArr);
        int[] iArr2 = cVar5.f62734x;
        b.n(iArr2, f13, iArr2);
        c cVar6 = new c(f13);
        b.n(f13, cVar5.f62734x, cVar6.f62734x);
        int[] iArr3 = cVar6.f62734x;
        b.e(iArr3, f10, iArr3);
        int[] iArr4 = cVar6.f62734x;
        b.n(iArr4, f14, iArr4);
        c cVar7 = new c(f11);
        if (!pj.g.r(cVar4.f62734x)) {
            int[] iArr5 = cVar7.f62734x;
            b.e(iArr5, cVar4.f62734x, iArr5);
        }
        if (z10) {
            cVar = new c(f14);
            int[] iArr6 = cVar.f62734x;
            b.e(iArr6, G10.f62734x, iArr6);
            int[] iArr7 = cVar.f62734x;
            b.o(iArr7, iArr7);
        } else {
            cVar = null;
        }
        return new d(h(), cVar5, cVar6, new e[]{cVar7, cVar}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public g a(g gVar) {
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
        c cVar = (c) this.f62849b;
        c cVar2 = (c) this.f62850c;
        c cVar3 = (c) this.zs[0];
        c cVar4 = (c) gVar.o();
        c cVar5 = (c) gVar.p();
        c cVar6 = (c) gVar.q(0);
        int[] h11 = pj.g.h();
        int[] f10 = pj.g.f();
        int[] f11 = pj.g.f();
        int[] f12 = pj.g.f();
        boolean h12 = cVar3.h();
        if (h12) {
            iArr = cVar4.f62734x;
            iArr2 = cVar5.f62734x;
        } else {
            b.j(cVar3.f62734x, f11);
            b.e(f11, cVar4.f62734x, f10);
            b.e(f11, cVar3.f62734x, f11);
            b.e(f11, cVar5.f62734x, f11);
            iArr = f10;
            iArr2 = f11;
        }
        boolean h13 = cVar6.h();
        if (h13) {
            iArr3 = cVar.f62734x;
            iArr4 = cVar2.f62734x;
        } else {
            b.j(cVar6.f62734x, f12);
            b.e(f12, cVar.f62734x, h11);
            b.e(f12, cVar6.f62734x, f12);
            b.e(f12, cVar2.f62734x, f12);
            iArr3 = h11;
            iArr4 = f12;
        }
        int[] f13 = pj.g.f();
        b.n(iArr3, iArr, f13);
        b.n(iArr4, iArr2, f10);
        if (pj.g.t(f13)) {
            return pj.g.t(f10) ? D() : h10.u();
        }
        int[] f14 = pj.g.f();
        b.j(f13, f14);
        int[] f15 = pj.g.f();
        b.e(f14, f13, f15);
        b.e(f14, iArr3, f11);
        b.g(f15, f15);
        pj.g.w(iArr4, f15, h11);
        b.i(pj.g.b(f11, f11, f15), f15);
        c cVar7 = new c(f12);
        b.j(f10, cVar7.f62734x);
        int[] iArr5 = cVar7.f62734x;
        b.n(iArr5, f15, iArr5);
        c cVar8 = new c(f15);
        b.n(f11, cVar7.f62734x, cVar8.f62734x);
        b.f(cVar8.f62734x, f10, h11);
        b.h(h11, cVar8.f62734x);
        c cVar9 = new c(f13);
        if (!h12) {
            int[] iArr6 = cVar9.f62734x;
            b.e(iArr6, cVar3.f62734x, iArr6);
        }
        if (!h13) {
            int[] iArr7 = cVar9.f62734x;
            b.e(iArr7, cVar6.f62734x, iArr7);
        }
        if (!h12 || !h13) {
            f14 = null;
        }
        return new d(h10, cVar7, cVar8, new e[]{cVar9, F(cVar9, f14)}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public e q(int i10) {
        return i10 == 1 ? G() : super.q(i10);
    }

    @Override // org.spongycastle.math.ec.g
    public g u() {
        return r() ? this : new d(h(), this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
