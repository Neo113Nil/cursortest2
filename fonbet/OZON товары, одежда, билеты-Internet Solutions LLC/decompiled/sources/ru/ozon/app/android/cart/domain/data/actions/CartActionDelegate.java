package ru.ozon.app.android.cart.domain.data.actions;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartAction;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;", "", "<init>", "()V", "Lru/ozon/app/android/cart/common/models/CartAction;", "action", "", "putEvent", "(Lru/ozon/app/android/cart/common/models/CartAction;)V", "LAe/w0;", "_cartActionSharedFlow", "LAe/w0;", "LAe/B0;", "cartActionSharedFlow", "LAe/B0;", "getCartActionSharedFlow", "()LAe/B0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartActionDelegate {

    @NotNull
    private final w0<CartAction> _cartActionSharedFlow;

    @NotNull
    private final B0<CartAction> cartActionSharedFlow;

    public CartActionDelegate() {
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._cartActionSharedFlow = b11;
        this.cartActionSharedFlow = C2399j.a(b11);
    }

    @NotNull
    public final B0<CartAction> getCartActionSharedFlow() {
        return this.cartActionSharedFlow;
    }

    public final void putEvent(@NotNull CartAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this._cartActionSharedFlow.tryEmit(action);
    }
}
