package ru.ozon.app.android.orderdetails.productsToPay.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.modalConstructor.data.ModalConstructorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageCarouselDTO;", "", "scrollImages", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "disableSeparator", "", "<init>", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;Z)V", "getScrollImages", "()Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "getDisableSeparator", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductImageCarouselDTO {
    public static final int $stable = 8;
    private final boolean disableSeparator;

    @NotNull
    private final ModalConstructorDTO.HorizontalScrollImagesDTO scrollImages;

    public ProductImageCarouselDTO(@NotNull ModalConstructorDTO.HorizontalScrollImagesDTO scrollImages, boolean z11) {
        Intrinsics.checkNotNullParameter(scrollImages, "scrollImages");
        this.scrollImages = scrollImages;
        this.disableSeparator = z11;
    }

    public static /* synthetic */ ProductImageCarouselDTO copy$default(ProductImageCarouselDTO productImageCarouselDTO, ModalConstructorDTO.HorizontalScrollImagesDTO horizontalScrollImagesDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            horizontalScrollImagesDTO = productImageCarouselDTO.scrollImages;
        }
        if ((i11 & 2) != 0) {
            z11 = productImageCarouselDTO.disableSeparator;
        }
        return productImageCarouselDTO.copy(horizontalScrollImagesDTO, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ModalConstructorDTO.HorizontalScrollImagesDTO getScrollImages() {
        return this.scrollImages;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    @NotNull
    public final ProductImageCarouselDTO copy(@NotNull ModalConstructorDTO.HorizontalScrollImagesDTO scrollImages, boolean disableSeparator) {
        Intrinsics.checkNotNullParameter(scrollImages, "scrollImages");
        return new ProductImageCarouselDTO(scrollImages, disableSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImageCarouselDTO)) {
            return false;
        }
        ProductImageCarouselDTO productImageCarouselDTO = (ProductImageCarouselDTO) other;
        return Intrinsics.d(this.scrollImages, productImageCarouselDTO.scrollImages) && this.disableSeparator == productImageCarouselDTO.disableSeparator;
    }

    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    @NotNull
    public final ModalConstructorDTO.HorizontalScrollImagesDTO getScrollImages() {
        return this.scrollImages;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disableSeparator) + (this.scrollImages.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProductImageCarouselDTO(scrollImages=" + this.scrollImages + ", disableSeparator=" + this.disableSeparator + ")";
    }

    public /* synthetic */ ProductImageCarouselDTO(ModalConstructorDTO.HorizontalScrollImagesDTO horizontalScrollImagesDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(horizontalScrollImagesDTO, (i11 & 2) != 0 ? false : z11);
    }
}
