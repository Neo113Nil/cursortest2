package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import B0.C2454a;
import Fm.C3051a;
import H3.c;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams;", "", "items", "", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams$CartItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CartItem", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddToCartParams {
    public static final int $stable = 8;

    @NotNull
    private final List<CartItem> items;

    public AddToCartParams(@NotNull List<CartItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddToCartParams copy$default(AddToCartParams addToCartParams, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addToCartParams.items;
        }
        return addToCartParams.copy(list);
    }

    @NotNull
    public final List<CartItem> component1() {
        return this.items;
    }

    @NotNull
    public final AddToCartParams copy(@NotNull List<CartItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AddToCartParams(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddToCartParams) && Intrinsics.d(this.items, ((AddToCartParams) other).items);
    }

    @NotNull
    public final List<CartItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AddToCartParams(items=", ")", this.items);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams$CartItem;", "", "id", "", "quantity", "", "selectedDeliverySchema", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams$CartItem;", "equals", "", "other", "hashCode", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartItem {
        public static final int $stable = 0;

        @NotNull
        private final String id;
        private final int quantity;
        private final Long selectedDeliverySchema;

        public CartItem(@NotNull String id2, int i11, Long l11) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.quantity = i11;
            this.selectedDeliverySchema = l11;
        }

        public static /* synthetic */ CartItem copy$default(CartItem cartItem, String str, int i11, Long l11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = cartItem.id;
            }
            if ((i12 & 2) != 0) {
                i11 = cartItem.quantity;
            }
            if ((i12 & 4) != 0) {
                l11 = cartItem.selectedDeliverySchema;
            }
            return cartItem.copy(str, i11, l11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
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
        public final CartItem copy(@NotNull String id2, int quantity, Long selectedDeliverySchema) {
            Intrinsics.checkNotNullParameter(id2, "id");
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
            return Intrinsics.d(this.id, cartItem.id) && this.quantity == cartItem.quantity && Intrinsics.d(this.selectedDeliverySchema, cartItem.selectedDeliverySchema);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.quantity, this.id.hashCode() * 31, 31);
            Long l11 = this.selectedDeliverySchema;
            return a11 + (l11 == null ? 0 : l11.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i11 = this.quantity;
            return C3051a.d(C3660k.c(i11, "CartItem(id=", str, ", quantity=", ", selectedDeliverySchema="), this.selectedDeliverySchema, ")");
        }

        public /* synthetic */ CartItem(String str, int i11, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? null : l11);
        }
    }
}
