package com.ironsource;

import com.ironsource.C4558t3;
import com.ironsource.S1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.c5g;
import xsna.go9;
import xsna.on00;
import xsna.y63;
import xsna.zcl;
import xsna.zr;

/* loaded from: classes13.dex */
public final class S1 {
    private final V0 a;
    private final AbstractC4627x0 b;
    private final Map<String, I> c;
    private final C4361i2 d;
    private final List<CallableC4505q3> e;
    private final boolean f;

    public static final class a extends AbstractRunnableC4408ke {
        final /* synthetic */ C4558t3 b;
        final /* synthetic */ S1 c;
        final /* synthetic */ C4558t3.b d;

        public a(C4558t3 c4558t3, S1 s1, C4558t3.b bVar) {
            this.b = c4558t3;
            this.c = s1;
            this.d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements C4558t3.b {
        final /* synthetic */ d b;

        public c(d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.C4558t3.b
        public void a(final List<? extends C4576u3> list, final long j, final List<String> list2) {
            V0 v0 = S1.this.a;
            final S1 s1 = S1.this;
            final d dVar = this.b;
            v0.c(new Runnable() { // from class: xsna.lwg0
                @Override // java.lang.Runnable
                public final void run() {
                    S1.c.a(S1.this, j, list, list2, dVar);
                }
            });
        }

        @Override // com.ironsource.C4558t3.b
        public void onFailure(String str) {
            S1.this.a.c(new y63(S1.this, str, this.b, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 s1, long j, List list, List list2, d dVar) {
            s1.a(j, list, list2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 s1, String str, d dVar) {
            s1.a.d().g().a(str);
            dVar.a(s1, str);
        }
    }

    public interface d {
        void a(S1 s1);

        void a(S1 s1, String str);
    }

    public S1(V0 v0, AbstractC4627x0 abstractC4627x0, C4382j6 c4382j6) {
        this.a = v0;
        this.b = abstractC4627x0;
        this.c = a();
        this.d = new C4361i2(abstractC4627x0);
        this.e = new ArrayList();
        this.f = abstractC4627x0.e().q();
        b b2 = b();
        Tf g = abstractC4627x0.b().g();
        boolean z = Kb.u.d().h().w() && (abstractC4627x0.b().a() == IronSource.a.INTERSTITIAL || abstractC4627x0.b().a() == IronSource.a.REWARDED_VIDEO);
        for (NetworkSettings networkSettings : abstractC4627x0.m()) {
            if (g == null || g.a(networkSettings, this.b.b().a())) {
                AdData a2 = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    Object b3 = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b3 instanceof InterfaceC4540s3) {
                        this.e.add(new CallableC4505q3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4540s3) b3, b2, networkSettings));
                    } else {
                        this.a.d().h().g(b3 == null ? go9.b("prepareAuctionCandidates - could not load network adapter ", networkSettings.getProviderName()) : zr.a("network adapter ", networkSettings.getProviderName(), " does not implementing BiddingDataInterface"));
                    }
                } else if (!z) {
                    this.d.a(networkSettings);
                }
            }
        }
        this.d.a(c4382j6);
    }

    public final Map<String, I> c() {
        return this.c;
    }

    public final C4361i2 d() {
        return this.d;
    }

    public final List<CallableC4505q3> e() {
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

    private final C4558t3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        I i = this.c.get(str);
        if (i != null) {
            return i.b();
        }
        return null;
    }

    public static final class b implements InterfaceC4522r3 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4522r3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface a;
            if (S1.this.h()) {
                a = null;
                BaseAdAdapter b = S1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b != null) {
                    a = b.getNetworkAdapter();
                }
            } else {
                a = S1.this.a(networkSettings);
            }
            if (a != null) {
                S1.this.a.d().g().b(S1.this.a(networkSettings, a));
            }
        }

        @Override // com.ironsource.InterfaceC4522r3
        public void a(String str) {
            S1.this.a.d().h().g(str);
        }
    }

    private final Map<String, I> a() {
        List<NetworkSettings> m = this.b.m();
        int e = on00.e(c5g.u(m, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            I i = new I(this.a, this.b, (NetworkSettings) it.next());
            Pair pair = new Pair(i.c(), i);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    public final void a(d dVar) {
        C4558t3 c4558t3 = new C4558t3();
        C4558t3.b b2 = b(dVar);
        this.a.d().g().a(this.b.f());
        this.a.a((AbstractRunnableC4408ke) new a(c4558t3, this, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, List<? extends C4576u3> list, List<String> list2, d dVar) {
        this.a.d().g().b(j);
        for (C4576u3 c4576u3 : list) {
            Map<String, Object> a2 = a(c4576u3.c());
            if (c4576u3.a() != null) {
                this.d.a(c4576u3);
                this.a.d().g().a(a2, c4576u3.e());
            } else {
                this.a.d().g().a(a2, c4576u3.e(), c4576u3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.a.d().g().b(a(it.next()), j);
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
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C4452n4.d().a(e);
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

    public /* synthetic */ S1(V0 v0, AbstractC4627x0 abstractC4627x0, C4382j6 c4382j6, int i, zcl zclVar) {
        this(v0, abstractC4627x0, (i & 4) != 0 ? null : c4382j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.b.b().a(), this.b.b().b());
    }
}
