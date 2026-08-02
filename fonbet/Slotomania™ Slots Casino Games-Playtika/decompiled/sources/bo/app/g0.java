package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class g0 extends g6 {
    private static final String e = BrazeLogger.getBrazeLogTag((Class<?>) g0.class);
    private String d;

    public g0(JSONObject jSONObject) {
        super(jSONObject);
        this.d = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.g6, bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (!(t2Var instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) t2Var;
        if (StringUtils.isNullOrBlank(f0Var.f()) || !f0Var.f().equals(this.d)) {
            return false;
        }
        return super.a(t2Var);
    }

    @Override // bo.app.g6, com.braze.models.IPutIntoJson
    /* renamed from: e */
    public JSONObject getJsonKey() {
        JSONObject jsonKey = super.getJsonKey();
        try {
            jsonKey.put("type", "custom_event_property");
            JSONObject jSONObject = jsonKey.getJSONObject("data");
            jSONObject.put("event_name", this.d);
            jsonKey.put("data", jSONObject);
            return jsonKey;
        } catch (JSONException e2) {
            BrazeLogger.e(e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
            return jsonKey;
        }
    }
}
