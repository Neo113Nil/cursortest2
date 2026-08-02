package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import xsna.e2v;

/* loaded from: classes.dex */
public class Barrier extends a {
    public int j;
    public int k;
    public androidx.constraintlayout.core.widgets.a l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.y0;
    }

    public int getMargin() {
        return this.l.z0;
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.l.y0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.l.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e = this.l;
        t();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void o(b.a aVar, e2v e2vVar, c.a aVar2, SparseArray sparseArray) {
        super.o(aVar, e2vVar, aVar2, sparseArray);
        b.C0021b c0021b = aVar.e;
        if (e2vVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar3 = (androidx.constraintlayout.core.widgets.a) e2vVar;
            u(aVar3, c0021b.g0, ((androidx.constraintlayout.core.widgets.d) e2vVar.W).A0);
            aVar3.y0 = c0021b.o0;
            aVar3.z0 = c0021b.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void p(ConstraintWidget constraintWidget, boolean z) {
        u(constraintWidget, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.y0 = z;
    }

    public void setDpMargin(int i) {
        this.l.z0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.z0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }

    public final void u(ConstraintWidget constraintWidget, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).x0 = this.k;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
