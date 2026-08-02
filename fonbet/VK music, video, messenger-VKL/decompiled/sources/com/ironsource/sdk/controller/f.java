package com.ironsource.sdk.controller;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface f {

    public static final class a {
        public static final C0232a c = new C0232a(null);
        private final String a;
        private final JSONObject b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0232a {
            public /* synthetic */ C0232a(zcl zclVar) {
                this();
            }

            public final a a(String str) throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString(b.b), jSONObject.optJSONObject("params"));
            }

            private C0232a() {
            }
        }

        public a(String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        public final String a() {
            return this.a;
        }

        public final JSONObject b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final JSONObject d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            JSONObject jSONObject = this.b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.a + ", params=" + this.b + ")";
        }

        public final a a(String str, JSONObject jSONObject) {
            return new a(str, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return c.a(str);
        }
    }

    public static final class b {
        public static final b a = new b();
        public static final String b = "msgId";
        public static final String c = "adId";
        public static final String d = "params";
        public static final String e = "success";
        public static final String f = "reason";
        public static final String g = "command";

        private b() {
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final JSONObject c;
        private String d = UUID.randomUUID().toString();

        public c(String str, String str2, JSONObject jSONObject) {
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
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return epx.f(this.d, cVar.d) && epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c.toString(), cVar.c.toString());
        }

        public final String f() {
            return this.d;
        }

        public final JSONObject g() {
            return this.c;
        }

        public final String h() {
            return new JSONObject().put(b.b, this.d).put(b.c, this.a).put("params", this.c).toString();
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            JSONObject jSONObject = this.c;
            StringBuilder a = xe9.a("MessageToController(adId=", str, ", command=", str2, ", params=");
            a.append(jSONObject);
            a.append(")");
            return a.toString();
        }

        public final c a(String str, String str2, JSONObject jSONObject) {
            return new c(str, str2, jSONObject);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(String str) {
            this.d = str;
        }
    }
}
