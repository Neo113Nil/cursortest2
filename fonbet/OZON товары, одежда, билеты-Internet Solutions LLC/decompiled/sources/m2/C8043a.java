package m2;

import Ij.C3261b;
import f2.C6402b;
import f2.C6404d;
import java.util.HashMap;
import m2.d;
import m2.e;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8043a extends j {

    /* renamed from: x0, reason: collision with root package name */
    private int f74065x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f74066y0 = true;

    /* renamed from: z0, reason: collision with root package name */
    private int f74067z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    boolean f74064A0 = false;

    public final boolean a1() {
        int i11;
        int i12;
        int i13;
        boolean z11 = true;
        int i14 = 0;
        while (true) {
            i11 = this.f74240w0;
            if (i14 >= i11) {
                break;
            }
            e eVar = this.f74239v0[i14];
            if ((this.f74066y0 || eVar.g()) && ((((i12 = this.f74065x0) == 0 || i12 == 1) && !eVar.d0()) || (((i13 = this.f74065x0) == 2 || i13 == 3) && !eVar.e0()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int i15 = 0;
        boolean z12 = false;
        for (int i16 = 0; i16 < this.f74240w0; i16++) {
            e eVar2 = this.f74239v0[i16];
            if (this.f74066y0 || eVar2.g()) {
                if (!z12) {
                    int i17 = this.f74065x0;
                    if (i17 == 0) {
                        i15 = eVar2.n(d.a.LEFT).e();
                    } else if (i17 == 1) {
                        i15 = eVar2.n(d.a.RIGHT).e();
                    } else if (i17 == 2) {
                        i15 = eVar2.n(d.a.TOP).e();
                    } else if (i17 == 3) {
                        i15 = eVar2.n(d.a.BOTTOM).e();
                    }
                    z12 = true;
                }
                int i18 = this.f74065x0;
                if (i18 == 0) {
                    i15 = Math.min(i15, eVar2.n(d.a.LEFT).e());
                } else if (i18 == 1) {
                    i15 = Math.max(i15, eVar2.n(d.a.RIGHT).e());
                } else if (i18 == 2) {
                    i15 = Math.min(i15, eVar2.n(d.a.TOP).e());
                } else if (i18 == 3) {
                    i15 = Math.max(i15, eVar2.n(d.a.BOTTOM).e());
                }
            }
        }
        int i19 = i15 + this.f74067z0;
        int i21 = this.f74065x0;
        if (i21 == 0 || i21 == 1) {
            u0(i19, i19);
        } else {
            x0(i19, i19);
        }
        this.f74064A0 = true;
        return true;
    }

    public final boolean b1() {
        return this.f74066y0;
    }

    public final int c1() {
        return this.f74065x0;
    }

    @Override // m2.e
    public final boolean d0() {
        return this.f74064A0;
    }

    public final int d1() {
        return this.f74067z0;
    }

    @Override // m2.e
    public final boolean e0() {
        return this.f74064A0;
    }

    public final int e1() {
        int i11 = this.f74065x0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    @Override // m2.e
    public final void f(C6404d c6404d, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        d[] dVarArr = this.f74112S;
        d dVar = this.f74104K;
        dVarArr[0] = dVar;
        d dVar2 = this.f74105L;
        int i13 = 2;
        dVarArr[2] = dVar2;
        d dVar3 = this.f74106M;
        dVarArr[1] = dVar3;
        d dVar4 = this.f74107N;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f74093i = c6404d.k(dVar5);
        }
        int i14 = this.f74065x0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i14];
        if (!this.f74064A0) {
            a1();
        }
        if (this.f74064A0) {
            this.f74064A0 = false;
            int i15 = this.f74065x0;
            if (i15 == 0 || i15 == 1) {
                c6404d.d(dVar.f74093i, this.f74123b0);
                c6404d.d(dVar3.f74093i, this.f74123b0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c6404d.d(dVar2.f74093i, this.f74125c0);
                    c6404d.d(dVar4.f74093i, this.f74125c0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f74240w0; i16++) {
            e eVar = this.f74239v0[i16];
            if ((this.f74066y0 || eVar.g()) && ((((i12 = this.f74065x0) == 0 || i12 == 1) && eVar.f74115V[0] == e.b.MATCH_CONSTRAINT && eVar.f74104K.f74090f != null && eVar.f74106M.f74090f != null) || ((i12 == 2 || i12 == 3) && eVar.f74115V[1] == e.b.MATCH_CONSTRAINT && eVar.f74105L.f74090f != null && eVar.f74107N.f74090f != null))) {
                z12 = true;
                break;
            }
        }
        z12 = false;
        boolean z13 = dVar.i() || dVar3.i();
        boolean z14 = dVar2.i() || dVar4.i();
        int i17 = (z12 || !(((i11 = this.f74065x0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))))) ? 4 : 5;
        int i18 = 0;
        while (i18 < this.f74240w0) {
            e eVar2 = this.f74239v0[i18];
            if (this.f74066y0 || eVar2.g()) {
                f2.h k11 = c6404d.k(eVar2.f74112S[this.f74065x0]);
                int i19 = this.f74065x0;
                d dVar7 = eVar2.f74112S[i19];
                dVar7.f74093i = k11;
                d dVar8 = dVar7.f74090f;
                int i21 = (dVar8 == null || dVar8.f74088d != this) ? 0 : dVar7.f74091g;
                if (i19 == 0 || i19 == i13) {
                    f2.h hVar = dVar6.f74093i;
                    int i22 = this.f74067z0 - i21;
                    C6402b l11 = c6404d.l();
                    f2.h m11 = c6404d.m();
                    m11.f62481d = 0;
                    l11.e(hVar, k11, m11, i22);
                    c6404d.c(l11);
                } else {
                    f2.h hVar2 = dVar6.f74093i;
                    int i23 = this.f74067z0 + i21;
                    C6402b l12 = c6404d.l();
                    f2.h m12 = c6404d.m();
                    m12.f62481d = 0;
                    l12.d(hVar2, k11, m12, i23);
                    c6404d.c(l12);
                }
                c6404d.e(dVar6.f74093i, k11, this.f74067z0 + i21, i17);
            }
            i18++;
            i13 = 2;
        }
        int i24 = this.f74065x0;
        if (i24 == 0) {
            c6404d.e(dVar3.f74093i, dVar.f74093i, 0, 8);
            c6404d.e(dVar.f74093i, this.f74116W.f74106M.f74093i, 0, 4);
            c6404d.e(dVar.f74093i, this.f74116W.f74104K.f74093i, 0, 0);
            return;
        }
        if (i24 == 1) {
            c6404d.e(dVar.f74093i, dVar3.f74093i, 0, 8);
            c6404d.e(dVar.f74093i, this.f74116W.f74104K.f74093i, 0, 4);
            c6404d.e(dVar.f74093i, this.f74116W.f74106M.f74093i, 0, 0);
        } else if (i24 == 2) {
            c6404d.e(dVar4.f74093i, dVar2.f74093i, 0, 8);
            c6404d.e(dVar2.f74093i, this.f74116W.f74107N.f74093i, 0, 4);
            c6404d.e(dVar2.f74093i, this.f74116W.f74105L.f74093i, 0, 0);
        } else if (i24 == 3) {
            c6404d.e(dVar2.f74093i, dVar4.f74093i, 0, 8);
            c6404d.e(dVar2.f74093i, this.f74116W.f74105L.f74093i, 0, 4);
            c6404d.e(dVar2.f74093i, this.f74116W.f74107N.f74093i, 0, 0);
        }
    }

    protected final void f1() {
        for (int i11 = 0; i11 < this.f74240w0; i11++) {
            e eVar = this.f74239v0[i11];
            if (this.f74066y0 || eVar.g()) {
                int i12 = this.f74065x0;
                if (i12 == 0 || i12 == 1) {
                    eVar.E0(0, true);
                } else if (i12 == 2 || i12 == 3) {
                    eVar.E0(1, true);
                }
            }
        }
    }

    @Override // m2.e
    public final boolean g() {
        return true;
    }

    public final void g1(boolean z11) {
        this.f74066y0 = z11;
    }

    public final void h1(int i11) {
        this.f74065x0 = i11;
    }

    public final void i1(int i11) {
        this.f74067z0 = i11;
    }

    @Override // m2.j, m2.e
    public final void k(e eVar, HashMap<e, e> hashMap) {
        super.k(eVar, hashMap);
        C8043a c8043a = (C8043a) eVar;
        this.f74065x0 = c8043a.f74065x0;
        this.f74066y0 = c8043a.f74066y0;
        this.f74067z0 = c8043a.f74067z0;
    }

    @Override // m2.e
    public final String toString() {
        String str = "[Barrier] " + s() + " {";
        for (int i11 = 0; i11 < this.f74240w0; i11++) {
            e eVar = this.f74239v0[i11];
            if (i11 > 0) {
                str = U7.d.e(str, ", ");
            }
            StringBuilder e11 = C3261b.e(str);
            e11.append(eVar.s());
            str = e11.toString();
        }
        return U7.d.e(str, "}");
    }
}
