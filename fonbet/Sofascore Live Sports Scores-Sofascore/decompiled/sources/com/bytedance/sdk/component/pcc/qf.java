package com.bytedance.sdk.component.pcc;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class qf {
    private ork pcc;

    private qf(ork orkVar) {
        this.pcc = orkVar;
    }

    public <T> T pcc(String str, Type type) throws JSONException {
        pcc(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.pcc.pcc(str, type);
    }

    public static qf pcc(ork orkVar) {
        return new qf(orkVar);
    }

    public <T> String pcc(T t) {
        String obj;
        if (t == null) {
            return "{}";
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            obj = this.pcc.pcc(t);
        } else {
            obj = t.toString();
        }
        pcc(obj);
        return obj;
    }

    private static void pcc(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        kj.pcc(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
