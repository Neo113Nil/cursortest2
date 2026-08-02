package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.f3;
import com.applovin.impl.h8;
import com.applovin.impl.i8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* loaded from: classes7.dex */
public class b implements i8.a {
    private final l a;
    private final f3 b;
    private final i8 c;
    private final h8 d;
    private final a.InterfaceC0103a e;

    public b(f3 f3Var, ViewGroup viewGroup, a.InterfaceC0103a interfaceC0103a, l lVar) {
        this.a = lVar;
        this.b = f3Var;
        this.e = interfaceC0103a;
        this.d = new h8(viewGroup, lVar);
        i8 i8Var = new i8(viewGroup, lVar, this);
        this.c = i8Var;
        i8Var.a(f3Var);
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.c.b();
    }

    public f3 b() {
        return this.b;
    }

    public void c() {
        this.a.Q();
        if (p.a()) {
            this.a.Q().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.x0().compareAndSet(false, true)) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                p.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.a.f().a(this.b);
            }
            this.a.Z().processRawAdImpression(this.b, this.e);
        }
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.y0().compareAndSet(false, true)) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.a.Z().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }
}
