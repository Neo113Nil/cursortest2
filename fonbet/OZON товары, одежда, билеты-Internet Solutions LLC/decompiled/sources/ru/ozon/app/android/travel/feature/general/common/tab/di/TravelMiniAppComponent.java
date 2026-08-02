package ru.ozon.app.android.travel.feature.general.common.tab.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelMiniAppFragment;
import ru.ozon.app.android.travel.map.di.TravelMapApi;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelMiniAppComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppFragment;", "screen", "", "inject", "(Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppFragment;)V", "Factory", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TravelMiniAppComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelMiniAppComponent$Factory;", "", "create", "Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelMiniAppComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "travelMapApi", "Lru/ozon/app/android/travel/map/di/TravelMapApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        TravelMiniAppComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull LocationComponentApi locationComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull TravelMapApi travelMapApi, @NotNull NetworkComponentApi networkComponentApi);
    }

    void inject(@NotNull TravelMiniAppFragment screen);
}
