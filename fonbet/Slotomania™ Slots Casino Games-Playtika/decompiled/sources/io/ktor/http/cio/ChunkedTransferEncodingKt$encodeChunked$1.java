package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ReaderScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ChunkedTransferEncoding.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1", f = "ChunkedTransferEncoding.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$encodeChunked$1 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $output;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunkedTransferEncodingKt$encodeChunked$1(ByteWriteChannel byteWriteChannel, Continuation<? super ChunkedTransferEncodingKt$encodeChunked$1> continuation) {
        super(2, continuation);
        this.$output = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChunkedTransferEncodingKt$encodeChunked$1 chunkedTransferEncodingKt$encodeChunked$1 = new ChunkedTransferEncodingKt$encodeChunked$1(this.$output, continuation);
        chunkedTransferEncodingKt$encodeChunked$1.L$0 = obj;
        return chunkedTransferEncodingKt$encodeChunked$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReaderScope readerScope, Continuation<? super Unit> continuation) {
        return ((ChunkedTransferEncodingKt$encodeChunked$1) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReaderScope readerScope = (ReaderScope) this.L$0;
            this.label = 1;
            if (ChunkedTransferEncodingKt.encodeChunked(this.$output, readerScope.getChannel(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
