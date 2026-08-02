package ru.ozon.app.android.fresh.cart.widgets.cartMaster.data;

import C.C2702w;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartSummaryItemDTO;", "", "id", "", "quantity", "selectedDeliverySchema", "", "<init>", "(JJLjava/lang/Integer;)V", "getId", "()J", "getQuantity", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(JJLjava/lang/Integer;)Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartSummaryItemDTO;", "equals", "", "other", "hashCode", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartSummaryItemDTO {
    public static final int $stable = 0;
    private final long id;
    private final long quantity;
    private final Integer selectedDeliverySchema;

    public CartSummaryItemDTO(long j11, long j12, Integer num) {
        this.id = j11;
        this.quantity = j12;
        this.selectedDeliverySchema = num;
    }

    public static /* synthetic */ CartSummaryItemDTO copy$default(CartSummaryItemDTO cartSummaryItemDTO, long j11, long j12, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cartSummaryItemDTO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = cartSummaryItemDTO.quantity;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            num = cartSummaryItemDTO.selectedDeliverySchema;
        }
        return cartSummaryItemDTO.copy(j13, j14, num);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    @NotNull
    public final CartSummaryItemDTO copy(long id2, long quantity, Integer selectedDeliverySchema) {
        return new CartSummaryItemDTO(id2, quantity, selectedDeliverySchema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSummaryItemDTO)) {
            return false;
        }
        CartSummaryItemDTO cartSummaryItemDTO = (CartSummaryItemDTO) other;
        return this.id == cartSummaryItemDTO.id && this.quantity == cartSummaryItemDTO.quantity && Intrinsics.d(this.selectedDeliverySchema, cartSummaryItemDTO.selectedDeliverySchema);
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
        StringBuilder d11 = C2702w.d(j11, "CartSummaryItemDTO(id=", ", quantity=");
        d11.append(j12);
        d11.append(", selectedDeliverySchema=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
