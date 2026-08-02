package com.ironsource;

import android.app.Activity;
import com.ironsource.Ef;
import com.ironsource.F0;
import com.ironsource.InterfaceC2563nb;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2594p6 implements InterfaceC2469i6 {
    private final Jb a;
    private final V0 b;
    private final AbstractC2731x0 c;
    private InterfaceC2647s6 d;
    private final Function2<C, I, C2451h6> e;
    private final Ef f;
    private final InterfaceC2592p4 g;
    private C2486j6 h;
    private b i;
    private a j;
    private final Eg k;
    private Ef.a l;
    private Long m;

    /* renamed from: com.ironsource.p6$a */
    public interface a {
        void a(C2594p6 c2594p6, IronSourceError ironSourceError);

        void a(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.p6$b */
    public interface b {
        void a(C2594p6 c2594p6);

        void b(C2594p6 c2594p6, IronSourceError ironSourceError);

        void b(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.p6$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.p6$e */
    /* synthetic */ class e extends FunctionReferenceImpl implements Function2<C, I, C2451h6> {
        e(Object obj) {
            super(2, obj, C2594p6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2451h6 invoke(C p0, I p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((C2594p6) this.receiver).a(p0, p1);
        }
    }

    /* renamed from: com.ironsource.p6$f */
    static final class f extends Lambda implements Function1<C2594p6, Unit> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final void a(C2594p6 weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            b bVar = weak.i;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.k.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2594p6 c2594p6) {
            a(c2594p6);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2594p6(Jb mediationServices, V0 adUnitTools, AbstractC2731x0 adUnitData, InterfaceC2647s6 fullscreenListener, Gg gg, Function2<? super C, ? super I, C2451h6> function2, Ef taskScheduler, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = function2;
        this.f = taskScheduler;
        this.g = currentTimeProvider;
        this.k = a(gg);
    }

    private final void i() {
        String c2 = c();
        if (c2.length() > 0) {
            this.a.b().b(c2, b());
            G3 a2 = this.a.p().a(c2, b());
            if (a2.d()) {
                this.b.e().a().b(c2, a2.e());
            }
        }
    }

    protected final void finalize() {
        IronLog.INTERNAL.verbose(C2588p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C2594p6 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function2 function2 = this$0.e;
        if (function2 == null) {
            function2 = new e(this$0);
        }
        C2451h6 c2451h6 = (C2451h6) function2.invoke(instanceData, adInstancePayload);
        c2451h6.a(this$0);
        return c2451h6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC2726wd f() {
        int i = c.a[b().ordinal()];
        if (i == 1) {
            return this.a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.a.F();
    }

    private final InterfaceC2563nb<Unit> g() {
        if (!this.k.h()) {
            return new InterfaceC2563nb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.a.p().a(c(), b()).d()) {
            return new InterfaceC2563nb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.a.g().a(this.c.b().c()).d()) {
            return new InterfaceC2563nb.b(Unit.INSTANCE);
        }
        return new InterfaceC2563nb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        Ef ef = this.f;
        Ef.b a2 = T6.a(this, f.a);
        Duration.Companion companion = Duration.INSTANCE;
        this.l = ef.a(a2, DurationKt.toDuration(b2, DurationUnit.MILLISECONDS));
    }

    public final InterfaceC2647s6 d() {
        return this.d;
    }

    public final LevelPlayAdInfo e() {
        B e2 = this.k.e();
        if (e2 != null) {
            return e2.e();
        }
        return null;
    }

    public final void a(InterfaceC2647s6 interfaceC2647s6) {
        Intrinsics.checkNotNullParameter(interfaceC2647s6, "<set-?>");
        this.d = interfaceC2647s6;
    }

    public final void a(b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C2588p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.i = loadListener;
        this.m = Long.valueOf(this.g.a());
        this.b.a(new C2641s0(this.c.b()));
        E e2 = new E() { // from class: com.ironsource.p6$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c2, I i) {
                B b2;
                b2 = C2594p6.b(C2594p6.this, c2, i);
                return b2;
            }
        };
        this.b.e().e().a(this.c.u());
        this.k.a(e2);
    }

    @Override // com.ironsource.F
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k.d(instance);
        this.b.e().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    /* renamed from: com.ironsource.p6$d */
    public static final class d implements Mg {
        d() {
        }

        @Override // com.ironsource.Mg
        public void a(int i, String errorReason) {
            Long l;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l2 = C2594p6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C2594p6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C2594p6.this.b.e().e().a(l != null ? l.longValue() : 0L, i, errorReason, C2594p6.this.c.u());
            b bVar = C2594p6.this.i;
            if (bVar != null) {
                bVar.b(C2594p6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.Mg
        public void b(B instance) {
            Long l;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l2 = C2594p6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C2594p6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C2594p6.this.b.e().e().a(l != null ? l.longValue() : 0L, C2594p6.this.c.u());
            C2594p6.this.h();
            b bVar = C2594p6.this.i;
            if (bVar != null) {
                bVar.b(C2594p6.this, instance.e());
            }
        }

        @Override // com.ironsource.Mg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C2594p6.this.b.e().a().e(C2594p6.this.c());
            C2594p6.this.h();
            b bVar = C2594p6.this.i;
            if (bVar != null) {
                bVar.c(C2594p6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC2469i6
    public void b(C2451h6 fullscreenInstance) {
        InterfaceC2726wd f2;
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        if (fullscreenInstance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.e().a().b(c());
        this.k.c();
        this.h = null;
        this.d.onClosed();
    }

    public /* synthetic */ C2594p6(Jb jb, V0 v0, AbstractC2731x0 abstractC2731x0, InterfaceC2647s6 interfaceC2647s6, Gg gg, Function2 function2, Ef ef, InterfaceC2592p4 interfaceC2592p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jb, v0, abstractC2731x0, interfaceC2647s6, (i & 16) != 0 ? null : gg, (i & 32) != 0 ? null : function2, (i & 64) != 0 ? new S6(T6.a(v0.a())) : ef, (i & 128) != 0 ? new InterfaceC2592p4.a() : interfaceC2592p4);
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public final void a(Activity activity, a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C2588p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = displayListener;
        this.b.e().a().a(activity, c());
        InterfaceC2563nb<Unit> g = g();
        if (g instanceof InterfaceC2563nb.a) {
            IronSourceError b2 = ((InterfaceC2563nb.a) g).b();
            ironLog.verbose(C2588p0.a(this.b, b2.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.e().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.k.g());
            displayListener.a(this, b2);
            return;
        }
        Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        C2486j6 c2486j6 = new C2486j6(activity);
        this.h = c2486j6;
        this.k.a((K) c2486j6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2451h6 a(C c2, I i) {
        return new C2451h6(new V0(this.b, F0.b.PROVIDER), c2, i);
    }

    private final Eg a(Gg gg) {
        Mg a2 = a();
        if (gg != null) {
            return gg.a(a2, this);
        }
        return new Eg(this.b, this.c, Jb.u.c().h().u(), a2, f(), this);
    }

    private final Mg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC2469i6
    public void a(C2451h6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.k.c();
        this.h = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        i();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(B instance, IronSourceError error) {
        InterfaceC2726wd f2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C2588p0.a(this.b, error.toString(), (String) null, 2, (Object) null));
        if (instance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        C2486j6 c2486j6 = this.h;
        Nd g = this.k.g();
        a(g);
        if (g == Nd.CAN_RECOVER && c2486j6 != null) {
            this.k.a((K) c2486j6, true);
            return;
        }
        this.k.c();
        this.h = null;
        this.b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), g);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(Nd nd) {
        if (nd == Nd.CAN_RECOVER || nd == Nd.NO_LOADED_ADS) {
            this.b.e().h().a(nd);
        }
    }

    @Override // com.ironsource.InterfaceC2469i6
    public void a(C2451h6 fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C2588p0.a(this.b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.e().a().a(c());
        this.d.e();
    }
}
