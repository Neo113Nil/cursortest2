package ru.ozon.app.android.fresh.cart.widgets.cartControls.di;

import Pc.a;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewModel;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/fresh/cart/widgets/cartControls/di/CartControlsComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/di/CartControlsComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewModel;", "viewModel", "LPc/a;", "getViewModel", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "getMoveCartItemsPayloadHandler", "()Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "moveCartItemsPayloadHandler", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartControlsComponent$Companion$create$1$1 implements CartControlsComponent {
    final /* synthetic */ C7475g $storage;
    private final a<CartControlsViewModel> viewModel;

    CartControlsComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModel = new Ft.a(c7475g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartControlsViewModel viewModel$lambda$0(C7475g c7475g) {
        return new CartControlsViewModel(((StorageComponentApi) c7475g.getComponent(StorageComponentApi.class)).getSharedPreferences());
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent
    public MoveCartItemsPayloadHandler getMoveCartItemsPayloadHandler() {
        return ((FreshNavigationComponentApi) this.$storage.getComponent(FreshNavigationComponentApi.class)).getMoveCartItemsPayloadHandler();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent
    public a<CartControlsViewModel> getViewModel() {
        return this.viewModel;
    }
}
