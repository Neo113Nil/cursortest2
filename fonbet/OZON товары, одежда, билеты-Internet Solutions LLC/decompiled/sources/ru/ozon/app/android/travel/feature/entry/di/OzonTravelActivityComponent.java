package ru.ozon.app.android.travel.feature.entry.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.map.di.TravelMapApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/di/OzonTravelActivityComponent;", "", "inject", "", "target", "Lru/ozon/app/android/travel/feature/entry/OzonTravelActivity;", "Factory", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OzonTravelActivityComponent {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/di/OzonTravelActivityComponent$Factory;", "", "create", "Lru/ozon/app/android/travel/feature/entry/di/OzonTravelActivityComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "onBoardingCheckerApi", "Lru/ozon/app/android/storefront/onboardingscreen/di/OnboardingCheckerComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "travelMapApi", "Lru/ozon/app/android/travel/map/di/TravelMapApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        OzonTravelActivityComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull OnboardingCheckerComponentApi onBoardingCheckerApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull TravelMapApi travelMapApi, @NotNull AnalyticsComponentApi analyticsComponentApi);
    }

    void inject(@NotNull OzonTravelActivity target);
}
