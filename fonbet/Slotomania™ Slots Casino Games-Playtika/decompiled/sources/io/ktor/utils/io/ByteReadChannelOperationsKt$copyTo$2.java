package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN, 194, 201, 201}, m = "copyTo", n = {"$this$copyTo", AppsFlyerProperties.CHANNEL, "limit", "remaining", "$this$copyTo", AppsFlyerProperties.CHANNEL, "limit", "remaining", "limit", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$copyTo$2 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$copyTo$2(Continuation<? super ByteReadChannelOperationsKt$copyTo$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
    }
}
