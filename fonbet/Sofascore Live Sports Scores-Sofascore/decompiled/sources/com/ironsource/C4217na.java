package com.ironsource;

import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4217na {
    private String a;
    private JSONObject b;
    private String c;
    private String d;

    public C4217na(JSONObject jSONObject) {
        this.a = jSONObject.optString(U3.g.b);
        this.b = jSONObject.optJSONObject(U3.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(U3.g.e);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(U3.g.b, this.a);
            jSONObject.put(U3.g.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(U3.g.e, this.d);
            return jSONObject;
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
