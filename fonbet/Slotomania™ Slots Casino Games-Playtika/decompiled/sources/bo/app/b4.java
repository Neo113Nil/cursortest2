package bo.app;

import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b4 implements s2 {
    String b;

    public b4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull("product_id")) {
            return;
        }
        this.b = optJSONObject.optString("product_id", null);
    }

    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (!(t2Var instanceof c4)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.b)) {
            return true;
        }
        c4 c4Var = (c4) t2Var;
        return !StringUtils.isNullOrBlank(c4Var.f()) && c4Var.f().equals(this.b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", FirebaseAnalytics.Event.PURCHASE);
            if (this.b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
