package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y7 implements s4 {
    private final String a;
    private final String b;

    private y7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static y7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new y7((String) q8Var.a().get("apiFramework"), q8Var.d());
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            lVar.E().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y7 y7Var = (y7) obj;
            String str = this.a;
            if (str == null ? y7Var.a != null : !str.equals(y7Var.a)) {
                return false;
            }
            String str2 = this.b;
            String str3 = y7Var.b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.a + "', javascriptResourceUrl='" + this.b + "'}";
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        return new y7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.b);
        return jSONObject;
    }
}
