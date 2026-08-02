package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import xsna.e2v;
import xsna.kt6;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class i extends e2v {
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final kt6.a G0 = new kt6.a();
    public kt6.b H0 = null;

    @Override // xsna.e2v, xsna.a2v
    public final void b() {
        for (int i = 0; i < this.w0; i++) {
            ConstraintWidget constraintWidget = this.v0[i];
            if (constraintWidget != null) {
                constraintWidget.H = true;
            }
        }
    }

    public final void b0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        kt6.b bVar;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.H0;
            if (bVar != null || (constraintWidget2 = this.W) == null) {
                break;
            } else {
                this.H0 = ((d) constraintWidget2).z0;
            }
        }
        kt6.a aVar = this.G0;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        bVar.a(constraintWidget, aVar);
        constraintWidget.W(aVar.e);
        constraintWidget.R(aVar.f);
        constraintWidget.F = aVar.h;
        constraintWidget.N(aVar.g);
    }

    public void a0(int i, int i2, int i3, int i4) {
    }
}
