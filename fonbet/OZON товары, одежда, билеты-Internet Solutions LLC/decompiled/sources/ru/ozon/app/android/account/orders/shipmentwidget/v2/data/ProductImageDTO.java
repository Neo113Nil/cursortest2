package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "", "image", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "badgeStatus", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceBadge", "caption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "captionCommon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBadgeStatus", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceBadge", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaptionCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductImageDTO {
    public static final int $stable = PriceDTO.$stable | ImageDTO.$stable;
    private final BadgeDTO badgeStatus;
    private final TextDTO caption;
    private final CommonControlSettings captionCommon;

    @NotNull
    private final ImageDTO image;
    private final PriceDTO price;
    private final BadgeDTO priceBadge;

    @NotNull
    private final CornerRadius topCornerRadius;

    public ProductImageDTO(@NotNull ImageDTO image, @NotNull CornerRadius topCornerRadius, BadgeDTO badgeDTO, PriceDTO priceDTO, BadgeDTO badgeDTO2, TextDTO textDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        this.image = image;
        this.topCornerRadius = topCornerRadius;
        this.badgeStatus = badgeDTO;
        this.price = priceDTO;
        this.priceBadge = badgeDTO2;
        this.caption = textDTO;
        this.captionCommon = commonControlSettings;
    }

    public static /* synthetic */ ProductImageDTO copy$default(ProductImageDTO productImageDTO, ImageDTO imageDTO, CornerRadius cornerRadius, BadgeDTO badgeDTO, PriceDTO priceDTO, BadgeDTO badgeDTO2, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = productImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = productImageDTO.topCornerRadius;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = productImageDTO.badgeStatus;
        }
        if ((i11 & 8) != 0) {
            priceDTO = productImageDTO.price;
        }
        if ((i11 & 16) != 0) {
            badgeDTO2 = productImageDTO.priceBadge;
        }
        if ((i11 & 32) != 0) {
            textDTO = productImageDTO.caption;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = productImageDTO.captionCommon;
        }
        TextDTO textDTO2 = textDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        BadgeDTO badgeDTO3 = badgeDTO2;
        BadgeDTO badgeDTO4 = badgeDTO;
        return productImageDTO.copy(imageDTO, cornerRadius, badgeDTO4, priceDTO, badgeDTO3, textDTO2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadgeStatus() {
        return this.badgeStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getCaption() {
        return this.caption;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCaptionCommon() {
        return this.captionCommon;
    }

    @NotNull
    public final ProductImageDTO copy(@NotNull ImageDTO image, @NotNull CornerRadius topCornerRadius, BadgeDTO badgeStatus, PriceDTO price, BadgeDTO priceBadge, TextDTO caption, CommonControlSettings captionCommon) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        return new ProductImageDTO(image, topCornerRadius, badgeStatus, price, priceBadge, caption, captionCommon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImageDTO)) {
            return false;
        }
        ProductImageDTO productImageDTO = (ProductImageDTO) other;
        return Intrinsics.d(this.image, productImageDTO.image) && this.topCornerRadius == productImageDTO.topCornerRadius && Intrinsics.d(this.badgeStatus, productImageDTO.badgeStatus) && Intrinsics.d(this.price, productImageDTO.price) && Intrinsics.d(this.priceBadge, productImageDTO.priceBadge) && Intrinsics.d(this.caption, productImageDTO.caption) && Intrinsics.d(this.captionCommon, productImageDTO.captionCommon);
    }

    public final BadgeDTO getBadgeStatus() {
        return this.badgeStatus;
    }

    public final TextDTO getCaption() {
        return this.caption;
    }

    public final CommonControlSettings getCaptionCommon() {
        return this.captionCommon;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public int hashCode() {
        int b11 = b.b(this.topCornerRadius, this.image.hashCode() * 31, 31);
        BadgeDTO badgeDTO = this.badgeStatus;
        int hashCode = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.priceBadge;
        int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        TextDTO textDTO = this.caption;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.captionCommon;
        return hashCode4 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        CornerRadius cornerRadius = this.topCornerRadius;
        BadgeDTO badgeDTO = this.badgeStatus;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO2 = this.priceBadge;
        TextDTO textDTO = this.caption;
        CommonControlSettings commonControlSettings = this.captionCommon;
        StringBuilder sb2 = new StringBuilder("ProductImageDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", topCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", badgeStatus=");
        sb2.append(badgeDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", priceBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", caption=");
        sb2.append(textDTO);
        sb2.append(", captionCommon=");
        return Ak.b.g(sb2, commonControlSettings, ")");
    }

    public /* synthetic */ ProductImageDTO(ImageDTO imageDTO, CornerRadius cornerRadius, BadgeDTO badgeDTO, PriceDTO priceDTO, BadgeDTO badgeDTO2, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, (i11 & 2) != 0 ? CornerRadius.RADIUS_400 : cornerRadius, badgeDTO, priceDTO, badgeDTO2, textDTO, commonControlSettings);
    }
}
