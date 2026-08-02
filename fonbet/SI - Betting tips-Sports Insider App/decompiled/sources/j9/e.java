package j9;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f18301h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f18302a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f18303b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f18304c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f18305d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f18306e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18307f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f18308g;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f18303b = jSONObject;
        this.f18304c = date;
        this.f18305d = jSONArray;
        this.f18306e = jSONObject2;
        this.f18307f = j;
        this.f18308g = jSONArray2;
        this.f18302a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    public static io.sentry.instrumentation.file.b c() {
        io.sentry.instrumentation.file.b bVar = new io.sentry.instrumentation.file.b();
        bVar.f16495b = new JSONObject();
        bVar.f16496c = f18301h;
        bVar.f16497d = new JSONArray();
        bVar.f16498e = new JSONObject();
        bVar.f16494a = 0L;
        bVar.f16499f = new JSONArray();
        return bVar;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i5 = 0;
        while (true) {
            JSONArray jSONArray = this.f18308g;
            if (i5 >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f18302a.toString().equals(((e) obj).f18302a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f18302a.hashCode();
    }

    public final String toString() {
        return this.f18302a.toString();
    }
}
