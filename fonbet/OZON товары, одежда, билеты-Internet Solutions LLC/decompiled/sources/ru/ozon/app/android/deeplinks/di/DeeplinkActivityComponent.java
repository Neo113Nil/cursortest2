package ru.ozon.app.android.deeplinks.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.deeplinks.DeeplinkActivity;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/deeplinks/di/DeeplinkActivityComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/deeplinks/DeeplinkActivity;", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeeplinkActivityComponent {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/deeplinks/di/DeeplinkActivityComponent$Factory;", "", "create", "Lru/ozon/app/android/deeplinks/di/DeeplinkActivityComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "appLaunchHandlersComponentApi", "Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponentApi;", "deeplinkActivityComponentDependencies", "Lru/ozon/app/android/deeplinks/di/DeeplinkActivityComponentDependencies;", "onboardingCheckerComponentApi", "Lru/ozon/app/android/storefront/onboardingscreen/di/OnboardingCheckerComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "tabsComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "appOnboardingComponentApi", "Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingComponentApi;", "platformComponent", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        DeeplinkActivityComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull AppLaunchHandlersComponentApi appLaunchHandlersComponentApi, @NotNull DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies, @NotNull OnboardingCheckerComponentApi onboardingCheckerComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull TabsComponentApi tabsComponentApi, @NotNull AppOnboardingComponentApi appOnboardingComponentApi, @NotNull AndroidPlatformComponentApi platformComponent);
    }

    void inject(@NotNull DeeplinkActivity screen);
}
