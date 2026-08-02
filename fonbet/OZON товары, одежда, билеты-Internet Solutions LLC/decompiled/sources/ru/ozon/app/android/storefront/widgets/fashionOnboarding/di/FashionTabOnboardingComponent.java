package ru.ozon.app.android.storefront.widgets.fashionOnboarding.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/di/FashionTabOnboardingComponent;", "", "inject", "", "dialog", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/FashionTabOnboardingDialog;", "Factory", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FashionTabOnboardingComponent {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/di/FashionTabOnboardingComponent$Factory;", "", "create", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/di/FashionTabOnboardingComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        FashionTabOnboardingComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);
    }

    void inject(@NotNull FashionTabOnboardingDialog dialog);
}
