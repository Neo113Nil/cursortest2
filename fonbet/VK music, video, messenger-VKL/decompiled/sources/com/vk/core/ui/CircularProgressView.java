package com.vk.core.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libuilight.R$styleable;
import com.vkontakte.android.R;
import xsna.sdc;
import xsna.tdc;
import xsna.u11;
import xsna.udc;
import xsna.vdc;

@Deprecated
/* loaded from: classes17.dex */
public class CircularProgressView extends View {
    public Paint b;
    public Paint c;
    public int d;
    public RectF e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public ValueAnimator u;
    public ValueAnimator v;
    public AnimatorSet w;
    public float x;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressView circularProgressView = CircularProgressView.this;
            circularProgressView.t = floatValue;
            circularProgressView.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressView circularProgressView = CircularProgressView.this;
            circularProgressView.s = floatValue;
            circularProgressView.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressView circularProgressView = CircularProgressView.this;
            circularProgressView.t = floatValue;
            circularProgressView.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public boolean b = false;

        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            CircularProgressView circularProgressView = CircularProgressView.this;
            if (circularProgressView.getVisibility() != 8) {
                circularProgressView.b();
            }
        }
    }

    public CircularProgressView(Context context) {
        super(context);
        this.d = 0;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        Resources resources = getResources();
        this.h = obtainStyledAttributes.getFloat(9, resources.getInteger(R.integer.cpv_default_progress));
        this.i = obtainStyledAttributes.getFloat(8, resources.getInteger(R.integer.cpv_default_max_progress));
        this.l = obtainStyledAttributes.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.cpv_default_thickness));
        this.f = obtainStyledAttributes.getBoolean(7, resources.getBoolean(R.bool.cpv_default_is_indeterminate));
        this.g = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.cpv_default_anim_autostart));
        float f = obtainStyledAttributes.getFloat(10, resources.getInteger(R.integer.cpv_default_start_angle));
        this.x = f;
        this.s = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(6)) {
            this.m = obtainStyledAttributes.getColor(6, resources.getColor(R.color.vk_azure_300));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.m = typedValue.data;
        } else {
            this.m = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent}).getColor(0, resources.getColor(R.color.vk_azure_300));
        }
        this.n = obtainStyledAttributes.getColor(5, 0);
        this.o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.cpv_default_anim_duration));
        this.p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.cpv_default_anim_swoop_duration));
        this.q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.cpv_default_anim_sync_duration));
        this.r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.cpv_default_anim_steps));
        obtainStyledAttributes.recycle();
        this.b = new Paint(1);
        this.c = new Paint(1);
        e();
        this.e = new RectF();
    }

    public final void b() {
        if (getVisibility() != 0) {
            return;
        }
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u.cancel();
        }
        ValueAnimator valueAnimator2 = this.v;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.v.cancel();
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.w.cancel();
        }
        char c2 = 0;
        char c3 = 1;
        float f = 360.0f;
        if (this.f) {
            float f2 = 15.0f;
            this.j = 15.0f;
            this.w = new AnimatorSet();
            AnimatorSet animatorSet2 = null;
            int i = 0;
            while (true) {
                int i2 = this.r;
                if (i >= i2) {
                    break;
                }
                float f3 = i;
                float f4 = (((i2 - 1) * f) / i2) + f2;
                float b2 = u11.b(f4, f2, f3, -90.0f);
                float[] fArr = new float[2];
                fArr[c2] = f2;
                fArr[c3] = f4;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration((this.o / this.r) / 2);
                ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat.addUpdateListener(new sdc(this));
                float f5 = this.r;
                float f6 = (f3 + 0.5f) * 720.0f;
                float f7 = f2;
                float[] fArr2 = new float[2];
                fArr2[c2] = (f3 * 720.0f) / f5;
                fArr2[c3] = f6 / f5;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                ofFloat2.setDuration((this.o / this.r) / 2);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.addUpdateListener(new tdc(this));
                float[] fArr3 = new float[2];
                fArr3[c2] = b2;
                fArr3[c3] = (b2 + f4) - f7;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr3);
                char c4 = c2;
                char c5 = c3;
                ofFloat3.setDuration((this.o / this.r) / 2);
                ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat3.addUpdateListener(new udc(this, f4, b2));
                float f8 = this.r;
                float f9 = f6 / f8;
                float f10 = ((f3 + 1.0f) * 720.0f) / f8;
                float[] fArr4 = new float[2];
                fArr4[c4] = f9;
                fArr4[c5] = f10;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr4);
                ofFloat4.setDuration((this.o / this.r) / 2);
                ofFloat4.setInterpolator(new LinearInterpolator());
                ofFloat4.addUpdateListener(new vdc(this));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(ofFloat).with(ofFloat2);
                animatorSet3.play(ofFloat3).with(ofFloat4).after(ofFloat2);
                AnimatorSet.Builder play = this.w.play(animatorSet3);
                if (animatorSet2 != null) {
                    play.after(animatorSet2);
                }
                i++;
                animatorSet2 = animatorSet3;
                f2 = f7;
                c2 = c4;
                c3 = c5;
                f = 360.0f;
            }
            this.w.addListener(new d());
            this.w.start();
        } else {
            float f11 = this.x;
            this.s = f11;
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 360.0f + f11);
            this.u = ofFloat5;
            int i3 = this.p;
            if (i3 > 0) {
                ofFloat5.setDuration(i3);
                this.u.setInterpolator(new DecelerateInterpolator(2.0f));
            } else {
                ofFloat5.setDuration(2500L);
                this.u.setRepeatCount(-1);
                this.u.setInterpolator(new LinearInterpolator());
            }
            this.u.addUpdateListener(new b());
            this.u.start();
            this.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.h);
            this.v = ofFloat6;
            ofFloat6.setDuration(this.q);
            this.v.setInterpolator(new LinearInterpolator());
            this.v.addUpdateListener(new c());
            this.v.start();
        }
        ValueAnimator valueAnimator3 = this.u;
        if (valueAnimator3 != null) {
            valueAnimator3.resume();
        }
        ValueAnimator valueAnimator4 = this.v;
        if (valueAnimator4 != null) {
            valueAnimator4.resume();
        }
        AnimatorSet animatorSet4 = this.w;
        if (animatorSet4 != null) {
            animatorSet4.resume();
        }
    }

    public final void c() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.u = null;
        }
        ValueAnimator valueAnimator2 = this.v;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.v = null;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
    }

    public final void d() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.e;
        int i = this.l;
        int i2 = this.d;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    public final void e() {
        this.b.setColor(this.m);
        Paint paint = this.b;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.b.setStrokeWidth(this.l);
        this.b.setStrokeCap(Paint.Cap.ROUND);
        this.c.setColor(this.n);
        this.c.setStyle(style);
        this.c.setStrokeWidth(this.l);
    }

    public int getColor() {
        return this.m;
    }

    public float getMaxProgress() {
        return this.i;
    }

    public float getProgress() {
        return this.h;
    }

    public int getProgressBackgroundColor() {
        return this.n;
    }

    public int getThickness() {
        return this.l;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g) {
            b();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, this.c);
        float f = ((isInEditMode() ? this.h : this.t) / this.i) * 360.0f;
        if (this.f) {
            canvas.drawArc(this.e, this.s + this.k, this.j, false, this.b);
        } else {
            canvas.drawArc(this.e, this.s, f, false, this.b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int measuredWidth = getMeasuredWidth() - paddingRight;
        int measuredHeight = getMeasuredHeight() - paddingBottom;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.d = measuredWidth;
        setMeasuredDimension(paddingRight + measuredWidth, measuredWidth + paddingBottom);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.d = i;
        d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            b();
        } else if (i == 8 || i == 4) {
            c();
        }
    }

    public void setColor(int i) {
        this.m = i;
        e();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = this.f != z;
        this.f = z;
        if (z2) {
            b();
        }
    }

    public void setMaxProgress(float f) {
        this.i = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.h = f;
        if (!this.f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.v.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t, f);
            this.v = ofFloat;
            ofFloat.setDuration(this.q);
            this.v.setInterpolator(new LinearInterpolator());
            this.v.addUpdateListener(new a());
            this.v.start();
        }
        invalidate();
    }

    public void setProgressBackgroundColor(int i) {
        this.n = i;
        e();
        invalidate();
    }

    public void setProgressNoAnim(float f) {
        this.t = f;
        this.h = f;
        invalidate();
    }

    public void setThickness(int i) {
        this.l = i;
        e();
        d();
        invalidate();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        a(attributeSet);
    }
}
