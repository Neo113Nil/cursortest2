package com.ironsource.mediationsdk.logger;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4157k4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class b {
    private IronSourceLogger.IronSourceTag a;
    private String b;
    private String c;
    private int d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.b);
            jSONObject.put("tag", this.a);
            jSONObject.put("level", this.d);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, this.c);
            return jSONObject;
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
