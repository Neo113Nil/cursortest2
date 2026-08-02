package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.R;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private Activity gm;
    private of oo;
    private final com.bytedance.sdk.openadsdk.component.reward.gm.sf pcc;
    private com.bytedance.sdk.openadsdk.component.reward.gm.pcc sf;
    private String vj;
    private final AtomicBoolean wh = new AtomicBoolean(false);
    private long qf = 0;

    public oo(com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar, Activity activity, of ofVar, String str) {
        this.pcc = sfVar;
        this.gm = activity;
        this.oo = ofVar;
        this.vj = str;
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        if (this.pcc == null) {
            return;
        }
        if (z || !this.wh.get() || this.qf <= 0) {
            this.qf = SystemClock.elapsedRealtime();
        } else {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(SystemClock.elapsedRealtime() - this.qf), this.oo, this.vj, qfVar);
            this.qf = 0L;
        }
    }

    public long sf() {
        return this.qf;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        this.sf = pccVar;
    }

    public boolean pcc() {
        return this.wh.get();
    }

    public void pcc(final JSONObject jSONObject) {
        if (!this.wh.get() && this.wh.compareAndSet(false, true)) {
            final View findViewById = this.gm.findViewById(R.id.content);
            if (findViewById == null) {
                findViewById = this.gm.getWindow().getDecorView();
            }
            findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", findViewById.getWidth());
                        jSONObject3.put("height", findViewById.getHeight());
                        jSONObject3.put("alpha", findViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                        jSONObject2.put("dynamic_show_type", oo.this.oo.rt());
                    } catch (Throwable th) {
                        lo.pcc("UnifyReportManager", "run: ", th);
                    }
                    oo.this.pcc(jSONObject, (JSONObject) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.oo, this.vj, jSONObject, jSONObject2);
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    public void pcc(boolean z, of ofVar, String str) {
        if (ofVar != null && z && ofVar.qap() && !ofVar.tsz()) {
            ofVar.qf(true);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, ofVar.uij());
        }
    }
}
