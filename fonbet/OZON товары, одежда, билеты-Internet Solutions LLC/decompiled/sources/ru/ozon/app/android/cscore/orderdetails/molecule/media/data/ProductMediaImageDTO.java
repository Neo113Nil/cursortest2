package ru.ozon.app.android.cscore.orderdetails.molecule.media.data;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "badgeCounter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isDisabled", "", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;)V", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getBadgeCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "equals", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductMediaImageDTO {
    public static final int $stable = ProductMediaDTO.$stable;
    private final BadgeDTO badgeCounter;
    private final Boolean isDisabled;

    @NotNull
    private final ProductMediaDTO productMedia;

    public ProductMediaImageDTO(@NotNull ProductMediaDTO productMedia, BadgeDTO badgeDTO, Boolean bool) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        this.productMedia = productMedia;
        this.badgeCounter = badgeDTO;
        this.isDisabled = bool;
    }

    public static /* synthetic */ ProductMediaImageDTO copy$default(ProductMediaImageDTO productMediaImageDTO, ProductMediaDTO productMediaDTO, BadgeDTO badgeDTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productMediaDTO = productMediaImageDTO.productMedia;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = productMediaImageDTO.badgeCounter;
        }
        if ((i11 & 4) != 0) {
            bool = productMediaImageDTO.isDisabled;
        }
        return productMediaImageDTO.copy(productMediaDTO, badgeDTO, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadgeCounter() {
        return this.badgeCounter;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public final ProductMediaImageDTO copy(@NotNull ProductMediaDTO productMedia, BadgeDTO badgeCounter, Boolean isDisabled) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        return new ProductMediaImageDTO(productMedia, badgeCounter, isDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMediaImageDTO)) {
            return false;
        }
        ProductMediaImageDTO productMediaImageDTO = (ProductMediaImageDTO) other;
        return Intrinsics.d(this.productMedia, productMediaImageDTO.productMedia) && Intrinsics.d(this.badgeCounter, productMediaImageDTO.badgeCounter) && Intrinsics.d(this.isDisabled, productMediaImageDTO.isDisabled);
    }

    public final BadgeDTO getBadgeCounter() {
        return this.badgeCounter;
    }

    @NotNull
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    public int hashCode() {
        int hashCode = this.productMedia.hashCode() * 31;
        BadgeDTO badgeDTO = this.badgeCounter;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.productMedia;
        BadgeDTO badgeDTO = this.badgeCounter;
        Boolean bool = this.isDisabled;
        StringBuilder sb2 = new StringBuilder("ProductMediaImageDTO(productMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", badgeCounter=");
        sb2.append(badgeDTO);
        sb2.append(", isDisabled=");
        return g.d(sb2, bool, ")");
    }
}
