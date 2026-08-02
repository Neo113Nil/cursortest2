package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MessageComposer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$10", f = "MessageComposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class MessageComposerKt$MessageComposer$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ State<KeyboardState> $keyboardAsState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageComposerKt$MessageComposer$10(FocusManager focusManager, State<KeyboardState> state, Continuation<? super MessageComposerKt$MessageComposer$10> continuation) {
        super(2, continuation);
        this.$focusManager = focusManager;
        this.$keyboardAsState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageComposerKt$MessageComposer$10(this.$focusManager, this.$keyboardAsState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageComposerKt$MessageComposer$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KeyboardState MessageComposer$lambda$23;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MessageComposer$lambda$23 = MessageComposerKt.MessageComposer$lambda$23(this.$keyboardAsState$delegate);
            if (MessageComposer$lambda$23.isDismissed()) {
                FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
