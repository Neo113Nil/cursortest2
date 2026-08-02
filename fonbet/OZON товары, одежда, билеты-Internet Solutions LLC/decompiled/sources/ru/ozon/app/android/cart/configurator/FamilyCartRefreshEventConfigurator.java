package ru.ozon.app.android.cart.configurator;

import Ae.InterfaceC2395h;
import BZ.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/configurator/FamilyCartRefreshEventConfigurator;", "Lru/ozon/app/android/cart/configurator/base/BaseCartRefreshEventConfigurator;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "cartChangeChecker", "LBZ/e;", "currentMiniAppHolder", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;LBZ/e;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/CartNavigationService;)V", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateFlow", "()LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "getAddToCartEvent", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "reason", "", "isAddToCartRefreshReason", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)Z", "Lru/ozon/app/android/cart/common/domain/CartService;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyCartRefreshEventConfigurator extends BaseCartRefreshEventConfigurator {

    @NotNull
    private final CartService cartService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyCartRefreshEventConfigurator(@NotNull CartService cartService, @NotNull CartEventsController cartEventsController, @NotNull CartChangeChecker cartChangeChecker, @NotNull e currentMiniAppHolder, @NotNull CartModeManager cartModeManager, @NotNull CartNavigationService cartNavigationService) {
        super(cartEventsController, currentMiniAppHolder, cartModeManager, cartChangeChecker, cartNavigationService);
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartChangeChecker, "cartChangeChecker");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        this.cartService = cartService;
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    @NotNull
    protected CartRefreshReason getAddToCartEvent(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return CartRefreshReason.AddToFamilyCart.INSTANCE;
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    @NotNull
    protected InterfaceC2395h<CartState> getCartStateFlow() {
        return CartService.DefaultImpls.observeFamilyCartStateFlow$default(this.cartService, false, 1, null);
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    protected boolean isAddToCartRefreshReason(CartRefreshReason reason) {
        return (reason instanceof CartRefreshReason.AddToFamilyCart) || (reason instanceof CartRefreshReason.AddToCartFromAnotherTab) || (reason instanceof CartRefreshReason.AddToFamilyCartFirstProduct);
    }
}
