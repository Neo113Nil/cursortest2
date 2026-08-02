package com.ironsource;

import defpackage.bf3;
import defpackage.mz1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4234o9 {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final String e;

    @Nullable
    private final Boolean f;

    @Nullable
    private final JSONObject g;

    @Nullable
    private final a h;

    public /* synthetic */ C4234o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) != 0 ? null : aVar);
    }

    public static /* synthetic */ C4234o9 a(C4234o9 c4234o9, String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4234o9.a;
        }
        if ((i & 2) != 0) {
            str2 = c4234o9.b;
        }
        if ((i & 4) != 0) {
            str3 = c4234o9.c;
        }
        if ((i & 8) != 0) {
            str4 = c4234o9.d;
        }
        if ((i & 16) != 0) {
            str5 = c4234o9.e;
        }
        if ((i & 32) != 0) {
            bool = c4234o9.f;
        }
        if ((i & 64) != 0) {
            jSONObject = c4234o9.g;
        }
        if ((i & 128) != 0) {
            aVar = c4234o9.h;
        }
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        String str6 = str5;
        Boolean bool2 = bool;
        return c4234o9.a(str, str2, str3, str4, str6, bool2, jSONObject2, aVar2);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4234o9)) {
            return false;
        }
        C4234o9 c4234o9 = (C4234o9) obj;
        return Intrinsics.c(this.a, c4234o9.a) && Intrinsics.c(this.b, c4234o9.b) && Intrinsics.c(this.c, c4234o9.c) && Intrinsics.c(this.d, c4234o9.d) && Intrinsics.c(this.e, c4234o9.e) && Intrinsics.c(this.f, c4234o9.f) && Intrinsics.c(this.g, c4234o9.g) && Intrinsics.c(this.h, c4234o9.h);
    }

    @Nullable
    public final Boolean f() {
        return this.f;
    }

    @Nullable
    public final JSONObject g() {
        return this.g;
    }

    @Nullable
    public final a h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.g;
        int hashCode7 = (hashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.h;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Nullable
    public final a i() {
        return this.h;
    }

    @Nullable
    public final String j() {
        return this.a;
    }

    @Nullable
    public final JSONObject k() {
        return this.g;
    }

    @Nullable
    public final Boolean l() {
        return this.f;
    }

    @Nullable
    public final String m() {
        return this.d;
    }

    @Nullable
    public final String n() {
        return this.c;
    }

    @Nullable
    public final String o() {
        return this.b;
    }

    @Nullable
    public final String p() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        Boolean bool = this.f;
        JSONObject jSONObject = this.g;
        a aVar = this.h;
        StringBuilder s = mz1.s("InstanceProviderSettings2(adSourceName=", str, ", providerNetworkKey=", str2, ", providerLoadName=");
        bf3.v(s, str3, ", providerDefaultInstance=", str4, ", spId=");
        s.append(str5);
        s.append(", mpis=");
        s.append(bool);
        s.append(", application=");
        s.append(jSONObject);
        s.append(", adFormats=");
        s.append(aVar);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o9$a */
    public static final class a {

        @Nullable
        private final JSONObject a;

        @Nullable
        private final JSONObject b;

        @Nullable
        private final JSONObject c;

        @Nullable
        private final JSONObject d;

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }

        public static /* synthetic */ a a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject2 = aVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject3 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject4 = aVar.d;
            }
            return aVar.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        @Nullable
        public final JSONObject b() {
            return this.b;
        }

        @Nullable
        public final JSONObject c() {
            return this.c;
        }

        @Nullable
        public final JSONObject d() {
            return this.d;
        }

        @Nullable
        public final JSONObject e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d);
        }

        @Nullable
        public final JSONObject f() {
            return this.b;
        }

        @Nullable
        public final JSONObject g() {
            return this.d;
        }

        @Nullable
        public final JSONObject h() {
            return this.a;
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.b;
            int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSONObject jSONObject3 = this.c;
            int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            JSONObject jSONObject4 = this.d;
            return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
            this.a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
        }

        @NotNull
        public final a a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        @Nullable
        public final JSONObject a() {
            return this.a;
        }
    }

    public C4234o9(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = jSONObject;
        this.h = aVar;
    }

    public C4234o9() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final C4234o9 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable a aVar) {
        return new C4234o9(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
