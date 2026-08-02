package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1", f = "SurveyViewModel.kt", i = {}, l = {325, 365, 411}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SurveyViewModel$submitSurvey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $compositionAwareScope;
    final /* synthetic */ SurveyState.Content $surveyContent;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$submitSurvey$1(SurveyViewModel surveyViewModel, SurveyState.Content content, CoroutineScope coroutineScope, Continuation<? super SurveyViewModel$submitSurvey$1> continuation) {
        super(2, continuation);
        this.this$0 = surveyViewModel;
        this.$surveyContent = content;
        this.$compositionAwareScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurveyViewModel$submitSurvey$1(this.this$0, this.$surveyContent, this.$compositionAwareScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurveyViewModel$submitSurvey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a2, code lost:
    
        if (r15 == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01db, code lost:
    
        if (r0.getType() == io.intercom.android.sdk.survey.model.SurveyData.StepType.CONTENT) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x031b, code lost:
    
        if (r15 == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0062, code lost:
    
        if (r14.this$0.getEffects().emit(io.intercom.android.sdk.survey.SurveyEffects.ExitSurvey.INSTANCE, r14) == r0) goto L116;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SurveyData.Step step;
        List list;
        SurveyData surveyData;
        SurveyData.Step step2;
        List list2;
        SurveyRepository surveyRepository;
        SurveyData surveyData2;
        List<String> emptyList;
        IntercomDataLayer intercomDataLayer;
        SurveyData surveyData3;
        SurveyData surveyData4;
        Object reportFailure;
        SurveyData.Step step3;
        List list3;
        SurveyData.Step step4;
        SurveyData surveyData5;
        SurveyState.Content buildContentState;
        List list4;
        MetricTracker metricTracker;
        SurveyData surveyData6;
        SurveyData surveyData7;
        List list5;
        SurveyData surveyData8;
        SurveyData.Step step5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        SurveyData.Step step6 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            step = this.this$0.currentStep;
            if (step == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step = null;
            }
            if (step.getType() == SurveyData.StepType.THANK_YOU) {
                this.this$0.sendDismissedEvent(CloseEventTrigger.CTA);
                intercomDataLayer = this.this$0.intercomDataLayer;
                intercomDataLayer.clearSurveyData();
                this.label = 1;
            } else {
                List<QuestionState> questions = this.$surveyContent.getQuestions();
                if (!questions.isEmpty()) {
                    List<QuestionState> list6 = questions;
                    Iterator<T> it = list6.iterator();
                    while (it.hasNext()) {
                        ((QuestionState) it.next()).validate();
                    }
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator<T> it2 = list6.iterator();
                        while (it2.hasNext()) {
                            if (!(((QuestionState) it2.next()).getValidationError() instanceof ValidationError.NoValidationError)) {
                                for (QuestionState questionState : list6) {
                                    if (!(questionState.getValidationError() instanceof ValidationError.NoValidationError)) {
                                        CoroutineScope coroutineScope = this.$compositionAwareScope;
                                        if (coroutineScope != null) {
                                            questionState.bringIntoView(coroutineScope);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                    }
                }
                this.this$0.emitLoading();
                List<QuestionState> questions2 = this.$surveyContent.getQuestions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions2, 10));
                for (QuestionState questionState2 : questions2) {
                    String id = questionState2.getQuestionModel().getId();
                    Answer answer = questionState2.getAnswer();
                    if (answer instanceof Answer.MultipleAnswer) {
                        emptyList = ((Answer.MultipleAnswer) answer).getAnswers();
                    } else if (answer instanceof Answer.NoAnswer) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (answer instanceof Answer.SingleAnswer) {
                        emptyList = CollectionsKt.listOf(((Answer.SingleAnswer) answer).getAnswer());
                    } else if (answer instanceof Answer.DateTimeAnswer) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        if (!(answer instanceof Answer.MediaAnswer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        emptyList = CollectionsKt.emptyList();
                    }
                    arrayList.add(new SubmitSurveyRequestItem(id, emptyList));
                }
                list = this.this$0.completedResponses;
                list.addAll(arrayList);
                surveyData = this.this$0.surveyData;
                String surveyProgressId = surveyData.getSurveyProgressId();
                step2 = this.this$0.currentStep;
                if (step2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step2 = null;
                }
                String id2 = step2.getId();
                list2 = this.this$0.completedResponses;
                SubmitSurveyRequest submitSurveyRequest = new SubmitSurveyRequest(surveyProgressId, id2, list2);
                surveyRepository = this.this$0.surveyRepository;
                surveyData2 = this.this$0.surveyData;
                this.label = 2;
                obj = surveyRepository.submitSurvey(submitSurveyRequest, surveyData2.getId(), this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.Success) {
            SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) ((NetworkResponse.Success) networkResponse).getBody();
            step3 = this.this$0.currentStep;
            if (step3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step3 = null;
            }
            if (step3.getType() != SurveyData.StepType.QUESTION) {
                step5 = this.this$0.currentStep;
                if (step5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step5 = null;
                }
            }
            list3 = this.this$0.completedSteps;
            step4 = this.this$0.currentStep;
            if (step4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            } else {
                step6 = step4;
            }
            list3.add(step6);
            if (submitSurveyResponse.getComplete()) {
                list4 = this.this$0.completedSteps;
                Iterator it3 = list4.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    i2 += ((SurveyData.Step) it3.next()).getQuestions().size();
                }
                metricTracker = this.this$0.metricTracker;
                surveyData6 = this.this$0.surveyData;
                String id3 = surveyData6.getId();
                surveyData7 = this.this$0.surveyData;
                String formatMetric = surveyData7.getFormatMetric();
                list5 = this.this$0.completedSteps;
                int size = list5.size();
                surveyData8 = this.this$0.surveyData;
                metricTracker.surveyCompleted(MetricTracker.Action.COMPLETED, "survey", MetricTracker.Context.FROM_CTA, id3, formatMetric, size, surveyData8.getStepCount(), i2);
            }
            this.this$0.currentStep = submitSurveyResponse.getNextStep();
            MutableStateFlow<SurveyState> state = this.this$0.getState();
            SurveyViewModel surveyViewModel = this.this$0;
            surveyData5 = surveyViewModel.surveyData;
            buildContentState = surveyViewModel.buildContentState(surveyData5);
            state.setValue(buildContentState);
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            MutableStateFlow<SurveyState> state2 = this.this$0.getState();
            SurveyUiColors surveyUiColors = this.$surveyContent.getSurveyUiColors();
            TopBarState enableDismissButton = this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton();
            final SurveyViewModel surveyViewModel2 = this.this$0;
            final SurveyState.Content content = this.$surveyContent;
            final CoroutineScope coroutineScope2 = this.$compositionAwareScope;
            state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, enableDismissButton, new Function0() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$7;
                    invokeSuspend$lambda$7 = SurveyViewModel$submitSurvey$1.invokeSuspend$lambda$7(SurveyViewModel.this, content, coroutineScope2);
                    return invokeSuspend$lambda$7;
                }
            }, 1, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.ServerError) && !(networkResponse instanceof NetworkResponse.ClientError)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$surveyContent.getSurveyUiColors(), this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton(), 1, null));
            if (networkResponse instanceof NetworkResponse.ClientError) {
                SurveyViewModel surveyViewModel3 = this.this$0;
                surveyData3 = surveyViewModel3.surveyData;
                String id4 = surveyData3.getId();
                surveyData4 = this.this$0.surveyData;
                this.label = 3;
                reportFailure = surveyViewModel3.reportFailure(id4, surveyData4.getSurveyProgressId(), this);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$7(SurveyViewModel surveyViewModel, SurveyState.Content content, CoroutineScope coroutineScope) {
        surveyViewModel.submitSurvey(content, coroutineScope);
        return Unit.INSTANCE;
    }
}
