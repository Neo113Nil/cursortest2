package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fi3 {
    public static final Date h = new Date(0);
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;

    public fi3(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }

    public static fi3 a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new fi3(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    public static ei3 d() {
        ei3 ei3Var = new ei3();
        ei3Var.b = new JSONObject();
        ei3Var.d = h;
        ei3Var.e = new JSONArray();
        ei3Var.c = new JSONObject();
        ei3Var.a = 0L;
        ei3Var.f = new JSONArray();
        return ei3Var;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.d;
            if (i >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    hashMap.put(jSONArray2.getString(i2), jSONObject);
                }
            }
            i++;
        }
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fi3) {
            return this.a.toString().equals(((fi3) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
