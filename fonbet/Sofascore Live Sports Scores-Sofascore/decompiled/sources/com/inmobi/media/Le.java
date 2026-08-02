package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Le implements Bj, Ih, I, InterfaceC3430g {
    public final Sc a;
    public final C3870x b;
    public final PublisherCallbacks c;
    public final Ej d;

    public Le(Sc sc, C3870x c3870x, PublisherCallbacks publisherCallbacks, Ej ej) {
        sc.getClass();
        c3870x.getClass();
        publisherCallbacks.getClass();
        ej.getClass();
        this.a = sc;
        this.b = c3870x;
        this.c = publisherCallbacks;
        this.d = ej;
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        C3906y9 c3906y9 = this.b.a.c;
        if (c3906y9 != null) {
            c3906y9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Sc sc = this.a;
        sc.getClass();
        inMobiNativeViewData.getClass();
        sc.b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3906y9 c3906y9 = this.b.a.c;
        if (c3906y9 != null) {
            c3906y9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.d.a(new Ge(this.a, this.b, this.c, this.d), this);
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        this.d.a(new C3928z5(this.a, null, this.b), this);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C3906y9 c3906y9 = this.b.a.c;
        if (c3906y9 != null) {
            c3906y9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.a.b.d();
    }
}
