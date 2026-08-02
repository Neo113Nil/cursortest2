package ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation;

import C.C2702w;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartSummaryItemVO;", "", "", "id", "quantity", "", "selectedDeliverySchema", "<init>", "(JJLjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getQuantity", "Ljava/lang/Integer;", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartSummaryItemVO {
    private final long id;
    private final long quantity;
    private final Integer selectedDeliverySchema;

    public CartSummaryItemVO(long j11, long j12, Integer num) {
        this.id = j11;
        this.quantity = j12;
        this.selectedDeliverySchema = num;
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

    public final long getQuantity() {
        return this.quantity;
    }

    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public int hashCode() {
        int a11 = c.a(Long.hashCode(this.id) * 31, 31, this.quantity);
        Integer num = this.selectedDeliverySchema;
        return a11 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.quantity;
        Integer num = this.selectedDeliverySchema;
        StringBuilder d11 = C2702w.d(j11, "CartSummaryItemVO(id=", ", quantity=");
        d11.append(j12);
        d11.append(", selectedDeliverySchema=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
