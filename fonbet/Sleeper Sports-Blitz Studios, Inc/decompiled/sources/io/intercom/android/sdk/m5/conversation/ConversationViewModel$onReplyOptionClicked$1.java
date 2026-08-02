package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import kotlin.Metadata;
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

/* compiled from: ConversationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1", f = "ConversationViewModel.kt", i = {}, l = {433}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationViewModel$onReplyOptionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReplyOption $replyOption;
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationViewModel$onReplyOptionClicked$1(ConversationViewModel conversationViewModel, ReplyOption replyOption, Continuation<? super ConversationViewModel$onReplyOptionClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationViewModel;
        this.$replyOption = replyOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationViewModel$onReplyOptionClicked$1(this.this$0, this.$replyOption, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationViewModel$onReplyOptionClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SendQuickReplyUseCase sendQuickReplyUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Conversation conversation = ((ConversationClientState) this.this$0.clientState.getValue()).getConversation();
            if (conversation != null) {
                ConversationViewModel conversationViewModel = this.this$0;
                ReplyOption replyOption = this.$replyOption;
                sendQuickReplyUseCase = conversationViewModel.sendQuickReplyUseCase;
                MutableStateFlow<ConversationClientState> mutableStateFlow = conversationViewModel.clientState;
                Part part = (Part) CollectionsKt.last((List) conversation.parts());
                this.label = 1;
                if (sendQuickReplyUseCase.invoke(mutableStateFlow, replyOption, part, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
