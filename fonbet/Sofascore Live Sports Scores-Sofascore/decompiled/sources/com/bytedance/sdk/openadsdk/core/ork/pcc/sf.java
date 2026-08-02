package com.bytedance.sdk.openadsdk.core.ork.pcc;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.hc.vy;
import com.bytedance.sdk.openadsdk.oo.oo.vj;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements vy {
    private final of gm;
    private wh kj;
    private String oo;
    private int ork = -1;
    private final mu pcc;
    private vj qf;
    private final qf sf;
    private Activity vh;
    private vh vj;
    private com.bytedance.sdk.openadsdk.core.jr.oo.sf vy;
    private JSONObject wh;

    public sf(mu muVar, qf qfVar, of ofVar) {
        this.pcc = muVar;
        this.sf = qfVar;
        this.gm = ofVar;
    }

    @Override // com.bytedance.sdk.openadsdk.hc.vy
    public void gm(int i) {
        mu muVar = this.pcc;
        if (muVar == null) {
            return;
        }
        int i2 = this.ork;
        if (i2 <= 0 && i > 0) {
            muVar.qf(false);
        } else if (i2 > 0 && i == 0) {
            muVar.qf(true);
        }
        this.ork = i;
    }

    public void oo() {
        DeviceUtils.AudioInfoReceiver.pcc(this);
    }

    public void pcc() {
        mu muVar;
        qf qfVar = this.sf;
        if (qfVar == null || qfVar.getWebView() == null || (muVar = this.pcc) == null) {
            return;
        }
        muVar.sf(this.sf).pcc(true).pcc(this.gm).gm(this.gm.esn()).oo(this.gm.hl()).sf(kun.pcc(this.oo)).vj(this.gm.ray()).pcc(new gm(this.sf)).pcc(this.vj).pcc(this.wh).sf(this.oo).pcc(this.gm.bxz()).pcc(this.vh).pcc(this.sf).pcc(this.qf);
        this.pcc.pcc(new oo(this.sf));
    }

    public void sf() {
        this.sf.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.sf.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (sf.this.sf == null || sf.this.sf.getViewTreeObserver() == null) {
                    return;
                }
                sf.this.sf.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = sf.this.sf.getMeasuredWidth();
                int measuredHeight = sf.this.sf.getMeasuredHeight();
                if (sf.this.sf.getVisibility() == 0) {
                    sf.this.pcc.pcc(measuredWidth, measuredHeight);
                }
            }
        });
    }

    public void vj() {
        mu muVar = this.pcc;
        if (muVar == null) {
            return;
        }
        muVar.kj(false);
    }

    public void wh() {
        qf qfVar;
        if (this.pcc == null || (qfVar = this.sf) == null || qfVar.getWebView() == null) {
            return;
        }
        this.pcc.kj(this.sf.getVisibility() == 0);
    }

    public void gm() {
        DeviceUtils.AudioInfoReceiver.sf(this);
        this.ork = DeviceUtils.qf();
    }

    public sf pcc(vh vhVar) {
        this.vj = vhVar;
        return this;
    }

    public sf pcc(vj vjVar) {
        this.qf = vjVar;
        return this;
    }

    public sf pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.vy = sfVar;
        return this;
    }

    public sf pcc(String str) {
        this.oo = str;
        return this;
    }

    public sf pcc(JSONObject jSONObject) {
        this.wh = jSONObject;
        return this;
    }

    public sf pcc(wh whVar) {
        this.kj = whVar;
        return this;
    }

    public sf pcc(Activity activity) {
        this.vh = activity;
        return this;
    }
}
