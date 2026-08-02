package com.bytedance.adsdk.pcc.sf.sf.pcc;

import defpackage.mz1;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private final String pcc;

    public lo(String str) {
        this.pcc = str;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return mz1.o(new StringBuilder("'"), this.pcc, "'");
    }

    public String toString() {
        return sf();
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.STRING;
    }
}
