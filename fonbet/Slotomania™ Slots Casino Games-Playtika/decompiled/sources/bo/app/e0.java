package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e0 implements s2 {
    private String b;

    public e0(JSONObject jSONObject) {
        this.b = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (!(t2Var instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) t2Var;
        return !StringUtils.isNullOrBlank(f0Var.f()) && f0Var.f().equals(this.b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.b);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
