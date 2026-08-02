package ru.ozon.app.android.bank.di;

import F80.a;
import GZ.g;
import GZ.k;
import HZ.a;
import K80.a;
import R90.c;
import T80.b;
import We.InterfaceC4875q;
import Z30.a;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import b40.InterfaceC5539a;
import b90.C5594a;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import i30.C7004a;
import i30.C7005b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.bank.externals.FintechAccountInitializerOzonId;
import ru.ozon.app.android.bank.externals.FintechAnalyticOzonId;
import ru.ozon.app.android.bank.externals.OzonTrackerPluginInterctorExternal;
import ru.ozon.app.android.bank.externals.bank.OzonExternalFintechAuth;
import ru.ozon.app.android.bank.externals.bank.OzonExternalFintechNavigation;
import ru.ozon.app.android.bank.externals.bank.OzonExternalFintechSettings;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.version.AppVersionService;
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
import ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;
import x70.C10675b;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020%2\b\b\u0001\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010-J-\u00106\u001a\u0002052\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\f\b\u0001\u00104\u001a\u000602j\u0002`3H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0002082\b\b\u0001\u0010)\u001a\u00020\u0012H\u0007¢\u0006\u0004\b9\u0010:J1\u0010A\u001a\u00020@2\b\b\u0001\u0010;\u001a\u00020+2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010BJ/\u0010H\u001a\u00020G2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ)\u0010O\u001a\u00020N2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010M\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\bO\u0010PJ\u0087\u0001\u0010a\u001a\u00020`2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u00172\b\b\u0001\u0010M\u001a\u00020\u00122\b\b\u0001\u0010U\u001a\u00020@2\b\b\u0001\u0010V\u001a\u00020N2\u0006\u0010W\u001a\u0002052\u0006\u0010X\u001a\u0002082\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010Y\u001a\u00020J2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0007¢\u0006\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lru/ozon/app/android/bank/di/FintechFinanceModule;", "", "<init>", "()V", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "androidPlatformComponentConfig", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "urls", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "provideExternalFintechSettings", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Landroid/content/Context;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/storage/hosts/FintechUrls;)Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "provideExternalFintechAuth", "(Lru/ozon/app/android/account/user/UserManager;)Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "LGZ/g;", "ozonRouter", "LGZ/k;", "routeFactory", "LHZ/a;", "deeplinkHandlersCache", "LT80/b;", "provideExternalFintechNavigation", "(LGZ/g;LGZ/k;LHZ/a;)LT80/b;", "LWe/q;", "ozCookieJar", "Lru/ozon/app/android/bank/network/FintechCookieJar;", "provideFintechCookieJar", "(LWe/q;Lru/ozon/app/android/storage/hosts/FintechUrls;)Lru/ozon/app/android/bank/network/FintechCookieJar;", "fintechCookieJar", "settings", "config", "Lb90/a;", "provideExternalOkHttpSettings", "(Lru/ozon/app/android/bank/network/FintechCookieJar;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)Lb90/a;", "Lei0/b;", "tracker", "Lqj/a;", "networkInfoProvider", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;", "provideOzonTrackerPluginInterctorExternal", "(Lei0/b;Lqj/a;LSg/a;)Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;", "Lv30/a;", "provideAntiFraudConfig", "(Lru/ozon/fintech/settings/domain/ExternalFintechSettings;)Lv30/a;", "externalOkHttpSettings", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "debugHeaderService", "Lru/ozon/fintech/network/domain/ExternalNetworkSettings;", "provideExternalNetworkSettings", "(Lb90/a;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/network/debug/DebugHeaderService;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)Lru/ozon/fintech/network/domain/ExternalNetworkSettings;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "provideBankTabBadgeManager", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/user/UserManager;Landroid/content/Context;Lcom/squareup/moshi/Moshi;)Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "LO30/b;", "provideFintechLibType", "()LO30/b;", "externalFintechSettings", "Li30/a;", "provideGraylogConfig", "(Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/app/android/network/version/AppVersionService;)Li30/a;", "Landroid/app/Application;", "application", "externalFintechNavigation", "externalFintechAuth", "externalNetworkSettings", "graylogConfig", "ozonTracker", "antiFraudConfig", "fintechLibType", "Lb40/a;", "esiaApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LLd0/c;", "ozonLimbDiStore", "Lru/ozon/fintech/lib/FintechCoreLib;", "provideFintechCoreLib", "(Landroid/app/Application;LT80/b;Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/network/domain/ExternalNetworkSettings;Li30/a;Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;Lv30/a;Lru/ozon/app/android/storage/environment/EnvironmentService;LO30/b;Lru/ozon/app/android/account/user/UserManager;Lb40/a;Lru/ozon/app/android/network/abtool/FeatureChecker;LLd0/c;)Lru/ozon/fintech/lib/FintechCoreLib;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechFinanceModule {
    @NotNull
    public final C10219a provideAntiFraudConfig(@NotNull ExternalFintechSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new C10219a(String.valueOf(settings.getAppO3Name()), settings.getVersionName());
    }

    @NotNull
    public final BankTabBadgeManager provideBankTabBadgeManager(@NotNull ActionV2Repository actionV2Repository, @NotNull UserManager userManager, @NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new BankTabBadgeManager(actionV2Repository, userManager, context, moshi);
    }

    @NotNull
    public final ExternalFintechAuth provideExternalFintechAuth(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        return new OzonExternalFintechAuth(userManager);
    }

    @NotNull
    public final b provideExternalFintechNavigation(@NotNull g ozonRouter, @NotNull k routeFactory, @NotNull a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        return new OzonExternalFintechNavigation(deeplinkHandlersCache, ozonRouter, routeFactory);
    }

    @NotNull
    public final ExternalFintechSettings provideExternalFintechSettings(@NotNull AndroidPlatformComponentConfig androidPlatformComponentConfig, @NotNull AppVersionStorage appVersionStorage, @NotNull Context context, @NotNull EnvironmentService environmentService, @NotNull AreaLocalStore areaLocalStore, @NotNull AppVersionService appVersionService, @NotNull FintechUrls urls) {
        Intrinsics.checkNotNullParameter(androidPlatformComponentConfig, "androidPlatformComponentConfig");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(urls, "urls");
        return new OzonExternalFintechSettings(androidPlatformComponentConfig, appVersionStorage, context, environmentService, areaLocalStore, urls, appVersionService);
    }

    @NotNull
    public final ExternalNetworkSettings provideExternalNetworkSettings(@NotNull final C5594a externalOkHttpSettings, @NotNull final DebugToolsService debugToolsService, @NotNull final DebugHeaderService debugHeaderService, @NotNull final AndroidPlatformComponentConfig config) {
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(debugHeaderService, "debugHeaderService");
        Intrinsics.checkNotNullParameter(config, "config");
        return new ExternalNetworkSettings() { // from class: ru.ozon.app.android.bank.di.FintechFinanceModule$provideExternalNetworkSettings$1
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
    public final FintechCookieJar provideFintechCookieJar(@NotNull InterfaceC4875q ozCookieJar, @NotNull FintechUrls urls) {
        Intrinsics.checkNotNullParameter(ozCookieJar, "ozCookieJar");
        Intrinsics.checkNotNullParameter(urls, "urls");
        return new FintechCookieJar(ozCookieJar, Uri.parse(urls.getBankUrl()));
    }

    @NotNull
    public final FintechCoreLib provideFintechCoreLib(@NotNull final Application application, @NotNull b externalFintechNavigation, @NotNull ExternalFintechAuth externalFintechAuth, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull C7004a graylogConfig, @NotNull OzonTrackerPluginInterctorExternal ozonTracker, @NotNull C10219a antiFraudConfig, @NotNull EnvironmentService environmentService, @NotNull O30.b fintechLibType, @NotNull UserManager userManager, @NotNull InterfaceC5539a esiaApi, @NotNull FeatureChecker featureChecker, @NotNull Ld0.c ozonLimbDiStore) {
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
        F80.a a12 = a.C0193a.a();
        CameraScannerFactory cameraScannerFactory = new CameraScannerFactory() { // from class: ru.ozon.app.android.bank.di.FintechFinanceModule$provideFintechCoreLib$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CameraScannerType.values().length];
                    try {
                        iArr[CameraScannerType.SALUTE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CameraScannerType.MLKIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory
            public CameraScanner provide(CameraScannerType cameraScannerType, CameraScannerMode cameraScannerMode, List<String> barcodeFormats, String phoneRegex, boolean separateProcess, long processTimeout) {
                Intrinsics.checkNotNullParameter(cameraScannerType, "cameraScannerType");
                Intrinsics.checkNotNullParameter(cameraScannerMode, "cameraScannerMode");
                Intrinsics.checkNotNullParameter(barcodeFormats, "barcodeFormats");
                int i12 = WhenMappings.$EnumSwitchMapping$0[cameraScannerType.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        return null;
                    }
                    return new MlkitCameraScanner(barcodeFormats, phoneRegex, cameraScannerMode);
                }
                Context applicationContext = application.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return new SaluteCameraScanner(applicationContext, barcodeFormats, cameraScannerMode, separateProcess, processTimeout);
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
        return O30.b.FINANCE;
    }

    @NotNull
    public final C7004a provideGraylogConfig(@NotNull EnvironmentService environmentService, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull AppVersionService appVersionService) {
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        AppVersionService.Companion companion = AppVersionService.INSTANCE;
        return new C7004a(16, companion.isTravel(appVersionService) ? "fintech_travel" : companion.isSelect(appVersionService) ? "fintech_select" : companion.isFresh(appVersionService) ? "fintech_fresh" : "ozon", externalFintechSettings.getVersionName(), environmentService.isStage());
    }

    @NotNull
    public final OzonTrackerPluginInterctorExternal provideOzonTrackerPluginInterctorExternal(@NotNull InterfaceC6369b tracker, @NotNull C9067a networkInfoProvider, @NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        return new OzonTrackerPluginInterctorExternal(networkInfoProvider, tracker, analyticsScreenStorage);
    }
}
