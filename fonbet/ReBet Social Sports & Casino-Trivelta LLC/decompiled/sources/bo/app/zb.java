package bo.app;

import com.braze.support.StringUtils;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zb implements u9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26355a;

    public zb(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(EventKeys.DATA);
        if (optJSONObject == null || optJSONObject.isNull("campaign_id")) {
            return;
        }
        this.f26355a = optJSONObject.optString("campaign_id", null);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof ac)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f26355a)) {
            return true;
        }
        ac acVar = (ac) v9Var;
        return !StringUtils.isNullOrBlank(acVar.f25251e) && acVar.f25251e.equals(this.f26355a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f26355a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f26355a);
                jSONObject.putOpt(EventKeys.DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
