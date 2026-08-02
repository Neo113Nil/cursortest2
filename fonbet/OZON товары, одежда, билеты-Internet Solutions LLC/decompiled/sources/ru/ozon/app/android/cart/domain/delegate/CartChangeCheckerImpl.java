package ru.ozon.app.android.cart.domain.delegate;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/CartChangeCheckerImpl;", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "cartWasChangedInAnotherMiniApp", "getCartWasChangedInAnotherMiniApp", "()Z", "setCartWasChangedInAnotherMiniApp", "", "cartWasChanged", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartChangeCheckerImpl extends CartChangeChecker {
    private boolean cartWasChangedInAnotherMiniApp;

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker
    public boolean getCartWasChangedInAnotherMiniApp() {
        return this.cartWasChangedInAnotherMiniApp;
    }

    public final void setCartWasChangedInAnotherMiniApp(boolean cartWasChanged) {
        this.cartWasChangedInAnotherMiniApp = cartWasChanged;
    }
}
