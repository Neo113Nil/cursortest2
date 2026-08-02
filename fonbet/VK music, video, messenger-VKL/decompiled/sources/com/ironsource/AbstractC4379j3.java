package com.ironsource;

import android.text.TextUtils;
import com.ironsource.Af;
import com.ironsource.F0;
import com.ironsource.L8;
import com.ironsource.R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import xsna.eq0;
import xsna.fp;
import xsna.na8;
import xsna.pzl;

/* renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4379j3<Listener extends R0> implements NetworkInitializationListener, Af.a, E0, AdapterAdListener, L8.b {
    protected C4448n0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected F0 d;
    protected h e;
    protected C4336gd g;
    protected C4288e1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C4328g5 m;
    private final C4504q2 o;
    private final InterfaceC4515qd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private Af n = new Af(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* renamed from: com.ironsource.j3$a */
    public class a extends AbstractRunnableC4408ke {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.L();
        }
    }

    /* renamed from: com.ironsource.j3$b */
    public class b extends AbstractRunnableC4408ke {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.K();
        }
    }

    /* renamed from: com.ironsource.j3$c */
    public class c extends AbstractRunnableC4408ke {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        public c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.a(this.b, this.c);
        }
    }

    /* renamed from: com.ironsource.j3$d */
    public class d extends AbstractRunnableC4408ke {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.I();
        }
    }

    /* renamed from: com.ironsource.j3$e */
    public class e extends AbstractRunnableC4408ke {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.a(this.b, this.c, this.d);
        }
    }

    /* renamed from: com.ironsource.j3$f */
    public class f extends AbstractRunnableC4408ke {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.J();
        }
    }

    /* renamed from: com.ironsource.j3$g */
    public class g extends AbstractRunnableC4408ke {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            AbstractC4379j3.this.H();
        }
    }

    /* renamed from: com.ironsource.j3$h */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4379j3(InterfaceC4515qd interfaceC4515qd, C4448n0 c4448n0, BaseAdAdapter<?, ?> baseAdAdapter, C4288e1 c4288e1, C4504q2 c4504q2, Listener listener) {
        this.a = c4448n0;
        this.b = listener;
        this.d = new F0(c4448n0.a(), F0.b.PROVIDER, this);
        this.h = c4288e1;
        this.i = c4288e1.c();
        this.c = baseAdAdapter;
        this.o = c4504q2;
        this.p = interfaceC4515qd;
        a(h.NONE);
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((Af.a) this);
            G();
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.e;
                z = false;
                if (hVar == h.LOADING) {
                    long a2 = C4328g5.a(this.m);
                    ironLog.verbose(a("Load duration = " + a2));
                    if (this.d != null) {
                        if (v()) {
                            this.d.f.a(a2);
                        } else {
                            this.d.f.a(a2, false);
                        }
                    }
                    a(h.LOADED);
                    z = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a("unexpected load success for " + k() + ", state - " + this.e));
                    h hVar2 = this.e;
                    StringBuilder sb = new StringBuilder("unexpected load success, state - ");
                    sb.append(hVar2);
                    String sb2 = sb.toString();
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.s(sb2);
                        } else {
                            this.d.j.p(sb2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init success for " + k() + ", state - " + this.e));
        if (this.d != null) {
            this.d.j.n("unexpected init success, state - " + this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a2 = C4328g5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder b2 = fp.b(a2, "Load duration = ", ", state = ");
        b2.append(this.e);
        b2.append(", isBidder = ");
        b2.append(w());
        ironLog.verbose(a(b2.toString()));
        synchronized (this.q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    F0 f0 = this.d;
                    if (f0 != null) {
                        f0.f.a(a2, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                        this.d.f.a(a2, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                    }
                    this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(a("unexpected timeout for " + k() + ", state - " + this.e + ", error - 1025"));
                if (this.d != null) {
                    this.d.j.u("unexpected timeout, state - " + this.e + ", error - 1025");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4504q2 c4504q2 = this.o;
        if (c4504q2 == null) {
            return this.a.f();
        }
        Integer f2 = c4504q2.f();
        int f3 = (f2 == null || f2.intValue() <= 0) ? this.a.f() : f2.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + f3 + " seconds"));
        return f3;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4504q2 i = i();
        String k = i.k();
        Map<String, Object> a2 = C4369ia.a(i.a());
        a2.put("adUnit", this.a.a());
        b(k);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.d();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new C4328g5();
            this.k = a(k, a2);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(B0.c(this.a.a()), str);
                return;
            }
            this.n.a((Af.a) this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(B0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str3);
            }
            onInitFailed(B0.c(this.a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (Exception e2) {
                    C4452n4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
            }
            F0 f0 = this.d;
            if (f0 != null) {
                f0.f();
                this.d = null;
            }
            Af af = this.n;
            if (af != null) {
                af.d();
                this.n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public String h() {
        return this.a.c();
    }

    public C4504q2 i() {
        return this.o;
    }

    public String j() {
        C4336gd c4336gd = this.g;
        return c4336gd == null ? "" : c4336gd.c();
    }

    public String k() {
        return na8.a(hashCode(), c(), " ");
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.a.g();
    }

    public Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C4369ia.a(this.i));
        return hashMap;
    }

    public Integer r() {
        C4448n0 c4448n0 = this.a;
        if (c4448n0 != null) {
            return Integer.valueOf(c4448n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    public InterfaceC4515qd u() {
        return this.p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.h.i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        hashMap.put("instanceType", Integer.valueOf(l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("dynamicDemandSource", this.j);
        }
        hashMap.put("sessionDepth", r());
        if (this.a.e() != null && this.a.e().length() > 0) {
            hashMap.put("genericParams", this.a.e());
        }
        if (!TextUtils.isEmpty(this.a.c())) {
            hashMap.put("auctionId", this.a.c());
        }
        if (b(c0)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.d()));
            if (!TextUtils.isEmpty(this.a.b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.a.b());
            }
        }
        if (!TextUtils.isEmpty(this.a.g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.g().getCustomNetwork());
        }
        return hashMap;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.a.a();
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(C0 c0) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD, C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.LOAD_AD_NO_FILL, C0.RELOAD_AD, C0.RELOAD_AD_SUCCESS, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_NO_FILL, C0.DESTROY_AD, C0.AD_PRESENT_SCREEN, C0.AD_DISMISS_SCREEN, C0.AD_LEFT_APPLICATION, C0.AD_OPENED, C0.AD_CLOSED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.AD_REWARDED)).contains(c0);
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.a.a().name() + " - " + k() + " - state = " + this.e;
        return TextUtils.isEmpty(str) ? str2 : pzl.b(str2, " - ", str);
    }

    @Override // com.ironsource.Af.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4328g5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init failed for " + k() + ", state - " + this.e + ", error - " + i + ", " + str));
        if (this.d != null) {
            this.d.j.m("unexpected init failed, state - " + this.e + ", error - " + i + ", " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4328g5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder a3 = eq0.a(i, "Load duration = ", ", error = ", a2);
        a3.append(", ");
        a3.append(str);
        ironLog.verbose(a(a3.toString()));
        Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i, str, a2);
                a(h.FAILED);
                this.b.a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i, str, a2);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a("ad expired for " + this.h.f() + ", state = " + this.e));
                F0 f0 = this.d;
                if (f0 != null) {
                    f0.j.a("ad expired, state = " + this.e);
                }
                return;
            }
            ironLog.error(a("unexpected load failed for " + k() + ", state - " + this.e + ", error - " + i + ", " + str));
            h hVar2 = this.e;
            StringBuilder sb = new StringBuilder("unexpected load failed, state - ");
            sb.append(hVar2);
            sb.append(", error - ");
            sb.append(i);
            sb.append(", ");
            sb.append(str);
            String sb2 = sb.toString();
            if (this.d != null) {
                if (v()) {
                    this.d.j.r(sb2);
                } else if (this.a.a() != IronSource.a.REWARDED_VIDEO || this.e != h.SHOWING) {
                    this.d.j.o(sb2);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.a(j, i);
                    return;
                } else {
                    this.d.f.b(j, i, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
