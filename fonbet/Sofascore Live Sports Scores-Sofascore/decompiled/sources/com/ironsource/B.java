package com.ironsource;

import com.ironsource.B;
import com.ironsource.C4278r0;
import com.ironsource.Df;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.a70;
import defpackage.ax0;
import defpackage.be5;
import defpackage.dmi;
import defpackage.duf;
import defpackage.iy;
import defpackage.t0d;
import defpackage.tub;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xka;
import defpackage.xw0;
import defpackage.yw0;
import defpackage.znf;
import defpackage.zw0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {
    static final /* synthetic */ KProperty<Object>[] y = {duf.a.mutableProperty1(new t0d(B.class, "listener", "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0))};

    @NotNull
    private final T0 a;

    @NotNull
    private final C b;

    @NotNull
    private final I c;

    @NotNull
    private final Df d;

    @NotNull
    private final znf e;
    private G f;

    @Nullable
    private final BaseAdAdapter<?, ?> g;

    @Nullable
    private C4051e5 h;

    @Nullable
    private Df.a i;

    @NotNull
    private final Map<String, Object> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    @NotNull
    private final AdData o;

    @Nullable
    private final C4227o2 p;
    private final boolean q;

    @NotNull
    private final String r;
    private final int s;

    @NotNull
    private final String t;

    @NotNull
    private final IronSource.a u;
    private final int v;

    @NotNull
    private final J w;
    private final boolean x;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<Unit> {
        public a() {
            super(0);
        }

        public final void a() {
            long a = C4051e5.a(B.this.h);
            IronLog ironLog = IronLog.INTERNAL;
            B b = B.this;
            ironLog.verbose(b.a("Load duration = " + a + ", isBidder = " + b.v()));
            B.this.n = true;
            B.this.f().f().e().a(a, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false, B.this.A());
            B.this.f().f().e().a(a, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false, B.this.A());
            B b2 = B.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            buildLoadFailedError.getClass();
            b2.a(buildLoadFailedError);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }
    }

    public B(@NotNull T0 t0, @NotNull C c2, @NotNull I i, @NotNull Df df, @Nullable F f) {
        t0.getClass();
        c2.getClass();
        i.getClass();
        df.getClass();
        this.a = t0;
        this.b = c2;
        this.c = i;
        this.d = df;
        this.e = Z6.a(f);
        this.j = new LinkedHashMap();
        this.o = c2.h();
        this.p = c2.q();
        this.q = c2.k().j();
        this.r = c2.s();
        this.s = c2.t();
        this.t = c2.x();
        this.u = c2.i();
        this.v = c2.w();
        this.w = c2.u();
        this.x = c2.y();
        BaseAdAdapter<?, ?> a2 = a(c2);
        this.g = a2;
        t0.f().a(new D(t0, c2, a2));
        t0.f().a(new U1(c2.l()));
    }

    @InterfaceC4307sb
    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        I();
        a(new c());
    }

    @InterfaceC4307sb
    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.a.f().a().a(k());
        F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    @InterfaceC4307sb
    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.k = false;
        if (this.n) {
            c();
            this.a.f().h().f("instance load success after it was already failed");
            return;
        }
        if (this.l) {
            this.a.f().h().f("instance load success after it was already loaded");
            return;
        }
        this.l = true;
        long a2 = C4051e5.a(this.h);
        ironLog.verbose(a("Load duration = " + a2));
        this.a.f().e().a(a2, false, this.x);
        a(C4278r0.a.LoadedSuccessfully);
        G g = this.f;
        if (g != null) {
            g.b(this);
        } else {
            Intrinsics.i("loadListener");
            throw null;
        }
    }

    @InterfaceC4307sb
    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.m) {
            this.a.f().h().f("instance opened after it was already opened");
            return;
        }
        this.m = true;
        this.a.f().a().g(k());
        a(C4278r0.a.ShowedSuccessfully);
        F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    @InterfaceC4307sb
    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.n) {
            return;
        }
        D();
    }

    @InterfaceC4307sb
    private final void I() {
        J();
        Df df = this.d;
        com.ironsource.environment.thread.a a2 = a();
        wd5 wd5Var = xd5.b;
        this.i = df.b(a2, wkn.R(o(), be5.SECONDS));
    }

    private final void J() {
        Df.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4307sb
    public final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4051e5.a(this.h);
        IronLog.INTERNAL.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        J();
        this.k = false;
        if (this.n) {
            c();
            a(adapterErrorType, i, str, a2);
        } else {
            if (this.l) {
                a(adapterErrorType);
                return;
            }
            this.n = true;
            c();
            a(adapterErrorType, i, str, a2);
            a(new IronSourceError(i, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4307sb
    public final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.n = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4051e5.a(this.h));
        a(new IronSourceError(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B b2) {
        b2.getClass();
        b2.H();
    }

    private final int o() {
        Integer f = h().f();
        return (f == null || f.intValue() <= 0) ? this.b.j().h() : f.intValue();
    }

    public final boolean A() {
        return this.x;
    }

    public boolean B() {
        return this.l;
    }

    public abstract void C();

    @InterfaceC4307sb
    public abstract void a(@NotNull K k);

    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = this.b.j().b().b().toString();
        uuid.getClass();
        String c2 = this.b.j().b().c();
        String aVar = this.b.i().toString();
        aVar.getClass();
        return new LevelPlayAdInfo(uuid, c2, aVar, h(), null, this.b.j().l(), tub.p(this.j));
    }

    @NotNull
    public final C4227o2 h() {
        return this.b.o();
    }

    @Nullable
    public final C4077fd j() {
        return this.b.j().b().f();
    }

    @NotNull
    public final String k() {
        return this.b.j().l();
    }

    @NotNull
    public final Map<String, Object> l() {
        return this.j;
    }

    @Nullable
    public final C4227o2 m() {
        return this.p;
    }

    @NotNull
    public final C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        this.a.a(new xw0(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, @NotNull String str) {
        adapterErrorType.getClass();
        str.getClass();
        this.a.a(new ax0(this, adapterErrorType, i, str, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(@NotNull Map<String, Object> map) {
        map.getClass();
        this.a.a(new yw0(this, map, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        map.getClass();
        this.a.a(new yw0(this, map, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, @NotNull String str) {
        str.getClass();
        this.a.a(new zw0(this, i, str, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, @Nullable String str) {
        this.a.a(new zw0(this, i, str, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        this.a.a(new xw0(this, 1));
    }

    @NotNull
    public final String p() {
        return this.r;
    }

    @NotNull
    public final String q() {
        return this.t;
    }

    public final int r() {
        return this.s;
    }

    @Nullable
    public final F s() {
        return (F) this.e.getValue(this, y[0]);
    }

    @NotNull
    public final J t() {
        return this.w;
    }

    public final int u() {
        return this.v;
    }

    public final boolean v() {
        return this.q;
    }

    public final boolean w() {
        return this.n;
    }

    public final boolean x() {
        return this.l;
    }

    public final boolean y() {
        return this.k;
    }

    public final boolean z() {
        return this.m;
    }

    @NotNull
    public final IronSource.a d() {
        return this.u;
    }

    @NotNull
    public final T0 f() {
        return this.a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> g() {
        return this.g;
    }

    @NotNull
    public final AdData i() {
        return this.o;
    }

    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B b2, int i, String str) {
        b2.getClass();
        b2.b(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0<Unit> {
        public c() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, B b) {
            th.getClass();
            b.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("unexpected error while calling adapter.loadAd() - ", th.getMessage());
            IronLog.INTERNAL.error(b.a(q));
            b.f().f().h().g(q);
            b.a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, q);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        public final void a() {
            try {
                B.this.C();
            } catch (Throwable th) {
                B.this.f().a(new gh(th, B.this, 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    @InterfaceC4307sb
    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.a.f().e().a(this.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b2, AdapterErrorType adapterErrorType, int i, String str) {
        b2.getClass();
        adapterErrorType.getClass();
        str.getClass();
        b2.a(adapterErrorType, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b2, int i, String str) {
        b2.getClass();
        str.getClass();
        b2.a(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b2, Map map) {
        b2.getClass();
        map.getClass();
        b2.j.putAll(map);
        b2.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b2) {
        b2.getClass();
        b2.E();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function0<Unit> {
        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
        public final void a() {
            try {
                BaseAdAdapter<?, ?> g = B.this.g();
                g.getClass();
                ?? networkAdapter = g.getNetworkAdapter();
                B b = B.this;
                if (networkAdapter != 0) {
                    networkAdapter.init(b.n().h(), ContextProvider.getInstance().getApplicationContext(), B.this);
                    return;
                }
                T0 f = b.f();
                final B b2 = B.this;
                f.a(new Runnable() { // from class: com.ironsource.fh
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.b.a(B.this);
                    }
                });
            } catch (Throwable th) {
                B.this.f().a(new gh(th, B.this, 0));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(B b) {
            b.getClass();
            String q = dmi.q("loadAd - network adapter not available ", b.q());
            IronLog.INTERNAL.error(b.a(q));
            b.b(A0.c(b.n().i()), q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, B b) {
            th.getClass();
            b.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("loadAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(b.a(q));
            b.f().f().h().g(q);
            b.b(A0.c(b.n().i()), q);
        }
    }

    public final void a(@Nullable F f) {
        this.e.setValue(this, y[0], f);
    }

    public final void a(@NotNull C4227o2 c4227o2) {
        c4227o2.getClass();
        this.b.a(c4227o2);
    }

    public final void a(@NotNull C4278r0.a aVar) {
        aVar.getClass();
        this.b.a(aVar);
    }

    public final void a(boolean z) {
        this.a.f().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(C c2) {
        if (c2.j().e().q()) {
            return this.c.b();
        }
        return this.a.a(c2);
    }

    @InterfaceC4307sb
    public final void a(@NotNull G g) {
        g.getClass();
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f = g;
        this.k = true;
        this.a.f().e().a(false, this.x);
        this.h = new C4051e5();
        I();
        a(new b());
    }

    public final void a(@NotNull Function0<Unit> function0) {
        function0.getClass();
        if (Ib.v.d().h().D()) {
            Hf.a.b(new iy(5, function0));
        } else {
            function0.invoke();
        }
    }

    public static /* synthetic */ String a(B b2, String str, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: createLogMessage");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return b2.a(str);
    }

    @NotNull
    public final String a(@Nullable String str) {
        return this.a.a(str, this.t);
    }

    @InterfaceC4307sb
    private final com.ironsource.environment.thread.a a() {
        return com.ironsource.environment.thread.a.a.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4307sb
    public final void a(IronSourceError ironSourceError) {
        a(C4278r0.a.FailedToLoad);
        G g = this.f;
        if (g != null) {
            g.a(ironSourceError, this);
        } else {
            Intrinsics.i("loadListener");
            throw null;
        }
    }

    @InterfaceC4307sb
    public final void a(int i, @NotNull String str) {
        str.getClass();
        IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + str));
        this.n = true;
        this.a.f().a().a(k(), i, str, null);
        a(C4278r0.a.FailedToShow);
        F s = s();
        if (s != null) {
            s.a(this, new IronSourceError(i, str));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        AdapterErrorType adapterErrorType2 = AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED;
        T0 t0 = this.a;
        if (adapterErrorType == adapterErrorType2) {
            t0.f().h().a("");
        } else {
            t0.f().h().f("instance load failed after it was already loaded");
        }
    }

    public /* synthetic */ B(T0 t0, C c2, I i, Df df, F f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, c2, i, (i2 & 8) != 0 ? new Cf(null, null, null, 7, null) : df, (i2 & 16) != 0 ? null : f);
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.a.f().e().b(j, i, this.x);
        } else if (str != null && str.length() != 0) {
            this.a.f().e().a(j, i, str, false, this.x);
        } else {
            this.a.f().e().a(j, i, false, this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B b2, Map map) {
        b2.getClass();
        map.getClass();
        b2.j.putAll(map);
        b2.F();
    }
}
