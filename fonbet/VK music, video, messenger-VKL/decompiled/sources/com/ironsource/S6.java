package com.ironsource;

import android.content.Context;
import com.ironsource.O6;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class S6 {
    private static final String a = "adunit_data";

    public void a(String str, Object obj) {
        P6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        P6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        P6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        P6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        P6.b().c(context);
    }

    public void a(String str) {
        P6.b().b(str);
    }

    public void a(String str, Object obj, O6.a aVar) {
        try {
            String name = aVar.name();
            P6 b = P6.b();
            JSONObject optJSONObject = b.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (optJSONObject == null) {
                b.b(a, new JSONObject().put(name, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                b.b(a, optJSONObject.put(name, new JSONObject().put(str, obj)));
            } else {
                b.b(a, optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C4452n4.d().a(e);
        }
    }

    public void a(String str, O6.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            P6 b = P6.b();
            JSONObject optJSONObject2 = b.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            b.b(a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e) {
            C4452n4.d().a(e);
        }
    }
}
