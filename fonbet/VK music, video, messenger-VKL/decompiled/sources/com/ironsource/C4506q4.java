package com.ironsource;

import xsna.epx;
import xsna.h5s;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4506q4 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public C4506q4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4506q4)) {
            return false;
        }
        C4506q4 c4506q4 = (C4506q4) obj;
        return epx.f(this.a, c4506q4.a) && epx.f(this.b, c4506q4.b) && epx.f(this.c, c4506q4.c) && epx.f(this.d, c4506q4.d);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return h5s.d(xe9.a("CustomAdapterSettings(customNetworkAdapterName=", str, ", customRewardedVideoAdapterName=", str2, ", customInterstitialAdapterName="), this.c, ", customBannerAdapterName=", this.d, ")");
    }

    public C4506q4(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final C4506q4 a(String str, String str2, String str3, String str4) {
        return new C4506q4(str, str2, str3, str4);
    }

    public static /* synthetic */ C4506q4 a(C4506q4 c4506q4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4506q4.a;
        }
        if ((i & 2) != 0) {
            str2 = c4506q4.b;
        }
        if ((i & 4) != 0) {
            str3 = c4506q4.c;
        }
        if ((i & 8) != 0) {
            str4 = c4506q4.d;
        }
        return c4506q4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C4506q4(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
