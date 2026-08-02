package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* loaded from: classes13.dex */
public final class Xf {
    private final Sf a;

    public static final class c implements Ba {
        public c() {
        }

        @Override // com.ironsource.Ba
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.b, LevelPlay.AdFormat.BANNER, C4249bg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Ba
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.f, LevelPlay.AdFormat.BANNER, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void e(AdInfo adInfo) {
            Xf.this.a(Yf.j, LevelPlay.AdFormat.BANNER, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void f(AdInfo adInfo) {
            Xf.this.a(Yf.m, LevelPlay.AdFormat.BANNER, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void g(AdInfo adInfo) {
            Xf.this.a(Yf.k, LevelPlay.AdFormat.BANNER, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void h(AdInfo adInfo) {
            Xf.this.a(Yf.l, LevelPlay.AdFormat.BANNER, C4249bg.a.a(adInfo));
        }
    }

    public Xf(Sf sf) {
        this.a = sf;
    }

    private final void b() {
        Wf wf = Wf.a;
        wf.a((InterfaceC4316fb) null);
        wf.a((InterfaceC4530rb) null);
        wf.a((Ba) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.b().c(false);
        Wf.a.e();
    }

    public final void d() {
        Wf wf = Wf.a;
        wf.a(new a());
        wf.a(new b());
        wf.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements InterfaceC4316fb {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void a(AdInfo adInfo) {
            Xf.this.a(Yf.a, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.b, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void c(AdInfo adInfo) {
            Xf.this.a(Yf.c, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.f, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void e(AdInfo adInfo) {
            Xf.this.a(Yf.d, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Xf.this.a(Yf.e, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4316fb
        public void b(AdInfo adInfo) {
            Xf.this.a(Yf.g, LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC4566tb, InterfaceC4548sb {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4566tb
        public void a(AdInfo adInfo) {
            Xf.this.a(Yf.a, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4566tb
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.b, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4530rb
        public void c(AdInfo adInfo) {
            Xf.this.a(Yf.c, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4548sb
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.h, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4548sb
        public void a() {
            Xf.this.a(Yf.n, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4530rb
        public void b(C4336gd c4336gd, AdInfo adInfo) {
            Xf.this.a(Yf.i, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(Wf.a.a(c4336gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4530rb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Xf.this.a(Yf.e, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4530rb
        public void a(C4336gd c4336gd, AdInfo adInfo) {
            Xf.this.a(Yf.f, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(Wf.a.a(c4336gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4530rb
        public void b(AdInfo adInfo) {
            Xf.this.a(Yf.g, LevelPlay.AdFormat.REWARDED, C4249bg.a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.a.a(str, adFormat, list);
    }
}
