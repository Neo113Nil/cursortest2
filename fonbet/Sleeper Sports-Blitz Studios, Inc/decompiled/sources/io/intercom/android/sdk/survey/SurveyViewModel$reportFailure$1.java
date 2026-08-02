package io.intercom.android.sdk.survey;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SurveyViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel", f = "SurveyViewModel.kt", i = {}, l = {459}, m = "reportFailure", n = {}, s = {})
/* loaded from: classes9.dex */
final class SurveyViewModel$reportFailure$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$reportFailure$1(SurveyViewModel surveyViewModel, Continuation<? super SurveyViewModel$reportFailure$1> continuation) {
        super(continuation);
        this.this$0 = surveyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object reportFailure;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        reportFailure = this.this$0.reportFailure(null, null, this);
        return reportFailure;
    }
}
