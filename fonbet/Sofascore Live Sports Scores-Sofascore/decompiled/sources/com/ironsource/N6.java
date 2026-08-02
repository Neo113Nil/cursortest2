package com.ironsource;

import android.content.Context;
import com.ironsource.L6;
import com.ironsource.environment.ContextProvider;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class N6 {
    private static final String a = "adunit_data";

    private JSONObject a(Context context, @NotNull L6.a aVar) throws JSONException {
        String name = aVar.name();
        JSONObject b = M6.b().b(context);
        JSONObject optJSONObject = b.optJSONObject(a);
        JSONObject a2 = a(b);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.putOpt(next, jSONObject.opt(next));
            }
        }
        return a2;
    }

    public JSONObject a(Context context, String[] strArr) throws JSONException {
        return a(a(M6.b().b(context)), strArr);
    }

    public JSONObject a(List<String> list, L6.a aVar) throws JSONException {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(Context context, List<String> list) throws JSONException {
        return a(a(M6.b().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(String[] strArr) throws JSONException {
        return a(a(M6.b().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    public JSONObject a(List<String> list) throws JSONException {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove(a);
        return jSONObject;
    }
}
