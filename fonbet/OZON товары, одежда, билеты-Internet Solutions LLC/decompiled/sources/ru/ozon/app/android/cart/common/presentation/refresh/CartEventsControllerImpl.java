package ru.ozon.app.android.cart.common.presentation.refresh;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsControllerImpl;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "<init>", "()V", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "event", "", "handleEvent", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "setEvent", "LAe/w0;", "_cartEventsSharedFlow", "LAe/w0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "lastEvent", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "getLastEvent", "()Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "LAe/B0;", "cartEventsSharedFlow", "LAe/B0;", "getCartEventsSharedFlow", "()LAe/B0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartEventsControllerImpl implements CartEventsController {

    @NotNull
    private final w0<CartRefreshReason> _cartEventsSharedFlow;

    @NotNull
    private final B0<CartRefreshReason> cartEventsSharedFlow;
    private CartRefreshReason lastEvent;

    public CartEventsControllerImpl() {
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._cartEventsSharedFlow = b11;
        this.cartEventsSharedFlow = C2399j.a(b11);
    }

    @Override // ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController
    @NotNull
    public B0<CartRefreshReason> getCartEventsSharedFlow() {
        return this.cartEventsSharedFlow;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController
    public CartRefreshReason getLastEvent() {
        return this.lastEvent;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController
    public void handleEvent(@NotNull CartRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.lastEvent = event;
        this._cartEventsSharedFlow.tryEmit(event);
    }

    @Override // ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController
    public void setEvent(@NotNull CartRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.lastEvent = event;
    }
}
