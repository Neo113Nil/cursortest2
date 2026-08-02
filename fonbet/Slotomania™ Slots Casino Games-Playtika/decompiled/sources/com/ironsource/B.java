package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C2623r0;
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
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {
    static final /* synthetic */ KProperty<Object>[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(B.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0))};
    private final V0 a;
    private final C b;
    private final I c;
    private final ReadWriteProperty d;
    private G e;
    private final BaseAdAdapter<?, ?> f;
    private C2432g5 g;
    private AbstractRunnableC2512ke h;
    private final Map<String, Object> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final AdData n;
    private final C2608q2 o;
    private final boolean p;
    private final String q;
    private final int r;
    private final String s;
    private final IronSource.a t;
    private final int u;
    private final J v;
    private final boolean w;

    public static final class a extends AbstractRunnableC2512ke {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            long a = C2432g5.a(B.this.g);
            IronLog ironLog = IronLog.INTERNAL;
            B b = B.this;
            ironLog.verbose(b.a("Load duration = " + a + ", isBidder = " + b.v()));
            B.this.m = true;
            B.this.f().e().e().a(a, 1025, false, B.this.A());
            B.this.f().e().e().a(a, 1025, "time out", false, B.this.A());
            B b2 = B.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            b2.a(buildLoadFailedError);
        }
    }

    public B(V0 adTools, C instanceData, I adInstancePayload, F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        this.a = adTools;
        this.b = instanceData;
        this.c = adInstancePayload;
        this.d = C2362c7.a(f);
        this.i = new LinkedHashMap();
        this.n = instanceData.h();
        this.o = instanceData.q();
        this.p = instanceData.k().j();
        this.q = instanceData.s();
        this.r = instanceData.t();
        this.s = instanceData.x();
        this.t = instanceData.i();
        this.u = instanceData.w();
        this.v = instanceData.u();
        this.w = instanceData.y();
        BaseAdAdapter<?, ?> a2 = a(instanceData);
        this.f = a2;
        adTools.e().a(new D(adTools, instanceData, a2));
        adTools.e().a(new W1(instanceData.l()));
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            I();
            C();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.a.e().a().a(k());
        F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        G g = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.j = false;
        if (this.m) {
            c();
            this.a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.k) {
            this.a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.k = true;
        long a2 = C2432g5.a(this.g);
        ironLog.verbose(a("Load duration = " + a2));
        this.a.e().e().a(a2, false, this.w);
        a(C2623r0.a.LoadedSuccessfully);
        G g2 = this.e;
        if (g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            g = g2;
        }
        g.b(this);
    }

    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.l) {
            this.a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.l = true;
        this.a.e().a().g(k());
        a(C2623r0.a.ShowedSuccessfully);
        F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.m) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        a a2 = a();
        this.h = a2;
        if (a2 != null) {
            this.a.a((AbstractRunnableC2512ke) a2, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void J() {
        AbstractRunnableC2512ke abstractRunnableC2512ke = this.h;
        if (abstractRunnableC2512ke != null) {
            this.a.b(abstractRunnableC2512ke);
            this.h = null;
        }
    }

    private final int o() {
        Integer f = h().f();
        return (f == null || f.intValue() <= 0) ? this.b.j().h() : f.intValue();
    }

    public final boolean A() {
        return this.w;
    }

    public boolean B() {
        return this.k;
    }

    protected abstract void C();

    public abstract void a(K k);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.a.e().e().a(this.u);
    }

    public void c() {
    }

    public final IronSource.a d() {
        return this.t;
    }

    public LevelPlayAdInfo e() {
        String uuid = this.b.j().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c = this.b.j().b().c();
        String aVar = this.b.i().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, h(), null, this.b.j().l(), MapsKt.toMap(this.i));
    }

    public final V0 f() {
        return this.a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f;
    }

    public final C2608q2 h() {
        return this.b.o();
    }

    protected final AdData i() {
        return this.n;
    }

    protected final C2440gd j() {
        return this.b.j().b().f();
    }

    protected final String k() {
        return this.b.j().l();
    }

    protected final Map<String, Object> l() {
        return this.i;
    }

    public final C2608q2 m() {
        return this.o;
    }

    protected final C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, adapterErrorType, i, errorMessage);
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
    public void onAdShowFailed(final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final String str) {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                B.c(B.this);
            }
        });
    }

    public final String p() {
        return this.q;
    }

    public final String q() {
        return this.s;
    }

    public final int r() {
        return this.r;
    }

    public final F s() {
        return (F) this.d.getValue(this, x[0]);
    }

    public final J t() {
        return this.v;
    }

    public final int u() {
        return this.u;
    }

    public final boolean v() {
        return this.p;
    }

    public final boolean w() {
        return this.m;
    }

    public final boolean x() {
        return this.k;
    }

    public final boolean y() {
        return this.j;
    }

    public final boolean z() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, extraData);
            }
        });
    }

    private final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C2432g5.a(this.g));
        a(new IronSourceError(i, str));
    }

    public final void a(F f) {
        this.d.setValue(this, x[0], f);
    }

    public final void a(C2608q2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.a(value);
    }

    protected final void a(C2623r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.b.a(performance);
    }

    protected final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.a(callback);
    }

    public final void a(boolean z) {
        this.a.e().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(C c) {
        if (c.j().e().q()) {
            return this.c.b();
        }
        return this.a.a(c);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(G listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.e = listener;
        this.j = true;
        try {
            this.a.e().e().a(false, this.w);
            this.g = new C2432g5();
            I();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f;
            Intrinsics.checkNotNull(baseAdAdapter);
            ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.b.h(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.s;
            ironLog.error(a(str));
            b(B0.c(this.b.i()), str);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.a.e().h().g(str2);
            b(B0.c(this.b.i()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.i.putAll(extraData);
        this$0.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
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

    protected final String a(String str) {
        return this.a.a(str, this.s);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C2623r0.a.FailedToLoad);
        G g = this.e;
        if (g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            g = null;
        }
        g.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C2432g5.a(this.g);
        IronLog.INTERNAL.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        J();
        this.j = false;
        if (this.m) {
            c();
            a(adapterErrorType, i, str, a2);
        } else {
            if (this.k) {
                a(adapterErrorType);
                return;
            }
            this.m = true;
            c();
            a(adapterErrorType, i, str, a2);
            a(new IronSourceError(i, str));
        }
    }

    public /* synthetic */ B(V0 v0, C c, I i, F f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, c, i, (i2 & 8) != 0 ? null : f);
    }

    protected final void a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + errorMessage));
        this.m = true;
        this.a.e().a().a(k(), i, errorMessage, null);
        a(C2623r0.a.FailedToShow);
        F s = s();
        if (s != null) {
            s.a(this, new IronSourceError(i, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.a.e().h().a("");
        } else {
            this.a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.a.e().e().b(j, i, this.w);
        } else if (str != null && str.length() != 0) {
            this.a.e().e().a(j, i, str, false, this.w);
        } else {
            this.a.e().e().a(j, i, false, this.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.i.putAll(extraData);
        this$0.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i, errorMessage);
    }
}
