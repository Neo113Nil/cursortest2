package ru.ozon.app.android.travel.feature.general.common.tab.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment;
import ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelTabNavigationFragmentComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment;", "screen", "", "inject", "(Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment;)V", "Factory", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TravelTabNavigationFragmentComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelTabNavigationFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/travel/feature/general/common/tab/di/TravelTabNavigationFragmentComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "tabComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "tabsUiControllerComponentApi", "Lru/ozon/app/android/tabbar/di/TabsUiControllerComponentApi;", "travelUnpaidOrderStorageApi", "Lru/ozon/app/android/travel/ui/tabs/di/TravelUnpaidOrderStorageApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        TravelTabNavigationFragmentComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull TabsComponentApi tabComponentApi, @NotNull TabsUiControllerComponentApi tabsUiControllerComponentApi, @NotNull TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull AndroidPlatformComponentDependencies androidPlatformComponentDependencies);
    }

    void inject(@NotNull TravelTabNavigationFragment screen);
}
