package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cd extends AbstractC3896y implements Ih, Bj, I, InterfaceC3430g {
    public final Sc b;
    public final C3870x c;
    public final AbstractC3768t1 d;
    public final Nc e;
    public final C3678pe f;
    public final C3870x g;
    public final Sc h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(C3678pe c3678pe, C3870x c3870x, Sc sc, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
        super(c3870x);
        c3678pe.getClass();
        c3870x.getClass();
        sc.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        sc.getClass();
        c3870x.getClass();
        abstractC3768t1.getClass();
        nc.getClass();
        this.b = sc;
        this.c = c3870x;
        this.d = abstractC3768t1;
        this.e = nc;
        this.f = c3678pe;
        this.g = c3870x;
        this.h = sc;
        this.i = uc;
        this.j = nc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3880x9 l2 = l();
        if (l2 != null) {
            ((C3906y9) l2).a("AUM-LoadedState", "Initialize Called");
        }
        this.d.e();
        C3328c0 c3328c0 = this.a.a.d;
        c3328c0.getClass();
        c3328c0.g = SystemClock.elapsedRealtime();
        X4.a(k(), new Bd(this, null));
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3880x9 l2 = l();
        if (l2 != null) {
            ((C3906y9) l2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.j.a(new Ge(this.h, this.g, this.i, this.j), this);
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadedState", "onDestroy");
        }
        this.e.a(new C3928z5(this.b, this.d, this.c), this);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Sc sc = this.h;
        sc.getClass();
        inMobiNativeViewData.getClass();
        sc.b.a(inMobiNativeViewData);
    }
}
