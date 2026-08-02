package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends gm {
    public int gm;
    public int oo = 0;
    public long pcc;
    public long sf;

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.pcc);
            jSONObject.put("buffers_time", this.sf);
            jSONObject.put("break_reason", this.gm);
            jSONObject.put("video_backup", this.oo);
        } catch (Throwable th) {
            lo.gm("FeedBreakModel", th.getMessage());
        }
    }

    public void sf(long j) {
        this.sf = j;
    }

    public void sf(int i) {
        this.oo = i;
    }

    public void pcc(int i) {
        this.gm = i;
    }

    public void pcc(long j) {
        this.pcc = j;
    }
}
