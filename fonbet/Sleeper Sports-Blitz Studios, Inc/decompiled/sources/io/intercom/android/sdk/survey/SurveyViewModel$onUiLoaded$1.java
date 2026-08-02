package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1", f = "SurveyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SurveyViewModel$onUiLoaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$onUiLoaded$1(SurveyViewModel surveyViewModel, Continuation<? super SurveyViewModel$onUiLoaded$1> continuation) {
        super(2, continuation);
        this.this$0 = surveyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurveyViewModel$onUiLoaded$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurveyViewModel$onUiLoaded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SurveyLaunchMode surveyLaunchMode;
        SurveyLaunchMode surveyLaunchMode2;
        SurveyLaunchMode surveyLaunchMode3;
        SurveyData surveyData;
        SurveyData surveyData2;
        MetricTracker metricTracker;
        SurveyData surveyData3;
        SurveyData surveyData4;
        SurveyData surveyData5;
        SurveyData surveyData6;
        SurveyState.Content buildContentState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            surveyLaunchMode = this.this$0.launchMode;
            if (surveyLaunchMode instanceof SurveyLaunchMode.Automatic) {
                SurveyViewModel surveyViewModel = this.this$0;
                surveyLaunchMode3 = surveyViewModel.launchMode;
                surveyViewModel.surveyData = ((SurveyLaunchMode.Automatic) surveyLaunchMode3).getSurveyData();
                surveyData = this.this$0.surveyData;
                if (!surveyData.getSteps().isEmpty()) {
                    metricTracker = this.this$0.metricTracker;
                    surveyData3 = this.this$0.surveyData;
                    String id = surveyData3.getId();
                    surveyData4 = this.this$0.surveyData;
                    metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_AUTOMATIC, id, surveyData4.getFormatMetric());
                    SurveyViewModel surveyViewModel2 = this.this$0;
                    surveyData5 = surveyViewModel2.surveyData;
                    surveyViewModel2.currentStep = (SurveyData.Step) CollectionsKt.first((List) surveyData5.getSteps());
                    MutableStateFlow<SurveyState> state = this.this$0.getState();
                    SurveyViewModel surveyViewModel3 = this.this$0;
                    surveyData6 = surveyViewModel3.surveyData;
                    buildContentState = surveyViewModel3.buildContentState(surveyData6);
                    state.setValue(buildContentState);
                } else {
                    surveyData2 = this.this$0.surveyData;
                    SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyData2.getCustomization());
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, surveyUiColors, new TopBarState.NoTopBarState(true, surveyUiColors, null, 4, null), 1, null));
                }
            } else if (surveyLaunchMode instanceof SurveyLaunchMode.Programmatic) {
                SurveyViewModel surveyViewModel4 = this.this$0;
                surveyLaunchMode2 = surveyViewModel4.launchMode;
                surveyViewModel4.fetchAndShowSurvey(((SurveyLaunchMode.Programmatic) surveyLaunchMode2).getSurveyId());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
