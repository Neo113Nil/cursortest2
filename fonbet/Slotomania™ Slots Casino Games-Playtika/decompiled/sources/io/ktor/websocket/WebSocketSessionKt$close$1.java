package io.ktor.websocket;

import androidx.compose.material.TextFieldImplKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {TextFieldImplKt.AnimationDuration, 151}, m = "close", n = {"$this$close"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class WebSocketSessionKt$close$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WebSocketSessionKt$close$1(Continuation<? super WebSocketSessionKt$close$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WebSocketSessionKt.close((WebSocketSession) null, (CloseReason) null, this);
    }
}
