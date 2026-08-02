package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConnectUtilsJvm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", i = {0}, l = {21}, m = "tcpConnect", n = {"result$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class ConnectUtilsJvmKt$tcpConnect$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ConnectUtilsJvmKt$tcpConnect$1(Continuation<? super ConnectUtilsJvmKt$tcpConnect$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConnectUtilsJvmKt.tcpConnect(null, null, null, this);
    }
}
