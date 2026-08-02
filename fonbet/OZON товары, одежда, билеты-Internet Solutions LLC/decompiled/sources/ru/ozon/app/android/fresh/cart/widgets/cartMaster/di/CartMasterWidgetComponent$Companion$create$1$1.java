package ru.ozon.app.android.fresh.cart.widgets.cartMaster.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterViewModel;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/fresh/cart/widgets/cartMaster/di/CartMasterWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/di/CartMasterWidgetComponent;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterViewModel;", "kotlin.jvm.PlatformType", "viewModel", "LPc/a;", "getViewModel", "()LPc/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartMasterWidgetComponent$Companion$create$1$1 implements CartMasterWidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CartMasterWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<CartMasterViewModel> viewModel = new It.a(0);

    CartMasterWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartMasterViewModel viewModel$lambda$0() {
        return new CartMasterViewModel();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetComponent
    public CartService getCartService() {
        return ((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getCartService();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetComponent
    public CartMasterMapper getMapper() {
        return (CartMasterMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetComponent
    public a<CartMasterViewModel> getViewModel() {
        return this.viewModel;
    }
}
