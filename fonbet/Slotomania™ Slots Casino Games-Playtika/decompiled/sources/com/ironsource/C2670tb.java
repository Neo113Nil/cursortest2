package com.ironsource;

import android.content.Context;
import com.ironsource.B9;
import com.ironsource.C2369ce;
import com.ironsource.C2670tb;
import com.ironsource.F0;
import com.ironsource.H8;
import com.ironsource.J7;
import com.ironsource.Jb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.tb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2670tb {
    public static final C2670tb a = new C2670tb();
    private static final C2688ub b = new C2688ub();

    /* renamed from: com.ironsource.tb$a */
    public static final class a implements InterfaceC2673te {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C2432g5 c;
        final /* synthetic */ LevelPlayInitListener d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C2432g5 c2432g5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c2432g5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2566ne sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C2688ub c2688ub = C2670tb.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.a;
            final Context context = this.b;
            final C2432g5 c2432g5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c2688ub.a(new Runnable() { // from class: com.ironsource.tb$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2670tb.a.a(C2566ne.this, levelPlayInitRequest, context, c2432g5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C2566ne sdkConfig, LevelPlayInitRequest initRequest, Context context, C2432g5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C2346b9 a;
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C2364c9 f = sdkConfig.f();
            if (f != null && (a = f.a()) != null) {
                new C2454h9().a(a.f(), a.e().d(), a.e().e(), a.e().f(), a.d());
            }
            C2670tb.a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C2688ub c2688ub = C2670tb.b;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            final C2432g5 c2432g5 = this.c;
            c2688ub.a(new Runnable() { // from class: com.ironsource.tb$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C2670tb.a.a(LevelPlayInitListener.this, c2432g5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C2432g5 initDuration, C2602pe error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C2670tb.a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* renamed from: com.ironsource.tb$b */
    static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ua a;
        final /* synthetic */ C2432g5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ua ua, C2432g5 c2432g5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = ua;
            this.b = c2432g5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C2670tb.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.tb$c */
    static final class c extends Lambda implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private C2670tb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C2432g5 c2432g5 = new C2432g5();
        C2688ub c2688ub = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ce.a.a(context, new C2709ve(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c2688ub.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c2432g5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.h().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().a(new Za(listener));
    }

    public static /* synthetic */ void a(C2670tb c2670tb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c2670tb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.d(new Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2670tb.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().b(new Za(listener));
    }

    private final C2329aa a(LevelPlaySegment levelPlaySegment) {
        C2329aa c2329aa = new C2329aa();
        c2329aa.a(levelPlaySegment.getLevel());
        c2329aa.a(levelPlaySegment.getIapTotal());
        c2329aa.a(levelPlaySegment.isPaying());
        c2329aa.a(levelPlaySegment.getUserCreationDate());
        c2329aa.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c2329aa.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c2329aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C2566ne c2566ne, Context context, C2432g5 c2432g5, LevelPlayInitListener levelPlayInitListener) {
        Jb.b bVar = Jb.u;
        H8.a E = bVar.a().E();
        Ua ua = new Ua(c2566ne);
        if (ua.n()) {
            b.a(context);
        }
        J7.a b2 = bVar.a().b();
        C2688ub c2688ub = b;
        ua.b(c2688ub).a(b2);
        ua.a(c2688ub).a(bVar.a().l());
        ua.c(c2688ub).a(bVar.a().v());
        C2670tb c2670tb = a;
        c2670tb.a(levelPlayInitRequest, ua);
        bVar.d().B().a(ua);
        bVar.d().F().a(ua);
        long n = bVar.d().h().n();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        com.ironsource.mediationsdk.c.b().g();
        c2670tb.a(n, new b(ua, c2432g5, n, levelPlayInitListener));
        E.a(ua);
        if (c2566ne.a().e()) {
            new Od(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, Function0<Unit> function0) {
        if (!Jb.u.d().f().c() && j > 0) {
            b.a(function0, j);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Ua ua, C2432g5 c2432g5, long j, final LevelPlayInitListener levelPlayInitListener) {
        Jb.u.a().E().d();
        long a2 = C2432g5.a(c2432g5);
        C2688ub c2688ub = b;
        C2688ub.a(c2688ub, a2, ua.g(), j, null, 8, null);
        c2688ub.e(new Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2670tb.a(LevelPlayInitListener.this, ua);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Ua levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m(), levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Ua ua) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && ua.d().c().f() != null) {
            C2369ce.a aVar = C2369ce.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C2369ce a2 = aVar.a(new C2445h0(aVar2, C2702v7.a.a(), "", null, null, null, 56, null), ua, true);
            List<C2743xc> d = ua.d(adFormat);
            F0.b bVar = F0.b.MEDIATION;
            new Dd(new V0(new C2588p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && ua.d().c().d() != null) {
            B9.a aVar3 = B9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            B9 a3 = aVar3.a(new C2445h0(aVar4, C2702v7.a.a(), "", null, null, null, 56, null), ua, true);
            List<C2743xc> d2 = ua.d(adFormat2);
            F0.b bVar2 = F0.b.MEDIATION;
            new Dd(new V0(new C2588p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || ua.d().c().c() == null) {
            return;
        }
        M2 a4 = M2.z.a(new J2(), ua, true);
        List<C2743xc> d3 = ua.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        F0.b bVar3 = F0.b.MEDIATION;
        new Dd(new V0(new C2588p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C2432g5 c2432g5, final C2602pe c2602pe) {
        long a2 = C2432g5.a(c2432g5);
        C2688ub c2688ub = b;
        final C2602pe b2 = c2688ub.b(c2602pe);
        C2688ub.a(c2688ub, b2, a2, null, 4, null);
        c2688ub.e(new Runnable() { // from class: com.ironsource.tb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2670tb.a(C2602pe.this, levelPlayInitListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2602pe error, LevelPlayInitListener levelPlayInitListener, C2602pe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(eventError)));
        }
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        a(new c(key, values));
    }

    public final void a(Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Jb.u.c().h().B()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC2512ke.a.a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }
}
