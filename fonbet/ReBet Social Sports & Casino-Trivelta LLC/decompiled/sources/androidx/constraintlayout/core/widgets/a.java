package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: C0, reason: collision with root package name */
    public int f17787C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f17788D0 = true;

    /* renamed from: E0, reason: collision with root package name */
    public int f17789E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f17790F0 = false;

    public void A1(boolean z10) {
        this.f17788D0 = z10;
    }

    public void B1(int i10) {
        this.f17787C0 = i10;
    }

    public void C1(int i10) {
        this.f17789E0 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.mListAnchors;
        dVarArr2[0] = this.f17931K;
        dVarArr2[2] = this.f17932L;
        dVarArr2[1] = this.f17933M;
        dVarArr2[3] = this.f17934N;
        int i13 = 0;
        while (true) {
            dVarArr = this.mListAnchors;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f17910i = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f17787C0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        if (!this.f17790F0) {
            u1();
        }
        if (this.f17790F0) {
            this.f17790F0 = false;
            int i15 = this.f17787C0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.f17931K.f17910i, this.f17945Y);
                dVar.f(this.f17933M.f17910i, this.f17945Y);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f17932L.f17910i, this.f17946Z);
                    dVar.f(this.f17934N.f17910i, this.f17946Z);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f18078B0; i16++) {
            e eVar = this.mWidgets[i16];
            if ((this.f17788D0 || eVar.h()) && ((((i11 = this.f17787C0) == 0 || i11 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f17931K.f17907f != null && eVar.f17933M.f17907f != null) || (((i12 = this.f17787C0) == 2 || i12 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f17932L.f17907f != null && eVar.f17934N.f17907f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f17931K.l() || this.f17933M.l();
        boolean z13 = this.f17932L.l() || this.f17934N.l();
        int i17 = !(!z11 && (((i10 = this.f17787C0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f18078B0; i18++) {
            e eVar2 = this.mWidgets[i18];
            if (this.f17788D0 || eVar2.h()) {
                androidx.constraintlayout.core.i q10 = dVar.q(eVar2.mListAnchors[this.f17787C0]);
                d[] dVarArr3 = eVar2.mListAnchors;
                int i19 = this.f17787C0;
                d dVar4 = dVarArr3[i19];
                dVar4.f17910i = q10;
                d dVar5 = dVar4.f17907f;
                int i20 = (dVar5 == null || dVar5.f17905d != this) ? 0 : dVar4.f17908g;
                if (i19 == 0 || i19 == 2) {
                    dVar.i(dVar3.f17910i, q10, this.f17789E0 - i20, z11);
                } else {
                    dVar.g(dVar3.f17910i, q10, this.f17789E0 + i20, z11);
                }
                dVar.e(dVar3.f17910i, q10, this.f17789E0 + i20, i17);
            }
        }
        int i21 = this.f17787C0;
        if (i21 == 0) {
            dVar.e(this.f17933M.f17910i, this.f17931K.f17910i, 0, 8);
            dVar.e(this.f17931K.f17910i, this.f17940T.f17933M.f17910i, 0, 4);
            dVar.e(this.f17931K.f17910i, this.f17940T.f17931K.f17910i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.f17931K.f17910i, this.f17933M.f17910i, 0, 8);
            dVar.e(this.f17931K.f17910i, this.f17940T.f17931K.f17910i, 0, 4);
            dVar.e(this.f17931K.f17910i, this.f17940T.f17933M.f17910i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.f17934N.f17910i, this.f17932L.f17910i, 0, 8);
            dVar.e(this.f17932L.f17910i, this.f17940T.f17934N.f17910i, 0, 4);
            dVar.e(this.f17932L.f17910i, this.f17940T.f17932L.f17910i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.f17932L.f17910i, this.f17934N.f17910i, 0, 8);
            dVar.e(this.f17932L.f17910i, this.f17940T.f17932L.f17910i, 0, 4);
            dVar.e(this.f17932L.f17910i, this.f17940T.f17934N.f17910i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean n0() {
        return this.f17790F0;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean o0() {
        return this.f17790F0;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.f18078B0; i10++) {
            e eVar = this.mWidgets[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f18078B0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.mWidgets[i13];
            if ((this.f17788D0 || eVar.h()) && ((((i11 = this.f17787C0) == 0 || i11 == 1) && !eVar.n0()) || (((i12 = this.f17787C0) == 2 || i12 == 3) && !eVar.o0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f18078B0; i15++) {
            e eVar2 = this.mWidgets[i15];
            if (this.f17788D0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f17787C0;
                    if (i16 == 0) {
                        i14 = eVar2.o(d.a.LEFT).e();
                    } else if (i16 == 1) {
                        i14 = eVar2.o(d.a.RIGHT).e();
                    } else if (i16 == 2) {
                        i14 = eVar2.o(d.a.TOP).e();
                    } else if (i16 == 3) {
                        i14 = eVar2.o(d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i17 = this.f17787C0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.o(d.a.LEFT).e());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.o(d.a.RIGHT).e());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.o(d.a.TOP).e());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.o(d.a.BOTTOM).e());
                }
            }
        }
        int i18 = i14 + this.f17789E0;
        int i19 = this.f17787C0;
        if (i19 == 0 || i19 == 1) {
            G0(i18, i18);
        } else {
            J0(i18, i18);
        }
        this.f17790F0 = true;
        return true;
    }

    public boolean v1() {
        return this.f17788D0;
    }

    public int w1() {
        return this.f17787C0;
    }

    public int x1() {
        return this.f17789E0;
    }

    public int y1() {
        int i10 = this.f17787C0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void z1() {
        for (int i10 = 0; i10 < this.f18078B0; i10++) {
            e eVar = this.mWidgets[i10];
            if (this.f17788D0 || eVar.h()) {
                int i11 = this.f17787C0;
                if (i11 == 0 || i11 == 1) {
                    eVar.T0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.T0(1, true);
                }
            }
        }
    }
}
