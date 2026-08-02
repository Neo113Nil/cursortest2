package ru.ozon.app.android.cart.common.domain.delegate;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.delegate.model.CartNavigationAction;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;
import ru.ozon.app.android.cart.common.utils.link.CartLinkGenerator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "", "cartNavigationService", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartScreenStateHolder", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartNavigationService;Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;)V", "resolve", "Lru/ozon/app/android/cart/common/domain/delegate/model/CartNavigationAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResolveCartTabNavigationActionUseCase {

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final CartScreenStateHolder cartScreenStateHolder;

    public ResolveCartTabNavigationActionUseCase(@NotNull CartNavigationService cartNavigationService, @NotNull CartScreenStateHolder cartScreenStateHolder) {
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(cartScreenStateHolder, "cartScreenStateHolder");
        this.cartNavigationService = cartNavigationService;
        this.cartScreenStateHolder = cartScreenStateHolder;
    }

    @NotNull
    public final CartNavigationAction resolve() {
        String currentTab = this.cartNavigationService.getCurrentTab();
        if (currentTab == null) {
            currentTab = "";
        }
        Uri parse = Uri.parse(currentTab);
        String pendingTab = this.cartNavigationService.getPendingTab();
        if (this.cartScreenStateHolder.isOpen() && !CartDeeplinkValidationRules.INSTANCE.isFamilyCartTab(parse)) {
            if (Intrinsics.d(pendingTab != null ? Uri.parse(pendingTab) : null, parse)) {
                return CartNavigationAction.EmptyAction.INSTANCE;
            }
        }
        CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
        if (cartDeeplinkValidationRules.isMiniApp(pendingTab != null ? Uri.parse(pendingTab) : null)) {
            return CartNavigationAction.EmptyAction.INSTANCE;
        }
        if (cartDeeplinkValidationRules.isFamilyCartTab(parse)) {
            this.cartNavigationService.onNavigateToCartByTab();
            return CartNavigationAction.OpenRootCart.INSTANCE;
        }
        if (pendingTab == null) {
            pendingTab = CartLinkGenerator.cart$default(CartLinkGenerator.INSTANCE, false, 1, null).toString();
            Intrinsics.checkNotNullExpressionValue(pendingTab, "toString(...)");
        }
        return new CartNavigationAction.OpenDeeplink(pendingTab);
    }
}
