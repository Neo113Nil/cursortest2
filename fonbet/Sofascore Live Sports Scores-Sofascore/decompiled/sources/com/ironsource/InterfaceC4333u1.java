package com.ironsource;

import com.ironsource.C4197m8;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.me4;
import defpackage.mz1;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4333u1 {

    @NotNull
    public static final b a = b.a;

    @NotNull
    static InterfaceC4333u1 a(@NotNull String str) {
        return a.a(str);
    }

    @NotNull
    String a();

    @NotNull
    String c();

    @NotNull
    C4197m8.e d();

    @NotNull
    String e();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u1$a */
    public interface a extends InterfaceC4333u1 {
        @NotNull
        String b();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public static final class C1219a implements a {

            @NotNull
            private final String b;

            @NotNull
            private final String c;

            @NotNull
            private final C4197m8.e d;

            @NotNull
            private final String e;

            @NotNull
            private final String f;

            @NotNull
            private final C1220a g;
            private final int h;
            private final int i;

            public C1219a(@NotNull String str, @NotNull String str2, @NotNull C4197m8.e eVar, @NotNull String str3, @NotNull String str4, @NotNull C1220a c1220a, int i, int i2) {
                str.getClass();
                str2.getClass();
                eVar.getClass();
                str3.getClass();
                str4.getClass();
                c1220a.getClass();
                this.b = str;
                this.c = str2;
                this.d = eVar;
                this.e = str3;
                this.f = str4;
                this.g = c1220a;
                this.h = i;
                this.i = i2;
            }

            public static /* synthetic */ C1219a a(C1219a c1219a, String str, String str2, C4197m8.e eVar, String str3, String str4, C1220a c1220a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c1219a.b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c1219a.c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c1219a.d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c1219a.e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c1219a.f;
                }
                if ((i3 & 32) != 0) {
                    c1220a = c1219a.g;
                }
                if ((i3 & 64) != 0) {
                    i = c1219a.h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c1219a.i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C1220a c1220a2 = c1220a;
                return c1219a.a(str, str2, eVar, str3, str5, c1220a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC4333u1.a
            @NotNull
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public C4197m8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1219a)) {
                    return false;
                }
                C1219a c1219a = (C1219a) obj;
                return Intrinsics.c(this.b, c1219a.b) && Intrinsics.c(this.c, c1219a.c) && this.d == c1219a.d && Intrinsics.c(this.e, c1219a.e) && Intrinsics.c(this.f, c1219a.f) && Intrinsics.c(this.g, c1219a.g) && this.h == c1219a.h && this.i == c1219a.i;
            }

            @NotNull
            public final String f() {
                return this.b;
            }

            @NotNull
            public final String g() {
                return this.c;
            }

            @NotNull
            public final C4197m8.e h() {
                return this.d;
            }

            public int hashCode() {
                return Integer.hashCode(this.i) + wv8.a(this.h, (this.g.hashCode() + dmi.c(dmi.c((this.d.hashCode() + dmi.c(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31, 31);
            }

            @NotNull
            public final String i() {
                return this.e;
            }

            @NotNull
            public final String j() {
                return this.f;
            }

            @NotNull
            public final C1220a k() {
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

            @NotNull
            public final C1220a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            @NotNull
            public String toString() {
                String str = this.b;
                String str2 = this.c;
                C4197m8.e eVar = this.d;
                String str3 = this.e;
                String str4 = this.f;
                C1220a c1220a = this.g;
                int i = this.h;
                int i2 = this.i;
                StringBuilder s = mz1.s("Click(successCallback=", str, ", failCallback=", str2, ", productType=");
                s.append(eVar);
                s.append(", demandSourceName=");
                s.append(str3);
                s.append(", url=");
                s.append(str4);
                s.append(", coordinates=");
                s.append(c1220a);
                s.append(", action=");
                return me4.i(s, i, ", metaState=", i2, ")");
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.ironsource.u1$a$a$a, reason: collision with other inner class name */
            public static final class C1220a {
                private final int a;
                private final int b;

                public C1220a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public static /* synthetic */ C1220a a(C1220a c1220a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c1220a.a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c1220a.b;
                    }
                    return c1220a.a(i, i2);
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

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1220a)) {
                        return false;
                    }
                    C1220a c1220a = (C1220a) obj;
                    return this.a == c1220a.a && this.b == c1220a.b;
                }

                public int hashCode() {
                    return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
                }

                @NotNull
                public String toString() {
                    return lnb.j(this.a, this.b, "Coordinates(x=", ", y=", ")");
                }

                @NotNull
                public final C1220a a(int i, int i2) {
                    return new C1220a(i, i2);
                }

                public final int a() {
                    return this.a;
                }
            }

            @NotNull
            public final C1219a a(@NotNull String str, @NotNull String str2, @NotNull C4197m8.e eVar, @NotNull String str3, @NotNull String str4, @NotNull C1220a c1220a, int i, int i2) {
                str.getClass();
                str2.getClass();
                eVar.getClass();
                str3.getClass();
                str4.getClass();
                c1220a.getClass();
                return new C1219a(str, str2, eVar, str3, str4, c1220a, i, i2);
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String a() {
                return this.b;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.u1$a$b */
        public static final class b implements a {

            @NotNull
            private final String b;

            @NotNull
            private final String c;

            @NotNull
            private final C4197m8.e d;

            @NotNull
            private final String e;

            @NotNull
            private final String f;

            public b(@NotNull String str, @NotNull String str2, @NotNull C4197m8.e eVar, @NotNull String str3, @NotNull String str4) {
                str.getClass();
                str2.getClass();
                eVar.getClass();
                str3.getClass();
                str4.getClass();
                this.b = str;
                this.c = str2;
                this.d = eVar;
                this.e = str3;
                this.f = str4;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4197m8.e eVar, String str3, String str4, int i, Object obj) {
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
                C4197m8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC4333u1.a
            @NotNull
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public C4197m8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && this.d == bVar.d && Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f);
            }

            @NotNull
            public final String f() {
                return this.b;
            }

            @NotNull
            public final String g() {
                return this.c;
            }

            @NotNull
            public final C4197m8.e h() {
                return this.d;
            }

            public int hashCode() {
                return this.f.hashCode() + dmi.c((this.d.hashCode() + dmi.c(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
            }

            @NotNull
            public final String i() {
                return this.e;
            }

            @NotNull
            public final String j() {
                return this.f;
            }

            @NotNull
            public String toString() {
                String str = this.b;
                String str2 = this.c;
                C4197m8.e eVar = this.d;
                String str3 = this.e;
                String str4 = this.f;
                StringBuilder s = mz1.s("Impression(successCallback=", str, ", failCallback=", str2, ", productType=");
                s.append(eVar);
                s.append(", demandSourceName=");
                s.append(str3);
                s.append(", url=");
                return mz1.o(s, str4, ")");
            }

            @NotNull
            public final b a(@NotNull String str, @NotNull String str2, @NotNull C4197m8.e eVar, @NotNull String str3, @NotNull String str4) {
                str.getClass();
                str2.getClass();
                eVar.getClass();
                str3.getClass();
                str4.getClass();
                return new b(str, str2, eVar, str3, str4);
            }

            @Override // com.ironsource.InterfaceC4333u1
            @NotNull
            public String a() {
                return this.b;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u1$b */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        private final a a(JSONObject jSONObject) {
            String string = jSONObject.getString("success");
            String string2 = jSONObject.getString(U3.g.e);
            String string3 = jSONObject.getString("demandSourceName");
            String string4 = jSONObject.getString(U3.i.m);
            string4.getClass();
            C4197m8.e valueOf = C4197m8.e.valueOf(string4);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String string5 = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (!Intrinsics.c(optString, "click")) {
                if (!Intrinsics.c(optString, "impression")) {
                    a70.p(dmi.q("JSON does not contain valid type: ", jSONObject2.optString("type")));
                    return null;
                }
                string.getClass();
                string2.getClass();
                string3.getClass();
                string5.getClass();
                return new a.b(string, string2, valueOf, string3, string5);
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(V3.f);
            int i = jSONObject3.getInt(V3.g);
            int i2 = jSONObject3.getInt(V3.h);
            int optInt = jSONObject2.optInt("action", 0);
            int optInt2 = jSONObject2.optInt(V3.j, 0);
            string.getClass();
            string2.getClass();
            string3.getClass();
            string5.getClass();
            return new a.C1219a(string, string2, valueOf, string3, string5, new a.C1219a.C1220a(i, i2), optInt, optInt2);
        }

        @NotNull
        public final InterfaceC4333u1 a(@NotNull String str) {
            str.getClass();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type", "none");
            if (Intrinsics.c(optString, V3.c)) {
                return a(jSONObject);
            }
            a70.p(dmi.q("unsupported message type: ", optString));
            return null;
        }
    }
}
