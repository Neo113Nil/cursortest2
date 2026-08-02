package io.ktor.websocket.serialization;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebsocketChannelSerialization.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0}, l = {Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, 62}, m = "sendSerializedBase", n = {"$this$sendSerializedBase"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class WebsocketChannelSerializationKt$sendSerializedBase$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WebsocketChannelSerializationKt$sendSerializedBase$2(Continuation<? super WebsocketChannelSerializationKt$sendSerializedBase$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WebsocketChannelSerializationKt.sendSerializedBase(null, null, null, null, null, this);
    }
}
