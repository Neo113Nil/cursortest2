package com.bytedance.adsdk.pcc.sf.sf.pcc;

import com.ironsource.U3;
import defpackage.ilg;
import defpackage.mz1;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private final Object pcc;

    public qf(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.pcc = Boolean.TRUE;
            return;
        }
        if (str.equalsIgnoreCase("false")) {
            this.pcc = Boolean.FALSE;
        } else if (str.equalsIgnoreCase("null")) {
            this.pcc = null;
        } else {
            ilg.c();
            throw null;
        }
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        Object obj = this.pcc;
        return obj != null ? obj.toString() : "NULL";
    }

    public String toString() {
        return mz1.n(new StringBuilder("KeywordNode [keywordValue="), this.pcc, U3.j.e);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.CONSTANT;
    }
}
