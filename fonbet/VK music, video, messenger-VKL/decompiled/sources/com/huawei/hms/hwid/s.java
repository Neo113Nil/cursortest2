package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HuaweiIdCpClientInfo.java */
/* loaded from: classes13.dex */
public class s extends am {
    public static s a(String str) throws JSONException {
        return new s().a(new JSONObject(str));
    }

    public s a(JSONObject jSONObject) {
        this.a = jSONObject.optString("appId", null);
        this.b = jSONObject.optString("packageName", null);
        this.c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }
}
