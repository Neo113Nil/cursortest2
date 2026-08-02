package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2;

import A00.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/ProductsInBotV2ButtonCounterUpdate;", "LA00/a$J$a;", "", "itemsQty", "", "skuId", "<init>", "(IJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemsQty", "J", "getSkuId", "()J", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProductsInBotV2ButtonCounterUpdate implements a.J.InterfaceC0007a {
    private final int itemsQty;
    private final long skuId;

    public ProductsInBotV2ButtonCounterUpdate(int i11, long j11) {
        this.itemsQty = i11;
        this.skuId = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsInBotV2ButtonCounterUpdate)) {
            return false;
        }
        ProductsInBotV2ButtonCounterUpdate productsInBotV2ButtonCounterUpdate = (ProductsInBotV2ButtonCounterUpdate) other;
        return this.itemsQty == productsInBotV2ButtonCounterUpdate.itemsQty && this.skuId == productsInBotV2ButtonCounterUpdate.skuId;
    }

    public final int getItemsQty() {
        return this.itemsQty;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Long.hashCode(this.skuId) + (Integer.hashCode(this.itemsQty) * 31);
    }

    @NotNull
    public String toString() {
        return "ProductsInBotV2ButtonCounterUpdate(itemsQty=" + this.itemsQty + ", skuId=" + this.skuId + ")";
    }
}
