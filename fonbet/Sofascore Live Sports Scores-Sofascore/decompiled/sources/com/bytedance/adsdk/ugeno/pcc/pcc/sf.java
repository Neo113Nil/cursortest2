package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    private int gm;
    private int oo;
    private int vj;
    private Paint wh;

    public sf(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        Paint paint = new Paint();
        this.wh = paint;
        paint.setAntiAlias(true);
    }

    private void gm(Canvas canvas) {
        try {
            if (this.sf.ri() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.wh.setColor(this.gm);
                this.wh.setAlpha((int) ((1.0f - this.sf.ri()) * 255.0f));
                ((ViewGroup) this.sf.vh().getParent()).setClipChildren(true);
                canvas.drawCircle(this.oo, this.vj, Math.min(r0, r2) * 2 * this.sf.ri(), this.wh);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.oo = i / 2;
        this.vj = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = com.bytedance.adsdk.ugeno.qf.pcc.pcc(this.pcc.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
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
