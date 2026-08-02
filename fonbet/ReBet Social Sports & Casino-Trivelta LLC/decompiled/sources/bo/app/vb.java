package bo.app;

import com.braze.support.StringUtils;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vb implements u9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26143a;

    public vb(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(EventKeys.DATA);
        if (optJSONObject == null || optJSONObject.isNull("product_id")) {
            return;
        }
        this.f26143a = optJSONObject.optString("product_id", null);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof wb)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f26143a)) {
            return true;
        }
        wb wbVar = (wb) v9Var;
        return !StringUtils.isNullOrBlank(wbVar.f26200f) && wbVar.f26200f.equals(this.f26143a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f26143a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f26143a);
                jSONObject.putOpt(EventKeys.DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
