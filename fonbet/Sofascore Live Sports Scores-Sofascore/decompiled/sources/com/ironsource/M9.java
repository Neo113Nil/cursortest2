package com.ironsource;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M9 {
    private final int a;

    @NotNull
    private final String b;

    @NotNull
    private final JSONObject c;

    @NotNull
    private final C4313t d;

    @NotNull
    private final C4313t e;

    @NotNull
    private final C4313t f;

    public M9(int i, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull C4313t c4313t, @NotNull C4313t c4313t2, @NotNull C4313t c4313t3) {
        str.getClass();
        jSONObject.getClass();
        c4313t.getClass();
        c4313t2.getClass();
        c4313t3.getClass();
        this.a = i;
        this.b = str;
        this.c = jSONObject;
        this.d = c4313t;
        this.e = c4313t2;
        this.f = c4313t3;
    }

    public static /* synthetic */ M9 a(M9 m9, int i, String str, JSONObject jSONObject, C4313t c4313t, C4313t c4313t2, C4313t c4313t3, int i2, Object obj) {
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
            c4313t = m9.d;
        }
        if ((i2 & 16) != 0) {
            c4313t2 = m9.e;
        }
        if ((i2 & 32) != 0) {
            c4313t3 = m9.f;
        }
        C4313t c4313t4 = c4313t2;
        C4313t c4313t5 = c4313t3;
        return m9.a(i, str, jSONObject, c4313t, c4313t4, c4313t5);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final JSONObject c() {
        return this.c;
    }

    @NotNull
    public final C4313t d() {
        return this.d;
    }

    @NotNull
    public final C4313t e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M9)) {
            return false;
        }
        M9 m9 = (M9) obj;
        return this.a == m9.a && Intrinsics.c(this.b, m9.b) && Intrinsics.c(this.c, m9.c) && Intrinsics.c(this.d, m9.d) && Intrinsics.c(this.e, m9.e) && Intrinsics.c(this.f, m9.f);
    }

    @NotNull
    public final C4313t f() {
        return this.f;
    }

    @NotNull
    public final C4313t g() {
        return this.d;
    }

    @NotNull
    public final JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final C4313t j() {
        return this.e;
    }

    public final int k() {
        return this.a;
    }

    @NotNull
    public final C4313t l() {
        return this.f;
    }

    @NotNull
    public String toString() {
        int i = this.a;
        String str = this.b;
        JSONObject jSONObject = this.c;
        C4313t c4313t = this.d;
        C4313t c4313t2 = this.e;
        C4313t c4313t3 = this.f;
        StringBuilder t = dmi.t(i, "IronSourceAdsInitConfig(logLevel=", ", controllerUrl=", str, ", controllerConfig=");
        t.append(jSONObject);
        t.append(", bannerConfig=");
        t.append(c4313t);
        t.append(", interstitialConfig=");
        t.append(c4313t2);
        t.append(", rewardedConfig=");
        t.append(c4313t3);
        t.append(")");
        return t.toString();
    }

    @NotNull
    public final M9 a(int i, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull C4313t c4313t, @NotNull C4313t c4313t2, @NotNull C4313t c4313t3) {
        str.getClass();
        jSONObject.getClass();
        c4313t.getClass();
        c4313t2.getClass();
        c4313t3.getClass();
        return new M9(i, str, jSONObject, c4313t, c4313t2, c4313t3);
    }

    public final int a() {
        return this.a;
    }
}
