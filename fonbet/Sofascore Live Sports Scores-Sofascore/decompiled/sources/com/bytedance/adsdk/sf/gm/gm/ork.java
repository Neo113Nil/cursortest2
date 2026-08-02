package com.bytedance.adsdk.sf.gm.gm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends oo {
    private Path kj;
    private int ork;
    private int vy;

    public ork(com.bytedance.adsdk.sf.vy vyVar, vj vjVar, Context context) {
        super(vyVar, vjVar);
        this.kj = null;
        this.vy = -1;
        this.ork = -1;
        if (((oo) this).qf != null) {
            float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
            this.vy = (int) (((oo) this).qf.pcc() * pcc);
            this.ork = (int) (((oo) this).qf.sf() * pcc);
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vy, this.ork);
            Path path = new Path();
            this.kj = path;
            float f = pcc * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    private static void pcc(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.oo, com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        View pcc = this.sf.pcc();
        if (this.vy <= 0 || pcc == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        pcc(i);
        float wh = wh();
        pcc(pcc, this.vy, this.ork);
        pcc.setAlpha(wh);
        canvas.clipPath(this.kj);
        pcc.draw(canvas);
        canvas.restore();
    }
}
