package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class f extends ConstraintWidget {
    public boolean A0;
    public float v0 = -1.0f;
    public int w0 = -1;
    public int x0 = -1;
    public ConstraintAnchor y0 = this.L;
    public int z0 = 0;

    /* compiled from: Guideline.java */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.T.clear();
        this.T.add(this.y0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.y0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean G() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Y(androidx.constraintlayout.core.c cVar, boolean z) {
        if (this.W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.y0;
        cVar.getClass();
        int n = androidx.constraintlayout.core.c.n(constraintAnchor);
        if (this.z0 == 1) {
            this.b0 = n;
            this.c0 = 0;
            R(this.W.p());
            W(0);
            return;
        }
        this.b0 = 0;
        this.c0 = n;
        W(this.W.v());
        R(0);
    }

    public final void Z(int i) {
        this.y0.l(i);
        this.A0 = true;
    }

    public final void a0(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        arrayList.clear();
        if (this.z0 == 1) {
            this.y0 = this.K;
        } else {
            this.y0 = this.L;
        }
        arrayList.add(this.y0);
        ConstraintAnchor[] constraintAnchorArr = this.S;
        int length = constraintAnchorArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            constraintAnchorArr[i2] = this.y0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(androidx.constraintlayout.core.c cVar, boolean z) {
        d dVar = (d) this.W;
        if (dVar == null) {
            return;
        }
        Object n = dVar.n(ConstraintAnchor.Type.LEFT);
        Object n2 = dVar.n(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.W;
        boolean z2 = constraintWidget != null && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.z0 == 0) {
            n = dVar.n(ConstraintAnchor.Type.TOP);
            n2 = dVar.n(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.W;
            z2 = constraintWidget2 != null && constraintWidget2.V[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.A0) {
            ConstraintAnchor constraintAnchor = this.y0;
            if (constraintAnchor.c) {
                SolverVariable k = cVar.k(constraintAnchor);
                cVar.d(k, this.y0.d());
                if (this.w0 != -1) {
                    if (z2) {
                        cVar.f(cVar.k(n2), k, 0, 5);
                    }
                } else if (this.x0 != -1 && z2) {
                    SolverVariable k2 = cVar.k(n2);
                    cVar.f(k, cVar.k(n), 0, 5);
                    cVar.f(k2, k, 0, 5);
                }
                this.A0 = false;
                return;
            }
        }
        if (this.w0 != -1) {
            SolverVariable k3 = cVar.k(this.y0);
            cVar.e(k3, cVar.k(n), this.w0, 8);
            if (z2) {
                cVar.f(cVar.k(n2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.x0 != -1) {
            SolverVariable k4 = cVar.k(this.y0);
            SolverVariable k5 = cVar.k(n2);
            cVar.e(k4, k5, -this.x0, 8);
            if (z2) {
                cVar.f(k4, cVar.k(n), 0, 5);
                cVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.v0 != -1.0f) {
            SolverVariable k6 = cVar.k(this.y0);
            SolverVariable k7 = cVar.k(n2);
            float f = this.v0;
            androidx.constraintlayout.core.b l = cVar.l();
            l.d.b(k6, -1.0f);
            l.d.b(k7, f);
            cVar.c(l);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.v0 = fVar.v0;
        this.w0 = fVar.w0;
        this.x0 = fVar.x0;
        a0(fVar.z0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor n(ConstraintAnchor.Type type) {
        int i = a.a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.z0 == 1) {
                return this.y0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.z0 == 0) {
            return this.y0;
        }
        return null;
    }
}
