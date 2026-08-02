package com.vk.superapp.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.iah0;
import xsna.io6;
import xsna.krv0;
import xsna.n8g;
import xsna.rqi;
import xsna.too0;
import xsna.ue7;

/* compiled from: BlendingTabView.kt */
/* loaded from: classes6.dex */
public final class BlendingTabView extends AppCompatTextView implements too0 {
    public float b;
    public int c;
    public int d;
    public final a e;
    public boolean f;

    /* compiled from: BlendingTabView.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public boolean b;

        /* compiled from: BlendingTabView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public State(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt() != 0;
        }
    }

    public BlendingTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = krv0.m(R.attr.vk_ui_text_secondary, context);
        this.d = krv0.m(R.attr.vk_ui_text_primary, context);
        a aVar = new a();
        this.e = aVar;
        setTextColor(this.c);
        aVar.setCallback(this);
        aVar.b();
    }

    private final void setDrawablesBlendRatio(float f) {
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable instanceof ue7) {
                ue7 ue7Var = (ue7) drawable;
                ue7Var.f = f;
                ue7Var.e = n8g.d(f, ue7Var.b, ue7Var.c);
                ue7Var.onStateChange(ue7Var.getState());
                ue7Var.invalidateSelf();
            }
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c = krv0.m(R.attr.vk_ui_text_secondary, getContext());
        this.d = krv0.m(R.attr.vk_ui_text_primary, getContext());
        setTextColor(isSelected() ? this.d : this.c);
        this.e.b();
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        ValueAnimator valueAnimator;
        super.onAttachedToWindow();
        if (this.f) {
            a aVar = this.e;
            ValueAnimator valueAnimator2 = aVar.d;
            if ((valueAnimator2 != null && valueAnimator2.isStarted()) || aVar.getCallback() == null || (valueAnimator = aVar.d) == null) {
                return;
            }
            valueAnimator.start();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        a aVar = this.e;
        ValueAnimator valueAnimator = aVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        aVar.e = true;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            int left = getLeft();
            int top = getTop();
            int right = getRight();
            int bottom = getBottom();
            a aVar = this.e;
            aVar.setBounds(left, top, right, bottom);
            aVar.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setShineVisible(state.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.f;
        return state;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            if (z) {
                float f = this.b;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 1.0f) {
                    setTextColor(this.d);
                }
            }
            if (!z) {
                float f2 = this.b;
                if (f2 == 1.0f || f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    setTextColor(this.c);
                }
            }
        }
        super.setSelected(z);
    }

    public final void setShineVisible(boolean z) {
        ValueAnimator valueAnimator;
        if (z == this.f) {
            return;
        }
        this.f = z;
        a aVar = this.e;
        if (z) {
            aVar.e = false;
            ValueAnimator valueAnimator2 = aVar.d;
            if ((valueAnimator2 == null || !valueAnimator2.isStarted()) && aVar.getCallback() != null && (valueAnimator = aVar.d) != null) {
                valueAnimator.start();
            }
        } else {
            ValueAnimator valueAnimator3 = aVar.d;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            aVar.e = true;
        }
        requestLayout();
        invalidate();
    }

    public final void setTextBlendRatio(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        setTextColor(n8g.d(f, this.c, this.d));
        setDrawablesBlendRatio(f);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }

    /* compiled from: BlendingTabView.kt */
    public static final class a extends Drawable {
        public final io6 a = new io6(this, 1);
        public final Paint b;
        public final Rect c;
        public ValueAnimator d;
        public boolean e;
        public final AccelerateDecelerateInterpolator f;
        public final Path g;
        public final float h;
        public final float i;
        public float j;
        public final C1905a k;

        public a() {
            Paint b = rqi.b(1, -1);
            b.setAlpha(an10.b(178.5f));
            b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            this.b = b;
            this.c = new Rect();
            this.f = new AccelerateDecelerateInterpolator();
            this.g = new Path();
            this.h = iah0.b(17.0f);
            this.i = iah0.b(1.5384616f);
            this.k = new C1905a();
        }

        public final void a() {
            Rect rect = this.c;
            float abs = Math.abs(rect.bottom - rect.top) / this.i;
            float f = this.h;
            float f2 = abs + f;
            this.j = f2;
            float f3 = f2 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Path path = this.g;
            path.reset();
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom);
            path.lineTo(abs + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.top);
            path.lineTo(f3, rect.top);
            path.lineTo(f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom);
            path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom);
            path.close();
        }

        public final void b() {
            a();
            ValueAnimator valueAnimator = this.d;
            boolean isStarted = valueAnimator != null ? valueAnimator.isStarted() : false;
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.d;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllUpdateListeners();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(700L);
            ofFloat.addUpdateListener(this.a);
            ofFloat.setInterpolator(this.f);
            ofFloat.setStartDelay(0L);
            ofFloat.addListener(this.k);
            this.d = ofFloat;
            if (isStarted) {
                ofFloat.start();
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            ValueAnimator valueAnimator = this.d;
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            Rect rect = this.c;
            float f2 = rect.left - this.j;
            canvas.save();
            canvas.translate(((rect.right - f2) * floatValue) + f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.drawPath(this.g, this.b);
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            ValueAnimator valueAnimator;
            super.onBoundsChange(rect);
            float f = 1;
            int a = rect.bottom - iah0.a(f);
            if (a < 0) {
                a = 0;
            }
            int a2 = iah0.a(f) + rect.top;
            if (a2 > a) {
                a2 = a;
            }
            this.c.set(0, a2, rect.right, a);
            a();
            ValueAnimator valueAnimator2 = this.d;
            if ((valueAnimator2 != null && valueAnimator2.isStarted()) || getCallback() == null || (valueAnimator = this.d) == null) {
                return;
            }
            valueAnimator.start();
        }

        /* compiled from: BlendingTabView.kt */
        /* renamed from: com.vk.superapp.ui.BlendingTabView$a$a, reason: collision with other inner class name */
        public static final class C1905a implements Animator.AnimatorListener {
            public C1905a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ValueAnimator valueAnimator;
                a aVar = a.this;
                ValueAnimator valueAnimator2 = aVar.d;
                if (valueAnimator2 != null) {
                    valueAnimator2.setStartDelay(2000L);
                }
                if (aVar.e || (valueAnimator = aVar.d) == null) {
                    return;
                }
                valueAnimator.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
