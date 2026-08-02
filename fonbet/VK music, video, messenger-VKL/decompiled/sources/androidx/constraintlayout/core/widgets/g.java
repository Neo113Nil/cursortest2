package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public final class g {
    public static final boolean[] a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.p = -1;
        ConstraintAnchor constraintAnchor = constraintWidget.O;
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        ConstraintAnchor constraintAnchor3 = constraintWidget.L;
        ConstraintAnchor constraintAnchor4 = constraintWidget.M;
        ConstraintAnchor constraintAnchor5 = constraintWidget.K;
        constraintWidget.q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintAnchor5.g;
            int v = dVar.v() - constraintAnchor4.g;
            constraintAnchor5.i = cVar.k(constraintAnchor5);
            constraintAnchor4.i = cVar.k(constraintAnchor4);
            cVar.d(constraintAnchor5.i, i);
            cVar.d(constraintAnchor4.i, v);
            constraintWidget.p = 2;
            constraintWidget.b0 = i;
            int i2 = v - i;
            constraintWidget.X = i2;
            int i3 = constraintWidget.e0;
            if (i2 < i3) {
                constraintWidget.X = i3;
            }
        }
        if (dVar.V[1] == dimensionBehaviour2 || constraintWidget.V[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i4 = constraintAnchor3.g;
        int p = dVar.p() - constraintAnchor2.g;
        constraintAnchor3.i = cVar.k(constraintAnchor3);
        constraintAnchor2.i = cVar.k(constraintAnchor2);
        cVar.d(constraintAnchor3.i, i4);
        cVar.d(constraintAnchor2.i, p);
        if (constraintWidget.d0 > 0 || constraintWidget.j0 == 8) {
            SolverVariable k = cVar.k(constraintAnchor);
            constraintAnchor.i = k;
            cVar.d(k, constraintWidget.d0 + i4);
        }
        constraintWidget.q = 2;
        constraintWidget.c0 = i4;
        int i5 = p - i4;
        constraintWidget.Y = i5;
        int i6 = constraintWidget.f0;
        if (i5 < i6) {
            constraintWidget.Y = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
