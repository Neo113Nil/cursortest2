package ru.ozon.app.android.autopicker.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/autopicker/di/AutoPickerComponent;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment;", "fragment", "", "inject", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment;)V", "Factory", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoPickerComponent {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/autopicker/di/AutoPickerComponent$Factory;", "", "create", "Lru/ozon/app/android/autopicker/di/AutoPickerComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "composerFragmentComponentDependencies", "Lru/ozon/app/android/composer/universalscreen/di/ComposerFragmentComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AutoPickerComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull ComposerFragmentComponentDependencies composerFragmentComponentDependencies, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);
    }

    void inject(@NotNull ProductPickerSearchFragment fragment);
}
