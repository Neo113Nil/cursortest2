package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccountCpClientInfo.java */
/* loaded from: classes13.dex */
public class b extends am {
    public static b a(String str) throws JSONException {
        return new b().a(new JSONObject(str));
    }

    public b a(JSONObject jSONObject) {
        this.a = jSONObject.optString("appId", null);
        this.b = jSONObject.optString("packageName", null);
        this.c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }
}
