package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu extends nac {
    private static final ThreadLocal<StringBuilder> oo = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.pcc.sf.sf.pcc.lu.1
        @Override // java.lang.ThreadLocal
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public lu() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.PLUS);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        Object pcc2 = this.pcc.pcc(map);
        if (pcc2 == null || (pcc = this.sf.pcc(map)) == null) {
            return null;
        }
        if (!(pcc2 instanceof String) && !(pcc instanceof String)) {
            return com.bytedance.adsdk.pcc.sf.vj.pcc.kj.pcc((Number) pcc2, (Number) pcc);
        }
        StringBuilder sb = oo.get();
        sb.append(pcc2);
        sb.append(pcc);
        String sb2 = sb.toString();
        sb.setLength(0);
        return sb2;
    }
}
