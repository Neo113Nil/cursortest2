package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.io.Buffer;
import kotlinx.io.CoreKt;
import kotlinx.io.RawSource;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.Sink;
import kotlinx.io.SinksKt;
import kotlinx.io.Source;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ByteWriteChannelOperations.kt */
@Metadata(d1 = {"\u0000Ý\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0004*\u0001^\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a0\u0010\"\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020$H\u0086@¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b'\u0010\u001f\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b*\u0010\u001c\u001a\u001b\u0010.\u001a\u00020\u0003*\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u00020\u0003*\u000200H\u0086@¢\u0006\u0004\b1\u00102\u001a\u0015\u00105\u001a\u000603j\u0002`4*\u000200¢\u0006\u0004\b5\u00106\u001a6\u0010<\u001a\u00020;*\u0002002#\u0010:\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010,¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000307¢\u0006\u0004\b<\u0010=\u001a!\u0010<\u001a\u00020\u0003*\u0002002\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030>H\u0007¢\u0006\u0004\b<\u0010?\u001a\u0011\u0010@\u001a\u00020\u0003*\u000200¢\u0006\u0004\b@\u0010A\u001aN\u0010M\u001a\u00020L*\u00020B2\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020E2'\u0010:\u001a#\b\u0001\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030I\u0012\u0006\u0012\u0004\u0018\u00010J0G¢\u0006\u0002\bK¢\u0006\u0004\bM\u0010N\u001aL\u0010M\u001a\u00020L*\u00020B2\b\b\u0002\u0010D\u001a\u00020C2\u0006\u0010P\u001a\u00020O2'\u0010:\u001a#\b\u0001\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030I\u0012\u0006\u0012\u0004\u0018\u00010J0G¢\u0006\u0002\bK¢\u0006\u0004\bM\u0010Q\u001a>\u0010T\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010R\u001a\u00020\t2\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0SH\u0086@¢\u0006\u0004\bT\u0010U\u001a\u0014\u0010V\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\bV\u0010W\u001a/\u0010Y\u001a\u00020\u0003\"\u0004\b\u0000\u0010X*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I\u0012\u0006\u0012\u0004\u0018\u00010J07H\u0000¢\u0006\u0004\bY\u0010Z\"\u0015\u0010[\u001a\u00020E*\u0002008F¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0015\u0010]\u001a\u00020E*\u0002008F¢\u0006\u0006\u001a\u0004\b]\u0010\\\"\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "value", "", "writeByte", "(Lio/ktor/utils/io/ByteWriteChannel;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeShort", "(Lio/ktor/utils/io/ByteWriteChannel;SLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeInt", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeFloat", "(Lio/ktor/utils/io/ByteWriteChannel;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeDouble", "(Lio/ktor/utils/io/ByteWriteChannel;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeLong", "(Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "array", "writeByteArray", "(Lio/ktor/utils/io/ByteWriteChannel;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Source;", "source", "writeSource", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeString", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startIndex", "endIndex", "writeFully", "(Lio/ktor/utils/io/ByteWriteChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/RawSource;", "writeBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/RawSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeStringUtf8", "Lkotlinx/io/Buffer;", "copy", "writePacket", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "close", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ChannelJob;", "join", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lio/ktor/utils/io/CancellationException;", "getCancellationException", "(Lio/ktor/utils/io/ChannelJob;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "block", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlin/Function0;", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/jvm/functions/Function0;)V", "cancel", "(Lio/ktor/utils/io/ChannelJob;)V", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/WriterScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lio/ktor/utils/io/WriterJob;", "writer", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteChannel;", AppsFlyerProperties.CHANNEL, "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "desiredSpace", "Lkotlin/Function3;", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFreeSpace", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "fireAndForget", "(Lkotlin/jvm/functions/Function1;)V", "isCompleted", "(Lio/ktor/utils/io/ChannelJob;)Z", "isCancelled", "io/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1", "NO_CALLBACK", "Lio/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteWriteChannelOperationsKt {
    private static final ByteWriteChannelOperationsKt$NO_CALLBACK$1 NO_CALLBACK = new Continuation<Object>() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }
    };

    public static final Object writeByte(ByteWriteChannel byteWriteChannel, byte b, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeByte(b);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeShort(ByteWriteChannel byteWriteChannel, short s, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeShort(s);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeInt(ByteWriteChannel byteWriteChannel, int i, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeInt(i);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeFloat(ByteWriteChannel byteWriteChannel, float f, Continuation<? super Unit> continuation) {
        SinksKt.writeFloat(byteWriteChannel.getWriteBuffer(), f);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeDouble(ByteWriteChannel byteWriteChannel, double d, Continuation<? super Unit> continuation) {
        SinksKt.writeDouble(byteWriteChannel.getWriteBuffer(), d);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeLong(ByteWriteChannel byteWriteChannel, long j, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeLong(j);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeByteArray(ByteWriteChannel byteWriteChannel, byte[] bArr, Continuation<? super Unit> continuation) {
        Sink.write$default(byteWriteChannel.getWriteBuffer(), bArr, 0, 0, 6, null);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeSource(ByteWriteChannel byteWriteChannel, Source source, Continuation<? super Unit> continuation) {
        Object writePacket = writePacket(byteWriteChannel, source, continuation);
        return writePacket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : Unit.INSTANCE;
    }

    public static final Object writeString(ByteWriteChannel byteWriteChannel, String str, Continuation<? super Unit> continuation) {
        StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (Charset) null, 14, (Object) null);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeFully$default(ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return writeFully(byteWriteChannel, bArr, i, i2, continuation);
    }

    public static final Object writeFully(ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().write(bArr, i, i2);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writeBuffer(ByteWriteChannel byteWriteChannel, RawSource rawSource, Continuation<? super Unit> continuation) {
        Object writePacket = writePacket(byteWriteChannel, CoreKt.buffered(rawSource), continuation);
        return writePacket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : Unit.INSTANCE;
    }

    public static final Object writeStringUtf8(ByteWriteChannel byteWriteChannel, String str, Continuation<? super Unit> continuation) {
        StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (Charset) null, 14, (Object) null);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final Object writePacket(ByteWriteChannel byteWriteChannel, Buffer buffer, Continuation<? super Unit> continuation) {
        byteWriteChannel.getWriteBuffer().transferFrom(buffer);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writePacket(ByteWriteChannel byteWriteChannel, Source source, Continuation<? super Unit> continuation) {
        ByteWriteChannelOperationsKt$writePacket$2 byteWriteChannelOperationsKt$writePacket$2;
        int i;
        if (continuation instanceof ByteWriteChannelOperationsKt$writePacket$2) {
            byteWriteChannelOperationsKt$writePacket$2 = (ByteWriteChannelOperationsKt$writePacket$2) continuation;
            if ((byteWriteChannelOperationsKt$writePacket$2.label & Integer.MIN_VALUE) != 0) {
                byteWriteChannelOperationsKt$writePacket$2.label -= Integer.MIN_VALUE;
                Object obj = byteWriteChannelOperationsKt$writePacket$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteWriteChannelOperationsKt$writePacket$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Source source2 = (Source) byteWriteChannelOperationsKt$writePacket$2.L$1;
                    ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) byteWriteChannelOperationsKt$writePacket$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    source = source2;
                    byteWriteChannel = byteWriteChannel2;
                }
                while (!source.exhausted()) {
                    byteWriteChannel.getWriteBuffer().write(source, ByteReadPacketKt.getRemaining(source));
                    byteWriteChannelOperationsKt$writePacket$2.L$0 = byteWriteChannel;
                    byteWriteChannelOperationsKt$writePacket$2.L$1 = source;
                    byteWriteChannelOperationsKt$writePacket$2.label = 1;
                    if (ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, byteWriteChannelOperationsKt$writePacket$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        byteWriteChannelOperationsKt$writePacket$2 = new ByteWriteChannelOperationsKt$writePacket$2(continuation);
        Object obj2 = byteWriteChannelOperationsKt$writePacket$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteWriteChannelOperationsKt$writePacket$2.label;
        if (i != 0) {
        }
        while (!source.exhausted()) {
        }
        return Unit.INSTANCE;
    }

    public static final void close(ByteWriteChannel byteWriteChannel, Throwable th) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        if (th == null) {
            fireAndForget(new ByteWriteChannelOperationsKt$close$1(byteWriteChannel));
        } else {
            byteWriteChannel.cancel(th);
        }
    }

    public static final Object join(ChannelJob channelJob, Continuation<? super Unit> continuation) {
        Object join = channelJob.getJob().join(continuation);
        return join == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : Unit.INSTANCE;
    }

    public static final boolean isCompleted(ChannelJob channelJob) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        return channelJob.getJob().isCompleted();
    }

    public static final boolean isCancelled(ChannelJob channelJob) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        return channelJob.getJob().isCancelled();
    }

    public static final CancellationException getCancellationException(ChannelJob channelJob) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        return channelJob.getJob().getCancellationException();
    }

    public static final DisposableHandle invokeOnCompletion(ChannelJob channelJob, Function1<? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return channelJob.getJob().invokeOnCompletion(block);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ void invokeOnCompletion(ChannelJob channelJob, final Function0 block) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        channelJob.getJob().invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invokeOnCompletion$lambda$0;
                invokeOnCompletion$lambda$0 = ByteWriteChannelOperationsKt.invokeOnCompletion$lambda$0(Function0.this, (Throwable) obj);
                return invokeOnCompletion$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeOnCompletion$lambda$0(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void cancel(ChannelJob channelJob) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        Job.DefaultImpls.cancel$default(channelJob.getJob(), (CancellationException) null, 1, (Object) null);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return writer(coroutineScope, coroutineContext, z, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public static final WriterJob writer(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return writer(coroutineScope, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, ByteChannel byteChannel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return writer(coroutineScope, coroutineContext, byteChannel, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public static final WriterJob writer(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final ByteChannel channel, Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new ByteWriteChannelOperationsKt$writer$job$1(block, channel, null), 2, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit writer$lambda$2$lambda$1;
                writer$lambda$2$lambda$1 = ByteWriteChannelOperationsKt.writer$lambda$2$lambda$1(ByteChannel.this, (Throwable) obj);
                return writer$lambda$2$lambda$1;
            }
        });
        return new WriterJob(channel, launch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writer$lambda$2$lambda$1(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForWrite()) {
            byteChannel.cancel(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object write(ByteWriteChannel byteWriteChannel, int i, Function3<? super byte[], ? super Integer, ? super Integer, Integer> function3, Continuation<? super Integer> continuation) {
        ByteWriteChannelOperationsKt$write$1 byteWriteChannelOperationsKt$write$1;
        int i2;
        int i3;
        if (continuation instanceof ByteWriteChannelOperationsKt$write$1) {
            byteWriteChannelOperationsKt$write$1 = (ByteWriteChannelOperationsKt$write$1) continuation;
            if ((byteWriteChannelOperationsKt$write$1.label & Integer.MIN_VALUE) != 0) {
                byteWriteChannelOperationsKt$write$1.label -= Integer.MIN_VALUE;
                Object obj = byteWriteChannelOperationsKt$write$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteWriteChannelOperationsKt$write$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int size = BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
                    UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                    Buffer bufferField = byteWriteChannel.getWriteBuffer().getBufferField();
                    Segment writableSegment = bufferField.writableSegment(i);
                    byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                    int intValue = function3.invoke(dataAsByteArray, Boxing.boxInt(writableSegment.getLimit()), Boxing.boxInt(dataAsByteArray.length)).intValue();
                    if (intValue == i) {
                        writableSegment.writeBackData(dataAsByteArray, intValue);
                        writableSegment.setLimit(writableSegment.getLimit() + intValue);
                        bufferField.setSizeMut(bufferField.getSizeMut() + intValue);
                    } else {
                        if (intValue < 0 || intValue > writableSegment.getRemainingCapacity()) {
                            throw new IllegalStateException(("Invalid number of bytes written: " + intValue + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                        }
                        if (intValue != 0) {
                            writableSegment.writeBackData(dataAsByteArray, intValue);
                            writableSegment.setLimit(writableSegment.getLimit() + intValue);
                            bufferField.setSizeMut(bufferField.getSizeMut() + intValue);
                        } else if (SegmentKt.isEmpty(writableSegment)) {
                            bufferField.recycleTail();
                        }
                    }
                    int size2 = BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) - size;
                    byteWriteChannelOperationsKt$write$1.I$0 = size2;
                    byteWriteChannelOperationsKt$write$1.label = 1;
                    if (ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, byteWriteChannelOperationsKt$write$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = size2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = byteWriteChannelOperationsKt$write$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(i3);
            }
        }
        byteWriteChannelOperationsKt$write$1 = new ByteWriteChannelOperationsKt$write$1(continuation);
        Object obj2 = byteWriteChannelOperationsKt$write$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteWriteChannelOperationsKt$write$1.label;
        if (i2 != 0) {
        }
        return Boxing.boxInt(i3);
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return write(byteWriteChannel, i, function3, continuation);
    }

    public static final Object awaitFreeSpace(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        Object flush = byteWriteChannel.flush(continuation);
        return flush == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : Unit.INSTANCE;
    }

    public static final <R> void fireAndForget(Function1<? super Continuation<? super R>, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        CancellableKt.startCoroutineCancellable(function1, NO_CALLBACK);
    }
}
