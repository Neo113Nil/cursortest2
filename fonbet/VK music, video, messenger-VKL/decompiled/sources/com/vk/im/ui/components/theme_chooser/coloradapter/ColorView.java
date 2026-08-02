package com.vk.im.ui.components.theme_chooser.coloradapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;
import xsna.x9;

/* compiled from: ColorView.kt */
/* loaded from: classes2.dex */
public final class ColorView extends View {
    public int[] b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public final int f;
    public float g;
    public float h;

    public ColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new int[0];
        this.d = x9.c(true);
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.STROKE);
        c.setStrokeWidth(iah0.a(2));
        this.e = c;
        this.f = iah0.a(4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.g, this.e);
        }
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.h, this.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(min, View.MeasureSpec.getMode(i2)));
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), this.b, (float[]) null, Shader.TileMode.CLAMP);
        this.d.setShader(linearGradient);
        Paint paint = this.e;
        paint.setShader(linearGradient);
        float min2 = (Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f) - (paint.getStrokeWidth() / 2.0f);
        this.g = min2;
        this.h = min2 - this.f;
    }

    public final void setChecked(boolean z) {
        this.c = z;
        invalidate();
    }

    public final void setColors(int[] iArr) {
        this.b = iArr;
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), this.b, (float[]) null, Shader.TileMode.CLAMP);
        this.d.setShader(linearGradient);
        this.e.setShader(linearGradient);
        invalidate();
    }
}
