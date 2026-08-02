package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {171, TsExtractor.TS_STREAM_TYPE_AC4, 179, 179}, m = "copyTo", n = {"$this$copyTo", AppsFlyerProperties.CHANNEL, "result", "$this$copyTo", AppsFlyerProperties.CHANNEL, "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$copyTo$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$copyTo$1(Continuation<? super ByteReadChannelOperationsKt$copyTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.copyTo(null, null, this);
    }
}
