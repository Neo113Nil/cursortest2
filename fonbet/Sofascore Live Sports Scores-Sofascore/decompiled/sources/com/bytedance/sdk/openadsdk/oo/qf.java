package com.bytedance.sdk.openadsdk.oo;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private long gm;
    private long oo;
    private long pcc;
    private long sf;
    private long vj;

    public void gm(long j) {
        if (this.gm <= 0) {
            this.gm = j;
        }
    }

    public void oo(long j) {
        if (this.oo <= 0) {
            this.oo = j;
        }
    }

    public void pcc(long j, float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pcc(j);
        }
        double d = f;
        if (d >= 0.25d) {
            pcc(j);
            sf(j);
        }
        if (d >= 0.5d) {
            pcc(j);
            sf(j);
            gm(j);
        }
        if (d >= 0.75d) {
            pcc(j);
            sf(j);
            gm(j);
            oo(j);
        }
        if (f >= 1.0f) {
            pcc(j);
            sf(j);
            gm(j);
            oo(j);
            vj(j);
        }
    }

    public void sf(long j) {
        if (this.sf <= 0) {
            this.sf = j;
        }
    }

    public void vj(long j) {
        if (this.vj <= 0) {
            this.vj = j;
        }
    }

    public JSONObject sf() {
        return pcc((JSONObject) null);
    }

    public boolean pcc() {
        return this.pcc > 0;
    }

    public void pcc(long j) {
        if (this.pcc <= 0) {
            this.pcc = j;
        }
    }

    public JSONObject pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.pcc;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.sf;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.gm;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.oo;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.vj;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
