package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class i extends l {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);
    public final String c;

    public i(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f) || StringUtils.isNullOrBlank(this.c)) {
            return false;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        if (!StringUtils.isNullOrBlank(fVar.f) && fVar.f.equals(this.c)) {
            return this.f807a.a(bVar);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject c = super.c();
        try {
            c.put("type", "purchase_property");
            JSONObject jSONObject = c.getJSONObject("data");
            jSONObject.put("product_id", this.c);
            c.put("data", jSONObject);
            return c;
        } catch (JSONException e) {
            BrazeLogger.e(d, "Caught exception creating Json.", e);
            return c;
        }
    }
}
