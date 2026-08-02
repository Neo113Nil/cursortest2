package com.bytedance.adsdk.ugeno.gm;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gm.pcc;
import com.bytedance.adsdk.ugeno.vj;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static String pcc(String str, JSONObject jSONObject) {
        pcc gm;
        pcc.InterfaceC0029pcc pcc;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (gm = vj.pcc().gm()) != null && (pcc = gm.pcc(str.substring(2, str.length() - 1))) != null) {
                    return (String) pcc.pcc(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static Object pcc(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        return (valueOf.startsWith("${") && valueOf.endsWith("}")) ? pcc(valueOf, jSONObject) : obj;
    }
}
