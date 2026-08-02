package com.vk.music.bottomsheets.settings.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.bottomsheet.impl.R$styleable;

/* compiled from: RoundedShadowView.kt */
/* loaded from: classes3.dex */
public final class RoundedShadowView extends View {
    public final float b;
    public final float c;
    public final Paint d;
    public final RectF e;

    public RoundedShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.d = paint;
        this.e = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        float dimension = obtainStyledAttributes.getDimension(4, this.b);
        this.b = dimension;
        this.c = obtainStyledAttributes.getDimension(0, this.c);
        obtainStyledAttributes.recycle();
        paint.setColor(color);
        paint.setShadowLayer(dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, color);
        setLayerType(2, null);
    }

    public final void a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        float f = 2;
        float f2 = this.b;
        layoutParams.width = (int) ((f * f2) + i);
        layoutParams.height = (int) ((f * f2) + i2);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.c;
        canvas.drawRoundRect(this.e, f, f, this.d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.b;
        this.e.set(f, f, i - f, i2 - f);
    }
}
