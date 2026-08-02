package ru.ozon.app.android.ugc.widgets.productsforreview.data;

import B3.p;
import G.g;
import H3.c;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductContainer;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO;", "", "items", "", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$ItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ItemDTO", "HideButtonDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductsForReviewDTO {
    public static final int $stable = 8;
    private final List<ItemDTO> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideButtonDTO {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO title;

        public HideButtonDTO(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            this.iconButton = iconButton;
            this.title = title;
        }

        public static /* synthetic */ HideButtonDTO copy$default(HideButtonDTO hideButtonDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = hideButtonDTO.iconButton;
            }
            if ((i11 & 2) != 0) {
                textDTO = hideButtonDTO.title;
            }
            return hideButtonDTO.copy(iconButtonV3DTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final HideButtonDTO copy(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            return new HideButtonDTO(iconButton, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideButtonDTO)) {
                return false;
            }
            HideButtonDTO hideButtonDTO = (HideButtonDTO) other;
            return Intrinsics.d(this.iconButton, hideButtonDTO.iconButton) && Intrinsics.d(this.title, hideButtonDTO.title);
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.iconButton.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "HideButtonDTO(iconButton=" + this.iconButton + ", title=" + this.title + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u008f\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$ItemDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductContainer;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "infoBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rateDeeplink", "", "productTapAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "productTapTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rateTapTracking", "trackingInfo", "hideButton", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;)V", "getProduct", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "getInfoBadges", "()Ljava/util/List;", "getRateDeeplink", "()Ljava/lang/String;", "getProductTapAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getProductTapTracking", "()Ljava/util/Map;", "getRateTapTracking", "getTrackingInfo", "getHideButton", "()Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO implements ReviewProductContainer {
        public static final int $stable = 8;
        private final HideButtonDTO hideButton;
        private final List<BadgeDTO> infoBadges;

        @NotNull
        private final ReviewProductDTO product;
        private final AtomActionDTO productTapAction;
        private final Map<String, TokenizedTrackingInfo> productTapTracking;

        @NotNull
        private final String rateDeeplink;
        private final Map<String, TokenizedTrackingInfo> rateTapTracking;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ItemDTO(@NotNull ReviewProductDTO product, List<BadgeDTO> list, @NotNull String rateDeeplink, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, HideButtonDTO hideButtonDTO) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(rateDeeplink, "rateDeeplink");
            this.product = product;
            this.infoBadges = list;
            this.rateDeeplink = rateDeeplink;
            this.productTapAction = atomActionDTO;
            this.productTapTracking = map;
            this.rateTapTracking = map2;
            this.trackingInfo = map3;
            this.hideButton = hideButtonDTO;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, ReviewProductDTO reviewProductDTO, List list, String str, AtomActionDTO atomActionDTO, Map map, Map map2, Map map3, HideButtonDTO hideButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                reviewProductDTO = itemDTO.product;
            }
            if ((i11 & 2) != 0) {
                list = itemDTO.infoBadges;
            }
            if ((i11 & 4) != 0) {
                str = itemDTO.rateDeeplink;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = itemDTO.productTapAction;
            }
            if ((i11 & 16) != 0) {
                map = itemDTO.productTapTracking;
            }
            if ((i11 & 32) != 0) {
                map2 = itemDTO.rateTapTracking;
            }
            if ((i11 & 64) != 0) {
                map3 = itemDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                hideButtonDTO = itemDTO.hideButton;
            }
            Map map4 = map3;
            HideButtonDTO hideButtonDTO2 = hideButtonDTO;
            Map map5 = map;
            Map map6 = map2;
            return itemDTO.copy(reviewProductDTO, list, str, atomActionDTO, map5, map6, map4, hideButtonDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ReviewProductDTO getProduct() {
            return this.product;
        }

        public final List<BadgeDTO> component2() {
            return this.infoBadges;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRateDeeplink() {
            return this.rateDeeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getProductTapAction() {
            return this.productTapAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.productTapTracking;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.rateTapTracking;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final HideButtonDTO getHideButton() {
            return this.hideButton;
        }

        @NotNull
        public final ItemDTO copy(@NotNull ReviewProductDTO product, List<BadgeDTO> infoBadges, @NotNull String rateDeeplink, AtomActionDTO productTapAction, Map<String, TokenizedTrackingInfo> productTapTracking, Map<String, TokenizedTrackingInfo> rateTapTracking, Map<String, TokenizedTrackingInfo> trackingInfo, HideButtonDTO hideButton) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(rateDeeplink, "rateDeeplink");
            return new ItemDTO(product, infoBadges, rateDeeplink, productTapAction, productTapTracking, rateTapTracking, trackingInfo, hideButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.product, itemDTO.product) && Intrinsics.d(this.infoBadges, itemDTO.infoBadges) && Intrinsics.d(this.rateDeeplink, itemDTO.rateDeeplink) && Intrinsics.d(this.productTapAction, itemDTO.productTapAction) && Intrinsics.d(this.productTapTracking, itemDTO.productTapTracking) && Intrinsics.d(this.rateTapTracking, itemDTO.rateTapTracking) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo) && Intrinsics.d(this.hideButton, itemDTO.hideButton);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductContainer
        public List<Badge> getBadges() {
            return ReviewProductContainer.DefaultImpls.getBadges(this);
        }

        public final HideButtonDTO getHideButton() {
            return this.hideButton;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductContainer
        public List<BadgeDTO> getInfoBadges() {
            return this.infoBadges;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductContainer
        @NotNull
        public ReviewProductDTO getProduct() {
            return this.product;
        }

        public final AtomActionDTO getProductTapAction() {
            return this.productTapAction;
        }

        public final Map<String, TokenizedTrackingInfo> getProductTapTracking() {
            return this.productTapTracking;
        }

        @NotNull
        public final String getRateDeeplink() {
            return this.rateDeeplink;
        }

        public final Map<String, TokenizedTrackingInfo> getRateTapTracking() {
            return this.rateTapTracking;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.product.hashCode() * 31;
            List<BadgeDTO> list = this.infoBadges;
            int a11 = g.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.rateDeeplink);
            AtomActionDTO atomActionDTO = this.productTapAction;
            int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.productTapTracking;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.rateTapTracking;
            int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
            HideButtonDTO hideButtonDTO = this.hideButton;
            return hashCode5 + (hideButtonDTO != null ? hideButtonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ReviewProductDTO reviewProductDTO = this.product;
            List<BadgeDTO> list = this.infoBadges;
            String str = this.rateDeeplink;
            AtomActionDTO atomActionDTO = this.productTapAction;
            Map<String, TokenizedTrackingInfo> map = this.productTapTracking;
            Map<String, TokenizedTrackingInfo> map2 = this.rateTapTracking;
            Map<String, TokenizedTrackingInfo> map3 = this.trackingInfo;
            HideButtonDTO hideButtonDTO = this.hideButton;
            StringBuilder sb2 = new StringBuilder("ItemDTO(product=");
            sb2.append(reviewProductDTO);
            sb2.append(", infoBadges=");
            sb2.append(list);
            sb2.append(", rateDeeplink=");
            p.c(str, ", productTapAction=", ", productTapTracking=", sb2, atomActionDTO);
            b.g(sb2, map, ", rateTapTracking=", map2, ", trackingInfo=");
            sb2.append(map3);
            sb2.append(", hideButton=");
            sb2.append(hideButtonDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public ProductsForReviewDTO(List<ItemDTO> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsForReviewDTO copy$default(ProductsForReviewDTO productsForReviewDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsForReviewDTO.items;
        }
        return productsForReviewDTO.copy(list);
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    @NotNull
    public final ProductsForReviewDTO copy(List<ItemDTO> items) {
        return new ProductsForReviewDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductsForReviewDTO) && Intrinsics.d(this.items, ((ProductsForReviewDTO) other).items);
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ProductsForReviewDTO(items=", ")", this.items);
    }
}
