package bo.app;

import com.braze.support.StringUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ea implements u9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25429a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f25430b = new HashSet();

    public ea(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(EventKeys.DATA);
        this.f25429a = jSONObject2.getString(StackTraceHelper.ID_KEY);
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                this.f25430b.add(optJSONArray.getString(i10));
            }
        }
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        if (v9Var instanceof fa) {
            fa faVar = (fa) v9Var;
            if (!StringUtils.isNullOrBlank(faVar.f25456e) && faVar.f25456e.equals(this.f25429a)) {
                return this.f25430b.size() > 0 ? !StringUtils.isNullOrBlank(faVar.f25457f) && this.f25430b.contains(faVar.f25457f) : StringUtils.isNullOrBlank(faVar.f25457f);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StackTraceHelper.ID_KEY, this.f25429a);
            if (this.f25430b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f25430b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put(EventKeys.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
