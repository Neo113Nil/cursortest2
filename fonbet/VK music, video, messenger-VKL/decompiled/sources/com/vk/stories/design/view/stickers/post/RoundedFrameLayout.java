package com.vk.stories.design.view.stickers.post;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedFrameLayout.kt */
/* loaded from: classes6.dex */
public final class RoundedFrameLayout extends FrameLayout {
    public final RectF b;
    public final Path c;
    public float d;

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.c);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.c);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final float getCornerRadius() {
        return this.d;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        Path path = this.c;
        path.reset();
        float f = this.d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        path.close();
    }

    public final void setCornerRadius(float f) {
        this.d = f;
        invalidate();
    }
}
