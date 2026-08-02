package com.safedk.android.utils;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d {
    public static Map<String, String> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = b((JSONObject) obj);
            }
            hashMap.put(next, (String) obj);
        }
        return hashMap;
    }

    public static Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = b((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = b((JSONObject) obj);
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            synchronized (collection) {
                for (Object obj : collection) {
                    if (obj != null) {
                        jSONArray.put(obj);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static <T> JSONObject a(Map<T, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<T, ?> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        if (entry.getValue() instanceof Collection) {
                            jSONObject.put(String.valueOf(entry.getKey()), a((Collection<?>) entry.getValue()));
                        } else if (entry.getValue() instanceof Map) {
                            jSONObject.put(String.valueOf(entry.getKey()), a((Map) entry.getValue()));
                        } else {
                            jSONObject.put(String.valueOf(entry.getKey()), entry.getValue());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    if (obj instanceof Collection) {
                        jSONObject.put(str, a((Collection<?>) obj));
                    } else if (obj instanceof Map) {
                        jSONObject.put(str, a((Map) obj));
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
            }
        }
        return jSONObject;
    }
}
