package defpackage;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e6a {
    public String a;
    public c6a b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public final boolean a() {
        String str = this.f;
        Long l = this.g;
        c6a c6aVar = this.b;
        int i = c6aVar == null ? -1 : d6a.a[c6aVar.ordinal()];
        return i != 1 ? i != 2 ? ((i != 3 && i != 4 && i != 5) || str == null || l == null) ? false : true : (str == null || this.e == null || l == null) ? false : true : (this.c == null || l == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            f6a.O(this.a, toString());
        }
    }

    public final String toString() {
        Long l = this.g;
        c6a c6aVar = this.b;
        int i = c6aVar == null ? -1 : d6a.a[c6aVar.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put(Payload.DEVICE_MODEL, Build.MODEL);
                String str = this.d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (c6aVar != null) {
                    jSONObject3.put("type", c6aVar);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String jSONObject4 = new JSONObject().toString();
            jSONObject4.getClass();
            return jSONObject4;
        }
        String jSONObject5 = jSONObject.toString();
        jSONObject5.getClass();
        return jSONObject5;
    }
}
