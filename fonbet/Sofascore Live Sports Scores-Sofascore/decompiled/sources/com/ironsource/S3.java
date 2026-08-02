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
import defpackage.c38;
import defpackage.de6;
import defpackage.fc6;
import defpackage.i5h;
import defpackage.rm5;
import defpackage.w9h;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S3 {

    @NotNull
    private final T9 a;

    @Nullable
    private Boolean b;

    @Nullable
    private ConcurrentHashMap<String, Boolean> c;

    @NotNull
    private final InterfaceC4339u7 d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function1<AdapterBaseWrapper, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull AdapterBaseWrapper adapterBaseWrapper) {
            adapterBaseWrapper.getClass();
            return adapterBaseWrapper.getSettings().getProviderTypeForReflection();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function1<String, Boolean> {
        final /* synthetic */ ConcurrentHashMap<String, Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
            super(1);
            this.a = concurrentHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            str.getClass();
            return Boolean.valueOf(Intrinsics.c(this.a.get(str), Boolean.TRUE));
        }
    }

    public S3(@NotNull T9 t9) {
        t9.getClass();
        this.a = t9;
        this.d = Ib.v.d().a();
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

    public final void a(int i, @NotNull Map<String, ? extends NetworkSettings> map) {
        JSONObject applicationSettings;
        map.getClass();
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
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.c(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(T3.a)) {
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
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(T3.a)) : null));
        }
    }

    public final void b(@NotNull Map<String, ? extends AdapterBaseWrapper> map) {
        Iterable iterable;
        map.getClass();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.c;
        if (concurrentHashMap == null) {
            return;
        }
        if (map.isEmpty()) {
            this.a.b();
            return;
        }
        c38 c38Var = new c38(i5h.g(i5h.o(CollectionsKt.N(map.values()), a.a), new b(concurrentHashMap)));
        if (c38Var.hasNext()) {
            Object next = c38Var.next();
            if (c38Var.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(next);
                while (c38Var.hasNext()) {
                    linkedHashSet.add(c38Var.next());
                }
                iterable = linkedHashSet;
            } else {
                iterable = w9h.b(next);
            }
        } else {
            iterable = rm5.a;
        }
        this.a.a(CollectionsKt.S0(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ S3(T9 t9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new T9() : t9);
    }

    private final void c() {
        this.b = null;
        this.a.a();
    }

    private final Boolean b(NetworkSettings networkSettings) {
        if (networkSettings == null || networkSettings.isCustomNetwork() || !networkSettings.getApplicationSettings().has(T3.a)) {
            return null;
        }
        return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(T3.a));
    }

    @NotNull
    public final InterfaceC4339u7 b() {
        return this.d;
    }

    public final void a(boolean z) {
        d();
        this.b = Boolean.valueOf(z);
    }

    private final void a(Map<String, Boolean> map) {
        c();
        this.c = new ConcurrentHashMap<>(map);
    }

    public final void a(@NotNull Map<String, ? extends AbstractAdapter> map, @NotNull Map<String, ? extends AdapterBaseWrapper> map2) {
        Unit unit;
        map.getClass();
        map2.getClass();
        Iterator<? extends AbstractAdapter> it = map.values().iterator();
        while (it.hasNext()) {
            a(it.next(), (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : map2.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(@NotNull AdapterBaseInterface adapterBaseInterface, @Nullable NetworkSettings networkSettings) {
        adapterBaseInterface.getClass();
        try {
            Boolean a2 = a(networkSettings);
            if (a2 == null || !(adapterBaseInterface instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapterBaseInterface).setConsent(a2.booleanValue());
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String n = fc6.n("error while setting consent of ", networkSettings != null ? networkSettings.getProviderName() : null, ": ", th.getLocalizedMessage());
            a(n);
            IronLog.INTERNAL.error(n);
        }
    }

    public final void a(@NotNull AbstractAdapter abstractAdapter, @Nullable NetworkSettings networkSettings) {
        abstractAdapter.getClass();
        try {
            Boolean a2 = a(networkSettings);
            if (a2 != null) {
                abstractAdapter.setNewConsent(a2.booleanValue());
            }
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String n = fc6.n("error while setting consent of ", abstractAdapter.getProviderName(), ": ", th.getLocalizedMessage());
            a(n);
            IronLog.INTERNAL.error(n);
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

    public final void a(@NotNull Map<String, Boolean> map, @NotNull Map<String, ? extends AbstractAdapter> map2, @NotNull Map<String, ? extends AdapterBaseWrapper> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        a(map);
        a(map2, map3);
        b(map3);
    }

    public final void a(boolean z, @NotNull Map<String, ? extends AbstractAdapter> map, @NotNull Map<String, ? extends AdapterBaseWrapper> map2) {
        map.getClass();
        map2.getClass();
        a(z);
        a(map, map2);
        this.a.a(z);
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            F9.i().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void a(int i) {
        JSONObject b2 = IronSourceUtils.b(false);
        try {
            b2.put(IronSourceConstants.EVENTS_EXT1, i + ";" + this.d.G(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(de6.b(e));
        }
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.CONSENT_TCF_CODE, b2));
    }

    @Nullable
    public final Boolean a() {
        return this.b;
    }
}
