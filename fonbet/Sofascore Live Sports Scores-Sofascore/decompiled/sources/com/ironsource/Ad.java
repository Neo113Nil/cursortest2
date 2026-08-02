package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ad {

    @Nullable
    private final JSONObject a;

    @Nullable
    private final JSONObject b;

    @Nullable
    private final JSONObject c;

    @Nullable
    private final JSONObject d;

    public /* synthetic */ Ad(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
    }

    public static /* synthetic */ Ad a(Ad ad, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = ad.a;
        }
        if ((i & 2) != 0) {
            jSONObject2 = ad.b;
        }
        if ((i & 4) != 0) {
            jSONObject3 = ad.c;
        }
        if ((i & 8) != 0) {
            jSONObject4 = ad.d;
        }
        return ad.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
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
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        return Intrinsics.c(this.a, ad.a) && Intrinsics.c(this.b, ad.b) && Intrinsics.c(this.c, ad.c) && Intrinsics.c(this.d, ad.d);
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
        return "ProviderConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    public Ad(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        this.a = jSONObject;
        this.b = jSONObject2;
        this.c = jSONObject3;
        this.d = jSONObject4;
    }

    @NotNull
    public final Ad a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        return new Ad(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public Ad() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final JSONObject a() {
        return this.a;
    }
}
