package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1", f = "CreateTicketViewModel.kt", i = {}, l = {413}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CreateTicketViewModel$onAnswerClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnswerClickData $answerClickData;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$onAnswerClicked$1(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, Continuation<? super CreateTicketViewModel$onAnswerClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = createTicketViewModel;
        this.$answerClickData = answerClickData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTicketViewModel$onAnswerClicked$1(this.this$0, this.$answerClickData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTicketViewModel$onAnswerClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._effect;
            this.label = 1;
            if (mutableSharedFlow.emit(new CreateTicketViewModel.TicketSideEffect.AnswerClicked(this.$answerClickData), this) == coroutine_suspended) {
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
}
