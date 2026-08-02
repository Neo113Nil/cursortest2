package io.ktor.client.utils;

import io.ktor.client.content.ProgressListener;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ByteChannelUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {22, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ ProgressListener $listener;
    final /* synthetic */ ByteReadChannel $this_observable;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelUtilsKt$observable$1(ByteReadChannel byteReadChannel, ProgressListener progressListener, Long l, Continuation<? super ByteChannelUtilsKt$observable$1> continuation) {
        super(2, continuation);
        this.$this_observable = byteReadChannel;
        this.$listener = progressListener;
        this.$contentLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$this_observable, this.$listener, this.$contentLength, continuation);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelUtilsKt$observable$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01af, code lost:
    
        if (r15.onProgress(r13, r20, r24) == r7) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[Catch: all -> 0x01bc, TryCatch #5 {all -> 0x01bc, blocks: (B:27:0x00e8, B:29:0x00ee, B:34:0x011c, B:36:0x0124, B:48:0x0187, B:52:0x0198), top: B:26:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124 A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #5 {all -> 0x01bc, blocks: (B:27:0x00e8, B:29:0x00ee, B:34:0x011c, B:36:0x0124, B:48:0x0187, B:52:0x0198), top: B:26:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016f -> B:24:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x017d -> B:26:0x00e8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        ObjectPool byteArrayPool;
        Object obj2;
        ObjectPool objectPool;
        ProgressListener progressListener;
        Long l;
        WriterScope writerScope;
        ByteReadChannel byteReadChannel;
        byte[] bArr;
        Object obj3;
        long j2;
        ObjectPool objectPool2;
        Object obj4;
        ByteReadChannel byteReadChannel2;
        WriterScope writerScope2;
        Long l2;
        byte[] bArr2;
        long j3;
        int i;
        long j4;
        long j5;
        WriterScope writerScope3;
        Long l3;
        Object obj5;
        int intValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 2;
        int i4 = 1;
        if (i2 == 0) {
            j = 0;
            ResultKt.throwOnFailure(obj);
            WriterScope writerScope4 = (WriterScope) this.L$0;
            byteArrayPool = ByteArrayPoolKt.getByteArrayPool();
            ByteReadChannel byteReadChannel3 = this.$this_observable;
            ProgressListener progressListener2 = this.$listener;
            Long l4 = this.$contentLength;
            Object borrow = byteArrayPool.borrow();
            try {
                objectPool = byteArrayPool;
                progressListener = progressListener2;
                l = l4;
                writerScope = writerScope4;
                byteReadChannel = byteReadChannel3;
                bArr = (byte[]) borrow;
                obj3 = borrow;
                j2 = 0;
                if (byteReadChannel.isClosedForRead()) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                obj2 = borrow;
            }
        } else if (i2 == 1) {
            j = 0;
            long j6 = this.J$0;
            byte[] bArr3 = (byte[]) this.L$6;
            Object obj6 = this.L$5;
            Long l5 = (Long) this.L$4;
            ProgressListener progressListener3 = (ProgressListener) this.L$3;
            ByteReadChannel byteReadChannel4 = (ByteReadChannel) this.L$2;
            objectPool = (ObjectPool) this.L$1;
            writerScope3 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                progressListener = progressListener3;
                obj5 = obj;
                bArr = bArr3;
                byteReadChannel = byteReadChannel4;
                obj3 = obj6;
                l3 = l5;
                j2 = j6;
                intValue = ((Number) obj5).intValue();
                if (intValue > 0) {
                }
            } catch (Throwable th2) {
                th = th2;
                obj2 = obj6;
                byteArrayPool = objectPool;
                byteArrayPool.recycle(obj2);
                throw th;
            }
        } else if (i2 == 2) {
            j = 0;
            i = this.I$0;
            j3 = this.J$0;
            bArr2 = (byte[]) this.L$6;
            obj4 = this.L$5;
            l2 = (Long) this.L$4;
            ProgressListener progressListener4 = (ProgressListener) this.L$3;
            byteReadChannel2 = (ByteReadChannel) this.L$2;
            objectPool2 = (ObjectPool) this.L$1;
            WriterScope writerScope5 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                progressListener = progressListener4;
                writerScope2 = writerScope5;
                j4 = j3 + i;
                this.L$0 = writerScope2;
                this.L$1 = objectPool2;
                this.L$2 = byteReadChannel2;
                this.L$3 = progressListener;
                this.L$4 = l2;
                this.L$5 = obj4;
                this.L$6 = bArr2;
                this.J$0 = j4;
                this.label = 3;
                if (progressListener.onProgress(j4, l2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj4;
                byteArrayPool = objectPool2;
            }
        } else if (i2 == 3) {
            long j7 = this.J$0;
            byte[] bArr4 = (byte[]) this.L$6;
            Object obj7 = this.L$5;
            Long l6 = (Long) this.L$4;
            ProgressListener progressListener5 = (ProgressListener) this.L$3;
            ByteReadChannel byteReadChannel5 = (ByteReadChannel) this.L$2;
            ObjectPool objectPool3 = (ObjectPool) this.L$1;
            j = 0;
            WriterScope writerScope6 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objectPool = objectPool3;
                progressListener = progressListener5;
                j5 = j7;
                bArr = bArr4;
                writerScope = writerScope6;
                byteReadChannel = byteReadChannel5;
                obj3 = obj7;
                l = l6;
            } catch (Throwable th4) {
                th = th4;
                obj2 = obj7;
                byteArrayPool = objectPool3;
            }
            try {
                j2 = j5;
                if (byteReadChannel.isClosedForRead()) {
                    this.L$0 = writerScope;
                    this.L$1 = objectPool;
                    this.L$2 = byteReadChannel;
                    this.L$3 = progressListener;
                    this.L$4 = l;
                    this.L$5 = obj3;
                    this.L$6 = bArr;
                    this.J$0 = j2;
                    this.label = i4;
                    WriterScope writerScope7 = writerScope;
                    long j8 = j2;
                    Long l7 = l;
                    obj5 = ByteReadChannelOperationsKt.readAvailable$default(byteReadChannel, bArr, 0, 0, this, 6, null);
                    if (obj5 != coroutine_suspended) {
                        j2 = j8;
                        writerScope3 = writerScope7;
                        l3 = l7;
                        intValue = ((Number) obj5).intValue();
                        if (intValue > 0) {
                            writerScope = writerScope3;
                            i4 = 1;
                            l = l3;
                            if (byteReadChannel.isClosedForRead()) {
                            }
                        } else {
                            ByteWriteChannel channel = writerScope3.getChannel();
                            this.L$0 = writerScope3;
                            this.L$1 = objectPool;
                            this.L$2 = byteReadChannel;
                            this.L$3 = progressListener;
                            this.L$4 = l3;
                            this.L$5 = obj3;
                            this.L$6 = bArr;
                            this.J$0 = j2;
                            this.I$0 = intValue;
                            this.label = i3;
                            if (ByteWriteChannelOperationsKt.writeFully(channel, bArr, 0, intValue, this) != coroutine_suspended) {
                                ObjectPool objectPool4 = objectPool;
                                byteReadChannel2 = byteReadChannel;
                                i = intValue;
                                Long l8 = l3;
                                bArr2 = bArr;
                                j3 = j2;
                                obj4 = obj3;
                                writerScope2 = writerScope3;
                                l2 = l8;
                                objectPool2 = objectPool4;
                                j4 = j3 + i;
                                this.L$0 = writerScope2;
                                this.L$1 = objectPool2;
                                this.L$2 = byteReadChannel2;
                                this.L$3 = progressListener;
                                this.L$4 = l2;
                                this.L$5 = obj4;
                                this.L$6 = bArr2;
                                this.J$0 = j4;
                                this.label = 3;
                                if (progressListener.onProgress(j4, l2, this) != coroutine_suspended) {
                                    writerScope = writerScope2;
                                    obj3 = obj4;
                                    j5 = j4;
                                    bArr = bArr2;
                                    byteReadChannel = byteReadChannel2;
                                    objectPool = objectPool2;
                                    l = l2;
                                    j2 = j5;
                                    i3 = 2;
                                    i4 = 1;
                                    if (byteReadChannel.isClosedForRead()) {
                                        WriterScope writerScope8 = writerScope;
                                        Long l9 = l;
                                        long j9 = j2;
                                        Throwable closedCause = byteReadChannel.getClosedCause();
                                        ByteWriteChannelOperationsKt.close(writerScope8.getChannel(), closedCause);
                                        if (closedCause == null && j9 == j) {
                                            this.L$0 = objectPool;
                                            this.L$1 = obj3;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.label = 4;
                                        }
                                        obj2 = obj3;
                                        byteArrayPool = objectPool;
                                        Unit unit = Unit.INSTANCE;
                                        byteArrayPool.recycle(obj2);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th5) {
                th = th5;
                obj2 = obj3;
                byteArrayPool = objectPool;
                byteArrayPool.recycle(obj2);
                throw th;
            }
            i3 = 2;
            i4 = 1;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            byteArrayPool = (ObjectPool) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Unit unit2 = Unit.INSTANCE;
                byteArrayPool.recycle(obj2);
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
            }
        }
        byteArrayPool.recycle(obj2);
        throw th;
    }
}
