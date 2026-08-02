package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* compiled from: Placeholder.java */
/* loaded from: classes11.dex */
public final class h extends i {
    @Override // androidx.constraintlayout.core.widgets.i
    public final void a0(int i, int i2, int i3, int i4) {
        int i5 = this.B0 + this.C0;
        int i6 = this.x0 + this.y0;
        if (this.w0 > 0) {
            i5 += this.v0[0].v();
            i6 += this.v0[0].p();
        }
        int max = Math.max(this.e0, i5);
        int max2 = Math.max(this.f0, i6);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        this.E0 = i2;
        this.F0 = i4;
        W(i2);
        R(i4);
        this.D0 = this.w0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(androidx.constraintlayout.core.c cVar, boolean z) {
        super.f(cVar, z);
        if (this.w0 > 0) {
            ConstraintWidget constraintWidget = this.v0[0];
            constraintWidget.I();
            constraintWidget.h0 = 0.5f;
            constraintWidget.g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.i(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.i(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.i(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.i(type4, this, type4, 0);
        }
    }
}
