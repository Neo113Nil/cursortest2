package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lb implements IPutIntoJson, l9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25727a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f25728b;

    /* renamed from: c, reason: collision with root package name */
    public final jb f25729c;

    public lb(String str, Boolean bool, jb jbVar) {
        this.f25727a = str;
        this.f25728b = bool;
        this.f25729c = jbVar;
    }

    public final boolean b() {
        return this.f25728b != null;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        jb jbVar;
        JSONObject jsonObject = getJsonObject();
        if (jsonObject.length() == 0) {
            return true;
        }
        if (this.f25728b == null && (jbVar = this.f25729c) != null) {
            return !jbVar.f25622b;
        }
        if (jsonObject.length() == 1) {
            return jsonObject.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f25727a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f25727a);
        }
        Boolean bool = this.f25728b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        jb jbVar = this.f25729c;
        if (jbVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", jbVar.f25621a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }
}
