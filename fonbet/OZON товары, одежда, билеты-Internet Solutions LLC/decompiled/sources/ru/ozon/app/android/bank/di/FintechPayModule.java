package ru.ozon.app.android.bank.di;

import F80.a;
import K80.a;
import R90.c;
import T80.b;
import Z30.a;
import android.app.Application;
import android.content.Context;
import b40.InterfaceC5539a;
import b90.C5594a;
import i30.C7004a;
import i30.C7005b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.bank.externals.FintechAccountInitializerOzonId;
import ru.ozon.app.android.bank.externals.FintechAnalyticOzonId;
import ru.ozon.app.android.bank.externals.OzonTrackerPluginInterctorExternal;
import ru.ozon.app.android.bank.externals.pay.OzonPayExternalFintechSettings;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerMode;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;
import x70.C10675b;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010'\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0087\u0001\u0010?\u001a\u00020>2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010/\u001a\u00020\u001b2\b\b\u0001\u00100\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u00105\u001a\u00020\u00042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/bank/di/FintechPayModule;", "", "<init>", "()V", "LO30/b;", "provideFintechLibType", "()LO30/b;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "Li30/a;", "provideGraylogConfig", "(Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;)Li30/a;", "Lru/ozon/app/android/bank/network/FintechCookieJar;", "fintechCookieJar", "settings", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "Lb90/a;", "provideExternalOkHttpSettings", "(Lru/ozon/app/android/bank/network/FintechCookieJar;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)Lb90/a;", "externalOkHttpSettings", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "debugHeaderService", "Lru/ozon/fintech/network/domain/ExternalNetworkSettings;", "provideExternalNetworkSettings", "(Lb90/a;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/network/debug/DebugHeaderService;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)Lru/ozon/fintech/network/domain/ExternalNetworkSettings;", "androidPlatformComponentConfig", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Landroid/content/Context;", "context", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "urls", "provideExternalFintechSettings", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Landroid/content/Context;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/storage/hosts/FintechUrls;)Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "Landroid/app/Application;", "application", "LT80/b;", "externalFintechNavigation", "Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "externalFintechAuth", "externalNetworkSettings", "graylogConfig", "Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;", "ozonTracker", "Lv30/a;", "antiFraudConfig", "fintechLibType", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lb40/a;", "esiaApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LLd0/c;", "ozonLimbDiStore", "Lru/ozon/fintech/lib/FintechCoreLib;", "provideFintechCoreLib", "(Landroid/app/Application;LT80/b;Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/network/domain/ExternalNetworkSettings;Li30/a;Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;Lv30/a;Lru/ozon/app/android/storage/environment/EnvironmentService;LO30/b;Lru/ozon/app/android/account/user/UserManager;Lb40/a;Lru/ozon/app/android/network/abtool/FeatureChecker;LLd0/c;)Lru/ozon/fintech/lib/FintechCoreLib;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechPayModule {
    @NotNull
    public final ExternalFintechSettings provideExternalFintechSettings(@NotNull AndroidPlatformComponentConfig androidPlatformComponentConfig, @NotNull AppVersionStorage appVersionStorage, @NotNull Context context, @NotNull EnvironmentService environmentService, @NotNull AreaLocalStore areaLocalStore, @NotNull FintechUrls urls) {
        Intrinsics.checkNotNullParameter(androidPlatformComponentConfig, "androidPlatformComponentConfig");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(urls, "urls");
        return new OzonPayExternalFintechSettings(androidPlatformComponentConfig, appVersionStorage, context, environmentService, areaLocalStore, urls);
    }

    @NotNull
    public final ExternalNetworkSettings provideExternalNetworkSettings(@NotNull final C5594a externalOkHttpSettings, @NotNull final DebugToolsService debugToolsService, @NotNull final DebugHeaderService debugHeaderService, @NotNull final AndroidPlatformComponentConfig config) {
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(debugHeaderService, "debugHeaderService");
        Intrinsics.checkNotNullParameter(config, "config");
        return new ExternalNetworkSettings() { // from class: ru.ozon.app.android.bank.di.FintechPayModule$provideExternalNetworkSettings$1
            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getABVariantsHeader() {
                return DebugToolsService.this.getAbVariant();
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getHeaderToken() {
                return debugHeaderService.getInternalHeadersToken();
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public Boolean getIsAutotestsHeader() {
                return null;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getLoginHeader() {
                return null;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getMeshHeader() {
                return DebugToolsService.this.getMeshValue();
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            /* renamed from: getOkHttpSettings, reason: from getter */
            public C5594a get$externalOkHttpSettings() {
                return externalOkHttpSettings;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getPasswordHeader() {
                return null;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String getTestingFeaturesHeader() {
                return null;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public boolean isQa() {
                return config.getFlavorType() == FlavorType.f93213QA;
            }

            @Override // ru.ozon.fintech.network.domain.ExternalNetworkSettings
            public String provideDeviceStatusHeader() {
                return null;
            }
        };
    }

    @NotNull
    public final C5594a provideExternalOkHttpSettings(@NotNull FintechCookieJar fintechCookieJar, @NotNull ExternalFintechSettings settings, @NotNull AndroidPlatformComponentConfig config) {
        Intrinsics.checkNotNullParameter(fintechCookieJar, "fintechCookieJar");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(config, "config");
        return new C5594a(config.getFlavorType() == FlavorType.f93213QA, U.j(new Pair("x-app-version", settings.getAppVersionCombined()), new Pair("x-o3-app-name", String.valueOf(settings.getAppO3Name())), new Pair("x-o3-app-version", settings.getO3AppVersionCombined())), fintechCookieJar, e0.h(new c()));
    }

    @NotNull
    public final FintechCoreLib provideFintechCoreLib(@NotNull Application application, @NotNull b externalFintechNavigation, @NotNull ExternalFintechAuth externalFintechAuth, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull C7004a graylogConfig, @NotNull OzonTrackerPluginInterctorExternal ozonTracker, @NotNull C10219a antiFraudConfig, @NotNull EnvironmentService environmentService, @NotNull O30.b fintechLibType, @NotNull UserManager userManager, @NotNull InterfaceC5539a esiaApi, @NotNull FeatureChecker featureChecker, @NotNull Ld0.c ozonLimbDiStore) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        Intrinsics.checkNotNullParameter(externalFintechAuth, "externalFintechAuth");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(graylogConfig, "graylogConfig");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(antiFraudConfig, "antiFraudConfig");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        AnalyticsConfig analyticsConfig = new AnalyticsConfig(true, null, null, null, environmentService.isStage(), false, null, null, 206, null);
        int i11 = C10675b.f105097f;
        C10675b a11 = C10675b.a.a();
        a a12 = a.C0193a.a();
        CameraScannerFactory cameraScannerFactory = new CameraScannerFactory() { // from class: ru.ozon.app.android.bank.di.FintechPayModule$provideFintechCoreLib$1
            @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory
            public CameraScanner provide(CameraScannerType cameraScannerType, CameraScannerMode cameraScannerMode, List<String> barcodeFormats, String phoneRegex, boolean separateProcess, long processTimeout) {
                Intrinsics.checkNotNullParameter(cameraScannerType, "cameraScannerType");
                Intrinsics.checkNotNullParameter(cameraScannerMode, "cameraScannerMode");
                Intrinsics.checkNotNullParameter(barcodeFormats, "barcodeFormats");
                if (cameraScannerType == CameraScannerType.MLKIT) {
                    return new MlkitCameraScanner(barcodeFormats, phoneRegex, cameraScannerMode);
                }
                return null;
            }
        };
        int i12 = C7005b.f65783m;
        C7005b a13 = C7005b.a.a();
        long currentTimeMillis = System.currentTimeMillis();
        FintechCoreLib fintechCoreLib = new FintechCoreLib(application, externalFintechSettings, externalFintechAuth, externalNetworkSettings, externalFintechNavigation, analyticsConfig, a11, graylogConfig, antiFraudConfig, a12, cameraScannerFactory, a13, a.C0298a.a(), null, ozonTracker, null, null, null, null, esiaApi, a.C0655a.a(), currentTimeMillis, FintechNetworkProviderKt.getFintechSingleNetworkClientProvider(externalFintechSettings.isQa(), environmentService.isStage(), featureChecker, ozonLimbDiStore), null, fintechLibType, 8888320, null);
        new FintechAnalyticOzonId(userManager, fintechCoreLib).init();
        new FintechAccountInitializerOzonId(fintechCoreLib).init();
        return fintechCoreLib;
    }

    @NotNull
    public final O30.b provideFintechLibType() {
        return O30.b.PAY;
    }

    @NotNull
    public final C7004a provideGraylogConfig(@NotNull EnvironmentService environmentService, @NotNull ExternalFintechSettings externalFintechSettings) {
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        return new C7004a(16, "fintech_checkout", externalFintechSettings.getVersionName(), environmentService.isStage());
    }
}
