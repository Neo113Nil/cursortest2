package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.U3;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k {
    private static JSONObject a = new JSONObject();

    private static boolean a(JSONObject jSONObject, e eVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!a(jSONObject.optJSONObject(next), eVar.b(next.substring(7)))) {
                        com.apm.insight.a.a((Object) "not match ".concat(next));
                        return false;
                    }
                } else if (!next.startsWith("java_")) {
                    com.apm.insight.a.a((Object) "no rules match ".concat(next));
                } else if (!a(jSONObject.optJSONObject(next), eVar.a(next.substring(5)))) {
                    com.apm.insight.a.a((Object) "not match ".concat(next));
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    private static JSONObject b(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        e eVar = new e();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    com.apm.insight.c.a();
                    j.a(new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))), "NPTH_CATCH");
                } else if (a(optJSONObject.optJSONArray("disable"), eVar)) {
                    com.apm.insight.a.a((Object) "match diable ".concat(String.valueOf(next)));
                } else {
                    JSONArray b = b(optJSONObject.optJSONArray(com.ironsource.mediationsdk.metadata.a.k), eVar);
                    if (com.apm.insight.a.a(b)) {
                        com.apm.insight.a.a((Object) "not match ".concat(String.valueOf(next)));
                    } else {
                        try {
                            jSONObject2.put(next, new JSONObject().put(com.ironsource.mediationsdk.metadata.a.k, b));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
        return jSONObject2;
    }

    public static boolean a(String str, e eVar) {
        JSONObject optJSONObject;
        JSONObject jSONObject = a;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null || a(optJSONObject.optJSONArray("disable"), eVar)) {
            return false;
        }
        return a(optJSONObject.optJSONArray(com.ironsource.mediationsdk.metadata.a.k), eVar);
    }

    private static boolean a(JSONArray jSONArray, e eVar) {
        if (com.apm.insight.a.a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                com.apm.insight.c.a();
                j.a(new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))), "NPTH_CATCH");
            } else if (a(optJSONObject, eVar)) {
                return true;
            }
        }
        return false;
    }

    public static void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String a2 = a.a(jSONObject);
            File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configNative");
            if (a2 != null) {
                JSONObject jSONObject2 = new JSONObject(a2);
                a = jSONObject2;
                com.apm.insight.l.f.a(file, b(jSONObject2));
                return;
            }
            a = new JSONObject();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
    }

    private static boolean a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals(U3.j.b)) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static JSONArray b(JSONArray jSONArray, e eVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (!com.apm.insight.a.a(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    com.apm.insight.c.a();
                    j.a(new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))), "NPTH_CATCH");
                } else if (a(optJSONObject, eVar)) {
                    jSONArray2.put(optJSONObject);
                }
            }
        }
        return jSONArray2;
    }
}
