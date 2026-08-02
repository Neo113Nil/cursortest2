package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends gm {
    private final String pcc;
    private final long sf;

    public vy(String str, long j) {
        this.pcc = str;
        this.sf = j;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.pcc);
            jSONObject.put("preload_size", this.sf);
        } catch (Throwable th) {
            lo.gm("LoadVideoCancelModel", th.getMessage());
        }
    }
}
