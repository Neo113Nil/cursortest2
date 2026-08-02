package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.ScrollState;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$32$1", f = "ConversationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationScreenKt$ConversationScreenContent$32$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $jumToBottomScrollOffset;
    final /* synthetic */ Function1<ConversationScrolledState, Unit> $onConversationScrolled;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$32$1(ScrollState scrollState, float f, Function1<? super ConversationScrolledState, Unit> function1, boolean z, boolean z2, Continuation<? super ConversationScreenKt$ConversationScreenContent$32$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$jumToBottomScrollOffset = f;
        this.$onConversationScrolled = function1;
        this.$isLandscape = z;
        this.$isLargeFont = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$32$1(this.$scrollState, this.$jumToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$32$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$scrollState.getMaxValue() - this.$scrollState.getValue() > this.$jumToBottomScrollOffset) {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(true, this.$scrollState.getMaxValue(), this.$isLandscape, this.$isLargeFont, 0));
        } else {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(false, this.$scrollState.getMaxValue(), this.$isLandscape, this.$isLargeFont, 0));
        }
        return Unit.INSTANCE;
    }
}
