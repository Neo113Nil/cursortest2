package com.vk.voip.ui.menu.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.R$styleable;
import xsna.cn70;

/* compiled from: PortalView.kt */
/* loaded from: classes7.dex */
public final class PortalView extends View {
    public float b;
    public final Path c;
    public final Paint d;

    public PortalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        this.c = path;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.d = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l, 0, 0);
        try {
            this.b = obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(16));
            paint.setColor(obtainStyledAttributes.getColor(0, -16777216));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.c, this.d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.c;
        path.reset();
        path.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight()), Path.Direction.CW);
        RectF rectF = new RectF(getPaddingLeft(), (-this.b) * 2, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        float f = this.b;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
    }

    public final void setColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public final void setRadius(float f) {
        this.b = f;
        invalidate();
    }
}
