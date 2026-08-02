package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C2601pd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k8 {
    private final w2 a;
    private final c4 b;
    private final List c;

    public k8(JSONObject jSONObject, MaxAdFormat maxAdFormat, g3 g3Var, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new c4(jSONObject2, lVar);
        } else {
            this.b = null;
        }
        this.a = new w2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, g3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, C2601pd.c, new JSONArray());
        this.c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new c4(jSONObject3, lVar));
            }
        }
    }

    public c4 a() {
        return this.b;
    }

    public w2 b() {
        return this.a;
    }

    public List c() {
        return this.c;
    }

    public boolean d() {
        return this.b != null;
    }
}
