package com.vk.vas.design.view.sticker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hl7;
import xsna.iah0;
import xsna.too0;
import xsna.zk7;

/* compiled from: BonusProgressView.kt */
/* loaded from: classes6.dex */
public final class BonusProgressView extends View implements too0 {
    public static final /* synthetic */ int i = 0;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final RectF e;
    public final float f;
    public final ValueAnimator g;
    public float h;

    public BonusProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new RectF();
        this.e = new RectF();
        this.f = iah0.a(34);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.g = valueAnimator;
        paint.setShader(zk7.a(10));
        Ng();
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.setDuration(400L);
        valueAnimator.addUpdateListener(new hl7(this, 0));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setColor(e3m.f(R.attr.vk_ui_track_background, getContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        RectF rectF = this.d;
        float f = this.f;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(this.e, f, f, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.d.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
        this.e.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.h * getMeasuredWidth(), getMeasuredHeight());
        this.b.setShader(zk7.a(Integer.valueOf(getMeasuredWidth())));
    }
}
