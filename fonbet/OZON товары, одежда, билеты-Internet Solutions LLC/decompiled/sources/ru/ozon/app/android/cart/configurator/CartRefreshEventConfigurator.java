package ru.ozon.app.android.cart.configurator;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import BZ.e;
import Sg.a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator;
import ru.ozon.app.android.cart.master.di.MasterWidgetComponent;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartRefreshEventConfigurator;", "Lru/ozon/app/android/cart/configurator/base/BaseCartRefreshEventConfigurator;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "cartChangeChecker", "LBZ/e;", "currentMiniAppHolder", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;LBZ/e;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/CartNavigationService;)V", "", "getCurrentScreenDeeplink", "()Ljava/lang/String;", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateFlow", "()LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "getAddToCartEvent", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "reason", "", "isAddToCartRefreshReason", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)Z", "Lru/ozon/app/android/cart/common/domain/CartService;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartRefreshEventConfigurator extends BaseCartRefreshEventConfigurator {

    @NotNull
    private final CartService cartService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartRefreshEventConfigurator(@NotNull CartService cartService, @NotNull CartEventsController cartEventsController, @NotNull CartChangeChecker cartChangeChecker, @NotNull e currentMiniAppHolder, @NotNull CartModeManager cartModeManager, @NotNull CartNavigationService cartNavigationService) {
        super(cartEventsController, currentMiniAppHolder, cartModeManager, cartChangeChecker, cartNavigationService);
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartChangeChecker, "cartChangeChecker");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        this.cartService = cartService;
    }

    private final String getCurrentScreenDeeplink() {
        a analyticsScreenStorage;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        MasterWidgetComponent masterWidgetComponent = (MasterWidgetComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(MasterWidgetComponent.class));
        if (masterWidgetComponent != null && (analyticsScreenStorage = masterWidgetComponent.getAnalyticsScreenStorage()) != null) {
            analyticsScreenStorage.c();
            Rg.a a11 = analyticsScreenStorage.a();
            if (a11 != null) {
                return a11.c();
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    @NotNull
    protected CartRefreshReason getAddToCartEvent(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return CartTypeKt.isMainCart(cartType) ? new CartRefreshReason.AddToCart(getCurrentScreenDeeplink()) : CartRefreshReason.AddToFamilyCart.INSTANCE;
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    @NotNull
    protected InterfaceC2395h<CartState> getCartStateFlow() {
        return C2399j.E(C7714v.b0(CartService.DefaultImpls.observeCartStateFlow$default(this.cartService, false, 1, null), CartService.DefaultImpls.observeFamilyCartStateFlow$default(this.cartService, false, 1, null)));
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator
    protected boolean isAddToCartRefreshReason(CartRefreshReason reason) {
        return (reason instanceof CartRefreshReason.AddToCart) || (reason instanceof CartRefreshReason.AddToCartFromAnotherTab) || (reason instanceof CartRefreshReason.AddToCartFirstProduct);
    }
}
