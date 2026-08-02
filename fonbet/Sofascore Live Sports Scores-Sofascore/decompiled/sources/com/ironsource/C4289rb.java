package com.ironsource;

import android.content.Context;
import com.ironsource.B9;
import com.ironsource.C4006be;
import com.ironsource.E0;
import com.ironsource.F8;
import com.ironsource.H7;
import com.ironsource.Ib;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import defpackage.be5;
import defpackage.dp1;
import defpackage.iy;
import defpackage.mz1;
import defpackage.ph0;
import defpackage.wd5;
import defpackage.wem;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xka;
import defpackage.xtl;
import defpackage.zol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4289rb {

    @NotNull
    public static final C4289rb a = new C4289rb();

    @NotNull
    private static final C4325tb b = new C4325tb();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.rb$b */
    public static final class b extends xka implements Function0<Unit> {
        final /* synthetic */ Sa a;
        final /* synthetic */ C4051e5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Sa sa, C4051e5 c4051e5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = sa;
            this.b = c4051e5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C4289rb.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.rb$c */
    public static final class c extends xka implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.g().a(this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }
    }

    private C4289rb() {
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Sa sa) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && sa.d().c().f() != null) {
            C4006be.a aVar = C4006be.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C4006be a2 = aVar.a(new C4100h0(aVar2, C4303s7.a.a(), "", null, null, null, 56, null), sa, true);
            List<C4398xc> d = sa.d(adFormat);
            E0.b bVar = E0.b.MEDIATION;
            new Cd(new T0(new C4243p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && sa.d().c().d() != null) {
            B9.a aVar3 = B9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            B9 a3 = aVar3.a(new C4100h0(aVar4, C4303s7.a.a(), "", null, null, null, 56, null), sa, true);
            List<C4398xc> d2 = sa.d(adFormat2);
            E0.b bVar2 = E0.b.MEDIATION;
            new Cd(new T0(new C4243p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || sa.d().c().c() == null) {
            return;
        }
        K2 a4 = K2.z.a(new H2(), sa, true);
        List<C4398xc> d3 = sa.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        E0.b bVar3 = E0.b.MEDIATION;
        new Cd(new T0(new C4243p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Class cls) {
        cls.getClass();
        JSONObject b2 = IronSourceUtils.b(false);
        b2.put(IronSourceConstants.EVENTS_EXT1, cls.getName());
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_ILR_SUBSCRIPTION_LEGACY, b2));
    }

    @InterfaceC4307sb
    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog ironLog = IronLog.API;
        String appKey = levelPlayInitRequest.getAppKey();
        String userId = levelPlayInitRequest.getUserId();
        List<LevelPlay.AdFormat> legacyAdFormats = levelPlayInitRequest.getLegacyAdFormats();
        String simpleName = context.getClass().getSimpleName();
        StringBuilder s = mz1.s("LevelPlay.init() appkey: ", appKey, ", userId: ", userId, ", legacyAdFormats: ");
        s.append(legacyAdFormats);
        s.append(", context: ");
        s.append(simpleName);
        ironLog.info(s.toString());
        C4051e5 c4051e5 = new C4051e5();
        C4325tb c4325tb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ae.a.a(context, new C4328te(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ph0.Z(c4325tb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4051e5, levelPlayInitListener));
    }

    public final void b(@NotNull LevelPlaySegment levelPlaySegment) {
        levelPlaySegment.getClass();
        com.ironsource.mediationsdk.p.g().a(a(levelPlaySegment));
    }

    public final void b(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        com.ironsource.mediationsdk.p.g().a(new Xa(levelPlayImpressionDataListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        context.getClass();
        levelPlayInitRequest.getClass();
        a.c(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.rb$a */
    public static final class a implements InterfaceC4292re {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C4051e5 c;
        final /* synthetic */ LevelPlayInitListener d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4051e5 c4051e5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c4051e5;
            this.d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4185le c4185le, LevelPlayInitRequest levelPlayInitRequest, Context context, C4051e5 c4051e5, LevelPlayInitListener levelPlayInitListener) {
            C4019c9 a;
            c4185le.getClass();
            levelPlayInitRequest.getClass();
            context.getClass();
            c4051e5.getClass();
            C4037d9 f = c4185le.f();
            if (f != null && (a = f.a()) != null) {
                new C4127i9().a(a.f(), a.e().d(), a.e().e(), a.e().f(), a.d());
            }
            C4289rb.a.a(levelPlayInitRequest, c4185le, context, c4051e5, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4185le c4185le) {
            c4185le.getClass();
            C4289rb.b.a(new dp1(c4185le, this.a, this.b, this.c, this.d, 4));
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            C4289rb.b.a(new zol(12, this.d, this.c, c4221ne));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4051e5 c4051e5, C4221ne c4221ne) {
            c4051e5.getClass();
            c4221ne.getClass();
            C4289rb.a.a(levelPlayInitListener, c4051e5, c4221ne);
        }
    }

    public final void c(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        Ib.b bVar = Ib.v;
        if (!bVar.d().h().f()) {
            b(levelPlayImpressionDataListener);
        } else {
            bVar.d().C().a(levelPlayImpressionDataListener);
        }
    }

    public static /* synthetic */ void a(C4289rb c4289rb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4289rb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(@NotNull Context context, @NotNull LevelPlayInitRequest levelPlayInitRequest, @Nullable LevelPlayInitListener levelPlayInitListener) {
        context.getClass();
        levelPlayInitRequest.getClass();
        b.a(new zol(context, levelPlayInitRequest, levelPlayInitListener));
    }

    public final void a(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        com.ironsource.mediationsdk.p.g().b(new Xa(levelPlayImpressionDataListener));
        a(levelPlayImpressionDataListener.getClass());
    }

    public final void a(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener, @NotNull String str) {
        levelPlayImpressionDataListener.getClass();
        str.getClass();
        Ib.b bVar = Ib.v;
        if (!bVar.d().h().f()) {
            a(levelPlayImpressionDataListener);
        } else {
            bVar.d().C().a(str, levelPlayImpressionDataListener);
        }
    }

    private final void a(Class<?> cls) {
        b.a(new xtl(cls, 11));
    }

    private final C3959aa a(LevelPlaySegment levelPlaySegment) {
        C3959aa c3959aa = new C3959aa();
        c3959aa.a(levelPlaySegment.getLevel());
        c3959aa.a(levelPlaySegment.getIapTotal());
        c3959aa.a(levelPlaySegment.isPaying());
        c3959aa.a(levelPlaySegment.getUserCreationDate());
        c3959aa.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c3959aa.a((String) pair.a, (String) pair.b);
        }
        return c3959aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4307sb
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4185le c4185le, Context context, C4051e5 c4051e5, LevelPlayInitListener levelPlayInitListener) {
        Ib.b bVar = Ib.v;
        F8.a F = bVar.a().F();
        Sa sa = new Sa(c4185le);
        if (sa.o()) {
            b.a(context);
        }
        H7.a b2 = bVar.a().b();
        C4325tb c4325tb = b;
        sa.b(c4325tb).a(b2);
        sa.a(c4325tb).a(bVar.a().l());
        sa.c(c4325tb).a(bVar.a().v());
        C4289rb c4289rb = a;
        c4289rb.a(levelPlayInitRequest, sa);
        bVar.d().B().a(sa);
        bVar.d().G().a(sa);
        if (bVar.d().h().f()) {
            bVar.d().C().a(sa.k());
        }
        long o = bVar.d().h().o();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        com.ironsource.mediationsdk.c.d().i();
        c4289rb.a(o, new b(sa, c4051e5, o, levelPlayInitListener));
        F.a(sa);
        if (c4185le.a().f()) {
            new Nd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, Function0<Unit> function0) {
        if (!Ib.v.d().f().c() && j > 0) {
            Cf cf = new Cf(null, null, null, 7, null);
            iy iyVar = new iy(10, function0);
            wd5 wd5Var = xd5.b;
            cf.b(iyVar, wkn.S(j, be5.MILLISECONDS));
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Sa sa, C4051e5 c4051e5, long j, LevelPlayInitListener levelPlayInitListener) {
        Ib.v.a().F().d();
        long a2 = C4051e5.a(c4051e5);
        C4325tb c4325tb = b;
        C4325tb.a(c4325tb, a2, sa.g(), j, null, 8, null);
        c4325tb.b(new wem(14, levelPlayInitListener, sa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Sa sa) {
        sa.getClass();
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(sa.n(), sa.j()));
        }
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitListener levelPlayInitListener, C4051e5 c4051e5, C4221ne c4221ne) {
        long a2 = C4051e5.a(c4051e5);
        C4325tb c4325tb = b;
        C4221ne b2 = c4325tb.b(c4221ne);
        C4325tb.a(c4325tb, b2, a2, null, 4, null);
        c4325tb.b(new zol(11, c4221ne, levelPlayInitListener, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4221ne c4221ne, LevelPlayInitListener levelPlayInitListener, C4221ne c4221ne2) {
        c4221ne.getClass();
        c4221ne2.getClass();
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + c4221ne);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(c4221ne2)));
        }
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(str, arrayList);
    }

    public final void a(@NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, com.ironsource.environment.thread.a.a.a(new c(str, list)), 0L, 2, null);
    }
}
