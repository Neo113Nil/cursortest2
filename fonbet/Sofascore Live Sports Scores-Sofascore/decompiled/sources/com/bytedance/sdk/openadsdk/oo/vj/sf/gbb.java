package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import defpackage.ltm;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends gm {
    private final int gm;
    private final int oo;
    private long pcc;
    private long sf;
    private final String vj;

    public gbb(ltm ltmVar) {
        this.gm = ltmVar.a;
        this.oo = ltmVar.b;
        this.vj = ltmVar.c;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pcc);
            jSONObject.put("total_duration", this.sf);
            jSONObject.put("error_code", this.gm);
            jSONObject.put("extra_error_code", this.oo);
            jSONObject.put("error_message", this.vj);
        } catch (Throwable th) {
            lo.gm("PlayErrorModel", th.getMessage());
        }
    }

    public void sf(long j) {
        this.sf = j;
    }

    public void pcc(long j) {
        this.pcc = j;
    }
}
