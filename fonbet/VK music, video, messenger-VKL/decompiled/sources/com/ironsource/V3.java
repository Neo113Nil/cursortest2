package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.i5g;
import xsna.izs;
import xsna.j5g;
import xsna.mnh0;
import xsna.rli0;
import xsna.s3q0;
import xsna.y57;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class V3 {
    private final U9 a;
    private Boolean b;
    private ConcurrentHashMap<String, Boolean> c;
    private final InterfaceC4652y7 d;

    public static final class a extends Lambda implements izs<AdapterBaseWrapper, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(AdapterBaseWrapper adapterBaseWrapper) {
            return adapterBaseWrapper.getSettings().getProviderTypeForReflection();
        }
    }

    public static final class b extends Lambda implements izs<String, Boolean> {
        final /* synthetic */ ConcurrentHashMap<String, Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
            super(1);
            this.a = concurrentHashMap;
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(epx.f(this.a.get(str), Boolean.TRUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Boolean c(NetworkSettings networkSettings) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        String providerTypeForReflection = networkSettings != null ? networkSettings.getProviderTypeForReflection() : null;
        if (providerTypeForReflection == null || providerTypeForReflection.length() == 0 || (concurrentHashMap = this.c) == null) {
            return null;
        }
        return concurrentHashMap.get(providerTypeForReflection);
    }

    private final void d() {
        this.c = null;
        this.a.b();
    }

    public final Boolean a() {
        return this.b;
    }

    public final InterfaceC4652y7 b() {
        return this.d;
    }

    public V3(U9 u9) {
        this.a = u9;
        this.d = Kb.u.d().a();
    }

    private final Boolean b(NetworkSettings networkSettings) {
        if (networkSettings == null || networkSettings.isCustomNetwork() || !networkSettings.getApplicationSettings().has(W3.a)) {
            return null;
        }
        return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(W3.a));
    }

    public final void a(boolean z) {
        d();
        this.b = Boolean.valueOf(z);
    }

    private final void a(Map<String, Boolean> map) {
        c();
        this.c = new ConcurrentHashMap<>(map);
    }

    private final void c() {
        this.b = null;
        this.a.a();
    }

    public /* synthetic */ V3(U9 u9, int i, zcl zclVar) {
        this((i & 1) != 0 ? new U9() : u9);
    }

    public final void b(Map<String, ? extends AdapterBaseWrapper> map) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.c;
        if (concurrentHashMap == null) {
            return;
        }
        if (map.isEmpty()) {
            this.a.b();
        } else {
            this.a.a(j5g.O0(rli0.C(rli0.j(rli0.t(new i5g(map.values()), a.a), new b(concurrentHashMap)))));
        }
    }

    public final void a(Map<String, ? extends AbstractAdapter> map, Map<String, ? extends AdapterBaseWrapper> map2) {
        s3q0 s3q0Var;
        Iterator<? extends AbstractAdapter> it = map.values().iterator();
        while (it.hasNext()) {
            a(it.next(), (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : map2.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        try {
            Boolean a2 = a(networkSettings);
            if (a2 == null || !(adapterBaseInterface instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapterBaseInterface).setConsent(a2.booleanValue());
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String a3 = y57.a("error while setting consent of ", networkSettings != null ? networkSettings.getProviderName() : null, ": ", th.getLocalizedMessage());
            a(a3);
            IronLog.INTERNAL.error(a3);
        }
    }

    public final void a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        try {
            Boolean a2 = a(networkSettings);
            if (a2 != null) {
                abstractAdapter.setNewConsent(a2.booleanValue());
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String a3 = y57.a("error while setting consent of ", abstractAdapter.getProviderName(), ": ", th.getLocalizedMessage());
            a(a3);
            IronLog.INTERNAL.error(a3);
        }
    }

    private final Boolean a(NetworkSettings networkSettings) {
        Boolean b2 = b(networkSettings);
        if (b2 != null) {
            return b2;
        }
        Boolean c = c(networkSettings);
        return c == null ? this.b : c;
    }

    public final void a(Map<String, Boolean> map, Map<String, ? extends AbstractAdapter> map2, Map<String, ? extends AdapterBaseWrapper> map3) {
        a(map);
        a(map2, map3);
        b(map3);
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            G9.i().a(new C4632x5(EnumC4650y5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void a(int i) {
        JSONObject b2 = IronSourceUtils.b(false);
        try {
            b2.put(IronSourceConstants.EVENTS_EXT1, i + ";" + this.d.G(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(mnh0.A(e));
        }
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.CONSENT_TCF_CODE, b2));
    }

    public final void a(int i, Map<String, ? extends NetworkSettings> map) {
        JSONObject applicationSettings;
        String G = this.d.G(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + G);
        ironLog.general("CMP ID: " + i);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<? extends NetworkSettings> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !epx.f(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(W3.a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((NetworkSettings) next).getProviderDefaultInstance())) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) it2.next();
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(W3.a)) : null));
        }
    }
}
