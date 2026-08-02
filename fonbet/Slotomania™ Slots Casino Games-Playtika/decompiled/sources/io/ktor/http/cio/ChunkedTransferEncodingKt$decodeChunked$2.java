package io.ktor.http.cio;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChunkedTransferEncoding.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {72, 81, 82, 87, 101, 101}, m = "decodeChunked", n = {"input", "out", "chunkSizeBuffer", "totalBytesCopied", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$decodeChunked$2 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ChunkedTransferEncodingKt$decodeChunked$2(Continuation<? super ChunkedTransferEncodingKt$decodeChunked$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChunkedTransferEncodingKt.decodeChunked((ByteReadChannel) null, (ByteWriteChannel) null, this);
    }
}
