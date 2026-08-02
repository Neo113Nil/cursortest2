package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di;

import GZ.g;
import Jb.j;
import Pc.a;
import Vg.d;
import android.content.Context;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler_Factory;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory_Factory;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductCommonMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductToOneMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.StateMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.TextMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollBadgesBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollBadgesBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollButtonSubtitleBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollOverlayBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollTopRightButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollTopRightButtonBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.SkuScrollMultiFrameDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderFactory_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils_Factory;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

/* loaded from: classes2.dex */
public final class DaggerSkuScrollComponent {

    private static final class Factory implements SkuScrollComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent.Factory
        public SkuScrollComponent create(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainComposerComponentApi retainComposerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
            retainComposerPerformanceComponentApi.getClass();
            cartServiceApi.getClass();
            cartAtomBinderComponentApi.getClass();
            favoriteComponentApi.getClass();
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            accountComponentApi.getClass();
            videoCoverComponentApi.getClass();
            contextComponentDependencies.getClass();
            customActionHandlersComponentApi.getClass();
            cartComponentApi.getClass();
            actionComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            retainComposerComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            videoComponentApi.getClass();
            return new SkuScrollComponentImpl(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, retainComposerComponentApi, analyticsScreenStorageComponentApi, videoComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SkuScrollComponentImpl implements SkuScrollComponent {
        private final AccountComponentApi accountComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<FavoritesComposerActionHandler> favoritesComposerActionHandlerProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<ActionSheetEventHandler> getActionSheetEventHandlerProvider;
        private a<AdultHandler> getAdultHandlerProvider;
        private a<CartAtomBinder> getCartAtomBinderProvider;
        private a<FavoriteEventManager> getFavEventManagerProvider;
        private a<FavoriteInteractor> getFavoriteInteractorProvider;
        private a<FavoriteManager> getFavoriteManagerProvider;
        private a<ProductFavoriteDelegateProvider> getFavoriteProductDelegateProvider;
        private a<FavoritesListsInteractor> getFavoritesListsInteractorProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<g> getOzonRouterProvider;
        private a<SubscriptionService> getSubscriptionServiceProvider;
        private a<WishlistEventManager> getWishlistEventManagerProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<SecondaryButtonMessageProcesser> secondaryButtonMessageProcesserProvider;
        private a<SkuScrollBadgesBinder> skuScrollBadgesBinderProvider;
        private final SkuScrollComponentImpl skuScrollComponentImpl;
        private a<SkuScrollTopRightButtonBinder> skuScrollTopRightButtonBinderProvider;
        private a<TileActionSheetHandlerFactory> tileActionSheetHandlerFactoryProvider;
        private a<TopRightButtonsViewHolderFactory> topRightButtonsViewHolderFactoryProvider;
        private a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtilsProvider;
        private final VideoComponentApi videoComponentApi;
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

        private static final class GetActionSheetEventHandlerProvider implements a<ActionSheetEventHandler> {
            private final ActionComponentApi actionComponentApi;

            GetActionSheetEventHandlerProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionSheetEventHandler get() {
                ActionSheetEventHandler actionSheetEventHandler = this.actionComponentApi.getActionSheetEventHandler();
                j.c(actionSheetEventHandler);
                return actionSheetEventHandler;
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

        private static final class GetFavEventManagerProvider implements a<FavoriteEventManager> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavEventManagerProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoriteEventManager get() {
                FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
                j.c(favEventManager);
                return favEventManager;
            }
        }

        private static final class GetFavoriteInteractorProvider implements a<FavoriteInteractor> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoriteInteractorProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoriteInteractor get() {
                FavoriteInteractor favoriteInteractor = this.favoriteCoreComponentApi.getFavoriteInteractor();
                j.c(favoriteInteractor);
                return favoriteInteractor;
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

        private static final class GetFavoritesListsInteractorProvider implements a<FavoritesListsInteractor> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetFavoritesListsInteractorProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public FavoritesListsInteractor get() {
                FavoritesListsInteractor favoritesListsInteractor = this.favoriteCoreComponentApi.getFavoritesListsInteractor();
                j.c(favoritesListsInteractor);
                return favoritesListsInteractor;
            }
        }

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
            }
        }

        private static final class GetOzonRouterProvider implements a<g> {
            private final NavigationComponentApi navigationComponentApi;

            GetOzonRouterProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public g get() {
                g ozonRouter = this.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                return ozonRouter;
            }
        }

        private static final class GetSubscriptionServiceProviderProvider implements a<SubscriptionService> {
            private final AccountComponentApi accountComponentApi;

            GetSubscriptionServiceProviderProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public SubscriptionService get() {
                SubscriptionService subscriptionServiceProvider = this.accountComponentApi.getSubscriptionServiceProvider();
                j.c(subscriptionServiceProvider);
                return subscriptionServiceProvider;
            }
        }

        private static final class GetWishlistEventManagerProvider implements a<WishlistEventManager> {
            private final FavoriteCoreComponentApi favoriteCoreComponentApi;

            GetWishlistEventManagerProvider(FavoriteCoreComponentApi favoriteCoreComponentApi) {
                this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            }

            @Override // Pc.a
            public WishlistEventManager get() {
                WishlistEventManager wishlistEventManager = this.favoriteCoreComponentApi.getWishlistEventManager();
                j.c(wishlistEventManager);
                return wishlistEventManager;
            }
        }

        /* synthetic */ SkuScrollComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainComposerComponentApi retainComposerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi, int i11) {
            this(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, retainComposerComponentApi, analyticsScreenStorageComponentApi, videoComponentApi);
        }

        private void initialize(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainComposerComponentApi retainComposerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
            this.getCartAtomBinderProvider = new GetCartAtomBinderProvider(cartAtomBinderComponentApi);
            this.getAdultHandlerProvider = new GetAdultHandlerProvider(accountComponentApi);
            GetFeatureCheckerProvider getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getFeatureCheckerProvider = getFeatureCheckerProvider;
            this.skuScrollBadgesBinderProvider = SkuScrollBadgesBinder_Factory.create(this.getAdultHandlerProvider, getFeatureCheckerProvider);
            GetFavoriteProductDelegateProvider getFavoriteProductDelegateProvider = new GetFavoriteProductDelegateProvider(favoriteComponentApi);
            this.getFavoriteProductDelegateProvider = getFavoriteProductDelegateProvider;
            TopRightButtonsViewHolderFactory_Factory create = TopRightButtonsViewHolderFactory_Factory.create(getFavoriteProductDelegateProvider);
            this.topRightButtonsViewHolderFactoryProvider = create;
            this.topRightButtonsViewHolderUtilsProvider = TopRightButtonsViewHolderUtils_Factory.create(create, TopRightButtonsViewHolderBinder_Factory.create());
            this.getFavoriteInteractorProvider = new GetFavoriteInteractorProvider(favoriteCoreComponentApi);
            this.getFavEventManagerProvider = new GetFavEventManagerProvider(favoriteCoreComponentApi);
            this.getFavoritesListsInteractorProvider = new GetFavoritesListsInteractorProvider(favoriteCoreComponentApi);
            this.getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getSubscriptionServiceProvider = new GetSubscriptionServiceProviderProvider(accountComponentApi);
            this.getFavoriteManagerProvider = new GetFavoriteManagerProvider(favoriteCoreComponentApi);
            GetWishlistEventManagerProvider getWishlistEventManagerProvider = new GetWishlistEventManagerProvider(favoriteCoreComponentApi);
            this.getWishlistEventManagerProvider = getWishlistEventManagerProvider;
            FavoritesComposerActionHandler_Factory create2 = FavoritesComposerActionHandler_Factory.create(this.getActionRepositoryProvider, this.getFavEventManagerProvider, this.getFavoriteManagerProvider, getWishlistEventManagerProvider, this.getFeatureCheckerProvider);
            this.favoritesComposerActionHandlerProvider = create2;
            this.tileActionSheetHandlerFactoryProvider = TileActionSheetHandlerFactory_Factory.create(this.getFavoriteInteractorProvider, this.getFavEventManagerProvider, this.getFavoritesListsInteractorProvider, this.getActionRepositoryProvider, this.getSubscriptionServiceProvider, create2);
            GetOzonRouterProvider getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.getOzonRouterProvider = getOzonRouterProvider;
            this.secondaryButtonMessageProcesserProvider = SecondaryButtonMessageProcesser_Factory.create(getOzonRouterProvider);
            GetActionSheetEventHandlerProvider getActionSheetEventHandlerProvider = new GetActionSheetEventHandlerProvider(actionComponentApi);
            this.getActionSheetEventHandlerProvider = getActionSheetEventHandlerProvider;
            this.skuScrollTopRightButtonBinderProvider = SkuScrollTopRightButtonBinder_Factory.create(this.topRightButtonsViewHolderUtilsProvider, this.tileActionSheetHandlerFactoryProvider, this.secondaryButtonMessageProcesserProvider, getActionSheetEventHandlerProvider);
        }

        private ProductCommonMapper productCommonMapper() {
            return new ProductCommonMapper(new FavoriteProductMoleculeV2Mapper());
        }

        private StateMeasurer stateMeasurer() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new StateMeasurer(context);
        }

