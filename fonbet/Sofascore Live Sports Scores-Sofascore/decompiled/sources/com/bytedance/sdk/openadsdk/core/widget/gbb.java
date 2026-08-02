package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends com.bytedance.sdk.openadsdk.core.wh.oo {
    private Paint pcc;
    private RectF sf;

    public gbb(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pcc.setColor(Color.parseColor("#99333333"));
        this.pcc.setAntiAlias(true);
        this.pcc.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.sf = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.sf;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.pcc);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.oo, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.sf.right == getMeasuredWidth() && this.sf.bottom == getMeasuredHeight()) {
            return;
        }
        this.sf.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
    }
}
