package com.vk.cameraui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.dq;

/* compiled from: VmojiCaptureShadowView.kt */
/* loaded from: classes16.dex */
public final class VmojiCaptureShadowView extends View {
    public final Paint b;
    public final Path c;
    public final float d;
    public final float e;

    public VmojiCaptureShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-16777216);
        paint.setAlpha(204);
        Path path = new Path();
        this.c = path;
        path.setFillType(Path.FillType.WINDING);
        this.d = dq.a(4.0f, getResources().getDimension(R.dimen.camera_icon_margin) + getResources().getDimension(R.dimen.camera_icon_size));
        this.e = dq.a(64.0f, dq.a(40.0f, getResources().getDimension(R.dimen.camera_vmoji_capture_tip_margin)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.c, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredHeight = getMeasuredHeight() - this.e;
        float f = this.d;
        float measuredWidth = (getMeasuredWidth() - ((measuredHeight - f) * 0.8f)) / 2.0f;
        Path path = this.c;
        path.reset();
        path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
        path.addOval(measuredWidth, f, getMeasuredWidth() - measuredWidth, measuredHeight, Path.Direction.CCW);
    }
}
