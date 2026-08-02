package io.ktor.network.sockets;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CIOReader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "readFrom", n = {"count"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class CIOReaderKt$readFrom$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    CIOReaderKt$readFrom$1(Continuation<? super CIOReaderKt$readFrom$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readFrom;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readFrom = CIOReaderKt.readFrom(null, null, this);
        return readFrom;
    }
}
