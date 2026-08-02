package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax extends View {
    private int gm;
    private Drawable oo;
    private final Path pcc;
    private final boolean sf;
    private Drawable vj;
    private float wh;

    public dax(Context context, boolean z) {
        super(context);
        this.pcc = new Path();
        this.sf = z;
        pcc();
    }

    private void sf() {
        int width = getWidth();
        int height = getHeight();
        if (this.wh <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width <= 0 || height <= 0) {
            return;
        }
        this.pcc.reset();
        this.pcc.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * this.wh, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.gm <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.oo.draw(canvas);
            canvas.translate(this.gm, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.pcc);
        for (int i2 = 0; i2 < 5; i2++) {
            this.vj.draw(canvas);
            canvas.translate(this.gm, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.gm * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.gm, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        sf();
    }

    public void pcc(double d, int i) {
        int pcc = (int) rj.pcc(getContext(), i, false);
        this.gm = pcc;
        this.oo.setBounds(0, 0, pcc, pcc);
        Drawable drawable = this.vj;
        int i2 = this.gm;
        drawable.setBounds(0, 0, i2, i2);
        this.wh = ((float) d) / 5.0f;
        sf();
        requestLayout();
    }

    public dax(Context context) {
        this(context, false);
    }

    private void pcc() {
        Context context = getContext();
        this.oo = tz.gm(context, this.sf ? "tt_star_thick_dark" : "tt_star_thick");
        this.vj = tz.gm(context, "tt_star");
    }
}
