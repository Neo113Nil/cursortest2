package ru.ozon.app.android.orderdetails.productsToPay.data;

import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "counter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductImageDTO {
    public static final int $stable = 0;
    private final BadgeDTO counter;

    @NotNull
    private final ImageDTO image;
    private final boolean isAdult;

    public ProductImageDTO(@NotNull ImageDTO image, BadgeDTO badgeDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.counter = badgeDTO;
        this.isAdult = z11;
    }

    public static /* synthetic */ ProductImageDTO copy$default(ProductImageDTO productImageDTO, ImageDTO imageDTO, BadgeDTO badgeDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = productImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = productImageDTO.counter;
        }
        if ((i11 & 4) != 0) {
            z11 = productImageDTO.isAdult;
        }
        return productImageDTO.copy(imageDTO, badgeDTO, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getCounter() {
        return this.counter;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public final ProductImageDTO copy(@NotNull ImageDTO image, BadgeDTO counter, boolean isAdult) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ProductImageDTO(image, counter, isAdult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImageDTO)) {
            return false;
        }
        ProductImageDTO productImageDTO = (ProductImageDTO) other;
        return Intrinsics.d(this.image, productImageDTO.image) && Intrinsics.d(this.counter, productImageDTO.counter) && this.isAdult == productImageDTO.isAdult;
    }

    public final BadgeDTO getCounter() {
        return this.counter;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        BadgeDTO badgeDTO = this.counter;
        return Boolean.hashCode(this.isAdult) + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31);
    }

    public final boolean isAdult() {
        return this.isAdult;
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        BadgeDTO badgeDTO = this.counter;
        boolean z11 = this.isAdult;
        StringBuilder sb2 = new StringBuilder("ProductImageDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", counter=");
        sb2.append(badgeDTO);
        sb2.append(", isAdult=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ ProductImageDTO(ImageDTO imageDTO, BadgeDTO badgeDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, badgeDTO, (i11 & 4) != 0 ? false : z11);
    }
}
