package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {161}, m = "readUTF8Line", n = {"result"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$readUTF8Line$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$readUTF8Line$1(Continuation<? super ByteReadChannelOperationsKt$readUTF8Line$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.readUTF8Line(null, 0, this);
    }
}
