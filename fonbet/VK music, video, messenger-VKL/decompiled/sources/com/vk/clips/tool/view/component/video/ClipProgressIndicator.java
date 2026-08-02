package com.vk.clips.tool.view.component.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.design.R$styleable;
import xsna.e3m;
import xsna.ip10;
import xsna.kbd;
import xsna.lbd;
import xsna.m33;
import xsna.ur;
import xsna.wq;
import xsna.x9;

/* loaded from: classes17.dex */
public class ClipProgressIndicator extends View {
    public static final int B = Color.parseColor("#88000000");
    public static final int C = Color.parseColor("#ffffff");

    @NonNull
    public a A;
    public int b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final Paint f;
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

    public interface a {
        public static final ur V6 = new ur(8);
    }

    public ClipProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v = 0;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        this.x = ofInt;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0);
        this.y = ofInt2;
        this.z = true;
        this.A = a.V6;
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
        int i = this.b;
        ofInt.setIntValues(i, i + 360);
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new kbd(this, 0));
        ofInt2.setIntValues(0, 0);
        ofInt2.setDuration(300L);
        ofInt2.setInterpolator(new DecelerateInterpolator());
        ofInt2.addUpdateListener(new lbd(this, 0));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
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
            setLineWidth(obtainStyledAttributes.getDimensionPixelSize(10, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics())));
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
    public final void onDraw(@NonNull Canvas canvas) {
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
        this.A.getClass();
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
        int b = x9.b(paddingRight, paddingLeft, 2, paddingLeft);
        int b2 = x9.b(paddingBottom, paddingTop, 2, paddingTop);
        int i5 = this.g / 2;
        float f = paddingLeft;
        float f2 = paddingTop;
        float f3 = paddingRight;
        float f4 = paddingBottom;
        this.c.set(f, f2, f3, f4);
        float f5 = this.p;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i6 = this.r;
            this.d.set(paddingLeft + i5 + i6, paddingTop + i5 + i6, (paddingRight - i5) - i6, (paddingBottom - i5) - i6);
        } else {
            float f6 = measuredWidth;
            this.d.set(wq.a(f6, f5, 2.0f, f), wq.a(f6, f5, 2.0f, f2), f3 - ((f6 - f5) / 2.0f), f4 - ((f6 - f5) / 2.0f));
        }
        Drawable drawable = this.t;
        if (drawable != null) {
            float f7 = this.w;
            if (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i7 = (int) (f7 / 2.0f);
                drawable.setBounds(b - i7, b2 - i7, b + i7, b2 + i7);
            } else {
                int min = ((int) (((int) Math.min(this.d.width(), this.d.height())) * 0.66f)) / 2;
                this.t.setBounds(b - min, b2 - min, b + min, b2 + min);
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
        int min = Math.min(ip10.a(i, suggestedMinimumWidth, maximumWidth, paddingRight), ip10.a(i2, suggestedMinimumHeight, maximumHeight, paddingBottom));
        int i3 = this.s;
        if (min >= i3) {
            this.g = this.q;
        } else {
            this.g = (int) (this.q * (min / i3));
        }
        this.f.setStrokeWidth(this.g);
        setMeasuredDimension(ip10.b(i, suggestedMinimumWidth, maximumWidth, paddingRight + min), ip10.b(i2, suggestedMinimumHeight, maximumHeight, paddingBottom + min));
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

    public void setOnVisibleProgressUpdateListener(@Nullable a aVar) {
        if (aVar == null) {
            aVar = a.V6;
        }
        this.A = aVar;
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
        if (Looper.getMainLooper() == Looper.myLooper() && !valueAnimator.isRunning() && getVisibility() == 0) {
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
}
