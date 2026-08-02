package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends nac {
    public kj() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.LT_EQ);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        if (this.pcc.pcc(map) == null || (pcc = this.sf.pcc(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.pcc.sf.vj.pcc.gm.pcc(r0, (Number) pcc)).booleanValue());
    }
}
