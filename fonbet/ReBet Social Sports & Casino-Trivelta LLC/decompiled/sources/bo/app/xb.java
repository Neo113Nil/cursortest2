package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xb extends ag {

    /* renamed from: d, reason: collision with root package name */
    public static final String f26267d = BrazeLogger.getBrazeLogTag((Class<?>) xb.class);

    /* renamed from: c, reason: collision with root package name */
    public final String f26268c;

    public xb(JSONObject jSONObject) {
        super(jSONObject);
        this.f26268c = jSONObject.getJSONObject(EventKeys.DATA).getString("product_id");
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (!(v9Var instanceof wb) || StringUtils.isNullOrBlank(this.f26268c)) {
            return false;
        }
        wb wbVar = (wb) v9Var;
        if (!StringUtils.isNullOrBlank(wbVar.f26200f) && wbVar.f26200f.equals(this.f26268c)) {
            return this.f25256a.a(v9Var);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject b10 = super.b();
        try {
            b10.put("type", "purchase_property");
            JSONObject jSONObject = b10.getJSONObject(EventKeys.DATA);
            jSONObject.put("product_id", this.f26268c);
            b10.put(EventKeys.DATA, jSONObject);
            return b10;
        } catch (JSONException e10) {
            BrazeLogger.e(f26267d, "Caught exception creating Json.", e10);
            return b10;
        }
    }
}
