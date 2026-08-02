package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4419yf;
import com.ironsource.E0;
import com.ironsource.I8;
import com.ironsource.P0;
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
import defpackage.ljg;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4085g3<Listener extends P0> implements NetworkInitializationListener, C4419yf.a, D0, AdapterAdListener, I8.b {
    protected C4207n0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected E0 d;
    protected h e;
    protected C4077fd g;
    protected C4011c1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C4051e5 m;
    private final C4227o2 o;
    private final InterfaceC4256pd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private C4419yf n = new C4419yf(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$a */
    public class a extends com.ironsource.environment.thread.a {
        public a() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.L();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$b */
    public class b extends com.ironsource.environment.thread.a {
        public b() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.K();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$c */
    public class c extends com.ironsource.environment.thread.a {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        public c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.a(this.b, this.c);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$d */
    public class d extends com.ironsource.environment.thread.a {
        public d() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.I();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$e */
    public class e extends com.ironsource.environment.thread.a {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.a(this.b, this.c, this.d);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$f */
    public class f extends com.ironsource.environment.thread.a {
        public f() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.J();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$g */
    public class g extends com.ironsource.environment.thread.a {
        public g() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4085g3.this.H();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g3$h */
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
    public AbstractC4085g3(InterfaceC4256pd interfaceC4256pd, C4207n0 c4207n0, BaseAdAdapter<?, ?> baseAdAdapter, C4011c1 c4011c1, C4227o2 c4227o2, Listener listener) {
        this.a = c4207n0;
        this.b = listener;
        this.d = new E0(c4207n0.a(), E0.b.PROVIDER, this);
        this.h = c4011c1;
        this.i = c4011c1.c();
        this.c = baseAdAdapter;
        this.o = c4227o2;
        this.p = interfaceC4256pd;
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
            this.n.a((C4419yf.a) this);
            G();
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            E0 e0 = this.d;
            if (e0 != null) {
                e0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4419yf c4419yf = this.n;
        if (c4419yf != null) {
            c4419yf.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.e;
                z = false;
                if (hVar == h.LOADING) {
                    long a2 = C4051e5.a(this.m);
                    ironLog.verbose(a("Load duration = " + a2));
                    if (this.d != null) {
                        boolean v = v();
                        E0 e0 = this.d;
                        if (v) {
                            e0.f.a(a2);
                        } else {
                            e0.f.a(a2, false);
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
                        boolean v2 = v();
                        E0 e02 = this.d;
                        if (v2) {
                            e02.j.s(sb2);
                        } else {
                            e02.j.p(sb2);
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
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C4419yf c4419yf = this.n;
            if (c4419yf != null) {
                c4419yf.e();
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
        long a2 = C4051e5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder o = ljg.o("Load duration = ", a2, ", state = ");
        o.append(this.e);
        o.append(", isBidder = ");
        o.append(w());
        ironLog.verbose(a(o.toString()));
        synchronized (this.q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    E0 e0 = this.d;
                    if (e0 != null) {
                        e0.f.a(a2, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4051e5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        C4419yf c4419yf = this.n;
        if (c4419yf != null) {
            c4419yf.e();
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
                E0 e0 = this.d;
                if (e0 != null) {
                    e0.j.a("ad expired, state = " + this.e);
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

    private boolean b(B0 b0) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD, B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.LOAD_AD_NO_FILL, B0.RELOAD_AD, B0.RELOAD_AD_SUCCESS, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_NO_FILL, B0.DESTROY_AD, B0.AD_PRESENT_SCREEN, B0.AD_DISMISS_SCREEN, B0.AD_LEFT_APPLICATION, B0.AD_OPENED, B0.AD_CLOSED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.AD_REWARDED)).contains(b0);
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4227o2 c4227o2 = this.o;
        if (c4227o2 == null) {
            return this.a.f();
        }
        Integer f2 = c4227o2.f();
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
        C4227o2 i = i();
        String k = i.k();
        Map<String, Object> a2 = C4110ha.a(i.a());
        a2.put("adUnit", this.a.a());
        b(k);
        try {
            boolean v = v();
            E0 e0 = this.d;
            boolean z = false;
            if (v) {
                e0.f.d();
            } else {
                e0.f.a(false);
            }
            this.l = null;
            this.m = new C4051e5();
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
                onInitFailed(A0.c(this.a.a()), str);
                return;
            }
            this.n.a((C4419yf.a) this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(A0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            E0 e02 = this.d;
            if (e02 != null) {
                e02.j.g(str3);
            }
            onInitFailed(A0.c(this.a.a()), str3);
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
                    C4157k4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
            }
            E0 e0 = this.d;
            if (e0 != null) {
                e0.f();
                this.d = null;
            }
            C4419yf c4419yf = this.n;
            if (c4419yf != null) {
                c4419yf.d();
                this.n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a();
        }
    }

    public boolean O() {
        return true;
    }

    @Override // com.ironsource.I8.b
    public String c() {
        return this.h.f();
    }

    public String d() {
        return a((String) null);
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.a.a();
    }

    public String h() {
        return this.a.c();
    }

    public C4227o2 i() {
        return this.o;
    }

    public String j() {
        C4077fd c4077fd = this.g;
        return c4077fd == null ? "" : c4077fd.c();
    }

    public String k() {
        return c() + " " + hashCode();
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        boolean isMultipleInstances = this.h.h().isMultipleInstances();
        C4011c1 c4011c1 = this.h;
        return isMultipleInstances ? c4011c1.h().getProviderTypeForReflection() : c4011c1.f();
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
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
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
        hashMap.putAll(C4110ha.a(this.i));
        return hashMap;
    }

    public Integer r() {
        C4207n0 c4207n0 = this.a;
        if (c4207n0 != null) {
            return Integer.valueOf(c4207n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    public InterfaceC4256pd u() {
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

    public Long e() {
        return this.l;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.I8.b
    public int b() {
        return this.h.e();
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(B0 b0) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C4157k4.d().a(e2);
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
        if (b(b0)) {
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
        return TextUtils.isEmpty(str) ? str2 : lnb.o(str2, " - ", str);
    }

    @Override // com.ironsource.C4419yf.a
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
            C4419yf c4419yf = this.n;
            if (c4419yf != null) {
                c4419yf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4051e5.a(this.m));
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

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                boolean v = v();
                E0 e0 = this.d;
                if (v) {
                    e0.f.a(j, i);
                    return;
                } else {
                    e0.f.b(j, i, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                boolean v2 = v();
                E0 e02 = this.d;
                if (v2) {
                    e02.f.a(j, i, str);
                    return;
                } else {
                    e02.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
