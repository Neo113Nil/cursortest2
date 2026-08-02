package ru.ozon.app.android.barcode.barcodeProductsList.data;

import Fm.C3051a;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/data/ProductDTO;", "", "image", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductDTO {
    private final CommonControlSettings common;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final PriceDTO price;
    private final BadgeDTO priceBadge;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public ProductDTO(@NotNull ImageDTO image, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO title, TextDTO textDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        this.image = image;
        this.price = price;
        this.priceBadge = badgeDTO;
        this.title = title;
        this.subtitle = textDTO;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, ImageDTO imageDTO, PriceDTO priceDTO, BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = productDTO.image;
        }
        if ((i11 & 2) != 0) {
            priceDTO = productDTO.price;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = productDTO.priceBadge;
        }
        if ((i11 & 8) != 0) {
            textDTO = productDTO.title;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = productDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = productDTO.common;
        }
        TextDTO textDTO3 = textDTO2;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return productDTO.copy(imageDTO, priceDTO, badgeDTO, textDTO, textDTO3, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ProductDTO copy(@NotNull ImageDTO image, @NotNull PriceDTO price, BadgeDTO priceBadge, @NotNull TextDTO title, TextDTO subtitle, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProductDTO(image, price, priceBadge, title, subtitle, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.price, productDTO.price) && Intrinsics.d(this.priceBadge, productDTO.priceBadge) && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.subtitle, productDTO.subtitle) && Intrinsics.d(this.common, productDTO.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C3051a.b(this.price, this.image.hashCode() * 31, 31);
        BadgeDTO badgeDTO = this.priceBadge;
        int a11 = b.a(this.title, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductDTO(image=" + this.image + ", price=" + this.price + ", priceBadge=" + this.priceBadge + ", title=" + this.title + ", subtitle=" + this.subtitle + ", common=" + this.common + ")";
    }
}
