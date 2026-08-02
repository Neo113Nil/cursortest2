package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final String g = "0";

    @NotNull
    public static final String h = "0";

    @NotNull
    public static final String i = "0";

    @NotNull
    public static final String j = "0";

    @NotNull
    private final J9 a;

    @NotNull
    private P7 b;

    @NotNull
    private String c;

    @NotNull
    private EnumC4225o0 d;
    private double e;

    public P(@NotNull J9 j9) {
        j9.getClass();
        this.a = j9;
        this.b = P7.UnknownProvider;
        this.c = "0";
        this.d = EnumC4225o0.LOAD_REQUEST;
        this.e = new Date().getTime() / 1000.0d;
    }

    public static /* synthetic */ P a(P p, J9 j9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j9 = p.a;
        }
        return p.a(j9);
    }

    @NotNull
    public final IronSource.a b() {
        return this.a.i() ? IronSource.a.BANNER : this.a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String e = this.a.e();
        e.getClass();
        return e;
    }

    @NotNull
    public final J9 d() {
        return this.a;
    }

    @NotNull
    public final P7 e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return Intrinsics.c(c(), p.c()) && Intrinsics.c(g(), p.g()) && b() == p.b() && Intrinsics.c(i(), p.i()) && this.b == p.b && Intrinsics.c(this.c, p.c) && this.d == p.d;
    }

    @NotNull
    public final EnumC4225o0 f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        String c = this.a.c();
        return c == null ? "0" : c;
    }

    @NotNull
    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    @NotNull
    public final String i() {
        String g2 = this.a.g();
        g2.getClass();
        return g2;
    }

    public final double j() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String jSONObject = new JSONObject().put(f.b.c, c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        jSONObject.getClass();
        return jSONObject;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final P a(@NotNull J9 j9) {
        j9.getClass();
        return new P(j9);
    }

    @NotNull
    public final J9 a() {
        return this.a;
    }

    public final void a(@NotNull P7 p7) {
        p7.getClass();
        this.b = p7;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = str;
    }

    public final void a(@NotNull EnumC4225o0 enumC4225o0) {
        enumC4225o0.getClass();
        this.d = enumC4225o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
