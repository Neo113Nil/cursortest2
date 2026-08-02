package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a98;
import defpackage.vjf;
import defpackage.wm3;
import defpackage.xvk;
import defpackage.yvk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Flow extends xvk {
    public a98 j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.xvk, defpackage.ql3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.j = new a98();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vjf.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.j.W0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    a98 a98Var = this.j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    a98Var.t0 = dimensionPixelSize;
                    a98Var.u0 = dimensionPixelSize;
                    a98Var.v0 = dimensionPixelSize;
                    a98Var.w0 = dimensionPixelSize;
                } else if (index == 18) {
                    a98 a98Var2 = this.j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    a98Var2.v0 = dimensionPixelSize2;
                    a98Var2.x0 = dimensionPixelSize2;
                    a98Var2.y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.U0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.V0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.j;
        k();
    }

    @Override // defpackage.ql3
    public final void i(wm3 wm3Var, boolean z) {
        a98 a98Var = this.j;
        int i = a98Var.v0;
        if (i > 0 || a98Var.w0 > 0) {
            if (z) {
                a98Var.x0 = a98Var.w0;
                a98Var.y0 = i;
            } else {
                a98Var.x0 = i;
                a98Var.y0 = a98Var.w0;
            }
        }
    }

    @Override // defpackage.xvk
    public final void l(yvk yvkVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (yvkVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            yvkVar.Y(mode, size, mode2, size2);
            setMeasuredDimension(yvkVar.A0, yvkVar.B0);
        }
    }

    @Override // defpackage.ql3, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.j.M0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.j.G0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.j.N0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.j.H0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.j.S0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.j.K0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.j.Q0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.j.E0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.j.O0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.j.I0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.j.P0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.j.J0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.j.V0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.j.W0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        a98 a98Var = this.j;
        a98Var.t0 = i;
        a98Var.u0 = i;
        a98Var.v0 = i;
        a98Var.w0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.j.u0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.j.x0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.j.y0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.j.t0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.j.T0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.j.L0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.j.R0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.j.F0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.j.U0 = i;
        requestLayout();
    }
}
