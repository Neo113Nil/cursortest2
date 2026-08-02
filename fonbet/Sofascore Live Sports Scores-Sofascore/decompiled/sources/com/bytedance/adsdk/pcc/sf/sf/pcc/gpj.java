package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj implements com.bytedance.adsdk.pcc.sf.sf.sf {
    private com.bytedance.adsdk.pcc.sf.sf.pcc gm;
    private com.bytedance.adsdk.pcc.sf.sf.pcc pcc;
    private com.bytedance.adsdk.pcc.sf.sf.pcc sf;

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void gm(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.gm = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc = this.pcc.pcc(map);
        if (pcc == null) {
            return null;
        }
        return ((Boolean) pcc).booleanValue() ? this.sf.pcc(map) : this.gm.pcc(map);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc.sf() + "?" + this.sf.sf() + ":" + this.gm.sf();
    }

    public String toString() {
        return sf();
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void pcc(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.pcc = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void sf(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.sf = pccVar;
    }
}
