package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di;

import Pc.a;
import Vg.d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v1.imageprefetcher.CartSplitV2ImagePrefetchInfoProvider;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
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
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`\u00170\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/di/CartSplitV2ItemWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "LPc/a;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/cart/cartSplitV2/v1/imageprefetcher/CartSplitV2ImagePrefetchInfoProvider;", "getImagePrefetchInfoProvider", "()Lru/ozon/app/android/cart/cartSplitV2/v1/imageprefetcher/CartSplitV2ImagePrefetchInfoProvider;", "imagePrefetchInfoProvider", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "getAddToCartViewModelProvider", "addToCartViewModelProvider", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;", "getAccessoriesViewModelProvider", "accessoriesViewModelProvider", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "getCartThrottleNotificationHandler", "()Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "cartThrottleNotificationHandler", "Factory", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartSplitV2ItemWidgetComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/di/CartSplitV2ItemWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/di/CartSplitV2ItemWidgetComponent;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "retainImagePrefetchComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "cartComponentApi", "Lru/ozon/app/android/cart/common/di/CartComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        CartSplitV2ItemWidgetComponent create(@NotNull FavoriteComponentApi favoriteComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull RetainImagePrefetchComponentApi retainImagePrefetchComposerComponentApi, @NotNull RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull CartComponentApi cartComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi);
    }

    @NotNull
    a<AccessoriesViewModel> getAccessoriesViewModelProvider();

    @NotNull
    a<AddToCartViewModel> getAddToCartViewModelProvider();

    @NotNull
    CartThrottleNotificationHandler getCartThrottleNotificationHandler();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductFavoriteDelegateProvider getFavProductMoleculeDelegateProvider();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    CartSplitV2ImagePrefetchInfoProvider getImagePrefetchInfoProvider();

    @NotNull
    ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage();

    @NotNull
    a<CartSplitV2ViewModel> getViewModelProvider();
}
