package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OpenConversationUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase", f = "OpenConversationUseCase.kt", i = {0, 0, 0, 1, 1}, l = {24, 40, 44}, m = "invoke", n = {"this", "clientStateFlow", "getConversationReason", "this", "clientStateFlow"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class OpenConversationUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpenConversationUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenConversationUseCase$invoke$1(OpenConversationUseCase openConversationUseCase, Continuation<? super OpenConversationUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = openConversationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
