package io.ktor.websocket;

import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.websocket.Frame;
import io.ktor.websocket.RawWebSocketCommon;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {62, 64, 65, 84, 84, 84, 84}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (r10.flushAndClose(r9) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        if (r10.flushAndClose(r9) != r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        if (r10.flushAndClose(r9) != r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:25:0x0025, B:26:0x008b, B:28:0x003c, B:32:0x0051, B:34:0x0055, B:38:0x0075, B:41:0x00bf, B:43:0x00c3, B:44:0x00ce, B:45:0x00e7, B:46:0x008f, B:55:0x002b, B:56:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:25:0x0025, B:26:0x008b, B:28:0x003c, B:32:0x0051, B:34:0x0055, B:38:0x0075, B:41:0x00bf, B:43:0x00c3, B:44:0x00ce, B:45:0x00e7, B:46:0x008f, B:55:0x002b, B:56:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:25:0x0025, B:26:0x008b, B:28:0x003c, B:32:0x0051, B:34:0x0055, B:38:0x0075, B:41:0x00bf, B:43:0x00c3, B:44:0x00ce, B:45:0x00e7, B:46:0x008f, B:55:0x002b, B:56:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0087 -> B:20:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c3 -> B:22:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel channel;
        Channel channel2;
        ByteWriteChannel byteWriteChannel;
        Channel channel3;
        Channel channel4;
        ByteWriteChannel byteWriteChannel2;
        Channel channel5;
        Object obj2;
        ByteWriteChannel byteWriteChannel3;
        ByteWriteChannel byteWriteChannel4;
        Channel channel6;
        Channel channel7;
        Channel channel8;
        ByteWriteChannel byteWriteChannel5;
        Channel channel9;
        ByteWriteChannel byteWriteChannel6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (ChannelWriteException e) {
            channel3 = this.this$0._outgoing;
            channel3.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
            channel4 = this.this$0._outgoing;
            channel4.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel2 = this.this$0.output;
            this.L$0 = null;
            this.label = 5;
        } catch (Throwable th) {
            channel = this.this$0._outgoing;
            channel.close(th);
            channel2 = this.this$0._outgoing;
            channel2.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel = this.this$0.output;
            this.L$0 = null;
            this.label = 6;
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                channel6 = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel6.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (obj instanceof Frame) {
                    if (!(obj instanceof RawWebSocketCommon.FlushRequest)) {
                        throw new IllegalArgumentException("unknown message " + obj);
                    }
                    Boxing.boxBoolean(((RawWebSocketCommon.FlushRequest) obj).complete());
                    channel6 = this.this$0._outgoing;
                    this.L$0 = null;
                    this.label = 1;
                    obj = channel6.receive(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (obj instanceof Frame) {
                        byteWriteChannel4 = this.this$0.output;
                        this.L$0 = obj;
                        this.label = 2;
                        if (RawWebSocketCommonKt.writeFrame(byteWriteChannel4, (Frame) obj, this.this$0.getMasking(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        byteWriteChannel3 = this.this$0.output;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (byteWriteChannel3.flush(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj2 instanceof Frame.Close) {
                            channel7 = this.this$0._outgoing;
                            SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                            channel8 = this.this$0._outgoing;
                            channel8.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel5 = this.this$0.output;
                            this.L$0 = null;
                            this.label = 4;
                            break;
                        }
                        channel6 = this.this$0._outgoing;
                        this.L$0 = null;
                        this.label = 1;
                        obj = channel6.receive(this);
                        if (obj == coroutine_suspended) {
                        }
                        if (obj instanceof Frame) {
                        }
                    }
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                if (obj instanceof Frame) {
                }
                break;
            case 2:
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                byteWriteChannel3 = this.this$0.output;
                this.L$0 = obj2;
                this.label = 3;
                if (byteWriteChannel3.flush(this) == coroutine_suspended) {
                }
                if (obj2 instanceof Frame.Close) {
                }
                channel6 = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel6.receive(this);
                if (obj == coroutine_suspended) {
                }
                if (obj instanceof Frame) {
                }
                break;
            case 3:
                obj2 = this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (obj2 instanceof Frame.Close) {
                    }
                    channel6 = this.this$0._outgoing;
                    this.L$0 = null;
                    this.label = 1;
                    obj = channel6.receive(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (obj instanceof Frame) {
                    }
                } catch (Throwable th2) {
                    channel9 = this.this$0._outgoing;
                    channel9.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                    byteWriteChannel6 = this.this$0.output;
                    this.L$0 = th2;
                    this.label = 7;
                    if (byteWriteChannel6.flushAndClose(this) != coroutine_suspended) {
                        throw th2;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
                ResultKt.throwOnFailure(obj);
                while (true) {
                    channel5 = this.this$0._outgoing;
                    Object m12704getOrNullimpl = ChannelResult.m12704getOrNullimpl(channel5.mo12692tryReceivePtdJZtk());
                    if (m12704getOrNullimpl == null) {
                        return Unit.INSTANCE;
                    }
                    if (m12704getOrNullimpl instanceof RawWebSocketCommon.FlushRequest) {
                        Boxing.boxBoolean(((RawWebSocketCommon.FlushRequest) m12704getOrNullimpl).complete());
                    }
                }
            case 7:
                Throwable th3 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
