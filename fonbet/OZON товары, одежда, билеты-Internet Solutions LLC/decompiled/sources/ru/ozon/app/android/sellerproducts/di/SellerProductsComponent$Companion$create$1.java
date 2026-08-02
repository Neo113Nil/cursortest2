package ru.ozon.app.android.sellerproducts.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductActionSheetProxyBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductBackgroundBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductBadgesBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductButtonBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductButtonSubtitleBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductFavoriteButtonBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductStateRecyclerViewBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.SecondaryProductButtonBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.overlay.ProductOverlayBinderProvider;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductToManyMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000µ\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0018\u0010N\u001a\u00060Jj\u0002`K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"ru/ozon/app/android/sellerproducts/di/SellerProductsComponent$Companion$create$1", "Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "videoCoverComponentApi", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "Lru/ozon/app/android/cart/ui/di/CartAtomBinderComponentApi;", "cartAtomBinderComponentApi", "Lru/ozon/app/android/cart/ui/di/CartAtomBinderComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "mapper", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/overlay/ProductOverlayBinderProvider;", "productOverlayBinder$delegate", "getProductOverlayBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/overlay/ProductOverlayBinderProvider;", "productOverlayBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBadgesBinder;", "getProductBadgesBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBadgesBinder;", "productBadgesBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonSubtitleBinder;", "getProductButtonSubtitleBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonSubtitleBinder;", "productButtonSubtitleBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder;", "getProductBackgroundBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder;", "productBackgroundBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductAdultImageWithVideoCoverBinder;", "getProductAdultImageWithVideoCoverBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductAdultImageWithVideoCoverBinder;", "productAdultImageWithVideoCoverBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonBinder;", "getProductButtonBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonBinder;", "productButtonBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder;", "getProductStateRecyclerViewBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder;", "productStateRecyclerViewBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetProxyBinder;", "getProductActionSheetProxyBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetProxyBinder;", "productActionSheetProxyBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerProductsComponent$Companion$create$1 implements SellerProductsComponent {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final CartAtomBinderComponentApi cartAtomBinderComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteComponentApi favoriteComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final VideoCoverComponentApi videoCoverComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new SellerProductsComponent$Companion$create$1$mapper$2(this));

    /* renamed from: productOverlayBinder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productOverlayBinder = k.b(SellerProductsComponent$Companion$create$1$productOverlayBinder$2.INSTANCE);

    SellerProductsComponent$Companion$create$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.videoCoverComponentApi = (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class);
        this.cartAtomBinderComponentApi = (CartAtomBinderComponentApi) c7475g.getComponent(CartAtomBinderComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductToManyMapper getMapper() {
        return (ProductToManyMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductActionSheetProxyBinder getProductActionSheetProxyBinder() {
        return new ProductActionSheetProxyBinder(new SecondaryButtonMessageProcesser(this.navigationComponentApi.getOzonRouter()), this.actionComponentApi.getActionSheetEventHandler(), new TileActionSheetHandlerFactory(this.favoriteCoreComponentApi.getFavoriteInteractor(), this.favoriteCoreComponentApi.getFavEventManager(), this.favoriteCoreComponentApi.getFavoritesListsInteractor(), this.actionComponentApi.getActionRepository(), this.accountComponentApi.getSubscriptionServiceProvider(), new FavoritesComposerActionHandler(this.actionComponentApi.getActionRepository(), this.favoriteCoreComponentApi.getFavEventManager(), this.favoriteCoreComponentApi.getFavoriteManager(), this.favoriteCoreComponentApi.getWishlistEventManager(), this.networkComponentApi.getFeatureChecker())), new ProductFavoriteButtonBinder(this.favoriteComponentApi.getFavoriteProductDelegate()), new SecondaryProductButtonBinder());
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductAdultImageWithVideoCoverBinder getProductAdultImageWithVideoCoverBinder() {
        return new ProductAdultImageWithVideoCoverBinder(this.accountComponentApi.getAdultHandler(), this.networkComponentApi.getFeatureChecker(), this.videoCoverComponentApi.getVideoTileDelegate());
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductBackgroundBinder getProductBackgroundBinder() {
        return new ProductBackgroundBinder();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductBadgesBinder getProductBadgesBinder() {
        return new ProductBadgesBinder();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductButtonBinder getProductButtonBinder() {
        return new ProductButtonBinder(this.cartAtomBinderComponentApi.getCartAtomBinder());
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductButtonSubtitleBinder getProductButtonSubtitleBinder() {
        return new ProductButtonSubtitleBinder();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductOverlayBinderProvider getProductOverlayBinder() {
        return (ProductOverlayBinderProvider) this.productOverlayBinder.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.di.SellerProductsComponent
    public ProductStateRecyclerViewBinder getProductStateRecyclerViewBinder() {
        return new ProductStateRecyclerViewBinder();
    }
}
