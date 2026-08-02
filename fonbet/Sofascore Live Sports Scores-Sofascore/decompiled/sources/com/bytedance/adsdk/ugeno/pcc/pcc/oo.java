package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.qf.pcc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends pcc {
    private static final float dax;
    private static final float gbb;
    private static final float jr;
    private static final float nac;
    private int gm;
    private Path hc;
    private int kj;
    private float lu;
    private Paint oo;
    private int ork;
    private int qf;
    private boolean tmg;
    private int vh;
    private Path vj;
    private float vy;
    private pcc.C0034pcc wh;

    static {
        float radians = (float) Math.toRadians(30.0d);
        gbb = radians;
        jr = (float) Math.tan(radians);
        dax = (float) Math.cos(radians);
        nac = (float) Math.sin(radians);
    }

    public oo(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.tmg = true;
        Paint paint = new Paint();
        this.oo = paint;
        paint.setAntiAlias(true);
        this.vj = new Path();
        this.vy = this.sf.of();
        this.hc = new Path();
    }

    private void gm(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.sf.hpk() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = this.ork;
                float f = jr;
                float hpk = ((i * f) + i) * this.sf.hpk();
                this.hc.reset();
                this.hc.moveTo(hpk, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i2 = this.vh;
                float f2 = hpk - (i2 * f);
                this.hc.lineTo(f2, i2);
                this.hc.lineTo(f2 + this.gm, this.vh);
                this.hc.lineTo(this.gm + hpk, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.hc.close();
                float f3 = this.lu;
                float f4 = dax * f3;
                float f5 = f3 * nac;
                if (!this.tmg || this.wh == null) {
                    int i3 = this.kj;
                    linearGradient = new LinearGradient(hpk, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hpk + f4, f5, new int[]{i3, this.qf, i3}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(hpk, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hpk + f4, f5, this.wh.sf, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.oo.setShader(linearGradient);
                Path path = this.vj;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.hc, this.oo);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.ork = i;
        this.vh = i2;
        try {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
            Path path = this.vj;
            float f = this.vy;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = (int) kj.pcc(this.sf.vh().getContext(), this.pcc.optInt("shineWidth", 30));
        String optString = this.pcc.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(optString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : optString;
        if (str.startsWith("linear")) {
            this.wh = com.bytedance.adsdk.ugeno.qf.pcc.sf(str);
        } else {
            int pcc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str);
            this.qf = pcc;
            this.kj = com.bytedance.adsdk.ugeno.qf.pcc.pcc(pcc, 32);
            this.tmg = false;
        }
        this.lu = dax * this.gm;
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
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(oo(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
