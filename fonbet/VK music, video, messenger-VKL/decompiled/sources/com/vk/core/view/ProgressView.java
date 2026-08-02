package com.vk.core.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import xsna.bwt0;
import xsna.e3m;
import xsna.gp10;
import xsna.iah0;
import xsna.m33;
import xsna.wq;
import xsna.x9;

@Deprecated
/* loaded from: classes17.dex */
public class ProgressView extends View {
    public static final int B = Color.parseColor("#88000000");
    public static final int C = Color.parseColor("#ffffff");
    public static final long D = 600;
    public static final long E = 300;

    @NonNull
    public c A;
    public int b;
    public RectF c;
    public RectF d;
    public Paint e;
    public Paint f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public float p;
    public int q;
    public int r;
    public int s;
    public Drawable t;
    public boolean u;
    public int v;
    public float w;
    public final ValueAnimator x;
    public final ValueAnimator y;
    public boolean z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ProgressView progressView = ProgressView.this;
            progressView.b = intValue;
            progressView.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ProgressView progressView = ProgressView.this;
            progressView.m = intValue;
            progressView.invalidate();
        }
    }

    public ProgressView(Context context) {
        super(context);
        this.n = true;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v = 0;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = ValueAnimator.ofInt(0, 360);
        this.y = ValueAnimator.ofInt(0, 0);
        this.z = true;
        this.A = c.X6;
        b(context, null, 0, 0);
    }

    public final void a(int i, int i2, int i3) {
        this.l = i3;
        this.m = i2;
        this.b = i;
        int[] iArr = {i2, i3};
        ValueAnimator valueAnimator = this.y;
        valueAnimator.setIntValues(iArr);
        if (Looper.getMainLooper() == Looper.myLooper() && bwt0.K(this)) {
            valueAnimator.start();
        }
    }

    public final void b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = -90;
        this.c = new RectF();
        this.d = new RectF();
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.g = 0;
        int i3 = this.b;
        ValueAnimator valueAnimator = this.x;
        valueAnimator.setIntValues(i3, i3 + 360);
        valueAnimator.setDuration(2000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new a());
        ValueAnimator valueAnimator2 = this.y;
        valueAnimator2.setIntValues(0, 0);
        valueAnimator2.setDuration(300L);
        valueAnimator2.setInterpolator(new DecelerateInterpolator());
        valueAnimator2.addUpdateListener(new b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l, i, i2);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setProgressMin(obtainStyledAttributes.getInteger(13, 3));
        setProgressMax(obtainStyledAttributes.getInteger(12, 0));
        setProgressValue(obtainStyledAttributes.getInteger(16, 0));
        if (obtainStyledAttributes.hasValue(6)) {
            setLayerColor(obtainStyledAttributes.getColor(6, B));
        }
        if (obtainStyledAttributes.hasValue(7)) {
            setLineColor(obtainStyledAttributes.getColor(7, C));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setLineWidth(obtainStyledAttributes.getDimensionPixelSize(10, iah0.a(2)));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setLineDownScaleThreshold(obtainStyledAttributes.getDimensionPixelSize(8, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setCancelIconDrawable(obtainStyledAttributes.getDrawable(2));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setCancelIconTintColor(obtainStyledAttributes.getColor(4, 0));
        }
        setCancelIconVisible(obtainStyledAttributes.getBoolean(5, getCancelIcon() != null));
        if (obtainStyledAttributes.hasValue(14)) {
            setProgressMovement(obtainStyledAttributes.getBoolean(14, this.n));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setLineRounded(obtainStyledAttributes.getBoolean(9, false));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setCancelIconSize(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setProgressRadius(obtainStyledAttributes.getDimensionPixelSize(15, 0));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setProgressInverse(obtainStyledAttributes.getBoolean(11, this.o));
        }
        obtainStyledAttributes.recycle();
    }

    public Drawable getCancelIcon() {
        return this.t;
    }

    public int getLayerColor() {
        return this.e.getColor();
    }

    public int getLineColor() {
        return this.f.getColor();
    }

    public int getLineDownScaleThreshold() {
        return this.s;
    }

    public int getLinePadding() {
        return this.r;
    }

    public float getLineWidth() {
        return this.q;
    }

    public int getMaximumHeight() {
        return this.i;
    }

    public int getMaximumWidth() {
        return this.h;
    }

    public int getProgressMax() {
        return this.k;
    }

    public int getProgressMin() {
        return this.j;
    }

    public float getProgressValue() {
        return this.l;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x.cancel();
        this.y.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        canvas.drawCircle(this.c.centerX(), this.c.centerY(), Math.min(this.c.width(), this.c.height()) / 2.0f, this.e);
        float min = (Math.min(Math.max(this.m, this.j), this.k) / this.k) * 360.0f;
        if (this.o) {
            canvas2 = canvas;
            canvas2.drawArc(this.d, this.b, 360.0f - min, false, this.f);
        } else {
            canvas2 = canvas;
            canvas2.drawArc(this.d, this.b, min, false, this.f);
        }
        this.A.a(this.b, this.m);
        Drawable drawable = this.t;
        if (drawable == null || !this.u) {
            return;
        }
        int i = this.v;
        if (i != 0) {
            drawable.setTint(i);
        }
        this.t.draw(canvas2);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = measuredWidth - getPaddingRight();
        int paddingBottom = measuredHeight - getPaddingBottom();
        int b2 = x9.b(paddingRight, paddingLeft, 2, paddingLeft);
        int b3 = x9.b(paddingBottom, paddingTop, 2, paddingTop);
        int i5 = this.g / 2;
        float f = paddingLeft;
        float f2 = paddingTop;
        float f3 = paddingRight;
        float f4 = paddingBottom;
        this.c.set(f, f2, f3, f4);
        float f5 = this.p;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF = this.d;
            int i6 = this.r;
            rectF.set(paddingLeft + i5 + i6, paddingTop + i5 + i6, (paddingRight - i5) - i6, (paddingBottom - i5) - i6);
        } else {
            float f6 = measuredWidth;
            this.d.set(wq.a(f6, f5, 2.0f, f), wq.a(f6, f5, 2.0f, f2), f3 - ((f6 - f5) / 2.0f), f4 - ((f6 - f5) / 2.0f));
        }
        Drawable drawable = this.t;
        if (drawable != null) {
            float f7 = this.w;
            if (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i7 = (int) (f7 / 2.0f);
                drawable.setBounds(b2 - i7, b3 - i7, b2 + i7, b3 + i7);
            } else {
                int min = ((int) (((int) Math.min(this.d.width(), this.d.height())) * 0.66f)) / 2;
                this.t.setBounds(b2 - min, b3 - min, b2 + min, b3 + min);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth = getMaximumWidth();
        int maximumHeight = getMaximumHeight();
        int min = Math.min(gp10.a(i, suggestedMinimumWidth, maximumWidth, paddingRight), gp10.a(i2, suggestedMinimumHeight, maximumHeight, paddingBottom));
        int i3 = this.s;
        if (min >= i3) {
            this.g = this.q;
        } else {
            this.g = (int) (this.q * (min / i3));
        }
        this.f.setStrokeWidth(this.g);
        setMeasuredDimension(gp10.b(i, suggestedMinimumWidth, maximumWidth, 0, paddingRight + min), gp10.b(i2, suggestedMinimumHeight, maximumHeight, 0, paddingBottom + min));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i);
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 == null || (valueAnimator = this.y) == null) {
            return;
        }
        if (view != this || i != 0) {
            if (this.z) {
                valueAnimator2.cancel();
                valueAnimator.cancel();
                this.m = 0;
                return;
            }
            return;
        }
        if (this.n && !valueAnimator2.isRunning()) {
            valueAnimator2.start();
        }
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    public void setCancelIconDrawable(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.t = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.t = mutate;
            mutate.setCallback(this);
        }
        requestLayout();
        invalidate();
    }

    public void setCancelIconResource(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setCancelIconDrawable(m33.a(i, context));
    }

    public void setCancelIconSize(float f) {
        if (this.w != f) {
            this.w = f;
            requestLayout();
            invalidate();
        }
    }

    public void setCancelIconTintColor(int i) {
        if (this.v != i) {
            this.v = i;
            invalidate();
        }
    }

    public void setCancelIconVisible(boolean z) {
        if (this.u != z) {
            this.u = z;
            invalidate();
        }
    }

    public void setLayerColor(int i) {
        this.e.setColor(i);
        invalidate();
    }

    public void setLineColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public void setLineDownScaleThreshold(int i) {
        this.s = i;
        invalidate();
    }

    public void setLinePadding(int i) {
        this.r = i;
        invalidate();
    }

    public void setLineRounded(boolean z) {
        if (z) {
            Paint.Cap strokeCap = this.f.getStrokeCap();
            Paint.Cap cap = Paint.Cap.ROUND;
            if (strokeCap != cap) {
                this.f.setStrokeCap(cap);
                invalidate();
                return;
            }
            return;
        }
        Paint.Cap strokeCap2 = this.f.getStrokeCap();
        Paint.Cap cap2 = Paint.Cap.BUTT;
        if (strokeCap2 != cap2) {
            this.f.setStrokeCap(cap2);
            invalidate();
        }
    }

    public void setLineWidth(int i) {
        this.q = i;
        invalidate();
    }

    public void setMaximumHeight(int i) {
        this.i = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumWidth(int i) {
        this.h = i;
        requestLayout();
        invalidate();
    }

    public void setOnVisibleProgressUpdateListener(@Nullable c cVar) {
        if (cVar == null) {
            this.A = c.X6;
        } else {
            this.A = cVar;
        }
    }

    public void setProgressDuration(long j) {
        this.y.setDuration(j);
    }

    public void setProgressInverse(boolean z) {
        if (this.o != z) {
            this.o = z;
            invalidate();
        }
    }

    public void setProgressMax(int i) {
        this.k = i;
        invalidate();
    }

    public void setProgressMin(int i) {
        this.j = i;
        invalidate();
    }

    public void setProgressMovement(boolean z) {
        this.n = z;
    }

    public void setProgressRadius(float f) {
        if (this.p != f) {
            this.p = f;
            requestLayout();
            invalidate();
        }
    }

    public void setProgressValue(int i) {
        this.l = i;
        int[] iArr = {this.m, i};
        ValueAnimator valueAnimator = this.y;
        valueAnimator.setIntValues(iArr);
        if (Looper.getMainLooper() == Looper.myLooper() && !valueAnimator.isRunning() && bwt0.K(this)) {
            valueAnimator.start();
        }
    }

    public void setProgressValueWithoutAnim(int i) {
        this.m = i;
        this.l = i;
        this.y.setIntValues(i, i);
    }

    public void setResetOnChangeVisibility(boolean z) {
        this.z = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return this.t == drawable || super.verifyDrawable(drawable);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v = 0;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = ValueAnimator.ofInt(0, 360);
        this.y = ValueAnimator.ofInt(0, 0);
        this.z = true;
        this.A = c.X6;
        b(context, attributeSet, 0, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = true;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v = 0;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = ValueAnimator.ofInt(0, 360);
        this.y = ValueAnimator.ofInt(0, 0);
        this.z = true;
        this.A = c.X6;
        b(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public ProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = true;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v = 0;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = ValueAnimator.ofInt(0, 360);
        this.y = ValueAnimator.ofInt(0, 0);
        this.z = true;
        this.A = c.X6;
        b(context, attributeSet, i, i2);
    }

    public interface c {
        public static final a X6 = new a();

        void a(int i, int i2);

        public class a implements c {
            @Override // com.vk.core.view.ProgressView.c
            public final void a(int i, int i2) {
            }
        }
    }
}
