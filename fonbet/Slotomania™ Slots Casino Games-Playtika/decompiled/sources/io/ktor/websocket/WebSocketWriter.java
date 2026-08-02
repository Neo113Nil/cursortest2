package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperations_jvmKt;
import io.ktor.utils.io.pool.ObjectPool;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "", "writeLoop", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drainQueueAndDiscard", "()V", "Lio/ktor/websocket/Frame;", "firstMsg", "drainQueueAndSerialize", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TypedValues.AttributesType.S_FRAME, "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "Lkotlinx/coroutines/channels/Channel;", "", "queue", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Serializer;", "serializer", "Lio/ktor/websocket/Serializer;", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlinx/coroutines/Job;", "writeLoopJob", "Lkotlinx/coroutines/Job;", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketWriter implements CoroutineScope {
    private final CoroutineContext coroutineContext;
    private boolean masking;
    private final ObjectPool<ByteBuffer> pool;
    private final Channel<Object> queue;
    private final Serializer serializer;
    private final ByteWriteChannel writeChannel;
    private final Job writeLoopJob;

    public WebSocketWriter(ByteWriteChannel writeChannel, CoroutineContext coroutineContext, boolean z, ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.writeChannel = writeChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z;
        this.pool = pool;
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.serializer = new Serializer();
        this.writeLoopJob = BuildersKt.launch(this, new CoroutineName("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final void setMasking(boolean z) {
        this.masking = z;
    }

    public /* synthetic */ WebSocketWriter(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteWriteChannel, coroutineContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    public final ObjectPool<ByteBuffer> getPool() {
        return this.pool;
    }

    public final SendChannel<Frame> getOutgoing() {
        return this.queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|69|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        if (r8.flushAndClose(r2) != r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
    
        if (r8.flushAndClose(r0) != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (r8.flushAndClose(r0) != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        r7.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
        r9 = r7.writeChannel;
        r0.L$0 = r8;
        r0.L$1 = null;
        r0.label = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        if (r9.flushAndClose(r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: all -> 0x00ed, ChannelWriteException -> 0x00f0, TryCatch #4 {ChannelWriteException -> 0x00f0, all -> 0x00ed, blocks: (B:21:0x009d, B:32:0x007c, B:34:0x0084, B:36:0x008c, B:39:0x00a9, B:41:0x00ad, B:42:0x00b7, B:43:0x00d0), top: B:20:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0099 -> B:20:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ad -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeLoop(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$1;
        ChannelIterator<Object> it;
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$12;
        ChannelIterator<Object> channelIterator;
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$13;
        Object hasNext;
        if (continuation instanceof WebSocketWriter$writeLoop$1) {
            webSocketWriter$writeLoop$1 = (WebSocketWriter$writeLoop$1) continuation;
            if ((webSocketWriter$writeLoop$1.label & Integer.MIN_VALUE) != 0) {
                webSocketWriter$writeLoop$1.label -= Integer.MIN_VALUE;
                Object obj = webSocketWriter$writeLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (webSocketWriter$writeLoop$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        byteBuffer.clear();
                        it = this.queue.iterator();
                        webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                        webSocketWriter$writeLoop$1.L$1 = it;
                        webSocketWriter$writeLoop$1.label = 1;
                        hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                        if (hasNext != coroutine_suspended) {
                            webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                            channelIterator = it;
                            obj = hasNext;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                            if (((Boolean) obj).booleanValue()) {
                                Object next = channelIterator.next();
                                if (next instanceof Frame) {
                                    try {
                                        webSocketWriter$writeLoop$13.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$13.L$1 = channelIterator;
                                        webSocketWriter$writeLoop$13.label = 2;
                                        obj = drainQueueAndSerialize((Frame) next, byteBuffer, webSocketWriter$writeLoop$13);
                                        if (obj == coroutine_suspended) {
                                        }
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                        it = channelIterator;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$1.L$1 = it;
                                        webSocketWriter$writeLoop$1.label = 1;
                                        hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                        if (hasNext != coroutine_suspended) {
                                        }
                                    } catch (ChannelWriteException e) {
                                        e = e;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                                        this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        ByteWriteChannel byteWriteChannel = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 4;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(th);
                                        this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 5;
                                        break;
                                    }
                                } else {
                                    if (!(next instanceof FlushRequest)) {
                                        throw new IllegalArgumentException("unknown message " + next);
                                    }
                                    Boxing.boxBoolean(((FlushRequest) next).complete());
                                    it = channelIterator;
                                    webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                    webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                    webSocketWriter$writeLoop$1.L$1 = it;
                                    webSocketWriter$writeLoop$1.label = 1;
                                    hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                    if (hasNext != coroutine_suspended) {
                                    }
                                }
                            }
                            this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                            ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                            webSocketWriter$writeLoop$13.L$0 = null;
                            webSocketWriter$writeLoop$13.L$1 = null;
                            webSocketWriter$writeLoop$13.label = 3;
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        ChannelIterator<Object> channelIterator2 = (ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                        ByteBuffer byteBuffer2 = (ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                        channelIterator = channelIterator2;
                        byteBuffer = byteBuffer2;
                        webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                        ByteWriteChannel byteWriteChannel32 = this.writeChannel;
                        webSocketWriter$writeLoop$13.L$0 = null;
                        webSocketWriter$writeLoop$13.L$1 = null;
                        webSocketWriter$writeLoop$13.label = 3;
                        break;
                    case 2:
                        ChannelIterator<Object> channelIterator3 = (ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                        ByteBuffer byteBuffer3 = (ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$14 = webSocketWriter$writeLoop$1;
                        channelIterator = channelIterator3;
                        byteBuffer = byteBuffer3;
                        webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$14;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        it = channelIterator;
                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                        webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                        webSocketWriter$writeLoop$1.L$1 = it;
                        webSocketWriter$writeLoop$1.label = 1;
                        hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                        if (hasNext != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                    case 4:
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        drainQueueAndDiscard();
                        return Unit.INSTANCE;
                    case 6:
                        Throwable th2 = (Throwable) webSocketWriter$writeLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        webSocketWriter$writeLoop$1 = new WebSocketWriter$writeLoop$1(this, continuation);
        Object obj2 = webSocketWriter$writeLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (webSocketWriter$writeLoop$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drainQueueAndDiscard() {
        SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
        while (true) {
            try {
                Object m12704getOrNullimpl = ChannelResult.m12704getOrNullimpl(this.queue.mo12692tryReceivePtdJZtk());
                if (m12704getOrNullimpl != null) {
                    if (!(m12704getOrNullimpl instanceof Frame.Close) && !(m12704getOrNullimpl instanceof Frame.Ping) && !(m12704getOrNullimpl instanceof Frame.Pong)) {
                        if (!(m12704getOrNullimpl instanceof FlushRequest)) {
                            if (!(m12704getOrNullimpl instanceof Frame.Text) && !(m12704getOrNullimpl instanceof Frame.Binary)) {
                                break;
                            }
                        } else {
                            ((FlushRequest) m12704getOrNullimpl).complete();
                        }
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r8.queue, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014e, code lost:
    
        if (r11.flush(r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        if (r10.hasRemaining() == false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0130 -> B:24:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0136 -> B:24:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013c -> B:24:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x014e -> B:23:0x0151). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object drainQueueAndSerialize(Frame frame, ByteBuffer byteBuffer, Continuation<? super Boolean> continuation) {
        WebSocketWriter$drainQueueAndSerialize$1 webSocketWriter$drainQueueAndSerialize$1;
        int i;
        Ref.ObjectRef objectRef;
        int i2;
        ByteBuffer byteBuffer2;
        Ref.ObjectRef objectRef2;
        int i3;
        ByteWriteChannel byteWriteChannel;
        ?? r9;
        Ref.ObjectRef objectRef3;
        ?? m12704getOrNullimpl;
        int i4;
        int i5;
        FlushRequest flushRequest;
        if (continuation instanceof WebSocketWriter$drainQueueAndSerialize$1) {
            webSocketWriter$drainQueueAndSerialize$1 = (WebSocketWriter$drainQueueAndSerialize$1) continuation;
            if ((webSocketWriter$drainQueueAndSerialize$1.label & Integer.MIN_VALUE) != 0) {
                webSocketWriter$drainQueueAndSerialize$1.label -= Integer.MIN_VALUE;
                Object obj = webSocketWriter$drainQueueAndSerialize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketWriter$drainQueueAndSerialize$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    this.serializer.enqueue(frame);
                    r9 = frame instanceof Frame.Close;
                    while (objectRef.element == null) {
                        if (!(m12704getOrNullimpl instanceof FlushRequest)) {
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes()) {
                    }
                    this.serializer.setMasking(this.masking);
                    this.serializer.serialize(byteBuffer);
                    byteBuffer.flip();
                    i3 = r9;
                    byteWriteChannel = this.writeChannel;
                    webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                    webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                    webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                    webSocketWriter$drainQueueAndSerialize$1.label = 1;
                    if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                        objectRef3 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i5 = i6;
                        flushRequest = (FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                            Boxing.boxBoolean(flushRequest.complete());
                        }
                        return Boxing.boxBoolean(i5 != 0);
                    }
                    int i7 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                    FlushRequest flushRequest2 = (FlushRequest) webSocketWriter$drainQueueAndSerialize$1.L$2;
                    objectRef2 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                    byteBuffer2 = (ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    int i8 = i7;
                    flushRequest2.complete();
                    objectRef2.element = null;
                    i4 = i8;
                    objectRef = objectRef2;
                    byteBuffer = byteBuffer2;
                    if (objectRef.element == null || i4 != 0) {
                        i3 = i4;
                    }
                    byteBuffer.compact();
                    r9 = i4;
                    while (objectRef.element == null && r9 == 0 && this.serializer.getRemainingCapacity() > 0 && (m12704getOrNullimpl = ChannelResult.m12704getOrNullimpl(this.queue.mo12692tryReceivePtdJZtk())) != 0) {
                        if (!(m12704getOrNullimpl instanceof FlushRequest)) {
                            objectRef.element = m12704getOrNullimpl;
                        } else if (m12704getOrNullimpl instanceof Frame.Close) {
                            this.serializer.enqueue((Frame) m12704getOrNullimpl);
                            r9 = 1;
                        } else {
                            if (!(m12704getOrNullimpl instanceof Frame)) {
                                throw new IllegalArgumentException("unknown message " + m12704getOrNullimpl);
                            }
                            this.serializer.enqueue((Frame) m12704getOrNullimpl);
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes() || byteBuffer.position() != 0) {
                        this.serializer.setMasking(this.masking);
                        this.serializer.serialize(byteBuffer);
                        byteBuffer.flip();
                        i3 = r9;
                        byteWriteChannel = this.writeChannel;
                        webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                        webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                        webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                        webSocketWriter$drainQueueAndSerialize$1.label = 1;
                        if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                            byteBuffer2 = byteBuffer;
                            objectRef2 = objectRef;
                            i2 = i3;
                            i4 = i2;
                            if (!this.serializer.getHasOutstandingBytes()) {
                                i4 = i2;
                                if (!byteBuffer2.hasRemaining()) {
                                    flushRequest2 = (FlushRequest) objectRef2.element;
                                    i4 = i2;
                                    if (flushRequest2 != null) {
                                        ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                        webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer2;
                                        webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef2;
                                        webSocketWriter$drainQueueAndSerialize$1.L$2 = flushRequest2;
                                        webSocketWriter$drainQueueAndSerialize$1.I$0 = i2;
                                        webSocketWriter$drainQueueAndSerialize$1.label = 2;
                                        i8 = i2;
                                    }
                                }
                            }
                            objectRef = objectRef2;
                            byteBuffer = byteBuffer2;
                            if (objectRef.element == null) {
                            }
                            i3 = i4;
                        }
                        return coroutine_suspended;
                    }
                    ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                    webSocketWriter$drainQueueAndSerialize$1.L$0 = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.L$1 = null;
                    webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                    webSocketWriter$drainQueueAndSerialize$1.I$0 = r9;
                    webSocketWriter$drainQueueAndSerialize$1.label = 3;
                    if (byteWriteChannel3.flush(webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                        objectRef3 = objectRef;
                        i5 = r9;
                        flushRequest = (FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                        }
                        return Boxing.boxBoolean(i5 != 0);
                    }
                    return coroutine_suspended;
                }
                int i9 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                ByteBuffer byteBuffer3 = (ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                ResultKt.throwOnFailure(obj);
                byteBuffer2 = byteBuffer3;
                objectRef2 = objectRef4;
                i2 = i9;
                i4 = i2;
                if (!this.serializer.getHasOutstandingBytes()) {
                }
                objectRef = objectRef2;
                byteBuffer = byteBuffer2;
                if (objectRef.element == null) {
                }
                i3 = i4;
            }
        }
        webSocketWriter$drainQueueAndSerialize$1 = new WebSocketWriter$drainQueueAndSerialize$1(this, continuation);
        Object obj2 = webSocketWriter$drainQueueAndSerialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketWriter$drainQueueAndSerialize$1.label;
        if (i != 0) {
        }
    }

    public final Object send(Frame frame, Continuation<? super Unit> continuation) {
        Object send = this.queue.send(frame, continuation);
        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r5.await(r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r9.send(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flush(Continuation<? super Unit> continuation) {
        WebSocketWriter$flush$1 webSocketWriter$flush$1;
        ?? r2;
        FlushRequest flushRequest;
        FlushRequest flushRequest2;
        Job job;
        try {
            if (continuation instanceof WebSocketWriter$flush$1) {
                webSocketWriter$flush$1 = (WebSocketWriter$flush$1) continuation;
                if ((webSocketWriter$flush$1.label & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$flush$1.label -= Integer.MIN_VALUE;
                    Object obj = webSocketWriter$flush$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = webSocketWriter$flush$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        flushRequest = new FlushRequest((Job) getCoroutineContext().get(Job.INSTANCE));
                        try {
                            Channel<Object> channel = this.queue;
                            webSocketWriter$flush$1.L$0 = flushRequest;
                            webSocketWriter$flush$1.L$1 = flushRequest;
                            webSocketWriter$flush$1.label = 1;
                        } catch (ClosedSendChannelException unused) {
                            flushRequest2 = flushRequest;
                            flushRequest.complete();
                            job = this.writeLoopJob;
                            webSocketWriter$flush$1.L$0 = flushRequest2;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 2;
                            if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                                flushRequest = flushRequest2;
                                flushRequest2 = flushRequest;
                                webSocketWriter$flush$1.L$0 = null;
                                webSocketWriter$flush$1.L$1 = null;
                                webSocketWriter$flush$1.label = 3;
                            }
                            return coroutine_suspended;
                        }
                    } else if (r2 == 1) {
                        flushRequest = (FlushRequest) webSocketWriter$flush$1.L$1;
                        flushRequest2 = (FlushRequest) webSocketWriter$flush$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (ClosedSendChannelException unused2) {
                            flushRequest.complete();
                            job = this.writeLoopJob;
                            webSocketWriter$flush$1.L$0 = flushRequest2;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 2;
                            if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        webSocketWriter$flush$1.L$0 = null;
                        webSocketWriter$flush$1.L$1 = null;
                        webSocketWriter$flush$1.label = 3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        flushRequest = (FlushRequest) webSocketWriter$flush$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    flushRequest2 = flushRequest;
                    webSocketWriter$flush$1.L$0 = null;
                    webSocketWriter$flush$1.L$1 = null;
                    webSocketWriter$flush$1.label = 3;
                }
            }
            if (r2 != 0) {
            }
            flushRequest2 = flushRequest;
            webSocketWriter$flush$1.L$0 = null;
            webSocketWriter$flush$1.L$1 = null;
            webSocketWriter$flush$1.label = 3;
        } catch (Throwable th) {
            r2.complete();
            throw th;
        }
        webSocketWriter$flush$1 = new WebSocketWriter$flush$1(this, continuation);
        Object obj2 = webSocketWriter$flush$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = webSocketWriter$flush$1.label;
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "complete", "()Z", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CompletableJob;", "done", "Lkotlinx/coroutines/CompletableJob;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class FlushRequest {
        private final CompletableJob done;

        public FlushRequest(Job job) {
            this.done = JobKt.Job(job);
        }

        public final boolean complete() {
            return this.done.complete();
        }

        public final Object await(Continuation<? super Unit> continuation) {
            Object join = this.done.join(continuation);
            return join == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : Unit.INSTANCE;
        }
    }
}
