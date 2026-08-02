package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c6 implements s2 {
    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        return t2Var instanceof d6;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
