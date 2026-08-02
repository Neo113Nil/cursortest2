package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class a8 implements s4 {
    private String a;
    private String b;

    private a8() {
    }

    public static a8 a(q8 q8Var, a8 a8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (a8Var == null) {
            try {
                a8Var = new a8();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                lVar.E().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(a8Var.a)) {
            String d = q8Var.d();
            if (StringUtils.isValidString(d)) {
                a8Var.a = d;
            }
        }
        if (!StringUtils.isValidString(a8Var.b)) {
            String str = (String) q8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                a8Var.b = str;
            }
        }
        return a8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        String str = this.a;
        if (str == null ? a8Var.a != null : !str.equals(a8Var.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = a8Var.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.a + "', version='" + this.b + "'}";
    }

    public static a8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        a8 a8Var = new a8();
        a8Var.a = JsonUtils.getString(jSONObject, "name", null);
        a8Var.b = JsonUtils.getString(jSONObject, "version", null);
        return a8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.a);
        JsonUtils.putString(jSONObject, "version", this.b);
        return jSONObject;
    }
}
