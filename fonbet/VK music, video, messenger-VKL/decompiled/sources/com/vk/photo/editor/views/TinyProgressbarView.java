package com.vk.photo.editor.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.api.R$styleable;

/* compiled from: TinyProgressbarView.kt */
/* loaded from: classes4.dex */
public final class TinyProgressbarView extends View {
    public final Paint b;
    public final Paint c;
    public float d;

    public TinyProgressbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = 0.5f;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            int color = obtainStyledAttributes.getColor(0, Color.rgb(70, 70, 70));
            int color2 = obtainStyledAttributes.getColor(1, -1);
            Paint paint = new Paint();
            paint.setColor(color);
            this.b = paint;
            Paint paint2 = new Paint();
            paint2.setColor(color2);
            this.c = paint2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float getProgress() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        Paint paint = this.b;
        canvas.drawCircle(height, height, height, paint);
        canvas.drawCircle(getWidth() - height, height, height, paint);
        canvas.drawRect(height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth() - height, getHeight(), paint);
        if (this.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float width = getWidth() * this.d;
        Paint paint2 = this.c;
        canvas.drawCircle(height, height, height, paint2);
        float f = width - height;
        canvas.drawCircle(f < height ? height : f, height, height, paint2);
        canvas.drawRect(height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f < height ? height : f, getHeight(), paint2);
    }

    public final void setProgress(float f) {
        this.d = f;
        invalidate();
        requestLayout();
    }
}
