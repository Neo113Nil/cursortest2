package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr extends com.bytedance.sdk.openadsdk.core.wh.kj {
    private int gm;
    private Paint pcc;
    private RectF sf;

    public jr(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gm = 0;
        pcc();
    }

    private void pcc() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pcc.setColor(Color.parseColor("#99333333"));
        this.pcc.setAntiAlias(true);
        this.pcc.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.sf = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.sf;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.pcc);
        canvas.translate((this.sf.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.kj, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.sf.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int measureText = (int) getPaint().measureText("00");
        this.gm = measureText;
        if (measuredWidth < measureText) {
            measuredWidth = measureText;
        }
        int d = lnb.d(measuredHeight, 2, 2, measuredWidth);
        setMeasuredDimension(d, measuredHeight);
        this.sf.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, measuredHeight);
    }

    public jr(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jr(Context context) {
        this(context, null);
    }
}
