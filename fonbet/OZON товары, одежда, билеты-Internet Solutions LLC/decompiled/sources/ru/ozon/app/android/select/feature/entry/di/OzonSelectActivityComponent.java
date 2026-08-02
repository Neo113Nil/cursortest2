package ru.ozon.app.android.select.feature.entry.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/select/feature/entry/di/OzonSelectActivityComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/select/feature/entry/OzonSelectActivity;", "Factory", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OzonSelectActivityComponent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/select/feature/entry/di/OzonSelectActivityComponent$Factory;", "", "create", "Lru/ozon/app/android/select/feature/entry/di/OzonSelectActivityComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "appOnboardingComponentApi", "Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        OzonSelectActivityComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull AppOnboardingComponentApi appOnboardingComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi);
    }

    void inject(@NotNull OzonSelectActivity screen);
}
