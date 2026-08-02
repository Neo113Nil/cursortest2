package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg {
    private long gm;
    private long oo;
    private final pcc pcc;
    private final JSONObject qf;
    private long sf;
    private boolean vj;
    private boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(int i, boolean z);
    }

    public tmg(pcc pccVar) {
        this.vj = true;
        this.pcc = pccVar;
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("reward_callback_backup", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
        this.qf = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.vj = false;
    }

    public void gm() {
        this.vj = true;
    }

    public void oo() {
        JSONObject jSONObject;
        if (this.pcc != null) {
            long elapsedRealtime = (this.oo + (this.gm > 0 ? SystemClock.elapsedRealtime() - this.gm : 0L)) / 1000;
            if (this.vj || (jSONObject = this.qf) == null || PlayerKt.E_SPORTS_OFFLANER.equals(jSONObject.optString("type"))) {
                return;
            }
            boolean equals = "force".equals(this.qf.optString("type"));
            JSONObject jSONObject2 = this.qf;
            if (equals) {
                if (elapsedRealtime >= jSONObject2.optInt(U3.i.X, -1)) {
                    this.wh = true;
                    this.pcc.pcc(1, true);
                    return;
                }
                return;
            }
            if ("normal".equals(jSONObject2.optString("type"))) {
                int optInt = this.qf.optInt(U3.i.X, -1);
                if (optInt < 0 && elapsedRealtime >= this.sf) {
                    this.wh = false;
                    this.pcc.pcc(1, false);
                } else {
                    if (optInt < 0 || elapsedRealtime < optInt) {
                        return;
                    }
                    this.wh = false;
                    this.pcc.pcc(1, false);
                }
            }
        }
    }

    public void pcc() {
        if (!this.vj && this.gm > 0) {
            this.oo = (SystemClock.elapsedRealtime() - this.gm) + this.oo;
            this.gm = 0L;
        }
    }

    public void sf() {
        if (this.vj) {
            return;
        }
        this.gm = SystemClock.elapsedRealtime();
    }

    public void pcc(long j) {
        if (j <= this.sf) {
            return;
        }
        this.sf = Math.min(30L, j);
    }

    public static void pcc(of ofVar, boolean z, final int i) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, kun.pcc(ofVar), z ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.tmg.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
