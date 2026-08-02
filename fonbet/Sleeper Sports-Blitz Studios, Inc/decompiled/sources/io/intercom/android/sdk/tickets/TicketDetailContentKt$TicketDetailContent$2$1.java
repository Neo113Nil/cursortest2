package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TicketDetailContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1", f = "TicketDetailContent.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class TicketDetailContentKt$TicketDetailContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<CardState> $cardState$delegate;
    final /* synthetic */ MutableState<Float> $submissionCardAlpha$delegate;
    final /* synthetic */ MutableState<Dp> $submissionCardOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketDetailContentKt$TicketDetailContent$2$1(MutableState<Dp> mutableState, MutableState<Float> mutableState2, MutableState<CardState> mutableState3, Continuation<? super TicketDetailContentKt$TicketDetailContent$2$1> continuation) {
        super(2, continuation);
        this.$submissionCardOffset$delegate = mutableState;
        this.$submissionCardAlpha$delegate = mutableState2;
        this.$cardState$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TicketDetailContentKt$TicketDetailContent$2$1(this.$submissionCardOffset$delegate, this.$submissionCardAlpha$delegate, this.$cardState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TicketDetailContentKt$TicketDetailContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TicketDetailContentKt.TicketDetailContent$lambda$7(this.$submissionCardOffset$delegate, Dp.m8798constructorimpl(0));
            TicketDetailContentKt.TicketDetailContent$lambda$10(this.$submissionCardAlpha$delegate, 1.0f);
            this.label = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$cardState$delegate.setValue(CardState.TimelineCard);
        return Unit.INSTANCE;
    }
}
