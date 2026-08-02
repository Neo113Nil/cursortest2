package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes11.dex */
public class Layer extends a {
    public boolean A;
    public float j;
    public float k;
    public float l;
    public ConstraintLayout m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final boolean v;
    public View[] w;
    public float x;
    public float y;
    public boolean z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.z = true;
                } else if (index == 22) {
                    this.A = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = (ConstraintLayout) getParent();
        if (this.z || this.A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.c; i++) {
                View G4 = this.m.G4(this.b[i]);
                if (G4 != null) {
                    if (this.z) {
                        G4.setVisibility(visibility);
                    }
                    if (this.A && elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        G4.setTranslationZ(G4.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void q() {
        v();
        this.p = Float.NaN;
        this.q = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.b) getLayoutParams()).q0;
        constraintWidget.W(0);
        constraintWidget.R(0);
        u();
        layout(((int) this.t) - getPaddingLeft(), ((int) this.u) - getPaddingTop(), getPaddingRight() + ((int) this.r), getPaddingBottom() + ((int) this.s));
        w();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void r(ConstraintLayout constraintLayout) {
        this.m = constraintLayout;
        float rotation = getRotation();
        if (rotation != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.l = rotation;
        } else {
            if (Float.isNaN(this.l)) {
                return;
            }
            this.l = rotation;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.j = f;
        w();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.k = f;
        w();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.l = f;
        w();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.n = f;
        w();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.o = f;
        w();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.x = f;
        w();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.y = f;
        w();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        h();
    }

    public final void u() {
        if (this.m == null) {
            return;
        }
        if (this.v || Float.isNaN(this.p) || Float.isNaN(this.q)) {
            if (!Float.isNaN(this.j) && !Float.isNaN(this.k)) {
                this.q = this.k;
                this.p = this.j;
                return;
            }
            View[] m = m(this.m);
            int left = m[0].getLeft();
            int top = m[0].getTop();
            int right = m[0].getRight();
            int bottom = m[0].getBottom();
            for (int i = 0; i < this.c; i++) {
                View view = m[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.r = right;
            this.s = bottom;
            this.t = left;
            this.u = top;
            if (Float.isNaN(this.j)) {
                this.p = (left + right) / 2;
            } else {
                this.p = this.j;
            }
            if (Float.isNaN(this.k)) {
                this.q = (top + bottom) / 2;
            } else {
                this.q = this.k;
            }
        }
    }

    public final void v() {
        int i;
        if (this.m == null || (i = this.c) == 0) {
            return;
        }
        View[] viewArr = this.w;
        if (viewArr == null || viewArr.length != i) {
            this.w = new View[i];
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            this.w[i2] = this.m.G4(this.b[i2]);
        }
    }

    public final void w() {
        if (this.m == null) {
            return;
        }
        if (this.w == null) {
            v();
        }
        u();
        double radians = Float.isNaN(this.l) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : Math.toRadians(this.l);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.n;
        float f2 = f * cos;
        float f3 = this.o;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.c; i++) {
            View view = this.w[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.p;
            float f8 = bottom - this.q;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.x;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.y;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.o);
            view.setScaleX(this.n);
            if (!Float.isNaN(this.l)) {
                view.setRotation(this.l);
            }
        }
    }
}
