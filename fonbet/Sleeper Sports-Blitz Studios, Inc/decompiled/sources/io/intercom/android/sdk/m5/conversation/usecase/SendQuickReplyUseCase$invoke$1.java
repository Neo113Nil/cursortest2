package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendQuickReplyUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase", f = "SendQuickReplyUseCase.kt", i = {0, 0, 0}, l = {37, 54}, m = "invoke", n = {"this", "clientStateFlow", "uuid"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class SendQuickReplyUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendQuickReplyUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendQuickReplyUseCase$invoke$1(SendQuickReplyUseCase sendQuickReplyUseCase, Continuation<? super SendQuickReplyUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = sendQuickReplyUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
