package ru.ozon.app.android.mapcommon.ozongeoproxyclient;

import Fb0.e;
import Sc.InterfaceC4008j;
import We.E;
import ei0.InterfaceC6369b;
import ie0.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.geoprovider.GeoProviderRepository;
import ru.ozon.app.android.mapcommon.map.flags.MapShouldBeHideFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.ComposerApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClientImpl;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "geoProviderRepository", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "mapPreferences", "LWe/E;", "httpClient", "Lei0/b;", "tracker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/geoprovider/GeoProviderRepository;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;LWe/E;Lei0/b;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "appName", "", "logClientName", "(Ljava/lang/String;)V", "addInterceptorIfNeedIt", "(LWe/E;)LWe/E;", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "host", "locationUid", "setConfig", "(Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;Ljava/lang/String;)V", "setAppName", "(Ljava/lang/String;Ljava/lang/String;)V", "fetchGeoProvider", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "fetchGeoProviderWithResult", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "", "isGeoProviderHold", "()Z", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "LWe/E;", "Lei0/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lsj/d;", "ozonLogger$delegate", "LSc/j;", "getOzonLogger", "()Lsj/d;", "ozonLogger", "Companion", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonGeoProxyClientImpl implements OzonGeoProxyClient {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GeoProviderRepository geoProviderRepository;

    @NotNull
    private final E httpClient;

    @NotNull
    private final MapPreferences mapPreferences;

    /* renamed from: ozonLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonLogger;

    @NotNull
    private final InterfaceC6369b tracker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClientImpl$Companion;", "", "<init>", "()V", "LOG_TEAM", "", "LOG_GROUP", "LOG_MESSAGE", "CLIENT_NAME_LOG_KEY", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OzonGeoProxyClientImpl(@NotNull GeoProviderRepository geoProviderRepository, @NotNull MapPreferences mapPreferences, @NotNull E httpClient, @NotNull InterfaceC6369b tracker, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(geoProviderRepository, "geoProviderRepository");
        Intrinsics.checkNotNullParameter(mapPreferences, "mapPreferences");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.geoProviderRepository = geoProviderRepository;
        this.mapPreferences = mapPreferences;
        this.httpClient = httpClient;
        this.tracker = tracker;
        this.featureChecker = featureChecker;
        this.ozonLogger = UtilsKt.unsafeLazy(OzonGeoProxyClientImpl$ozonLogger$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E addInterceptorIfNeedIt(E e11) {
        if (!this.featureChecker.isEnabled(MapShouldBeHideFlag.INSTANCE)) {
            return e11;
        }
        e11.getClass();
        E.a aVar = new E.a(e11);
        aVar.a(new MapShouldBeHideInterceptor());
        return new E(aVar);
    }

    private final d getOzonLogger() {
        return (d) this.ozonLogger.getValue();
    }

    private final void logClientName(String appName) {
        getOzonLogger().f(c.INFO, "Client name changed", f.a(U.i(new Pair("clientName", appName))), Boolean.FALSE);
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    public void fetchGeoProvider(String locationUid) {
        String appName;
        g.f66321a.getClass();
        GeoProxyConfig c11 = g.c();
        if (c11 != null && (appName = c11.getAppName()) != null) {
            logClientName(appName);
        }
        if (GeoProviderRepository.DefaultImpls.getGeoProviderConfig$default(this.geoProviderRepository, null, 1, null) == null || !isGeoProviderHold()) {
            this.geoProviderRepository.fetchGeoProvider(locationUid);
        }
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    @NotNull
    public GeoProviderConfig fetchGeoProviderWithResult(String locationUid) {
        return this.geoProviderRepository.fetchGeoProviderWithResult(locationUid);
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    public GeoProviderConfig getGeoProviderConfig() {
        return GeoProviderRepository.DefaultImpls.getGeoProviderConfig$default(this.geoProviderRepository, null, 1, null);
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    public boolean isGeoProviderHold() {
        return this.mapPreferences.isGeoProviderHold();
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    public void setAppName(@NotNull final String appName, String locationUid) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        g.f66321a.getClass();
        GeoProxyConfig c11 = g.c();
        final GeoProxyConfigClient geoProxyConfigClient = c11 != null ? (GeoProxyConfigClient) c11 : null;
        if (Intrinsics.d(geoProxyConfigClient != null ? geoProxyConfigClient.getAppName() : null, appName)) {
            return;
        }
        g.k(new GeoProxyConfigClient(appName, geoProxyConfigClient, this) { // from class: ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClientImpl$setAppName$config$1
            private final String appName;
            private final ApiHost host;
            private final E okHttpClient;
            private final InterfaceC6369b ozonTracker;

            {
                ApiHost composerApiHost;
                e eVar;
                InterfaceC6369b ozonTracker;
                E okHttpClient;
                this.appName = appName;
                if (geoProxyConfigClient == null || (composerApiHost = geoProxyConfigClient.getHost()) == null) {
                    e.Companion.getClass();
                    eVar = e.defaultProd;
                    composerApiHost = new ComposerApiHost(eVar);
                }
                this.host = composerApiHost;
                this.okHttpClient = (geoProxyConfigClient == null || (okHttpClient = geoProxyConfigClient.getOkHttpClient()) == null) ? this.httpClient : okHttpClient;
                this.ozonTracker = (geoProxyConfigClient == null || (ozonTracker = geoProxyConfigClient.getOzonTracker()) == null) ? this.tracker : ozonTracker;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public String getAppName() {
                return this.appName;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public ApiHost getHost() {
                return this.host;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient
            public E getOkHttpClient() {
                return this.okHttpClient;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public InterfaceC6369b getOzonTracker() {
                return this.ozonTracker;
            }
        });
        fetchGeoProvider(locationUid);
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient
    public void setConfig(@NotNull final String appName, @NotNull final ApiHost host, String locationUid) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(host, "host");
        g.f66321a.getClass();
        GeoProxyConfig c11 = g.c();
        final GeoProxyConfigClient geoProxyConfigClient = c11 != null ? (GeoProxyConfigClient) c11 : null;
        g.k(new GeoProxyConfigClient(geoProxyConfigClient, appName, host, this) { // from class: ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClientImpl$setConfig$config$1
            private final String appName;
            private final ApiHost host;
            private final E okHttpClient;
            private final InterfaceC6369b ozonTracker;

            {
                E addInterceptorIfNeedIt;
                InterfaceC6369b ozonTracker;
                E okHttpClient;
                ApiHost host2;
                String appName2;
                if (geoProxyConfigClient != null && (appName2 = geoProxyConfigClient.getAppName()) != null) {
                    r3 = appName2;
                }
                this.appName = r3;
                if (geoProxyConfigClient != null && (host2 = geoProxyConfigClient.getHost()) != null) {
                    r4 = host2;
                }
                this.host = r4;
                addInterceptorIfNeedIt = this.addInterceptorIfNeedIt((geoProxyConfigClient == null || (okHttpClient = geoProxyConfigClient.getOkHttpClient()) == null) ? this.httpClient : okHttpClient);
                this.okHttpClient = addInterceptorIfNeedIt;
                this.ozonTracker = (geoProxyConfigClient == null || (ozonTracker = geoProxyConfigClient.getOzonTracker()) == null) ? this.tracker : ozonTracker;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public String getAppName() {
                return this.appName;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public ApiHost getHost() {
                return this.host;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient
            public E getOkHttpClient() {
                return this.okHttpClient;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public InterfaceC6369b getOzonTracker() {
                return this.ozonTracker;
            }
        });
    }
}
