package com.vk.photo.editor.markup.view.tools;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;

/* compiled from: PaintBackgroundView.kt */
/* loaded from: classes4.dex */
public final class PaintBackgroundView extends View {
    public final Paint b;
    public float c;

    public PaintBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.b = paint;
        float f = 10;
        this.c = (int) Math.floor(Resources.getSystem().getDisplayMetrics().density * f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, R.style.PaintBackgroundView);
        this.c = obtainStyledAttributes.getDimension(0, (int) Math.floor(f * Resources.getSystem().getDisplayMetrics().density));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.b;
        paint.setStyle(style);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.c;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight, f, f, paint);
    }

    public final float getCornerRadius() {
        return this.c;
    }

    public final Paint getPaint() {
        return this.b;
    }

    public final void setCornerRadius(float f) {
        this.c = f;
    }
}
