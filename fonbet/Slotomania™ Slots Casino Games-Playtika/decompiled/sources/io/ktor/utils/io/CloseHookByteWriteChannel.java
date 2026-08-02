package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Sink;

/* compiled from: CloseHookByteWriteChannel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R*\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/utils/io/CloseHookByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onClose", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;)V", "flushAndClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "flush", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/jvm/functions/Function1;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "", "isClosedForWrite", "()Z", "Lkotlinx/io/Sink;", "getWriteBuffer", "()Lkotlinx/io/Sink;", "writeBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseHookByteWriteChannel implements ByteWriteChannel {
    private final ByteWriteChannel delegate;
    private final Function1<Continuation<? super Unit>, Object> onClose;

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        this.delegate.cancel(cause);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flush(Continuation<? super Unit> continuation) {
        return this.delegate.flush(continuation);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Sink getWriteBuffer() {
        return this.delegate.getWriteBuffer();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this.delegate.isClosedForWrite();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CloseHookByteWriteChannel(ByteWriteChannel delegate, Function1<? super Continuation<? super Unit>, ? extends Object> onClose) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.delegate = delegate;
        this.onClose = onClose;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r6.invoke(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.flushAndClose(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flushAndClose(Continuation<? super Unit> continuation) {
        CloseHookByteWriteChannel$flushAndClose$1 closeHookByteWriteChannel$flushAndClose$1;
        int i;
        if (continuation instanceof CloseHookByteWriteChannel$flushAndClose$1) {
            closeHookByteWriteChannel$flushAndClose$1 = (CloseHookByteWriteChannel$flushAndClose$1) continuation;
            if ((closeHookByteWriteChannel$flushAndClose$1.label & Integer.MIN_VALUE) != 0) {
                closeHookByteWriteChannel$flushAndClose$1.label -= Integer.MIN_VALUE;
                Object obj = closeHookByteWriteChannel$flushAndClose$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = closeHookByteWriteChannel$flushAndClose$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteWriteChannel byteWriteChannel = this.delegate;
                    closeHookByteWriteChannel$flushAndClose$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Function1<Continuation<? super Unit>, Object> function1 = this.onClose;
                closeHookByteWriteChannel$flushAndClose$1.label = 2;
            }
        }
        closeHookByteWriteChannel$flushAndClose$1 = new CloseHookByteWriteChannel$flushAndClose$1(this, continuation);
        Object obj2 = closeHookByteWriteChannel$flushAndClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeHookByteWriteChannel$flushAndClose$1.label;
        if (i != 0) {
        }
        Function1<Continuation<? super Unit>, Object> function12 = this.onClose;
        closeHookByteWriteChannel$flushAndClose$1.label = 2;
    }
}
