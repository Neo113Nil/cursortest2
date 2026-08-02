package io.ktor.network.sockets;

import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.network.util.Timeout;
import io.ktor.network.util.UtilsKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: CIOWriter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {33, 75, 79, 50}, m = "invokeSuspend", n = {"timeout", "timeout", "rc", "$this$read_u24default$iv", "consumer$iv", "min$iv", "timeout", "rc", "$this$read_u24default$iv", "consumer$iv", "timeout"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
final class CIOWriterKt$attachForWritingDirectImpl$1 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteChannel $channel;
    final /* synthetic */ WritableByteChannel $nioChannel;
    final /* synthetic */ Selectable $selectable;
    final /* synthetic */ SelectorManager $selector;
    final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOWriterKt$attachForWritingDirectImpl$1(Selectable selectable, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, SelectorManager selectorManager, WritableByteChannel writableByteChannel, Continuation<? super CIOWriterKt$attachForWritingDirectImpl$1> continuation) {
        super(2, continuation);
        this.$selectable = selectable;
        this.$socketOptions = tCPClientSocketOptions;
        this.$channel = byteChannel;
        this.$selector = selectorManager;
        this.$nioChannel = writableByteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CIOWriterKt$attachForWritingDirectImpl$1 cIOWriterKt$attachForWritingDirectImpl$1 = new CIOWriterKt$attachForWritingDirectImpl$1(this.$selectable, this.$socketOptions, this.$channel, this.$selector, this.$nioChannel, continuation);
        cIOWriterKt$attachForWritingDirectImpl$1.L$0 = obj;
        return cIOWriterKt$attachForWritingDirectImpl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReaderScope readerScope, Continuation<? super Unit> continuation) {
        return ((CIOWriterKt$attachForWritingDirectImpl$1) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0137, code lost:
    
        if (r17.$selector.select(r17.$selectable, io.ktor.network.selector.SelectInterest.WRITE, r17) == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:10:0x001c, B:13:0x00b0, B:15:0x00b8, B:17:0x00c2, B:25:0x00da, B:29:0x0104, B:31:0x010c, B:32:0x0115, B:34:0x0119, B:36:0x013a, B:37:0x0166, B:40:0x0169, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:10:0x001c, B:13:0x00b0, B:15:0x00b8, B:17:0x00c2, B:25:0x00da, B:29:0x0104, B:31:0x010c, B:32:0x0115, B:34:0x0119, B:36:0x013a, B:37:0x0166, B:40:0x0169, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:10:0x001c, B:13:0x00b0, B:15:0x00b8, B:17:0x00c2, B:25:0x00da, B:29:0x0104, B:31:0x010c, B:32:0x0115, B:34:0x0119, B:36:0x013a, B:37:0x0166, B:40:0x0169, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:10:0x001c, B:13:0x00b0, B:15:0x00b8, B:17:0x00c2, B:25:0x00da, B:29:0x0104, B:31:0x010c, B:32:0x0115, B:34:0x0119, B:36:0x013a, B:37:0x0166, B:40:0x0169, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #1 {all -> 0x0195, blocks: (B:10:0x001c, B:13:0x00b0, B:15:0x00b8, B:17:0x00c2, B:25:0x00da, B:29:0x0104, B:31:0x010c, B:32:0x0115, B:34:0x0119, B:36:0x013a, B:37:0x0166, B:40:0x0169, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0117 -> B:12:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0137 -> B:12:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Timeout createTimeout$default;
        final Timeout timeout;
        Timeout timeout2;
        Ref.IntRef intRef;
        Function1 function1;
        ByteChannel byteChannel;
        Object obj2;
        int i;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    createTimeout$default = (Timeout) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    Function1 function12 = (Function1) this.L$3;
                    byteChannel = (ByteReadChannel) this.L$2;
                    Ref.IntRef intRef2 = (Ref.IntRef) this.L$1;
                    Timeout timeout3 = (Timeout) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    timeout2 = timeout3;
                    intRef = intRef2;
                    function1 = function12;
                    obj2 = obj;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i2 == 3) {
                        Function1 function13 = (Function1) this.L$3;
                        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$2;
                        Ref.IntRef intRef3 = (Ref.IntRef) this.L$1;
                        Timeout timeout4 = (Timeout) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function13);
                        }
                        timeout = timeout4;
                        if (intRef3.element == 0) {
                            this.$selectable.interestOp(SelectInterest.WRITE, true);
                            this.L$0 = timeout;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 4;
                        }
                        while (!this.$channel.isClosedForRead()) {
                            if (ByteReadChannelOperationsKt.getAvailableForRead(this.$channel) == 0) {
                                this.L$0 = timeout;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 1;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(this.$channel, 0, this, 1, null) == coroutine_suspended) {
                                }
                            } else {
                                final Ref.IntRef intRef4 = new Ref.IntRef();
                                byteChannel = this.$channel;
                                final WritableByteChannel writableByteChannel = this.$nioChannel;
                                function1 = new Function1() { // from class: io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        Unit invokeSuspend$lambda$1;
                                        invokeSuspend$lambda$1 = CIOWriterKt$attachForWritingDirectImpl$1.invokeSuspend$lambda$1(Timeout.this, intRef4, writableByteChannel, (ByteBuffer) obj3);
                                        return invokeSuspend$lambda$1;
                                    }
                                };
                                this.L$0 = timeout;
                                this.L$1 = intRef4;
                                this.L$2 = byteChannel;
                                this.L$3 = function1;
                                this.I$0 = 1;
                                this.label = 2;
                                obj2 = byteChannel.awaitContent(1, this);
                                if (obj2 != coroutine_suspended) {
                                    timeout2 = timeout;
                                    intRef = intRef4;
                                    i = 1;
                                    if (((Boolean) obj2).booleanValue()) {
                                        throw new EOFException("Not enough bytes available: required " + i + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteChannel) + " available");
                                    }
                                    ByteReadPacketExtensions_jvmKt.read(byteChannel.getReadBuffer(), function1);
                                    intRef3 = intRef;
                                    timeout = timeout2;
                                    if (intRef3.element == 0) {
                                    }
                                    while (!this.$channel.isClosedForRead()) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (timeout != null) {
                            timeout.finish();
                        }
                        if (z) {
                            try {
                                if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                                    ((SocketChannel) this.$nioChannel).shutdownOutput();
                                } else {
                                    ((SocketChannel) this.$nioChannel).socket().shutdownOutput();
                                }
                            } catch (ClosedChannelException unused) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createTimeout$default = (Timeout) this.L$0;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                ReaderScope readerScope = (ReaderScope) this.L$0;
                this.$selectable.interestOp(SelectInterest.WRITE, false);
                SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = this.$socketOptions;
                createTimeout$default = (tCPClientSocketOptions != null ? Boxing.boxLong(tCPClientSocketOptions.getSocketTimeout()) : null) != null ? UtilsKt.createTimeout$default(readerScope, "writing-direct", this.$socketOptions.getSocketTimeout(), null, new CIOWriterKt$attachForWritingDirectImpl$1$timeout$1(this.$channel, null), 4, null) : null;
            }
            timeout = createTimeout$default;
            while (!this.$channel.isClosedForRead()) {
            }
            if (timeout != null) {
            }
            return Unit.INSTANCE;
        } finally {
            this.$selectable.interestOp(SelectInterest.WRITE, false);
            if (this.$nioChannel instanceof SocketChannel) {
                try {
                    if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                        ((SocketChannel) this.$nioChannel).shutdownOutput();
                    } else {
                        ((SocketChannel) this.$nioChannel).socket().shutdownOutput();
                    }
                } catch (ClosedChannelException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Timeout timeout, Ref.IntRef intRef, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            if (timeout == null) {
                do {
                    intRef.element = writableByteChannel.write(byteBuffer);
                    if (byteBuffer.hasRemaining()) {
                    }
                } while (intRef.element > 0);
            } else {
                timeout.start();
                do {
                    try {
                        intRef.element = writableByteChannel.write(byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                            break;
                        }
                    } finally {
                        timeout.stop();
                    }
                } while (intRef.element > 0);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
