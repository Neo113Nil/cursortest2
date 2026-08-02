package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1;

import A00.a;
import B0.C2454a;
import Bi.b;
import Ql.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/ProductsInBotQuantityUpdate;", "LA00/a$J$a;", "", "skuId", "", "qty", "", "isSelected", "<init>", "(JIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSkuId", "()J", "I", "getQty", "Z", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProductsInBotQuantityUpdate implements a.J.InterfaceC0007a {
    private final boolean isSelected;
    private final int qty;
    private final long skuId;

    public ProductsInBotQuantityUpdate(long j11, int i11, boolean z11) {
        this.skuId = j11;
        this.qty = i11;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsInBotQuantityUpdate)) {
            return false;
        }
        ProductsInBotQuantityUpdate productsInBotQuantityUpdate = (ProductsInBotQuantityUpdate) other;
        return this.skuId == productsInBotQuantityUpdate.skuId && this.qty == productsInBotQuantityUpdate.qty && this.isSelected == productsInBotQuantityUpdate.isSelected;
    }

    public final int getQty() {
        return this.qty;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + C2454a.a(this.qty, Long.hashCode(this.skuId) * 31, 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.skuId;
        int i11 = this.qty;
        return b.f(c.b(j11, "ProductsInBotQuantityUpdate(skuId=", i11, ", qty="), ", isSelected=", this.isSelected, ")");
    }
}
