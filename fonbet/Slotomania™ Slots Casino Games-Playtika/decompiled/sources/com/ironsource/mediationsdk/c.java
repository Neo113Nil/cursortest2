package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C2492jc;
import com.ironsource.C2556n4;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2754y5;
import com.ironsource.F9;
import com.ironsource.Ff;
import com.ironsource.V3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class c {
    private static final String k = "IronSource";
    private static final String l = "com.ironsource.adapters";
    private static final String m = "aps";
    private static final c n = new c();
    private static final Object o = new Object();
    private String c;
    private String d;
    private Boolean e;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private V3 i = new V3();
    private final C2492jc j = new C2492jc();
    private final ConcurrentHashMap<String, AbstractAdapter> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AdapterBaseWrapper> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<String>> f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<IronSource.a, JSONObject> g = new ConcurrentHashMap<>();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static c b() {
        return n;
    }

    public void a(Map<String, Boolean> map) {
        synchronized (o) {
            this.i.a(map, this.a, this.b);
        }
    }

    public void c(boolean z) {
        Iterator<AdapterBaseWrapper> it = this.b.values().iterator();
        while (it.hasNext()) {
            a(it.next().getAdapterBaseInterface(), z);
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.b;
    }

    public void f() {
        this.a.clear();
        this.b.clear();
    }

    public void g() {
        synchronized (o) {
            this.i.b(this.b);
        }
    }

    public void b(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void c(String str, List<String> list) {
        synchronized (o) {
            this.f.put(str, list);
            if (!this.a.isEmpty()) {
                IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                b(str, list);
            }
            a(str, list);
        }
    }

    public void b(boolean z) {
        synchronized (o) {
            this.i.a(z);
            this.i.a(this.a, this.b);
        }
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z) {
        String str;
        String b = b(networkSettings);
        String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (o) {
            if (this.a.containsKey(b)) {
                return this.a.get(b);
            }
            AbstractAdapter a2 = a(b, providerTypeForReflection);
            if (a2 == null) {
                b(b + " adapter was not loaded");
                return null;
            }
            a2.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            try {
                str = a2.getCoreSDKVersion();
            } catch (Throwable th) {
                C2556n4.d().a(th);
                String str2 = "error while retrieving coreSDKVersion " + a2.getProviderName() + ": " + th.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            c(b + " was allocated (adapter version: " + a2.getVersion() + ", sdk version: " + str + ")");
            c(a2);
            this.j.a(a2);
            a(a2);
            this.i.a(a2, networkSettings);
            b(a2);
            a(jSONObject, a2, providerTypeForReflection);
            this.a.put(b, a2);
            return a2;
        }
    }

    private void b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e) {
            C2556n4.d().a(e);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
            a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    private void c(final AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (final String str : this.f.keySet()) {
            final List<String> list = this.f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(AdapterBaseInterface.this, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                C2556n4.d().a(th);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(final AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (final String str : this.f.keySet()) {
            final List<String> list = this.f.get(str);
            if (list != null) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(AbstractAdapter.this, str, list);
                    }
                }, abstractAdapter.getProviderName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void b(final String str, final List<String> list) {
        for (final AbstractAdapter abstractAdapter : this.a.values()) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(AbstractAdapter.this, str, list);
                }
            }, abstractAdapter.getProviderName());
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + aVar.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error("Missing package definition for " + networkSettings.getProviderTypeForReflection());
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private String b(NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        String c;
        String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            c = b(networkSettings);
        } else {
            c = c(networkSettings, aVar, uuid);
        }
        if (this.b.containsKey(c)) {
            return this.b.get(c).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        AdapterBaseInterface a2 = a(c, providerTypeForReflection, networkSettings);
        return (a2 != null || networkSettings.isCustomNetwork()) ? a2 : a(networkSettings, aVar, c);
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.h.compareAndSet(false, true)) {
            c("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.c, this.d, jSONObject);
            } catch (Exception e) {
                C2556n4.d().a(e);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    public void b(t tVar) {
        if (a(tVar)) {
            this.j.a(tVar);
            tVar.a(this.a.values(), this.b.values());
            tVar.b();
            if (StringUtils.toLowerCase(tVar.a()).equals(m)) {
                a(tVar.allData());
            }
        }
    }

    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    private String a(String str, IronSource.a aVar) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + StringUtils.toLowerCase(a(aVar)) + "." + str + a(aVar) + "Adapter";
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private String a(IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return "Rewarded";
        }
        if (i == 2) {
            return "Interstitial";
        }
        if (i == 3) {
            return "Banner";
        }
        if (i != 4) {
            return null;
        }
        return "NativeAd";
    }

    public void a(boolean z) {
        synchronized (o) {
            this.e = Boolean.valueOf(z);
            Iterator<AbstractAdapter> it = this.a.values().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Iterator<AdapterBaseWrapper> it2 = this.b.values().iterator();
            while (it2.hasNext()) {
                b(it2.next().getAdapterBaseInterface());
            }
        }
    }

    public void a(boolean z, String str) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
            if (adapterBaseWrapper.getSettings().getProviderTypeForReflection().equalsIgnoreCase(str)) {
                a(adapterBaseWrapper.getAdapterBaseInterface(), z);
            }
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface, boolean z) {
        if (adapterBaseInterface instanceof AdapterTestModeInterface) {
            try {
                ((AdapterTestModeInterface) adapterBaseInterface).setTestMode(z);
            } catch (Exception e) {
                C2556n4.d().a(e);
                String str = "error while setting testMode of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(final String str, final List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
            final AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(AdapterBaseInterface.this, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th.getLocalizedMessage();
            a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.g.keySet()) {
            try {
                JSONObject jSONObject = this.g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(Ff.a(aVar), jSONObject);
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) || this.g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.g.keySet()) {
            try {
                JSONObject jSONObject = this.g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(Ff.a(aVar), jSONObject);
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.g.clear();
    }

    private s a(NetworkSettings networkSettings, IronSource.a aVar, String str) {
        AbstractAdapter a2 = a(networkSettings, b(networkSettings, aVar), false);
        if (a2 != null) {
            s sVar = new s(a2);
            this.b.put(str, new AdapterBaseWrapper(sVar, networkSettings));
            return sVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        String a2;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            a2 = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            a2 = a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(a2).newInstance();
            IronLog.INTERNAL.info(a2 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str3 = "failed to load " + a2;
                IronLog.INTERNAL.error(str3);
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            }
            return null;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        BaseAdAdapter<?, ?> a2 = a(networkSettings, aVar);
        if (a2 != null || networkSettings.isCustomNetwork()) {
            return a2;
        }
        AbstractAdapter a3 = a(networkSettings);
        if (a3 != null) {
            return com.ironsource.mediationsdk.a.a(a3, networkSettings, aVar, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar) {
        boolean isCustomNetwork = networkSettings.isCustomNetwork();
        if (isCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String a2 = a(networkSettings, aVar, isCustomNetwork, a(networkSettings, aVar, isCustomNetwork));
        try {
            return a(a2, networkSettings);
        } catch (Exception e) {
            if (isCustomNetwork) {
                a(e, a2);
            }
            return null;
        }
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z) {
        if (z) {
            return networkSettings.getCustomNetworkAdapterName(aVar);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z, String str) {
        if (z) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return a(str, aVar);
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    private void a(Exception exc, String str) {
        String str2 = "Failed to load adapter class: " + str;
        IronLog.INTERNAL.error(str2);
        a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2 + " - " + exc.getMessage());
    }

    private void a(EnumC2754y5 enumC2754y5, String str) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (!TextUtils.isEmpty(str)) {
                jsonObjectInit.put("reason", str);
            }
            F9.i().a(new C2736x5(enumC2754y5, jsonObjectInit));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(t tVar) {
        if (tVar.allData().length() == 0) {
            a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(tVar.a())) {
            return true;
        }
        a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.a.BANNER.toString())) {
                a(LevelPlay.AdFormat.BANNER, optJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.INTERSTITIAL.toString())) {
                a(LevelPlay.AdFormat.INTERSTITIAL, optJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.REWARDED_VIDEO.toString())) {
                a(LevelPlay.AdFormat.REWARDED, optJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.toString());
                if (!this.a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.a.values()) {
                        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jsonObjectInit);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
                    if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(m)) {
                        AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jsonObjectInit);
                            return;
                        }
                        return;
                    }
                }
                synchronized (o) {
                    this.g.put(Ff.b(adFormat), jsonObjectInit);
                }
                return;
            } catch (Exception e) {
                C2556n4.d().a(e);
                String str = "error while setting APSData: " + e.getLocalizedMessage();
                a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
                return;
            }
        }
        a(EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        b("APSData is empty");
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.a;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
