package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import xsna.e2v;
import xsna.fo8;
import xsna.fw3;
import xsna.i5s;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends e2v {
    public int x0 = 0;
    public boolean y0 = true;
    public int z0 = 0;
    public boolean A0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean G() {
        return this.A0;
    }

    public final boolean a0() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.w0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.v0[i4];
            if ((this.y0 || constraintWidget.g()) && ((((i2 = this.x0) == 0 || i2 == 1) && !constraintWidget.F()) || (((i3 = this.x0) == 2 || i3 == 3) && !constraintWidget.G()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.w0; i6++) {
            ConstraintWidget constraintWidget2 = this.v0[i6];
            if (this.y0 || constraintWidget2.g()) {
                if (!z2) {
                    int i7 = this.x0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.TOP).d();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.x0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.n(ConstraintAnchor.Type.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.n(ConstraintAnchor.Type.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.n(ConstraintAnchor.Type.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.n(ConstraintAnchor.Type.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.z0;
        int i10 = this.x0;
        if (i10 == 0 || i10 == 1) {
            P(i9, i9);
        } else {
            Q(i9, i9);
        }
        this.A0 = true;
        return true;
    }

    public final int b0() {
        int i = this.x0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(androidx.constraintlayout.core.c cVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor = this.K;
        constraintAnchorArr[0] = constraintAnchor;
        int i3 = 2;
        ConstraintAnchor constraintAnchor2 = this.L;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.M;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.N;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.i = cVar.k(constraintAnchor5);
        }
        int i4 = this.x0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i4];
        if (!this.A0) {
            a0();
        }
        if (this.A0) {
            this.A0 = false;
            int i5 = this.x0;
            if (i5 == 0 || i5 == 1) {
                cVar.d(constraintAnchor.i, this.b0);
                cVar.d(constraintAnchor3.i, this.b0);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    cVar.d(constraintAnchor2.i, this.c0);
                    cVar.d(constraintAnchor4.i, this.c0);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.w0; i6++) {
            ConstraintWidget constraintWidget = this.v0[i6];
            if ((this.y0 || constraintWidget.g()) && ((((i2 = this.x0) == 0 || i2 == 1) && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.K.f != null && constraintWidget.M.f != null) || ((i2 == 2 || i2 == 3) && constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.L.f != null && constraintWidget.N.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z4 = constraintAnchor2.g() || constraintAnchor4.g();
        int i7 = !(!z2 && (((i = this.x0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.w0) {
            ConstraintWidget constraintWidget2 = this.v0[i8];
            if (this.y0 || constraintWidget2.g()) {
                SolverVariable k = cVar.k(constraintWidget2.S[this.x0]);
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.S;
                int i9 = this.x0;
                ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[i9];
                constraintAnchor7.i = k;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.d != this) ? 0 : constraintAnchor7.g;
                if (i9 == 0 || i9 == i3) {
                    SolverVariable solverVariable = constraintAnchor6.i;
                    int i11 = this.z0 - i10;
                    androidx.constraintlayout.core.b l = cVar.l();
                    SolverVariable m = cVar.m();
                    m.e = 0;
                    l.d(solverVariable, k, m, i11);
                    cVar.c(l);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.i;
                    int i12 = this.z0 + i10;
                    androidx.constraintlayout.core.b l2 = cVar.l();
                    SolverVariable m2 = cVar.m();
                    m2.e = 0;
                    l2.c(solverVariable2, k, m2, i12);
                    cVar.c(l2);
                }
                cVar.e(constraintAnchor6.i, k, this.z0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.x0;
        if (i13 == 0) {
            cVar.e(constraintAnchor3.i, constraintAnchor.i, 0, 8);
            cVar.e(constraintAnchor.i, this.W.M.i, 0, 4);
            cVar.e(constraintAnchor.i, this.W.K.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            cVar.e(constraintAnchor.i, constraintAnchor3.i, 0, 8);
            cVar.e(constraintAnchor.i, this.W.K.i, 0, 4);
            cVar.e(constraintAnchor.i, this.W.M.i, 0, 0);
        } else if (i13 == 2) {
            cVar.e(constraintAnchor4.i, constraintAnchor2.i, 0, 8);
            cVar.e(constraintAnchor2.i, this.W.N.i, 0, 4);
            cVar.e(constraintAnchor2.i, this.W.L.i, 0, 0);
        } else if (i13 == 3) {
            cVar.e(constraintAnchor2.i, constraintAnchor4.i, 0, 8);
            cVar.e(constraintAnchor2.i, this.W.L.i, 0, 4);
            cVar.e(constraintAnchor2.i, this.W.N.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean g() {
        return true;
    }

    @Override // xsna.e2v, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.x0 = aVar.x0;
        this.y0 = aVar.y0;
        this.z0 = aVar.z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String a = i5s.a(new StringBuilder("[Barrier] "), this.l0, " {");
        for (int i = 0; i < this.w0; i++) {
            ConstraintWidget constraintWidget = this.v0[i];
            if (i > 0) {
                a = fo8.a(a, ", ");
            }
            StringBuilder e = fw3.e(a);
            e.append(constraintWidget.l0);
            a = e.toString();
        }
        return fo8.a(a, "}");
    }
}
