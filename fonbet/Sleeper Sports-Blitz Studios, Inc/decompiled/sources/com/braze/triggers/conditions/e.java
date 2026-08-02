package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f803a;
    public final HashSet b = new HashSet();

    public e(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f803a = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.b.add(optJSONArray.getString(i));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (bVar instanceof com.braze.triggers.events.d) {
            com.braze.triggers.events.d dVar = (com.braze.triggers.events.d) bVar;
            if (!StringUtils.isNullOrBlank(dVar.e) && dVar.e.equals(this.f803a)) {
                return this.b.size() > 0 ? !StringUtils.isNullOrBlank(dVar.f) && this.b.contains(dVar.f) : StringUtils.isNullOrBlank(dVar.f);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f803a);
            if (this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
