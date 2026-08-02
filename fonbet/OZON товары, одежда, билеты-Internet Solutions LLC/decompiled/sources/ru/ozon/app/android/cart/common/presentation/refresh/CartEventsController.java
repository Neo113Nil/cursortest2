package ru.ozon.app.android.cart.common.presentation.refresh;

import Ae.B0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "event", "", "handleEvent", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "setEvent", "LAe/B0;", "getCartEventsSharedFlow", "()LAe/B0;", "cartEventsSharedFlow", "getLastEvent", "()Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "lastEvent", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartEventsController {
    @NotNull
    B0<CartRefreshReason> getCartEventsSharedFlow();

    CartRefreshReason getLastEvent();

    void handleEvent(@NotNull CartRefreshReason event);

    void setEvent(@NotNull CartRefreshReason event);
}
