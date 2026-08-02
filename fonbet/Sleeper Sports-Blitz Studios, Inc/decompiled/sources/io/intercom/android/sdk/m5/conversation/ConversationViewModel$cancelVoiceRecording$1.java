package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase;
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
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ConversationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$cancelVoiceRecording$1", f = "ConversationViewModel.kt", i = {}, l = {661}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationViewModel$cancelVoiceRecording$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationViewModel$cancelVoiceRecording$1(ConversationViewModel conversationViewModel, Continuation<? super ConversationViewModel$cancelVoiceRecording$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationViewModel$cancelVoiceRecording$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationViewModel$cancelVoiceRecording$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VoiceTranscriptionUseCase voiceTranscriptionUseCase;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            voiceTranscriptionUseCase = this.this$0.voiceTranscriptionUseCase;
            MutableStateFlow<ConversationClientState> mutableStateFlow = this.this$0.clientState;
            mutableSharedFlow = this.this$0._uiEffect;
            this.label = 1;
            if (voiceTranscriptionUseCase.cancelRecording(mutableStateFlow, mutableSharedFlow, this) == coroutine_suspended) {
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
