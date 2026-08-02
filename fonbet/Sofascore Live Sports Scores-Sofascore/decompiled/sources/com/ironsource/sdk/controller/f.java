package com.ironsource.sdk.controller;

import defpackage.fc6;
import defpackage.mz1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "msgId";

        @NotNull
        public static final String c = "adId";

        @NotNull
        public static final String d = "params";

        @NotNull
        public static final String e = "success";

        @NotNull
        public static final String f = "reason";

        @NotNull
        public static final String g = "command";

        private b() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final C1214a c = new C1214a(null);

        @NotNull
        private final String a;

        @Nullable
        private final JSONObject b;

        public a(@NotNull String str, @Nullable JSONObject jSONObject) {
            str.getClass();
            this.a = str;
            this.b = jSONObject;
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

        @Nullable
        public final JSONObject b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @Nullable
        public final JSONObject d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            JSONObject jSONObject = this.b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.a + ", params=" + this.b + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C1214a {
            public /* synthetic */ C1214a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@NotNull String str) throws JSONException {
                str.getClass();
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(b.b);
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                string.getClass();
                return new a(string, optJSONObject);
            }

            private C1214a() {
            }
        }

        @NotNull
        public final a a(@NotNull String str, @Nullable JSONObject jSONObject) {
            str.getClass();
            return new a(str, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public static final a a(@NotNull String str) throws JSONException {
            return c.a(str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @NotNull
        private final JSONObject c;

        @NotNull
        private String d;

        public c(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            str2.getClass();
            jSONObject.getClass();
            this.a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = fc6.C();
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

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final JSONObject c() {
            return this.c;
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        @NotNull
        public final String e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return Intrinsics.c(this.d, cVar.d) && Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c.toString(), cVar.c.toString());
        }

        @NotNull
        public final String f() {
            return this.d;
        }

        @NotNull
        public final JSONObject g() {
            return this.c;
        }

        @NotNull
        public final String h() {
            String jSONObject = new JSONObject().put(b.b, this.d).put(b.c, this.a).put("params", this.c).toString();
            jSONObject.getClass();
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.a;
            String str2 = this.b;
            JSONObject jSONObject = this.c;
            StringBuilder s = mz1.s("MessageToController(adId=", str, ", command=", str2, ", params=");
            s.append(jSONObject);
            s.append(")");
            return s.toString();
        }

        @NotNull
        public final c a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            str2.getClass();
            jSONObject.getClass();
            return new c(str, str2, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        public final void a(@NotNull String str) {
            str.getClass();
            this.d = str;
        }
    }
}
