package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {446, 461, 485}, m = "readUTF8LineTo-RRvyBJ8", n = {"$this$readUTF8LineTo_u2dRRvyBJ8", "out", "max", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "max", "lineEnding"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0", "I$1"})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$readUTF8LineTo$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$readUTF8LineTo$2(Continuation<? super ByteReadChannelOperationsKt$readUTF8LineTo$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.m11038readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
    }
}
