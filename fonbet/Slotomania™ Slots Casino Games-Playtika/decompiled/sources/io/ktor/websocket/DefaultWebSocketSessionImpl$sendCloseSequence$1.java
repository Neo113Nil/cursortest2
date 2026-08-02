package io.ktor.websocket;

import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0}, l = {315}, m = "sendCloseSequence", n = {SentryEvent.JsonKeys.EXCEPTION, "reasonToSend"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class DefaultWebSocketSessionImpl$sendCloseSequence$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$sendCloseSequence$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, Continuation<? super DefaultWebSocketSessionImpl$sendCloseSequence$1> continuation) {
        super(continuation);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendCloseSequence;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendCloseSequence = this.this$0.sendCloseSequence(null, null, this);
        return sendCloseSequence;
    }
}
