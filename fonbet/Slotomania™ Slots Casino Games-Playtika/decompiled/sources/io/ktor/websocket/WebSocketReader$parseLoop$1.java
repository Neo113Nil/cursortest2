package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketReader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 1}, l = {97, 105}, m = "parseLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class WebSocketReader$parseLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$parseLoop$1(WebSocketReader webSocketReader, Continuation<? super WebSocketReader$parseLoop$1> continuation) {
        super(continuation);
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parseLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parseLoop = this.this$0.parseLoop(null, this);
        return parseLoop;
    }
}
