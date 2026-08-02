package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatagramSocketImpl.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0}, l = {90}, m = "receiveSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class DatagramSocketImpl$receiveSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatagramSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiveSuspend$1(DatagramSocketImpl datagramSocketImpl, Continuation<? super DatagramSocketImpl$receiveSuspend$1> continuation) {
        super(continuation);
        this.this$0 = datagramSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object receiveSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receiveSuspend = this.this$0.receiveSuspend(null, this);
        return receiveSuspend;
    }
}
