package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {}, l = {39}, m = "toByteArray", n = {}, s = {})
/* loaded from: classes.dex */
final class ByteReadChannelOperationsKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$toByteArray$1(Continuation<? super ByteReadChannelOperationsKt$toByteArray$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.toByteArray(null, this);
    }
}
