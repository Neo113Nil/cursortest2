package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: SendMessageUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1", f = "SendMessageUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SendMessageUseCase$invoke$conversationId$1 extends SuspendLambda implements Function2<ConversationClientState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    SendMessageUseCase$invoke$conversationId$1(Continuation<? super SendMessageUseCase$invoke$conversationId$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(continuation);
        sendMessageUseCase$invoke$conversationId$1.L$0 = obj;
        return sendMessageUseCase$invoke$conversationId$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConversationClientState conversationClientState, Continuation<? super Boolean> continuation) {
        return ((SendMessageUseCase$invoke$conversationId$1) create(conversationClientState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((ConversationClientState) this.L$0).getConversationId() != null);
    }
}
