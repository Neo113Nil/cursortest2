package ru.ozon.android.messenger.blocks.productshelf;

import B90.C2616s;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u008f\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lru/ozon/android/messenger/blocks/productshelf/ProductShelfDTO;", "", "image", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "priceBadges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomBadges", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "updateBlockAction", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getProductName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButtons", "()Ljava/util/List;", "getPriceBadges", "getBottomBadges", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUpdateBlockAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ProductShelfDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final List<BadgeDTO> bottomBadges;
    private final List<IconButtonV3DTO> buttons;

    @NotNull
    private final ProductMediaDTO image;
    private final PriceDTO price;
    private final List<BadgeDTO> priceBadges;

    @NotNull
    private final TextDTO productName;
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final AtomActionDTO updateBlockAction;

    public ProductShelfDTO(@NotNull ProductMediaDTO image, PriceDTO priceDTO, @NotNull TextDTO productName, List<IconButtonV3DTO> list, List<BadgeDTO> list2, List<BadgeDTO> list3, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.image = image;
        this.price = priceDTO;
        this.productName = productName;
        this.buttons = list;
        this.priceBadges = list2;
        this.bottomBadges = list3;
        this.action = atomActionDTO;
        this.updateBlockAction = atomActionDTO2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProductShelfDTO copy$default(ProductShelfDTO productShelfDTO, ProductMediaDTO productMediaDTO, PriceDTO priceDTO, TextDTO textDTO, List list, List list2, List list3, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productMediaDTO = productShelfDTO.image;
        }
        if ((i11 & 2) != 0) {
            priceDTO = productShelfDTO.price;
        }
        if ((i11 & 4) != 0) {
            textDTO = productShelfDTO.productName;
        }
        if ((i11 & 8) != 0) {
            list = productShelfDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            list2 = productShelfDTO.priceBadges;
        }
        if ((i11 & 32) != 0) {
            list3 = productShelfDTO.bottomBadges;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = productShelfDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO2 = productShelfDTO.updateBlockAction;
        }
        if ((i11 & 256) != 0) {
            map = productShelfDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        List list4 = list3;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        List list5 = list2;
        TextDTO textDTO2 = textDTO;
        return productShelfDTO.copy(productMediaDTO, priceDTO, textDTO2, list, list5, list4, atomActionDTO4, atomActionDTO3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductMediaDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getProductName() {
        return this.productName;
    }

    public final List<IconButtonV3DTO> component4() {
        return this.buttons;
    }

    public final List<BadgeDTO> component5() {
        return this.priceBadges;
    }

    public final List<BadgeDTO> component6() {
        return this.bottomBadges;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getUpdateBlockAction() {
        return this.updateBlockAction;
    }

    public final Map<String, MessengerTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductShelfDTO copy(@NotNull ProductMediaDTO image, PriceDTO price, @NotNull TextDTO productName, List<IconButtonV3DTO> buttons, List<BadgeDTO> priceBadges, List<BadgeDTO> bottomBadges, AtomActionDTO action, AtomActionDTO updateBlockAction, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(productName, "productName");
        return new ProductShelfDTO(image, price, productName, buttons, priceBadges, bottomBadges, action, updateBlockAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductShelfDTO)) {
            return false;
        }
        ProductShelfDTO productShelfDTO = (ProductShelfDTO) other;
        return Intrinsics.d(this.image, productShelfDTO.image) && Intrinsics.d(this.price, productShelfDTO.price) && Intrinsics.d(this.productName, productShelfDTO.productName) && Intrinsics.d(this.buttons, productShelfDTO.buttons) && Intrinsics.d(this.priceBadges, productShelfDTO.priceBadges) && Intrinsics.d(this.bottomBadges, productShelfDTO.bottomBadges) && Intrinsics.d(this.action, productShelfDTO.action) && Intrinsics.d(this.updateBlockAction, productShelfDTO.updateBlockAction) && Intrinsics.d(this.trackingInfo, productShelfDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<BadgeDTO> getBottomBadges() {
        return this.bottomBadges;
    }

    public final List<IconButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final ProductMediaDTO getImage() {
        return this.image;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final List<BadgeDTO> getPriceBadges() {
        return this.priceBadges;
    }

    @NotNull
    public final TextDTO getProductName() {
        return this.productName;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getUpdateBlockAction() {
        return this.updateBlockAction;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        PriceDTO priceDTO = this.price;
        int a11 = Ns.b.a(this.productName, (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31);
        List<IconButtonV3DTO> list = this.buttons;
        int hashCode2 = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgeDTO> list2 = this.priceBadges;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BadgeDTO> list3 = this.bottomBadges;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.updateBlockAction;
        int hashCode6 = (hashCode5 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.image;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.productName;
        List<IconButtonV3DTO> list = this.buttons;
        List<BadgeDTO> list2 = this.priceBadges;
        List<BadgeDTO> list3 = this.bottomBadges;
        AtomActionDTO atomActionDTO = this.action;
        AtomActionDTO atomActionDTO2 = this.updateBlockAction;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProductShelfDTO(image=");
        sb2.append(productMediaDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", productName=");
        Tl.a.e(sb2, textDTO, ", buttons=", list, ", priceBadges=");
        C2616s.g(", bottomBadges=", ", action=", sb2, list2, list3);
        sb2.append(atomActionDTO);
        sb2.append(", updateBlockAction=");
        sb2.append(atomActionDTO2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
