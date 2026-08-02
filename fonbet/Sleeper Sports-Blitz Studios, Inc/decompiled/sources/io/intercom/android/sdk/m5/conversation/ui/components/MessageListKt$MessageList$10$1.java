package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1", f = "MessageList.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class MessageListKt$MessageList$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ MutableState<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$10$1(ScrollState scrollState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super MessageListKt$MessageList$10$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$autoScrollEnabled$delegate = mutableState;
        this.$hasUserScrolled$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListKt$MessageList$10$1(this.$scrollState, this.$autoScrollEnabled$delegate, this.$hasUserScrolled$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListKt$MessageList$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ScrollState scrollState = this.$scrollState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int value;
                    value = ScrollState.this.getValue();
                    return Integer.valueOf(value);
                }
            });
            final ScrollState scrollState2 = this.$scrollState;
            final MutableState<Boolean> mutableState = this.$autoScrollEnabled$delegate;
            final MutableState<Boolean> mutableState2 = this.$hasUserScrolled$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    boolean MessageList$lambda$20;
                    MessageListKt.MessageList$lambda$18(mutableState, i2 == ScrollState.this.getMaxValue());
                    MessageList$lambda$20 = MessageListKt.MessageList$lambda$20(mutableState2);
                    if (MessageList$lambda$20 && i2 == ScrollState.this.getMaxValue()) {
                        MessageListKt.MessageList$lambda$21(mutableState2, false);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
