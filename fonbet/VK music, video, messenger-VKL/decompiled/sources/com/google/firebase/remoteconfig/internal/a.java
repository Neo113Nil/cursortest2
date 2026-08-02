package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes13.dex */
public final class a {
    public static final Date f = new Date(0);
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;

    /* compiled from: ConfigContainer.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public static class C0144a {
        public JSONObject a;
        public Date b;
        public JSONArray c;
        public JSONObject d;

        public final a a() throws JSONException {
            return new a(this.a, this.b, this.c, this.d);
        }

        public final void b(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
        }

        public final void c(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
        }

        public final void d(Date date) {
            this.b = date;
        }

        public final void e(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
        }
    }

    public a(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.a = jSONObject3;
    }

    public static a a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new a(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static C0144a d() {
        C0144a c0144a = new C0144a();
        c0144a.a = new JSONObject();
        c0144a.b = f;
        c0144a.c = new JSONArray();
        c0144a.d = new JSONObject();
        return c0144a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a.toString().equals(((a) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
