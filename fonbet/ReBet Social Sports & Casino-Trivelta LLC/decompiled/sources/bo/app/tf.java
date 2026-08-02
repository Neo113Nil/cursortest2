package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tf implements u9 {
    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        return v9Var instanceof uf;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
