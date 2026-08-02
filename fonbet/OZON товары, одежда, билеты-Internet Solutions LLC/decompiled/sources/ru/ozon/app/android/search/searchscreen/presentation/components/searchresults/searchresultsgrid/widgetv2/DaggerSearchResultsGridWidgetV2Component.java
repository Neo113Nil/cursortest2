package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2;

import GZ.g;
import Jb.j;
import Pc.a;
import Vg.d;
import android.content.Context;
import l20.c;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor_Factory;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor_Factory;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessorImpl;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder_Factory;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonItemBinder;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonItemBinder_Factory;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonsBinder;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonsBinder_Factory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonViewHolderFactory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonViewHolderFactory_Factory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderBinder_Factory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils_Factory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridImagePrefetchInfoProvider;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate_Factory;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonSingleAtomDelegate;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonSingleAtomDelegate_Factory;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

/* loaded from: classes13.dex */
public final class DaggerSearchResultsGridWidgetV2Component {

    private static final class Factory implements SearchResultsGridWidgetV2Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component.Factory
        public SearchResultsGridWidgetV2Component create(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, ContextComponentDependencies contextComponentDependencies, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, StorageComponentApi storageComponentApi, OnboardingComponentApi onboardingComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            retainComposerPerformanceComponentApi.getClass();
            cartServiceApi.getClass();
            cartAtomBinderComponentApi.getClass();
            favoriteComponentApi.getClass();
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            accountComponentApi.getClass();
            switchingButtonComponentApi.getClass();
            videoCoverComponentApi.getClass();
            searchComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            retainImagePrefetchComponentApi.getClass();
            contextComponentDependencies.getClass();
            actionComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            storageComponentApi.getClass();
            onboardingComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new SearchResultsGridWidgetV2ComponentImpl(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, switchingButtonComponentApi, videoCoverComponentApi, searchComponentApi, favoriteCoreComponentApi, retainImagePrefetchComponentApi, contextComponentDependencies, actionComponentApi, customActionHandlersComponentApi, storageComponentApi, onboardingComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchResultsGridWidgetV2ComponentImpl implements SearchResultsGridWidgetV2Component {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private a<ButtonsBinder> buttonsBinderProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<FavoriteComposerActionExecutor> favoriteComposerActionExecutorProvider;
        private final FavoriteCoreComponentApi favoriteCoreComponentApi;
        private a<FavoritesCustomActionHandlerInteractor> favoritesCustomActionHandlerInteractorProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<AdultHandler> getAdultHandlerProvider;
        private a<CartAtomBinder> getCartAtomBinderProvider;
        private a<FavoriteManager> getFavoriteManagerProvider;
        private a<ProductFavoriteDelegateProvider> getFavoriteProductDelegateProvider;
        private a<FavoritesServiceProvider> getFavoritesServiceProvider;
        private a<SelectedProcessorProvider> getSelectedProcessorProvider;
        private a<SelectedProductsManager> getSelectedProductsManagerProvider;
        private a<SwitchingButtonStateStorage> getSwitchingButtonStorageProvider;
        private a<MultiButtonItemBinder> multiButtonItemBinderProvider;
        private a<MultiButtonsBinder> multiButtonsBinderProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final OnboardingComponentApi onboardingComponentApi;
        private a<RemoveFromFavoritesSwitchingButtonDelegate> removeFromFavoritesSwitchingButtonDelegateProvider;
        private final RetainImagePrefetchComponentApi retainImagePrefetchComponentApi;
        private final SearchComponentApi searchComponentApi;
        private final SearchResultsGridWidgetV2ComponentImpl searchResultsGridWidgetV2ComponentImpl;
        private a<SwitchingButtonAddToFavoriteActionDelegate> switchingButtonAddToFavoriteActionDelegateProvider;
        private a<SwitchingButtonComposerActionWithRedirectDelegate> switchingButtonComposerActionWithRedirectDelegateProvider;
        private a<SwitchingButtonSingleAtomDelegate> switchingButtonSingleAtomDelegateProvider;
        private a<TopRightButtonViewHolderFactory> topRightButtonViewHolderFactoryProvider;
        private a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtilsProvider;
        private final VideoCoverComponentApi videoCoverComponentApi;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        private static final class GetAdultHandlerProvider implements a<AdultHandler> {
            private final AccountComponentApi accountComponentApi;

            GetAdultHandlerProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public AdultHandler get() {
                AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
                j.c(adultHandler);
                return adultHandler;
            }
        }

        private static final class GetCartAtomBinderProvider implements a<CartAtomBinder> {
            private final CartAtomBinderComponentApi cartAtomBinderComponentApi;

            GetCartAtomBinderProvider(CartAtomBinderComponentApi cartAtomBinderComponentApi) {
                this.cartAtomBinderComponentApi = cartAtomBinderComponentApi;
            }

            @Override // Pc.a
            public CartAtomBinder get() {
                CartAtomBinder cartAtomBinder = this.cartAtomBinderComponentApi.getCartAtomBinder();
                j.c(cartAtomBinder);
                return cartAtomBinder;
            }
        }

        private static final class GetFavoriteManagerProvider implements a<FavoriteManager> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoriteManagerProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoriteManager get() {
                FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
                j.c(favoriteManager);
                return favoriteManager;
            }
        }

        private static final class GetFavoriteProductDelegateProvider implements a<ProductFavoriteDelegateProvider> {
            private final FavoriteComponentApi favoriteComponentApi;

            GetFavoriteProductDelegateProvider(FavoriteComponentApi favoriteComponentApi) {
                this.favoriteComponentApi = favoriteComponentApi;
            }

            @Override // Pc.a
            public ProductFavoriteDelegateProvider get() {
                ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
                j.c(favoriteProductDelegate);
                return favoriteProductDelegate;
            }
        }

        private static final class GetFavoritesServiceProviderProvider implements a<FavoritesServiceProvider> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoritesServiceProviderProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoritesServiceProvider get() {
                FavoritesServiceProvider favoritesServiceProvider = this.favoriteCoreComponentApi.getFavoritesServiceProvider();
                j.c(favoritesServiceProvider);
                return favoritesServiceProvider;
            }
        }

        private static final class GetSelectedProcessorProviderProvider implements a<SelectedProcessorProvider> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetSelectedProcessorProviderProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public SelectedProcessorProvider get() {
                SelectedProcessorProvider selectedProcessorProvider = this.favoriteCoreComponentApi.getSelectedProcessorProvider();
                j.c(selectedProcessorProvider);
                return selectedProcessorProvider;
            }
        }

