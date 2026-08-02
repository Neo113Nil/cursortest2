package io.ktor.utils.io;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {393}, m = FileUploadManager.m, n = {"$this$discard", "max", "remaining"}, s = {"L$0", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$discard$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$discard$1(Continuation<? super ByteReadChannelOperationsKt$discard$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.discard(null, 0L, this);
    }
}
