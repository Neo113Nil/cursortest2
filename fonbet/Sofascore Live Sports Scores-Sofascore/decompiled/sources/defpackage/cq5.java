package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cq5 {
    public String a;
    public String b;
    public Long c;

    public cq5(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = valueOf;
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(valueOf.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        this.a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }
}
