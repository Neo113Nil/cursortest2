package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader;

import Bi.b;
import C.o0;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;", "", "backButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "productCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "closeReviewFormTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "placeholdersSheetConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;Ljava/lang/String;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getProductCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "getCloseReviewFormTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconButtonV3DTO backButton;
    private final String backgroundColor;
    private final Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo;
    private final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig;

    @NotNull
    private final CellDTO productCell;
    private final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewFormHeaderDTO(@NotNull IconButtonV3DTO backButton, @NotNull CellDTO productCell, ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig, String str) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        this.backButton = backButton;
        this.productCell = productCell;
        this.submitOnBackConfig = submitOnBackConfigDTO;
        this.closeReviewFormTrackingInfo = map;
        this.trackingInfo = map2;
        this.placeholdersSheetConfig = placeholdersSheetConfig;
        this.backgroundColor = str;
    }

    public static /* synthetic */ ReviewFormHeaderDTO copy$default(ReviewFormHeaderDTO reviewFormHeaderDTO, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, Map map, Map map2, ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = reviewFormHeaderDTO.backButton;
        }
        if ((i11 & 2) != 0) {
            cellDTO = reviewFormHeaderDTO.productCell;
        }
        if ((i11 & 4) != 0) {
            submitOnBackConfigDTO = reviewFormHeaderDTO.submitOnBackConfig;
        }
        if ((i11 & 8) != 0) {
            map = reviewFormHeaderDTO.closeReviewFormTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = reviewFormHeaderDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            placeholdersSheetConfig = reviewFormHeaderDTO.placeholdersSheetConfig;
        }
        if ((i11 & 64) != 0) {
            str = reviewFormHeaderDTO.backgroundColor;
        }
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig2 = placeholdersSheetConfig;
        String str2 = str;
        Map map3 = map2;
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO2 = submitOnBackConfigDTO;
        return reviewFormHeaderDTO.copy(iconButtonV3DTO, cellDTO, submitOnBackConfigDTO2, map, map3, placeholdersSheetConfig2, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getProductCell() {
        return this.productCell;
    }

    /* renamed from: component3, reason: from getter */
    public final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.closeReviewFormTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
        return this.placeholdersSheetConfig;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ReviewFormHeaderDTO copy(@NotNull IconButtonV3DTO backButton, @NotNull CellDTO productCell, ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig, Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo, ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig, String backgroundColor) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        return new ReviewFormHeaderDTO(backButton, productCell, submitOnBackConfig, closeReviewFormTrackingInfo, trackingInfo, placeholdersSheetConfig, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormHeaderDTO)) {
            return false;
        }
        ReviewFormHeaderDTO reviewFormHeaderDTO = (ReviewFormHeaderDTO) other;
        return Intrinsics.d(this.backButton, reviewFormHeaderDTO.backButton) && Intrinsics.d(this.productCell, reviewFormHeaderDTO.productCell) && Intrinsics.d(this.submitOnBackConfig, reviewFormHeaderDTO.submitOnBackConfig) && Intrinsics.d(this.closeReviewFormTrackingInfo, reviewFormHeaderDTO.closeReviewFormTrackingInfo) && Intrinsics.d(this.trackingInfo, reviewFormHeaderDTO.trackingInfo) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormHeaderDTO.placeholdersSheetConfig) && Intrinsics.d(this.backgroundColor, reviewFormHeaderDTO.backgroundColor);
    }

    @NotNull
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> getCloseReviewFormTrackingInfo() {
        return this.closeReviewFormTrackingInfo;
    }

    public final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
        return this.placeholdersSheetConfig;
    }

    @NotNull
    public final CellDTO getProductCell() {
        return this.productCell;
    }

    public final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = b.c(this.productCell, this.backButton.hashCode() * 31, 31);
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
        int hashCode = (c11 + (submitOnBackConfigDTO == null ? 0 : submitOnBackConfigDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.closeReviewFormTrackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
        int hashCode4 = (hashCode3 + (placeholdersSheetConfig == null ? 0 : placeholdersSheetConfig.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        CellDTO cellDTO = this.productCell;
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
        Map<String, TokenizedTrackingInfo> map = this.closeReviewFormTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("ReviewFormHeaderDTO(backButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", productCell=");
        sb2.append(cellDTO);
        sb2.append(", submitOnBackConfig=");
        sb2.append(submitOnBackConfigDTO);
        sb2.append(", closeReviewFormTrackingInfo=");
        sb2.append(map);
        sb2.append(", trackingInfo=");
        sb2.append(map2);
        sb2.append(", placeholdersSheetConfig=");
        sb2.append(placeholdersSheetConfig);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
