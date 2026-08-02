package com.vk.feed.tool.view.newsfeed.action_button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.design.R$styleable;

/* compiled from: DonutProgressView.kt */
/* loaded from: classes18.dex */
public final class DonutProgressView extends View {
    public int b;
    public int c;
    public float d;
    public final Paint e;

    public DonutProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            try {
                this.c = obtainStyledAttributes.getColor(0, 0);
                this.b = obtainStyledAttributes.getColor(1, 0);
                paint.setStrokeWidth(obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                this.d = obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int measuredWidth = (getMeasuredWidth() - getPaddingRight()) - paddingLeft;
        float f = this.d;
        int i = this.c;
        Paint paint = this.e;
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = measuredWidth;
        float strokeWidth = f2 - paint.getStrokeWidth();
        float f3 = (f2 / 2.0f) + paddingLeft;
        float f4 = strokeWidth / 2.0f;
        canvas.drawCircle(f3, f3, f4, paint);
        paint.setColor(this.b);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float strokeWidth2 = (f * 360.0f) + (f > 0.5f ? (paint.getStrokeWidth() * (-360.0f)) / ((float) (f4 * 6.283185307179586d)) : f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : 0.0f);
        float f5 = f3 - f4;
        float f6 = f3 + f4;
        canvas.drawArc(f5, f5, f6, f6, 270.0f, strokeWidth2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : strokeWidth2, false, paint);
    }

    public final void setBgColor(int i) {
        if (this.c != i) {
            this.c = i;
            invalidate();
        }
    }

    public final void setForegroundColor(int i) {
        if (this.b != i) {
            this.b = i;
            invalidate();
        }
    }

    public final void setProgress(float f) {
        if (f == this.d) {
            return;
        }
        this.d = f;
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        Paint paint = this.e;
        if (f == paint.getStrokeWidth()) {
            return;
        }
        paint.setStrokeWidth(f);
        invalidate();
    }
}
