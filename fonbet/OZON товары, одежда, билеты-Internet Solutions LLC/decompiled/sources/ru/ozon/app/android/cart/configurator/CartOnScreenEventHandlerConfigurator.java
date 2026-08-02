package ru.ozon.app.android.cart.configurator;

import BZ.e;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.configurator.base.BaseCartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.domain.utils.link.CartLinkGenerator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartOnScreenEventHandlerConfigurator;", "Lru/ozon/app/android/cart/configurator/base/BaseCartOnScreenEventHandlerConfigurator;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "LBZ/e;", "miniAppConfigHolder", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/CartNavigationService;LBZ/e;)V", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "event", "", "handleCustomEvent", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "Landroid/net/Uri;", "refreshUri", "Landroid/net/Uri;", "getRefreshUri", "()Landroid/net/Uri;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartOnScreenEventHandlerConfigurator extends BaseCartOnScreenEventHandlerConfigurator {

    @NotNull
    private final Uri refreshUri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartOnScreenEventHandlerConfigurator(@NotNull CartEventsController cartEventsController, @NotNull CartModeManager cartModeManager, @NotNull CartNavigationService cartNavigationService, @NotNull e miniAppConfigHolder) {
        super(cartEventsController, cartModeManager, cartNavigationService, miniAppConfigHolder);
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.refreshUri = CartLinkGenerator.cart$default(CartLinkGenerator.INSTANCE, false, 1, null);
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartOnScreenEventHandlerConfigurator
    @NotNull
    protected Uri getRefreshUri() {
        return this.refreshUri;
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartOnScreenEventHandlerConfigurator
    protected void handleCustomEvent(@NotNull CartRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof CartRefreshReason.AddToCart) {
            handleAddToCart((CartRefreshReason.AddToCart) event);
        } else if ((event instanceof CartRefreshReason.AddToCartFirstProduct) || Intrinsics.d(event, CartRefreshReason.AddToFamilyCartFirstProduct.INSTANCE) || Intrinsics.d(event, CartRefreshReason.AddToFamilyCart.INSTANCE)) {
            BaseCartOnScreenEventHandlerConfigurator.refreshWithSaveScroll$default(this, null, null, null, 7, null);
        }
    }
}
