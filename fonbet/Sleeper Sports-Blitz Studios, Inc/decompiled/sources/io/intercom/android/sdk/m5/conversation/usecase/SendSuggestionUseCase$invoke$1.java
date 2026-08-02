package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendSuggestionUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase", f = "SendSuggestionUseCase.kt", i = {0, 0}, l = {58}, m = "invoke", n = {"this", "clientStateFlow"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class SendSuggestionUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendSuggestionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendSuggestionUseCase$invoke$1(SendSuggestionUseCase sendSuggestionUseCase, Continuation<? super SendSuggestionUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = sendSuggestionUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
