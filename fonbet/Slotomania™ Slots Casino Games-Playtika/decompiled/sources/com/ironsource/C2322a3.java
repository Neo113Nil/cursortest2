package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2389dg;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2322a3 implements Ab, E2 {
    private final BannerAdRequest a;
    private final AdSize b;
    private final InterfaceC2590p2 c;
    private final Bb d;
    private final InterfaceC2671tc e;
    private final InterfaceC2642s1 f;
    private final V<BannerAdView> g;
    private final H2 h;
    private final InterfaceC2389dg.c i;
    private final Executor j;
    private C2432g5 k;
    private InterfaceC2389dg l;
    private Y1 m;
    private boolean n;

    /* renamed from: com.ironsource.a3$a */
    public static final class a implements InterfaceC2389dg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC2389dg.a
        public void a() {
            C2322a3.this.a(C2682u5.a.s());
        }
    }

    public C2322a3(BannerAdRequest adRequest, AdSize size, InterfaceC2590p2 auctionResponseFetcher, Bb loadTaskConfig, InterfaceC2671tc networkLoadApi, InterfaceC2642s1 analytics, V<BannerAdView> adLoadTaskListener, H2 adLayoutFactory, InterfaceC2389dg.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a2 = P5.a.a(bundle);
        for (String str : a2.keySet()) {
            InterfaceC2517l1.c.a.a(new C2571o1.l(str + "=" + String.valueOf(a2.get(str)))).a(this.f);
        }
    }

    @Override // com.ironsource.E2
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C2682u5.a.c(description));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(final J9 adInstance, final C2417f8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2322a3.a(C2322a3.this, adInstance, adContainer);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Ab
    public void start() {
        this.k = new C2432g5();
        this.f.a(new C2571o1.s(this.d.f()), new C2571o1.n(this.d.g().b()), new C2571o1.c(this.b), new C2571o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC2517l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.d.h();
        InterfaceC2389dg.c cVar = this.i;
        InterfaceC2389dg.b bVar = new InterfaceC2389dg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC2389dg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.c.a();
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a3);
        if (m11183exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(m11183exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C2327a8) m11183exceptionOrNullimpl).a());
            a3 = null;
        }
        C2536m2 c2536m2 = (C2536m2) a3;
        if (c2536m2 == null) {
            return;
        }
        InterfaceC2642s1 interfaceC2642s1 = this.f;
        String b = c2536m2.b();
        if (b != null) {
            interfaceC2642s1.a(new C2571o1.d(b));
        }
        JSONObject f = c2536m2.f();
        if (f != null) {
            interfaceC2642s1.a(new C2571o1.m(f));
        }
        String a4 = c2536m2.a();
        if (a4 != null) {
            interfaceC2642s1.a(new C2571o1.g(a4));
        }
        EnumC2579o9 g = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C2381d8 c2381d8 = new C2381d8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Ic ic = new Ic();
        ic.a(this);
        J9 adInstance = new K9(this.a.getProviderName$mediationsdk_release().value(), ic).a(g.b(EnumC2579o9.Bidder)).a(c2381d8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C2546mc().a(), P5.a.a(this.a.getExtraParams()))).a();
        C2707vc c2707vc = new C2707vc(c2536m2, this.d.j());
        this.m = new Y1(new C2543m9(this.a.getInstanceId(), g.b(), c2536m2.a()), new com.ironsource.mediationsdk.d(), c2536m2.c());
        InterfaceC2517l1.d.a.c().a(this.f);
        InterfaceC2671tc interfaceC2671tc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC2671tc.a(adInstance, c2707vc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2322a3 this$0, J9 adInstance, C2417f8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC2389dg interfaceC2389dg = this$0.l;
        if (interfaceC2389dg != null) {
            interfaceC2389dg.cancel();
        }
        C2432g5 c2432g5 = this$0.k;
        if (c2432g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c2432g5 = null;
        }
        InterfaceC2517l1.c.a.a(new C2571o1.f(C2432g5.a(c2432g5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.c("onBannerLoadSuccess");
        }
        H2 h2 = this$0.h;
        Y1 y12 = this$0.m;
        Intrinsics.checkNotNull(y12);
        this$0.g.a(h2.a(adInstance, adContainer, y12));
    }

    public /* synthetic */ C2322a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC2590p2 interfaceC2590p2, Bb bb, InterfaceC2671tc interfaceC2671tc, InterfaceC2642s1 interfaceC2642s1, V v, H2 h2, InterfaceC2389dg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC2590p2, bb, interfaceC2671tc, interfaceC2642s1, v, h2, (i & 256) != 0 ? new InterfaceC2389dg.d() : cVar, (i & 512) != 0 ? Q7.a.d() : executor);
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C2322a3.a(C2322a3.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2322a3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC2389dg interfaceC2389dg = this$0.l;
        if (interfaceC2389dg != null) {
            interfaceC2389dg.cancel();
        }
        InterfaceC2517l1.c.a aVar = InterfaceC2517l1.c.a;
        C2571o1.j jVar = new C2571o1.j(error.getErrorCode());
        C2571o1.k kVar = new C2571o1.k(error.getErrorMessage());
        C2432g5 c2432g5 = this$0.k;
        if (c2432g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c2432g5 = null;
        }
        aVar.a(jVar, kVar, new C2571o1.f(C2432g5.a(c2432g5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.a("onBannerLoadFail");
        }
        this$0.g.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC2517l1.d.a.a(new C2571o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
