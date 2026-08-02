package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import EV.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper.CartSplitV2ProductMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.imageprefetcher.CartSplitV2ProductMediaPrefetchInfoProvider;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ProductMediaSizeCalculator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0001/R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/imageprefetcher/CartSplitV2ProductMediaPrefetchInfoProvider;", "getProductMediaPrefetchInfoProvider", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/imageprefetcher/CartSplitV2ProductMediaPrefetchInfoProvider;", "productMediaPrefetchInfoProvider", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "getProductMediaSizeCalculator", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "productMediaSizeCalculator", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "getSwipeViewModel", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "swipeViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2ProductMapper;", "getMapper", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2ProductMapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartSplitV2ProductWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartSplitV2ProductWidgetComponent create$lambda$0(C7475g c7475g) {
            return new CartSplitV2ProductWidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<CartSplitV2ProductWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CartSplitV2ProductWidgetComponent.class), new a(storage, 15));
        }
    }

    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductFavoriteDelegateProvider getFavProductMoleculeDelegateProvider();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage();

    @NotNull
    CartSplitV2ProductMapper getMapper();

    @NotNull
    CartSplitV2ProductMediaPrefetchInfoProvider getProductMediaPrefetchInfoProvider();

    @NotNull
    ProductMediaSizeCalculator getProductMediaSizeCalculator();

    @NotNull
    SwipeViewModel getSwipeViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
