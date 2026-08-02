package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import Kk.c;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "", "cachedRating", "updateByCachedValueIfNeeded", "(Lru/ozon/uni/atoms/data/rating/RatingDTO;F)Lru/ozon/uni/atoms/data/rating/RatingDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormRatingMapper implements Function2<ReviewFormRatingDTO, d, List<? extends ReviewFormRatingVO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public ReviewFormRatingMapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    private final RatingDTO updateByCachedValueIfNeeded(RatingDTO ratingDTO, float f7) {
        return RatingDTO.copy$default(ratingDTO, null, null, null, null, Intrinsics.b(ratingDTO.getTotal(), 0.0f) ? Float.valueOf(f7) : ratingDTO.getTotal(), null, null, 111, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewFormRatingVO> invoke(@NotNull ReviewFormRatingDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        String rating;
        Float v02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "rating");
        this.reviewFormRepository.setupReviewFormRepository(state.getProductId(), state.isEditReview());
        ReviewFormData formData = this.reviewFormRepository.getFormData();
        RatingDTO updateByCachedValueIfNeeded = updateByCachedValueIfNeeded(state.getRating(), (formData == null || (rating = formData.getRating()) == null || (v02 = h.v0(rating)) == null) ? 0.0f : v02.floatValue());
        String uploadKey = state.getUploadKey();
        TextDTO title = state.getTitle();
        boolean isRatingFullScreen = !Intrinsics.b(updateByCachedValueIfNeeded.getTotal(), 0.0f) ? false : state.isRatingFullScreen();
        Map<String, TokenizedTrackingInfo> ratingFullScreenTrackingInfo = state.getRatingFullScreenTrackingInfo();
        t tVar = null;
        t tokenizedEvent$default = ratingFullScreenTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(ratingFullScreenTrackingInfo, Long.valueOf(a11), null, 2, null) : null;
        Integer points = state.getPoints();
        int intValue = points != null ? points.intValue() : 0;
        String backgroundColor = state.getBackgroundColor();
        CommonControlSettings common = updateByCachedValueIfNeeded.getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null);
        }
        return C7714v.a0(new ReviewFormRatingVO(a11, uploadKey, title, updateByCachedValueIfNeeded, isRatingFullScreen, tokenizedEvent$default, intValue, backgroundColor, tVar));
    }
}
