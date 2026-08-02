package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import Kk.c;
import RZ.b;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.ugc.view.text.clickable.ClickableTextVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.domain.ReviewFormHeaderV2Model;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.Unsupported;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0001\u0018\u0000 !2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001!B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/domain/ReviewFormHeaderV2Model;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "toClickableTextVo", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;)Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "mapSubmitOnBackConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "mapPlaceholdersSheetConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "", "cachedRating", "updateByCachedValueIfNeeded", "(Lru/ozon/uni/atoms/data/rating/RatingDTO;F)Lru/ozon/uni/atoms/data/rating/RatingDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/domain/ReviewFormHeaderV2Model;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormHeaderV2Mapper implements Function2<ReviewFormHeaderV2Model, d, List<? extends ReviewFormHeaderV2VO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;
    public static final int $stable = 8;

    public ReviewFormHeaderV2Mapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    private final ReviewFormHeaderVO.PlaceholdersSheetConfigVO mapPlaceholdersSheetConfig(ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
        return new ReviewFormHeaderVO.PlaceholdersSheetConfigVO(AtomActionMapperKt.toAtomAction(placeholdersSheetConfig.getAction(), Unsupported.INSTANCE.getTrackingInfo()), placeholdersSheetConfig.getMinRating());
    }

    private final ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig(ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO) {
        int minRating = submitOnBackConfigDTO.getMinRating();
        AtomActionDTO submitAction = submitOnBackConfigDTO.getSubmitAction();
        Unsupported unsupported = Unsupported.INSTANCE;
        return new ReviewFormHeaderVO.SubmitOnBackConfigVO(minRating, AtomActionMapperKt.toAtomAction(submitAction, unsupported.getTrackingInfo()), AtomActionMapperKt.toAtomAction(submitOnBackConfigDTO.getBackAction(), unsupported.getTrackingInfo()), submitOnBackConfigDTO.getSubmitNotification(), submitOnBackConfigDTO.getSubmitActionTrackingInfo());
    }

    private final ClickableTextVO toClickableTextVo(ReviewFormDTO.ClickableTextDTO clickableTextDTO) {
        TextDTO text = clickableTextDTO.getText();
        AtomActionDTO textAction = clickableTextDTO.getTextAction();
        return new ClickableTextVO(text, textAction != null ? AtomActionMapperKt.toAtomAction(textAction, clickableTextDTO.getText().getTrackingInfo()) : null);
    }

    private final RatingDTO updateByCachedValueIfNeeded(RatingDTO ratingDTO, float f7) {
        return RatingDTO.copy$default(ratingDTO, null, null, null, null, Intrinsics.b(ratingDTO.getTotal(), 0.0f) ? Float.valueOf(f7) : ratingDTO.getTotal(), null, null, 111, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewFormHeaderV2VO> invoke(@NotNull ReviewFormHeaderV2Model state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        String rating;
        Float v02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "headerV2");
        String j11 = widgetInfo.c().j();
        T00.a b11 = widgetInfo.b();
        t tVar = null;
        b g10 = b11 != null ? b11.g() : null;
        this.reviewFormRepository.setupReviewFormRepository(state.getProductId(), state.getIsEditReview());
        ReviewFormData formData = this.reviewFormRepository.getFormData();
        RatingDTO updateByCachedValueIfNeeded = updateByCachedValueIfNeeded(state.getRating().getRating(), (formData == null || (rating = formData.getRating()) == null || (v02 = h.v0(rating)) == null) ? 0.0f : v02.floatValue());
        ProductMediaDTO productImage = state.getProductImage();
        ClickableTextVO clickableTextVo = toClickableTextVo(state.getTitle());
        ReviewFormDTO.ClickableTextDTO subtitle = state.getSubtitle();
        ClickableTextVO clickableTextVo2 = subtitle != null ? toClickableTextVo(subtitle) : null;
        ReviewFormDTO.RatingDTO copy$default = ReviewFormDTO.RatingDTO.copy$default(state.getRating(), null, null, updateByCachedValueIfNeeded, null, null, 27, null);
        IconButtonV3DTO closeButton = state.getCloseButton();
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig = state.getSubmitOnBackConfig();
        ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig = submitOnBackConfig != null ? mapSubmitOnBackConfig(submitOnBackConfig) : null;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = state.getPlaceholdersSheetConfig();
        ReviewFormHeaderVO.PlaceholdersSheetConfigVO mapPlaceholdersSheetConfig = placeholdersSheetConfig != null ? mapPlaceholdersSheetConfig(placeholdersSheetConfig) : null;
        Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo = state.getCloseReviewFormTrackingInfo();
        t b12 = closeReviewFormTrackingInfo != null ? x.b(closeReviewFormTrackingInfo, Long.valueOf(a11), null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        t b13 = trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(a11), null) : null;
        CommonControlSettings common = updateByCachedValueIfNeeded.getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = x.b(trackingInfo, Long.valueOf(a11), null);
        }
        return C7714v.a0(new ReviewFormHeaderV2VO(a11, productImage, clickableTextVo, clickableTextVo2, copy$default, closeButton, b12, mapSubmitOnBackConfig, mapPlaceholdersSheetConfig, j11, g10, b13, tVar));
    }
}