        private TextMeasurer textMeasurer() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new TextMeasurer(context);
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public AdultHandler getAdultHandler() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return adultHandler;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public AdultListDelegateProvider getAdultListDelegateProvider() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return new AdultListDelegateProvider(adultHandler, featureChecker);
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public a<CartAtomBinder> getCartAtomBinder() {
            return this.getCartAtomBinderProvider;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public SkuScrollMultiFrameDelegateProvider getFrameDelegateProvider() {
            return new SkuScrollMultiFrameDelegateProvider(this.skuScrollBadgesBinderProvider, SkuScrollButtonSubtitleBinder_Factory.create(), SkuScrollOverlayBinder_Factory.create(), SkuScrollStateBinder_Factory.create(), this.skuScrollTopRightButtonBinderProvider, ProductBackgroundBinder_Factory.create());
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public PlayerPreloader getPlayerPreloader() {
            PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
            j.c(playerPreloader);
            return playerPreloader;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public ProductToOneMapper getProductMapper() {
            return new ProductToOneMapper(productCommonMapper(), textMeasurer(), stateMeasurer());
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent
        public VideoTileDelegate getVideoTileDelegate() {
            VideoTileDelegate videoTileDelegate = this.videoCoverComponentApi.getVideoTileDelegate();
            j.c(videoTileDelegate);
            return videoTileDelegate;
        }

        private SkuScrollComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, RetainComposerComponentApi retainComposerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
            this.skuScrollComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.accountComponentApi = accountComponentApi;
            this.videoCoverComponentApi = videoCoverComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.videoComponentApi = videoComponentApi;
            initialize(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, retainComposerComponentApi, analyticsScreenStorageComponentApi, videoComponentApi);
        }
    }

    public static SkuScrollComponent.Factory factory() {
        return new Factory(0);
    }
}
