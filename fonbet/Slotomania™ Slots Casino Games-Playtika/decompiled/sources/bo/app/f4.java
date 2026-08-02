package bo.app;

import com.braze.support.StringUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f4 implements s2 {
    private String b;

    public f4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull(CreativeInfo.D)) {
            return;
        }
        this.b = optJSONObject.optString(CreativeInfo.D, null);
    }

    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (!(t2Var instanceof g4)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.b)) {
            return true;
        }
        g4 g4Var = (g4) t2Var;
        return !StringUtils.isNullOrBlank(g4Var.f()) && g4Var.f().equals(this.b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(CreativeInfo.D, this.b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
