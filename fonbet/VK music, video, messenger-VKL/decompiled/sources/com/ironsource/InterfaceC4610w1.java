package com.ironsource;

import com.ironsource.C4492p8;
import com.ironsource.X3;
import org.json.JSONObject;
import xsna.epx;
import xsna.go9;
import xsna.i5s;
import xsna.rzl;
import xsna.shy;
import xsna.sl9;
import xsna.urd0;
import xsna.xe9;

/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4610w1 {
    public static final b a = b.a;

    /* renamed from: com.ironsource.w1$a */
    public interface a extends InterfaceC4610w1 {

        /* renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        public static final class C0237a implements a {
            private final String b;
            private final String c;
            private final C4492p8.e d;
            private final String e;
            private final String f;
            private final C0238a g;
            private final int h;
            private final int i;

            /* renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            public static final class C0238a {
                private final int a;
                private final int b;

                public C0238a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0238a)) {
                        return false;
                    }
                    C0238a c0238a = (C0238a) obj;
                    return this.a == c0238a.a && this.b == c0238a.b;
                }

                public int hashCode() {
                    return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
                }

                public String toString() {
                    return sl9.c(this.a, this.b, "Coordinates(x=", ", y=", ")");
                }

                public final C0238a a(int i, int i2) {
                    return new C0238a(i, i2);
                }

                public static /* synthetic */ C0238a a(C0238a c0238a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c0238a.a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c0238a.b;
                    }
                    return c0238a.a(i, i2);
                }
            }

            public C0237a(String str, String str2, C4492p8.e eVar, String str3, String str4, C0238a c0238a, int i, int i2) {
                this.b = str;
                this.c = str2;
                this.d = eVar;
                this.e = str3;
                this.f = str4;
                this.g = c0238a;
                this.h = i;
                this.i = i2;
            }

            public final C0237a a(String str, String str2, C4492p8.e eVar, String str3, String str4, C0238a c0238a, int i, int i2) {
                return new C0237a(str, str2, eVar, str3, str4, c0238a, i, i2);
            }

            @Override // com.ironsource.InterfaceC4610w1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public C4492p8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0237a)) {
                    return false;
                }
                C0237a c0237a = (C0237a) obj;
                return epx.f(this.b, c0237a.b) && epx.f(this.c, c0237a.c) && this.d == c0237a.d && epx.f(this.e, c0237a.e) && epx.f(this.f, c0237a.f) && epx.f(this.g, c0237a.g) && this.h == c0237a.h && this.i == c0237a.i;
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C4492p8.e h() {
                return this.d;
            }

            public int hashCode() {
                return Integer.hashCode(this.i) + shy.a(this.h, (this.g.hashCode() + urd0.a(urd0.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31, 31);
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public final C0238a k() {
                return this.g;
            }

            public final int l() {
                return this.h;
            }

            public final int m() {
                return this.i;
            }

            public final int n() {
                return this.h;
            }

            public final C0238a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            public String toString() {
                String str = this.b;
                String str2 = this.c;
                C4492p8.e eVar = this.d;
                String str3 = this.e;
                String str4 = this.f;
                C0238a c0238a = this.g;
                int i = this.h;
                int i2 = this.i;
                StringBuilder a = xe9.a("Click(successCallback=", str, ", failCallback=", str2, ", productType=");
                a.append(eVar);
                a.append(", demandSourceName=");
                a.append(str3);
                a.append(", url=");
                a.append(str4);
                a.append(", coordinates=");
                a.append(c0238a);
                a.append(", action=");
                return rzl.a(i, i2, ", metaState=", ")", a);
            }

            public static /* synthetic */ C0237a a(C0237a c0237a, String str, String str2, C4492p8.e eVar, String str3, String str4, C0238a c0238a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c0237a.b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c0237a.c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c0237a.d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c0237a.e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c0237a.f;
                }
                if ((i3 & 32) != 0) {
                    c0238a = c0237a.g;
                }
                if ((i3 & 64) != 0) {
                    i = c0237a.h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c0237a.i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C0238a c0238a2 = c0238a;
                return c0237a.a(str, str2, eVar, str3, str5, c0238a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String a() {
                return this.b;
            }
        }

        /* renamed from: com.ironsource.w1$a$b */
        public static final class b implements a {
            private final String b;
            private final String c;
            private final C4492p8.e d;
            private final String e;
            private final String f;

            public b(String str, String str2, C4492p8.e eVar, String str3, String str4) {
                this.b = str;
                this.c = str2;
                this.d = eVar;
                this.e = str3;
                this.f = str4;
            }

            public final b a(String str, String str2, C4492p8.e eVar, String str3, String str4) {
                return new b(str, str2, eVar, str3, str4);
            }

            @Override // com.ironsource.InterfaceC4610w1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public C4492p8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C4492p8.e h() {
                return this.d;
            }

            public int hashCode() {
                return this.f.hashCode() + urd0.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public String toString() {
                String str = this.b;
                String str2 = this.c;
                C4492p8.e eVar = this.d;
                String str3 = this.e;
                String str4 = this.f;
                StringBuilder a = xe9.a("Impression(successCallback=", str, ", failCallback=", str2, ", productType=");
                a.append(eVar);
                a.append(", demandSourceName=");
                a.append(str3);
                a.append(", url=");
                return i5s.a(a, str4, ")");
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4492p8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                String str5 = str4;
                C4492p8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC4610w1
            public String a() {
                return this.b;
            }
        }

        String b();
    }

    static InterfaceC4610w1 a(String str) {
        return a.a(str);
    }

    String a();

    String c();

    C4492p8.e d();

    String e();

    /* renamed from: com.ironsource.w1$b */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final InterfaceC4610w1 a(String str) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type", "none");
            if (epx.f(optString, Y3.c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException(go9.b("unsupported message type: ", optString));
        }

        private final a a(JSONObject jSONObject) {
            String string = jSONObject.getString("success");
            String string2 = jSONObject.getString(X3.g.e);
            String string3 = jSONObject.getString("demandSourceName");
            C4492p8.e valueOf = C4492p8.e.valueOf(jSONObject.getString(X3.i.m));
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String string4 = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (epx.f(optString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Y3.f);
                int i = jSONObject3.getInt(Y3.g);
                int i2 = jSONObject3.getInt(Y3.h);
                return new a.C0237a(string, string2, valueOf, string3, string4, new a.C0237a.C0238a(i, i2), jSONObject2.optInt("action", 0), jSONObject2.optInt(Y3.j, 0));
            }
            if (epx.f(optString, "impression")) {
                return new a.b(string, string2, valueOf, string3, string4);
            }
            throw new IllegalArgumentException(go9.b("JSON does not contain valid type: ", jSONObject2.optString("type")));
        }
    }
}
