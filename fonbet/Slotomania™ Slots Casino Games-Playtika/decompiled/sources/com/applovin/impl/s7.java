package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.sentry.protocol.Gpu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class s7 implements s4 {
    private final String a;
    private final List b;
    private final String c;
    private final Set d;

    private s7(String str, List list, String str2, Set set) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static s7 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        try {
            String str = (String) q8Var.a().get("vendor");
            q8 b = q8Var.b("VerificationParameters");
            String d = b != null ? b.d() : null;
            List a = q8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                y7 a2 = y7.a((q8) it.next(), lVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            HashMap hashMap = new HashMap();
            d8.a(q8Var, hashMap, v7Var, lVar);
            return new s7(str, arrayList, d, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerification", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.d;
    }

    public List c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s7 s7Var = (s7) obj;
            String str = this.a;
            if (str == null ? s7Var.a != null : !str.equals(s7Var.a)) {
                return false;
            }
            List list = this.b;
            if (list == null ? s7Var.b != null : !list.equals(s7Var.b)) {
                return false;
            }
            String str2 = this.c;
            if (str2 == null ? s7Var.c != null : !str2.equals(s7Var.c)) {
                return false;
            }
            Set set = this.d;
            Set set2 = s7Var.d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + "'}";
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, Gpu.JsonKeys.VENDOR_ID, null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            y7 a = y7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            b8 a2 = b8.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), lVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return new s7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, Gpu.JsonKeys.VENDOR_ID, this.a);
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.c);
        if (this.d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
