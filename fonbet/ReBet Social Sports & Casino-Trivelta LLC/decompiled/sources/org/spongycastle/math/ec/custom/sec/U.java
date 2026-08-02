package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class U extends g.b {
    public U(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2) {
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
        T t10 = (T) this.f62850c;
        if (t10.i()) {
            return h10.u();
        }
        T t11 = (T) this.f62849b;
        T t12 = (T) this.zs[0];
        int[] i10 = pj.m.i(17);
        int[] i11 = pj.m.i(17);
        int[] i12 = pj.m.i(17);
        S.j(t10.f62768x, i12);
        int[] i13 = pj.m.i(17);
        S.j(i12, i13);
        boolean h11 = t12.h();
        int[] iArr = t12.f62768x;
        if (!h11) {
            S.j(iArr, i11);
            iArr = i11;
        }
        S.l(t11.f62768x, iArr, i10);
        S.a(t11.f62768x, iArr, i11);
        S.f(i11, i10, i11);
        pj.m.c(17, i11, i11, i11);
        S.i(i11);
        S.f(i12, t11.f62768x, i12);
        pj.m.F(17, i12, 2, 0);
        S.i(i12);
        pj.m.G(17, i13, 3, 0, i10);
        S.i(i10);
        T t13 = new T(i13);
        S.j(i11, t13.f62768x);
        int[] iArr2 = t13.f62768x;
        S.l(iArr2, i12, iArr2);
        int[] iArr3 = t13.f62768x;
        S.l(iArr3, i12, iArr3);
        T t14 = new T(i12);
        S.l(i12, t13.f62768x, t14.f62768x);
        int[] iArr4 = t14.f62768x;
        S.f(iArr4, i11, iArr4);
        int[] iArr5 = t14.f62768x;
        S.l(iArr5, i10, iArr5);
        T t15 = new T(i11);
        S.m(t10.f62768x, t15.f62768x);
        if (!h11) {
            int[] iArr6 = t15.f62768x;
            S.f(iArr6, t12.f62768x, iArr6);
        }
        return new U(h10, t13, t14, new org.spongycastle.math.ec.e[]{t15}, this.f62851d);
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
        T t10 = (T) this.f62849b;
        T t11 = (T) this.f62850c;
        T t12 = (T) gVar.o();
        T t13 = (T) gVar.p();
        T t14 = (T) this.zs[0];
        T t15 = (T) gVar.q(0);
        int[] i10 = pj.m.i(17);
        int[] i11 = pj.m.i(17);
        int[] i12 = pj.m.i(17);
        int[] i13 = pj.m.i(17);
        boolean h11 = t14.h();
        if (h11) {
            iArr = t12.f62768x;
            iArr2 = t13.f62768x;
        } else {
            S.j(t14.f62768x, i12);
            S.f(i12, t12.f62768x, i11);
            S.f(i12, t14.f62768x, i12);
            S.f(i12, t13.f62768x, i12);
            iArr = i11;
            iArr2 = i12;
        }
        boolean h12 = t15.h();
        if (h12) {
            iArr3 = t10.f62768x;
            iArr4 = t11.f62768x;
            c10 = 0;
        } else {
            c10 = 0;
            S.j(t15.f62768x, i13);
            S.f(i13, t10.f62768x, i10);
            S.f(i13, t15.f62768x, i13);
            S.f(i13, t11.f62768x, i13);
            iArr3 = i10;
            iArr4 = i13;
        }
        int[] i14 = pj.m.i(17);
        S.l(iArr3, iArr, i14);
        S.l(iArr4, iArr2, i11);
        if (pj.m.v(17, i14)) {
            return pj.m.v(17, i11) ? D() : h10.u();
        }
        S.j(i14, i12);
        int[] i15 = pj.m.i(17);
        S.f(i12, i14, i15);
        S.f(i12, iArr3, i12);
        S.f(iArr4, i15, i10);
        T t16 = new T(i13);
        S.j(i11, t16.f62768x);
        int[] iArr5 = t16.f62768x;
        S.a(iArr5, i15, iArr5);
        int[] iArr6 = t16.f62768x;
        S.l(iArr6, i12, iArr6);
        int[] iArr7 = t16.f62768x;
        S.l(iArr7, i12, iArr7);
        T t17 = new T(i15);
        S.l(i12, t16.f62768x, t17.f62768x);
        S.f(t17.f62768x, i11, i11);
        S.l(i11, i10, t17.f62768x);
        T t18 = new T(i14);
        if (!h11) {
            int[] iArr8 = t18.f62768x;
            S.f(iArr8, t14.f62768x, iArr8);
        }
        if (!h12) {
            int[] iArr9 = t18.f62768x;
            S.f(iArr9, t15.f62768x, iArr9);
        }
        org.spongycastle.math.ec.e[] eVarArr = new org.spongycastle.math.ec.e[1];
        eVarArr[c10] = t18;
        return new U(h10, t16, t17, eVarArr, this.f62851d);
    }

    @Override // org.spongycastle.math.ec.g
    public org.spongycastle.math.ec.g u() {
        return r() ? this : new U(this.f62848a, this.f62849b, this.f62850c.m(), this.zs, this.f62851d);
    }

    public U(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
        super(dVar, eVar, eVar2);
        if ((eVar == null) != (eVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f62851d = z10;
    }

    public U(org.spongycastle.math.ec.d dVar, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f62851d = z10;
    }
}
