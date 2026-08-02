package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.CountedByteReadChannel;
import io.ktor.utils.io.CountedByteReadChannelKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.io.Source;
import kotlinx.io.bytestring.ByteString;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/http/cio/MultipartEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 12}, l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 211, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
/* loaded from: classes4.dex */
final class MultipartKt$parseMultipart$1 extends SuspendLambda implements Function2<ProducerScope<? super MultipartEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteString $boundaryPrefixed;
    final /* synthetic */ ByteReadChannel $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ Long $totalLength;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1(ByteReadChannel byteReadChannel, ByteString byteString, long j, Long l, Continuation<? super MultipartKt$parseMultipart$1> continuation) {
        super(2, continuation);
        this.$input = byteReadChannel;
        this.$boundaryPrefixed = byteString;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, continuation);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super MultipartEvent> producerScope, Continuation<? super Unit> continuation) {
        return ((MultipartKt$parseMultipart$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03bc, code lost:
    
        if (r7.send(new io.ktor.http.cio.MultipartEvent.Epilogue(r2), r27) == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0383, code lost:
    
        if (r7.send(new io.ktor.http.cio.MultipartEvent.Epilogue((kotlinx.io.Source) r2), r27) == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x036c, code lost:
    
        if (r2 == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x039f, code lost:
    
        if (r2 == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x033b, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(r2, r4, r27) != r0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e2, code lost:
    
        if (r5 == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0223, code lost:
    
        if (r12 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02c2, code lost:
    
        if (r2 == r0) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0296 A[Catch: all -> 0x02e3, TRY_LEAVE, TryCatch #2 {all -> 0x02e3, blocks: (B:66:0x0290, B:68:0x0296), top: B:65:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0321  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x022f -> B:42:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02c2 -> B:38:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CountedByteReadChannel counted;
        long totalBytesRead;
        ByteString byteString;
        Object readRemaining;
        ProducerScope producerScope;
        ByteString byteString2;
        Source source;
        CountedByteReadChannel countedByteReadChannel;
        long j;
        ProducerScope producerScope2;
        Object obj2;
        long j2;
        CountedByteReadChannel countedByteReadChannel2;
        ProducerScope producerScope3;
        Object obj3;
        long j3;
        ByteString byteString3;
        ProducerScope producerScope4;
        CompletableDeferred completableDeferred;
        CountedByteReadChannel countedByteReadChannel3;
        ByteChannel byteChannel;
        long j4;
        ByteChannel byteChannel2;
        ProducerScope producerScope5;
        Object obj4;
        CountedByteReadChannel countedByteReadChannel4;
        ByteString byteString4;
        long j5;
        ProducerScope producerScope6;
        ByteString byteString5;
        CountedByteReadChannel countedByteReadChannel5;
        long j6;
        HttpHeadersMap httpHeadersMap;
        HttpHeadersMap httpHeadersMap2;
        Object parsePartBodyImpl;
        ByteString byteString6;
        ByteString byteString7;
        ByteString byteString8;
        Object readRemaining2;
        Object readPacket;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        long j7 = 0;
        boolean z = false;
        int i = 1;
        HttpHeadersMap httpHeadersMap3 = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope7 = (ProducerScope) this.L$0;
                counted = CountedByteReadChannelKt.counted(this.$input);
                totalBytesRead = counted.getTotalBytesRead();
                ByteString byteString9 = this.$boundaryPrefixed;
                byteString = MultipartKt.PrefixString;
                ByteString substring$default = ByteString.substring$default(byteString9, byteString.getSize(), 0, 2, null);
                this.L$0 = producerScope7;
                this.L$1 = counted;
                this.L$2 = substring$default;
                this.J$0 = totalBytesRead;
                this.label = 1;
                readRemaining = ByteReadChannelOperationsKt.readRemaining(ByteWriteChannelOperationsKt.writer$default((CoroutineScope) producerScope7, (CoroutineContext) null, false, (Function2) new MultipartKt$parseMultipart$1$preambleData$1(substring$default, counted, null), 3, (Object) null).getChannel(), this);
                if (readRemaining != coroutine_suspended) {
                    producerScope = producerScope7;
                    byteString2 = substring$default;
                    source = (Source) readRemaining;
                    if (ByteReadPacketKt.getRemaining(source) > 0) {
                        this.L$0 = producerScope;
                        this.L$1 = counted;
                        this.L$2 = byteString2;
                        this.J$0 = totalBytesRead;
                        this.label = 2;
                        if (producerScope.send(new MultipartEvent.Preamble(source), this) != coroutine_suspended) {
                            countedByteReadChannel = counted;
                            j = totalBytesRead;
                            producerScope2 = producerScope;
                            producerScope = producerScope2;
                            totalBytesRead = j;
                            counted = countedByteReadChannel;
                        }
                    }
                    if (!counted.isClosedForRead()) {
                        byteString7 = MultipartKt.PrefixString;
                        this.L$0 = producerScope;
                        this.L$1 = counted;
                        this.L$2 = byteString2;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.J$0 = totalBytesRead;
                        this.label = 3;
                        obj2 = ByteReadChannelOperationsKt.skipIfFound(counted, byteString7, this);
                        break;
                    }
                    j5 = j7;
                    producerScope6 = producerScope;
                    byteString5 = MultipartKt.CrLf;
                    this.L$0 = producerScope6;
                    this.L$1 = counted;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 9;
                    if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                        countedByteReadChannel5 = counted;
                        j6 = totalBytesRead;
                        byteString8 = MultipartKt.CrLf;
                        this.L$0 = producerScope6;
                        this.L$1 = countedByteReadChannel5;
                        this.J$0 = j6;
                        this.label = 10;
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                long j8 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel6 = (CountedByteReadChannel) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                counted = countedByteReadChannel6;
                totalBytesRead = j8;
                readRemaining = obj;
                source = (Source) readRemaining;
                if (ByteReadPacketKt.getRemaining(source) > 0) {
                }
                if (!counted.isClosedForRead()) {
                }
                j5 = j7;
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                j = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel = (CountedByteReadChannel) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope2;
                totalBytesRead = j;
                counted = countedByteReadChannel;
                if (!counted.isClosedForRead()) {
                }
                j5 = j7;
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                long j9 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel7 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope8 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope8;
                totalBytesRead = j9;
                counted = countedByteReadChannel7;
                obj2 = obj;
                if (!((Boolean) obj2).booleanValue()) {
                    byteString6 = MultipartKt.CrLf;
                    this.L$0 = producerScope;
                    this.L$1 = counted;
                    this.L$2 = byteString2;
                    this.J$0 = totalBytesRead;
                    this.label = 4;
                    if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString6, this) != coroutine_suspended) {
                        countedByteReadChannel2 = counted;
                        j2 = totalBytesRead;
                        producerScope3 = producerScope;
                        this.L$0 = producerScope3;
                        this.L$1 = countedByteReadChannel2;
                        this.L$2 = byteString2;
                        this.J$0 = j2;
                        this.label = 5;
                        obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                        break;
                    }
                    return coroutine_suspended;
                }
                j5 = j7;
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                j2 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel2 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope3;
                this.L$1 = countedByteReadChannel2;
                this.L$2 = byteString2;
                this.J$0 = j2;
                this.label = 5;
                obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                break;
            case 5:
                j2 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel2 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                long j10 = j2;
                counted = countedByteReadChannel2;
                ProducerScope producerScope9 = producerScope3;
                totalBytesRead = j10;
                if (((Boolean) obj3).booleanValue()) {
                    producerScope = producerScope9;
                    if (!counted.isClosedForRead()) {
                    }
                    j5 = j7;
                    producerScope6 = producerScope;
                    byteString5 = MultipartKt.CrLf;
                    this.L$0 = producerScope6;
                    this.L$1 = counted;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 9;
                    if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                byteChannel = new ByteChannel(z, i, null);
                CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, i, null);
                j4 = j7;
                this.L$0 = producerScope9;
                this.L$1 = counted;
                this.L$2 = byteString2;
                this.L$3 = byteChannel;
                this.L$4 = CompletableDeferred$default;
                this.J$0 = totalBytesRead;
                this.label = 6;
                if (producerScope9.send(new MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel), this) != coroutine_suspended) {
                    byteString3 = byteString2;
                    countedByteReadChannel3 = counted;
                    j3 = totalBytesRead;
                    producerScope4 = producerScope9;
                    completableDeferred = CompletableDeferred$default;
                    try {
                        this.L$0 = producerScope4;
                        this.L$1 = countedByteReadChannel3;
                        this.L$2 = byteString3;
                        this.L$3 = byteChannel;
                        this.L$4 = completableDeferred;
                        this.J$0 = j3;
                        this.label = 7;
                        obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                    } catch (Throwable th) {
                        th = th;
                        byteChannel2 = byteChannel;
                    }
                    if (obj4 != coroutine_suspended) {
                        try {
                            ByteChannel byteChannel3 = byteChannel;
                            byteString4 = byteString3;
                            byteChannel2 = byteChannel3;
                            producerScope5 = producerScope4;
                            countedByteReadChannel4 = countedByteReadChannel3;
                            if (completableDeferred.complete(httpHeadersMap2)) {
                                httpHeadersMap = httpHeadersMap2;
                                httpHeadersMap.release();
                                throw new CancellationException("Multipart processing has been cancelled");
                            }
                            try {
                                ByteString byteString10 = this.$boundaryPrefixed;
                                CountedByteReadChannel countedByteReadChannel8 = countedByteReadChannel4;
                                ByteChannel byteChannel4 = byteChannel2;
                                long j11 = this.$maxPartSize;
                                MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = this;
                                this.L$0 = producerScope5;
                                this.L$1 = countedByteReadChannel4;
                                this.L$2 = byteString4;
                                this.L$3 = byteChannel2;
                                this.L$4 = completableDeferred;
                                this.L$5 = httpHeadersMap2;
                                this.J$0 = j3;
                                this.label = 8;
                                parsePartBodyImpl = MultipartKt.parsePartBodyImpl(byteString10, countedByteReadChannel8, byteChannel4, httpHeadersMap, j11, multipartKt$parseMultipart$1);
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            httpHeadersMap = httpHeadersMap2;
                            th = th2;
                        } catch (Throwable th3) {
                            th = th3;
                            httpHeadersMap = httpHeadersMap2;
                        }
                        httpHeadersMap2 = (HttpHeadersMap) obj4;
                        httpHeadersMap3 = httpHeadersMap;
                        if (completableDeferred.completeExceptionally(th) && httpHeadersMap3 != null) {
                            httpHeadersMap3.release();
                        }
                        ByteWriteChannelOperationsKt.close(byteChannel2, th);
                        throw th;
                    }
                }
                return coroutine_suspended;
            case 6:
                j3 = this.J$0;
                CompletableDeferred completableDeferred2 = (CompletableDeferred) this.L$4;
                ByteChannel byteChannel5 = (ByteChannel) this.L$3;
                byteString3 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel9 = (CountedByteReadChannel) this.L$1;
                producerScope4 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                completableDeferred = completableDeferred2;
                countedByteReadChannel3 = countedByteReadChannel9;
                byteChannel = byteChannel5;
                j4 = 0;
                this.L$0 = producerScope4;
                this.L$1 = countedByteReadChannel3;
                this.L$2 = byteString3;
                this.L$3 = byteChannel;
                this.L$4 = completableDeferred;
                this.J$0 = j3;
                this.label = 7;
                obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                if (obj4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                j3 = this.J$0;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                ByteString byteString11 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel10 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope10 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    j4 = 0;
                    producerScope5 = producerScope10;
                    obj4 = obj;
                    countedByteReadChannel4 = countedByteReadChannel10;
                    byteString4 = byteString11;
                    httpHeadersMap2 = (HttpHeadersMap) obj4;
                    if (completableDeferred.complete(httpHeadersMap2)) {
                    }
                    th = th2;
                } catch (Throwable th4) {
                    th = th4;
                }
                httpHeadersMap3 = httpHeadersMap;
                if (completableDeferred.completeExceptionally(th)) {
                    httpHeadersMap3.release();
                }
                ByteWriteChannelOperationsKt.close(byteChannel2, th);
                throw th;
            case 8:
                j3 = this.J$0;
                HttpHeadersMap httpHeadersMap4 = (HttpHeadersMap) this.L$5;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                byteString4 = (ByteString) this.L$2;
                countedByteReadChannel4 = (CountedByteReadChannel) this.L$1;
                producerScope5 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    httpHeadersMap = httpHeadersMap4;
                    j4 = 0;
                    ByteChannel byteChannel6 = byteChannel2;
                    byteString2 = byteString4;
                    producerScope = producerScope5;
                    totalBytesRead = j3;
                    counted = countedByteReadChannel4;
                    try {
                        byteChannel6.close();
                        j7 = j4;
                        z = false;
                        i = 1;
                        if (!counted.isClosedForRead()) {
                        }
                        j5 = j7;
                        producerScope6 = producerScope;
                        byteString5 = MultipartKt.CrLf;
                        this.L$0 = producerScope6;
                        this.L$1 = counted;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.J$0 = totalBytesRead;
                        this.label = 9;
                        if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        th = th5;
                        byteChannel2 = byteChannel6;
                        break;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    httpHeadersMap3 = httpHeadersMap4;
                    break;
                }
                break;
            case 9:
                j6 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                j5 = 0;
                byteString8 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j6;
                this.label = 10;
                break;
            case 10:
                j6 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                j5 = 0;
                if (this.$totalLength == null) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.label = 13;
                    readRemaining2 = ByteReadChannelOperationsKt.readRemaining(countedByteReadChannel5, this);
                    break;
                } else {
                    long longValue = this.$totalLength.longValue() - (countedByteReadChannel5.getTotalBytesRead() - j6);
                    if (longValue > 2147483647L) {
                        throw new IOException("Failed to parse multipart: prologue is too long");
                    }
                    if (longValue > j5) {
                        this.L$0 = producerScope6;
                        this.L$1 = null;
                        this.label = 11;
                        readPacket = ByteReadChannelOperationsKt.readPacket(countedByteReadChannel5, (int) longValue, this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 11:
                ProducerScope producerScope11 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope11;
                readPacket = obj;
                this.L$0 = null;
                this.label = 12;
                break;
            case 12:
            case 14:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 13:
                ProducerScope producerScope12 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope12;
                readRemaining2 = obj;
                Source source2 = (Source) readRemaining2;
                if (!source2.exhausted()) {
                    this.L$0 = null;
                    this.label = 14;
                    break;
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
