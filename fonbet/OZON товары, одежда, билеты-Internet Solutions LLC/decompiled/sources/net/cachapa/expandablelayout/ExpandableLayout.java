package net.cachapa.expandablelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public class ExpandableLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f77086a;

    /* renamed from: b, reason: collision with root package name */
    private float f77087b;

    /* renamed from: c, reason: collision with root package name */
    private float f77088c;

    /* renamed from: d, reason: collision with root package name */
    private int f77089d;

    /* renamed from: e, reason: collision with root package name */
    private int f77090e;

    /* renamed from: f, reason: collision with root package name */
    private Te.a f77091f;

    /* renamed from: g, reason: collision with root package name */
    private ValueAnimator f77092g;

    private class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        private int f77093a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f77094b;

        public a(int i11) {
            this.f77093a = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f77094b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f77094b) {
                return;
            }
            int i11 = this.f77093a;
            int i12 = i11 == 0 ? 0 : 3;
            ExpandableLayout expandableLayout = ExpandableLayout.this;
            expandableLayout.f77090e = i12;
            expandableLayout.d(i11);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ExpandableLayout.this.f77090e = this.f77093a == 0 ? 1 : 2;
        }
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77086a = 300;
        this.f77091f = new Te.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Se.a.f26181a);
            this.f77086a = obtainStyledAttributes.getInt(1, 300);
            this.f77088c = obtainStyledAttributes.getBoolean(2, false) ? 1.0f : 0.0f;
            this.f77089d = obtainStyledAttributes.getInt(0, 1);
            this.f77087b = obtainStyledAttributes.getFloat(3, 1.0f);
            obtainStyledAttributes.recycle();
            this.f77090e = this.f77088c != 0.0f ? 3 : 0;
            e(this.f77087b);
        }
    }

    public final boolean b() {
        int i11 = this.f77090e;
        return i11 == 2 || i11 == 3;
    }

    public final void c(boolean z11, boolean z12) {
        if (z11 == b()) {
            return;
        }
        if (!z12) {
            d(z11 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimator = this.f77092g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f77092g = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f77088c, z11 ? 1.0f : 0.0f);
        this.f77092g = ofFloat;
        ofFloat.setInterpolator(this.f77091f);
        this.f77092g.setDuration(this.f77086a);
        this.f77092g.addUpdateListener(new net.cachapa.expandablelayout.a(this));
        this.f77092g.addListener(new a(z11 ? 1 : 0));
        this.f77092g.start();
    }

    public final void d(float f7) {
        float f11 = this.f77088c;
        if (f11 == f7) {
            return;
        }
        float f12 = f7 - f11;
        if (f7 == 0.0f) {
            this.f77090e = 0;
        } else if (f7 == 1.0f) {
            this.f77090e = 3;
        } else if (f12 < 0.0f) {
            this.f77090e = 1;
        } else if (f12 > 0.0f) {
            this.f77090e = 2;
        }
        setVisibility(this.f77090e == 0 ? 8 : 0);
        this.f77088c = f7;
        requestLayout();
    }

    public final void e(float f7) {
        this.f77087b = Math.min(1.0f, Math.max(0.0f, f7));
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f77092g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i13 = this.f77089d;
        int i14 = i13 == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.f77088c == 0.0f && i14 == 0) ? 8 : 0);
        int round = i14 - Math.round(i14 * this.f77088c);
        float f7 = this.f77087b;
        if (f7 > 0.0f) {
            float f11 = round * f7;
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (i13 == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f11);
                } else {
                    childAt.setTranslationY(-f11);
                }
            }
        }
        if (i13 == 0) {
            setMeasuredDimension(measuredWidth - round, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - round);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f7 = bundle.getFloat("expansion");
        this.f77088c = f7;
        this.f77090e = f7 == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f7 = b() ? 1.0f : 0.0f;
        this.f77088c = f7;
        bundle.putFloat("expansion", f7);
        bundle.putParcelable("super_state", onSaveInstanceState);
        return bundle;
    }
}
