package ru.ozon.app.android.fresh.navigation.di.components;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/components/FreshTabNavigationFragmentComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/fresh/navigation/FreshTabNavigationFragment;", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment;", "Factory", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FreshTabNavigationFragmentComponent {

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/components/FreshTabNavigationFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/fresh/navigation/di/components/FreshTabNavigationFragmentComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "tabsComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "freshNavigationComponentApi", "Lru/ozon/app/android/fresh/navigation/di/components/FreshNavigationComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "tabsUiControllerComponentApi", "Lru/ozon/app/android/tabbar/di/TabsUiControllerComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        FreshTabNavigationFragmentComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NavigationComponentApi navigationComponentApi, @NotNull TabsComponentApi tabsComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull FreshNavigationComponentApi freshNavigationComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull TabsUiControllerComponentApi tabsUiControllerComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull AndroidPlatformComponentDependencies androidPlatformComponentDependencies);
    }

    void inject(@NotNull FreshTabNavigationFragment screen);

    void inject(@NotNull FreshNavigationFragment screen);
}
