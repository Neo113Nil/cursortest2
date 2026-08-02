package com.vk.clips.design.view.feed.item.onboarding;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.iah0;

/* compiled from: FastForwardOnboardingView.kt */
/* loaded from: classes16.dex */
public final class FastForwardOnboardingView extends VkPlaceholder {
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public float E;
    public float F;
    public float G;
    public float H;

    public FastForwardOnboardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        dhr0.a.getClass();
        paint.setColor(e3m.f(R.attr.vk_ui_background_content_alpha, dhr0.t(context)));
        this.B = paint;
        Paint paint2 = new Paint();
        paint2.setColor(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, dhr0.t(context)));
        paint2.setStyle(Paint.Style.FILL);
        this.C = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(e3m.f(R.attr.vk_ui_field_border_alpha, dhr0.t(context)));
        paint3.setStrokeWidth(iah0.b(1.0f));
        paint3.setStyle(Paint.Style.STROKE);
        this.D = paint3;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.B);
        float f = this.F;
        float f2 = this.H;
        float f3 = this.E;
        Paint paint = this.C;
        canvas.drawCircle(f, f2, f3, paint);
        canvas.drawCircle(this.G, this.H, this.E, paint);
        float f4 = this.F;
        float f5 = this.H;
        float f6 = this.E;
        Paint paint2 = this.D;
        canvas.drawCircle(f4, f5, f6, paint2);
        canvas.drawCircle(this.G, this.H, this.E, paint2);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float height = getHeight() / 2.0f;
            this.H = height;
            this.E = iah0.b(16.0f) + height;
            float width = getWidth() * 0.24f;
            float f = this.E;
            this.F = (-f) + width;
            this.G = (f + getWidth()) - width;
        }
    }
}
