package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.izs;
import xsna.zcl;

/* renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4497pd {
    public static final a b = new a(null);
    public static final String c = "placements";
    public static final String d = "placementName";
    private final JSONArray a;

    /* renamed from: com.ironsource.pd$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public C4497pd(JSONObject jSONObject) {
        this.a = jSONObject.optJSONArray(c);
    }

    public final <T> Map<String, T> a(izs<? super JSONObject, ? extends T> izsVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                linkedHashMap.put(jSONObject.optString("placementName"), izsVar.invoke(jSONObject));
            }
        }
        return linkedHashMap;
    }
}
