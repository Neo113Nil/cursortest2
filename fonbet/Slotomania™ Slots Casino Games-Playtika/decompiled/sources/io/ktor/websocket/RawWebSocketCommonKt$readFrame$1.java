package io.ktor.websocket;

import com.safedk.android.analytics.brandsafety.m;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 246, 247, 255, 263}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", m.Y, "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", m.Y, "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", m.Y, SentryEnvelopeItemHeader.JsonKeys.LENGTH, "frameType", "flagsAndOpcode", m.Y, "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
/* loaded from: classes5.dex */
final class RawWebSocketCommonKt$readFrame$1 extends ContinuationImpl {
    byte B$0;
    byte B$1;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RawWebSocketCommonKt$readFrame$1(Continuation<? super RawWebSocketCommonKt$readFrame$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
    }
}
