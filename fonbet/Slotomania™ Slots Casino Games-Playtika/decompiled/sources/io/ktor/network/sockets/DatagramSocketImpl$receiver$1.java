package io.ktor.network.sockets;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: DatagramSocketImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/network/sockets/Datagram;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {52, 52}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class DatagramSocketImpl$receiver$1 extends SuspendLambda implements Function2<ProducerScope<? super Datagram>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DatagramSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiver$1(DatagramSocketImpl datagramSocketImpl, Continuation<? super DatagramSocketImpl$receiver$1> continuation) {
        super(2, continuation);
        this.this$0 = datagramSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(this.this$0, continuation);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Datagram> producerScope, Continuation<? super Unit> continuation) {
        return ((DatagramSocketImpl$receiver$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:9:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        ProducerScope producerScope2;
        SendChannel sendChannel;
        Object receiveImpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
            } else {
                if (i == 1) {
                    sendChannel = (SendChannel) this.L$1;
                    producerScope2 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = producerScope2;
                    this.L$1 = null;
                    this.label = 2;
                    if (sendChannel.send(obj, this) != coroutine_suspended) {
                        producerScope = producerScope2;
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope3;
            }
            sendChannel = producerScope.getChannel();
            this.L$0 = producerScope;
            this.L$1 = sendChannel;
            this.label = 1;
            receiveImpl = this.this$0.receiveImpl(this);
            if (receiveImpl == coroutine_suspended) {
                return coroutine_suspended;
            }
            producerScope2 = producerScope;
            obj = receiveImpl;
            this.L$0 = producerScope2;
            this.L$1 = null;
            this.label = 2;
            if (sendChannel.send(obj, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (ClosedChannelException | IOException unused) {
            return Unit.INSTANCE;
        }
    }
}