        private static final class GetSelectedProductsManagerProvider implements a<SelectedProductsManager> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetSelectedProductsManagerProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public SelectedProductsManager get() {
                SelectedProductsManager selectedProductsManager = this.favoriteCoreComponentApi.getSelectedProductsManager();
                j.c(selectedProductsManager);
                return selectedProductsManager;
            }
        }

        private static final class GetSwitchingButtonStorageProvider implements a<SwitchingButtonStateStorage> {
            private final SwitchingButtonComponentApi switchingButtonComponentApi;

            GetSwitchingButtonStorageProvider(SwitchingButtonComponentApi switchingButtonComponentApi) {
                this.switchingButtonComponentApi = switchingButtonComponentApi;
            }

            @Override // Pc.a
            public SwitchingButtonStateStorage get() {
                SwitchingButtonStateStorage switchingButtonStorage = this.switchingButtonComponentApi.getSwitchingButtonStorage();
                j.c(switchingButtonStorage);
                return switchingButtonStorage;
            }
        }

        /* synthetic */ SearchResultsGridWidgetV2ComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, ContextComponentDependencies contextComponentDependencies, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, StorageComponentApi storageComponentApi, OnboardingComponentApi onboardingComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, switchingButtonComponentApi, videoCoverComponentApi, searchComponentApi, favoriteCoreComponentApi, retainImagePrefetchComponentApi, contextComponentDependencies, actionComponentApi, customActionHandlersComponentApi, storageComponentApi, onboardingComponentApi, analyticsScreenStorageComponentApi);
        }

        private FavoritesComposerActionHandler favoritesComposerActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            WishlistEventManager wishlistEventManager = this.favoriteCoreComponentApi.getWishlistEventManager();
            j.c(wishlistEventManager);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return new FavoritesComposerActionHandler(actionRepository, favEventManager, favoriteManager, wishlistEventManager, featureChecker);
        }

        private void initialize(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, ContextComponentDependencies contextComponentDependencies, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, StorageComponentApi storageComponentApi, OnboardingComponentApi onboardingComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.getCartAtomBinderProvider = new GetCartAtomBinderProvider(cartAtomBinderComponentApi);
            this.getSwitchingButtonStorageProvider = new GetSwitchingButtonStorageProvider(switchingButtonComponentApi);
            this.getFavoriteManagerProvider = new GetFavoriteManagerProvider(favoriteCoreComponentApi);
            this.getAdultHandlerProvider = new GetAdultHandlerProvider(accountComponentApi);
            GetFavoritesServiceProviderProvider getFavoritesServiceProviderProvider = new GetFavoritesServiceProviderProvider(favoriteCoreComponentApi);
            this.getFavoritesServiceProvider = getFavoritesServiceProviderProvider;
            FavoriteComposerActionExecutor_Factory create = FavoriteComposerActionExecutor_Factory.create(getFavoritesServiceProviderProvider, this.getFavoriteManagerProvider);
            this.favoriteComposerActionExecutorProvider = create;
            FavoritesCustomActionHandlerInteractor_Factory create2 = FavoritesCustomActionHandlerInteractor_Factory.create(create);
            this.favoritesCustomActionHandlerInteractorProvider = create2;
            this.switchingButtonAddToFavoriteActionDelegateProvider = SwitchingButtonAddToFavoriteActionDelegate_Factory.create(this.getAdultHandlerProvider, create2, this.getFavoriteManagerProvider);
            this.removeFromFavoritesSwitchingButtonDelegateProvider = RemoveFromFavoritesSwitchingButtonDelegate_Factory.create(this.favoritesCustomActionHandlerInteractorProvider);
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            SwitchingButtonComposerActionWithRedirectDelegate_Factory create3 = SwitchingButtonComposerActionWithRedirectDelegate_Factory.create(getActionRepositoryProvider, this.getSwitchingButtonStorageProvider);
            this.switchingButtonComposerActionWithRedirectDelegateProvider = create3;
            SwitchingButtonSingleAtomDelegate_Factory create4 = SwitchingButtonSingleAtomDelegate_Factory.create(this.getSwitchingButtonStorageProvider, this.getFavoriteManagerProvider, this.switchingButtonAddToFavoriteActionDelegateProvider, this.removeFromFavoritesSwitchingButtonDelegateProvider, create3);
            this.switchingButtonSingleAtomDelegateProvider = create4;
            MultiButtonItemBinder_Factory create5 = MultiButtonItemBinder_Factory.create(this.getCartAtomBinderProvider, create4);
            this.multiButtonItemBinderProvider = create5;
            MultiButtonsBinder_Factory create6 = MultiButtonsBinder_Factory.create(create5);
            this.multiButtonsBinderProvider = create6;
            this.buttonsBinderProvider = ButtonsBinder_Factory.create(create6);
            this.getFavoriteProductDelegateProvider = new GetFavoriteProductDelegateProvider(favoriteComponentApi);
            this.getSelectedProductsManagerProvider = new GetSelectedProductsManagerProvider(favoriteCoreComponentApi);
            GetSelectedProcessorProviderProvider getSelectedProcessorProviderProvider = new GetSelectedProcessorProviderProvider(favoriteCoreComponentApi);
            this.getSelectedProcessorProvider = getSelectedProcessorProviderProvider;
            TopRightButtonViewHolderFactory_Factory create7 = TopRightButtonViewHolderFactory_Factory.create(this.getFavoriteProductDelegateProvider, this.getSelectedProductsManagerProvider, getSelectedProcessorProviderProvider);
            this.topRightButtonViewHolderFactoryProvider = create7;
            this.topRightButtonsViewHolderUtilsProvider = TopRightButtonsViewHolderUtils_Factory.create(create7, TopRightButtonsViewHolderBinder_Factory.create());
        }

        private MessagesProcessorImpl messagesProcessorImpl() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new MessagesProcessorImpl(ozonRouter);
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public ActionSheetEventHandler getActionSheetEventHandler() {
            ActionSheetEventHandler actionSheetEventHandler = this.actionComponentApi.getActionSheetEventHandler();
            j.c(actionSheetEventHandler);
            return actionSheetEventHandler;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public AdultHandler getAdultHandler() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return adultHandler;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public Context getAppContext() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return context;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public a<ButtonsBinder> getButtonsBinder() {
            return this.buttonsBinderProvider;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public FeatureChecker getFeatureChecker() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return featureChecker;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
            ImagePrefetchInfoProviderStorage<c> imagePrefetchInfoProviderStorage = this.retainImagePrefetchComponentApi.getImagePrefetchInfoProviderStorage();
            j.c(imagePrefetchInfoProviderStorage);
            return imagePrefetchInfoProviderStorage;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public MessagesProcessor getMessagesProcessor() {
            return messagesProcessorImpl();
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public CommonOnboardingRepository getOnboardingRepository() {
            CommonOnboardingRepository onboardingRepository = this.onboardingComponentApi.getOnboardingRepository();
            j.c(onboardingRepository);
            return onboardingRepository;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public PinchToZoomOnboardingDelegate getPinchToZoomOnboardingDelegate() {
            PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate = this.searchComponentApi.getPinchToZoomOnboardingDelegate();
            j.c(pinchToZoomOnboardingDelegate);
            return pinchToZoomOnboardingDelegate;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public SearchResultsGridImagePrefetchInfoProvider getPrefetchInfoProvider() {
            return new SearchResultsGridImagePrefetchInfoProvider();
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public SelectedProductsManager getSelectedProductsManager() {
            SelectedProductsManager selectedProductsManager = this.favoriteCoreComponentApi.getSelectedProductsManager();
            j.c(selectedProductsManager);
            return selectedProductsManager;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public TileActionSheetHandlerFactory getSheetHandlerFactory() {
            FavoriteInteractor favoriteInteractor = this.favoriteCoreComponentApi.getFavoriteInteractor();
            j.c(favoriteInteractor);
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            FavoritesListsInteractor favoritesListsInteractor = this.favoriteCoreComponentApi.getFavoritesListsInteractor();
            j.c(favoritesListsInteractor);
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            SubscriptionService subscriptionServiceProvider = this.accountComponentApi.getSubscriptionServiceProvider();
            j.c(subscriptionServiceProvider);
            return new TileActionSheetHandlerFactory(favoriteInteractor, favEventManager, favoritesListsInteractor, actionRepository, subscriptionServiceProvider, favoritesComposerActionHandler());
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public TextMeasurer getTextMeasurer() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new TextMeasurer(context);
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public a<TopRightButtonsViewHolderUtils> getTopRightButtonsViewHolderUtils() {
            return this.topRightButtonsViewHolderUtilsProvider;
        }

        @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component
        public VideoTileDelegate getVideoTileDelegate() {
            VideoTileDelegate videoTileDelegate = this.videoCoverComponentApi.getVideoTileDelegate();
            j.c(videoTileDelegate);
            return videoTileDelegate;
        }

        private SearchResultsGridWidgetV2ComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, ContextComponentDependencies contextComponentDependencies, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, StorageComponentApi storageComponentApi, OnboardingComponentApi onboardingComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.searchResultsGridWidgetV2ComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.searchComponentApi = searchComponentApi;
            this.videoCoverComponentApi = videoCoverComponentApi;
            this.retainImagePrefetchComponentApi = retainImagePrefetchComponentApi;
            this.onboardingComponentApi = onboardingComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, switchingButtonComponentApi, videoCoverComponentApi, searchComponentApi, favoriteCoreComponentApi, retainImagePrefetchComponentApi, contextComponentDependencies, actionComponentApi, customActionHandlersComponentApi, storageComponentApi, onboardingComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static SearchResultsGridWidgetV2Component.Factory factory() {
        return new Factory(0);
    }
}
