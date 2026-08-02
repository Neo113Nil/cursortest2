package com.mbridge.msdk.config.dynamic.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    public Map<String, Object> a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        linkedHashMap.put(next, a((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        linkedHashMap.put(next, a((JSONArray) obj));
                    } else {
                        linkedHashMap.put(next, obj);
                    }
                }
            } catch (Throwable th) {
                q0.b("JSONParser", th.getMessage(), th);
            }
        }
        return linkedHashMap;
    }

    public Map<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            q0.b("JSONParser", e.getMessage(), e);
            return new HashMap();
        }
    }

    public List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    arrayList.add(a((JSONArray) obj));
                } else {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                q0.b("JSONParser", th.getMessage(), th);
                return arrayList;
            }
        }
        return arrayList;
    }
}
