package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.domain;

import GR.b;
import Kk.C3532b;
import Ve.C4636t5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/domain/ReviewFormHeaderV2Model;", "", "", "productId", "", "isEditReview", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productImage", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "rating", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeReviewFormTrackingInfo", "trackingInfo", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "placeholdersSheetConfig", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "Z", "()Z", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "getTitle", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "getSubtitle", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "getRating", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/util/Map;", "getCloseReviewFormTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormHeaderV2Model {

    @NotNull
    private final IconButtonV3DTO closeButton;
    private final Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo;
    private final boolean isEditReview;
    private final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig;

    @NotNull
    private final String productId;

    @NotNull
    private final ProductMediaDTO productImage;

    @NotNull
    private final ReviewFormDTO.RatingDTO rating;
    private final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig;
    private final ReviewFormDTO.ClickableTextDTO subtitle;

    @NotNull
    private final ReviewFormDTO.ClickableTextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewFormHeaderV2Model(@NotNull String productId, boolean z11, @NotNull ProductMediaDTO productImage, @NotNull ReviewFormDTO.ClickableTextDTO title, ReviewFormDTO.ClickableTextDTO clickableTextDTO, @NotNull ReviewFormDTO.RatingDTO rating, @NotNull IconButtonV3DTO closeButton, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.productId = productId;
        this.isEditReview = z11;
        this.productImage = productImage;
        this.title = title;
        this.subtitle = clickableTextDTO;
        this.rating = rating;
        this.closeButton = closeButton;
        this.closeReviewFormTrackingInfo = map;
        this.trackingInfo = map2;
        this.submitOnBackConfig = submitOnBackConfigDTO;
        this.placeholdersSheetConfig = placeholdersSheetConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormHeaderV2Model)) {
            return false;
        }
        ReviewFormHeaderV2Model reviewFormHeaderV2Model = (ReviewFormHeaderV2Model) other;
        return Intrinsics.d(this.productId, reviewFormHeaderV2Model.productId) && this.isEditReview == reviewFormHeaderV2Model.isEditReview && Intrinsics.d(this.productImage, reviewFormHeaderV2Model.productImage) && Intrinsics.d(this.title, reviewFormHeaderV2Model.title) && Intrinsics.d(this.subtitle, reviewFormHeaderV2Model.subtitle) && Intrinsics.d(this.rating, reviewFormHeaderV2Model.rating) && Intrinsics.d(this.closeButton, reviewFormHeaderV2Model.closeButton) && Intrinsics.d(this.closeReviewFormTrackingInfo, reviewFormHeaderV2Model.closeReviewFormTrackingInfo) && Intrinsics.d(this.trackingInfo, reviewFormHeaderV2Model.trackingInfo) && Intrinsics.d(this.submitOnBackConfig, reviewFormHeaderV2Model.submitOnBackConfig) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormHeaderV2Model.placeholdersSheetConfig);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final Map<String, TokenizedTrackingInfo> getCloseReviewFormTrackingInfo() {
        return this.closeReviewFormTrackingInfo;
    }

    public final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
        return this.placeholdersSheetConfig;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final ProductMediaDTO getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final ReviewFormDTO.RatingDTO getRating() {
        return this.rating;
    }

    public final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public final ReviewFormDTO.ClickableTextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final ReviewFormDTO.ClickableTextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + ((this.productImage.hashCode() + C3532b.a(this.productId.hashCode() * 31, 31, this.isEditReview)) * 31)) * 31;
        ReviewFormDTO.ClickableTextDTO clickableTextDTO = this.subtitle;
        int c11 = b.c(this.closeButton, (this.rating.hashCode() + ((hashCode + (clickableTextDTO == null ? 0 : clickableTextDTO.hashCode())) * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.closeReviewFormTrackingInfo;
        int hashCode2 = (c11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
        int hashCode4 = (hashCode3 + (submitOnBackConfigDTO == null ? 0 : submitOnBackConfigDTO.hashCode())) * 31;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
        return hashCode4 + (placeholdersSheetConfig != null ? placeholdersSheetConfig.hashCode() : 0);
    }

    /* renamed from: isEditReview, reason: from getter */
    public final boolean getIsEditReview() {
        return this.isEditReview;
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        boolean z11 = this.isEditReview;
        ProductMediaDTO productMediaDTO = this.productImage;
        ReviewFormDTO.ClickableTextDTO clickableTextDTO = this.title;
        ReviewFormDTO.ClickableTextDTO clickableTextDTO2 = this.subtitle;
        ReviewFormDTO.RatingDTO ratingDTO = this.rating;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        Map<String, TokenizedTrackingInfo> map = this.closeReviewFormTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
        StringBuilder b11 = C4636t5.b("ReviewFormHeaderV2Model(productId=", str, ", isEditReview=", ", productImage=", z11);
        b11.append(productMediaDTO);
        b11.append(", title=");
        b11.append(clickableTextDTO);
        b11.append(", subtitle=");
        b11.append(clickableTextDTO2);
        b11.append(", rating=");
        b11.append(ratingDTO);
        b11.append(", closeButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", closeReviewFormTrackingInfo=");
        b11.append(map);
        b11.append(", trackingInfo=");
        b11.append(map2);
        b11.append(", submitOnBackConfig=");
        b11.append(submitOnBackConfigDTO);
        b11.append(", placeholdersSheetConfig=");
        b11.append(placeholdersSheetConfig);
        b11.append(")");
        return b11.toString();
    }
}
