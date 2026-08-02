package com.bytedance.adsdk.pcc;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    public Object pcc(JSONObject jSONObject, Object[] objArr) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String valueOf = String.valueOf(objArr[2]);
        String valueOf2 = String.valueOf(objArr[1]);
        String valueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(valueOf3) && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("i18n")) != null && (optJSONObject2 = optJSONObject.optJSONObject(valueOf2)) != null) {
            String optString = optJSONObject2.optString(valueOf3);
            if (!TextUtils.isEmpty(optString)) {
                return optString;
            }
        }
        return valueOf;
    }
}
