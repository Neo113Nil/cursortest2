package io.ktor.http.cio;

import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import io.ktor.http.ContentType;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.StringsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.ByteStringKt;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\t\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u001d\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u001f\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+¨\u00060"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "boundary", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "limit", "parsePreambleImpl", "(Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/HttpHeadersMap;", "parsePartHeadersImpl", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundaryPrefixed", "headers", "parsePartBodyImpl", "(Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/http/cio/HttpHeadersMap;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefix", "skipIfFoundReadCount", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "maxPartSize", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/http/cio/MultipartEvent;", "parseMultipart", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/HttpHeadersMap;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", "contentType", "contentLength", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "totalLength", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Long;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", "findBoundary", "(Ljava/lang/CharSequence;)I", "", "parseBoundaryInternal", "(Ljava/lang/CharSequence;)[B", "actual", "", "throwLimitExceeded", "(JJ)Ljava/lang/Void;", "CrLf", "Lkotlinx/io/bytestring/ByteString;", "", "PrefixChar", "B", "PrefixString", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultipartKt {
    private static final ByteString CrLf = new ByteString(StringsKt.toByteArray$default(ServerSentEventKt.END_OF_LINE, null, 1, null), 0, 0, 6, null);
    private static final byte PrefixChar = 45;
    private static final ByteString PrefixString = ByteStringKt.ByteString(PrefixChar, PrefixChar);

    static /* synthetic */ Object parsePreambleImpl$default(ByteString byteString, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            j = Long.MAX_VALUE;
        }
        return parsePreambleImpl(byteString, byteReadChannel, byteWriteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object parsePreambleImpl(ByteString byteString, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) {
        return ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0054, B:16:0x0059, B:17:0x0060), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parsePartHeadersImpl(ByteReadChannel byteReadChannel, Continuation<? super HttpHeadersMap> continuation) {
        MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$1;
        int i;
        Throwable th;
        CharArrayBuilder charArrayBuilder;
        HttpHeadersMap httpHeadersMap;
        if (continuation instanceof MultipartKt$parsePartHeadersImpl$1) {
            multipartKt$parsePartHeadersImpl$1 = (MultipartKt$parsePartHeadersImpl$1) continuation;
            if ((multipartKt$parsePartHeadersImpl$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartHeadersImpl$1.label -= Integer.MIN_VALUE;
                MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$12 = multipartKt$parsePartHeadersImpl$1;
                Object obj = multipartKt$parsePartHeadersImpl$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartHeadersImpl$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharArrayBuilder charArrayBuilder2 = new CharArrayBuilder(null, 1, null);
                    try {
                        multipartKt$parsePartHeadersImpl$12.L$0 = charArrayBuilder2;
                        multipartKt$parsePartHeadersImpl$12.label = 1;
                        obj = HttpParserKt.parseHeaders$default(byteReadChannel, charArrayBuilder2, null, multipartKt$parsePartHeadersImpl$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        charArrayBuilder = charArrayBuilder2;
                    } catch (Throwable th2) {
                        th = th2;
                        charArrayBuilder = charArrayBuilder2;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder = (CharArrayBuilder) multipartKt$parsePartHeadersImpl$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                httpHeadersMap = (HttpHeadersMap) obj;
                if (httpHeadersMap == null) {
                    return httpHeadersMap;
                }
                throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        multipartKt$parsePartHeadersImpl$1 = new MultipartKt$parsePartHeadersImpl$1(continuation);
        MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$122 = multipartKt$parsePartHeadersImpl$1;
        Object obj2 = multipartKt$parsePartHeadersImpl$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartHeadersImpl$122.label;
        if (i != 0) {
        }
        httpHeadersMap = (HttpHeadersMap) obj2;
        if (httpHeadersMap == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f8, code lost:
    
        if (r3.flush(r6) != r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r4 == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parsePartBodyImpl(ByteString byteString, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, HttpHeadersMap httpHeadersMap, long j, Continuation<? super Long> continuation) {
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$1;
        int i;
        ByteReadChannel byteReadChannel2;
        ByteString byteString2;
        Object copyTo;
        ByteWriteChannel byteWriteChannel2;
        ByteWriteChannel byteWriteChannel3;
        long longValue;
        long j2;
        ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        if (continuation instanceof MultipartKt$parsePartBodyImpl$1) {
            multipartKt$parsePartBodyImpl$1 = (MultipartKt$parsePartBodyImpl$1) continuation;
            if ((multipartKt$parsePartBodyImpl$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartBodyImpl$1.label -= Integer.MIN_VALUE;
                MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$12 = multipartKt$parsePartBodyImpl$1;
                Object obj = multipartKt$parsePartBodyImpl$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartBodyImpl$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharSequence charSequence = httpHeadersMap.get(HttpHeaders.CONTENT_LENGTH);
                    Long boxLong = charSequence != null ? Boxing.boxLong(CharsKt.parseDecLong(charSequence)) : null;
                    if (boxLong == null) {
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel4;
                        multipartKt$parsePartBodyImpl$12.label = 1;
                        obj = ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel4, j, true, multipartKt$parsePartBodyImpl$12);
                        if (obj != coroutine_suspended) {
                            byteWriteChannel2 = byteWriteChannel4;
                            byteWriteChannel3 = byteWriteChannel2;
                            longValue = ((Number) obj).longValue();
                            multipartKt$parsePartBodyImpl$12.L$0 = null;
                            multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                            multipartKt$parsePartBodyImpl$12.label = 4;
                        }
                    } else {
                        byteReadChannel2 = byteReadChannel;
                        if (!new LongRange(0L, j).contains(boxLong.longValue())) {
                            throwLimitExceeded(boxLong.longValue(), j);
                            throw new KotlinNothingValueException();
                        }
                        long longValue2 = boxLong.longValue();
                        byteString2 = byteString;
                        multipartKt$parsePartBodyImpl$12.L$0 = byteString2;
                        multipartKt$parsePartBodyImpl$12.L$1 = byteReadChannel2;
                        multipartKt$parsePartBodyImpl$12.L$2 = byteWriteChannel4;
                        multipartKt$parsePartBodyImpl$12.label = 2;
                        copyTo = ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel4, longValue2, multipartKt$parsePartBodyImpl$12);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    byteWriteChannel2 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteWriteChannel3 = byteWriteChannel2;
                    longValue = ((Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                } else {
                    if (i == 2) {
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$2;
                        ByteReadChannel byteReadChannel3 = (ByteReadChannel) multipartKt$parsePartBodyImpl$12.L$1;
                        ByteString byteString3 = (ByteString) multipartKt$parsePartBodyImpl$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        copyTo = obj;
                        byteString2 = byteString3;
                        byteWriteChannel4 = byteWriteChannel5;
                        byteReadChannel2 = byteReadChannel3;
                        long longValue3 = ((Number) copyTo).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel4;
                        multipartKt$parsePartBodyImpl$12.L$1 = null;
                        multipartKt$parsePartBodyImpl$12.L$2 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue3;
                        multipartKt$parsePartBodyImpl$12.label = 3;
                        obj = skipIfFoundReadCount(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                        if (obj != coroutine_suspended) {
                            byteWriteChannel3 = byteWriteChannel4;
                            j2 = longValue3;
                            longValue = j2 + ((Number) obj).longValue();
                            multipartKt$parsePartBodyImpl$12.L$0 = null;
                            multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                            multipartKt$parsePartBodyImpl$12.label = 4;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        j2 = multipartKt$parsePartBodyImpl$12.J$0;
                        byteWriteChannel3 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        longValue = j2 + ((Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                        multipartKt$parsePartBodyImpl$12.label = 4;
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        longValue = multipartKt$parsePartBodyImpl$12.J$0;
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return Boxing.boxLong(longValue);
            }
        }
        multipartKt$parsePartBodyImpl$1 = new MultipartKt$parsePartBodyImpl$1(continuation);
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$122 = multipartKt$parsePartBodyImpl$1;
        Object obj2 = multipartKt$parsePartBodyImpl$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartBodyImpl$122.label;
        if (i != 0) {
        }
        return Boxing.boxLong(longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipIfFoundReadCount(ByteReadChannel byteReadChannel, ByteString byteString, Continuation<? super Long> continuation) {
        MultipartKt$skipIfFoundReadCount$1 multipartKt$skipIfFoundReadCount$1;
        int i;
        if (continuation instanceof MultipartKt$skipIfFoundReadCount$1) {
            multipartKt$skipIfFoundReadCount$1 = (MultipartKt$skipIfFoundReadCount$1) continuation;
            if ((multipartKt$skipIfFoundReadCount$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$skipIfFoundReadCount$1.label -= Integer.MIN_VALUE;
                Object obj = multipartKt$skipIfFoundReadCount$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$skipIfFoundReadCount$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    multipartKt$skipIfFoundReadCount$1.L$0 = byteString;
                    multipartKt$skipIfFoundReadCount$1.label = 1;
                    obj = ByteReadChannelOperationsKt.skipIfFound(byteReadChannel, byteString, multipartKt$skipIfFoundReadCount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteString = (ByteString) multipartKt$skipIfFoundReadCount$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(!((Boolean) obj).booleanValue() ? byteString.getSize() : 0L);
            }
        }
        multipartKt$skipIfFoundReadCount$1 = new MultipartKt$skipIfFoundReadCount$1(continuation);
        Object obj2 = multipartKt$skipIfFoundReadCount$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$skipIfFoundReadCount$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(!((Boolean) obj2).booleanValue() ? byteString.getSize() : 0L);
    }

    public static /* synthetic */ ReceiveChannel parseMultipart$default(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, HttpHeadersMap httpHeadersMap, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        return parseMultipart(coroutineScope, byteReadChannel, httpHeadersMap, j);
    }

    public static final ReceiveChannel<MultipartEvent> parseMultipart(CoroutineScope coroutineScope, ByteReadChannel input, HttpHeadersMap headers, long j) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(headers, "headers");
        CharSequence charSequence = headers.get("Content-Type");
        if (charSequence == null) {
            throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: no Content-Type header");
        }
        CharSequence charSequence2 = headers.get(HttpHeaders.CONTENT_LENGTH);
        return parseMultipart(coroutineScope, input, charSequence, charSequence2 != null ? Long.valueOf(CharsKt.parseDecLong(charSequence2)) : null, j);
    }

    public static /* synthetic */ ReceiveChannel parseMultipart$default(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = Long.MAX_VALUE;
        }
        return parseMultipart(coroutineScope, byteReadChannel, charSequence, l, j);
    }

    public static final ReceiveChannel<MultipartEvent> parseMultipart(CoroutineScope coroutineScope, ByteReadChannel input, CharSequence contentType, Long l, long j) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (!ContentType.MultiPart.INSTANCE.contains(contentType)) {
            throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) contentType));
        }
        return parseMultipart(coroutineScope, new ByteString(parseBoundaryInternal(contentType), 0, 0, 6, null), input, l, j);
    }

    private static final ReceiveChannel<MultipartEvent> parseMultipart(CoroutineScope coroutineScope, ByteString byteString, ByteReadChannel byteReadChannel, Long l, long j) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new MultipartKt$parseMultipart$1(byteReadChannel, byteString, j, l, null), 3, null);
    }

    private static final int findBoundary(CharSequence charSequence) {
        int length = charSequence.length();
        char c = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (c == 0) {
                if (charAt != ';') {
                }
                i = 0;
                c = 1;
            } else if (c != 1) {
                if (c == 2) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            if (charAt != ';') {
                            }
                            i = 0;
                            c = 1;
                        }
                        c = 0;
                    }
                    c = 3;
                } else if (c != 3) {
                    if (c != 4) {
                    }
                    c = 3;
                } else {
                    if (charAt != '\"') {
                        if (charAt == '\\') {
                            c = 4;
                        }
                    }
                    i = 0;
                    c = 1;
                }
            } else if (charAt == '=') {
                c = 2;
            } else if (charAt == ';') {
                i = 0;
            } else {
                if (charAt != ',') {
                    if (charAt == ' ') {
                        continue;
                    } else {
                        if (i == 0 && kotlin.text.StringsKt.startsWith(charSequence, (CharSequence) "boundary=", i2, true)) {
                            return i2;
                        }
                        i++;
                    }
                }
                c = 0;
            }
        }
        return -1;
    }

    public static final byte[] parseBoundaryInternal(CharSequence contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        int findBoundary = findBoundary(contentType);
        if (findBoundary == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        Ref.IntRef intRef = new Ref.IntRef();
        parseBoundaryInternal$put(intRef, bArr, Ascii.CR);
        parseBoundaryInternal$put(intRef, bArr, (byte) 10);
        parseBoundaryInternal$put(intRef, bArr, PrefixChar);
        parseBoundaryInternal$put(intRef, bArr, PrefixChar);
        int length = contentType.length();
        char c = 0;
        for (int i = findBoundary + 9; i < length; i++) {
            char charAt = contentType.charAt(i);
            int i2 = charAt & CharCompanionObject.MAX_VALUE;
            if ((65535 & charAt) > 127) {
                StringBuilder sb = new StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                String num = Integer.toString(i2, kotlin.text.CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                throw new IOException(sb.append(num).append(" - should be 7bit character").toString());
            }
            if (c == 0) {
                if (charAt == ' ') {
                    continue;
                } else {
                    if (charAt != '\"') {
                        if (charAt == ',' || charAt == ';') {
                            break;
                        }
                        parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                        c = 1;
                    }
                    c = 2;
                }
            } else if (c == 1) {
                if (charAt == ' ' || charAt == ',' || charAt == ';') {
                    break;
                }
                parseBoundaryInternal$put(intRef, bArr, (byte) i2);
            } else {
                if (c == 2) {
                    if (charAt == '\"') {
                        break;
                    }
                    if (charAt != '\\') {
                        parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                    } else {
                        c = 3;
                    }
                } else if (c == 3) {
                    parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                    c = 2;
                }
            }
        }
        if (intRef.element == 4) {
            throw new IOException("Empty multipart boundary is not allowed");
        }
        return ArraysKt.copyOfRange(bArr, 0, intRef.element);
    }

    private static final void parseBoundaryInternal$put(Ref.IntRef intRef, byte[] bArr, byte b) {
        if (intRef.element >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        int i = intRef.element;
        intRef.element = i + 1;
        bArr[i] = b;
    }

    private static final Void throwLimitExceeded(long j, long j2) {
        throw new IOException("Multipart content length exceeds limit " + j + " > " + j2 + "; limit is defined using 'formFieldLimit' argument");
    }
}
