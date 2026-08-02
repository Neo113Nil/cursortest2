package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends nac {
    public gbb() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc = this.pcc.pcc(map);
        Object pcc2 = this.sf.pcc(map);
        return (pcc == null && pcc2 == null) ? Boolean.FALSE : (pcc != null || pcc2 == null) ? (pcc == null || pcc2 != null) ? ((pcc instanceof Number) && (pcc2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.pcc.sf.vj.pcc.sf.pcc((Number) pcc, (Number) pcc2)) : Boolean.valueOf(!pcc.equals(pcc2)) : Boolean.TRUE : Boolean.TRUE;
    }
}
