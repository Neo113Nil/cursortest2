package ru.ozon.app.android.bank.widgets.productStarsTile.data;

import Sh.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileRequestDTO;", "", "productId", "", "<init>", "(J)V", "getProductId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductStarsTileRequestDTO {
    private final long productId;

    public ProductStarsTileRequestDTO(@i(name = "product_id") long j11) {
        this.productId = j11;
    }

    public static /* synthetic */ ProductStarsTileRequestDTO copy$default(ProductStarsTileRequestDTO productStarsTileRequestDTO, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productStarsTileRequestDTO.productId;
        }
        return productStarsTileRequestDTO.copy(j11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getProductId() {
        return this.productId;
    }

    @NotNull
    public final ProductStarsTileRequestDTO copy(@i(name = "product_id") long productId) {
        return new ProductStarsTileRequestDTO(productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductStarsTileRequestDTO) && this.productId == ((ProductStarsTileRequestDTO) other).productId;
    }

    public final long getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return Long.hashCode(this.productId);
    }

    @NotNull
    public String toString() {
        return b.b(this.productId, "ProductStarsTileRequestDTO(productId=", ")");
    }
}
