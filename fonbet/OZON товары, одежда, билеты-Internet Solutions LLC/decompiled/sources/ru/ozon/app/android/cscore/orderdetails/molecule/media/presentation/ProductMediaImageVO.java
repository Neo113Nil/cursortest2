package ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation;

import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMedia", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeCounter", "", "isDisabled", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductMediaImageVO {
    public static final int $stable = ProductMediaDTO.$stable;
    private final BadgeDTO badgeCounter;
    private final boolean isDisabled;

    @NotNull
    private final ProductMediaDTO productMedia;

    public ProductMediaImageVO(@NotNull ProductMediaDTO productMedia, BadgeDTO badgeDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        this.productMedia = productMedia;
        this.badgeCounter = badgeDTO;
        this.isDisabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMediaImageVO)) {
            return false;
        }
        ProductMediaImageVO productMediaImageVO = (ProductMediaImageVO) other;
        return Intrinsics.d(this.productMedia, productMediaImageVO.productMedia) && Intrinsics.d(this.badgeCounter, productMediaImageVO.badgeCounter) && this.isDisabled == productMediaImageVO.isDisabled;
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
        return Boolean.hashCode(this.isDisabled) + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.productMedia;
        BadgeDTO badgeDTO = this.badgeCounter;
        boolean z11 = this.isDisabled;
        StringBuilder sb2 = new StringBuilder("ProductMediaImageVO(productMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", badgeCounter=");
        sb2.append(badgeDTO);
        sb2.append(", isDisabled=");
        return a.a(")", sb2, z11);
    }
}
