package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import defpackage.wv8;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    private boolean shouldIncludeKey(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }

    public JSONObject flattenJson(String str, List<String> list, List<String> list2, List<String> list3) {
        List<String> list4;
        List<String> list5;
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = this._jsonData.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (shouldIncludeKey(next, list, list3)) {
                    Object opt = this._jsonData.opt(next);
                    if (opt instanceof JSONObject) {
                        String str2 = str;
                        list4 = list2;
                        list5 = list3;
                        new JsonFlattener((JSONObject) opt).flattenJson(str2, next, jSONObject, list4, list5);
                        str = str2;
                    } else {
                        list4 = list2;
                        list5 = list3;
                        jSONObject.put(next, opt);
                    }
                    list2 = list4;
                    list3 = list5;
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            DeviceLog.error("Could not flatten JSON: %s", e.getMessage());
            return jSONObject;
        }
    }

    public JSONObject flattenJson(String str, JsonFlattenerRules jsonFlattenerRules) {
        if (jsonFlattenerRules == null) {
            return new JSONObject();
        }
        return flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public void flattenJson(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        String str3;
        JSONObject jSONObject2;
        List<String> list3;
        List<String> list4;
        Iterator<String> keys = this._jsonData.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!list2.contains(next)) {
                Object obj = this._jsonData.get(next);
                String i = list.contains(next) ? str2 : wv8.i(str2, str, next);
                if (obj instanceof JSONObject) {
                    str3 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    new JsonFlattener((JSONObject) obj).flattenJson(str3, i, jSONObject2, list3, list4);
                } else {
                    str3 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    jSONObject2.put(i, obj);
                }
                str = str3;
                jSONObject = jSONObject2;
                list = list3;
                list2 = list4;
            }
        }
    }
}
