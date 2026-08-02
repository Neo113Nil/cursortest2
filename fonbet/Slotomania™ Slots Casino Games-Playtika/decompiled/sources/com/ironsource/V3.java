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
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class V3 {
    private final T9 a;
    private Boolean b;
    private ConcurrentHashMap<String, Boolean> c;
    private final InterfaceC2738x7 d;

    static final class a extends Lambda implements Function1<AdapterBaseWrapper, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(AdapterBaseWrapper it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getSettings().getProviderTypeForReflection();
        }
    }

    static final class b extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ ConcurrentHashMap<String, Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
            super(1);
            this.a = concurrentHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            return Boolean.valueOf(Intrinsics.areEqual(this.a.get(provider), Boolean.TRUE));
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

    public final InterfaceC2738x7 b() {
        return this.d;
    }

    public V3(T9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = globalDataWriter;
        this.d = Jb.u.d().a();
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

    public final void a(Map<String, ? extends AbstractAdapter> adapters, Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        Iterator<? extends AbstractAdapter> it = adapters.values().iterator();
        while (it.hasNext()) {
            a(it.next(), (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void b(Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.c;
        if (concurrentHashMap == null) {
            return;
        }
        if (networkAdapters.isEmpty()) {
            this.a.b();
        } else {
            this.a.a(CollectionsKt.toList(SequencesKt.toSet(SequencesKt.filter(SequencesKt.mapNotNull(CollectionsKt.asSequence(networkAdapters.values()), a.a), new b(concurrentHashMap)))));
        }
    }

    public /* synthetic */ V3(T9 t9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new T9() : t9);
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean a2 = a(networkSettings);
            if (a2 == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(a2.booleanValue());
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "error while setting consent of " + (networkSettings != null ? networkSettings.getProviderName() : null) + ": " + th.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(AbstractAdapter adapter, NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean a2 = a(networkSettings);
            if (a2 != null) {
                adapter.setNewConsent(a2.booleanValue());
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
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

    public final void a(Map<String, Boolean> networkConsents, Map<String, ? extends AbstractAdapter> adapters, Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        a(networkConsents);
        a(adapters, networkAdapters);
        b(networkAdapters);
    }

    private final void a(String str) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (!TextUtils.isEmpty(str)) {
                jsonObjectInit.put("reason", str);
            }
            F9.i().a(new C2736x5(EnumC2754y5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jsonObjectInit));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void a(int i) {
        JSONObject b2 = IronSourceUtils.b(false);
        try {
            b2.put(IronSourceConstants.EVENTS_EXT1, i + ";" + this.d.G(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(ExceptionsKt.stackTraceToString(e));
        }
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.CONSENT_TCF_CODE, b2));
    }

    public final void a(int i, Map<String, ? extends NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        String G = this.d.G(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + G);
        ironLog.general("CMP ID: " + i);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<? extends NetworkSettings> values = providerSettings.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(W3.a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(W3.a)) : null));
        }
    }
}
