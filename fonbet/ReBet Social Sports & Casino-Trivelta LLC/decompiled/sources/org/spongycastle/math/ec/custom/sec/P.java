package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class P extends g.b {
    public P(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        O o10 = (O) this.f62850c;
        if (o10.i()) {
            return h10.u();
        }
        O o11 = (O) this.f62849b;
        O o12 = (O) this.zs[0];
        int[] i10 = pj.m.i(12);
        int[] i11 = pj.m.i(12);
        int[] i12 = pj.m.i(12);
        N.j(o10.f62761x, i12);
        int[] i13 = pj.m.i(12);
        N.j(i12, i13);
        boolean h11 = o12.h();
        int[] iArr = o12.f62761x;
        if (!h11) {
            N.j(iArr, i11);
            iArr = i11;
        }
        N.m(o11.f62761x, iArr, i10);
        N.a(o11.f62761x, iArr, i11);
        N.f(i11, i10, i11);
        N.i(pj.m.c(12, i11, i11, i11), i11);
        N.f(i12, o11.f62761x, i12);
        N.i(pj.m.F(12, i12, 2, 0), i12);
        N.i(pj.m.G(12, i13, 3, 0, i10), i10);
        O o13 = new O(i13);
        N.j(i11, o13.f62761x);
        int[] iArr2 = o13.f62761x;
        N.m(iArr2, i12, iArr2);
        int[] iArr3 = o13.f62761x;
        N.m(iArr3, i12, iArr3);
        O o14 = new O(i12);
        N.m(i12, o13.f62761x, o14.f62761x);
        int[] iArr4 = o14.f62761x;
        N.f(iArr4, i11, iArr4);
        int[] iArr5 = o14.f62761x;
        N.m(iArr5, i10, iArr5);
        O o15 = new O(i11);
        N.n(o10.f62761x, o15.f62761x);
        if (!h11) {
            int[] iArr6 = o15.f62761x;
            N.f(iArr6, o12.f62761x, iArr6);
        }
        return new P(h10, o13, o14, new org.spongycastle.math.ec.e[]{o15}, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g E(org.spongycastle.math.ec.g gVar) {
        return this == gVar ? B() : r() ? gVar : gVar.r() ? D() : this.f62850c.i() ? gVar : D().a(gVar);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g a(org.spongycastle.math.ec.g gVar) {
        int[] iArr;
        int[] iArr2;
        char c10;
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
        O o10 = (O) this.f62849b;
        O o11 = (O) this.f62850c;
        O o12 = (O) gVar.o();
        O o13 = (O) gVar.p();
        O o14 = (O) this.zs[0];
        O o15 = (O) gVar.q(0);
        int[] i10 = pj.m.i(24);
        int[] i11 = pj.m.i(24);
        int[] i12 = pj.m.i(12);
        int[] i13 = pj.m.i(12);
        boolean h11 = o14.h();
        if (h11) {
            iArr = o12.f62761x;
            iArr2 = o13.f62761x;
        } else {
            N.j(o14.f62761x, i12);
            N.f(i12, o12.f62761x, i11);
            N.f(i12, o14.f62761x, i12);
            N.f(i12, o13.f62761x, i12);
            iArr = i11;
            iArr2 = i12;
        }
        boolean h12 = o15.h();
        if (h12) {
            iArr3 = o10.f62761x;
            iArr4 = o11.f62761x;
            c10 = 0;
        } else {
            c10 = 0;
            N.j(o15.f62761x, i13);
            N.f(i13, o10.f62761x, i10);
            N.f(i13, o15.f62761x, i13);
            N.f(i13, o11.f62761x, i13);
            iArr3 = i10;
            iArr4 = i13;
        }
        int[] i14 = pj.m.i(12);
        N.m(iArr3, iArr, i14);
        int[] i15 = pj.m.i(12);
        N.m(iArr4, iArr2, i15);
        if (pj.m.v(12, i14)) {
            return pj.m.v(12, i15) ? D() : h10.u();
        }
        N.j(i14, i12);
        int[] i16 = pj.m.i(12);
        N.f(i12, i14, i16);
        N.f(i12, iArr3, i12);
        N.g(i16, i16);
        pj.i.a(iArr4, i16, i10);
        N.i(pj.m.c(12, i12, i12, i16), i16);
        O o16 = new O(i13);
        N.j(i15, o16.f62761x);
        int[] iArr5 = o16.f62761x;
        N.m(iArr5, i16, iArr5);
        O o17 = new O(i16);
        N.m(i12, o16.f62761x, o17.f62761x);
        pj.i.a(o17.f62761x, i15, i11);
        N.b(i10, i11, i10);
        N.h(i10, o17.f62761x);
        O o18 = new O(i14);
        if (!h11) {
            int[] iArr6 = o18.f62761x;
            N.f(iArr6, o14.f62761x, iArr6);
        }
        if (!h12) {
            int[] iArr7 = o18.f62761x;
            N.f(iArr7, o15.f62761x, iArr7);
        }
        org.spongycastle.math.ec.e[] eVarArr = new org.spongycastle.math.ec.e[1];
        eVarArr[c10] = o18;
        return new P(h10, o16, o17, eVarArr, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new P(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public P(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public P(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
