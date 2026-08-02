package ru.ozon.app.android.navigation.di;

import EZ.h;
import GZ.g;
import GZ.k;
import HZ.e;
import Jb.j;
import KZ.c;
import KZ.d;
import Pc.a;
import nZ.C8475a;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.navigation.di.NavigationComponent;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_BindDeeplinkHandlersCacheFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_BindDeeplinkPageResolverFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideMiniAppConfigHolderFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideMiniAppMapperFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideNavigationGraphFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideNavigatorHolderFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideOzonRouterFactory;
import ru.ozon.app.android.navigation.di.module.NavigationModule_Companion_ProvideRouteFactoryFactory;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolderImpl;
import yZ.InterfaceC10874a;

/* loaded from: classes6.dex */
public final class DaggerNavigationComponent {

    private static final class Factory implements NavigationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponent.Factory
        public NavigationComponent create(NavigationComponentDependencies navigationComponentDependencies) {
            navigationComponentDependencies.getClass();
            return new NavigationComponentImpl(navigationComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class NavigationComponentImpl implements NavigationComponent {
        private a<CurrentMiniAppHolder> bindCurrentMiniAppHolderProvider;
        private a<CurrentMiniAppHolderImpl> currentMiniAppHolderImplProvider;
        private final NavigationComponentDependencies navigationComponentDependencies;
        private final NavigationComponentImpl navigationComponentImpl;
        private a<C8475a> provideNavigationGraphProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92936id;
            private final NavigationComponentImpl navigationComponentImpl;

            SwitchingProvider(NavigationComponentImpl navigationComponentImpl, int i11) {
                this.navigationComponentImpl = navigationComponentImpl;
                this.f92936id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92936id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new CurrentMiniAppHolderImpl(this.navigationComponentImpl.getMiniAppConfigHolder());
                    }
                    throw new AssertionError(this.f92936id);
                }
                C8475a.c navigationConfig = this.navigationComponentImpl.navigationComponentDependencies.getNavigationConfig();
                j.c(navigationConfig);
                GZ.a commonPageProvider = this.navigationComponentImpl.navigationComponentDependencies.getCommonPageProvider();
                j.c(commonPageProvider);
                InterfaceC10874a customActivityNavigatorChecker = this.navigationComponentImpl.navigationComponentDependencies.getCustomActivityNavigatorChecker();
                j.c(customActivityNavigatorChecker);
                c[] globalDeeplinkInterceptors = this.navigationComponentImpl.navigationComponentDependencies.getGlobalDeeplinkInterceptors();
                j.c(globalDeeplinkInterceptors);
                d[] globalDestinationInterceptors = this.navigationComponentImpl.navigationComponentDependencies.getGlobalDestinationInterceptors();
                j.c(globalDestinationInterceptors);
                return (T) NavigationModule_Companion_ProvideNavigationGraphFactory.provideNavigationGraph(navigationConfig, commonPageProvider, customActivityNavigatorChecker, globalDeeplinkInterceptors, globalDestinationInterceptors);
            }
        }

        /* synthetic */ NavigationComponentImpl(NavigationComponentDependencies navigationComponentDependencies, int i11) {
            this(navigationComponentDependencies);
        }

        private void initialize(NavigationComponentDependencies navigationComponentDependencies) {
            this.provideNavigationGraphProvider = Jb.d.b(new SwitchingProvider(this.navigationComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.navigationComponentImpl, 1);
            this.currentMiniAppHolderImplProvider = switchingProvider;
            this.bindCurrentMiniAppHolderProvider = Jb.d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public CurrentMiniAppHolder getCurrentMiniAppHolder() {
            return this.bindCurrentMiniAppHolderProvider.get();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public HZ.a getDeeplinkHandlersCache() {
            return NavigationModule_Companion_BindDeeplinkHandlersCacheFactory.bindDeeplinkHandlersCache(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public HZ.d getDeeplinkMiniAppMapper() {
            return NavigationModule_Companion_ProvideMiniAppMapperFactory.provideMiniAppMapper(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public e getDeeplinkPageResolver() {
            return NavigationModule_Companion_BindDeeplinkPageResolverFactory.bindDeeplinkPageResolver(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public BZ.e getMiniAppConfigHolder() {
            return NavigationModule_Companion_ProvideMiniAppConfigHolderFactory.provideMiniAppConfigHolder(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public NativePageDomainsInteractor getNativePageDomainsInteractor() {
            NativePageDomainsInteractor nativePageDomainsInteractor = this.navigationComponentDependencies.getNativePageDomainsInteractor();
            j.c(nativePageDomainsInteractor);
            return nativePageDomainsInteractor;
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public C8475a getNavigation() {
            return this.provideNavigationGraphProvider.get();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public h getNavigatorHolder() {
            return NavigationModule_Companion_ProvideNavigatorHolderFactory.provideNavigatorHolder(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public g getOzonRouter() {
            return NavigationModule_Companion_ProvideOzonRouterFactory.provideOzonRouter(this.provideNavigationGraphProvider.get());
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentApi
        public k getRouteFactory() {
            return NavigationModule_Companion_ProvideRouteFactoryFactory.provideRouteFactory(this.provideNavigationGraphProvider.get());
        }

        private NavigationComponentImpl(NavigationComponentDependencies navigationComponentDependencies) {
            this.navigationComponentImpl = this;
            this.navigationComponentDependencies = navigationComponentDependencies;
            initialize(navigationComponentDependencies);
        }
    }

    public static NavigationComponent.Factory factory() {
        return new Factory(0);
    }
}
