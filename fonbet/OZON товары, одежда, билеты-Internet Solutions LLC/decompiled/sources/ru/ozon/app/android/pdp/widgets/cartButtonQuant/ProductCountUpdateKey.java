package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import A00.a;
import B0.C2454a;
import Ql.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/ProductCountUpdateKey;", "LA00/a$J$a;", "", "productId", "", "quantity", "selectedDeliverySchema", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "cartMode", "<init>", "(JILjava/lang/Long;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getProductId", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "getCartMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProductCountUpdateKey implements a.J.InterfaceC0007a {
    private final DoubleCartQuantVO.CartMode cartMode;
    private final long productId;
    private final int quantity;
    private final Long selectedDeliverySchema;

    public ProductCountUpdateKey(long j11, int i11, Long l11, DoubleCartQuantVO.CartMode cartMode) {
        this.productId = j11;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.cartMode = cartMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCountUpdateKey)) {
            return false;
        }
        ProductCountUpdateKey productCountUpdateKey = (ProductCountUpdateKey) other;
        return this.productId == productCountUpdateKey.productId && this.quantity == productCountUpdateKey.quantity && Intrinsics.d(this.selectedDeliverySchema, productCountUpdateKey.selectedDeliverySchema) && this.cartMode == productCountUpdateKey.cartMode;
    }

    public final DoubleCartQuantVO.CartMode getCartMode() {
        return this.cartMode;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.quantity, Long.hashCode(this.productId) * 31, 31);
        Long l11 = this.selectedDeliverySchema;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        DoubleCartQuantVO.CartMode cartMode = this.cartMode;
        return hashCode + (cartMode != null ? cartMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.productId;
        int i11 = this.quantity;
        Long l11 = this.selectedDeliverySchema;
        DoubleCartQuantVO.CartMode cartMode = this.cartMode;
        StringBuilder b11 = c.b(j11, "ProductCountUpdateKey(productId=", i11, ", quantity=");
        b11.append(", selectedDeliverySchema=");
        b11.append(l11);
        b11.append(", cartMode=");
        b11.append(cartMode);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ ProductCountUpdateKey(long j11, int i11, Long l11, DoubleCartQuantVO.CartMode cartMode, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, (i12 & 4) != 0 ? null : l11, (i12 & 8) != 0 ? null : cartMode);
    }
}
