package com.ironsource;

import com.ironsource.C4264q3;
import com.ironsource.Q1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dmi;
import defpackage.k13;
import defpackage.kdc;
import defpackage.lnb;
import defpackage.sub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q1 {

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC4386x0 b;

    @NotNull
    private final Map<String, I> c;

    @NotNull
    private final C4084g2 d;

    @NotNull
    private final List<CallableC4210n3> e;
    private final boolean f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ C4264q3 b;
        final /* synthetic */ Q1 c;
        final /* synthetic */ C4264q3.b d;

        public a(C4264q3 c4264q3, Q1 q1, C4264q3.b bVar) {
            this.b = c4264q3;
            this.c = q1;
            this.d = bVar;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface d {
        void a(@NotNull Q1 q1);

        void a(@NotNull Q1 q1, @NotNull String str);
    }

    public Q1(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, @Nullable C4088g6 c4088g6) {
        t0.getClass();
        abstractC4386x0.getClass();
        this.a = t0;
        this.b = abstractC4386x0;
        this.c = a();
        this.d = new C4084g2(abstractC4386x0);
        this.e = new ArrayList();
        this.f = abstractC4386x0.e().q();
        b b2 = b();
        Rf g = abstractC4386x0.b().g();
        boolean z = Ib.v.d().h().x() && (abstractC4386x0.b().a() == IronSource.a.INTERSTITIAL || abstractC4386x0.b().a() == IronSource.a.REWARDED_VIDEO);
        for (NetworkSettings networkSettings : abstractC4386x0.m()) {
            if (g == null || g.a(networkSettings, this.b.b().a())) {
                AdData a2 = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    Object b3 = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b3 instanceof InterfaceC4246p3) {
                        this.e.add(new CallableC4210n3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4246p3) b3, b2, networkSettings));
                    } else {
                        this.a.f().h().g(b3 == null ? dmi.q("prepareAuctionCandidates - could not load network adapter ", networkSettings.getProviderName()) : lnb.o("network adapter ", networkSettings.getProviderName(), " does not implementing BiddingDataInterface"));
                    }
                } else if (!z) {
                    this.d.a(networkSettings);
                }
            }
        }
        this.d.a(c4088g6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
                return hashMap;
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.b.b().a())) : null);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        I i = this.c.get(str);
        if (i != null) {
            return i.b();
        }
        return null;
    }

    @NotNull
    public final Map<String, I> c() {
        return this.c;
    }

    @NotNull
    public final C4084g2 d() {
        return this.d;
    }

    @NotNull
    public final List<CallableC4210n3> e() {
        return this.e;
    }

    public final boolean f() {
        return !this.e.isEmpty();
    }

    public final boolean g() {
        return this.d.e();
    }

    public final boolean h() {
        return this.f;
    }

    private final b b() {
        return new b();
    }

    private final C4264q3.b b(d dVar) {
        return new c(dVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements C4264q3.b {
        final /* synthetic */ d b;

        public c(d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.C4264q3.b
        public void a(@NotNull final List<? extends C4281r3> list, final long j, @NotNull final List<String> list2) {
            list.getClass();
            list2.getClass();
            T0 t0 = Q1.this.a;
            final Q1 q1 = Q1.this;
            final d dVar = this.b;
            t0.a(new Runnable() { // from class: bif
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(Q1.this, j, list, list2, dVar);
                }
            });
        }

        @Override // com.ironsource.C4264q3.b
        public void onFailure(@NotNull String str) {
            str.getClass();
            Q1.this.a.a(new kdc(12, Q1.this, str, this.b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q1, long j, List list, List list2, d dVar) {
            q1.getClass();
            list.getClass();
            list2.getClass();
            dVar.getClass();
            q1.a(j, list, list2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q1, String str, d dVar) {
            q1.getClass();
            str.getClass();
            dVar.getClass();
            q1.a.f().g().a(str);
            dVar.a(q1, str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements InterfaceC4228o3 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4228o3
        public void a(@Nullable NetworkSettings networkSettings) {
            AdapterBaseInterface a;
            boolean h = Q1.this.h();
            Q1 q1 = Q1.this;
            if (h) {
                a = null;
                BaseAdAdapter b = q1.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b != null) {
                    a = b.getNetworkAdapter();
                }
            } else {
                a = q1.a(networkSettings);
            }
            if (a != null) {
                Q1.this.a.f().g().b(Q1.this.a(networkSettings, a));
            }
        }

        @Override // com.ironsource.InterfaceC4228o3
        public void a(@Nullable String str) {
            Q1.this.a.f().h().g(str);
        }
    }

    private final Map<String, I> a() {
        List<NetworkSettings> m = this.b.m();
        int c2 = sub.c(k13.r(m, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            I i = new I(this.a, this.b, (NetworkSettings) it.next());
            linkedHashMap.put(i.c(), i);
        }
        return linkedHashMap;
    }

    public final void a(@NotNull d dVar) {
        dVar.getClass();
        C4264q3 c4264q3 = new C4264q3();
        C4264q3.b b2 = b(dVar);
        this.a.f().g().a(this.b.f());
        this.a.a((com.ironsource.environment.thread.a) new a(c4264q3, this, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, List<? extends C4281r3> list, List<String> list2, d dVar) {
        this.a.f().g().b(j);
        for (C4281r3 c4281r3 : list) {
            String c2 = c4281r3.c();
            c2.getClass();
            Map<String, Object> a2 = a(c2);
            if (c4281r3.a() != null) {
                this.d.a(c4281r3);
                this.a.f().g().a(a2, c4281r3.e());
            } else {
                this.a.f().g().a(a2, c4281r3.e(), c4281r3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.a.f().g().b(a(it.next()), j);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface a2;
        NetworkSettings a3 = this.b.a(str);
        if (this.f) {
            BaseAdAdapter<?, ?> b2 = b(str);
            a2 = b2 != null ? b2.getNetworkAdapter() : null;
        } else {
            a2 = a(a3);
        }
        return a(a3, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.d().b(networkSettings, this.b.b().a(), this.b.b().b());
    }

    public /* synthetic */ Q1(T0 t0, AbstractC4386x0 abstractC4386x0, C4088g6 c4088g6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4386x0, (i & 4) != 0 ? null : c4088g6);
    }
}
