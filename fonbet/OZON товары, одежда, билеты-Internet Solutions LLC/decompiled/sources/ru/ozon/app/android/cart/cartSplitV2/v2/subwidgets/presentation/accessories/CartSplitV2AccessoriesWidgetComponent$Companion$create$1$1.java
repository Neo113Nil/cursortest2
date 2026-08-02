package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import Pc.a;
import Vg.d;
import cV.c;
import gl.C6751a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesActionApi;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\f0\f0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "LPc/a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;", "kotlin.jvm.PlatformType", "accessoriesViewModelProvider", "LPc/a;", "getAccessoriesViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModelProvider", "getAddToCartViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1 implements CartSplitV2AccessoriesWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final a<AccessoriesViewModelV2> accessoriesViewModelProvider;
    private final a<AddToCartViewModel> addToCartViewModelProvider;
    private final NetworkComponentApi networkComponentApi;

    CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        int i11 = 1;
        this.accessoriesViewModelProvider = new C6751a(c7475g, this, i11);
        this.addToCartViewModelProvider = new c(i11, c7475g, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessoriesViewModelV2 accessoriesViewModelProvider$lambda$0(C7475g c7475g, CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1 cartSplitV2AccessoriesWidgetComponent$Companion$create$1$1) {
        CoroutineDispatcherProvider dispatcherProvider = ((CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class)).getDispatcherProvider();
        Object create = cartSplitV2AccessoriesWidgetComponent$Companion$create$1$1.networkComponentApi.getRetrofit().create(AccessoriesActionApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new AccessoriesViewModelV2(dispatcherProvider, (AccessoriesActionApi) create, ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposerController());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartViewModel addToCartViewModelProvider$lambda$1(C7475g c7475g, CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1 cartSplitV2AccessoriesWidgetComponent$Companion$create$1$1) {
        return new AddToCartViewModel(((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService(), cartSplitV2AccessoriesWidgetComponent$Companion$create$1$1.networkComponentApi.getJsonDeserializer(), ((CartComponentApi) c7475g.getComponent(CartComponentApi.class)).getCartEventsController());
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent
    public a<AccessoriesViewModelV2> getAccessoriesViewModelProvider() {
        return this.accessoriesViewModelProvider;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent
    public a<AddToCartViewModel> getAddToCartViewModelProvider() {
        return this.addToCartViewModelProvider;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent
    public FrameBinder getFrameBinder() {
        return ((RetainComposerPerformanceComponentApi) this.$storage.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
    }
}
