package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Uf {
    private final Pf a;

    public static final class c implements Aa {
        c() {
        }

        @Override // com.ironsource.Aa
        public void b(IronSourceError ironSourceError) {
            Uf.this.a(Vf.b, LevelPlay.AdFormat.BANNER, Yf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Aa
        public void d(AdInfo adInfo) {
            Uf.this.a(Vf.f, LevelPlay.AdFormat.BANNER, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void e(AdInfo adInfo) {
            Uf.this.a(Vf.j, LevelPlay.AdFormat.BANNER, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void f(AdInfo adInfo) {
            Uf.this.a(Vf.m, LevelPlay.AdFormat.BANNER, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void g(AdInfo adInfo) {
            Uf.this.a(Vf.k, LevelPlay.AdFormat.BANNER, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void h(AdInfo adInfo) {
            Uf.this.a(Vf.l, LevelPlay.AdFormat.BANNER, Yf.a.a(adInfo));
        }
    }

    public Uf(Pf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.a = javaScriptEvaluator;
    }

    private final void b() {
        Tf tf = Tf.a;
        tf.a((InterfaceC2402eb) null);
        tf.a((InterfaceC2617qb) null);
        tf.a((Aa) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.b().c(false);
        Tf.a.e();
    }

    public final void d() {
        Tf tf = Tf.a;
        tf.a(new a());
        tf.a(new b());
        tf.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements InterfaceC2402eb {
        a() {
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void a(AdInfo adInfo) {
            Uf.this.a(Vf.a, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void b(IronSourceError ironSourceError) {
            Uf.this.a(Vf.b, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void c(AdInfo adInfo) {
            Uf.this.a(Vf.c, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void d(AdInfo adInfo) {
            Uf.this.a(Vf.f, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void e(AdInfo adInfo) {
            Uf.this.a(Vf.d, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Uf.this.a(Vf.e, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC2402eb
        public void b(AdInfo adInfo) {
            Uf.this.a(Vf.g, LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC2652sb, InterfaceC2634rb {
        b() {
        }

        @Override // com.ironsource.InterfaceC2652sb
        public void a(AdInfo adInfo) {
            Uf.this.a(Vf.a, LevelPlay.AdFormat.REWARDED, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2652sb
        public void b(IronSourceError ironSourceError) {
            Uf.this.a(Vf.b, LevelPlay.AdFormat.REWARDED, Yf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC2617qb
        public void c(AdInfo adInfo) {
            Uf.this.a(Vf.c, LevelPlay.AdFormat.REWARDED, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2634rb
        public void d(AdInfo adInfo) {
            Uf.this.a(Vf.h, LevelPlay.AdFormat.REWARDED, Yf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC2634rb
        public void a() {
            Uf.this.a(Vf.n, LevelPlay.AdFormat.REWARDED, Yf.a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC2617qb
        public void b(C2440gd c2440gd, AdInfo adInfo) {
            Uf.this.a(Vf.i, LevelPlay.AdFormat.REWARDED, Yf.a.a(Tf.a.a(c2440gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC2617qb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Uf.this.a(Vf.e, LevelPlay.AdFormat.REWARDED, Yf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC2617qb
        public void a(C2440gd c2440gd, AdInfo adInfo) {
            Uf.this.a(Vf.f, LevelPlay.AdFormat.REWARDED, Yf.a.a(Tf.a.a(c2440gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC2617qb
        public void b(AdInfo adInfo) {
            Uf.this.a(Vf.g, LevelPlay.AdFormat.REWARDED, Yf.a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.a.a(str, adFormat, list);
    }
}
