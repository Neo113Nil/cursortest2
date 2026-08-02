package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vf {

    @NotNull
    private final Qf a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements Aa {
        public c() {
        }

        @Override // com.ironsource.Aa
        public void a(@Nullable IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.BANNER, Zf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Aa
        public void d(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.BANNER, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void e(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.j, LevelPlay.AdFormat.BANNER, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void f(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.m, LevelPlay.AdFormat.BANNER, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void g(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.k, LevelPlay.AdFormat.BANNER, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void h(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.l, LevelPlay.AdFormat.BANNER, Zf.a.a(adInfo));
        }
    }

    public Vf(@NotNull Qf qf) {
        qf.getClass();
        this.a = qf;
    }

    private final void b() {
        Uf uf = Uf.a;
        uf.a((InterfaceC4021cb) null);
        uf.a((InterfaceC4236ob) null);
        uf.a((Aa) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.d().e(false);
        Uf.a.e();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        Uf uf = Uf.a;
        uf.a(new a());
        uf.a(new b());
        uf.a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.a.a(str, adFormat, list);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements InterfaceC4272qb, InterfaceC4254pb {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4272qb
        public void a(@Nullable IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.REWARDED, Zf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4236ob
        public void b(@Nullable C4077fd c4077fd, @Nullable AdInfo adInfo) {
            Vf.this.a(Wf.i, LevelPlay.AdFormat.REWARDED, Zf.a.a(Uf.a.a(c4077fd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4236ob
        public void c(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.c, LevelPlay.AdFormat.REWARDED, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4254pb
        public void d(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.h, LevelPlay.AdFormat.REWARDED, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4236ob
        public void b(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.g, LevelPlay.AdFormat.REWARDED, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4272qb
        public void a(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.a, LevelPlay.AdFormat.REWARDED, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4254pb
        public void a() {
            Vf.this.a(Wf.n, LevelPlay.AdFormat.REWARDED, Zf.a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4236ob
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Vf.this.a(Wf.e, LevelPlay.AdFormat.REWARDED, Zf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4236ob
        public void a(@Nullable C4077fd c4077fd, @Nullable AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.REWARDED, Zf.a.a(Uf.a.a(c4077fd), adInfo));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InterfaceC4021cb {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void a(@Nullable IronSourceError ironSourceError) {
            Vf.this.a(Wf.b, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void b(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.g, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void c(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.c, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void d(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.f, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void e(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.d, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void a(@Nullable AdInfo adInfo) {
            Vf.this.a(Wf.a, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4021cb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Vf.this.a(Wf.e, LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }
    }
}
