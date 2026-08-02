package ru.ozon.app.android.cart.common.data;

import B0.C2454a;
import Ql.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/common/data/CartItem;", "", "id", "", "quantity", "", "selectedDeliverySchema", "<init>", "(JILjava/lang/Long;)V", "getId", "()J", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JILjava/lang/Long;)Lru/ozon/app/android/cart/common/data/CartItem;", "equals", "", "other", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartItem {
    private final long id;
    private final int quantity;
    private final Long selectedDeliverySchema;

    public CartItem(long j11, int i11, Long l11) {
        this.id = j11;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
    }

    public static /* synthetic */ CartItem copy$default(CartItem cartItem, long j11, int i11, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cartItem.id;
        }
        if ((i12 & 2) != 0) {
            i11 = cartItem.quantity;
        }
        if ((i12 & 4) != 0) {
            l11 = cartItem.selectedDeliverySchema;
        }
        return cartItem.copy(j11, i11, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    @NotNull
    public final CartItem copy(long id2, int quantity, Long selectedDeliverySchema) {
        return new CartItem(id2, quantity, selectedDeliverySchema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) other;
        return this.id == cartItem.id && this.quantity == cartItem.quantity && Intrinsics.d(this.selectedDeliverySchema, cartItem.selectedDeliverySchema);
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
        StringBuilder b11 = c.b(j11, "CartItem(id=", i11, ", quantity=");
        b11.append(", selectedDeliverySchema=");
        b11.append(l11);
        b11.append(")");
        return b11.toString();
    }
}
