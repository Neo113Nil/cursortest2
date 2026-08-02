package ru.ozon.app.android.ugc.widgets.reviewFormMobile.core;

import Kk.c;
import Tc.b;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.HidableIndicatorVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.HigherPointsTerms;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous.ReviewFormAnonymousDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.domain.ReviewFormHeaderV2Model;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u00020\u001e*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u001a*\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020,*\u00020+2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/core/ReviewFormMobileParser;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;", "getNoUiParams", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "headerV2", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;", "reviewFormDTO", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;", "getReviewFormHeaderDTO", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;", "toRatingDTO", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingDTO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeReviewFormTrackingInfo", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/domain/ReviewFormHeaderV2Model;", "toHeaderV2Model", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/domain/ReviewFormHeaderV2Model;", "", "isModal", "mapFormItems", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Z)Ljava/util/List;", "mapReviewFormItem", "(Ljava/lang/Object;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Z)Ljava/lang/Object;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "collectPointsMap", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;)Ljava/util/Map;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO;Z)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormMobileParser implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReviewFormMobileParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final Map<ReviewFormPointsProgressDTO.FieldType, Integer> collectPointsMap(ReviewFormDTO reviewFormDTO) {
        Integer points;
        Integer points2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        linkedHashMap.put(ReviewFormPointsProgressDTO.FieldType.EMPTY, 0);
        if (reviewFormDTO.getDetailedReviewConfig() != null) {
            linkedHashMap.put(ReviewFormPointsProgressDTO.FieldType.DETAILED_REVIEW, Integer.valueOf(reviewFormDTO.getDetailedReviewConfig().getPoints()));
        }
        for (Object obj : reviewFormDTO.getItems()) {
            if (obj instanceof ReviewFormFieldDTO.CommentDTO) {
                ReviewFormPointsProgressDTO.FieldType fieldType = ReviewFormPointsProgressDTO.FieldType.COMMENT;
                Integer points3 = ((ReviewFormFieldDTO.CommentDTO) obj).getPoints();
                linkedHashMap.put(fieldType, Integer.valueOf(points3 != null ? points3.intValue() : 0));
            } else if (obj instanceof MediaPickerDTO) {
                ReviewFormPointsProgressDTO.FieldType fieldType2 = ReviewFormPointsProgressDTO.FieldType.PHOTO;
                MediaPickerDTO mediaPickerDTO = (MediaPickerDTO) obj;
                Integer points4 = mediaPickerDTO.getPhotoConfig().getPoints();
                linkedHashMap.put(fieldType2, Integer.valueOf(points4 != null ? points4.intValue() : 0));
                ReviewFormPointsProgressDTO.FieldType fieldType3 = ReviewFormPointsProgressDTO.FieldType.VIDEO;
                MediaPickerDTO.VideoConfig videoConfig = mediaPickerDTO.getVideoConfig();
                linkedHashMap.put(fieldType3, Integer.valueOf((videoConfig == null || (points2 = videoConfig.getPoints()) == null) ? 0 : points2.intValue()));
            }
        }
        ReviewFormPointsProgressDTO.FieldType fieldType4 = ReviewFormPointsProgressDTO.FieldType.RATING;
        ReviewFormDTO.RatingDTO rating = reviewFormDTO.getRating();
        if (rating != null && (points = rating.getPoints()) != null) {
            i11 = points.intValue();
        }
        linkedHashMap.put(fieldType4, Integer.valueOf(i11));
        return linkedHashMap;
    }

    private final ReviewFormNoUiModel getNoUiParams(ReviewFormDTO reviewFormDTO, ReviewFormDTO.HeaderDTO headerDTO) {
        return new ReviewFormNoUiModel(headerDTO.getSubmitOnBackConfig(), reviewFormDTO.getCloseReviewFormTrackingInfo(), headerDTO.getPlaceholdersSheetConfig());
    }

    private final ReviewFormHeaderDTO getReviewFormHeaderDTO(ReviewFormDTO.HeaderDTO headerDTO, ReviewFormDTO reviewFormDTO) {
        return new ReviewFormHeaderDTO(headerDTO.getBackButton(), headerDTO.getProductCell(), headerDTO.getSubmitOnBackConfig(), reviewFormDTO.getCloseReviewFormTrackingInfo(), reviewFormDTO.getTrackingInfo(), headerDTO.getPlaceholdersSheetConfig(), headerDTO.getBackgroundColor());
    }

    private final List<Object> mapFormItems(List<? extends Object> list, ReviewFormDTO reviewFormDTO, boolean z11) {
        b builder = C7714v.B();
        for (Object obj : list) {
            if ((obj instanceof ReviewFormFieldDTO) && Intrinsics.d(((ReviewFormFieldDTO) obj).isHidden(), Boolean.TRUE)) {
                builder.add(new HidableIndicatorVO(obj.hashCode()));
            }
            builder.add(mapReviewFormItem(obj, reviewFormDTO, z11));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final Object mapReviewFormItem(Object obj, ReviewFormDTO reviewFormDTO, boolean z11) {
        if (obj instanceof ReviewFormFieldDTO.QuestionsDTO) {
            ReviewFormFieldDTO.QuestionsDTO questionsDTO = (ReviewFormFieldDTO.QuestionsDTO) obj;
            return new ReviewFormQuestionsDTO(questionsDTO.getUploadKey(), reviewFormDTO.getReviewUuid() != null, questionsDTO.getQuestions());
        }
        if (!(obj instanceof ReviewFormFieldDTO.AnonymousDTO)) {
            return obj instanceof ReviewFormFieldDTO.CommentDTO ? toVO((ReviewFormFieldDTO.CommentDTO) obj, reviewFormDTO, z11) : obj instanceof ReviewFormFieldDTO.CellItemDTO ? ((ReviewFormFieldDTO.CellItemDTO) obj).getCell() : obj instanceof ReviewFormFieldDTO.DisclaimerItemDTO ? ((ReviewFormFieldDTO.DisclaimerItemDTO) obj).getDisclaimer() : obj instanceof ReviewFormFieldDTO.PlainTextItemDTO ? ((ReviewFormFieldDTO.PlainTextItemDTO) obj).getPlainText() : obj instanceof ReviewFormFieldDTO.SeparatorItemDTO ? ((ReviewFormFieldDTO.SeparatorItemDTO) obj).getSeparator() : obj instanceof ReviewFormFieldDTO.IslandSeparatorItemDTO ? ((ReviewFormFieldDTO.IslandSeparatorItemDTO) obj).getIslandSeparator() : obj;
        }
        ReviewFormFieldDTO.AnonymousDTO anonymousDTO = (ReviewFormFieldDTO.AnonymousDTO) obj;
        return new ReviewFormAnonymousDTO(anonymousDTO.getUploadKey(), anonymousDTO.getAnonymousCell(), reviewFormDTO.getReviewUuid() != null);
    }

    private final ReviewFormHeaderV2Model toHeaderV2Model(ReviewFormDTO.HeaderV2DTO headerV2DTO, ReviewFormDTO reviewFormDTO, Map<String, TokenizedTrackingInfo> map) {
        return new ReviewFormHeaderV2Model(reviewFormDTO.getProductId(), reviewFormDTO.getReviewUuid() != null, headerV2DTO.getProductImage(), headerV2DTO.getTitle(), headerV2DTO.getSubtitle(), headerV2DTO.getRating(), headerV2DTO.getCloseButton(), map, reviewFormDTO.getTrackingInfo(), headerV2DTO.getSubmitOnBackConfig(), headerV2DTO.getPlaceholdersSheetConfig());
    }

    private final ReviewFormRatingDTO toRatingDTO(ReviewFormDTO.RatingDTO ratingDTO, ReviewFormDTO reviewFormDTO) {
        return new ReviewFormRatingDTO(ratingDTO.getUploadKey(), reviewFormDTO.getProductId(), reviewFormDTO.getReviewUuid() != null, ratingDTO.getTitle(), ratingDTO.getRating(), reviewFormDTO.isRatingFullScreen(), reviewFormDTO.getRatingFullScreenTrackingInfo(), ratingDTO.getPoints(), ratingDTO.getBackgroundColor());
    }

    private final ReviewFormCommentVO toVO(ReviewFormFieldDTO.CommentDTO commentDTO, ReviewFormDTO reviewFormDTO, boolean z11) {
        ArrayList arrayList;
        long a11 = c.a(reviewFormDTO.getProductId(), "comment");
        String uploadKey = commentDTO.getUploadKey();
        String placeholder = commentDTO.getPlaceholder();
        String value = commentDTO.getValue();
        List<ReviewFormFieldDTO.CommentDTO.HintDTO> hints = commentDTO.getHints();
        if (hints != null) {
            List<ReviewFormFieldDTO.CommentDTO.HintDTO> list = hints;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ReviewFormFieldDTO.CommentDTO.HintDTO hintDTO : list) {
                int minInputLength = hintDTO.getMinInputLength();
                String obj = hintDTO.getText().getText().toString();
                Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                String textColor = hintDTO.getText().getTextColor();
                if (textColor == null) {
                    textColor = UniColors.TEXT_SECONDARY.getToken();
                }
                Map<String, TokenizedTrackingInfo> hintTracking = hintDTO.getHintTracking();
                arrayList.add(new ReviewFormCommentVO.HintVO(minInputLength, obj, textColor, hintTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(hintTracking, Long.valueOf(a11), null, 2, null) : null));
            }
        } else {
            arrayList = null;
        }
        ReviewFormCommentVO.SuggestsVO suggestsVO = (commentDTO.getSuggests() == null || commentDTO.getSuggests().getPlaceholders().isEmpty()) ? null : new ReviewFormCommentVO.SuggestsVO(commentDTO.getSuggests().getPlaceholders(), commentDTO.getSuggests().getDelay());
        int maxLines = commentDTO.getMaxLines();
        int minLines = commentDTO.getMinLines();
        int maxInputLength = commentDTO.getMaxInputLength();
        IconButtonV3DTO mediaPickerButton = commentDTO.getMediaPickerButton();
        Boolean isSticky = reviewFormDTO.getFooter().isSticky();
        boolean booleanValue = isSticky != null ? isSticky.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> trackingInfo = commentDTO.getTrackingInfo();
        return new ReviewFormCommentVO(a11, uploadKey, placeholder, value, arrayList, suggestsVO, maxLines, minLines, maxInputLength, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null, mediaPickerButton, booleanValue, false, z11, true);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        JsonParser jsonParser = this.jsonDeserializer;
        String b11 = state.b();
        if (b11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ReviewFormDTO reviewFormDTO = (ReviewFormDTO) jsonParser.fromJson(b11, ReviewFormDTO.class);
        String c11 = state.a().c();
        boolean t2 = c11 != null ? h.t(c11, "modal", false) : false;
        ArrayList arrayList = new ArrayList();
        ReviewFormDTO.HeaderV2DTO headerV2 = reviewFormDTO.getHeaderV2();
        if (headerV2 != null) {
            arrayList.add(toHeaderV2Model(headerV2, reviewFormDTO, reviewFormDTO.getCloseReviewFormTrackingInfo()));
            arrayList.add(getNoUiParams(reviewFormDTO, headerV2));
        } else {
            ReviewFormDTO.HeaderDTO header = reviewFormDTO.getHeader();
            if (header != null) {
                arrayList.add(getReviewFormHeaderDTO(header, reviewFormDTO));
                arrayList.add(getNoUiParams(reviewFormDTO, header));
            }
            ReviewFormDTO.RatingDTO rating = reviewFormDTO.getRating();
            if (rating != null) {
                arrayList.add(toRatingDTO(rating, reviewFormDTO));
            }
        }
        arrayList.addAll(mapFormItems(reviewFormDTO.getItems(), reviewFormDTO, t2));
        ReviewFormDTO.Footer.PointsProgress pointsProgress = reviewFormDTO.getFooter().getPointsProgress();
        if (pointsProgress != null) {
            CellDTO pointsCell = pointsProgress.getPointsCell();
            String progressBarColor = pointsProgress.getProgressBarColor();
            Map<ReviewFormPointsProgressDTO.FieldType, Integer> collectPointsMap = collectPointsMap(reviewFormDTO);
            ReviewFormDTO.DetailedReviewConfig detailedReviewConfig = reviewFormDTO.getDetailedReviewConfig();
            Integer valueOf = detailedReviewConfig != null ? Integer.valueOf(detailedReviewConfig.getCommentTextCount()) : null;
            ReviewFormDTO.DetailedReviewConfig detailedReviewConfig2 = reviewFormDTO.getDetailedReviewConfig();
            arrayList.add(new ReviewFormPointsProgressDTO(pointsCell, progressBarColor, collectPointsMap, new HigherPointsTerms(detailedReviewConfig2 != null ? Integer.valueOf(detailedReviewConfig2.getMediaCount()) : null, valueOf)));
        }
        ReviewFormDTO.Footer.FooterCellDTO footerCell = reviewFormDTO.getFooter().getFooterCell();
        if (footerCell != null) {
            arrayList.add(footerCell);
        }
        String productId = reviewFormDTO.getProductId();
        ButtonV3DTO submitButton = reviewFormDTO.getFooter().getSubmitButton();
        Boolean isBorderHidden = reviewFormDTO.getFooter().isBorderHidden();
        arrayList.add(new ReviewFormSubmitButtonDTO(productId, submitButton, isBorderHidden != null ? isBorderHidden.booleanValue() : false, t2, reviewFormDTO.getFooter().getSubmitErrorTrackingInfo()));
        return arrayList;
    }

    private final ReviewFormNoUiModel getNoUiParams(ReviewFormDTO reviewFormDTO, ReviewFormDTO.HeaderV2DTO headerV2DTO) {
        return new ReviewFormNoUiModel(headerV2DTO.getSubmitOnBackConfig(), reviewFormDTO.getCloseReviewFormTrackingInfo(), headerV2DTO.getPlaceholdersSheetConfig());
    }
}
