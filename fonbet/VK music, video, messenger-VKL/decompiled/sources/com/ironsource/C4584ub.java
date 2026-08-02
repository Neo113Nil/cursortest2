package com.ironsource;

import android.content.Context;
import com.ironsource.C4265ce;
import com.ironsource.C4462ne;
import com.ironsource.C4584ub;
import com.ironsource.C9;
import com.ironsource.F0;
import com.ironsource.I8;
import com.ironsource.K7;
import com.ironsource.Kb;
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
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import xsna.dzb0;
import xsna.eoo;
import xsna.gzs;
import xsna.ir40;
import xsna.lap;
import xsna.p46;
import xsna.rl3;
import xsna.s3q0;
import xsna.u69;
import xsna.xe9;
import xsna.zno;

/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4584ub {
    public static final C4584ub a = new C4584ub();
    private static final C4602vb b = new C4602vb();

    /* renamed from: com.ironsource.ub$a */
    public static final class a implements InterfaceC4569te {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C4328g5 c;
        final /* synthetic */ LevelPlayInitListener d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4328g5 c4328g5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c4328g5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(final C4462ne c4462ne) {
            C4602vb c4602vb = C4584ub.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.a;
            final Context context = this.b;
            final C4328g5 c4328g5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c4602vb.c(new Runnable() { // from class: xsna.wez0
                @Override // java.lang.Runnable
                public final void run() {
                    C4584ub.a.a(C4462ne.this, levelPlayInitRequest, context, c4328g5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4462ne c4462ne, LevelPlayInitRequest levelPlayInitRequest, Context context, C4328g5 c4328g5, LevelPlayInitListener levelPlayInitListener) {
            C4260c9 a;
            C4278d9 f = c4462ne.f();
            if (f != null && (a = f.a()) != null) {
                new C4368i9().a(a.f(), a.e().d(), a.e().e(), a.e().f(), a.d());
            }
            C4584ub.a.a(levelPlayInitRequest, c4462ne, context, c4328g5, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4498pe c4498pe, C4278d9 c4278d9) {
            C4584ub.b.c(new lap(this.d, this.c, c4498pe, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4328g5 c4328g5, C4498pe c4498pe) {
            C4584ub.a.a(levelPlayInitListener, c4328g5, c4498pe);
        }
    }

    /* renamed from: com.ironsource.ub$b */
    public static final class b extends Lambda implements gzs<s3q0> {
        final /* synthetic */ Va a;
        final /* synthetic */ C4328g5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Va va, C4328g5 c4328g5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = va;
            this.b = c4328g5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C4584ub.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    /* renamed from: com.ironsource.ub$c */
    public static final class c extends Lambda implements gzs<s3q0> {
        final /* synthetic */ String a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.a, this.b);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    private C4584ub() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        a.c(context, levelPlayInitRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog ironLog = IronLog.API;
        String appKey = levelPlayInitRequest.getAppKey();
        String userId = levelPlayInitRequest.getUserId();
        List<LevelPlay.AdFormat> legacyAdFormats = levelPlayInitRequest.getLegacyAdFormats();
        String simpleName = context.getClass().getSimpleName();
        StringBuilder a2 = xe9.a("LevelPlay.init() appkey: ", appKey, ", userId: ", userId, ", legacyAdFormats: ");
        a2.append(legacyAdFormats);
        a2.append(", context: ");
        a2.append(simpleName);
        ironLog.info(a2.toString());
        C4328g5 c4328g5 = new C4328g5();
        C4602vb c4602vb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ce.a.a(context, new C4605ve(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), rl3.w0(c4602vb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4328g5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment levelPlaySegment) {
        com.ironsource.mediationsdk.p.h().a(a(levelPlaySegment));
    }

    public final void b(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        com.ironsource.mediationsdk.p.h().a(new C4226ab(levelPlayImpressionDataListener));
    }

    public static /* synthetic */ void a(C4584ub c4584ub, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4584ub.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        b.c(new ir40(context, levelPlayInitRequest, levelPlayInitListener, 5));
    }

    public final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        com.ironsource.mediationsdk.p.h().b(new C4226ab(levelPlayImpressionDataListener));
    }

    public final void b(gzs<s3q0> gzsVar) {
        if (Kb.u.c().h().D()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC4408ke.a.a(gzsVar), 0L, 2, null);
        } else {
            gzsVar.invoke();
        }
    }

    private final C4243ba a(LevelPlaySegment levelPlaySegment) {
        C4243ba c4243ba = new C4243ba();
        c4243ba.a(levelPlaySegment.getLevel());
        c4243ba.a(levelPlaySegment.getIapTotal());
        c4243ba.a(levelPlaySegment.isPaying());
        c4243ba.a(levelPlaySegment.getUserCreationDate());
        c4243ba.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c4243ba.a((String) pair.i(), (String) pair.j());
        }
        return c4243ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4462ne c4462ne, Context context, C4328g5 c4328g5, LevelPlayInitListener levelPlayInitListener) {
        Kb.b bVar = Kb.u;
        I8.a E = bVar.a().E();
        C4546s9.a.a();
        Va va = new Va(c4462ne);
        if (va.n()) {
            b.a(context);
        }
        K7.a b2 = bVar.a().b();
        C4602vb c4602vb = b;
        va.b(c4602vb).a(b2);
        va.a(c4602vb).a(bVar.a().l());
        va.c(c4602vb).a(bVar.a().v());
        C4584ub c4584ub = a;
        c4584ub.a(levelPlayInitRequest, va);
        bVar.d().B().a(va);
        bVar.d().F().a(va);
        long n = bVar.d().h().n();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        IronSourceThreadManager ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
        ironSourceThreadManager.changeToUISchedulerIfNeeded();
        com.ironsource.mediationsdk.c.b().g();
        c4584ub.a(n, new b(va, c4328g5, n, levelPlayInitListener));
        E.a(va);
        if (c4462ne.a().e()) {
            new Od(null, null, null, ironSourceThreadManager.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(long j, gzs<s3q0> gzsVar) {
        if (!Kb.u.d().f().c() && j > 0) {
            Ef ef = new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            p46 p46Var = new p46(2, gzsVar);
            zno.a aVar = zno.c;
            ef.a(p46Var, eoo.f(j, DurationUnit.MILLISECONDS));
            return;
        }
        gzsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gzs gzsVar) {
        gzsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Va va, C4328g5 c4328g5, long j, LevelPlayInitListener levelPlayInitListener) {
        Kb.u.a().E().d();
        long a2 = C4328g5.a(c4328g5);
        C4602vb c4602vb = b;
        C4602vb.a(c4602vb, a2, va.g(), j, null, 8, null);
        c4602vb.d(new u69(11, levelPlayInitListener, va));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Va va) {
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(va.m(), va.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Va va) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && va.d().c().f() != null) {
            C4265ce.a aVar = C4265ce.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C4265ce a2 = aVar.a(new C4341h0(aVar2, C4616w7.a.a(), "", null, null, null, 56, null), va, true);
            List<C4657yc> d = va.d(adFormat);
            F0.b bVar = F0.b.MEDIATION;
            new Dd(new V0(new C4484p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && va.d().c().d() != null) {
            C9.a aVar3 = C9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            C9 a3 = aVar3.a(new C4341h0(aVar4, C4616w7.a.a(), "", null, null, null, 56, null), va, true);
            List<C4657yc> d2 = va.d(adFormat2);
            F0.b bVar2 = F0.b.MEDIATION;
            new Dd(new V0(new C4484p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || va.d().c().c() == null) {
            return;
        }
        M2 a4 = M2.z.a(new J2(), va, true);
        List<C4657yc> d3 = va.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        F0.b bVar3 = F0.b.MEDIATION;
        new Dd(new V0(new C4484p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitListener levelPlayInitListener, C4328g5 c4328g5, C4498pe c4498pe) {
        long a2 = C4328g5.a(c4328g5);
        C4602vb c4602vb = b;
        C4498pe b2 = c4602vb.b(c4498pe);
        C4602vb.a(c4602vb, b2, a2, null, 4, null);
        c4602vb.d(new dzb0(c4498pe, levelPlayInitListener, b2, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4498pe c4498pe, LevelPlayInitListener levelPlayInitListener, C4498pe c4498pe2) {
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + c4498pe);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(c4498pe2)));
        }
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(str, arrayList);
    }

    public final void a(String str, List<String> list) {
        b(new c(str, list));
    }
}
