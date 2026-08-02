package io.intercom.android.sdk.survey;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010&\u001a\u00020%J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u001d\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00101\u001a\u000202H×\u0001J\t\u00103\u001a\u000204H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lio/intercom/android/sdk/survey/QuestionState;", "", "questionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;Lio/intercom/android/sdk/survey/SurveyUiColors;)V", "getQuestionModel", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "<set-?>", "Lio/intercom/android/sdk/survey/ValidationError;", "validationError", "getValidationError", "()Lio/intercom/android/sdk/survey/ValidationError;", "setValidationError", "(Lio/intercom/android/sdk/survey/ValidationError;)V", "validationError$delegate", "Landroidx/compose/runtime/MutableState;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "_answer", "get_answer", "()Lio/intercom/android/sdk/survey/ui/models/Answer;", "set_answer", "(Lio/intercom/android/sdk/survey/ui/models/Answer;)V", "_answer$delegate", "answer", "getAnswer", "answer$delegate", "Landroidx/compose/runtime/State;", "bringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "getBringIntoViewRequester", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "setAnswer", "", "validate", "bringIntoView", "Lkotlinx/coroutines/Job;", "compositionAwareScope", "Lkotlinx/coroutines/CoroutineScope;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QuestionState {
    public static final int $stable = 8;

    /* renamed from: _answer$delegate, reason: from kotlin metadata */
    private final MutableState _answer;

    /* renamed from: answer$delegate, reason: from kotlin metadata */
    private final State answer;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final SurveyData.Step.Question.QuestionModel questionModel;
    private final SurveyUiColors surveyUiColors;

    /* renamed from: validationError$delegate, reason: from kotlin metadata */
    private final MutableState validationError;

    /* compiled from: SurveyViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ QuestionState copy$default(QuestionState questionState, SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors, int i, Object obj) {
        if ((i & 1) != 0) {
            questionModel = questionState.questionModel;
        }
        if ((i & 2) != 0) {
            surveyUiColors = questionState.surveyUiColors;
        }
        return questionState.copy(questionModel, surveyUiColors);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    public final QuestionState copy(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        return new QuestionState(questionModel, surveyUiColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionState)) {
            return false;
        }
        QuestionState questionState = (QuestionState) other;
        return Intrinsics.areEqual(this.questionModel, questionState.questionModel) && Intrinsics.areEqual(this.surveyUiColors, questionState.surveyUiColors);
    }

    public int hashCode() {
        return (this.questionModel.hashCode() * 31) + this.surveyUiColors.hashCode();
    }

    public String toString() {
        return "QuestionState(questionModel=" + this.questionModel + ", surveyUiColors=" + this.surveyUiColors + ')';
    }

    public QuestionState(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        this.questionModel = questionModel;
        this.surveyUiColors = surveyUiColors;
        this.validationError = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ValidationError.Unchecked.INSTANCE, null, 2, null);
        this._answer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Answer.NoAnswer.InitialNoAnswer.INSTANCE, null, 2, null);
        this.answer = SnapshotStateKt.derivedStateOf(new Function0() { // from class: io.intercom.android.sdk.survey.QuestionState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Answer answer_delegate$lambda$0;
                answer_delegate$lambda$0 = QuestionState.answer_delegate$lambda$0(QuestionState.this);
                return answer_delegate$lambda$0;
            }
        });
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ValidationError getValidationError() {
        return (ValidationError) this.validationError.getValue();
    }

    public final void setValidationError(ValidationError validationError) {
        Intrinsics.checkNotNullParameter(validationError, "<set-?>");
        this.validationError.setValue(validationError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Answer get_answer() {
        return (Answer) this._answer.getValue();
    }

    private final void set_answer(Answer answer) {
        this._answer.setValue(answer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Answer answer_delegate$lambda$0(QuestionState this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.get_answer();
    }

    public final Answer getAnswer() {
        return (Answer) this.answer.getValue();
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final void setAnswer(Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        set_answer(answer);
        if (answer instanceof Answer.NoAnswer.ResetNoAnswer) {
            setValidationError(ValidationError.Unchecked.INSTANCE);
        }
    }

    public final void validate() {
        ValidationError.NoValidationError noValidationError;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        String str;
        ValidationError.ValidationStringError validationStringError;
        if ((getAnswer() instanceof Answer.NoAnswer) && this.questionModel.getIsRequired()) {
            setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null));
            return;
        }
        if (getAnswer() instanceof Answer.NoAnswer) {
            setValidationError(ValidationError.NoValidationError.INSTANCE);
            return;
        }
        SurveyData.Step.Question.QuestionModel questionModel = this.questionModel;
        if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
            if (getAnswer() instanceof Answer.MultipleAnswer) {
                Answer answer = getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer");
                int size = ((Answer.MultipleAnswer) answer).getAnswers().size();
                if (size < ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_few_responses, CollectionsKt.listOf(TuplesKt.to("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection())))));
                    return;
                } else if (size > ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_many_responses, CollectionsKt.listOf(TuplesKt.to("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection())))));
                    return;
                } else {
                    setValidationError(ValidationError.NoValidationError.INSTANCE);
                    return;
                }
            }
            return;
        }
        if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
            if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                setValidationError((((SurveyData.Step.Question.LongTextQuestionModel) questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) ? ValidationError.NoValidationError.INSTANCE : new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, CollectionsKt.listOf(TuplesKt.to("character_count", String.valueOf(((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit())))));
                return;
            }
            if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                if (getAnswer() instanceof Answer.DateTimeAnswer) {
                    Answer answer2 = getAnswer();
                    Intrinsics.checkNotNull(answer2, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer");
                    setValidationError(StringsKt.isBlank(((Answer.DateTimeAnswer) answer2).getDateAsString()) ? new ValidationError.ValidationStringError(R.string.intercom_choose_the_date, null, 2, null) : ValidationError.NoValidationError.INSTANCE);
                    return;
                }
                return;
            }
            if (!(questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel)) {
                setValidationError(ValidationError.NoValidationError.INSTANCE);
                return;
            }
            Answer answer3 = getAnswer();
            Answer.MediaAnswer mediaAnswer = answer3 instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer3 : null;
            if (mediaAnswer != null && (mediaItems = mediaAnswer.getMediaItems()) != null) {
                List<Answer.MediaAnswer.MediaItem> list = mediaItems;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                        arrayList2.add(obj);
                    }
                }
                Answer.MediaAnswer.FileUploadStatus.Error error = (Answer.MediaAnswer.FileUploadStatus.Error) CollectionsKt.firstOrNull((List) arrayList2);
                if (error != null) {
                    StringProvider.StringRes stringRes = (StringProvider.StringRes) CollectionsKt.first((List) error.getError().getErrorMessages());
                    noValidationError = new ValidationError.ValidationStringError(stringRes.getStringRes(), stringRes.getParams());
                    setValidationError(noValidationError);
                    return;
                }
            }
            noValidationError = ValidationError.NoValidationError.INSTANCE;
            setValidationError(noValidationError);
            return;
        }
        if (!((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getEnabled()) {
            validationStringError = ValidationError.NoValidationError.INSTANCE;
        } else if (((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getValidationType().ordinal()]) {
                case 1:
                case 2:
                    str = "text";
                    break;
                case 3:
                    str = "number";
                    break;
                case 4:
                    str = "email";
                    break;
                case 5:
                    str = "phone";
                    break;
                case 6:
                    str = "float";
                    break;
                case 7:
                    str = "integer";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Answer answer4 = getAnswer();
            switch (AttributeValidatorUtils.validateAttribute(answer4 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer4).getAnswer() : "", str)) {
                case 1:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_string_is_incorrect, null, 2, null);
                    break;
                case 2:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null);
                    break;
                case 3:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_number_is_incorrect, null, 2, null);
                    break;
                case 4:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_that_number_needs_a_prefix, null, 2, null);
                    break;
                case 5:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_that_number_has_too_many_digits, null, 2, null);
                    break;
                case 6:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_that_country_code_doesnt_look_quite_right, null, 2, null);
                    break;
                case 7:
                    validationStringError = new ValidationError.ValidationStringError(R.string.intercom_that_number_is_missing_a_few_digits, null, 2, null);
                    break;
                default:
                    validationStringError = ValidationError.NoValidationError.INSTANCE;
                    break;
            }
        } else {
            validationStringError = new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, CollectionsKt.listOf(TuplesKt.to("character_count", String.valueOf(((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit()))));
        }
        setValidationError(validationStringError);
    }

    public final Job bringIntoView(CoroutineScope compositionAwareScope) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(compositionAwareScope, "compositionAwareScope");
        launch$default = BuildersKt__Builders_commonKt.launch$default(compositionAwareScope, null, null, new QuestionState$bringIntoView$1(this, null), 3, null);
        return launch$default;
    }
}
