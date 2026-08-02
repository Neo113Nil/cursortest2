package com.ironsource;

import org.json.JSONObject;
import xsna.epx;
import xsna.i5s;
import xsna.shy;

/* renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4450n2 {
    private final String a;
    private final JSONObject b;
    private final C4504q2 c;
    private final int d;
    private final String e;

    public C4450n2(String str, JSONObject jSONObject, C4504q2 c4504q2, int i, String str2) {
        this.a = str;
        this.b = jSONObject;
        this.c = c4504q2;
        this.d = i;
        this.e = str2;
    }

    public final String a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final C4504q2 c() {
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
        if (!(obj instanceof C4450n2)) {
            return false;
        }
        C4450n2 c4450n2 = (C4450n2) obj;
        return epx.f(this.a, c4450n2.a) && epx.f(this.b, c4450n2.b) && epx.f(this.c, c4450n2.c) && this.d == c4450n2.d && epx.f(this.e, c4450n2.e);
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
        C4504q2 c4504q2 = this.c;
        return this.e.hashCode() + shy.a(this.d, (hashCode2 + (c4504q2 != null ? c4504q2.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.d;
    }

    public final C4504q2 j() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        JSONObject jSONObject = this.b;
        C4504q2 c4504q2 = this.c;
        int i = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder("AuctionResponseData(auctionId=");
        sb.append(str);
        sb.append(", auctionResponseGenericParam=");
        sb.append(jSONObject);
        sb.append(", genericNotifications=");
        sb.append(c4504q2);
        sb.append(", auctionTrial=");
        sb.append(i);
        sb.append(", auctionFallback=");
        return i5s.a(sb, str2, ")");
    }

    public final C4450n2 a(String str, JSONObject jSONObject, C4504q2 c4504q2, int i, String str2) {
        return new C4450n2(str, jSONObject, c4504q2, i, str2);
    }

    public static /* synthetic */ C4450n2 a(C4450n2 c4450n2, String str, JSONObject jSONObject, C4504q2 c4504q2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4450n2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c4450n2.b;
        }
        if ((i2 & 4) != 0) {
            c4504q2 = c4450n2.c;
        }
        if ((i2 & 8) != 0) {
            i = c4450n2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c4450n2.e;
        }
        String str3 = str2;
        C4504q2 c4504q22 = c4504q2;
        return c4450n2.a(str, jSONObject, c4504q22, i, str3);
    }
}
