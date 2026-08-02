package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReadSmsInputBean.java */
/* loaded from: classes13.dex */
public class af {
    private String a;

    public af() {
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", this.a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            as.d("ReadSmsInputBean", "toJson failed", true);
            return null;
        }
    }

    public af(String str) {
        this.a = str;
    }
}
