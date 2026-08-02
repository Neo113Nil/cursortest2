package com.vk.stories.design.view.poll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.poll.R$styleable;
import xsna.cn70;
import xsna.x9;

/* compiled from: RoundedCornersView.kt */
/* loaded from: classes6.dex */
public final class RoundedCornersView extends View {
    public float b;
    public final Paint c;
    public Paint d;

    public RoundedCornersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = cn70.a() * 2.0f;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.FILL);
        this.c = c;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            setCornerRadius(obtainStyledAttributes.getDimension(3, cn70.a() * 1.5f));
            setBackgroundColor(obtainStyledAttributes.getColor(0, -1));
            float dimension = obtainStyledAttributes.getDimension(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int color = obtainStyledAttributes.getColor(1, 0);
            if (dimension > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(color);
                paint.setStrokeWidth(dimension);
                this.d = paint;
                invalidate();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float getCornerRadius() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float f = this.b;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.c);
        Paint paint = this.d;
        if (paint != null) {
            float f2 = this.b;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f2, f2, paint);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public final void setCornerRadius(float f) {
        this.b = f;
        invalidate();
    }
}
