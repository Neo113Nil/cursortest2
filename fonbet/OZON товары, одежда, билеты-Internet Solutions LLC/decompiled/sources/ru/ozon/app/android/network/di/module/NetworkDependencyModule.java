package ru.ozon.app.android.network.di.module;

import Fb0.e;
import Rg.a;
import android.content.Context;
import android.webkit.CookieManager;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryKt;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;
import ru.ozon.app.android.network.dependency.AppVersionServiceMobile;
import ru.ozon.app.android.network.dependency.FreshAppVersionService;
import ru.ozon.app.android.network.dependency.SelectAppVersionService;
import ru.ozon.app.android.network.dependency.TravelAppVersionService;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkDependencyModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NetworkDependencyModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkDependencyModule$Companion;", "", "<init>", "()V", "", "apiUrl", "apiUrlSuffix", "LFb0/e;", "appDomain", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "", "isDebug", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "provideNetworkComponentConfig", "(Ljava/lang/String;Ljava/lang/String;LFb0/e;Lru/ozon/android/hardwareinfo/DeviceType;Z)Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;", "advertisingMessagingInteractor", "Lru/ozon/app/android/storage/railwaymock/RailwayMockStorage;", "railwayMockStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "provideCustomHeadersInterceptorDependencies", "(Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;Lru/ozon/app/android/storage/railwaymock/RailwayMockStorage;Lru/ozon/app/android/storage/user/UserStatusStorage;Landroid/content/Context;)Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "Lru/ozon/app/android/network/interceptors/dependencies/AutoTestTraceIdInterceptorDependencies;", "provideAutoTestUserTraceInterceptorDependencies", "(Lru/ozon/app/android/storage/user/UserStatusStorage;)Lru/ozon/app/android/network/interceptors/dependencies/AutoTestTraceIdInterceptorDependencies;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/network/version/AppVersionService;", "provideAppVersionService", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/storage/appversion/AppVersionStorage;)Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "", "provideFeatureServiceRefreshIntervalMs", "(Lru/ozon/app/android/storage/debug/DebugToolsService;)Ljava/lang/Long;", "Landroid/webkit/CookieManager;", "provideWebViewCookieManager", "()Landroid/webkit/CookieManager;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppVersionService provideAppVersionService(@NotNull AppType appType, @NotNull AppVersionStorage appVersionStorage) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
            return appType == AppType.SELECT ? new SelectAppVersionService(appVersionStorage) : appType == AppType.TRAVEL ? new TravelAppVersionService(appVersionStorage) : appType == AppType.FRESH ? new FreshAppVersionService(appVersionStorage) : new AppVersionServiceMobile(appVersionStorage);
        }

        @NotNull
        public final AutoTestTraceIdInterceptorDependencies provideAutoTestUserTraceInterceptorDependencies(@NotNull final UserStatusStorage userStatusStorage) {
            Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
            return new AutoTestTraceIdInterceptorDependencies() { // from class: QA.a
                @Override // ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies
                public final boolean isAutoTestUser() {
                    boolean isAutoTestUser;
                    isAutoTestUser = UserStatusStorage.this.getIsAutoTestUser();
                    return isAutoTestUser;
                }
            };
        }

        @NotNull
        public final NetworkHeadersDependencies provideCustomHeadersInterceptorDependencies(@NotNull final AdvertisingMessagingInteractor advertisingMessagingInteractor, @NotNull final RailwayMockStorage railwayMockStorage, @NotNull final UserStatusStorage userStatusStorage, @NotNull final Context context) {
            Intrinsics.checkNotNullParameter(advertisingMessagingInteractor, "advertisingMessagingInteractor");
            Intrinsics.checkNotNullParameter(railwayMockStorage, "railwayMockStorage");
            Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
            Intrinsics.checkNotNullParameter(context, "context");
            return new NetworkHeadersDependencies() { // from class: ru.ozon.app.android.network.di.module.NetworkDependencyModule$Companion$provideCustomHeadersInterceptorDependencies$1
                private final a getCurrentScreen() {
                    Context context2 = context;
                    if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                        throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
                    }
                    C6740b dependencyStorage = C6739a.a(context2, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
                    if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                        throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
                    }
                    return ((AnalyticsScreenStorageComponentApi) dependencyStorage.b(AnalyticsScreenStorageComponentApi.class)).getApplicationAnalyticsScreenStorage().a();
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public String getAdvertisingId() {
                    return AdvertisingMessagingInteractor.this.getAdvertisingId();
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public String getDisplayedLanguage() {
                    Context context2 = context;
                    if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                        throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
                    }
                    C6740b dependencyStorage = C6739a.a(context2, AppLocaleComponentApi.class).getDependencyStorage();
                    if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                        throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
                    }
                    return AppLocaleRepositoryKt.mapToLanguageTag(((AppLocaleComponentApi) dependencyStorage.b(AppLocaleComponentApi.class)).getAppLocaleRepository().getDisplayedLocale());
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public boolean isLimitAdTrackingEnabled() {
                    return AdvertisingMessagingInteractor.this.getIsLimitAdTrackingEnabled();
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public boolean isOzonQA() {
                    return userStatusStorage.isOzonQa();
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public boolean isRailwayMockServiceEnabled() {
                    return railwayMockStorage.mo1019isEnabled();
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public String pageViewId() {
                    a currentScreen = getCurrentScreen();
                    if (currentScreen != null) {
                        return currentScreen.g();
                    }
                    return null;
                }

                @Override // ru.ozon.app.android.network.common.NetworkHeadersDependencies
                public String previousPageName() {
                    a h11;
                    a currentScreen = getCurrentScreen();
                    if (currentScreen == null || (h11 = currentScreen.h()) == null) {
                        return null;
                    }
                    return h11.f();
                }
            };
        }

        public final Long provideFeatureServiceRefreshIntervalMs(@NotNull DebugToolsService debugToolsService) {
            Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
            Long ffRefreshIntervalMinutes = debugToolsService.getFfRefreshIntervalMinutes();
            if (ffRefreshIntervalMinutes == null) {
                return null;
            }
            return Long.valueOf(TimeUnit.MINUTES.toMillis(ffRefreshIntervalMinutes.longValue()));
        }

        @NotNull
        public final NetworkComponentConfig provideNetworkComponentConfig(@NotNull String apiUrl, @NotNull String apiUrlSuffix, @NotNull e appDomain, @NotNull DeviceType deviceType, boolean isDebug) {
            Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
            Intrinsics.checkNotNullParameter(apiUrlSuffix, "apiUrlSuffix");
            Intrinsics.checkNotNullParameter(appDomain, "appDomain");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            return new NetworkComponentConfig(apiUrl, apiUrlSuffix, appDomain, isDebug, deviceType);
        }

        public final CookieManager provideWebViewCookieManager() {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th2) {
                Lm0.a.f17149a.e(th2);
                return null;
            }
        }

        private Companion() {
        }
    }
}
