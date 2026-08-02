package ru.ozon.app.android.fresh.navigation.di.components;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.fresh.navigation.FreshTabMiniAppFragment;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshSingleMiniAppFragment;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/components/FreshScreenComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/fresh/navigation/FreshTabMiniAppFragment;", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshSingleMiniAppFragment;", "Factory", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FreshScreenComponent {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/components/FreshScreenComponent$Factory;", "", "create", "Lru/ozon/app/android/fresh/navigation/di/components/FreshScreenComponent;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "freshNavigationComponentApi", "Lru/ozon/app/android/fresh/navigation/di/components/FreshNavigationComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        FreshScreenComponent create(@NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull FreshNavigationComponentApi freshNavigationComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull LocationComponentApi locationComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);
    }

    void inject(@NotNull FreshTabMiniAppFragment screen);

    void inject(@NotNull FreshSingleMiniAppFragment screen);
}
