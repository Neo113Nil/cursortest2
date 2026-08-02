package ru.ozon.app.android.ugc.widgets.additionalReviewV2.data;

import Bl.C2639a;
import H3.c;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO;", "", "products", "", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$ProductDTO;", "<init>", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProductDTO", "HideButtonDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdditionalReviewV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ProductDTO> products;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003J{\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$ProductDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cornerIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subtitle", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rightCornerButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "imageAtom", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideButton", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCornerIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getRightCornerButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideButton", "()Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final IconDTO cornerIcon;
        private final HideButtonDTO hideButton;

        @NotNull
        private final ImageDTO imageAtom;

        @NotNull
        private final RatingDTO rating;
        private final IconButtonV3DTO rightCornerButton;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProductDTO(@NotNull TextDTO title, IconDTO iconDTO, TextDTO textDTO, @NotNull RatingDTO rating, Map<String, TokenizedTrackingInfo> map, IconButtonV3DTO iconButtonV3DTO, @NotNull ImageDTO imageAtom, AtomActionDTO atomActionDTO, HideButtonDTO hideButtonDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            this.title = title;
            this.cornerIcon = iconDTO;
            this.subtitle = textDTO;
            this.rating = rating;
            this.trackingInfo = map;
            this.rightCornerButton = iconButtonV3DTO;
            this.imageAtom = imageAtom;
            this.action = atomActionDTO;
            this.hideButton = hideButtonDTO;
        }

        public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, TextDTO textDTO, IconDTO iconDTO, TextDTO textDTO2, RatingDTO ratingDTO, Map map, IconButtonV3DTO iconButtonV3DTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, HideButtonDTO hideButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = productDTO.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = productDTO.cornerIcon;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = productDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                ratingDTO = productDTO.rating;
            }
            if ((i11 & 16) != 0) {
                map = productDTO.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                iconButtonV3DTO = productDTO.rightCornerButton;
            }
            if ((i11 & 64) != 0) {
                imageDTO = productDTO.imageAtom;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = productDTO.action;
            }
            if ((i11 & 256) != 0) {
                hideButtonDTO = productDTO.hideButton;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            HideButtonDTO hideButtonDTO2 = hideButtonDTO;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            ImageDTO imageDTO2 = imageDTO;
            Map map2 = map;
            TextDTO textDTO3 = textDTO2;
            return productDTO.copy(textDTO, iconDTO, textDTO3, ratingDTO, map2, iconButtonV3DTO2, imageDTO2, atomActionDTO2, hideButtonDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getCornerIcon() {
            return this.cornerIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RatingDTO getRating() {
            return this.rating;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final IconButtonV3DTO getRightCornerButton() {
            return this.rightCornerButton;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final HideButtonDTO getHideButton() {
            return this.hideButton;
        }

        @NotNull
        public final ProductDTO copy(@NotNull TextDTO title, IconDTO cornerIcon, TextDTO subtitle, @NotNull RatingDTO rating, Map<String, TokenizedTrackingInfo> trackingInfo, IconButtonV3DTO rightCornerButton, @NotNull ImageDTO imageAtom, AtomActionDTO action, HideButtonDTO hideButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            return new ProductDTO(title, cornerIcon, subtitle, rating, trackingInfo, rightCornerButton, imageAtom, action, hideButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDTO)) {
                return false;
            }
            ProductDTO productDTO = (ProductDTO) other;
            return Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.cornerIcon, productDTO.cornerIcon) && Intrinsics.d(this.subtitle, productDTO.subtitle) && Intrinsics.d(this.rating, productDTO.rating) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.rightCornerButton, productDTO.rightCornerButton) && Intrinsics.d(this.imageAtom, productDTO.imageAtom) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.hideButton, productDTO.hideButton);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconDTO getCornerIcon() {
            return this.cornerIcon;
        }

        public final HideButtonDTO getHideButton() {
            return this.hideButton;
        }

        @NotNull
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        @NotNull
        public final RatingDTO getRating() {
            return this.rating;
        }

        public final IconButtonV3DTO getRightCornerButton() {
            return this.rightCornerButton;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconDTO iconDTO = this.cornerIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode3 = (this.rating.hashCode() + ((hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.rightCornerButton;
            int b11 = a.b(this.imageAtom, (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode5 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            HideButtonDTO hideButtonDTO = this.hideButton;
            return hashCode5 + (hideButtonDTO != null ? hideButtonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.cornerIcon;
            TextDTO textDTO2 = this.subtitle;
            RatingDTO ratingDTO = this.rating;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            IconButtonV3DTO iconButtonV3DTO = this.rightCornerButton;
            ImageDTO imageDTO = this.imageAtom;
            AtomActionDTO atomActionDTO = this.action;
            HideButtonDTO hideButtonDTO = this.hideButton;
            StringBuilder d11 = C2639a.d("ProductDTO(title=", ", cornerIcon=", ", subtitle=", iconDTO, textDTO);
            d11.append(textDTO2);
            d11.append(", rating=");
            d11.append(ratingDTO);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", rightCornerButton=");
            d11.append(iconButtonV3DTO);
            d11.append(", imageAtom=");
            d11.append(imageDTO);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", hideButton=");
            d11.append(hideButtonDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public AdditionalReviewV2DTO(@NotNull List<ProductDTO> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdditionalReviewV2DTO copy$default(AdditionalReviewV2DTO additionalReviewV2DTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = additionalReviewV2DTO.products;
        }
        return additionalReviewV2DTO.copy(list);
    }

    @NotNull
    public final List<ProductDTO> component1() {
        return this.products;
    }

    @NotNull
    public final AdditionalReviewV2DTO copy(@NotNull List<ProductDTO> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new AdditionalReviewV2DTO(products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdditionalReviewV2DTO) && Intrinsics.d(this.products, ((AdditionalReviewV2DTO) other).products);
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AdditionalReviewV2DTO(products=", ")", this.products);
    }
}
