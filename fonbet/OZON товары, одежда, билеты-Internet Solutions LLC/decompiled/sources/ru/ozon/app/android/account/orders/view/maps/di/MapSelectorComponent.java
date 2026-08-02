package ru.ozon.app.android.account.orders.view.maps.di;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsRouteFragment;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/di/MapSelectorComponent;", "", "inject", "", "view", "Lru/ozon/app/android/account/orders/view/maps/ui/MapsRouteFragment;", "Factory", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MapSelectorComponent {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/di/MapSelectorComponent$Factory;", "", "create", "Lru/ozon/app/android/account/orders/view/maps/di/MapSelectorComponent;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "pvzLocation", "Lcom/google/android/gms/maps/model/LatLng;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "componentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MapSelectorComponent create(@NotNull String title, @NotNull LatLng pvzLocation, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ContextComponentDependencies componentDependencies);
    }

    void inject(@NotNull MapsRouteFragment view);
}
