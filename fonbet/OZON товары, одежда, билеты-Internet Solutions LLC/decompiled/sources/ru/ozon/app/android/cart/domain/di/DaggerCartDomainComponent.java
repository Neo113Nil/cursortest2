package ru.ozon.app.android.cart.domain.di;

import BZ.e;
import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import WZ.l;
import java.util.Set;
import retrofit2.Retrofit;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.common.domain.delegate.ResolveCartTabNavigationActionUseCase;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.domain.CartDomainAnalytics;
import ru.ozon.app.android.cart.domain.CartDomainInteractorImpl;
import ru.ozon.app.android.cart.domain.CartManagerImpl;
import ru.ozon.app.android.cart.domain.CartNavigationServiceImpl;
import ru.ozon.app.android.cart.domain.CartServiceImpl;
import ru.ozon.app.android.cart.domain.VersionCartState;
import ru.ozon.app.android.cart.domain.async.AsyncCartViewModelProviderWrapperImpl;
import ru.ozon.app.android.cart.domain.cartMode.CartModeManagerImpl;
import ru.ozon.app.android.cart.domain.cartMode.CartModeRepository;
import ru.ozon.app.android.cart.domain.data.CartDomainApi;
import ru.ozon.app.android.cart.domain.data.actions.CartActionDelegate;
import ru.ozon.app.android.cart.domain.delegate.CartChangeCheckerImpl;
import ru.ozon.app.android.cart.domain.delegate.CartItemsCheckerImpl;
import ru.ozon.app.android.cart.domain.delegate.CartScreenStateHolderImpl;
import ru.ozon.app.android.cart.domain.di.CartDomainComponent;
import ru.ozon.app.android.cart.domain.di.module.CartDomainModule_Companion_ProvideCartDomainApiFactory;
import ru.ozon.app.android.cart.domain.di.module.CartDomainModule_Companion_ProvideLocalCartDataStorageFactory;
import ru.ozon.app.android.cart.domain.di.module.CartDomainModule_Companion_ProvideLocalFamilyCartDataStorageFactory;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;
import ru.ozon.app.android.cart.domain.network.CartSyncService;
import ru.ozon.app.android.cart.domain.network.CartSyncTracking;
import ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartCacheHandler;
import ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl;
import ru.ozon.app.android.cart.domain.prefetch.di.CartPrefetchModule_Companion_ProvideCartCacheHandlerFactory;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCartDomainComponent {

    private static final class CartDomainComponentImpl implements CartDomainComponent {
        private final ActionComponentApi actionComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<AsyncCartViewModelProviderWrapperImpl> asyncCartViewModelProviderWrapperImplProvider;
        private a<AsyncCartViewModelProviderWrapper> bindAsyncCartViewModelFactoryProvider;
        private a<CartChangeChecker> bindCartChangeCheckerProvider;
        private a<CartItemsChecker> bindCartItemsCheckerProvider;
        private a<CartModeManager> bindCartModeServiceProvider;
        private a<CartScreenStateHolder> bindCartScreenStateHolderProvider;
        private final CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi;
        private a<CartActionDelegate> cartActionDelegateProvider;
        private a<CartChangeCheckerImpl> cartChangeCheckerImplProvider;
        private final CartDomainComponentImpl cartDomainComponentImpl;
        private a<CartItemsCheckerImpl> cartItemsCheckerImplProvider;
        private a<CartManagerImpl> cartManagerImplProvider;
        private a<CartManagerPrefetch> cartManagerPrefetchProvider;
        private a<CartModeManagerImpl> cartModeManagerImplProvider;
        private a<CartNavigationServiceImpl> cartNavigationServiceImplProvider;
        private a<CartPrefetchControllerImpl> cartPrefetchControllerImplProvider;
        private a<CartScreenStateHolderImpl> cartScreenStateHolderImplProvider;
        private a<CartSyncService> cartSyncServiceProvider;
        private final ComposerComponentApi composerComponentApi;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<CartCacheHandler> provideCartCacheHandlerProvider;
        private a<LocalCartDataStorage> provideLocalCartDataStorageProvider;
        private a<LocalCartDataStorage> provideLocalFamilyCartDataStorageProvider;
        private final StorefrontCommonComponentApi storefrontCommonComponentApi;
        private a<VersionCartState> versionCartStateProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CartDomainComponentImpl cartDomainComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92260id;

            SwitchingProvider(CartDomainComponentImpl cartDomainComponentImpl, int i11) {
                this.cartDomainComponentImpl = cartDomainComponentImpl;
                this.f92260id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92260id) {
                    case 0:
                        CartSyncService cartSyncService = (CartSyncService) this.cartDomainComponentImpl.cartSyncServiceProvider.get();
                        LocalCartDataStorage localCartDataStorage = (LocalCartDataStorage) this.cartDomainComponentImpl.provideLocalCartDataStorageProvider.get();
                        LocalCartDataStorage localCartDataStorage2 = (LocalCartDataStorage) this.cartDomainComponentImpl.provideLocalFamilyCartDataStorageProvider.get();
                        CartNavigationService cartNavigationService = (CartNavigationService) this.cartDomainComponentImpl.cartNavigationServiceImplProvider.get();
                        CurrentMiniAppHolder currentMiniAppHolder = this.cartDomainComponentImpl.navigationComponentApi.getCurrentMiniAppHolder();
                        j.c(currentMiniAppHolder);
                        return (T) new CartManagerImpl(cartSyncService, localCartDataStorage, localCartDataStorage2, cartNavigationService, currentMiniAppHolder, (VersionCartState) this.cartDomainComponentImpl.versionCartStateProvider.get(), new CartChangeCheckerImpl());
                    case 1:
                        return (T) new CartSyncService(this.cartDomainComponentImpl.cartDomainApi(), (LocalCartDataStorage) this.cartDomainComponentImpl.provideLocalCartDataStorageProvider.get(), (LocalCartDataStorage) this.cartDomainComponentImpl.provideLocalFamilyCartDataStorageProvider.get(), this.cartDomainComponentImpl.cartSyncTracking());
                    case 2:
                        return (T) CartDomainModule_Companion_ProvideLocalCartDataStorageFactory.provideLocalCartDataStorage((VersionCartState) this.cartDomainComponentImpl.versionCartStateProvider.get());
                    case 3:
                        return (T) new VersionCartState();
                    case 4:
                        return (T) CartDomainModule_Companion_ProvideLocalFamilyCartDataStorageFactory.provideLocalFamilyCartDataStorage((VersionCartState) this.cartDomainComponentImpl.versionCartStateProvider.get());
                    case 5:
                        g ozonRouter = this.cartDomainComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) new CartNavigationServiceImpl(ozonRouter);
                    case 6:
                        CartManagerImpl cartManagerImpl = (CartManagerImpl) this.cartDomainComponentImpl.cartManagerImplProvider.get();
                        CartPrefetchControllerImpl cartPrefetchControllerImpl = (CartPrefetchControllerImpl) this.cartDomainComponentImpl.cartPrefetchControllerImplProvider.get();
                        CartModeManager cartModeManager = (CartModeManager) this.cartDomainComponentImpl.bindCartModeServiceProvider.get();
                        e miniAppConfigHolder = this.cartDomainComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder);
                        TeensModeService teensModeService = this.cartDomainComponentImpl.storefrontCommonComponentApi.getTeensModeService();
                        j.c(teensModeService);
                        return (T) new CartManagerPrefetch(cartManagerImpl, cartPrefetchControllerImpl, cartModeManager, miniAppConfigHolder, teensModeService, (CartNavigationService) this.cartDomainComponentImpl.cartNavigationServiceImplProvider.get());
                    case 7:
                        FeatureChecker featureChecker = this.cartDomainComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        FeatureService featureService = this.cartDomainComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        ComposerPrefetchService composerPrefetchService = this.cartDomainComponentImpl.composerComponentApi.getComposerPrefetchService();
                        j.c(composerPrefetchService);
                        CartCacheHandler cartCacheHandler = (CartCacheHandler) this.cartDomainComponentImpl.provideCartCacheHandlerProvider.get();
                        CartScreenStateHolder cartScreenStateHolder = (CartScreenStateHolder) this.cartDomainComponentImpl.bindCartScreenStateHolderProvider.get();
                        CurrentMiniAppHolder currentMiniAppHolder2 = this.cartDomainComponentImpl.navigationComponentApi.getCurrentMiniAppHolder();
                        j.c(currentMiniAppHolder2);
                        CartModeManager cartModeManager2 = (CartModeManager) this.cartDomainComponentImpl.bindCartModeServiceProvider.get();
                        CartNavigationService cartNavigationService2 = (CartNavigationService) this.cartDomainComponentImpl.cartNavigationServiceImplProvider.get();
                        CoroutineDispatcherProvider dispatcherProvider = this.cartDomainComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        return (T) new CartPrefetchControllerImpl(featureChecker, featureService, composerPrefetchService, cartCacheHandler, cartScreenStateHolder, currentMiniAppHolder2, cartModeManager2, cartNavigationService2, dispatcherProvider);
                    case 8:
                        Set<ComposerCacheHandler> cacheHandlers = this.cartDomainComponentImpl.cacheHandlerRegistrationComponentApi.getCacheHandlers();
                        j.c(cacheHandlers);
                        return (T) CartPrefetchModule_Companion_ProvideCartCacheHandlerFactory.provideCartCacheHandler(cacheHandlers);
                    case 9:
                        return (T) new CartScreenStateHolderImpl();
                    case 10:
                        JsonSerializer jsonSerializer = this.cartDomainComponentImpl.networkComponentApi.getJsonSerializer();
                        j.c(jsonSerializer);
                        CartModeRepository cartModeRepository = this.cartDomainComponentImpl.cartModeRepository();
                        e miniAppConfigHolder2 = this.cartDomainComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder2);
                        FeatureService featureService2 = this.cartDomainComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        return (T) new CartModeManagerImpl(jsonSerializer, cartModeRepository, miniAppConfigHolder2, featureService2);
                    case 11:
                        return (T) new CartActionDelegate();
                    case 12:
                        return (T) new CartChangeCheckerImpl();
                    case 13:
                        e miniAppConfigHolder3 = this.cartDomainComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder3);
                        return (T) new CartItemsCheckerImpl(miniAppConfigHolder3);
                    case 14:
                        return (T) new AsyncCartViewModelProviderWrapperImpl();
                    default:
                        throw new AssertionError(this.f92260id);
                }
            }
        }

        /* synthetic */ CartDomainComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, CartComponentApi cartComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, ComposerComponentApi composerComponentApi, CacheComponentApi cacheComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ActionComponentApi actionComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, int i11) {
            this(navigationComponentApi, networkComponentApi, analyticsComponentApi, cartComponentApi, cacheHandlerRegistrationComponentApi, composerComponentApi, cacheComponentApi, coroutineDispatchersComponentApi, analyticsScreenStorageComponentApi, actionComponentApi, storefrontCommonComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CartDomainApi cartDomainApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return CartDomainModule_Companion_ProvideCartDomainApiFactory.provideCartDomainApi(retrofit);
        }

        private CartDomainInteractorImpl cartDomainInteractorImpl() {
            return new CartDomainInteractorImpl(this.cartManagerPrefetchProvider.get(), new CartDomainAnalytics(), this.cartActionDelegateProvider.get(), this.versionCartStateProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CartModeRepository cartModeRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CartModeRepository(actionRepository);
        }

        private CartServiceImpl cartServiceImpl() {
            return new CartServiceImpl(this.cartManagerImplProvider.get(), this.cartManagerPrefetchProvider.get(), cartDomainInteractorImpl(), this.cartActionDelegateProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CartSyncTracking cartSyncTracking() {
            l tokenizedAnalytics = this.composerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new CartSyncTracking(tokenizedAnalytics, applicationAnalyticsScreenStorage);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, CartComponentApi cartComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, ComposerComponentApi composerComponentApi, CacheComponentApi cacheComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ActionComponentApi actionComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi) {
            this.versionCartStateProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 3));
            this.provideLocalCartDataStorageProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 2));
            this.provideLocalFamilyCartDataStorageProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 4));
            this.cartSyncServiceProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 1));
            this.cartNavigationServiceImplProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 5));
            this.cartManagerImplProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 0));
            this.provideCartCacheHandlerProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 8));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.cartDomainComponentImpl, 9);
            this.cartScreenStateHolderImplProvider = switchingProvider;
            this.bindCartScreenStateHolderProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.cartDomainComponentImpl, 10);
            this.cartModeManagerImplProvider = switchingProvider2;
            this.bindCartModeServiceProvider = d.b(switchingProvider2);
            this.cartPrefetchControllerImplProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 7));
            this.cartManagerPrefetchProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 6));
            this.cartActionDelegateProvider = d.b(new SwitchingProvider(this.cartDomainComponentImpl, 11));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.cartDomainComponentImpl, 12);
            this.cartChangeCheckerImplProvider = switchingProvider3;
            this.bindCartChangeCheckerProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.cartDomainComponentImpl, 13);
            this.cartItemsCheckerImplProvider = switchingProvider4;
            this.bindCartItemsCheckerProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.cartDomainComponentImpl, 14);
            this.asyncCartViewModelProviderWrapperImplProvider = switchingProvider5;
            this.bindAsyncCartViewModelFactoryProvider = d.b(switchingProvider5);
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
            return this.bindAsyncCartViewModelFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartChangeChecker getCartChangeChecker() {
            return this.bindCartChangeCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartItemsChecker getCartItemsChecker() {
            return this.bindCartItemsCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartModeManager getCartModeService() {
            return this.bindCartModeServiceProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartNavigationService getCartNavigationService() {
            return this.cartNavigationServiceImplProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartPrefetchController getCartPrefetchController() {
            return this.cartPrefetchControllerImplProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartScreenStateHolder getCartScreenStateHolder() {
            return this.bindCartScreenStateHolderProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public CartService getCartService() {
            return cartServiceImpl();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartServiceApi
        public ResolveCartTabNavigationActionUseCase getResolveCartTabNavigationActionUseCase() {
            return new ResolveCartTabNavigationActionUseCase(this.cartNavigationServiceImplProvider.get(), this.bindCartScreenStateHolderProvider.get());
        }

        private CartDomainComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, CartComponentApi cartComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, ComposerComponentApi composerComponentApi, CacheComponentApi cacheComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ActionComponentApi actionComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi) {
            this.cartDomainComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.cacheHandlerRegistrationComponentApi = cacheHandlerRegistrationComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.storefrontCommonComponentApi = storefrontCommonComponentApi;
            initialize(navigationComponentApi, networkComponentApi, analyticsComponentApi, cartComponentApi, cacheHandlerRegistrationComponentApi, composerComponentApi, cacheComponentApi, coroutineDispatchersComponentApi, analyticsScreenStorageComponentApi, actionComponentApi, storefrontCommonComponentApi);
        }
    }

    private static final class Factory implements CartDomainComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.domain.di.CartDomainComponent.Factory
        public CartDomainComponent create(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, CartComponentApi cartComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, ComposerComponentApi composerComponentApi, CacheComponentApi cacheComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ActionComponentApi actionComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi) {
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            analyticsComponentApi.getClass();
            cartComponentApi.getClass();
            cacheHandlerRegistrationComponentApi.getClass();
            composerComponentApi.getClass();
            cacheComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            actionComponentApi.getClass();
            storefrontCommonComponentApi.getClass();
            return new CartDomainComponentImpl(navigationComponentApi, networkComponentApi, analyticsComponentApi, cartComponentApi, cacheHandlerRegistrationComponentApi, composerComponentApi, cacheComponentApi, coroutineDispatchersComponentApi, analyticsScreenStorageComponentApi, actionComponentApi, storefrontCommonComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CartDomainComponent.Factory factory() {
        return new Factory(0);
    }
}
