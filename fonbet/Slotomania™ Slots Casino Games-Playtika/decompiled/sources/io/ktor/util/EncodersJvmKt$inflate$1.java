package io.ktor.util;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.io.Source;

/* compiled from: EncodersJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {82, 99, 100, 110, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 135}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes4.dex */
final class EncodersJvmKt$inflate$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ ByteReadChannel $source;
    byte B$0;
    byte B$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncodersJvmKt$inflate$1(boolean z, ByteReadChannel byteReadChannel, Continuation<? super EncodersJvmKt$inflate$1> continuation) {
        super(2, continuation);
        this.$gzip = z;
        this.$source = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new EncodersJvmKt$inflate$1(this.$gzip, this.$source, continuation);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((EncodersJvmKt$inflate$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a6, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(r17.$source, r5, r17) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0141, code lost:
    
        if (r12 == r0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0300 A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x033e A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0296 A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0257 A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027e A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ec A[Catch: all -> 0x03ee, TryCatch #2 {all -> 0x03ee, blocks: (B:8:0x0034, B:10:0x0327, B:11:0x02fa, B:13:0x0300, B:17:0x033e, B:19:0x0342, B:21:0x034a, B:23:0x036a, B:28:0x036f, B:29:0x0397, B:30:0x0398, B:31:0x03a3, B:32:0x03a4, B:33:0x03ca, B:34:0x03cb, B:36:0x03e5, B:37:0x03ec, B:44:0x0290, B:46:0x0296, B:48:0x029c, B:51:0x02e7, B:52:0x024f, B:54:0x0257, B:57:0x0276, B:59:0x027e, B:60:0x02ec, B:62:0x02f4, B:63:0x03ed, B:74:0x0083, B:79:0x0246), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0326 -> B:10:0x0327). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x02c3 -> B:42:0x02cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x027c -> B:52:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x027e -> B:44:0x0290). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WriterScope writerScope;
        ByteBuffer borrow;
        ByteBuffer borrow2;
        Inflater inflater;
        CRC32 crc32;
        Object readPacket;
        short readShortLittleEndian;
        byte readByte;
        byte readByte2;
        ByteBuffer byteBuffer;
        WriterScope writerScope2;
        Object readShort;
        ByteBuffer byteBuffer2;
        byte b;
        Inflater inflater2;
        short s;
        WriterScope writerScope3;
        ByteBuffer byteBuffer3;
        CRC32 crc322;
        byte b2;
        boolean has;
        boolean has2;
        boolean has3;
        Inflater inflater3;
        ByteBuffer byteBuffer4;
        CRC32 crc323;
        Ref.IntRef intRef;
        WriterScope writerScope4;
        Object obj2;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        Inflater inflater4;
        WriterScope writerScope5;
        CRC32 crc324;
        Ref.IntRef intRef2;
        Object inflateTo;
        WriterScope writerScope6;
        Ref.IntRef intRef3;
        int i;
        CRC32 crc325;
        Ref.IntRef intRef4;
        int i2;
        Object inflateTo2;
        Ref.IntRef intRef5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    writerScope = (WriterScope) this.L$0;
                    borrow = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    borrow2 = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    inflater = new Inflater(true);
                    crc32 = new CRC32();
                    if (this.$gzip) {
                        this.L$0 = writerScope;
                        this.L$1 = borrow;
                        this.L$2 = borrow2;
                        this.L$3 = inflater;
                        this.L$4 = crc32;
                        this.label = 1;
                        readPacket = ByteReadChannelOperationsKt.readPacket(this.$source, 10, this);
                        break;
                    }
                    crc323 = crc32;
                    intRef = new Ref.IntRef();
                    writerScope4 = writerScope;
                    if (!this.$source.isClosedForRead()) {
                        this.L$0 = writerScope4;
                        this.L$1 = borrow;
                        this.L$2 = borrow2;
                        this.L$3 = inflater;
                        this.L$4 = crc323;
                        this.L$5 = intRef;
                        this.L$6 = null;
                        this.label = 5;
                        obj2 = ByteReadChannelOperations_jvmKt.readAvailable(this.$source, borrow, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Number) obj2).intValue() > 0) {
                            borrow.flip();
                            inflater.setInput(borrow.array(), borrow.position(), borrow.remaining());
                            if (inflater.needsInput() && !inflater.finished()) {
                                int i3 = intRef.element;
                                this.L$0 = writerScope4;
                                this.L$1 = borrow;
                                this.L$2 = borrow2;
                                this.L$3 = inflater;
                                this.L$4 = crc323;
                                this.L$5 = intRef;
                                this.L$6 = intRef;
                                this.I$0 = i3;
                                this.label = 6;
                                inflateTo = EncodersJvmKt.inflateTo(inflater, writerScope4.getChannel(), borrow2, crc323, this);
                                if (inflateTo != coroutine_suspended) {
                                    writerScope6 = writerScope4;
                                    byteBuffer5 = borrow;
                                    intRef3 = intRef;
                                    byteBuffer6 = borrow2;
                                    i = i3;
                                    inflater4 = inflater;
                                    crc325 = crc323;
                                    intRef4 = intRef3;
                                    intRef4.element = i + ((Number) inflateTo).intValue();
                                    byteBuffer5.position(byteBuffer5.limit() - inflater4.getRemaining());
                                    intRef = intRef3;
                                    crc323 = crc325;
                                    inflater = inflater4;
                                    borrow2 = byteBuffer6;
                                    borrow = byteBuffer5;
                                    writerScope4 = writerScope6;
                                    if (inflater.needsInput()) {
                                    }
                                    borrow.compact();
                                }
                                return coroutine_suspended;
                            }
                            borrow.compact();
                        }
                        if (!this.$source.isClosedForRead()) {
                            Throwable closedCause = this.$source.getClosedCause();
                            if (closedCause != null) {
                                throw closedCause;
                            }
                            borrow.flip();
                            writerScope5 = writerScope4;
                            crc324 = crc323;
                            intRef2 = intRef;
                            if (!inflater.finished()) {
                                i2 = intRef2.element;
                                this.L$0 = writerScope5;
                                this.L$1 = borrow;
                                this.L$2 = borrow2;
                                this.L$3 = inflater;
                                this.L$4 = crc324;
                                this.L$5 = intRef2;
                                this.L$6 = intRef2;
                                this.I$0 = i2;
                                this.label = 7;
                                inflateTo2 = EncodersJvmKt.inflateTo(inflater, writerScope5.getChannel(), borrow2, crc324, this);
                                if (inflateTo2 != coroutine_suspended) {
                                    intRef5 = intRef2;
                                    intRef2.element = i2 + ((Number) inflateTo2).intValue();
                                    borrow.position(borrow.limit() - inflater.getRemaining());
                                    intRef2 = intRef5;
                                    if (!inflater.finished()) {
                                        if (this.$gzip) {
                                            if (borrow.remaining() != 8) {
                                                throw new IllegalStateException(("Expected 8 bytes in the trailer. Actual: " + borrow.remaining() + " $").toString());
                                            }
                                            borrow.order(ByteOrder.LITTLE_ENDIAN);
                                            int i4 = borrow.getInt(borrow.position());
                                            int i5 = borrow.getInt(borrow.position() + 4);
                                            if (((int) crc324.getValue()) != i4) {
                                                throw new IllegalStateException("Gzip checksum invalid.".toString());
                                            }
                                            if (intRef2.element != i5) {
                                                throw new IllegalStateException(("Gzip size invalid. Expected " + i5 + ", actual " + intRef2.element).toString());
                                            }
                                        } else if (borrow.hasRemaining()) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        inflater.end();
                                        ByteBufferPoolKt.getKtorDefaultPool().recycle(borrow);
                                        ByteBufferPoolKt.getKtorDefaultPool().recycle(borrow2);
                                        return Unit.INSTANCE;
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                case 1:
                    crc32 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    borrow2 = (ByteBuffer) this.L$2;
                    borrow = (ByteBuffer) this.L$1;
                    writerScope = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    readPacket = obj;
                    Source source = (Source) readPacket;
                    readShortLittleEndian = ByteReadPacketKt.readShortLittleEndian(source);
                    readByte = source.readByte();
                    readByte2 = source.readByte();
                    ByteReadPacketKt.discard$default(source, 0L, 1, null);
                    if ((readByte2 & 4) != 0) {
                        this.L$0 = writerScope;
                        this.L$1 = borrow;
                        this.L$2 = borrow2;
                        this.L$3 = inflater;
                        this.L$4 = crc32;
                        this.S$0 = readShortLittleEndian;
                        this.B$0 = readByte;
                        this.B$1 = readByte2;
                        this.label = 2;
                        readShort = ByteReadChannelOperationsKt.readShort(this.$source, this);
                        if (readShort != coroutine_suspended) {
                            byteBuffer2 = borrow;
                            b = readByte;
                            inflater2 = inflater;
                            s = readShortLittleEndian;
                            writerScope3 = writerScope;
                            byteBuffer3 = borrow2;
                            crc322 = crc32;
                            b2 = readByte2;
                            long shortValue = ((Number) readShort).shortValue();
                            this.L$0 = writerScope3;
                            this.L$1 = byteBuffer2;
                            this.L$2 = byteBuffer3;
                            this.L$3 = inflater2;
                            this.L$4 = crc322;
                            this.S$0 = s;
                            this.B$0 = b;
                            this.B$1 = b2;
                            this.label = 3;
                            break;
                        }
                        return coroutine_suspended;
                    }
                    byteBuffer = borrow2;
                    writerScope2 = writerScope;
                    if (readShortLittleEndian == -29921) {
                        throw new IllegalStateException(("GZIP magic invalid: " + ((int) readShortLittleEndian)).toString());
                    }
                    if (readByte == 8) {
                        has = EncodersJvmKt.has(readByte2, 8);
                        if (!has) {
                            has2 = EncodersJvmKt.has(readByte2, 16);
                            if (!has2) {
                                has3 = EncodersJvmKt.has(readByte2, 2);
                                if (has3) {
                                    this.L$0 = writerScope2;
                                    this.L$1 = borrow;
                                    this.L$2 = byteBuffer;
                                    this.L$3 = inflater;
                                    this.L$4 = crc32;
                                    this.label = 4;
                                    if (ByteReadChannelOperationsKt.discardExact(this.$source, 2L, this) != coroutine_suspended) {
                                        inflater3 = inflater;
                                        byteBuffer4 = borrow;
                                        borrow = byteBuffer4;
                                        writerScope = writerScope2;
                                        inflater = inflater3;
                                        borrow2 = byteBuffer;
                                        crc323 = crc32;
                                        intRef = new Ref.IntRef();
                                        writerScope4 = writerScope;
                                        if (!this.$source.isClosedForRead()) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                writerScope = writerScope2;
                                borrow2 = byteBuffer;
                                crc323 = crc32;
                                intRef = new Ref.IntRef();
                                writerScope4 = writerScope;
                                if (!this.$source.isClosedForRead()) {
                                }
                            } else {
                                throw new IllegalStateException("Gzip file comment not supported".toString());
                            }
                        } else {
                            throw new IllegalStateException("Gzip file name not supported".toString());
                        }
                    } else {
                        throw new IllegalStateException(("Deflater method unsupported: " + ((int) readByte) + '.').toString());
                    }
                    break;
                case 2:
                    b2 = this.B$1;
                    b = this.B$0;
                    s = this.S$0;
                    crc322 = (CRC32) this.L$4;
                    inflater2 = (Inflater) this.L$3;
                    byteBuffer3 = (ByteBuffer) this.L$2;
                    byteBuffer2 = (ByteBuffer) this.L$1;
                    writerScope3 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    readShort = obj;
                    long shortValue2 = ((Number) readShort).shortValue();
                    this.L$0 = writerScope3;
                    this.L$1 = byteBuffer2;
                    this.L$2 = byteBuffer3;
                    this.L$3 = inflater2;
                    this.L$4 = crc322;
                    this.S$0 = s;
                    this.B$0 = b;
                    this.B$1 = b2;
                    this.label = 3;
                    break;
                case 3:
                    b2 = this.B$1;
                    b = this.B$0;
                    s = this.S$0;
                    crc322 = (CRC32) this.L$4;
                    inflater2 = (Inflater) this.L$3;
                    byteBuffer3 = (ByteBuffer) this.L$2;
                    byteBuffer2 = (ByteBuffer) this.L$1;
                    writerScope3 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    readByte2 = b2;
                    readByte = b;
                    crc32 = crc322;
                    byteBuffer = byteBuffer3;
                    writerScope2 = writerScope3;
                    readShortLittleEndian = s;
                    inflater = inflater2;
                    borrow = byteBuffer2;
                    if (readShortLittleEndian == -29921) {
                    }
                    break;
                case 4:
                    crc32 = (CRC32) this.L$4;
                    inflater3 = (Inflater) this.L$3;
                    byteBuffer = (ByteBuffer) this.L$2;
                    byteBuffer4 = (ByteBuffer) this.L$1;
                    writerScope2 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    borrow = byteBuffer4;
                    writerScope = writerScope2;
                    inflater = inflater3;
                    borrow2 = byteBuffer;
                    crc323 = crc32;
                    intRef = new Ref.IntRef();
                    writerScope4 = writerScope;
                    if (!this.$source.isClosedForRead()) {
                    }
                    break;
                case 5:
                    intRef = (Ref.IntRef) this.L$5;
                    crc323 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    borrow2 = (ByteBuffer) this.L$2;
                    borrow = (ByteBuffer) this.L$1;
                    writerScope4 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    if (((Number) obj2).intValue() > 0) {
                    }
                    if (!this.$source.isClosedForRead()) {
                    }
                    break;
                case 6:
                    i = this.I$0;
                    intRef4 = (Ref.IntRef) this.L$6;
                    intRef3 = (Ref.IntRef) this.L$5;
                    crc325 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer6 = (ByteBuffer) this.L$2;
                    byteBuffer5 = (ByteBuffer) this.L$1;
                    writerScope6 = (WriterScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        inflateTo = obj;
                        intRef4.element = i + ((Number) inflateTo).intValue();
                        byteBuffer5.position(byteBuffer5.limit() - inflater4.getRemaining());
                        intRef = intRef3;
                        crc323 = crc325;
                        inflater = inflater4;
                        borrow2 = byteBuffer6;
                        borrow = byteBuffer5;
                        writerScope4 = writerScope6;
                        if (inflater.needsInput()) {
                        }
                        borrow.compact();
                        if (!this.$source.isClosedForRead()) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Inflater inflater5 = inflater4;
                        ByteBuffer byteBuffer7 = byteBuffer6;
                        ByteBuffer byteBuffer8 = byteBuffer5;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            inflater5.end();
                            ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer8);
                            ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer7);
                            throw th2;
                        }
                    }
                    break;
                case 7:
                    i2 = this.I$0;
                    intRef2 = (Ref.IntRef) this.L$6;
                    Ref.IntRef intRef6 = (Ref.IntRef) this.L$5;
                    crc324 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    borrow2 = (ByteBuffer) this.L$2;
                    borrow = (ByteBuffer) this.L$1;
                    writerScope5 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    intRef5 = intRef6;
                    inflateTo2 = obj;
                    intRef2.element = i2 + ((Number) inflateTo2).intValue();
                    borrow.position(borrow.limit() - inflater.getRemaining());
                    intRef2 = intRef5;
                    if (!inflater.finished()) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
