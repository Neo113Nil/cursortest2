package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class g6 implements s2 {
    private static final String c = BrazeLogger.getBrazeLogTag((Class<?>) g6.class);
    c b;

    public g6(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new z3(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new v3(arrayList2));
        }
        this.b = new c(arrayList);
    }

    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        return this.b.a(t2Var);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.b.getJsonObject());
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.e(c, "Caught exception creating Json.", e);
            return jSONObject;
        }
    }
}
