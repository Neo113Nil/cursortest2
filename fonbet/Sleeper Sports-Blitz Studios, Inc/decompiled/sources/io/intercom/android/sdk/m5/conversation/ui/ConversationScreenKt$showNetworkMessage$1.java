package io.intercom.android.sdk.m5.conversation.ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt", f = "ConversationScreen.kt", i = {1}, l = {379, 387}, m = "showNetworkMessage", n = {"onDismiss"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ConversationScreenKt$showNetworkMessage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ConversationScreenKt$showNetworkMessage$1(Continuation<? super ConversationScreenKt$showNetworkMessage$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object showNetworkMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        showNetworkMessage = ConversationScreenKt.showNetworkMessage(null, null, null, null, this);
        return showNetworkMessage;
    }
}
