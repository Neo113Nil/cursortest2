package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.impl.f6;
import com.applovin.impl.i;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.q7;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v2;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public class d {
    private final l a;
    private final Map b = new HashMap(4);
    private final Object c = new Object();
    private final Map d = new HashMap(4);
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Object g = new Object();

    class a implements r5.b {
        final /* synthetic */ long a;
        final /* synthetic */ Map b;
        final /* synthetic */ String c;
        final /* synthetic */ c3 d;
        final /* synthetic */ Context e;
        final /* synthetic */ a.InterfaceC0103a f;

        a(long j, Map map, String str, c3 c3Var, Context context, a.InterfaceC0103a interfaceC0103a) {
            this.a = j;
            this.b = map;
            this.c = str;
            this.d = c3Var;
            this.e = context;
            this.f = interfaceC0103a;
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONArray jSONArray) {
            this.b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.a));
            this.b.put("calfc", Integer.valueOf(d.this.b(this.c)));
            x5 x5Var = new x5(this.d, jSONArray, this.e, d.this.a, this.f);
            if (((Boolean) d.this.a.a(t3.A8)).booleanValue()) {
                d.this.a.s0().a((k5) x5Var, f6.b.MEDIATION);
            } else {
                d.this.a.s0().a(x5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a.InterfaceC0103a {
        private final l a;
        private final WeakReference b;
        private final d c;
        private final c d;
        private final MaxAdFormat e;
        private final Map f;
        private final Map g;
        private final Map h;
        private final int i;
        private long j;
        private long k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, d dVar, l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, dVar, lVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str) {
            this.g.put("retry_delay_sec", Integer.valueOf(i));
            this.g.put("retry_attempt", Integer.valueOf(this.d.c));
            Context context = (Context) this.b.get();
            if (context == null) {
                context = l.p();
            }
            this.h.put("art", i.EXPONENTIAL_RETRY.b());
            this.h.put("era", Integer.valueOf(this.d.c));
            this.k = System.currentTimeMillis();
            this.c.a(str, this.e, this.f, this.g, this.h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.c.c(str);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.k, elapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z = maxError2.getCode() == -5603 && q7.c(this.a) && ((Boolean) this.a.a(z4.E6)).booleanValue();
            if (this.a.a(t3.u8, this.e) && this.d.c < this.i && !z) {
                c.e(this.d);
                final int pow = (int) Math.pow(2.0d, this.d.c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b.this.a(pow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.d.c = 0;
            this.d.b.set(false);
            if (this.d.d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.d.a);
                maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                v2.a(this.d.d, str, maxError2);
                this.d.d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a3 a3Var = (a3) maxAd;
            a3Var.i(this.d.a);
            a3Var.a(SystemClock.elapsedRealtime() - this.j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) a3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.k, a3Var.getRequestLatencyMillis());
            }
            this.c.a(maxAd.getAdUnitId());
            this.d.c = 0;
            if (this.d.d == null) {
                this.c.a(a3Var);
                this.d.b.set(false);
                return;
            }
            a3Var.B().c().a(this.d.d);
            this.d.d.onAdLoaded(a3Var);
            if (a3Var.R().endsWith("load")) {
                this.d.d.onAdRevenuePaid(a3Var);
            }
            this.d.d = null;
            if (((Boolean) this.a.a(t3.q8)).booleanValue() || !this.c.a(maxAd)) {
                this.d.b.set(false);
                return;
            }
            Context context = (Context) this.b.get();
            if (context == null) {
                context = l.p();
            }
            this.j = SystemClock.elapsedRealtime();
            this.k = System.currentTimeMillis();
            this.h.put("art", i.SEQUENTIAL_OR_PRECACHE.b());
            this.c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.g, this.h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, d dVar, l lVar, Context context) {
            this.a = lVar;
            this.b = new WeakReference(context);
            this.c = dVar;
            this.d = cVar;
            this.e = maxAdFormat;
            this.g = map2;
            this.f = map;
            this.h = map3;
            this.j = j;
            this.k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) lVar.a(t3.t8)).intValue());
            } else {
                this.i = ((Integer) lVar.a(t3.t8)).intValue();
            }
        }
    }

    private static class c {
        private final String a;
        private final AtomicBoolean b;
        private int c;
        private volatile a.InterfaceC0103a d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        private c(String str) {
            this.b = new AtomicBoolean();
            this.a = str;
        }
    }

    public d(l lVar) {
        this.a = lVar;
    }

    private a3 e(String str) {
        a3 a3Var;
        synchronized (this.e) {
            a3Var = (a3) this.d.get(str);
            this.d.remove(str);
        }
        return a3Var;
    }

    public void c(String str, String str2) {
        synchronized (this.c) {
            this.b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z;
        synchronized (this.e) {
            z = this.d.get(str) != null;
        }
        return z;
    }

    private String b(String str, String str2) {
        return str + (str2 != null ? "-" + str2 : "");
    }

    public int b(String str) {
        int intValue;
        synchronized (this.g) {
            Integer num = (Integer) this.f.get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, i iVar, Map map, Map map2, Context context, a.InterfaceC0103a interfaceC0103a) {
        a3 a3Var;
        if (this.a.u0().d() || q7.h(l.p())) {
            a3Var = null;
        } else if (interfaceC0103a == null && d(str)) {
            return;
        } else {
            a3Var = e(str);
        }
        if (a3Var != null) {
            a3Var.i(str2);
            a3Var.B().c().a(interfaceC0103a);
            interfaceC0103a.onAdLoaded(a3Var);
            if (a3Var.R().endsWith("load")) {
                interfaceC0103a.onAdRevenuePaid(a3Var);
            }
            if (((Boolean) this.a.a(t3.q8)).booleanValue() && a((MaxAd) a3Var)) {
                return;
            }
        }
        c a2 = a(str, str2);
        if (!a2.b.compareAndSet(false, true)) {
            if (a2.d != null && a2.d != interfaceC0103a) {
                p.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            a2.d = interfaceC0103a;
            return;
        }
        if (a3Var == null) {
            a2.d = interfaceC0103a;
        }
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            synchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, synchronizedMap, context, new b(map, map2, synchronizedMap, a2, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.g) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0103a interfaceC0103a) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c3 c3Var = new c3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.a.s0().a((k5) new r5(c3Var, context, this.a, new a(elapsedRealtime, map3, str, c3Var, context, interfaceC0103a)), f6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.a.a(z4.R4)).booleanValue()) {
            w3 a0 = this.a.a0();
            u3 u3Var = u3.e;
            Map a2 = a0.a(u3Var, v3.a(str));
            u3.a aVar = u3.a.SESSION;
            int a3 = a(a2, aVar);
            u3.a aVar2 = u3.a.INSTALL;
            int a4 = a(a2, aVar2);
            Map a5 = this.a.a0().a(u3Var, v3.a(maxAdFormat));
            return new com.applovin.impl.h(a3, a4, a(a5, aVar), a(a5, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, u3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        synchronized (this.e) {
            if (this.d.containsKey(a3Var.getAdUnitId())) {
                p.h("AppLovinSdk", "Ad in cache already: " + a3Var.getAdUnitId());
            }
            this.d.put(a3Var.getAdUnitId(), a3Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.c) {
            String b2 = b(str, str2);
            cVar = (c) this.b.get(b2);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.b.put(b2, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f.remove(str);
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.a.c(t3.o8).contains(maxAd.getAdUnitId()) && !this.a.a(t3.n8, maxAd.getFormat())) || this.a.u0().c() || this.a.u0().d()) ? false : true;
    }
}
