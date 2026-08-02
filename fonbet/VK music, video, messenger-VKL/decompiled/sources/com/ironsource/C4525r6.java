package com.ironsource;

import android.app.Activity;
import com.ironsource.F0;
import com.ironsource.Ff;
import com.ironsource.InterfaceC4477ob;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import xsna.eoo;
import xsna.hhj0;
import xsna.izs;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;
import xsna.zno;
import xsna.zr;

/* renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4525r6 implements InterfaceC4400k6 {
    private final Kb a;
    private final V0 b;
    private final AbstractC4627x0 c;
    private InterfaceC4579u6 d;
    private final wzs<C, I, C4382j6> e;
    private final Ff f;
    private final InterfaceC4488p4 g;
    private C4418l6 h;
    private b i;
    private a j;
    private final Kg k;
    private Ff.a l;
    private Long m;

    /* renamed from: com.ironsource.r6$a */
    public interface a {
        void a(C4525r6 c4525r6, IronSourceError ironSourceError);

        void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.r6$b */
    public interface b {
        void a(C4525r6 c4525r6);

        void b(C4525r6 c4525r6, IronSourceError ironSourceError);

        void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.r6$c */
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

    /* renamed from: com.ironsource.r6$e */
    public /* synthetic */ class e extends FunctionReferenceImpl implements wzs<C, I, C4382j6> {
        public e(Object obj) {
            super(2, obj, C4525r6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // xsna.wzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4382j6 invoke(C c, I i) {
            return ((C4525r6) this.receiver).a(c, i);
        }
    }

    /* renamed from: com.ironsource.r6$f */
    public static final class f extends Lambda implements izs<C4525r6, s3q0> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(C4525r6 c4525r6) {
            b bVar = c4525r6.i;
            if (bVar != null) {
                bVar.a(c4525r6);
            }
            c4525r6.k.a();
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(C4525r6 c4525r6) {
            a(c4525r6);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4525r6(Kb kb, V0 v0, AbstractC4627x0 abstractC4627x0, InterfaceC4579u6 interfaceC4579u6, Mg mg, wzs<? super C, ? super I, C4382j6> wzsVar, Ff ff, InterfaceC4488p4 interfaceC4488p4) {
        this.a = kb;
        this.b = v0;
        this.c = abstractC4627x0;
        this.d = interfaceC4579u6;
        this.e = wzsVar;
        this.f = ff;
        this.g = interfaceC4488p4;
        this.k = a(mg);
    }

    private final void i() {
        String c2 = c();
        if (c2.length() > 0) {
            this.a.b().b(c2, b());
            G3 a2 = this.a.p().a(c2, b());
            if (a2.d()) {
                this.b.d().a().b(c2, a2.e());
            }
        }
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Ff.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C4525r6 c4525r6, C c2, I i) {
        wzs wzsVar = c4525r6.e;
        if (wzsVar == null) {
            wzsVar = new e(c4525r6);
        }
        C4382j6 c4382j6 = (C4382j6) wzsVar.invoke(c2, i);
        c4382j6.a(c4525r6);
        return c4382j6;
    }

    private final InterfaceC4622wd f() {
        int i = c.a[b().ordinal()];
        if (i == 1) {
            return this.a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.a.F();
    }

    private final InterfaceC4477ob<s3q0> g() {
        return !this.k.h() ? new InterfaceC4477ob.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show")) : this.a.p().a(c(), b()).d() ? new InterfaceC4477ob.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, zr.a("placement ", c(), " is capped"))) : this.a.g().a(this.c.b().c()).d() ? new InterfaceC4477ob.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, zr.a("adUnitId ", this.c.b().c(), " is capped"))) : new InterfaceC4477ob.b(s3q0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Ff.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        Ff ff = this.f;
        Ff.b a2 = Gf.a(this, f.a);
        zno.a aVar2 = zno.c;
        this.l = ff.a(a2, eoo.f(b2, DurationUnit.MILLISECONDS));
    }

    public final InterfaceC4579u6 d() {
        return this.d;
    }

    public final LevelPlayAdInfo e() {
        B e2 = this.k.e();
        if (e2 != null) {
            return e2.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    public final void a(InterfaceC4579u6 interfaceC4579u6) {
        this.d = interfaceC4579u6;
    }

    public final void a(b bVar) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.i = bVar;
        this.m = Long.valueOf(this.g.a());
        this.b.a(new C4537s0(this.c.b()));
        hhj0 hhj0Var = new hhj0(this, 13);
        this.b.d().e().a(this.c.u());
        this.k.a(hhj0Var);
    }

    /* renamed from: com.ironsource.r6$d */
    public static final class d implements Sg {
        public d() {
        }

        @Override // com.ironsource.Sg
        public void a(int i, String str) {
            Long l;
            Long l2 = C4525r6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C4525r6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C4525r6.this.b.d().e().a(l != null ? l.longValue() : 0L, i, str, C4525r6.this.c.u());
            b bVar = C4525r6.this.i;
            if (bVar != null) {
                bVar.b(C4525r6.this, new IronSourceError(i, str));
            }
        }

        @Override // com.ironsource.Sg
        public void b(B b) {
            Long l;
            Long l2 = C4525r6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C4525r6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C4525r6.this.b.d().e().a(l != null ? l.longValue() : 0L, C4525r6.this.c.u());
            C4525r6.this.h();
            b bVar = C4525r6.this.i;
            if (bVar != null) {
                bVar.b(C4525r6.this, b.e());
            }
        }

        @Override // com.ironsource.Sg
        public void a(B b) {
            C4525r6.this.b.d().a().e(C4525r6.this.c());
            C4525r6.this.h();
            b bVar = C4525r6.this.i;
            if (bVar != null) {
                bVar.c(C4525r6.this, b.e());
            }
        }
    }

    @Override // com.ironsource.F
    public void b(B b2) {
        this.k.d(b2);
        this.b.d().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    @Override // com.ironsource.InterfaceC4400k6
    public void b(C4382j6 c4382j6) {
        InterfaceC4622wd f2;
        if (c4382j6.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.d().a().b(c());
        this.k.c();
        this.h = null;
        this.d.onClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4525r6(Kb kb, V0 v0, AbstractC4627x0 abstractC4627x0, InterfaceC4579u6 interfaceC4579u6, Mg mg, wzs wzsVar, Ff ff, InterfaceC4488p4 interfaceC4488p4, int i, zcl zclVar) {
        this(kb, v0, abstractC4627x0, interfaceC4579u6, (i & 16) != 0 ? null : mg, (i & 32) != 0 ? null : wzsVar, (i & 64) != 0 ? new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : ff, (i & 128) != 0 ? new InterfaceC4488p4.a() : interfaceC4488p4);
    }

    public final void a(Activity activity, a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4484p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = aVar;
        this.b.d().a().a(activity, c());
        InterfaceC4477ob<s3q0> g = g();
        if (g instanceof InterfaceC4477ob.a) {
            IronSourceError b2 = ((InterfaceC4477ob.a) g).b();
            ironLog.verbose(C4484p0.a(this.b, b2.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.d().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.k.g());
            aVar.a(this, b2);
            return;
        }
        Ff.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.a();
        }
        C4418l6 c4418l6 = new C4418l6(activity);
        this.h = c4418l6;
        this.k.a((K) c4418l6, false);
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4382j6 a(C c2, I i) {
        return new C4382j6(new V0(this.b, F0.b.PROVIDER), c2, i);
    }

    private final Kg a(Mg mg) {
        Sg a2 = a();
        if (mg != null) {
            return mg.a(a2, this);
        }
        return new Kg(this.b, this.c, Kb.u.c().h().u(), a2, f(), this);
    }

    private final Sg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC4400k6
    public void a(C4382j6 c4382j6) {
        this.k.c();
        this.h = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, c4382j6.e());
        }
        i();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(B b2, IronSourceError ironSourceError) {
        InterfaceC4622wd f2;
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, ironSourceError.toString(), (String) null, 2, (Object) null));
        if (b2.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        C4418l6 c4418l6 = this.h;
        Nd g = this.k.g();
        a(g);
        if (g == Nd.CAN_RECOVER && c4418l6 != null) {
            this.k.a((K) c4418l6, true);
            return;
        }
        this.k.c();
        this.h = null;
        this.b.d().a().a(c(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), g);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, ironSourceError);
        }
    }

    private final void a(Nd nd) {
        if (nd == Nd.CAN_RECOVER || nd == Nd.NO_LOADED_ADS) {
            this.b.d().h().a(nd);
        }
    }

    @Override // com.ironsource.InterfaceC4400k6
    public void a(C4382j6 c4382j6, LevelPlayReward levelPlayReward) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, c4382j6.q(), (String) null, 2, (Object) null));
        this.d.a(levelPlayReward);
    }

    @Override // com.ironsource.F
    public void a(B b2) {
        this.b.d().a().a(c());
        this.d.e();
    }
}
