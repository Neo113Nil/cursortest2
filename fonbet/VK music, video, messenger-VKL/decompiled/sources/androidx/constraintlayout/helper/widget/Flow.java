package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import xsna.e2v;
import xsna.o4u0;

/* loaded from: classes.dex */
public class Flow extends o4u0 {
    public e l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // xsna.o4u0, androidx.constraintlayout.widget.a
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.l = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.l.a1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar = this.l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.x0 = dimensionPixelSize;
                    eVar.y0 = dimensionPixelSize;
                    eVar.z0 = dimensionPixelSize;
                    eVar.A0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar2 = this.l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.z0 = dimensionPixelSize2;
                    eVar2.B0 = dimensionPixelSize2;
                    eVar2.C0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.l.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.l.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.l.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.l.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.l.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.l.Y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.l.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.l.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.l.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.l.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.l.N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.l.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.l.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.l.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.l.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.l.T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.l.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.l.W0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.l.X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.l.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.l.V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.l.Z0 = obtainStyledAttributes.getInt(index, -1);
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
        if (e2vVar instanceof e) {
            e eVar = (e) e2vVar;
            int i = aVar2.V;
            if (i != -1) {
                eVar.a1 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        u(this.l, i, i2);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void p(ConstraintWidget constraintWidget, boolean z) {
        e eVar = this.l;
        int i = eVar.z0;
        if (i > 0 || eVar.A0 > 0) {
            if (z) {
                eVar.B0 = eVar.A0;
                eVar.C0 = i;
            } else {
                eVar.B0 = i;
                eVar.C0 = eVar.A0;
            }
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.l.Q0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.K0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.R0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.L0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.W0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.O0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.U0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.I0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.S0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.M0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.T0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.N0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.Z0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.a1 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        e eVar = this.l;
        eVar.x0 = i;
        eVar.y0 = i;
        eVar.z0 = i;
        eVar.A0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.y0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.B0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.C0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.x0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.X0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.P0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.V0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.J0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.Y0 = i;
        requestLayout();
    }

    @Override // xsna.o4u0
    public final void u(i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.a0(mode, size, mode2, size2);
            setMeasuredDimension(iVar.E0, iVar.F0);
        }
    }
}
