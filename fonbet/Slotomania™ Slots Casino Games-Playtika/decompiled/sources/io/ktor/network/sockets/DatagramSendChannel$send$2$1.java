package io.ktor.network.sockets;

import io.ktor.network.selector.SelectInterest;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: DatagramSendChannel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {113, 126}, m = "invokeSuspend", n = {"writeWithPool", "buffer$iv", "head$iv$iv", "bb$iv", "buffer", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class DatagramSendChannel$send$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Datagram $element;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DatagramSendChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$send$2$1(Datagram datagram, DatagramSendChannel datagramSendChannel, Continuation<? super DatagramSendChannel$send$2$1> continuation) {
        super(2, continuation);
        this.$element = datagram;
        this.this$0 = datagramSendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DatagramSendChannel$send$2$1(this.$element, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DatagramSendChannel$send$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (r14 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Buffer bufferField;
        Segment head;
        ByteBuffer asReadOnlyBuffer;
        Object sendSuspend;
        Buffer buffer;
        Segment segment;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int position;
        ObjectPool defaultDatagramByteBufferPool;
        Object obj2;
        Object sendSuspend2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long remaining = ByteReadPacketKt.getRemaining(this.$element.getPacket());
            booleanRef = new Ref.BooleanRef();
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            bufferField = this.$element.getPacket().getBufferField();
            DatagramSendChannel datagramSendChannel = this.this$0;
            Datagram datagram = this.$element;
            if (bufferField.exhausted()) {
                throw new IllegalArgumentException("Buffer is empty".toString());
            }
            head = bufferField.getHead();
            Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            asReadOnlyBuffer = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
            Intrinsics.checkNotNull(asReadOnlyBuffer);
            if (asReadOnlyBuffer.remaining() < remaining) {
                booleanRef.element = true;
            } else if (datagramSendChannel.getChannel().send(asReadOnlyBuffer, JavaSocketAddressUtilsKt.toJavaAddress(datagram.getAddress())) != 0) {
                datagramSendChannel.getSocket().interestOp(SelectInterest.WRITE, false);
                asReadOnlyBuffer.position(asReadOnlyBuffer.limit());
            } else {
                SocketAddress address = datagram.getAddress();
                this.L$0 = booleanRef;
                this.L$1 = bufferField;
                this.L$2 = head;
                this.L$3 = asReadOnlyBuffer;
                this.L$4 = asReadOnlyBuffer;
                this.label = 1;
                sendSuspend = datagramSendChannel.sendSuspend(asReadOnlyBuffer, address, this);
                if (sendSuspend != coroutine_suspended) {
                    buffer = bufferField;
                    segment = head;
                    byteBuffer = asReadOnlyBuffer;
                    byteBuffer2 = byteBuffer;
                }
                return coroutine_suspended;
            }
            position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (position > head.getSize()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bufferField.skip(position);
            }
            if (booleanRef.element) {
                defaultDatagramByteBufferPool = PoolsKt.getDefaultDatagramByteBufferPool();
                Datagram datagram2 = this.$element;
                DatagramSendChannel datagramSendChannel2 = this.this$0;
                Object borrow = defaultDatagramByteBufferPool.borrow();
                try {
                    ByteBuffer byteBuffer3 = (ByteBuffer) borrow;
                    DatagramSendChannelKt.writeMessageTo(datagram2.getPacket(), byteBuffer3);
                    if (datagramSendChannel2.getChannel().send(byteBuffer3, JavaSocketAddressUtilsKt.toJavaAddress(datagram2.getAddress())) != 0) {
                        datagramSendChannel2.getSocket().interestOp(SelectInterest.WRITE, false);
                    } else {
                        SocketAddress address2 = datagram2.getAddress();
                        this.L$0 = defaultDatagramByteBufferPool;
                        this.L$1 = borrow;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 2;
                        sendSuspend2 = datagramSendChannel2.sendSuspend(byteBuffer3, address2, this);
                    }
                    obj2 = borrow;
                    Unit unit = Unit.INSTANCE;
                    defaultDatagramByteBufferPool.recycle(obj2);
                } catch (Throwable th) {
                    th = th;
                    obj2 = borrow;
                    defaultDatagramByteBufferPool.recycle(obj2);
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            defaultDatagramByteBufferPool = (ObjectPool) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Unit unit2 = Unit.INSTANCE;
                defaultDatagramByteBufferPool.recycle(obj2);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                defaultDatagramByteBufferPool.recycle(obj2);
                throw th;
            }
        }
        byteBuffer = (ByteBuffer) this.L$4;
        byteBuffer2 = (ByteBuffer) this.L$3;
        segment = (Segment) this.L$2;
        buffer = (Buffer) this.L$1;
        booleanRef = (Ref.BooleanRef) this.L$0;
        ResultKt.throwOnFailure(obj);
        byteBuffer.position(byteBuffer.limit());
        asReadOnlyBuffer = byteBuffer2;
        head = segment;
        bufferField = buffer;
        position = asReadOnlyBuffer.position();
        if (position != 0) {
        }
        if (booleanRef.element) {
        }
        return Unit.INSTANCE;
    }
}
