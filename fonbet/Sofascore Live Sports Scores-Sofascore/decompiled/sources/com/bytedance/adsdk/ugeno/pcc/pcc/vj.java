package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends pcc {
    private float gm;
    private PorterDuffXfermode hc;
    private boolean kj;
    private float oo;
    private Path ork;
    private String qf;
    private Path tmg;
    private Path vh;
    private Paint vj;
    private boolean vy;
    private float wh;

    public vj(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.kj = true;
        this.vy = true;
        Paint paint = new Paint();
        this.vj = paint;
        paint.setAntiAlias(true);
        this.sf.vh().setLayerType(2, null);
        this.hc = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.ork = new Path();
        this.vh = new Path();
        this.tmg = new Path();
        this.vj.setXfermode(this.hc);
    }

    private void gm(Canvas canvas) {
        int fmh;
        int fmh2;
        if (this.sf.fmh() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.vj.setXfermode(this.hc);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gm, this.oo, this.vj);
            return;
        }
        fmh = (int) (this.sf.fmh() * this.gm);
        fmh2 = (int) (this.sf.fmh() * this.oo);
        this.vj.setXfermode(this.hc);
        String str = this.qf;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fmh2, this.gm, this.oo, this.vj);
                break;
            case "center":
                this.ork.reset();
                this.vh.reset();
                this.tmg.reset();
                Path.Direction direction = Path.Direction.CW;
                this.ork.addCircle(this.gm / 2.0f, this.oo / 2.0f, fmh, direction);
                Path path = this.vh;
                float f = this.gm;
                path.addRect(f / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.oo, direction);
                Path path2 = this.vh;
                Path path3 = this.ork;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.tmg.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gm / 2.0f, this.oo, direction);
                this.tmg.op(this.ork, op);
                canvas.drawPath(this.vh, this.vj);
                canvas.drawPath(this.tmg, this.vj);
                break;
            case "top":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gm, this.oo - fmh2, this.vj);
                break;
            case "left":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gm - fmh, this.oo, this.vj);
                break;
            case "right":
                canvas.drawRect(fmh, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gm, this.oo, this.vj);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        if (i > 0 && this.kj) {
            this.gm = i;
            this.kj = false;
        }
        if (i2 <= 0 || !this.vy) {
            return;
        }
        this.oo = i2;
        this.vy = false;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.wh = (float) this.pcc.optDouble("start", 0.0d);
        this.qf = this.pcc.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(Canvas canvas) {
        gm(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf(Canvas canvas) {
        gm(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(oo(), this.wh, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
