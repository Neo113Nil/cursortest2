package ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation;

import androidx.lifecycle.w0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "checkIfFirstLoadProcessedAndReset", "()Z", "firstLoadProcessed", "Z", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartMasterViewModel extends w0 {
    private boolean firstLoadProcessed;

    public final boolean checkIfFirstLoadProcessedAndReset() {
        boolean z11 = this.firstLoadProcessed;
        this.firstLoadProcessed = true;
        return z11;
    }
}
