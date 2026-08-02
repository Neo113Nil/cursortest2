package bo.app;

import com.braze.support.StringUtils;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z3 implements u9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26341a;

    public z3(JSONObject jSONObject) {
        this.f26341a = jSONObject.getJSONObject(EventKeys.DATA).getString("event_name");
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) v9Var;
        return !StringUtils.isNullOrBlank(a4Var.f25245f) && a4Var.f25245f.equals(this.f26341a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f26341a);
            jSONObject.put(EventKeys.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
