package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class d4 extends g6 {
    private static final String e = BrazeLogger.getBrazeLogTag((Class<?>) d4.class);
    private String d;

    public d4(JSONObject jSONObject) {
        super(jSONObject);
        this.d = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // bo.app.g6, bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (!(t2Var instanceof c4) || StringUtils.isNullOrBlank(this.d)) {
            return false;
        }
        c4 c4Var = (c4) t2Var;
        if (!StringUtils.isNullOrBlank(c4Var.f()) && c4Var.f().equals(this.d)) {
            return super.a(t2Var);
        }
        return false;
    }

    @Override // bo.app.g6, com.braze.models.IPutIntoJson
    /* renamed from: e */
    public JSONObject getJsonKey() {
        JSONObject jsonKey = super.getJsonKey();
        try {
            jsonKey.put("type", "purchase_property");
            JSONObject jSONObject = jsonKey.getJSONObject("data");
            jSONObject.put("product_id", this.d);
            jsonKey.put("data", jSONObject);
            return jsonKey;
        } catch (JSONException e2) {
            BrazeLogger.e(e, "Caught exception creating Json.", e2);
            return jsonKey;
        }
    }
}
