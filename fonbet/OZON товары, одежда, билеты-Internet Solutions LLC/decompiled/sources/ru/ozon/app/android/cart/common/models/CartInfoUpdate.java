package ru.ozon.app.android.cart.common.models;

import Kk.C3532b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "", "", "count", "", "hasDiff", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "<init>", "(IZLru/ozon/app/android/cart/common/domain/CartChangeSource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Z", "getHasDiff", "()Z", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "getCartChangeSource", "()Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartInfoUpdate {
    private final CartChangeSource cartChangeSource;
    private final int count;
    private final boolean hasDiff;

    public CartInfoUpdate(int i11, boolean z11, CartChangeSource cartChangeSource) {
        this.count = i11;
        this.hasDiff = z11;
        this.cartChangeSource = cartChangeSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartInfoUpdate)) {
            return false;
        }
        CartInfoUpdate cartInfoUpdate = (CartInfoUpdate) other;
        return this.count == cartInfoUpdate.count && this.hasDiff == cartInfoUpdate.hasDiff && this.cartChangeSource == cartInfoUpdate.cartChangeSource;
    }

    public final CartChangeSource getCartChangeSource() {
        return this.cartChangeSource;
    }

    public final boolean getHasDiff() {
        return this.hasDiff;
    }

    public int hashCode() {
        int a11 = C3532b.a(Integer.hashCode(this.count) * 31, 31, this.hasDiff);
        CartChangeSource cartChangeSource = this.cartChangeSource;
        return a11 + (cartChangeSource == null ? 0 : cartChangeSource.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartInfoUpdate(count=" + this.count + ", hasDiff=" + this.hasDiff + ", cartChangeSource=" + this.cartChangeSource + ")";
    }
}
