package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import l10.InterfaceC7851b;
import l20.c;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesActionApi;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesModule;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesModule_ProvideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cart.cartSplitV2.v1.imageprefetcher.CartSplitV2ImagePrefetchInfoProvider;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes11.dex */
public final class DaggerCartSplitV2ItemWidgetComponent {

    private static final class CartSplitV2ItemWidgetComponentImpl implements CartSplitV2ItemWidgetComponent {
        private final AccessoriesModule accessoriesModule;
        private a<AccessoriesViewModel> accessoriesViewModelProvider;
        private a<AddToCartViewModel> addToCartViewModelProvider;
        private final CartComponentApi cartComponentApi;
        private final CartServiceApi cartServiceApi;
        private a<CartSplitV2ImagePrefetchInfoProvider> cartSplitV2ImagePrefetchInfoProvider;
        private final CartSplitV2ItemWidgetComponentImpl cartSplitV2ItemWidgetComponentImpl;
        private a<CartSplitV2ViewModel> cartSplitV2ViewModelProvider;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final FavoriteComponentApi favoriteComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<AccessoriesActionApi> provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsReleaseProvider;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;
        private final RetainImagePrefetchComponentApi retainImagePrefetchComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CartSplitV2ItemWidgetComponentImpl cartSplitV2ItemWidgetComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92234id;

