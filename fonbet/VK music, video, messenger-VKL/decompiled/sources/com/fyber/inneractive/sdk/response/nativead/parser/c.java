package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject != null) {
            hVar.a = v.a(jSONObject, "url");
            hVar.c = v.a(jSONObject, "fallback");
            JSONArray optJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null && !optString.isEmpty() && !optString.equals("null")) {
                        hVar.b.add(optString);
                    }
                }
            }
        }
        return hVar;
    }
}
