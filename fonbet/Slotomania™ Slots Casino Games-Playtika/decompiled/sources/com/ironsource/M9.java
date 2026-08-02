package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class M9 {
    private final int a;
    private final String b;
    private final JSONObject c;
    private final C2658t d;
    private final C2658t e;
    private final C2658t f;

    public M9(int i, String controllerUrl, JSONObject controllerConfig, C2658t bannerConfig, C2658t interstitialConfig, C2658t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        this.a = i;
        this.b = controllerUrl;
        this.c = controllerConfig;
        this.d = bannerConfig;
        this.e = interstitialConfig;
        this.f = rewardedConfig;
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

    public final C2658t d() {
        return this.d;
    }

    public final C2658t e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M9)) {
            return false;
        }
        M9 m9 = (M9) obj;
        return this.a == m9.a && Intrinsics.areEqual(this.b, m9.b) && Intrinsics.areEqual(this.c, m9.c) && Intrinsics.areEqual(this.d, m9.d) && Intrinsics.areEqual(this.e, m9.e) && Intrinsics.areEqual(this.f, m9.f);
    }

    public final C2658t f() {
        return this.f;
    }

    public final C2658t g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final C2658t j() {
        return this.e;
    }

    public final int k() {
        return this.a;
    }

    public final C2658t l() {
        return this.f;
    }

    public String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.a + ", controllerUrl=" + this.b + ", controllerConfig=" + this.c + ", bannerConfig=" + this.d + ", interstitialConfig=" + this.e + ", rewardedConfig=" + this.f + ")";
    }

    public final M9 a(int i, String controllerUrl, JSONObject controllerConfig, C2658t bannerConfig, C2658t interstitialConfig, C2658t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        return new M9(i, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    public static /* synthetic */ M9 a(M9 m9, int i, String str, JSONObject jSONObject, C2658t c2658t, C2658t c2658t2, C2658t c2658t3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = m9.a;
        }
        if ((i2 & 2) != 0) {
            str = m9.b;
        }
        if ((i2 & 4) != 0) {
            jSONObject = m9.c;
        }
        if ((i2 & 8) != 0) {
            c2658t = m9.d;
        }
        if ((i2 & 16) != 0) {
            c2658t2 = m9.e;
        }
        if ((i2 & 32) != 0) {
            c2658t3 = m9.f;
        }
        C2658t c2658t4 = c2658t2;
        C2658t c2658t5 = c2658t3;
        return m9.a(i, str, jSONObject, c2658t, c2658t4, c2658t5);
    }
}
