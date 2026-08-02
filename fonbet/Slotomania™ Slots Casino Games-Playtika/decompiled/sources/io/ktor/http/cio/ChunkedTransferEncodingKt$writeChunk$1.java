package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChunkedTransferEncoding.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}, l = {164, 165, 167, 168, 169}, m = "writeChunk", n = {"$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "size", "$this$writeChunk", "size", "size"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "I$0", "L$0", "I$0", "I$0"})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$writeChunk$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ChunkedTransferEncodingKt$writeChunk$1(Continuation<? super ChunkedTransferEncodingKt$writeChunk$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChunkedTransferEncodingKt.writeChunk(null, null, 0, 0, this);
    }
}
