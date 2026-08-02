package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J|\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0010HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;", "", "uploadKey", "", "productId", "isEditReview", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "isRatingFullScreen", "ratingFullScreenTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "points", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;ZLjava/util/Map;Ljava/lang/Integer;Ljava/lang/String;)V", "getUploadKey", "()Ljava/lang/String;", "getProductId", "()Z", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRatingFullScreenTrackingInfo", "()Ljava/util/Map;", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;ZLjava/util/Map;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;", "equals", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormRatingDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final boolean isEditReview;
    private final boolean isRatingFullScreen;
    private final Integer points;

    @NotNull
    private final String productId;

    @NotNull
    private final RatingDTO rating;
    private final Map<String, TokenizedTrackingInfo> ratingFullScreenTrackingInfo;
    private final TextDTO title;

    @NotNull
    private final String uploadKey;

    public ReviewFormRatingDTO(@NotNull String uploadKey, @NotNull String productId, boolean z11, TextDTO textDTO, @NotNull RatingDTO rating, boolean z12, Map<String, TokenizedTrackingInfo> map, Integer num, String str) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(rating, "rating");
        this.uploadKey = uploadKey;
        this.productId = productId;
        this.isEditReview = z11;
        this.title = textDTO;
        this.rating = rating;
        this.isRatingFullScreen = z12;
        this.ratingFullScreenTrackingInfo = map;
        this.points = num;
        this.backgroundColor = str;
    }

    public static /* synthetic */ ReviewFormRatingDTO copy$default(ReviewFormRatingDTO reviewFormRatingDTO, String str, String str2, boolean z11, TextDTO textDTO, RatingDTO ratingDTO, boolean z12, Map map, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormRatingDTO.uploadKey;
        }
        if ((i11 & 2) != 0) {
            str2 = reviewFormRatingDTO.productId;
        }
        if ((i11 & 4) != 0) {
            z11 = reviewFormRatingDTO.isEditReview;
        }
        if ((i11 & 8) != 0) {
            textDTO = reviewFormRatingDTO.title;
        }
        if ((i11 & 16) != 0) {
            ratingDTO = reviewFormRatingDTO.rating;
        }
        if ((i11 & 32) != 0) {
            z12 = reviewFormRatingDTO.isRatingFullScreen;
        }
        if ((i11 & 64) != 0) {
            map = reviewFormRatingDTO.ratingFullScreenTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num = reviewFormRatingDTO.points;
        }
        if ((i11 & 256) != 0) {
            str3 = reviewFormRatingDTO.backgroundColor;
        }
        Integer num2 = num;
        String str4 = str3;
        boolean z13 = z12;
        Map map2 = map;
        RatingDTO ratingDTO2 = ratingDTO;
        boolean z14 = z11;
        return reviewFormRatingDTO.copy(str, str2, z14, textDTO, ratingDTO2, z13, map2, num2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEditReview() {
        return this.isEditReview;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRatingFullScreen() {
        return this.isRatingFullScreen;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.ratingFullScreenTrackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ReviewFormRatingDTO copy(@NotNull String uploadKey, @NotNull String productId, boolean isEditReview, TextDTO title, @NotNull RatingDTO rating, boolean isRatingFullScreen, Map<String, TokenizedTrackingInfo> ratingFullScreenTrackingInfo, Integer points, String backgroundColor) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new ReviewFormRatingDTO(uploadKey, productId, isEditReview, title, rating, isRatingFullScreen, ratingFullScreenTrackingInfo, points, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormRatingDTO)) {
            return false;
        }
        ReviewFormRatingDTO reviewFormRatingDTO = (ReviewFormRatingDTO) other;
        return Intrinsics.d(this.uploadKey, reviewFormRatingDTO.uploadKey) && Intrinsics.d(this.productId, reviewFormRatingDTO.productId) && this.isEditReview == reviewFormRatingDTO.isEditReview && Intrinsics.d(this.title, reviewFormRatingDTO.title) && Intrinsics.d(this.rating, reviewFormRatingDTO.rating) && this.isRatingFullScreen == reviewFormRatingDTO.isRatingFullScreen && Intrinsics.d(this.ratingFullScreenTrackingInfo, reviewFormRatingDTO.ratingFullScreenTrackingInfo) && Intrinsics.d(this.points, reviewFormRatingDTO.points) && Intrinsics.d(this.backgroundColor, reviewFormRatingDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getPoints() {
        return this.points;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    public final Map<String, TokenizedTrackingInfo> getRatingFullScreenTrackingInfo() {
        return this.ratingFullScreenTrackingInfo;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(this.uploadKey.hashCode() * 31, 31, this.productId), 31, this.isEditReview);
        TextDTO textDTO = this.title;
        int a12 = C3532b.a((this.rating.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.isRatingFullScreen);
        Map<String, TokenizedTrackingInfo> map = this.ratingFullScreenTrackingInfo;
        int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.points;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isEditReview() {
        return this.isEditReview;
    }

    public final boolean isRatingFullScreen() {
        return this.isRatingFullScreen;
    }

    @NotNull
    public String toString() {
        String str = this.uploadKey;
        String str2 = this.productId;
        boolean z11 = this.isEditReview;
        TextDTO textDTO = this.title;
        RatingDTO ratingDTO = this.rating;
        boolean z12 = this.isRatingFullScreen;
        Map<String, TokenizedTrackingInfo> map = this.ratingFullScreenTrackingInfo;
        Integer num = this.points;
        String str3 = this.backgroundColor;
        StringBuilder d11 = C3660k.d("ReviewFormRatingDTO(uploadKey=", str, ", productId=", str2, ", isEditReview=");
        d11.append(z11);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", rating=");
        d11.append(ratingDTO);
        d11.append(", isRatingFullScreen=");
        d11.append(z12);
        d11.append(", ratingFullScreenTrackingInfo=");
        d11.append(map);
        d11.append(", points=");
        d11.append(num);
        d11.append(", backgroundColor=");
        return o0.c(d11, str3, ")");
    }
}
