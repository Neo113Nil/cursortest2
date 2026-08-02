package com.bytedance.sdk.component.adexpress.dynamic.vj;

import defpackage.wv8;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    private static void pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static String sf(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
            return pcc.pcc(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return wv8.i(str2, "static/images/", str);
    }

    public static JSONObject pcc(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject vgx = com.bytedance.sdk.component.adexpress.sf.vgx(str);
        if (vgx == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return pcc(jSONObject2, vgx.optJSONObject("themeValues"), jSONObject);
    }

    public static void pcc(String str, JSONObject jSONObject) {
        JSONObject vgx = com.bytedance.sdk.component.adexpress.sf.vgx(str);
        if (vgx == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = vgx.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        pcc(optJSONObject, jSONObject);
    }

    public static JSONObject pcc(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String pcc(String str) {
        JSONObject optJSONObject;
        JSONObject vgx = com.bytedance.sdk.component.adexpress.sf.vgx(str);
        if (vgx == null || (optJSONObject = vgx.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    public static String pcc(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject vgx = com.bytedance.sdk.component.adexpress.sf.vgx(str);
        if (vgx == null || (optJSONObject = vgx.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject pcc(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
