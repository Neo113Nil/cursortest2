package com.ironsource;

import android.app.Activity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ironsource.C2415f6;
import com.ironsource.C2588p0;
import com.ironsource.F0;
import com.ironsource.InterfaceC2498k0;
import com.ironsource.X0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Xa implements InterfaceC2397e6 {
    public static final a o = new a(null);
    public static final String p = "Fullscreen Ad Internal";
    private final LevelPlay.AdFormat a;
    private final String b;
    private final b c;
    private final C2588p0 d;
    private final C2379d6 e;
    private final Z0 f;
    private final InterfaceC2749y0 g;
    private final H7 h;
    private final InterfaceC2592p4 i;
    private final Lazy j;
    private Ya k;
    private final UUID l;
    private InterfaceC2576o6 m;
    private C2432g5 n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C2588p0 a = C2588p0.a.a(com.unity3d.mediation.a.a(adFormat), F0.b.MEDIATION);
            if (!a.g()) {
                a.e().a().a(placementName, Y0.b, false);
                return false;
            }
            G3 a2 = Jb.u.d().p().a(placementName, adFormat);
            boolean d = a2.d();
            a.e().a().a(placementName, a2.e(), d);
            return d;
        }

        private a() {
        }
    }

    public interface b {
        Double getBidFloor();
    }

    public static final class c {
        private final C2588p0 a;
        private final C2379d6 b;
        private final H7 c;
        private final InterfaceC2592p4 d;
        private final C2702v7 e;
        private final b f;
        private final Z0 g;

        public c(C2588p0 adTools, C2379d6 adControllerFactory, H7 provider, InterfaceC2592p4 currentTimeProvider, C2702v7 idFactory, b config, Z0 adUnitValidator) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
            this.a = adTools;
            this.b = adControllerFactory;
            this.c = provider;
            this.d = currentTimeProvider;
            this.e = idFactory;
            this.f = config;
            this.g = adUnitValidator;
        }

        public final C2379d6 a() {
            return this.b;
        }

        public final C2588p0 b() {
            return this.a;
        }

        public final Z0 c() {
            return this.g;
        }

        public final b d() {
            return this.f;
        }

        public final InterfaceC2592p4 e() {
            return this.d;
        }

        public final C2702v7 f() {
            return this.e;
        }

        public final H7 g() {
            return this.c;
        }
    }

    static final class d extends Lambda implements Function0<C2361c6> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2361c6 invoke() {
            return Xa.this.b();
        }
    }

    public static final class e implements InterfaceC2612q6 {
        final /* synthetic */ C2445h0 b;

        e(C2445h0 c2445h0) {
            this.b = c2445h0;
        }

        @Override // com.ironsource.InterfaceC2612q6
        public C2594p6 a(boolean z, InterfaceC2647s6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC2731x0 a = Xa.this.g().a(z, this.b);
            return new C2594p6(Jb.u.c(), new V0(Xa.this.f(), a, F0.b.MEDIATION), a, listener, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Xa(LevelPlay.AdFormat adFormat, String adUnitId, b config, C2588p0 adTools, C2379d6 fullscreenAdControllerFactory, Z0 adUnitValidator, InterfaceC2749y0 adUnitDataFactory, H7 mediationServicesProvider, InterfaceC2592p4 currentTimeProvider, C2702v7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.a = adFormat;
        this.b = adUnitId;
        this.c = config;
        this.d = adTools;
        this.e = fullscreenAdControllerFactory;
        this.f = adUnitValidator;
        this.g = adUnitDataFactory;
        this.h = mediationServicesProvider;
        this.i = currentTimeProvider;
        this.j = LazyKt.lazy(new d());
        UUID a2 = idFactory.a();
        this.l = a2;
        this.m = new C2415f6(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new C2551n(com.unity3d.mediation.a.a(adFormat), a2, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a();
        this$0.m.loadAd();
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final C2361c6 c() {
        return (C2361c6) this.j.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.a;
    }

    public final UUID e() {
        return this.l;
    }

    public final C2588p0 f() {
        return this.d;
    }

    public final InterfaceC2749y0 g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public final b i() {
        return this.c;
    }

    public final InterfaceC2592p4 j() {
        return this.i;
    }

    public final Ya k() {
        return this.k;
    }

    public final H7 l() {
        return this.h;
    }

    public final boolean m() {
        InterfaceC2498k0 c2 = this.m.c();
        this.d.e().e().a(Boolean.valueOf(c2.a()), c2 instanceof InterfaceC2498k0.a ? ((InterfaceC2498k0.a) c2).c() : null);
        return c2.a();
    }

    public final void n() {
        this.n = new C2432g5();
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Xa.b(Xa.this);
            }
        });
    }

    public final void o() {
        a(new C2522l6(this, this.i));
        c().m();
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdClicked() {
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                Xa.c(Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdClosed() {
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Xa.d(Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdDisplayed(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Xa.b(Xa.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Xa.c(Xa.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdLoadFailed(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Xa.c(Xa.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void onAdLoaded(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Xa.d(Xa.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Xa this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Xa this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.a();
    }

    public final void a(Ya ya) {
        this.k = ya;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Xa this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClosed();
    }

    public final void a(InterfaceC2576o6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.m = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Xa this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Xa this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdInfoChanged(adInfo);
    }

    public final void a(final Activity activity, final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Xa this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.d.e().h().d();
        this$0.m.a(activity, str);
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.d.e().h().f("Fullscreen Ad Internal - " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2361c6 b() {
        C2445h0 c2445h0 = new C2445h0(com.unity3d.mediation.a.a(this.a), this.l, this.b, null, this.h.A().a(), this.c.getBidFloor(), 8, null);
        e eVar = new e(c2445h0);
        C2772z5 e2 = this.d.e();
        C2588p0 c2588p0 = this.d;
        e2.a(new D0(c2588p0, c2445h0, c2588p0.b(this.a, this.b).b().b()));
        return this.e.a(this, this.d, c2445h0, eVar);
    }

    public final void a(C2415f6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.m = new C2415f6(this, status);
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void a(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Xa.b(Xa.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void a() {
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                Xa.e(Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2397e6
    public void a(final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C2588p0.a(this.d, "onAdRewarded state.getAdInfo: " + this.m.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Xa this$0, final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        final LevelPlayAdInfo b2 = this$0.m.b();
        IronLog.INTERNAL.verbose(C2588p0.a(this$0.d, "onAdRewarded adInfo: " + b2 + " reward: " + reward, (String) null, 2, (Object) null));
        this$0.d.e(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, reward, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdRewarded(reward, adInfo);
        }
    }

    public final void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C2588p0.a(this.d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long a2 = C2432g5.a(this.n);
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, a2);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, adInfo);
            }
        });
    }

    public /* synthetic */ Xa(LevelPlay.AdFormat adFormat, String str, b bVar, C2588p0 c2588p0, C2379d6 c2379d6, Z0 z0, InterfaceC2749y0 interfaceC2749y0, H7 h7, InterfaceC2592p4 interfaceC2592p4, C2702v7 c2702v7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c2588p0, c2379d6, z0, interfaceC2749y0, (i & 128) != 0 ? Jb.u.d() : h7, interfaceC2592p4, c2702v7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Xa xa, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        xa.a(levelPlayAdError, j);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C2588p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, j, levelPlayAdError);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(LevelPlayAdError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, long j, LevelPlayAdError levelPlayAdError) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Sc f = this$0.d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Xa this$0) {
        Ya ya;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (ya = this$0.k) == null) {
            return;
        }
        ya.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(final LevelPlayAdError error, final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C2588p0.a(this.d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.d.d(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, error);
            }
        });
        this.d.e(new Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Xa.a(Xa.this, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.d.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xa this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdDisplayFailed(error, adInfo);
        }
    }

    public final LevelPlayReward a(String str) {
        N7 C = this.h.C();
        H8 f = this.h.f();
        Sc f2 = this.d.e().f();
        X0 a2 = this.f.a(this.b, this.a, f);
        if (a2 instanceof X0.a) {
            X0.a aVar = (X0.a) a2;
            IronLog.INTERNAL.warning(C2588p0.a(this.d, "getReward() returned a default reward. Reason: " + aVar.b(), (String) null, 2, (Object) null));
            LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            f2.a(levelPlayReward, str, aVar.b());
            return levelPlayReward;
        }
        LevelPlayReward a3 = C.a(str, this.b);
        Sc.a(f2, a3, str, null, 4, null);
        return a3;
    }
}
