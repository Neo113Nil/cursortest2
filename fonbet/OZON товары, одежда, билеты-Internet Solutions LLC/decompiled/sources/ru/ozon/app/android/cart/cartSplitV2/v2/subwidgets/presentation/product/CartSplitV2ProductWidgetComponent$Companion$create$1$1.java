package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper.CartSplitV2ProductMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.imageprefetcher.CartSplitV2ProductMediaPrefetchInfoProvider;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ProductMediaSizeCalculator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010 \u001a\f\u0012\b\u0012\u00060\u001cj\u0002`\u001d0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "productMediaSizeCalculator$delegate", "LSc/j;", "getProductMediaSizeCalculator", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "productMediaSizeCalculator", "LPc/a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "groupSwipeCoordinator", "LPc/a;", "getGroupSwipeCoordinator", "()LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "getHandlersInhibitor", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2ProductMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2ProductMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/imageprefetcher/CartSplitV2ProductMediaPrefetchInfoProvider;", "getProductMediaPrefetchInfoProvider", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/imageprefetcher/CartSplitV2ProductMediaPrefetchInfoProvider;", "productMediaPrefetchInfoProvider", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "getSwipeViewModel", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "swipeViewModel", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ProductWidgetComponent$Companion$create$1$1 implements CartSplitV2ProductWidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: productMediaSizeCalculator$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productMediaSizeCalculator = k.b(CartSplitV2ProductWidgetComponent$Companion$create$1$1$productMediaSizeCalculator$2.INSTANCE);
    private final a<GroupSwipeCoordinator> groupSwipeCoordinator = new qn.a();
    private final a<HandlersInhibitor> handlersInhibitor = new KK.a(1);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CartSplitV2ProductWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    CartSplitV2ProductWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSwipeCoordinator groupSwipeCoordinator$lambda$0() {
        return new GroupSwipeCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlersInhibitor handlersInhibitor$lambda$1() {
        return new HandlersInhibitor();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
        return ((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public ProductFavoriteDelegateProvider getFavProductMoleculeDelegateProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public FrameBinder getFrameBinder() {
        return ((RetainComposerPerformanceComponentApi) this.$storage.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
    }

    public a<GroupSwipeCoordinator> getGroupSwipeCoordinator() {
        return this.groupSwipeCoordinator;
    }

    public a<HandlersInhibitor> getHandlersInhibitor() {
        return this.handlersInhibitor;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
        return ((RetainImagePrefetchComponentApi) this.$storage.getComponent(RetainImagePrefetchComponentApi.class)).getImagePrefetchInfoProviderStorage();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public CartSplitV2ProductMapper getMapper() {
        return (CartSplitV2ProductMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public CartSplitV2ProductMediaPrefetchInfoProvider getProductMediaPrefetchInfoProvider() {
        return new CartSplitV2ProductMediaPrefetchInfoProvider(getProductMediaSizeCalculator());
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public ProductMediaSizeCalculator getProductMediaSizeCalculator() {
        return (ProductMediaSizeCalculator) this.productMediaSizeCalculator.getValue();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public SwipeViewModel getSwipeViewModel() {
        HandlersInhibitor handlersInhibitor = getHandlersInhibitor().get();
        Intrinsics.checkNotNullExpressionValue(handlersInhibitor, "get(...)");
        GroupSwipeCoordinator groupSwipeCoordinator = getGroupSwipeCoordinator().get();
        Intrinsics.checkNotNullExpressionValue(groupSwipeCoordinator, "get(...)");
        return new SwipeViewModel(handlersInhibitor, groupSwipeCoordinator);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
