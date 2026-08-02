package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api;

import Ql.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsBodyV2;", "", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsBodyV2$Product;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Product", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SelectedProductsBodyV2 {
    public static final int $stable = 8;

    @NotNull
    private final List<Product> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsBodyV2$Product;", "", "sku", "", "qty", "", "<init>", "(JI)V", "getSku", "()J", "getQty", "()I", "setQty", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private int qty;
        private final long sku;

        public Product(long j11, int i11) {
            this.sku = j11;
            this.qty = i11;
        }

        public static /* synthetic */ Product copy$default(Product product, long j11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = product.sku;
            }
            if ((i12 & 2) != 0) {
                i11 = product.qty;
            }
            return product.copy(j11, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final long getSku() {
            return this.sku;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQty() {
            return this.qty;
        }

        @NotNull
        public final Product copy(long sku, int qty) {
            return new Product(sku, qty);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return this.sku == product.sku && this.qty == product.qty;
        }

        public final int getQty() {
            return this.qty;
        }

        public final long getSku() {
            return this.sku;
        }

        public int hashCode() {
            return Integer.hashCode(this.qty) + (Long.hashCode(this.sku) * 31);
        }

        public final void setQty(int i11) {
            this.qty = i11;
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = c.b(this.sku, "Product(sku=", this.qty, ", qty=");
            b11.append(")");
            return b11.toString();
        }
    }

    public SelectedProductsBodyV2(@NotNull List<Product> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectedProductsBodyV2 copy$default(SelectedProductsBodyV2 selectedProductsBodyV2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = selectedProductsBodyV2.items;
        }
        return selectedProductsBodyV2.copy(list);
    }

    @NotNull
    public final List<Product> component1() {
        return this.items;
    }

    @NotNull
    public final SelectedProductsBodyV2 copy(@NotNull List<Product> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SelectedProductsBodyV2(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectedProductsBodyV2) && Intrinsics.d(this.items, ((SelectedProductsBodyV2) other).items);
    }

    @NotNull
    public final List<Product> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("SelectedProductsBodyV2(items=", ")", this.items);
    }
}
