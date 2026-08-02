package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import cu.C5976a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation.CheckoutStickyTotalMapper;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/di/CheckoutStickyTotalComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/di/CheckoutStickyTotalComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "kotlin.jvm.PlatformType", "cartTotalVisibilityViewModelProvider", "LPc/a;", "getCartTotalVisibilityViewModelProvider", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutStickyTotalComponent$Companion$create$1$1 implements CheckoutStickyTotalComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CheckoutStickyTotalComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<TotalVisibilityViewModel> cartTotalVisibilityViewModelProvider = new C5976a();

    CheckoutStickyTotalComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TotalVisibilityViewModel cartTotalVisibilityViewModelProvider$lambda$0() {
        return new TotalVisibilityViewModel();
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di.CheckoutStickyTotalComponent
    public a<TotalVisibilityViewModel> getCartTotalVisibilityViewModelProvider() {
        return this.cartTotalVisibilityViewModelProvider;
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di.CheckoutStickyTotalComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di.CheckoutStickyTotalComponent
    public CheckoutStickyTotalMapper getMapper() {
        return (CheckoutStickyTotalMapper) this.mapper.getValue();
    }
}
