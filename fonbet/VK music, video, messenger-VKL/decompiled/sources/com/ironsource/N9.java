package com.ironsource;

import org.json.JSONObject;
import xsna.epx;
import xsna.kh10;
import xsna.urd0;

/* loaded from: classes13.dex */
public final class N9 {
    private final int a;
    private final String b;
    private final JSONObject c;
    private final C4554t d;
    private final C4554t e;
    private final C4554t f;

    public N9(int i, String str, JSONObject jSONObject, C4554t c4554t, C4554t c4554t2, C4554t c4554t3) {
        this.a = i;
        this.b = str;
        this.c = jSONObject;
        this.d = c4554t;
        this.e = c4554t2;
        this.f = c4554t3;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final C4554t d() {
        return this.d;
    }

    public final C4554t e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N9)) {
            return false;
        }
        N9 n9 = (N9) obj;
        return this.a == n9.a && epx.f(this.b, n9.b) && epx.f(this.c, n9.c) && epx.f(this.d, n9.d) && epx.f(this.e, n9.e) && epx.f(this.f, n9.f);
    }

    public final C4554t f() {
        return this.f;
    }

    public final C4554t g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String i() {
        return this.b;
    }

    public final C4554t j() {
        return this.e;
    }

    public final int k() {
        return this.a;
    }

    public final C4554t l() {
        return this.f;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        JSONObject jSONObject = this.c;
        C4554t c4554t = this.d;
        C4554t c4554t2 = this.e;
        C4554t c4554t3 = this.f;
        StringBuilder a = kh10.a(i, "IronSourceAdsInitConfig(logLevel=", ", controllerUrl=", str, ", controllerConfig=");
        a.append(jSONObject);
        a.append(", bannerConfig=");
        a.append(c4554t);
        a.append(", interstitialConfig=");
        a.append(c4554t2);
        a.append(", rewardedConfig=");
        a.append(c4554t3);
        a.append(")");
        return a.toString();
    }

    public final N9 a(int i, String str, JSONObject jSONObject, C4554t c4554t, C4554t c4554t2, C4554t c4554t3) {
        return new N9(i, str, jSONObject, c4554t, c4554t2, c4554t3);
    }

    public static /* synthetic */ N9 a(N9 n9, int i, String str, JSONObject jSONObject, C4554t c4554t, C4554t c4554t2, C4554t c4554t3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n9.a;
        }
        if ((i2 & 2) != 0) {
            str = n9.b;
        }
        if ((i2 & 4) != 0) {
            jSONObject = n9.c;
        }
        if ((i2 & 8) != 0) {
            c4554t = n9.d;
        }
        if ((i2 & 16) != 0) {
            c4554t2 = n9.e;
        }
        if ((i2 & 32) != 0) {
            c4554t3 = n9.f;
        }
        C4554t c4554t4 = c4554t2;
        C4554t c4554t5 = c4554t3;
        return n9.a(i, str, jSONObject, c4554t, c4554t4, c4554t5);
    }
}
