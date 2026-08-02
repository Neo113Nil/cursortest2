package com.ironsource;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.ironsource.Df;
import com.ironsource.E0;
import com.ironsource.InterfaceC4182lb;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.S4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.be5;
import defpackage.bnk;
import defpackage.lnb;
import defpackage.ot8;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4231o6 implements InterfaceC4106h6 {

    @NotNull
    private final Ib a;

    @NotNull
    private final T0 b;

    @NotNull
    private final AbstractC4386x0 c;

    @NotNull
    private InterfaceC4284r6 d;

    @NotNull
    private final W8 e;

    @Nullable
    private final Function2<C, I, C4088g6> f;

    @NotNull
    private final Df g;

    @NotNull
    private final InterfaceC4193m4 h;

    @Nullable
    private C4124i6 i;

    @Nullable
    private b j;

    @Nullable
    private a k;

    @NotNull
    private final Hg l;

    @Nullable
    private Df.a m;

    @Nullable
    private Long n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$a */
    public interface a {
        void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError);

        void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$b */
    public interface b {
        void a(@NotNull C4231o6 c4231o6);

        void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError);

        void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

        void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$c */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$e */
    public /* synthetic */ class e extends ot8 implements Function2<C, I, C4088g6> {
        public e(Object obj) {
            super(2, 0, C4231o6.class, obj, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;");
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4088g6 invoke(@NotNull C c, @NotNull I i) {
            c.getClass();
            i.getClass();
            return ((C4231o6) this.receiver).a(c, i);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$f */
    public static final class f extends xka implements Function1<C4231o6, Unit> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(1);
            this.a = j;
        }

        public final void a(@NotNull C4231o6 c4231o6) {
            c4231o6.getClass();
            b bVar = c4231o6.j;
            if (bVar != null) {
                bVar.a(c4231o6);
            }
            c4231o6.l.a(new S4.a(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4231o6) obj);
            return Unit.a;
        }
    }

    public /* synthetic */ C4231o6(Ib ib, T0 t0, AbstractC4386x0 abstractC4386x0, InterfaceC4284r6 interfaceC4284r6, W8 w8, Jg jg, Function2 function2, Df df, InterfaceC4193m4 interfaceC4193m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ib, t0, abstractC4386x0, interfaceC4284r6, w8, (i & 32) != 0 ? null : jg, (i & 64) != 0 ? null : function2, (i & 128) != 0 ? new Cf(null, null, null, 7, null) : df, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new InterfaceC4193m4.a() : interfaceC4193m4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC4363vd f() {
        int i = c.a[b().ordinal()];
        if (i == 1) {
            return this.a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.a.G();
    }

    private final InterfaceC4182lb<Unit> g() {
        return !this.l.g() ? new InterfaceC4182lb.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show")) : this.a.p().a(c(), b()).d() ? new InterfaceC4182lb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, lnb.o("placement ", c(), " is capped"))) : this.a.g().a(this.c.b().c()).d() ? new InterfaceC4182lb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, lnb.o("adUnitId ", this.c.b().c(), " is capped"))) : new InterfaceC4182lb.b(Unit.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Df.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, "scheduling load expiration for " + b() + " in " + b2 + " ms", (String) null, 2, (Object) null));
        Df df = this.g;
        wd5 wd5Var = xd5.b;
        this.m = df.a(this, wkn.S(b2, be5.MILLISECONDS), new f(b2));
    }

    private final void i() {
        String c2 = c();
        if (c2.length() > 0) {
            this.a.b().b(c2, b());
            D3 a2 = this.a.p().a(c2, b());
            if (a2.d()) {
                this.b.f().a().b(c2, a2.e());
            }
        }
    }

    public final void a(@NotNull Activity activity, @NotNull a aVar) {
        activity.getClass();
        aVar.getClass();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4243p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.k = aVar;
        this.b.f().a().a(activity, c());
        InterfaceC4182lb<Unit> g = g();
        if (g instanceof InterfaceC4182lb.a) {
            IronSourceError b2 = ((InterfaceC4182lb.a) g).b();
            ironLog.verbose(C4243p0.a(this.b, b2.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.f().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.l.f());
            aVar.a(this, b2);
            return;
        }
        Df.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a();
        }
        C4124i6 c4124i6 = new C4124i6(activity);
        this.i = c4124i6;
        this.l.a((K) c4124i6, false);
    }

    @Override // com.ironsource.InterfaceC4106h6
    public void b(@NotNull C4088g6 c4088g6) {
        InterfaceC4363vd f2;
        c4088g6.getClass();
        if (c4088g6.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.f().a().b(c());
        this.l.b();
        this.i = null;
        this.d.onClosed();
    }

    @Nullable
    public final LevelPlayAdInfo e() {
        B d2 = this.l.d();
        if (d2 != null) {
            return d2.e();
        }
        return null;
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Df.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
    }

    @NotNull
    public final InterfaceC4284r6 d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C4231o6 c4231o6, C c2, I i) {
        c4231o6.getClass();
        c2.getClass();
        i.getClass();
        Function2 function2 = c4231o6.f;
        if (function2 == null) {
            function2 = new e(c4231o6);
        }
        C4088g6 c4088g6 = (C4088g6) function2.invoke(c2, i);
        c4088g6.a(c4231o6);
        return c4088g6;
    }

    @Override // com.ironsource.F
    public void b(@NotNull B b2) {
        b2.getClass();
        this.l.d(b2);
        this.e.a(b2.e());
        this.b.f().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4231o6(@NotNull Ib ib, @NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull InterfaceC4284r6 interfaceC4284r6, @NotNull W8 w8, @Nullable Jg jg, @Nullable Function2<? super C, ? super I, C4088g6> function2, @NotNull Df df, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        ib.getClass();
        t0.getClass();
        abstractC4386x0.getClass();
        interfaceC4284r6.getClass();
        w8.getClass();
        df.getClass();
        interfaceC4193m4.getClass();
        this.a = ib;
        this.b = t0;
        this.c = abstractC4386x0;
        this.d = interfaceC4284r6;
        this.e = w8;
        this.f = function2;
        this.g = df;
        this.h = interfaceC4193m4;
        this.l = a(jg);
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o6$d */
    public static final class d implements Pg {
        public d() {
        }

        @Override // com.ironsource.Pg
        public void a(int i, @NotNull String str) {
            Long l;
            str.getClass();
            Long l2 = C4231o6.this.n;
            if (l2 != null) {
                l = Long.valueOf(C4231o6.this.h.a() - l2.longValue());
            } else {
                l = null;
            }
            C4231o6.this.b.f().e().a(l != null ? l.longValue() : 0L, i, str, C4231o6.this.c.u());
            b bVar = C4231o6.this.j;
            if (bVar != null) {
                bVar.b(C4231o6.this, new IronSourceError(i, str));
            }
        }

        @Override // com.ironsource.Pg
        public void b(@NotNull B b) {
            Long l;
            b.getClass();
            Long l2 = C4231o6.this.n;
            if (l2 != null) {
                l = Long.valueOf(C4231o6.this.h.a() - l2.longValue());
            } else {
                l = null;
            }
            C4231o6.this.b.f().e().a(l != null ? l.longValue() : 0L, C4231o6.this.c.u());
            C4231o6.this.h();
            b bVar = C4231o6.this.j;
            if (bVar != null) {
                bVar.b(C4231o6.this, b.e());
            }
        }

        @Override // com.ironsource.Pg
        public void a(@NotNull B b) {
            b.getClass();
            C4231o6.this.b.f().a().e(C4231o6.this.c());
            C4231o6.this.h();
            b bVar = C4231o6.this.j;
            if (bVar != null) {
                bVar.c(C4231o6.this, b.e());
            }
        }
    }

    public final void a(@NotNull InterfaceC4284r6 interfaceC4284r6) {
        interfaceC4284r6.getClass();
        this.d = interfaceC4284r6;
    }

    public final void a(@NotNull b bVar) {
        bVar.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = bVar;
        this.n = Long.valueOf(this.h.a());
        this.b.a(new C4296s0(this.c.b()));
        bnk bnkVar = new bnk(this, 17);
        this.b.f().e().a(this.c.u());
        this.l.a(bnkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4088g6 a(C c2, I i) {
        return new C4088g6(new T0(this.b, E0.b.PROVIDER), c2, i);
    }

    private final Hg a(Jg jg) {
        Pg a2 = a();
        if (jg != null) {
            return jg.a(a2, this);
        }
        return new Hg(this.b, this.c, Ib.v.c().h().v(), a2, f(), this);
    }

    private final Pg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC4106h6
    public void a(@NotNull C4088g6 c4088g6) {
        c4088g6.getClass();
        this.l.b();
        this.i = null;
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, c4088g6.e());
        }
        i();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(@NotNull B b2, @NotNull IronSourceError ironSourceError) {
        InterfaceC4363vd f2;
        b2.getClass();
        ironSourceError.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, ironSourceError.toString(), (String) null, 2, (Object) null));
        if (b2.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        C4124i6 c4124i6 = this.i;
        Md f3 = this.l.f();
        a(f3);
        if (f3 == Md.CAN_RECOVER && c4124i6 != null) {
            this.l.a((K) c4124i6, true);
            return;
        }
        this.l.b();
        this.i = null;
        this.b.f().a().a(c(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), f3);
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, ironSourceError);
        }
    }

    private final void a(Md md) {
        if (md == Md.CAN_RECOVER || md == Md.NO_LOADED_ADS) {
            this.b.f().h().a(md);
        }
    }

    @Override // com.ironsource.InterfaceC4106h6
    public void a(@NotNull C4088g6 c4088g6, @NotNull LevelPlayReward levelPlayReward) {
        c4088g6.getClass();
        levelPlayReward.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, c4088g6.q(), (String) null, 2, (Object) null));
        this.d.a(levelPlayReward);
    }

    @Override // com.ironsource.F
    public void a(@NotNull B b2) {
        b2.getClass();
        this.b.f().a().a(c());
        this.d.e();
    }
}
