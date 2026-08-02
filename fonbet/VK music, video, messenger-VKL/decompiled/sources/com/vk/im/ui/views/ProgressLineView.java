package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.vk.ui.R$styleable;
import defpackage.k0;
import xsna.an10;
import xsna.l8g;
import xsna.x9;

/* compiled from: ProgressLineView.kt */
/* loaded from: classes2.dex */
public final class ProgressLineView extends View {
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public Integer h;
    public final Paint i;
    public final RectF j;
    public final Path k;

    public ProgressLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = Long.MAX_VALUE;
        this.g = -16777216;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.FILL);
        this.i = c;
        this.j = new RectF();
        this.k = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.x, 0, 0);
        setMin(obtainStyledAttributes.getInteger(5, 0));
        setMax(obtainStyledAttributes.getInteger(4, Integer.MAX_VALUE));
        setProgress(obtainStyledAttributes.getInteger(6, 0));
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        setDividerSize(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        setColorPrimary(obtainStyledAttributes.getColor(0, -16777216));
        if (obtainStyledAttributes.hasValue(1)) {
            setColorSecondary(Integer.valueOf(obtainStyledAttributes.getColor(1, -16777216)));
        }
        obtainStyledAttributes.recycle();
    }

    public final int getColorPrimary() {
        return this.g;
    }

    public final Integer getColorSecondary() {
        return this.h;
    }

    public final int getCornerRadius() {
        return this.e;
    }

    public final int getDividerSize() {
        return this.f;
    }

    public final long getMax() {
        return this.c;
    }

    public final long getMin() {
        return this.b;
    }

    public final long getProgress() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b > this.c) {
            throw new IllegalStateException("min > max: min=" + this.b + ", max=" + this.c);
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = getPaddingRight();
        float measuredWidth2 = getMeasuredWidth() - paddingRight;
        float measuredHeight2 = getMeasuredHeight() - getPaddingBottom();
        RectF rectF = this.j;
        rectF.set(paddingLeft, paddingTop, measuredWidth2, measuredHeight2);
        long j = this.d;
        long j2 = this.b;
        Paint paint = this.i;
        if (j <= j2) {
            Integer num = this.h;
            paint.setColor(num != null ? num.intValue() : l8g.f(0.4f, this.g));
            float f = this.e;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        if (j >= this.c) {
            paint.setColor(this.g);
            float f2 = this.e;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            return;
        }
        int max = Math.max(this.e, an10.b(Math.max(0, (measuredWidth - this.f) - this.e) * ((j - j2) / ((r12 - j2) - 0))));
        int max2 = Math.max(this.e, (measuredWidth - max) - this.f);
        if (this.f + max + max2 > measuredWidth) {
            Integer num2 = this.h;
            paint.setColor(num2 != null ? num2.intValue() : l8g.f(0.4f, this.g));
            float f3 = this.e;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            return;
        }
        float f4 = measuredHeight + paddingTop;
        rectF.set(paddingLeft, paddingTop, max + paddingLeft, f4);
        Path path = this.k;
        path.reset();
        path.moveTo(rectF.left + this.e, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left + this.e, rectF.bottom);
        float f5 = rectF.left;
        path.quadTo(f5, rectF.bottom, f5, rectF.top + this.e);
        float f6 = rectF.left;
        float f7 = rectF.top;
        path.quadTo(f6, f7, this.e + f6, f7);
        path.close();
        paint.setColor(this.g);
        canvas.drawPath(path, paint);
        float f8 = rectF.right + this.f;
        rectF.set(f8, paddingTop, max2 + f8, f4);
        path.reset();
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right - this.e, rectF.top);
        float f9 = rectF.right;
        float f10 = rectF.top;
        path.quadTo(f9, f10, f9, this.e + f10);
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        path.quadTo(f11, f12, f11 - this.e, f12);
        path.lineTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        path.close();
        Integer num3 = this.h;
        paint.setColor(num3 != null ? num3.intValue() : l8g.f(0.4f, this.g));
        canvas.drawPath(path, paint);
    }

    public final void setColorPrimary(int i) {
        this.g = i;
        invalidate();
    }

    public final void setColorSecondary(Integer num) {
        this.h = num;
        invalidate();
    }

    public final void setCornerRadius(int i) {
        this.e = i;
        invalidate();
    }

    public final void setDividerSize(int i) {
        this.f = i;
        invalidate();
    }

    public final void setMax(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "max must be >= 0. Given: "));
        }
        this.c = j;
        invalidate();
    }

    public final void setMin(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "min must be >= 0. Given: "));
        }
        this.b = j;
        invalidate();
    }

    public final void setProgress(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(k0.a(j, "progress must be >= 0. Given: "));
        }
        this.d = j;
        invalidate();
    }
}
