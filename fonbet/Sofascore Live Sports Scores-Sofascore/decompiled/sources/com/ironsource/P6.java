package com.ironsource;

import android.content.Context;
import com.ironsource.L6;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class P6 {
    private static final String a = "adunit_data";

    public void a(@NotNull String str, @NotNull Object obj, @NotNull L6.a aVar) {
        try {
            String name = aVar.name();
            M6 b = M6.b();
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
            C4157k4.d().a(e);
        }
    }

    public void a(Map<String, Object> map) {
        M6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        M6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        M6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        M6.b().c(context);
    }

    public void a(String str) {
        M6.b().b(str);
    }

    public void a(String str, Object obj) {
        M6.b().b(str, obj);
    }

    public void a(@NotNull String str, @NotNull L6.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            M6 b = M6.b();
            JSONObject optJSONObject2 = b.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            b.b(a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e) {
            C4157k4.d().a(e);
        }
    }
}
