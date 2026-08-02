package io.ktor.utils.io;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS_VALUE}, m = "readFloat", n = {"$this$readFloat"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$readFloat$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$readFloat$1(Continuation<? super ByteReadChannelOperationsKt$readFloat$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.readFloat(null, this);
    }
}
