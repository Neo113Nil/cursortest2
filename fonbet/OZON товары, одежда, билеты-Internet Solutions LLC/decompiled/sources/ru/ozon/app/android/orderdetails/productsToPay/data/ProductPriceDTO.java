package ru.ozon.app.android.orderdetails.productsToPay.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductPriceDTO {
    public static final int $stable = PriceDTO.$stable;
    private final BadgeDTO badge;

    @NotNull
    private final PriceDTO price;

    public ProductPriceDTO(@NotNull PriceDTO price, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ ProductPriceDTO copy$default(ProductPriceDTO productPriceDTO, PriceDTO priceDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = productPriceDTO.price;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = productPriceDTO.badge;
        }
        return productPriceDTO.copy(priceDTO, badgeDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final ProductPriceDTO copy(@NotNull PriceDTO price, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(price, "price");
        return new ProductPriceDTO(price, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPriceDTO)) {
            return false;
        }
        ProductPriceDTO productPriceDTO = (ProductPriceDTO) other;
        return Intrinsics.d(this.price, productPriceDTO.price) && Intrinsics.d(this.badge, productPriceDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductPriceDTO(price=" + this.price + ", badge=" + this.badge + ")";
    }
}
