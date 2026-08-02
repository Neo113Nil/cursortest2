package com.ironsource;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2562na {
    private String a;
    private JSONObject b;
    private String c;
    private String d;

    public C2562na(JSONObject jSONObject) {
        this.a = jSONObject.optString(X3.g.b);
        this.b = jSONObject.optJSONObject(X3.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(X3.g.e);
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
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(X3.g.b, this.a);
            jsonObjectInit.put(X3.g.c, this.b);
            jsonObjectInit.put("success", this.c);
            jsonObjectInit.put(X3.g.e, this.d);
            return jsonObjectInit;
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jsonObjectInit;
        }
    }
}
