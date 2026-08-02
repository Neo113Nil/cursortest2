package io.ktor.util;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperations_jvmKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: Deflater.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0015\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u0004\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0082@¢\u0006\u0004\b\u0004\u0010\u001c\u001a5\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010!\"\u0014\u0010#\u001a\u00020\"8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ljava/util/zip/Deflater;", "Ljava/nio/ByteBuffer;", "outBuffer", "", "deflateTo", "(Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;)V", "buffer", "setInputBuffer", "Ljava/util/zip/Checksum;", "updateKeepPosition", "(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "putGzipHeader", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crc", "deflater", "putGzipTrailer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Checksum;Ljava/util/zip/Deflater;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "predicate", "deflateWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "destination", "gzip", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "deflated", "(Lio/ktor/utils/io/ByteReadChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "", "GZIP_MAGIC", ExifInterface.LATITUDE_SOUTH, "", "GZIP_HEADER_PADDING", "[B", "getGZIP_HEADER_PADDING", "()[B", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeflaterKt {
    private static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    private static final void deflateTo(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    private static final void setInputBuffer(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(Checksum checksum, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(checksum, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, 0, 0, r5, 6, null) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r8, (byte) 8, r5) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(r8, r9, r5) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipHeader(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$1;
        int i;
        if (continuation instanceof DeflaterKt$putGzipHeader$1) {
            deflaterKt$putGzipHeader$1 = (DeflaterKt$putGzipHeader$1) continuation;
            if ((deflaterKt$putGzipHeader$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipHeader$1.label -= Integer.MIN_VALUE;
                DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$12 = deflaterKt$putGzipHeader$1;
                Object obj = deflaterKt$putGzipHeader$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipHeader$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    short reverseBytes = Short.reverseBytes((short) (-29921));
                    deflaterKt$putGzipHeader$12.L$0 = byteWriteChannel;
                    deflaterKt$putGzipHeader$12.label = 1;
                } else if (i == 1) {
                    byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipHeader$12.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipHeader$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    ByteWriteChannel byteWriteChannel2 = byteWriteChannel;
                    byte[] bArr = GZIP_HEADER_PADDING;
                    deflaterKt$putGzipHeader$12.L$0 = null;
                    deflaterKt$putGzipHeader$12.label = 3;
                }
                deflaterKt$putGzipHeader$12.L$0 = byteWriteChannel;
                deflaterKt$putGzipHeader$12.label = 2;
            }
        }
        deflaterKt$putGzipHeader$1 = new DeflaterKt$putGzipHeader$1(continuation);
        DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$122 = deflaterKt$putGzipHeader$1;
        Object obj2 = deflaterKt$putGzipHeader$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipHeader$122.label;
        if (i != 0) {
        }
        deflaterKt$putGzipHeader$122.L$0 = byteWriteChannel;
        deflaterKt$putGzipHeader$122.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipTrailer(ByteWriteChannel byteWriteChannel, Checksum checksum, Deflater deflater, Continuation<? super Unit> continuation) {
        DeflaterKt$putGzipTrailer$1 deflaterKt$putGzipTrailer$1;
        int i;
        if (continuation instanceof DeflaterKt$putGzipTrailer$1) {
            deflaterKt$putGzipTrailer$1 = (DeflaterKt$putGzipTrailer$1) continuation;
            if ((deflaterKt$putGzipTrailer$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipTrailer$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$putGzipTrailer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipTrailer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int reverseBytes = Integer.reverseBytes((int) checksum.getValue());
                    deflaterKt$putGzipTrailer$1.L$0 = byteWriteChannel;
                    deflaterKt$putGzipTrailer$1.L$1 = deflater;
                    deflaterKt$putGzipTrailer$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    deflater = (Deflater) deflaterKt$putGzipTrailer$1.L$1;
                    byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipTrailer$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                int reverseBytes2 = Integer.reverseBytes(deflater.getTotalIn());
                deflaterKt$putGzipTrailer$1.L$0 = null;
                deflaterKt$putGzipTrailer$1.L$1 = null;
                deflaterKt$putGzipTrailer$1.label = 2;
            }
        }
        deflaterKt$putGzipTrailer$1 = new DeflaterKt$putGzipTrailer$1(continuation);
        Object obj2 = deflaterKt$putGzipTrailer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipTrailer$1.label;
        if (i != 0) {
        }
        int reverseBytes22 = Integer.reverseBytes(deflater.getTotalIn());
        deflaterKt$putGzipTrailer$1.L$0 = null;
        deflaterKt$putGzipTrailer$1.L$1 = null;
        deflaterKt$putGzipTrailer$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deflateWhile(ByteWriteChannel byteWriteChannel, Deflater deflater, ByteBuffer byteBuffer, Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        DeflaterKt$deflateWhile$1 deflaterKt$deflateWhile$1;
        int i;
        if (continuation instanceof DeflaterKt$deflateWhile$1) {
            deflaterKt$deflateWhile$1 = (DeflaterKt$deflateWhile$1) continuation;
            if ((deflaterKt$deflateWhile$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateWhile$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$deflateWhile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$deflateWhile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function0<Boolean> function02 = (Function0) deflaterKt$deflateWhile$1.L$3;
                    ByteBuffer byteBuffer2 = (ByteBuffer) deflaterKt$deflateWhile$1.L$2;
                    Deflater deflater2 = (Deflater) deflaterKt$deflateWhile$1.L$1;
                    ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) deflaterKt$deflateWhile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function0 = function02;
                    byteWriteChannel = byteWriteChannel2;
                    byteBuffer = byteBuffer2;
                    deflater = deflater2;
                }
                while (function0.invoke().booleanValue()) {
                    byteBuffer.clear();
                    deflateTo(deflater, byteBuffer);
                    byteBuffer.flip();
                    deflaterKt$deflateWhile$1.L$0 = byteWriteChannel;
                    deflaterKt$deflateWhile$1.L$1 = deflater;
                    deflaterKt$deflateWhile$1.L$2 = byteBuffer;
                    deflaterKt$deflateWhile$1.L$3 = function0;
                    deflaterKt$deflateWhile$1.label = 1;
                    if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, deflaterKt$deflateWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        deflaterKt$deflateWhile$1 = new DeflaterKt$deflateWhile$1(continuation);
        Object obj2 = deflaterKt$deflateWhile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$deflateWhile$1.label;
        if (i != 0) {
        }
        while (function0.invoke().booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(8:(1:(1:(1:(1:(6:14|15|16|17|18|19)(2:26|27))(7:28|29|30|31|(3:33|(2:36|17)|35)|18|19))(1:41))(12:70|71|72|51|52|(3:54|(0)|35)|56|44|45|46|(2:48|(9:50|51|52|(0)|56|44|45|46|(2:61|(2:63|(4:65|(0)|18|19))(1:66))(0)))(0)|35))(1:73)|42|43|44|45|46|(0)(0)|35)(7:74|(6:76|77|78|79|80|81)(1:90)|83|45|46|(0)(0)|35)|24|25))|92|6|7|(0)(0)|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b0, code lost:
    
        r2 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        if (putGzipHeader(r0, r3) == r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[Catch: all -> 0x00f9, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00f9, blocks: (B:33:0x01e6, B:42:0x00f1, B:71:0x00c3), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150 A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:46:0x014a, B:48:0x0150, B:61:0x01b8, B:63:0x01be, B:66:0x020f), top: B:45:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180 A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #2 {all -> 0x01b2, blocks: (B:52:0x0178, B:54:0x0180), top: B:51:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8 A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #0 {all -> 0x0210, blocks: (B:46:0x014a, B:48:0x0150, B:61:0x01b8, B:63:0x01be, B:66:0x020f), top: B:45:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deflateTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> objectPool, Continuation<? super Unit> continuation) {
        DeflaterKt$deflateTo$1 deflaterKt$deflateTo$1;
        ?? r5;
        ObjectPool objectPool2;
        ByteBuffer byteBuffer;
        Deflater deflater;
        ByteBuffer byteBuffer2;
        CRC32 crc32;
        ByteReadChannel byteReadChannel2;
        ObjectPool<ByteBuffer> objectPool3;
        ByteBuffer byteBuffer3;
        ByteReadChannel byteReadChannel3;
        boolean z2;
        ByteBuffer byteBuffer4;
        Deflater deflater2;
        boolean z3;
        ByteWriteChannel byteWriteChannel2;
        boolean z4;
        CRC32 crc322;
        ObjectPool objectPool4;
        boolean z5;
        ByteBuffer byteBuffer5;
        ByteWriteChannel byteWriteChannel3;
        ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        ?? r1 = z;
        if (continuation instanceof DeflaterKt$deflateTo$1) {
            deflaterKt$deflateTo$1 = (DeflaterKt$deflateTo$1) continuation;
            if ((deflaterKt$deflateTo$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateTo$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$deflateTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r5 = deflaterKt$deflateTo$1.label;
                final ?? r11 = 1;
                if (r5 != 0) {
                    ResultKt.throwOnFailure(obj);
                    crc32 = new CRC32();
                    deflater = new Deflater(-1, true);
                    ByteBuffer borrow = objectPool.borrow();
                    ByteBuffer borrow2 = objectPool.borrow();
                    if (r1 != 0) {
                        byteReadChannel2 = byteReadChannel;
                        try {
                            deflaterKt$deflateTo$1.L$0 = byteReadChannel2;
                            deflaterKt$deflateTo$1.L$1 = byteWriteChannel4;
                            objectPool3 = objectPool;
                            try {
                                deflaterKt$deflateTo$1.L$2 = objectPool3;
                                deflaterKt$deflateTo$1.L$3 = crc32;
                                deflaterKt$deflateTo$1.L$4 = deflater;
                                deflaterKt$deflateTo$1.L$5 = borrow;
                                deflaterKt$deflateTo$1.L$6 = borrow2;
                                deflaterKt$deflateTo$1.Z$0 = r1;
                                deflaterKt$deflateTo$1.label = 1;
                            } catch (Throwable th) {
                                th = th;
                                byteBuffer = borrow;
                                byteBuffer2 = borrow2;
                                objectPool2 = objectPool3;
                                deflater.end();
                                objectPool2.recycle(byteBuffer);
                                objectPool2.recycle(byteBuffer2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectPool3 = objectPool;
                        }
                    } else {
                        byteReadChannel2 = byteReadChannel;
                        objectPool3 = objectPool;
                    }
                    r11 = deflater;
                    r5 = borrow;
                    byteBuffer3 = borrow2;
                    objectPool2 = objectPool3;
                    z3 = r1;
                    if (byteReadChannel2.isClosedForRead()) {
                    }
                    return coroutine_suspended;
                }
                try {
                    if (r5 == 1) {
                        z5 = deflaterKt$deflateTo$1.Z$0;
                        byteBuffer5 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
                        ByteBuffer byteBuffer6 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                        Deflater deflater3 = (Deflater) deflaterKt$deflateTo$1.L$4;
                        crc32 = (CRC32) deflaterKt$deflateTo$1.L$3;
                        objectPool2 = (ObjectPool) deflaterKt$deflateTo$1.L$2;
                        byteWriteChannel3 = (ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                        byteReadChannel3 = (ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                        byteBuffer4 = byteBuffer6;
                        deflater2 = deflater3;
                    } else if (r5 == 2) {
                        boolean z6 = deflaterKt$deflateTo$1.Z$0;
                        ByteBuffer byteBuffer7 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
                        ByteBuffer byteBuffer8 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                        Deflater deflater4 = (Deflater) deflaterKt$deflateTo$1.L$4;
                        CRC32 crc323 = (CRC32) deflaterKt$deflateTo$1.L$3;
                        ObjectPool objectPool5 = (ObjectPool) deflaterKt$deflateTo$1.L$2;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                        byteReadChannel3 = (ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z6;
                        byteWriteChannel4 = byteWriteChannel5;
                        ObjectPool objectPool6 = objectPool5;
                        CRC32 crc324 = crc323;
                        final Deflater deflater5 = deflater4;
                        ByteBuffer byteBuffer9 = byteBuffer8;
                        DeflaterKt$deflateTo$1 deflaterKt$deflateTo$12 = deflaterKt$deflateTo$1;
                        ByteBuffer byteBuffer10 = byteBuffer7;
                        try {
                            if (((Number) obj).intValue() > 0) {
                                byteBuffer9.flip();
                                updateKeepPosition(crc324, byteBuffer9);
                                setInputBuffer(deflater5, byteBuffer9);
                                Function0 function0 = new Function0() { // from class: io.ktor.util.DeflaterKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean deflateTo$lambda$2;
                                        deflateTo$lambda$2 = DeflaterKt.deflateTo$lambda$2(deflater5);
                                        return Boolean.valueOf(deflateTo$lambda$2);
                                    }
                                };
                                deflaterKt$deflateTo$12.L$0 = byteReadChannel3;
                                deflaterKt$deflateTo$12.L$1 = byteWriteChannel4;
                                deflaterKt$deflateTo$12.L$2 = objectPool6;
                                deflaterKt$deflateTo$12.L$3 = crc324;
                                deflaterKt$deflateTo$12.L$4 = deflater5;
                                deflaterKt$deflateTo$12.L$5 = byteBuffer9;
                                deflaterKt$deflateTo$12.L$6 = byteBuffer10;
                                deflaterKt$deflateTo$12.Z$0 = z2;
                                deflaterKt$deflateTo$12.label = 3;
                                if (deflateWhile(byteWriteChannel4, deflater5, byteBuffer10, function0, deflaterKt$deflateTo$12) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            byteBuffer3 = byteBuffer10;
                            deflaterKt$deflateTo$1 = deflaterKt$deflateTo$12;
                            byteBuffer4 = byteBuffer9;
                            deflater2 = deflater5;
                            crc32 = crc324;
                            objectPool2 = objectPool6;
                            byteReadChannel2 = byteReadChannel3;
                            z3 = z2;
                            r5 = byteBuffer4;
                            r11 = deflater2;
                            if (byteReadChannel2.isClosedForRead()) {
                                r5.clear();
                                deflaterKt$deflateTo$1.L$0 = byteReadChannel2;
                                deflaterKt$deflateTo$1.L$1 = byteWriteChannel4;
                                deflaterKt$deflateTo$1.L$2 = objectPool2;
                                deflaterKt$deflateTo$1.L$3 = crc32;
                                deflaterKt$deflateTo$1.L$4 = r11;
                                deflaterKt$deflateTo$1.L$5 = r5;
                                deflaterKt$deflateTo$1.L$6 = byteBuffer3;
                                deflaterKt$deflateTo$1.Z$0 = z3;
                                deflaterKt$deflateTo$1.label = 2;
                                Object readAvailable = ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel2, r5, deflaterKt$deflateTo$1);
                                if (readAvailable != coroutine_suspended) {
                                    DeflaterKt$deflateTo$1 deflaterKt$deflateTo$13 = deflaterKt$deflateTo$1;
                                    byteBuffer10 = byteBuffer3;
                                    obj = readAvailable;
                                    byteReadChannel3 = byteReadChannel2;
                                    objectPool6 = objectPool2;
                                    crc324 = crc32;
                                    deflater5 = r11;
                                    byteBuffer9 = r5;
                                    deflaterKt$deflateTo$12 = deflaterKt$deflateTo$13;
                                    z2 = z3;
                                    if (((Number) obj).intValue() > 0) {
                                    }
                                    byteBuffer3 = byteBuffer10;
                                    deflaterKt$deflateTo$1 = deflaterKt$deflateTo$12;
                                    byteBuffer4 = byteBuffer9;
                                    deflater2 = deflater5;
                                    crc32 = crc324;
                                    objectPool2 = objectPool6;
                                    byteReadChannel2 = byteReadChannel3;
                                    z3 = z2;
                                    r5 = byteBuffer4;
                                    r11 = deflater2;
                                    if (byteReadChannel2.isClosedForRead()) {
                                        Throwable closedCause = byteReadChannel2.getClosedCause();
                                        if (closedCause != null) {
                                            throw closedCause;
                                        }
                                        r11.finish();
                                        Function0 function02 = new Function0() { // from class: io.ktor.util.DeflaterKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                boolean deflateTo$lambda$4;
                                                deflateTo$lambda$4 = DeflaterKt.deflateTo$lambda$4(r11);
                                                return Boolean.valueOf(deflateTo$lambda$4);
                                            }
                                        };
                                        deflaterKt$deflateTo$1.L$0 = byteWriteChannel4;
                                        deflaterKt$deflateTo$1.L$1 = objectPool2;
                                        deflaterKt$deflateTo$1.L$2 = crc32;
                                        deflaterKt$deflateTo$1.L$3 = r11;
                                        deflaterKt$deflateTo$1.L$4 = r5;
                                        deflaterKt$deflateTo$1.L$5 = byteBuffer3;
                                        deflaterKt$deflateTo$1.L$6 = null;
                                        deflaterKt$deflateTo$1.Z$0 = z3;
                                        deflaterKt$deflateTo$1.label = 4;
                                        if (deflateWhile(byteWriteChannel4, r11, byteBuffer3, function02, deflaterKt$deflateTo$1) != coroutine_suspended) {
                                            ByteBuffer byteBuffer11 = byteBuffer3;
                                            byteWriteChannel2 = byteWriteChannel4;
                                            z4 = z3 ? 1 : 0;
                                            r1 = byteBuffer11;
                                            crc322 = crc32;
                                            r5 = r5;
                                            r11 = r11;
                                            if (z4) {
                                            }
                                            r11.end();
                                            objectPool2.recycle(r5);
                                            objectPool2.recycle(r1);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th3) {
                            th = th3;
                            byteBuffer2 = byteBuffer10;
                            byteBuffer = byteBuffer9;
                            deflater = deflater5;
                            objectPool2 = objectPool6;
                        }
                    } else if (r5 == 3) {
                        z5 = deflaterKt$deflateTo$1.Z$0;
                        byteBuffer5 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
                        ByteBuffer byteBuffer12 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                        Deflater deflater6 = (Deflater) deflaterKt$deflateTo$1.L$4;
                        crc32 = (CRC32) deflaterKt$deflateTo$1.L$3;
                        objectPool2 = (ObjectPool) deflaterKt$deflateTo$1.L$2;
                        byteWriteChannel3 = (ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                        byteReadChannel3 = (ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                        byteBuffer4 = byteBuffer12;
                        deflater2 = deflater6;
                    } else if (r5 == 4) {
                        z4 = deflaterKt$deflateTo$1.Z$0;
                        ByteBuffer byteBuffer13 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                        ByteBuffer byteBuffer14 = (ByteBuffer) deflaterKt$deflateTo$1.L$4;
                        Deflater deflater7 = (Deflater) deflaterKt$deflateTo$1.L$3;
                        crc322 = (CRC32) deflaterKt$deflateTo$1.L$2;
                        ObjectPool objectPool7 = (ObjectPool) deflaterKt$deflateTo$1.L$1;
                        ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) deflaterKt$deflateTo$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objectPool2 = objectPool7;
                            byteWriteChannel2 = byteWriteChannel6;
                            r11 = deflater7;
                            r1 = byteBuffer13;
                            r5 = byteBuffer14;
                            if (z4) {
                                deflaterKt$deflateTo$1.L$0 = objectPool2;
                                deflaterKt$deflateTo$1.L$1 = r11;
                                deflaterKt$deflateTo$1.L$2 = r5;
                                deflaterKt$deflateTo$1.L$3 = r1;
                                deflaterKt$deflateTo$1.L$4 = null;
                                deflaterKt$deflateTo$1.L$5 = null;
                                deflaterKt$deflateTo$1.label = 5;
                                if (putGzipTrailer(byteWriteChannel2, crc322, r11, deflaterKt$deflateTo$1) != coroutine_suspended) {
                                    byteBuffer = r5;
                                    deflater = r11;
                                    objectPool4 = objectPool2;
                                    r1 = r1;
                                    objectPool2 = objectPool4;
                                    r11 = deflater;
                                    r5 = byteBuffer;
                                }
                                return coroutine_suspended;
                            }
                            r11.end();
                            objectPool2.recycle(r5);
                            objectPool2.recycle(r1);
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            byteBuffer = byteBuffer14;
                            deflater = deflater7;
                            objectPool2 = objectPool7;
                            byteBuffer2 = byteBuffer13;
                        }
                    } else {
                        if (r5 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ByteBuffer byteBuffer15 = (ByteBuffer) deflaterKt$deflateTo$1.L$3;
                        byteBuffer = (ByteBuffer) deflaterKt$deflateTo$1.L$2;
                        deflater = (Deflater) deflaterKt$deflateTo$1.L$1;
                        objectPool4 = (ObjectPool) deflaterKt$deflateTo$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r1 = byteBuffer15;
                            objectPool2 = objectPool4;
                            r11 = deflater;
                            r5 = byteBuffer;
                            r11.end();
                            objectPool2.recycle(r5);
                            objectPool2.recycle(r1);
                            return Unit.INSTANCE;
                        } catch (Throwable th5) {
                            th = th5;
                            objectPool2 = objectPool4;
                            byteBuffer2 = byteBuffer15;
                        }
                    }
                    if (byteReadChannel2.isClosedForRead()) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    th = th6;
                    r1 = byteBuffer3;
                    byteBuffer = r5;
                    deflater = r11;
                    byteBuffer2 = r1;
                    deflater.end();
                    objectPool2.recycle(byteBuffer);
                    objectPool2.recycle(byteBuffer2);
                    throw th;
                }
                ResultKt.throwOnFailure(obj);
                byteBuffer3 = byteBuffer5;
                z2 = z5;
                byteWriteChannel4 = byteWriteChannel3;
                byteReadChannel2 = byteReadChannel3;
                z3 = z2;
                r5 = byteBuffer4;
                r11 = deflater2;
                deflater.end();
                objectPool2.recycle(byteBuffer);
                objectPool2.recycle(byteBuffer2);
                throw th;
            }
        }
        deflaterKt$deflateTo$1 = new DeflaterKt$deflateTo$1(continuation);
        Object obj2 = deflaterKt$deflateTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = deflaterKt$deflateTo$1.label;
        final Deflater r112 = 1;
        if (r5 != 0) {
        }
        deflater.end();
        objectPool2.recycle(byteBuffer);
        objectPool2.recycle(byteBuffer2);
        throw th;
    }

    static /* synthetic */ Object deflateTo$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z, objectPool, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$2(Deflater deflater) {
        return !deflater.needsInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$4(Deflater deflater) {
        return !deflater.finished();
    }

    public static /* synthetic */ ByteReadChannel deflated$default(ByteReadChannel byteReadChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteReadChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    public static final ByteReadChannel deflated(ByteReadChannel byteReadChannel, boolean z, ObjectPool<ByteBuffer> pool, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return ByteWriteChannelOperationsKt.writer((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new DeflaterKt$deflated$1(byteReadChannel, z, pool, null)).getChannel();
    }

    public static /* synthetic */ ByteWriteChannel deflated$default(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteWriteChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    public static final ByteWriteChannel deflated(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> pool, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return ByteReadChannelOperationsKt.reader((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new DeflaterKt$deflated$2(byteWriteChannel, z, pool, null)).getChannel();
    }
}
