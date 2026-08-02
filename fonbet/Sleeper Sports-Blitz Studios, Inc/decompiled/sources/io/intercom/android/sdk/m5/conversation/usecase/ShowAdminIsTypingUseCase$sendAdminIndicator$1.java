package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ShowAdminIsTypingUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase", f = "ShowAdminIsTypingUseCase.kt", i = {0}, l = {49}, m = "sendAdminIndicator", n = {"clientStateFlow"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ShowAdminIsTypingUseCase$sendAdminIndicator$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowAdminIsTypingUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowAdminIsTypingUseCase$sendAdminIndicator$1(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, Continuation<? super ShowAdminIsTypingUseCase$sendAdminIndicator$1> continuation) {
        super(continuation);
        this.this$0 = showAdminIsTypingUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendAdminIndicator;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendAdminIndicator = this.this$0.sendAdminIndicator(null, null, false, false, this);
        return sendAdminIndicator;
    }
}
