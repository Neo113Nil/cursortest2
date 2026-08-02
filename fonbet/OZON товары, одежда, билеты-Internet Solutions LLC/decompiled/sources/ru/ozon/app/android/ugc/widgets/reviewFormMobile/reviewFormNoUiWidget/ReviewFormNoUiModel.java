package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "submitOnBackConfig", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeReviewFormTrackingInfo", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "placeholdersSheetConfig", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "Ljava/util/Map;", "getCloseReviewFormTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormNoUiModel {
    private final Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo;
    private final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig;
    private final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig;

    public ReviewFormNoUiModel(ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO, Map<String, TokenizedTrackingInfo> map, ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
        this.submitOnBackConfig = submitOnBackConfigDTO;
        this.closeReviewFormTrackingInfo = map;
        this.placeholdersSheetConfig = placeholdersSheetConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormNoUiModel)) {
            return false;
        }
        ReviewFormNoUiModel reviewFormNoUiModel = (ReviewFormNoUiModel) other;
        return Intrinsics.d(this.submitOnBackConfig, reviewFormNoUiModel.submitOnBackConfig) && Intrinsics.d(this.closeReviewFormTrackingInfo, reviewFormNoUiModel.closeReviewFormTrackingInfo) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormNoUiModel.placeholdersSheetConfig);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseReviewFormTrackingInfo() {
        return this.closeReviewFormTrackingInfo;
    }

    public final ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig getPlaceholdersSheetConfig() {
        return this.placeholdersSheetConfig;
    }

    public final ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public int hashCode() {
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = this.submitOnBackConfig;
        int hashCode = (submitOnBackConfigDTO == null ? 0 : submitOnBackConfigDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.closeReviewFormTrackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = this.placeholdersSheetConfig;
        return hashCode2 + (placeholdersSheetConfig != null ? placeholdersSheetConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewFormNoUiModel(submitOnBackConfig=" + this.submitOnBackConfig + ", closeReviewFormTrackingInfo=" + this.closeReviewFormTrackingInfo + ", placeholdersSheetConfig=" + this.placeholdersSheetConfig + ")";
    }
}
