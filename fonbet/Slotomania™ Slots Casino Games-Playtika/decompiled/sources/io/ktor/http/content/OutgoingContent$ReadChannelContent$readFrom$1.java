package io.ktor.http.content;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.LongRange;

/* compiled from: OutgoingContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class OutgoingContent$ReadChannelContent$readFrom$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LongRange $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OutgoingContent.ReadChannelContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutgoingContent$ReadChannelContent$readFrom$1(OutgoingContent.ReadChannelContent readChannelContent, LongRange longRange, Continuation<? super OutgoingContent$ReadChannelContent$readFrom$1> continuation) {
        super(2, continuation);
        this.this$0 = readChannelContent;
        this.$range = longRange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, continuation);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r1, r3.getChannel(), r4, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ByteReadChannel readFrom;
        WriterScope writerScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WriterScope writerScope2 = (WriterScope) this.L$0;
            readFrom = this.this$0.readFrom();
            this.L$0 = writerScope2;
            this.L$1 = readFrom;
            this.label = 1;
            if (ByteReadChannelOperationsKt.discard(readFrom, this.$range.getFirst(), this) != coroutine_suspended) {
                writerScope = writerScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        readFrom = (ByteReadChannel) this.L$1;
        writerScope = (WriterScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        long last = (this.$range.getLast() - this.$range.getFirst()) + 1;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
