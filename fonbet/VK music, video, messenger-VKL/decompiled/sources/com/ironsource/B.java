package com.ironsource;

import com.ironsource.B;
import com.ironsource.C4519r0;
import com.ironsource.Ff;
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
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.time.DurationUnit;
import xsna.eoo;
import xsna.eq0;
import xsna.fpf0;
import xsna.go9;
import xsna.js2;
import xsna.ku5;
import xsna.nq4;
import xsna.p7f0;
import xsna.pn00;
import xsna.qcy;
import xsna.rc4;
import xsna.zcl;
import xsna.zno;

/* loaded from: classes13.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {
    static final /* synthetic */ qcy<Object>[] y;
    private final V0 a;
    private final C b;
    private final I c;
    private final Ff d;
    private final p7f0 e;
    private G f;
    private final BaseAdAdapter<?, ?> g;
    private C4328g5 h;
    private Ff.a i;
    private final Map<String, Object> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final AdData o;
    private final C4504q2 p;
    private final boolean q;
    private final String r;
    private final int s;
    private final String t;
    private final IronSource.a u;
    private final int v;
    private final J w;
    private final boolean x;

    public static final class a extends AbstractRunnableC4408ke {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            long a = C4328g5.a(B.this.h);
            IronLog ironLog = IronLog.INTERNAL;
            B b = B.this;
            ironLog.verbose(b.a("Load duration = " + a + ", isBidder = " + b.v()));
            B.this.n = true;
            B.this.f().d().e().a(a, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false, B.this.A());
            B.this.f().d().e().a(a, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false, B.this.A());
            B.this.a(ErrorBuilder.buildLoadFailedError("time out"));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(B.class, "listener", "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0);
        fpf0.a.getClass();
        y = new qcy[]{mutablePropertyReference1Impl};
    }

    public B(V0 v0, C c, I i, Ff ff, F f) {
        this.a = v0;
        this.b = c;
        this.c = i;
        this.d = ff;
        this.e = C4276d7.a(f);
        this.j = new LinkedHashMap();
        this.o = c.h();
        this.p = c.q();
        this.q = c.k().j();
        this.r = c.s();
        this.s = c.t();
        this.t = c.x();
        this.u = c.i();
        this.v = c.w();
        this.w = c.u();
        this.x = c.y();
        BaseAdAdapter<?, ?> a2 = a(c);
        this.g = a2;
        v0.d().a(new D(v0, c, a2));
        v0.d().a(new W1(c.l()));
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            I();
            C();
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("unexpected error while calling adapter.loadAd() - ", th.getMessage());
            IronLog.INTERNAL.error(a(b));
            this.a.d().h().g(b);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, b);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.a.d().a().a(k());
        F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.k = false;
        if (this.n) {
            c();
            this.a.d().h().f("instance load success after it was already failed");
            return;
        }
        if (this.l) {
            this.a.d().h().f("instance load success after it was already loaded");
            return;
        }
        this.l = true;
        long a2 = C4328g5.a(this.h);
        ironLog.verbose(a("Load duration = " + a2));
        this.a.d().e().a(a2, false, this.x);
        a(C4519r0.a.LoadedSuccessfully);
        G g = this.f;
        (g != null ? g : null).b(this);
    }

    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.m) {
            this.a.d().h().f("instance opened after it was already opened");
            return;
        }
        this.m = true;
        this.a.d().a().g(k());
        a(C4519r0.a.ShowedSuccessfully);
        F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.n) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        Ff ff = this.d;
        a a2 = a();
        zno.a aVar = zno.c;
        this.i = ff.a(a2, eoo.e(o(), DurationUnit.SECONDS));
    }

    private final void J() {
        Ff.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        this.i = null;
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

    public abstract void a(K k);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.a.d().e().a(this.v);
    }

    public final C4336gd j() {
        return this.b.j().b().f();
    }

    public final String k() {
        return this.b.j().l();
    }

    public final Map<String, Object> l() {
        return this.j;
    }

    public final C4504q2 m() {
        return this.p;
    }

    public final C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new nq4(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i, final String str) {
        a(new Runnable() { // from class: xsna.mu5
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, adapterErrorType, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i, final String str) {
        a(new Runnable() { // from class: xsna.nu5
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final String str) {
        a(new Runnable() { // from class: xsna.lu5
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new rc4(this, 1));
    }

    public final String p() {
        return this.r;
    }

    public final String q() {
        return this.t;
    }

    public final int r() {
        return this.s;
    }

    public final F s() {
        return (F) this.e.getValue(this, y[0]);
    }

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

    public void c() {
    }

    public final IronSource.a d() {
        return this.u;
    }

    public LevelPlayAdInfo e() {
        return new LevelPlayAdInfo(this.b.j().b().b().toString(), this.b.j().b().c(), this.b.i().toString(), h(), null, this.b.j().l(), pn00.t(this.j));
    }

    public final V0 f() {
        return this.a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.g;
    }

    public final C4504q2 h() {
        return this.b.o();
    }

    public final AdData i() {
        return this.o;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(Map<String, Object> map) {
        a(new ku5(0, this, map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> map) {
        a(new js2(1, this, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B b) {
        b.H();
    }

    private final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.n = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4328g5.a(this.h));
        a(new IronSourceError(i, str));
    }

    public final void a(F f) {
        this.e.setValue(this, y[0], f);
    }

    public final void a(C4504q2 c4504q2) {
        this.b.a(c4504q2);
    }

    public final void a(C4519r0.a aVar) {
        this.b.a(aVar);
    }

    public final void a(Runnable runnable) {
        this.a.c(runnable);
    }

    public final void a(boolean z) {
        this.a.d().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(C c) {
        if (c.j().e().q()) {
            return this.c.b();
        }
        return this.a.a(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b, Map map) {
        b.j.putAll(map);
        b.G();
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(G g) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f = g;
        this.k = true;
        try {
            this.a.d().e().a(false, this.x);
            this.h = new C4328g5();
            I();
            ?? networkAdapter = this.g.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.b.h(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.t;
            ironLog.error(a(str));
            b(B0.c(this.b.i()), str);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("loadAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(a(b));
            this.a.d().h().g(b);
            b(B0.c(this.b.i()), b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b) {
        b.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B b, int i, String str) {
        b.b(i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B(V0 v0, C c, I i, Ff ff, F f, int i2, zcl zclVar) {
        this(v0, c, i, (i2 & 8) != 0 ? new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : ff, (i2 & 16) != 0 ? null : f);
    }

    public static /* synthetic */ String a(B b, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return b.a(str);
    }

    public final String a(String str) {
        return this.a.a(str, this.t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C4519r0.a.FailedToLoad);
        G g = this.f;
        if (g == null) {
            g = null;
        }
        g.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4328g5.a(this.h);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder a3 = eq0.a(i, "Load duration = ", ", error = ", a2);
        a3.append(", ");
        a3.append(str);
        ironLog.verbose(a(a3.toString()));
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

    public final void a(int i, String str) {
        IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + str));
        this.n = true;
        this.a.d().a().a(k(), i, str, null);
        a(C4519r0.a.FailedToShow);
        F s = s();
        if (s != null) {
            s.a(this, new IronSourceError(i, str));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.a.d().h().a("");
        } else {
            this.a.d().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.a.d().e().b(j, i, this.x);
        } else if (str != null && str.length() != 0) {
            this.a.d().e().a(j, i, str, false, this.x);
        } else {
            this.a.d().e().a(j, i, false, this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B b, Map map) {
        b.j.putAll(map);
        b.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B b, AdapterErrorType adapterErrorType, int i, String str) {
        b.a(adapterErrorType, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B b, int i, String str) {
        b.a(i, str);
    }
}
