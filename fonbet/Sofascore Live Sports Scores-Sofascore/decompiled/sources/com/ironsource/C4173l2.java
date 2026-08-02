package com.ironsource;

import defpackage.mz1;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4173l2 {

    @NotNull
    private final String a;

    @Nullable
    private final JSONObject b;

    @Nullable
    private final C4227o2 c;
    private final int d;

    @NotNull
    private final String e;

    public C4173l2(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C4227o2 c4227o2, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = jSONObject;
        this.c = c4227o2;
        this.d = i;
        this.e = str2;
    }

    public static /* synthetic */ C4173l2 a(C4173l2 c4173l2, String str, JSONObject jSONObject, C4227o2 c4227o2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4173l2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c4173l2.b;
        }
        if ((i2 & 4) != 0) {
            c4227o2 = c4173l2.c;
        }
        if ((i2 & 8) != 0) {
            i = c4173l2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c4173l2.e;
        }
        String str3 = str2;
        C4227o2 c4227o22 = c4227o2;
        return c4173l2.a(str, jSONObject, c4227o22, i, str3);
    }

    @Nullable
    public final JSONObject b() {
        return this.b;
    }

    @Nullable
    public final C4227o2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4173l2)) {
            return false;
        }
        C4173l2 c4173l2 = (C4173l2) obj;
        return Intrinsics.c(this.a, c4173l2.a) && Intrinsics.c(this.b, c4173l2.b) && Intrinsics.c(this.c, c4173l2.c) && this.d == c4173l2.d && Intrinsics.c(this.e, c4173l2.e);
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @Nullable
    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4227o2 c4227o2 = this.c;
        return this.e.hashCode() + wv8.a(this.d, (hashCode2 + (c4227o2 != null ? c4227o2.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.d;
    }

    @Nullable
    public final C4227o2 j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        JSONObject jSONObject = this.b;
        C4227o2 c4227o2 = this.c;
        int i = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder("AuctionResponseData(auctionId=");
        sb.append(str);
        sb.append(", auctionResponseGenericParam=");
        sb.append(jSONObject);
        sb.append(", genericNotifications=");
        sb.append(c4227o2);
        sb.append(", auctionTrial=");
        sb.append(i);
        sb.append(", auctionFallback=");
        return mz1.o(sb, str2, ")");
    }

    @NotNull
    public final C4173l2 a(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C4227o2 c4227o2, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new C4173l2(str, jSONObject, c4227o2, i, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
