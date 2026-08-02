package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hc {
    private final Map<String, Object> pcc = new ConcurrentHashMap();

    private hc() {
    }

    public hc pcc(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.pcc.put(str, obj);
        }
        return this;
    }

    public String sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.pcc.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static hc pcc() {
        return new hc();
    }
}
