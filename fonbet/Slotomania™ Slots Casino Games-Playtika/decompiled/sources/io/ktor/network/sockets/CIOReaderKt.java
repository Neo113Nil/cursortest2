package io.ktor.network.sockets;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperations_jvmKt;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.cordova.globalization.Globalization;

/* compiled from: CIOReader.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aM\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteChannel;", AppsFlyerProperties.CHANNEL, "Ljava/nio/channels/ReadableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", Globalization.SELECTOR, "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/WriterJob;", "attachForReadingImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/utils/io/pool/ObjectPool;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "attachForReadingDirectImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "readFrom", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectForRead", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CIOReaderKt {
    public static /* synthetic */ WriterJob attachForReadingImpl$default(CoroutineScope coroutineScope, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, ObjectPool objectPool, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, Object obj) {
        if ((i & 32) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, objectPool, tCPClientSocketOptions);
    }

    public static final WriterJob attachForReadingImpl(CoroutineScope coroutineScope, ByteChannel channel, ReadableByteChannel nioChannel, Selectable selectable, SelectorManager selector, ObjectPool<ByteBuffer> pool, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return ByteWriteChannelOperationsKt.writer(coroutineScope, Dispatchers.getIO().plus(new CoroutineName("cio-from-nio-reader")), channel, new CIOReaderKt$attachForReadingImpl$1(tCPClientSocketOptions, channel, selectable, pool.borrow(), pool, nioChannel, selector, null));
    }

    public static /* synthetic */ WriterJob attachForReadingDirectImpl$default(CoroutineScope coroutineScope, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, Object obj) {
        if ((i & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingDirectImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }

    public static final WriterJob attachForReadingDirectImpl(CoroutineScope coroutineScope, ByteChannel channel, ReadableByteChannel nioChannel, Selectable selectable, SelectorManager selector, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return ByteWriteChannelOperationsKt.writer(coroutineScope, Dispatchers.getIO().plus(new CoroutineName("cio-from-nio-reader")), channel, new CIOReaderKt$attachForReadingDirectImpl$1(selectable, tCPClientSocketOptions, channel, nioChannel, selector, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFrom(ByteWriteChannel byteWriteChannel, final ReadableByteChannel readableByteChannel, Continuation<? super Integer> continuation) {
        CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$1;
        int i;
        Ref.IntRef intRef;
        if (continuation instanceof CIOReaderKt$readFrom$1) {
            cIOReaderKt$readFrom$1 = (CIOReaderKt$readFrom$1) continuation;
            if ((cIOReaderKt$readFrom$1.label & Integer.MIN_VALUE) != 0) {
                cIOReaderKt$readFrom$1.label -= Integer.MIN_VALUE;
                CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$12 = cIOReaderKt$readFrom$1;
                Object obj = cIOReaderKt$readFrom$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOReaderKt$readFrom$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.IntRef intRef2 = new Ref.IntRef();
                    Function1 function1 = new Function1() { // from class: io.ktor.network.sockets.CIOReaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit readFrom$lambda$0;
                            readFrom$lambda$0 = CIOReaderKt.readFrom$lambda$0(Ref.IntRef.this, readableByteChannel, (ByteBuffer) obj2);
                            return readFrom$lambda$0;
                        }
                    };
                    cIOReaderKt$readFrom$12.L$0 = intRef2;
                    cIOReaderKt$readFrom$12.label = 1;
                    if (ByteWriteChannelOperations_jvmKt.write$default(byteWriteChannel, 0, function1, cIOReaderKt$readFrom$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) cIOReaderKt$readFrom$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(intRef.element);
            }
        }
        cIOReaderKt$readFrom$1 = new CIOReaderKt$readFrom$1(continuation);
        CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$122 = cIOReaderKt$readFrom$1;
        Object obj2 = cIOReaderKt$readFrom$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOReaderKt$readFrom$122.label;
        if (i != 0) {
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readFrom$lambda$0(Ref.IntRef intRef, ReadableByteChannel readableByteChannel, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        intRef.element = readableByteChannel.read(buffer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object selectForRead(Selectable selectable, SelectorManager selectorManager, Continuation<? super Unit> continuation) {
        selectable.interestOp(SelectInterest.READ, true);
        Object select = selectorManager.select(selectable, SelectInterest.READ, continuation);
        return select == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? select : Unit.INSTANCE;
    }
}