            SwitchingProvider(CartSplitV2ItemWidgetComponentImpl cartSplitV2ItemWidgetComponentImpl, int i11) {
                this.cartSplitV2ItemWidgetComponentImpl = cartSplitV2ItemWidgetComponentImpl;
                this.f92234id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92234id;
                if (i11 == 0) {
                    return (T) new CartSplitV2ViewModel();
                }
                if (i11 == 1) {
                    return (T) new CartSplitV2ImagePrefetchInfoProvider();
                }
                if (i11 == 2) {
                    CartService cartService = this.cartSplitV2ItemWidgetComponentImpl.cartServiceApi.getCartService();
                    j.c(cartService);
                    JsonParser jsonDeserializer = this.cartSplitV2ItemWidgetComponentImpl.networkComponentApi.getJsonDeserializer();
                    j.c(jsonDeserializer);
                    CartEventsController cartEventsController = this.cartSplitV2ItemWidgetComponentImpl.cartComponentApi.getCartEventsController();
                    j.c(cartEventsController);
                    return (T) new AddToCartViewModel(cartService, jsonDeserializer, cartEventsController);
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new AssertionError(this.f92234id);
                    }
                    AccessoriesModule accessoriesModule = this.cartSplitV2ItemWidgetComponentImpl.accessoriesModule;
                    Retrofit retrofit = this.cartSplitV2ItemWidgetComponentImpl.networkComponentApi.getRetrofit();
                    j.c(retrofit);
                    return (T) AccessoriesModule_ProvideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsReleaseFactory.provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsRelease(accessoriesModule, retrofit);
                }
                CoroutineDispatcherProvider dispatcherProvider = this.cartSplitV2ItemWidgetComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                AccessoriesActionApi accessoriesActionApi = (AccessoriesActionApi) this.cartSplitV2ItemWidgetComponentImpl.provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsReleaseProvider.get();
                InterfaceC7851b composerController = this.cartSplitV2ItemWidgetComponentImpl.retainComposerComponentApi.getComposerController();
                j.c(composerController);
                return (T) new AccessoriesViewModel(dispatcherProvider, accessoriesActionApi, composerController);
            }
        }

        /* synthetic */ CartSplitV2ItemWidgetComponentImpl(AccessoriesModule accessoriesModule, FavoriteComponentApi favoriteComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NetworkComponentApi networkComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CartComponentApi cartComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(accessoriesModule, favoriteComponentApi, customActionHandlersComponentApi, networkComponentApi, retainImagePrefetchComponentApi, retainComposerPerformanceComponentApi, androidPlatformComponentApi, cartComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi);
        }

        private void initialize(AccessoriesModule accessoriesModule, FavoriteComponentApi favoriteComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NetworkComponentApi networkComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CartComponentApi cartComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.cartSplitV2ViewModelProvider = new SwitchingProvider(this.cartSplitV2ItemWidgetComponentImpl, 0);
            this.cartSplitV2ImagePrefetchInfoProvider = d.b(new SwitchingProvider(this.cartSplitV2ItemWidgetComponentImpl, 1));
            this.addToCartViewModelProvider = new SwitchingProvider(this.cartSplitV2ItemWidgetComponentImpl, 2);
            this.provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsReleaseProvider = m.a(new SwitchingProvider(this.cartSplitV2ItemWidgetComponentImpl, 4));
            this.accessoriesViewModelProvider = new SwitchingProvider(this.cartSplitV2ItemWidgetComponentImpl, 3);
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public a<AccessoriesViewModel> getAccessoriesViewModelProvider() {
            return this.accessoriesViewModelProvider;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public a<AddToCartViewModel> getAddToCartViewModelProvider() {
            return this.addToCartViewModelProvider;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public CartThrottleNotificationHandler getCartThrottleNotificationHandler() {
            CartThrottleNotificationHandler cartThrottleNotificationHandler = this.cartComponentApi.getCartThrottleNotificationHandler();
            j.c(cartThrottleNotificationHandler);
            return cartThrottleNotificationHandler;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public ProductFavoriteDelegateProvider getFavProductMoleculeDelegateProvider() {
            ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
            j.c(favoriteProductDelegate);
            return favoriteProductDelegate;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public FrameBinder getFrameBinder() {
            FrameBinder frameBinder = this.retainComposerPerformanceComponentApi.getFrameBinder();
            j.c(frameBinder);
            return frameBinder;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public CartSplitV2ImagePrefetchInfoProvider getImagePrefetchInfoProvider() {
            return this.cartSplitV2ImagePrefetchInfoProvider.get();
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
            ImagePrefetchInfoProviderStorage<c> imagePrefetchInfoProviderStorage = this.retainImagePrefetchComponentApi.getImagePrefetchInfoProviderStorage();
            j.c(imagePrefetchInfoProviderStorage);
            return imagePrefetchInfoProviderStorage;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent
        public a<CartSplitV2ViewModel> getViewModelProvider() {
            return this.cartSplitV2ViewModelProvider;
        }

        private CartSplitV2ItemWidgetComponentImpl(AccessoriesModule accessoriesModule, FavoriteComponentApi favoriteComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NetworkComponentApi networkComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CartComponentApi cartComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            this.cartSplitV2ItemWidgetComponentImpl = this;
            this.favoriteComponentApi = favoriteComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.retainComposerPerformanceComponentApi = retainComposerPerformanceComponentApi;
            this.retainImagePrefetchComponentApi = retainImagePrefetchComponentApi;
            this.cartServiceApi = cartServiceApi;
            this.networkComponentApi = networkComponentApi;
            this.cartComponentApi = cartComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.accessoriesModule = accessoriesModule;
            this.retainComposerComponentApi = retainComposerComponentApi;
            initialize(accessoriesModule, favoriteComponentApi, customActionHandlersComponentApi, networkComponentApi, retainImagePrefetchComponentApi, retainComposerPerformanceComponentApi, androidPlatformComponentApi, cartComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi);
        }
    }

    private static final class Factory implements CartSplitV2ItemWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent.Factory
        public CartSplitV2ItemWidgetComponent create(FavoriteComponentApi favoriteComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NetworkComponentApi networkComponentApi, RetainImagePrefetchComponentApi retainImagePrefetchComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CartComponentApi cartComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
            favoriteComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            networkComponentApi.getClass();
            retainImagePrefetchComponentApi.getClass();
            retainComposerPerformanceComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            cartComponentApi.getClass();
            cartServiceApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            retainComposerComponentApi.getClass();
            return new CartSplitV2ItemWidgetComponentImpl(new AccessoriesModule(), favoriteComponentApi, customActionHandlersComponentApi, networkComponentApi, retainImagePrefetchComponentApi, retainComposerPerformanceComponentApi, androidPlatformComponentApi, cartComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CartSplitV2ItemWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
