package ru.ozon.app.android.cart.master.presentation;

import B0.C2454a;
import Ql.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", "", "", "id", "", "quantity", "selectedDeliverySchema", "<init>", "(JILjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSummaryItemVO {
    private final long id;
    private final int quantity;
    private final Long selectedDeliverySchema;

    public CartSummaryItemVO(long j11, int i11, Long l11) {
        this.id = j11;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSummaryItemVO)) {
            return false;
        }
        CartSummaryItemVO cartSummaryItemVO = (CartSummaryItemVO) other;
        return this.id == cartSummaryItemVO.id && this.quantity == cartSummaryItemVO.quantity && Intrinsics.d(this.selectedDeliverySchema, cartSummaryItemVO.selectedDeliverySchema);
    }

    public final long getId() {
        return this.id;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.quantity, Long.hashCode(this.id) * 31, 31);
        Long l11 = this.selectedDeliverySchema;
        return a11 + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.quantity;
        Long l11 = this.selectedDeliverySchema;
        StringBuilder b11 = c.b(j11, "CartSummaryItemVO(id=", i11, ", quantity=");
        b11.append(", selectedDeliverySchema=");
        b11.append(l11);
        b11.append(")");
        return b11.toString();
    }
}
