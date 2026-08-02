package com.vk.im.ui.components.theme_chooser.themeadapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;
import xsna.x9;

/* compiled from: GradientBubblesView.kt */
/* loaded from: classes2.dex */
public final class GradientBubblesView extends View {
    public int[] b;
    public final Paint c;
    public final Path d;
    public final int e;
    public final int f;

    public GradientBubblesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new int[0];
        this.c = x9.c(true);
        this.d = new Path();
        float f = 8;
        this.e = iah0.a(f);
        this.f = iah0.a(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.d, this.c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = i2;
        Path path = this.d;
        path.reset();
        float f3 = f2 * 0.21276596f;
        float f4 = this.f;
        float f5 = f2 - f4;
        float f6 = f5 - f3;
        float f7 = f - this.e;
        float f8 = f3 / 2;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f7 - (0.7234042f * f), f6, f7, f5, f8, f8, direction);
        float f9 = f6 - f4;
        path.addRoundRect(f7 - (0.42553192f * f), f9 - f3, f7, f9, f8, f8, direction);
        this.c.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), this.b, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void setColors(int[] iArr) {
        this.b = iArr;
        this.c.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), this.b, (float[]) null, Shader.TileMode.CLAMP));
        invalidate();
    }
}
