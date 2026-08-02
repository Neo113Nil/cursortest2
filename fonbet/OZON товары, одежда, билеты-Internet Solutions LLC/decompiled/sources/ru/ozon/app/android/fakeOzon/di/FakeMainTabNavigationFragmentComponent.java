package ru.ozon.app.android.fakeOzon.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fakeOzon/di/FakeMainTabNavigationFragmentComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment;", "Factory", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FakeMainTabNavigationFragmentComponent {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fakeOzon/di/FakeMainTabNavigationFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/fakeOzon/di/FakeMainTabNavigationFragmentComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "tabComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "tabUiControllerComponentApi", "Lru/ozon/app/android/tabbar/di/TabsUiControllerComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        FakeMainTabNavigationFragmentComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NavigationComponentApi navigationComponentApi, @NotNull TabsComponentApi tabComponentApi, @NotNull TabsUiControllerComponentApi tabUiControllerComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull AndroidPlatformComponentDependencies androidPlatformComponentDependencies);
    }

    void inject(@NotNull FakeOzonTabNavigationFragment screen);
}
