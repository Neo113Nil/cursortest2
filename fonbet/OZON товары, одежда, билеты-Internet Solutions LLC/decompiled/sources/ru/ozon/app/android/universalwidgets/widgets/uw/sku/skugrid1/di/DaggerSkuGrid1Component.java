package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di;

import GZ.g;
import Jb.j;
import Pc.a;
import Vg.d;
import android.content.Context;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
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
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductActionSheetProxyBinderFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductActionSheetProxyBinderFactory_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBottomBadgesBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBottomBadgesBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonSubtitleBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonSubtitleBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductStateRecyclerViewBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductStateRecyclerViewBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductTopRightButtonsBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductTopRightButtonsBinder_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.overlay.ProductOverlayBinderProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductCommonMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductToManyMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.TextMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser_Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component;
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
public final class DaggerSkuGrid1Component {

    private static final class Factory implements SkuGrid1Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component.Factory
        public SkuGrid1Component create(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
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
            analyticsScreenStorageComponentApi.getClass();
            videoComponentApi.getClass();
            return new SkuGrid1ComponentImpl(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, analyticsScreenStorageComponentApi, videoComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SkuGrid1ComponentImpl implements SkuGrid1Component {
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
        private a<PlayerPreloader> getPlayerPreloaderProvider;
        private a<SubscriptionService> getSubscriptionServiceProvider;
        private a<VideoTileDelegate> getVideoTileDelegateProvider;
        private a<WishlistEventManager> getWishlistEventManagerProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<ProductActionSheetProxyBinderFactory> productActionSheetProxyBinderFactoryProvider;
        private a<ProductAdultImageWithVideoCoverBinder> productAdultImageWithVideoCoverBinderProvider;
        private a<ProductButtonBinder> productButtonBinderProvider;
        private a<ProductStateRecyclerViewBinder> productStateRecyclerViewBinderProvider;
        private a<ProductTopRightButtonsBinder> productTopRightButtonsBinderProvider;
        private a<SecondaryButtonMessageProcesser> secondaryButtonMessageProcesserProvider;
        private final SkuGrid1ComponentImpl skuGrid1ComponentImpl;
        private a<TileActionSheetHandlerFactory> tileActionSheetHandlerFactoryProvider;
        private a<TopRightButtonsViewHolderFactory> topRightButtonsViewHolderFactoryProvider;
        private a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtilsProvider;
        private final VideoComponentApi videoComponentApi;

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

        private static final class GetPlayerPreloaderProvider implements a<PlayerPreloader> {
            private final VideoComponentApi videoComponentApi;

            GetPlayerPreloaderProvider(VideoComponentApi videoComponentApi) {
                this.videoComponentApi = videoComponentApi;
            }

            @Override // Pc.a
            public PlayerPreloader get() {
                PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
                j.c(playerPreloader);
                return playerPreloader;
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

        private static final class GetVideoTileDelegateProvider implements a<VideoTileDelegate> {
            private final VideoCoverComponentApi videoCoverComponentApi;

            GetVideoTileDelegateProvider(VideoCoverComponentApi videoCoverComponentApi) {
                this.videoCoverComponentApi = videoCoverComponentApi;
            }

            @Override // Pc.a
            public VideoTileDelegate get() {
                VideoTileDelegate videoTileDelegate = this.videoCoverComponentApi.getVideoTileDelegate();
                j.c(videoTileDelegate);
                return videoTileDelegate;
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

        /* synthetic */ SkuGrid1ComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi, int i11) {
            this(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, analyticsScreenStorageComponentApi, videoComponentApi);
        }

        private void initialize(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
            this.getAdultHandlerProvider = new GetAdultHandlerProvider(accountComponentApi);
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getVideoTileDelegateProvider = new GetVideoTileDelegateProvider(videoCoverComponentApi);
            GetPlayerPreloaderProvider getPlayerPreloaderProvider = new GetPlayerPreloaderProvider(videoComponentApi);
            this.getPlayerPreloaderProvider = getPlayerPreloaderProvider;
            this.productAdultImageWithVideoCoverBinderProvider = ProductAdultImageWithVideoCoverBinder_Factory.create(this.getAdultHandlerProvider, this.getFeatureCheckerProvider, this.getVideoTileDelegateProvider, getPlayerPreloaderProvider);
            this.productStateRecyclerViewBinderProvider = ProductStateRecyclerViewBinder_Factory.create(this.getFeatureCheckerProvider);
            GetCartAtomBinderProvider getCartAtomBinderProvider = new GetCartAtomBinderProvider(cartAtomBinderComponentApi);
            this.getCartAtomBinderProvider = getCartAtomBinderProvider;
            this.productButtonBinderProvider = ProductButtonBinder_Factory.create(getCartAtomBinderProvider);
            GetOzonRouterProvider getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.getOzonRouterProvider = getOzonRouterProvider;
            this.secondaryButtonMessageProcesserProvider = SecondaryButtonMessageProcesser_Factory.create(getOzonRouterProvider);
            this.getActionSheetEventHandlerProvider = new GetActionSheetEventHandlerProvider(actionComponentApi);
            this.getFavoriteInteractorProvider = new GetFavoriteInteractorProvider(favoriteCoreComponentApi);
            this.getFavEventManagerProvider = new GetFavEventManagerProvider(favoriteCoreComponentApi);
            this.getFavoritesListsInteractorProvider = new GetFavoritesListsInteractorProvider(favoriteCoreComponentApi);
            this.getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getSubscriptionServiceProvider = new GetSubscriptionServiceProviderProvider(accountComponentApi);
            this.getFavoriteManagerProvider = new GetFavoriteManagerProvider(favoriteCoreComponentApi);
            GetWishlistEventManagerProvider getWishlistEventManagerProvider = new GetWishlistEventManagerProvider(favoriteCoreComponentApi);
            this.getWishlistEventManagerProvider = getWishlistEventManagerProvider;
            FavoritesComposerActionHandler_Factory create = FavoritesComposerActionHandler_Factory.create(this.getActionRepositoryProvider, this.getFavEventManagerProvider, this.getFavoriteManagerProvider, getWishlistEventManagerProvider, this.getFeatureCheckerProvider);
            this.favoritesComposerActionHandlerProvider = create;
            this.tileActionSheetHandlerFactoryProvider = TileActionSheetHandlerFactory_Factory.create(this.getFavoriteInteractorProvider, this.getFavEventManagerProvider, this.getFavoritesListsInteractorProvider, this.getActionRepositoryProvider, this.getSubscriptionServiceProvider, create);
            GetFavoriteProductDelegateProvider getFavoriteProductDelegateProvider = new GetFavoriteProductDelegateProvider(favoriteComponentApi);
            this.getFavoriteProductDelegateProvider = getFavoriteProductDelegateProvider;
            TopRightButtonsViewHolderFactory_Factory create2 = TopRightButtonsViewHolderFactory_Factory.create(getFavoriteProductDelegateProvider);
            this.topRightButtonsViewHolderFactoryProvider = create2;
            TopRightButtonsViewHolderUtils_Factory create3 = TopRightButtonsViewHolderUtils_Factory.create(create2, TopRightButtonsViewHolderBinder_Factory.create());
            this.topRightButtonsViewHolderUtilsProvider = create3;
            ProductTopRightButtonsBinder_Factory create4 = ProductTopRightButtonsBinder_Factory.create(create3);
            this.productTopRightButtonsBinderProvider = create4;
            this.productActionSheetProxyBinderFactoryProvider = ProductActionSheetProxyBinderFactory_Factory.create(this.secondaryButtonMessageProcesserProvider, this.getActionSheetEventHandlerProvider, this.tileActionSheetHandlerFactoryProvider, create4);
        }

        private ProductCommonMapper productCommonMapper() {
            return new ProductCommonMapper(new FavoriteProductMoleculeV2Mapper());
        }

        private TextMeasurer textMeasurer() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new TextMeasurer(context);
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public Context getContext() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return context;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public ProductToManyMapper getMapper() {
            return new ProductToManyMapper(productCommonMapper(), textMeasurer());
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductActionSheetProxyBinderFactory> getPProductActionSheetProxyBinderFactory() {
            return this.productActionSheetProxyBinderFactoryProvider;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductBackgroundBinder> getPProductBackgroundBinder() {
            return ProductBackgroundBinder_Factory.create();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductBottomBadgesBinder> getPProductBadgesBinder() {
            return ProductBottomBadgesBinder_Factory.create();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductButtonBinder> getPProductButtonBinder() {
            return this.productButtonBinderProvider;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductButtonSubtitleBinder> getPProductButtonSubtitleBinder() {
            return ProductButtonSubtitleBinder_Factory.create();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductAdultImageWithVideoCoverBinder> getPProductImagesBinder() {
            return this.productAdultImageWithVideoCoverBinderProvider;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public ProductOverlayBinderProvider getPProductOverlayBinderProvider() {
            return new ProductOverlayBinderProvider();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component
        public a<ProductStateRecyclerViewBinder> getPProductStateBinder() {
            return this.productStateRecyclerViewBinderProvider;
        }

        private SkuGrid1ComponentImpl(RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, FavoriteComponentApi favoriteComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, VideoCoverComponentApi videoCoverComponentApi, ContextComponentDependencies contextComponentDependencies, CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, VideoComponentApi videoComponentApi) {
            this.skuGrid1ComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(retainComposerPerformanceComponentApi, cartServiceApi, cartAtomBinderComponentApi, favoriteComponentApi, composerComponentApi, networkComponentApi, navigationComponentApi, accountComponentApi, videoCoverComponentApi, contextComponentDependencies, customActionHandlersComponentApi, cartComponentApi, actionComponentApi, favoriteCoreComponentApi, analyticsScreenStorageComponentApi, videoComponentApi);
        }
    }

    public static SkuGrid1Component.Factory factory() {
        return new Factory(0);
    }
}
