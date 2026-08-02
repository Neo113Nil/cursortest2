package bo.app;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a3 implements s2 {
    private String b;
    private Set<String> c = new HashSet();

    public a3(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.b = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.c.add(optJSONArray.getString(i));
            }
        }
    }

    @Override // bo.app.s2, bo.app.c2
    public boolean a(t2 t2Var) {
        if (t2Var instanceof b3) {
            b3 b3Var = (b3) t2Var;
            if (!StringUtils.isNullOrBlank(b3Var.g()) && b3Var.g().equals(this.b)) {
                return this.c.size() > 0 ? !StringUtils.isNullOrBlank(b3Var.f()) && this.c.contains(b3Var.f()) : StringUtils.isNullOrBlank(b3Var.f());
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.b);
            if (this.c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
