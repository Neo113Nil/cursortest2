package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.l;
import androidx.constraintlayout.widget.i;

/* loaded from: classes.dex */
public class Flow extends i {

    /* renamed from: j, reason: collision with root package name */
    public g f18093j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.i, androidx.constraintlayout.widget.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f18093j = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.g.f18505T0) {
                    this.f18093j.E2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18512U0) {
                    this.f18093j.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18587e1) {
                    this.f18093j.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18595f1) {
                    this.f18093j.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18519V0) {
                    this.f18093j.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18526W0) {
                    this.f18093j.P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18533X0) {
                    this.f18093j.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18540Y0) {
                    this.f18093j.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18401E1) {
                    this.f18093j.J2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18713u1) {
                    this.f18093j.y2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18394D1) {
                    this.f18093j.I2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18667o1) {
                    this.f18093j.s2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18727w1) {
                    this.f18093j.A2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18683q1) {
                    this.f18093j.u2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18741y1) {
                    this.f18093j.C2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18699s1) {
                    this.f18093j.w2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18659n1) {
                    this.f18093j.r2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18720v1) {
                    this.f18093j.z2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18675p1) {
                    this.f18093j.t2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18734x1) {
                    this.f18093j.B2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18380B1) {
                    this.f18093j.G2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f18691r1) {
                    this.f18093j.v2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.g.f18373A1) {
                    this.f18093j.F2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.g.f18706t1) {
                    this.f18093j.x2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18387C1) {
                    this.f18093j.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f18748z1) {
                    this.f18093j.D2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f18228c = this.f18093j;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(e eVar, boolean z10) {
        this.f18093j.u1(z10);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        p(this.f18093j, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.i
    public void p(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.D1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.y1(), lVar.x1());
        }
    }

    public void setFirstHorizontalBias(float f10) {
        this.f18093j.r2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f18093j.s2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f18093j.t2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f18093j.u2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f18093j.v2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f18093j.w2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f18093j.x2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f18093j.y2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f18093j.z2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f18093j.A2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f18093j.B2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f18093j.C2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f18093j.D2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f18093j.E2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f18093j.J1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f18093j.K1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f18093j.M1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f18093j.N1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f18093j.P1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f18093j.F2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f18093j.G2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f18093j.H2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f18093j.I2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f18093j.J2(i10);
        requestLayout();
    }
}
