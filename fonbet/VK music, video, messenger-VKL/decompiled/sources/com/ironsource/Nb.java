package com.ironsource;

import com.ironsource.sdk.controller.f;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Nb {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final JSONObject c;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Nb a(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            return new Nb(jSONObject.getString(f.b.c), jSONObject.getString("command"), jSONObject.optJSONObject("params"));
        }

        private a() {
        }
    }

    public Nb(String str, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb = (Nb) obj;
        return epx.f(this.a, nb.a) && epx.f(this.b, nb.b) && epx.f(this.c, nb.c);
    }

    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
        JSONObject jSONObject = this.c;
        return a2 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        JSONObject jSONObject = this.c;
        StringBuilder a2 = xe9.a("MessageToNative(adId=", str, ", command=", str2, ", params=");
        a2.append(jSONObject);
        a2.append(")");
        return a2.toString();
    }

    public final Nb a(String str, String str2, JSONObject jSONObject) {
        return new Nb(str, str2, jSONObject);
    }

    public static /* synthetic */ Nb a(Nb nb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nb.a;
        }
        if ((i & 2) != 0) {
            str2 = nb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = nb.c;
        }
        return nb.a(str, str2, jSONObject);
    }

    public static final Nb a(String str) throws JSONException {
        return d.a(str);
    }
}
