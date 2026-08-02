package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.AbstractC4085g3;
import com.ironsource.C4264q3;
import com.ironsource.E0;
import com.ironsource.J7;
import com.ironsource.J8;
import com.ironsource.M0;
import com.ironsource.Z1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4067f3<Smash extends AbstractC4085g3<?>, Listener extends AdapterAdListener> implements P0, S1, D0, Db, Bc, InterfaceC4224o, Og, InterfaceC4228o3, InterfaceC4256pd {
    private AdInfo A;
    private C4181la B;
    final J8 C;
    final J8.a D;
    protected final J7 E;
    private final J7.a F;
    private boolean G;
    private Rf H;
    private AtomicBoolean I;

    @Nullable
    private R9 J;
    protected Ng<Smash> a;
    protected ConcurrentHashMap<String, Z1.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected Z1 d;
    protected int e;
    protected String f;
    protected JSONObject g;
    protected C4227o2 h;
    protected C4077fd i;
    protected boolean j;
    private NetworkStateReceiver k;
    protected Ze l;
    protected C4051e5 m;
    protected C4051e5 n;
    protected W o;
    protected f p;
    protected O0 q;
    protected L5 r;
    protected E0 s;
    protected K0 t;
    protected C4295s u;
    protected C3959aa v;
    protected UUID w;
    protected final Object x;
    private long y;
    private Boolean z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$a */
    public class a extends com.ironsource.environment.thread.a {
        public a() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4067f3.this.y();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$b */
    public class b implements Runnable {
        final /* synthetic */ NetworkSettings a;

        public b(NetworkSettings networkSettings) {
            this.a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4067f3.this.c(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4067f3.this.A();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4067f3.this.g = new JSONObject();
            AbstractC4067f3.this.s.h.a((Double) null);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC4067f3.this.b(hashMap, arrayList, sb, arrayList2);
            AbstractC4067f3.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$e */
    public class e implements C4264q3.b {
        final /* synthetic */ Map a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        public e(Map map, StringBuilder sb, List list) {
            this.a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.C4264q3.b
        public void a(@NotNull List<C4281r3> list, long j, @NotNull List<String> list2) {
            AbstractC4067f3.this.s.g.b(j);
            for (C4281r3 c4281r3 : list) {
                NetworkSettings a = AbstractC4067f3.this.o.a(c4281r3.c());
                Map<String, Object> b = AbstractC4067f3.this.b(a, com.ironsource.mediationsdk.c.d().b(a, AbstractC4067f3.this.o.b(), AbstractC4067f3.this.h()));
                if (c4281r3.a() != null) {
                    this.a.put(c4281r3.c(), c4281r3.a());
                    StringBuilder sb = this.b;
                    sb.append(c4281r3.d());
                    sb.append(c4281r3.c());
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    AbstractC4067f3.this.s.g.a(b, c4281r3.e());
                } else {
                    AbstractC4067f3.this.s.g.a(b, c4281r3.e(), c4281r3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings a2 = AbstractC4067f3.this.o.a(it.next());
                AbstractC4067f3.this.s.g.b(AbstractC4067f3.this.b(a2, com.ironsource.mediationsdk.c.d().b(a2, AbstractC4067f3.this.o.b(), AbstractC4067f3.this.h())), j);
            }
            AbstractC4067f3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.C4264q3.b
        public void onFailure(String str) {
            AbstractC4067f3.this.s.g.a(str);
            AbstractC4067f3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f3$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC4067f3(F7 f7, E7 e7, W w, C4181la c4181la, C3959aa c3959aa) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.I = new AtomicBoolean(false);
        this.w = UUID.randomUUID();
        this.C = f7.s();
        this.D = e7.i();
        this.E = f7.w();
        this.F = e7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w.b() + ", loading mode = " + w.h().a());
        StringBuilder sb = new StringBuilder();
        sb.append(w.b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb.toString());
        C4051e5 c4051e5 = new C4051e5();
        this.J = a(w);
        this.v = c3959aa;
        this.o = w;
        this.s = new E0(w.b(), E0.b.MEDIATION, this);
        this.t = d();
        this.q = e();
        a(f.NONE);
        this.B = c4181la;
        this.a = new Ng<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(l(), this.o.h().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        D();
        this.g = new JSONObject();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), IronSourceUtils.d()));
        }
        this.d = new Z1(this.o.j(), this.o.d().c());
        p();
        o();
        this.m = new C4051e5();
        a(f.READY_TO_LOAD);
        this.r = new L5(w.a(), this);
        this.u = new C4295s();
        this.s.e.a(C4051e5.a(c4051e5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    private Ug<Smash> B() {
        IronLog.INTERNAL.verbose();
        return new Tg(this.o).d(this.a.b());
    }

    private void C() {
        this.u.a(this.o.b(), false);
    }

    private void H() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            try {
                f fVar = this.p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long k = this.o.d().k() - C4051e5.a(this.m);
                if (k > 0) {
                    new Timer().schedule(new c(), k);
                } else {
                    A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void I() {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4210n3> list2) {
        AbstractC4067f3<Smash, Listener> abstractC4067f3;
        for (NetworkSettings networkSettings : this.o.j()) {
            Rf rf = this.H;
            if (rf == null || rf.a(networkSettings, this.o.b())) {
                if (!this.l.b(new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && this.d(networkSettings)) {
                    AdData a2 = this.a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), this.h());
                        if (b2 instanceof InterfaceC4246p3) {
                            list2.add(new CallableC4210n3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4246p3) b2, this, networkSettings));
                        } else {
                            abstractC4067f3 = this;
                            abstractC4067f3.s.j.g(b2 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        abstractC4067f3 = this;
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(abstractC4067f3.o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    this = abstractC4067f3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
        AdData a2 = a(networkSettings, this.o.o());
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            try {
                b2.init(a2, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
    }

    private List<C4227o2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                Ye ye = new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(ye)) {
                    copyOnWriteArrayList.add(new C4227o2(ye.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        Ze ze = new Ze();
        this.l = ze;
        ze.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            try {
                if (this.o.h().e() && this.l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(A0.a(this.o.b()), "all smashes are capped", false);
                    return;
                }
                if (!q() && this.p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(A0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.o.h().a() != M0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != M0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.g = new JSONObject();
                C();
                boolean s = s();
                E0 e0 = this.s;
                if (s) {
                    e0.f.d();
                } else {
                    e0.f.a(n());
                }
                this.n = new C4051e5();
                if (this.o.q()) {
                    if (!this.b.isEmpty()) {
                        this.d.a(this.b);
                        this.b.clear();
                    }
                    H();
                } else {
                    a(f.LOADING);
                }
                if (this.o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                I();
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z() {
        Ug<Smash> B = B();
        if (B.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = B.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    public void D() {
        com.ironsource.mediationsdk.l.a().a(this.o.b(), this.o.f());
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return true;
    }

    public void G() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.d().b(it.next(), this.o.b(), h());
        }
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C4227o2 c4227o2);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[ORIG_RETURN, RETURN] */
    @Override // com.ironsource.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(IronSourceError ironSourceError, AbstractC4085g3<?> abstractC4085g3) {
        Ug<Smash> B;
        AbstractC4085g3<?> c2;
        synchronized (this.x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC4085g3.k() + " - error = " + ironSourceError));
                if (abstractC4085g3.h().equals(this.a.c()) && this.p != f.AUCTION) {
                    this.b.put(abstractC4085g3.c(), Z1.a.ISAuctionPerformanceFailedToLoad);
                    if (!w() && !u()) {
                        B = null;
                        if (B != null) {
                            return;
                        }
                        if (this.o.m()) {
                            synchronized (this.x) {
                                try {
                                    if (B.b() && t() && (c2 = new Tg(this.o).c(this.a.b())) != null) {
                                        i(c2);
                                    }
                                } finally {
                                }
                            }
                        }
                        Iterator<Smash> it = B.a().iterator();
                        while (it.hasNext()) {
                            it.next().E();
                        }
                        return;
                    }
                    B = B();
                    if (B.c()) {
                        a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                        return;
                    }
                    if (B != null) {
                    }
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC4085g3.c() + " with state =" + this.p + " auctionId: " + abstractC4085g3.h() + " and the current id is " + this.a.c()));
                C4223ng c4223ng = this.s.j;
                StringBuilder sb = new StringBuilder("onAdLoadFailed was invoked with state =");
                sb.append(this.p);
                c4223ng.o(sb.toString());
            } finally {
            }
        }
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract K0 d();

    @Override // com.ironsource.P0
    public void d(AbstractC4085g3<?> abstractC4085g3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4085g3.k()));
        if (!abstractC4085g3.h().equals(this.a.c())) {
            ironLog.error(b("invoked from " + abstractC4085g3.c() + " with state = " + this.p + " auctionId: " + abstractC4085g3.h() + " and the current id is " + this.a.c()));
            C4223ng c4223ng = this.s.j;
            StringBuilder sb = new StringBuilder("onAdLoadSuccess invoked with state = ");
            sb.append(this.p);
            c4223ng.p(sb.toString());
            return;
        }
        if (this.o.m()) {
            List<Smash> b2 = this.a.b();
            Tg tg = new Tg(this.o);
            boolean a2 = tg.a(abstractC4085g3, b2);
            synchronized (this.x) {
                if (a2) {
                    try {
                        if (t()) {
                            i(abstractC4085g3);
                        }
                    } finally {
                    }
                }
                if (tg.a(b2)) {
                    i(tg.c(b2));
                }
            }
        }
        this.b.put(abstractC4085g3.c(), Z1.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long a3 = C4051e5.a(this.n);
            boolean s = s();
            E0 e0 = this.s;
            if (s) {
                e0.f.a(a3);
            } else {
                e0.f.a(a3, n());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC4085g3);
            }
            h(abstractC4085g3);
        }
    }

    @Override // com.ironsource.P0
    public void e(AbstractC4085g3<?> abstractC4085g3) {
        IronLog.INTERNAL.verbose(b(abstractC4085g3.k()));
        this.s.i.a(k());
        this.t.a(this.i, abstractC4085g3.f());
    }

    public String f() {
        return b((String) null);
    }

    public void h(AbstractC4085g3<?> abstractC4085g3) {
        if (this.o.h().f()) {
            a(abstractC4085g3, abstractC4085g3.f());
        } else {
            a(true, false, abstractC4085g3);
        }
    }

    public abstract String i();

    public void i(AbstractC4085g3<?> abstractC4085g3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            C4227o2 i = abstractC4085g3.i();
            this.c.a(i, abstractC4085g3.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C4227o2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC4085g3.l(), this.h, i);
        }
    }

    public String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String k() {
        C4077fd c4077fd = this.i;
        return c4077fd == null ? "" : c4077fd.c();
    }

    public abstract String l();

    public boolean n() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract boolean s();

    public boolean t() {
        boolean z;
        synchronized (this.x) {
            try {
                f fVar = this.p;
                z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z;
    }

    public boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    public boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    public boolean w() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void x() {
        if (c()) {
            a(new a());
        } else {
            y();
        }
    }

    public UUID h() {
        return this.w;
    }

    public O0 e() {
        return new O0(this.o.h(), this);
    }

    public void g(AbstractC4085g3<?> abstractC4085g3) {
        this.t.d(abstractC4085g3.f());
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && r()) {
            return true;
        }
        return !z && this.z.booleanValue();
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.o.b()));
    }

    private boolean c(B0 b0) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.AUCTION_SUCCESS, B0.AUCTION_FAILED, B0.AUCTION_FAILED_NO_CANDIDATES, B0.AD_FORMAT_CAPPED, B0.AD_OPENED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_SUCCESS, B0.AD_LEFT_APPLICATION)).contains(b0);
    }

    @Override // com.ironsource.InterfaceC4256pd
    public boolean c() {
        R9 r9 = this.J;
        if (r9 == null || r9 == Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    public void b(boolean z) {
        a(false, z, (AbstractC4085g3<?>) null);
    }

    @Override // com.ironsource.Db
    public void b() {
        IronLog.INTERNAL.verbose(f());
        x();
    }

    private boolean b(B0 b0) {
        return !new ArrayList(Arrays.asList(B0.INIT_STARTED, B0.LOAD_AD, B0.AUCTION_REQUEST, B0.AUCTION_REQUEST_WATERFALL, B0.AUCTION_FAILED_NO_CANDIDATES, B0.COLLECT_TOKEN, B0.COLLECT_TOKENS_COMPLETED, B0.COLLECT_TOKENS_FAILED, B0.INSTANCE_COLLECT_TOKEN, B0.INSTANCE_COLLECT_TOKEN_SUCCESS, B0.INSTANCE_COLLECT_TOKEN_FAILED, B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(b0);
    }

    public void b(C4227o2 c4227o2, String str) {
        if (c4227o2 != null) {
            V8 a2 = c4227o2.a(str);
            if (a2 != null) {
                Iterator it = new HashSet(this.B.a()).iterator();
                while (it.hasNext()) {
                    ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        E0 e0 = this.s;
        if (e0 != null) {
            e0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    private void b(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(b(this.o.r()));
            } catch (JSONException e2) {
                C4157k4.d().a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 instanceof AdapterSettingsInterface) {
            return this.a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b2), b2, this.o.b());
        }
        return false;
    }

    public String b(String str) {
        String str2 = this.o.b().name() + " state:" + this.p;
        return TextUtils.isEmpty(str) ? str2 : lnb.o(str2, " - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
            return hashMap;
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return hashMap;
        }
    }

    @Nullable
    private R9 a(W w) {
        return null;
    }

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            NetworkStateReceiver networkStateReceiver = this.k;
            if (z) {
                if (networkStateReceiver == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (networkStateReceiver != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    public void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            try {
                if (this.p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.p = fVar2;
                    z = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void a(K0 k0) {
        this.t = k0;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.d().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    public void a(boolean z, boolean z2, AbstractC4085g3<?> abstractC4085g3) {
        synchronized (this.x) {
            try {
                Boolean bool = this.z;
                if (bool != null) {
                    if (bool.booleanValue() != z) {
                    }
                }
                this.z = Boolean.valueOf(z);
                long j = 0;
                if (this.y != 0) {
                    j = new Date().getTime() - this.y;
                }
                this.y = new Date().getTime();
                this.s.f.a(z, j, z2);
                AdInfo f2 = abstractC4085g3 != null ? abstractC4085g3.f() : this.A;
                this.A = f2;
                K0 k0 = this.t;
                if (!z) {
                    f2 = null;
                }
                k0.a(z, f2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.InterfaceC4224o
    public void a() {
        if (this.o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    @Override // com.ironsource.Bc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (AbstractC4085g3<?>) null);
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C4227o2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            C4227o2 c4227o2 = list.get(i);
            Smash a2 = a(c4227o2, str);
            if (a2 != null) {
                copyOnWriteArrayList.add(a2);
                sb.append(a(c4227o2, a2.l()));
            }
            if (i != list.size() - 1) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
        }
        this.a.a(this.o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    @Override // com.ironsource.Og
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(C4227o2 c4227o2, String str) {
        NetworkSettings a2 = this.o.a(c4227o2.c());
        if (a2 != null) {
            com.ironsource.mediationsdk.c.d().b(a2, this.o.b(), h());
            BaseAdAdapter<?, Listener> a3 = a(a2, this.o.b());
            if (a3 != null) {
                Smash a4 = a(a2, a3, this.C.a(this.o.b()), str, c4227o2);
                this.b.put(c4227o2.c(), Z1.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a4;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c4227o2.c() + " state = " + this.p;
        IronLog.INTERNAL.error(b(str2));
        this.s.j.i(str2);
        return null;
    }

    public void a(int i, String str, boolean z) {
        int i2;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (z) {
                i2 = i;
                str2 = str;
            } else {
                i2 = i;
                str2 = str;
                this.s.f.a(C4051e5.a(this.n), i2, str2, n());
            }
            a(new IronSourceError(i2, str2));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    public AbstractC4067f3(W w, C4181la c4181la, C3959aa c3959aa) {
        this(Ib.a0(), Ib.R(), w, c4181la, c3959aa);
    }

    public void a(AbstractC4085g3<?> abstractC4085g3, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.o.b(), ironSourceError);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4210n3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        C4264q3 c4264q3 = new C4264q3();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        c4264q3.a(list2, eVar, this.o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(A0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int a2 = this.C.a(this.o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.o.b());
            hVar.b(IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.d);
            hVar.a(a2);
            hVar.a(this.v);
            hVar.d(this.G);
            Rf rf = this.H;
            if (rf != null && rf.c()) {
                z = true;
            }
            hVar.e(z);
            a(ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public void a(Context context, com.ironsource.mediationsdk.h hVar, S1 s1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, hVar, s1);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C4227o2> list, String str, C4227o2 c4227o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f = "";
            this.e = i;
            this.h = c4227o2;
            this.g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String a2 = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(a2);
            a(f.LOADING);
            z();
            return;
        }
        StringBuilder q = wt3.q("unexpected auction success for auctionId - ", str, " state = ");
        q.append(this.p);
        ironLog.error(b(q.toString()));
        this.s.j.k("unexpected auction success, state = " + this.p);
    }

    @Override // com.ironsource.S1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            String g = com.appsflyer.internal.i.g(i, "Auction failed (error ", " - ", str, ")");
            ironLog.verbose(b(g));
            IronSourceUtils.i(i() + ": " + g);
            this.e = i2;
            this.f = str2;
            this.g = new JSONObject();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.s.h.a(j, i, str);
            a(f.LOADING);
            z();
            return;
        }
        StringBuilder t = dmi.t(i, "unexpected auction fail - error = ", ", ", str, " state = ");
        t.append(this.p);
        String sb = t.toString();
        ironLog.error(b(sb));
        this.s.j.j(sb);
    }

    @Override // com.ironsource.P0
    public void a(AbstractC4085g3<?> abstractC4085g3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4085g3.k()));
        this.s.i.g(k());
        this.a.a(abstractC4085g3);
        this.a.b(abstractC4085g3);
        this.l.a(abstractC4085g3);
        if (this.l.b(abstractC4085g3)) {
            ironLog.verbose(b(abstractC4085g3.c() + " was session capped"));
            abstractC4085g3.N();
            IronSourceUtils.i(abstractC4085g3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), k(), this.o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.i.b(k(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            C4227o2 i = abstractC4085g3.i();
            this.c.a(i, abstractC4085g3.l(), this.h, k());
            this.b.put(abstractC4085g3.c(), Z1.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(i, k());
            }
        }
        g(abstractC4085g3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public Map<String, Object> a(B0 b0) {
        HashMap l = com.appsflyer.internal.i.l(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        l.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            l.put("genericParams", this.g);
        }
        l.put("sessionDepth", Integer.valueOf(this.C.a(this.o.b())));
        if (c(b0)) {
            l.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                l.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(b0) && !TextUtils.isEmpty(this.a.c())) {
            l.put("auctionId", this.a.c());
        }
        return l;
    }

    public void a(C3959aa c3959aa) {
        this.v = c3959aa;
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    public String a(C4227o2 c4227o2, int i) {
        return mz1.i(i, c4227o2.c());
    }

    public void a(Rf rf) {
        this.H = rf;
        if (rf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC4228o3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            this.s.g.b(b(networkSettings, b2));
        }
    }

    @Override // com.ironsource.InterfaceC4228o3
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC4256pd
    public void a(Runnable runnable) {
        R9 r9 = this.J;
        if (r9 != null) {
            r9.a(runnable);
        }
    }
}
