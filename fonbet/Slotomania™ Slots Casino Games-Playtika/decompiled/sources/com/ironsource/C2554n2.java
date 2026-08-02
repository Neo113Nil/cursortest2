package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2554n2 {
    private final String a;
    private final JSONObject b;
    private final C2608q2 c;
    private final int d;
    private final String e;

    public C2554n2(String auctionId, JSONObject jSONObject, C2608q2 c2608q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.a = auctionId;
        this.b = jSONObject;
        this.c = c2608q2;
        this.d = i;
        this.e = auctionFallback;
    }

    public final String a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final C2608q2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2554n2)) {
            return false;
        }
        C2554n2 c2554n2 = (C2554n2) obj;
        return Intrinsics.areEqual(this.a, c2554n2.a) && Intrinsics.areEqual(this.b, c2554n2.b) && Intrinsics.areEqual(this.c, c2554n2.c) && this.d == c2554n2.d && Intrinsics.areEqual(this.e, c2554n2.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C2608q2 c2608q2 = this.c;
        return ((((hashCode2 + (c2608q2 != null ? c2608q2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C2608q2 j() {
        return this.c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    public final C2554n2 a(String auctionId, JSONObject jSONObject, C2608q2 c2608q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C2554n2(auctionId, jSONObject, c2608q2, i, auctionFallback);
    }

    public static /* synthetic */ C2554n2 a(C2554n2 c2554n2, String str, JSONObject jSONObject, C2608q2 c2608q2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c2554n2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c2554n2.b;
        }
        if ((i2 & 4) != 0) {
            c2608q2 = c2554n2.c;
        }
        if ((i2 & 8) != 0) {
            i = c2554n2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c2554n2.e;
        }
        String str3 = str2;
        C2608q2 c2608q22 = c2608q2;
        return c2554n2.a(str, jSONObject, c2608q22, i, str3);
    }
}
