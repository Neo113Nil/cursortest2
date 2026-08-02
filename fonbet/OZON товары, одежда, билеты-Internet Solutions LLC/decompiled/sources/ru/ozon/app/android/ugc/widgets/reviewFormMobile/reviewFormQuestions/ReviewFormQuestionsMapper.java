package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import Kk.c;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004*\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J#\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002¢\u0006\u0004\b \u0010!J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00022\n\u0010$\u001a\u00060\u0003j\u0002`#H\u0096\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO;", "", "widgetId", "", "", "cachedQuestions", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "toVO", "(Ljava/util/List;JLjava/util/Map;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO$AnswerDTO;", "questionId", "cachedAnswerId", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "", "hasCachedValue", "isSelectedCached", "updateByCachedValueIfNeeded", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;ZZ)Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "", "getVisibleItemsCount", "(Ljava/util/List;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormQuestionsMapper implements Function2<ReviewFormQuestionsDTO, d, List<? extends ReviewFormQuestionsVO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public ReviewFormQuestionsMapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    private final int getVisibleItemsCount(List<ReviewFormQuestionsVO.QuestionVO> list) {
        List<ReviewFormQuestionsVO.QuestionVO> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 1;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List<ReviewFormQuestionsVO.QuestionVO.AnswerVO> answers = ((ReviewFormQuestionsVO.QuestionVO) it.next()).getAnswers();
            if (!(answers instanceof Collection) || !answers.isEmpty()) {
                Iterator<T> it2 = answers.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.d(((ReviewFormQuestionsVO.QuestionVO.AnswerVO) it2.next()).getTagButton().isSelected(), Boolean.TRUE)) {
                        return list.size();
                    }
                }
            }
        }
        return 1;
    }

    private final List<ReviewFormQuestionsVO.QuestionVO> toVO(List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> list, long j11, Map<String, String> map) {
        List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ReviewFormFieldDTO.QuestionsDTO.QuestionDTO questionDTO : list2) {
            long j12 = j11;
            arrayList.add(new ReviewFormQuestionsVO.QuestionVO(questionDTO.getId(), questionDTO.getTitle(), toVO(questionDTO.getAnswers(), j12, questionDTO.getId(), map != null ? map.get(questionDTO.getId()) : null)));
            j11 = j12;
        }
        return arrayList;
    }

    private final TagButtonDTO updateByCachedValueIfNeeded(TagButtonDTO tagButtonDTO, boolean z11, boolean z12) {
        TagButtonDTO copy;
        copy = tagButtonDTO.copy((r34 & 1) != 0 ? tagButtonDTO.styleType : null, (r34 & 2) != 0 ? tagButtonDTO.size : null, (r34 & 4) != 0 ? tagButtonDTO.isSelected : z11 ? Boolean.valueOf(z12) : tagButtonDTO.isSelected(), (r34 & 8) != 0 ? tagButtonDTO.isDisabled : null, (r34 & 16) != 0 ? tagButtonDTO.isClosable : null, (r34 & 32) != 0 ? tagButtonDTO.icon : null, (r34 & 64) != 0 ? tagButtonDTO.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : null, (r34 & 256) != 0 ? tagButtonDTO.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : null, (r34 & 2048) != 0 ? tagButtonDTO.closeControlSettings : null, (r34 & 4096) != 0 ? tagButtonDTO.context : null, (r34 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButtonDTO.image : null, (r34 & 32768) != 0 ? tagButtonDTO.round : null);
        return copy;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewFormQuestionsVO> invoke(@NotNull ReviewFormQuestionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "questions");
        List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO> questions = state.getQuestions();
        ReviewFormData formData = this.reviewFormRepository.getFormData();
        List<ReviewFormQuestionsVO.QuestionVO> vo = toVO(questions, a11, formData != null ? formData.getQuestions() : null);
        return C7714v.a0(new ReviewFormQuestionsVO(a11, state.getUploadKey(), vo, state.isEditReview() ? state.getQuestions().size() : getVisibleItemsCount(vo)));
    }

    private final List<ReviewFormQuestionsVO.QuestionVO.AnswerVO> toVO(List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO.AnswerDTO> list, long j11, String str, String str2) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        List<ReviewFormFieldDTO.QuestionsDTO.QuestionDTO.AnswerDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ReviewFormFieldDTO.QuestionsDTO.QuestionDTO.AnswerDTO answerDTO : list2) {
            String id2 = answerDTO.getId();
            TagButtonDTO updateByCachedValueIfNeeded = updateByCachedValueIfNeeded(answerDTO.getTagButton(), str2 != null, Intrinsics.d(str2, answerDTO.getId()));
            CommonControlSettings common = answerDTO.getTagButton().getCommon();
            t tVar = null;
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
            }
            arrayList.add(new ReviewFormQuestionsVO.QuestionVO.AnswerVO(str, id2, updateByCachedValueIfNeeded, tVar));
        }
        return arrayList;
    }
}
