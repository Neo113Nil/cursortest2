package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b4 extends ag {

    /* renamed from: d, reason: collision with root package name */
    public static final String f25289d = BrazeLogger.getBrazeLogTag((Class<?>) b4.class);

    /* renamed from: c, reason: collision with root package name */
    public final String f25290c;

    public b4(JSONObject jSONObject) {
        super(jSONObject);
        this.f25290c = jSONObject.getJSONObject(EventKeys.DATA).getString("event_name");
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) v9Var;
        if (StringUtils.isNullOrBlank(a4Var.f25245f) || !a4Var.f25245f.equals(this.f25290c)) {
            return false;
        }
        return this.f25256a.a(v9Var);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject b10 = super.b();
        try {
            b10.put("type", "custom_event_property");
            JSONObject jSONObject = b10.getJSONObject(EventKeys.DATA);
            jSONObject.put("event_name", this.f25290c);
            b10.put(EventKeys.DATA, jSONObject);
            return b10;
        } catch (JSONException e10) {
            BrazeLogger.e(f25289d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e10);
            return b10;
        }
    }
}
