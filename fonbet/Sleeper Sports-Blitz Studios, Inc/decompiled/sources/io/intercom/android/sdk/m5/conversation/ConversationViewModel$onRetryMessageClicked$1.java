package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ConversationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1", f = "ConversationViewModel.kt", i = {}, l = {567}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationViewModel$onRetryMessageClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Part $part;
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationViewModel$onRetryMessageClicked$1(ConversationViewModel conversationViewModel, Part part, Continuation<? super ConversationViewModel$onRetryMessageClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationViewModel;
        this.$part = part;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationViewModel$onRetryMessageClicked$1(this.this$0, this.$part, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationViewModel$onRetryMessageClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SendMessageUseCase sendMessageUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sendMessageUseCase = this.this$0.sendMessageUseCase;
            MutableStateFlow<ConversationClientState> mutableStateFlow = this.this$0.clientState;
            List<Block> blocks = this.$part.getBlocks();
            Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
            List<Block> list = blocks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Block) it.next()).toBuilder());
            }
            String uuid = this.$part.getUuid();
            Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
            this.label = 1;
            if (sendMessageUseCase.invoke(mutableStateFlow, arrayList, uuid, this) == coroutine_suspended) {
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
