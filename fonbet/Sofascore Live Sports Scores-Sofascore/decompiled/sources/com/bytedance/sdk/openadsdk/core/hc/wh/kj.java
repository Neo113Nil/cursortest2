package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    public void pcc(String str, of ofVar, String str2, Map<String, Object> map) {
        Object obj;
        Object value;
        Object value2;
        if (map != null) {
            try {
                if (!map.isEmpty() && (obj = map.get("label")) != null) {
                    String valueOf = String.valueOf(obj);
                    if (TextUtils.isEmpty(valueOf)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    String hl = ofVar.hl();
                    if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(hl)) {
                        jSONObject.put("log_extra", hl);
                    } else {
                        JSONObject jSONObject2 = new JSONObject(hl);
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (!"label".equals(entry.getKey()) && (value2 = entry.getValue()) != null) {
                                jSONObject2.put(entry.getKey(), String.valueOf(value2));
                            }
                        }
                        jSONObject.put("log_extra", jSONObject2.toString());
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    if ("sendAdExtra".equals(str)) {
                        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                            if (!"label".equals(entry2.getKey()) && (value = entry2.getValue()) != null) {
                                jSONObject3.put(entry2.getKey(), String.valueOf(value));
                            }
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject3.toString());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(ofVar.bxz()));
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, "app_union", str2, valueOf, Long.parseLong(ofVar.esn()), 0L, jSONObject, lo.kj(ofVar));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
