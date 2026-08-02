package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class t7 implements s4 {
    private final List a;

    private t7(List list) {
        this.a = list;
    }

    public static t7 a(q8 q8Var, t7 t7Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        try {
            List b = t7Var != null ? t7Var.b() : new ArrayList();
            Iterator it = q8Var.a("Verification").iterator();
            while (it.hasNext()) {
                s7 a = s7.a((q8) it.next(), v7Var, lVar);
                if (a != null) {
                    b.add(a);
                }
            }
            return new t7(b);
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7) {
            return this.a.equals(((t7) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.a + "'}";
    }

    static t7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            s7 a = s7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new t7(arrayList);
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
