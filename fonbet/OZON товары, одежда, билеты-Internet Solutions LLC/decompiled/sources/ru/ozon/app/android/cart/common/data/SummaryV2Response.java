package ru.ozon.app.android.cart.common.data;

import Ak.C2436a;
import com.squareup.moshi.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "", "items", "", "Lru/ozon/app/android/cart/common/data/CartItem;", "itemsFamily", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getItemsFamily", "mainCartItemsMap", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "getMainCartItemsMap", "()Ljava/util/Map;", "familyCartItemsMap", "getFamilyCartItemsMap", "toCartItemsMap", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SummaryV2Response {
    private final List<CartItem> items;
    private final List<CartItem> itemsFamily;

    /* JADX WARN: Multi-variable type inference failed */
    public SummaryV2Response() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SummaryV2Response copy$default(SummaryV2Response summaryV2Response, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = summaryV2Response.items;
        }
        if ((i11 & 2) != 0) {
            list2 = summaryV2Response.itemsFamily;
        }
        return summaryV2Response.copy(list, list2);
    }

    private final Map<Long, CartItemInfo> toCartItemsMap(List<CartItem> list) {
        if (list == null) {
            return U.c();
        }
        List<CartItem> list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (CartItem cartItem : list2) {
            linkedHashMap.put(Long.valueOf(cartItem.getId()), new CartItemInfo(cartItem.getQuantity(), cartItem.getSelectedDeliverySchema(), null, null, null, null, 60, null));
        }
        return linkedHashMap;
    }

    public final List<CartItem> component1() {
        return this.items;
    }

    public final List<CartItem> component2() {
        return this.itemsFamily;
    }

    @NotNull
    public final SummaryV2Response copy(List<CartItem> items, List<CartItem> itemsFamily) {
        return new SummaryV2Response(items, itemsFamily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryV2Response)) {
            return false;
        }
        SummaryV2Response summaryV2Response = (SummaryV2Response) other;
        return Intrinsics.d(this.items, summaryV2Response.items) && Intrinsics.d(this.itemsFamily, summaryV2Response.itemsFamily);
    }

    @NotNull
    public final Map<Long, CartItemInfo> getFamilyCartItemsMap() {
        return toCartItemsMap(this.itemsFamily);
    }

    public final List<CartItem> getItems() {
        return this.items;
    }

    public final List<CartItem> getItemsFamily() {
        return this.itemsFamily;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getMainCartItemsMap() {
        return toCartItemsMap(this.items);
    }

    public int hashCode() {
        List<CartItem> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CartItem> list2 = this.itemsFamily;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C2436a.b("SummaryV2Response(items=", this.items, ", itemsFamily=", ")", this.itemsFamily);
    }

    public SummaryV2Response(List<CartItem> list, List<CartItem> list2) {
        this.items = list;
        this.itemsFamily = list2;
    }

    public /* synthetic */ SummaryV2Response(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
