package ru.ozon.app.android.cml.feature.tabs.di;

import EZ.h;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.data.CmlTabConfigMapper;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsViewModelImpl;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/di/CmlTabsNavigationFragmentComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "navigatorHolder", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Factory;", "getViewModelFactory", "()Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Factory;", "viewModelFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "getBottomNavigationController", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CmlTabsNavigationFragmentComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/di/CmlTabsNavigationFragmentComponent$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/cml/feature/tabs/di/CmlTabsNavigationFragmentComponent;", "fragment", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "tabComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "tabsUiControllerComponentApi", "Lru/ozon/app/android/tabbar/di/TabsUiControllerComponentApi;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CmlTabsNavigationFragmentComponent create(@NotNull final CmlTabsNavigationFragment fragment, @NotNull NetworkComponentApi networkComponentApi, @NotNull final NavigationComponentApi navigationComponentApi, @NotNull final TabsComponentApi tabComponentApi, @NotNull final TabsUiControllerComponentApi tabsUiControllerComponentApi, @NotNull final AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(networkComponentApi, "networkComponentApi");
            Intrinsics.checkNotNullParameter(navigationComponentApi, "navigationComponentApi");
            Intrinsics.checkNotNullParameter(tabComponentApi, "tabComponentApi");
            Intrinsics.checkNotNullParameter(tabsUiControllerComponentApi, "tabsUiControllerComponentApi");
            Intrinsics.checkNotNullParameter(androidPlatformComponentDependencies, "androidPlatformComponentDependencies");
            return new CmlTabsNavigationFragmentComponent(navigationComponentApi, fragment, tabsUiControllerComponentApi, tabComponentApi, androidPlatformComponentDependencies) { // from class: ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent$Companion$create$1
                final /* synthetic */ TabsComponentApi $tabComponentApi;
                private final BottomNavigationController bottomNavigationController;

                /* renamed from: cacheHolderTabActivityDelegate$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j cacheHolderTabActivityDelegate = k.b(CmlTabsNavigationFragmentComponent$Companion$create$1$cacheHolderTabActivityDelegate$2.INSTANCE);
                private final h navigatorHolder;
                private final g router;

                {
                    this.$tabComponentApi = tabComponentApi;
                    this.router = navigationComponentApi.getOzonRouter();
                    this.navigatorHolder = navigationComponentApi.getNavigatorHolder();
                    this.bottomNavigationController = new BottomNavigationController(fragment, tabsUiControllerComponentApi.getTabControllersFactory(), tabComponentApi.getTabAnalytics(), tabComponentApi.getTabbarDeeplinksResolver(), androidPlatformComponentDependencies.getAppType());
                }

                @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent
                public BottomNavigationController getBottomNavigationController() {
                    return this.bottomNavigationController;
                }

                @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent
                public CacheHolderTabActivityDelegate getCacheHolderTabActivityDelegate() {
                    return (CacheHolderTabActivityDelegate) this.cacheHolderTabActivityDelegate.getValue();
                }

                @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent
                public h getNavigatorHolder() {
                    return this.navigatorHolder;
                }

                @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent
                public g getRouter() {
                    return this.router;
                }

                @Override // ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent
                public CmlTabsViewModelImpl.Factory getViewModelFactory() {
                    return new CmlTabsViewModelImpl.Factory(this.$tabComponentApi.getTabConfigRepository(), this.$tabComponentApi.getTabConfigCache(), new CmlTabConfigMapper());
                }
            };
        }
    }

    @NotNull
    BottomNavigationController getBottomNavigationController();

    @NotNull
    CacheHolderTabActivityDelegate getCacheHolderTabActivityDelegate();

    @NotNull
    h getNavigatorHolder();

    @NotNull
    g getRouter();

    @NotNull
    CmlTabsViewModelImpl.Factory getViewModelFactory();
}
