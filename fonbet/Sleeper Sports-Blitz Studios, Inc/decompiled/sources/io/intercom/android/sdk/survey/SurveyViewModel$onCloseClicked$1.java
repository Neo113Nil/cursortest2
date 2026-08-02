package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.survey.SurveyEffects;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1", f = "SurveyViewModel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SurveyViewModel$onCloseClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CloseEventTrigger $triggerType;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$onCloseClicked$1(SurveyViewModel surveyViewModel, CloseEventTrigger closeEventTrigger, Continuation<? super SurveyViewModel$onCloseClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = surveyViewModel;
        this.$triggerType = closeEventTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurveyViewModel$onCloseClicked$1(this.this$0, this.$triggerType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurveyViewModel$onCloseClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntercomDataLayer intercomDataLayer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendDismissedEvent(this.$triggerType);
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            intercomDataLayer = this.this$0.intercomDataLayer;
            intercomDataLayer.clearSurveyData();
            this.label = 1;
            if (this.this$0.getEffects().emit(SurveyEffects.ExitSurvey.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1", f = "SurveyViewModel.kt", i = {}, l = {275, 280}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SurveyViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SurveyViewModel surveyViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = surveyViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r7 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        
            if (r7 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SurveyData surveyData;
            SurveyData.Step step;
            SurveyRepository surveyRepository;
            SurveyData surveyData2;
            SurveyData surveyData3;
            SurveyData surveyData4;
            SurveyData surveyData5;
            Object reportFailure;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (((NetworkResponse) obj) instanceof NetworkResponse.ClientError) {
                    SurveyViewModel surveyViewModel = this.this$0;
                    surveyData4 = surveyViewModel.surveyData;
                    String id = surveyData4.getId();
                    surveyData5 = this.this$0.surveyData;
                    this.label = 2;
                    reportFailure = surveyViewModel.reportFailure(id, surveyData5.getSurveyProgressId(), this);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            surveyData = this.this$0.surveyData;
            if (!surveyData.getSteps().isEmpty()) {
                step = this.this$0.currentStep;
                if (step == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step = null;
                }
                if (step.getType() != SurveyData.StepType.THANK_YOU) {
                    surveyRepository = this.this$0.surveyRepository;
                    surveyData2 = this.this$0.surveyData;
                    String id2 = surveyData2.getId();
                    surveyData3 = this.this$0.surveyData;
                    this.label = 1;
                    obj = surveyRepository.dismissSurvey(id2, surveyData3.getSurveyProgressId(), this);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
