package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import java.util.Date;
import java.util.Objects;
import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class P {
    public static final a f = new a(null);
    public static final String g = "0";
    public static final String h = "0";
    public static final String i = "0";
    public static final String j = "0";
    private final K9 a;
    private S7 b = S7.UnknownProvider;
    private String c = "0";
    private EnumC4466o0 d = EnumC4466o0.LOAD_REQUEST;
    private double e = new Date().getTime() / 1000.0d;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public P(K9 k9) {
        this.a = k9;
    }

    public final K9 a() {
        return this.a;
    }

    public final IronSource.a b() {
        return this.a.i() ? IronSource.a.BANNER : this.a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    public final String c() {
        return this.a.e();
    }

    public final K9 d() {
        return this.a;
    }

    public final S7 e() {
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
        return epx.f(c(), p.c()) && epx.f(g(), p.g()) && b() == p.b() && epx.f(i(), p.i()) && this.b == p.b && epx.f(this.c, p.c) && this.d == p.d;
    }

    public final EnumC4466o0 f() {
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
        return this.a.g();
    }

    public final double j() {
        return this.e;
    }

    public String toString() {
        return new JSONObject().put(f.b.c, c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
    }

    public final P a(K9 k9) {
        return new P(k9);
    }

    public static /* synthetic */ P a(P p, K9 k9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            k9 = p.a;
        }
        return p.a(k9);
    }

    public final void a(S7 s7) {
        this.b = s7;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(EnumC4466o0 enumC4466o0) {
        this.d = enumC4466o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
