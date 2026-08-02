package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4114he {
    private JSONObject a;

    public C4114he() {
        this.a = new JSONObject();
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? b((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    private void f(String str) {
        try {
            this.a = new JSONObject(str);
        } catch (Exception e) {
            C4157k4.d().a(e);
            this.a = new JSONObject();
        }
    }

    public boolean c(String str) {
        return this.a.optBoolean(str);
    }

    public String d(String str) {
        return this.a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public C4114he(String str) {
        f(str);
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public int a(String str, int i) {
        return this.a.optInt(str, i);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.a.put(str, jSONObject);
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    public JSONObject a() {
        return this.a;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e) {
            C4157k4.d().a(e);
            return null;
        }
    }

    public void b(String str, String str2) {
        try {
            this.a.put(str, str2);
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }
}
