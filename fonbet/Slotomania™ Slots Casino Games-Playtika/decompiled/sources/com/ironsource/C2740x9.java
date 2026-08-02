package com.ironsource;

import android.os.Bundle;
import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2389dg;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2740x9 implements Ab, InterfaceC2325a6 {
    private final InterstitialAdRequest a;
    private final Bb b;
    private final V<InterstitialAd> c;
    private final InterfaceC2590p2 d;
    private final InterfaceC2671tc e;
    private final InterfaceC2642s1 f;
    private final InterfaceC2391e0<InterstitialAd> g;
    private final InterfaceC2389dg.c h;
    private final Executor i;
    private C2432g5 j;
    private InterfaceC2389dg k;
    private Y1 l;
    private boolean m;

    /* renamed from: com.ironsource.x9$a */
    public static final class a implements InterfaceC2389dg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC2389dg.a
        public void a() {
            C2740x9.this.a(C2682u5.a.s());
        }
    }

    public C2740x9(InterstitialAdRequest adRequest, Bb loadTaskConfig, V<InterstitialAd> adLoadTaskListener, InterfaceC2590p2 auctionResponseFetcher, InterfaceC2671tc networkLoadApi, InterfaceC2642s1 analytics, InterfaceC2391e0<InterstitialAd> adObjectFactory, InterfaceC2389dg.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = loadTaskConfig;
        this.c = adLoadTaskListener;
        this.d = auctionResponseFetcher;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adObjectFactory;
        this.h = timerFactory;
        this.i = taskFinishedExecutor;
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

    @Override // com.ironsource.Ab
    public void start() {
        this.j = new C2432g5();
        this.f.a(new C2571o1.s(this.b.f()), new C2571o1.n(this.b.g().b()), new C2571o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC2517l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.b.h();
        InterfaceC2389dg.c cVar = this.h;
        InterfaceC2389dg.b bVar = new InterfaceC2389dg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC2389dg a2 = cVar.a(bVar);
        this.k = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.d.a();
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
        EnumC2579o9 g = this.b.g();
        Z5 z5 = new Z5();
        z5.a(this);
        J9 adInstance = new K9(this.a.getProviderName$mediationsdk_release().value(), z5).a(g.b(EnumC2579o9.Bidder)).b(this.b.i()).a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C2546mc().a(), P5.a.a(this.a.getExtraParams()))).a();
        InterfaceC2642s1 interfaceC2642s12 = this.f;
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        interfaceC2642s12.a(new C2571o1.b(e));
        C2707vc c2707vc = new C2707vc(c2536m2, this.b.j());
        this.l = new Y1(new C2543m9(this.a.getInstanceId(), g.b(), c2536m2.a()), new com.ironsource.mediationsdk.d(), c2536m2.c());
        InterfaceC2517l1.d.a.c().a(this.f);
        InterfaceC2671tc interfaceC2671tc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC2671tc.a(adInstance, c2707vc);
    }

    @Override // com.ironsource.InterfaceC2325a6
    public void a(final J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C2740x9.a(C2740x9.this, adInstance);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    public /* synthetic */ C2740x9(InterstitialAdRequest interstitialAdRequest, Bb bb, V v, InterfaceC2590p2 interfaceC2590p2, InterfaceC2671tc interfaceC2671tc, InterfaceC2642s1 interfaceC2642s1, InterfaceC2391e0 interfaceC2391e0, InterfaceC2389dg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, bb, v, interfaceC2590p2, interfaceC2671tc, interfaceC2642s1, interfaceC2391e0, (i & 128) != 0 ? new InterfaceC2389dg.d() : cVar, (i & 256) != 0 ? Q7.a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2740x9 this$0, J9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC2389dg interfaceC2389dg = this$0.k;
        if (interfaceC2389dg != null) {
            interfaceC2389dg.cancel();
        }
        C2432g5 c2432g5 = this$0.j;
        if (c2432g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c2432g5 = null;
        }
        InterfaceC2517l1.c.a.a(new C2571o1.f(C2432g5.a(c2432g5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.c("onAdInstanceDidLoad");
        }
        InterfaceC2391e0<InterstitialAd> interfaceC2391e0 = this$0.g;
        Y1 y12 = this$0.l;
        Intrinsics.checkNotNull(y12);
        this$0.c.a(interfaceC2391e0.a(adInstance, y12));
    }

    @Override // com.ironsource.InterfaceC2325a6
    public void a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C2682u5.a.c(description));
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2740x9.a(C2740x9.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2740x9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC2389dg interfaceC2389dg = this$0.k;
        if (interfaceC2389dg != null) {
            interfaceC2389dg.cancel();
        }
        InterfaceC2517l1.c.a aVar = InterfaceC2517l1.c.a;
        C2571o1.j jVar = new C2571o1.j(error.getErrorCode());
        C2571o1.k kVar = new C2571o1.k(error.getErrorMessage());
        C2432g5 c2432g5 = this$0.j;
        if (c2432g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c2432g5 = null;
        }
        aVar.a(jVar, kVar, new C2571o1.f(C2432g5.a(c2432g5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.a("onAdInstanceDidFailToLoad");
        }
        this$0.c.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC2517l1.d.a.a(new C2571o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
