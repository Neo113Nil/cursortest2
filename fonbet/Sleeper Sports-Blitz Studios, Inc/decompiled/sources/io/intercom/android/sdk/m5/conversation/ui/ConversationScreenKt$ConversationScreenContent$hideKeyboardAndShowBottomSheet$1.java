package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1", f = "ConversationScreen.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ MutableState<Boolean> $openBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(MutableState<Boolean> mutableState, State<KeyboardState> state, Continuation<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1> continuation) {
        super(2, continuation);
        this.$openBottomSheet = mutableState;
        this.$keyboardAsState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(this.$openBottomSheet, this.$keyboardAsState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KeyboardState ConversationScreenContent$lambda$79;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConversationScreenContent$lambda$79 = ConversationScreenKt.ConversationScreenContent$lambda$79(this.$keyboardAsState$delegate);
            if (ConversationScreenContent$lambda$79.isVisible()) {
                this.label = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$openBottomSheet.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
