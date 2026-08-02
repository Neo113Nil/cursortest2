package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P {
    public static final a f = new a(null);
    public static final String g = "0";
    public static final String h = "0";
    public static final String i = "0";
    public static final String j = "0";
    private final J9 a;
    private R7 b;
    private String c;
    private EnumC2570o0 d;
    private double e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public P(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.a = adInstance;
        this.b = R7.UnknownProvider;
        this.c = "0";
        this.d = EnumC2570o0.LOAD_REQUEST;
        this.e = new Date().getTime() / 1000.0d;
    }

    public final J9 a() {
        return this.a;
    }

    public final IronSource.a b() {
        return this.a.i() ? IronSource.a.BANNER : this.a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    public final String c() {
        String e = this.a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        return e;
    }

    public final J9 d() {
        return this.a;
    }

    public final R7 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return Intrinsics.areEqual(c(), p.c()) && Intrinsics.areEqual(g(), p.g()) && b() == p.b() && Intrinsics.areEqual(i(), p.i()) && this.b == p.b && Intrinsics.areEqual(this.c, p.c) && this.d == p.d;
    }

    public final EnumC2570o0 f() {
        return this.d;
    }

    public final String g() {
        String c = this.a.c();
        return c == null ? "0" : c;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    public final String i() {
        String g2 = this.a.g();
        Intrinsics.checkNotNullExpressionValue(g2, "adInstance.name");
        return g2;
    }

    public final double j() {
        return this.e;
    }

    public String toString() {
        String jSONObject = IronSourceNetworkBridge.jsonObjectInit().put("adId", c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }

    public final P a(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new P(adInstance);
    }

    public static /* synthetic */ P a(P p, J9 j9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j9 = p.a;
        }
        return p.a(j9);
    }

    public final void a(R7 r7) {
        Intrinsics.checkNotNullParameter(r7, "<set-?>");
        this.b = r7;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(EnumC2570o0 enumC2570o0) {
        Intrinsics.checkNotNullParameter(enumC2570o0, "<set-?>");
        this.d = enumC2570o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
