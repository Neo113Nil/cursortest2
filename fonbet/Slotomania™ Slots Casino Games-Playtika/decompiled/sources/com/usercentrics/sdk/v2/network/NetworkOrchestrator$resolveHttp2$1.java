package com.usercentrics.sdk.v2.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NetworkOrchestrator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.network.NetworkOrchestrator", f = "NetworkOrchestrator.kt", i = {}, l = {38, 40}, m = "resolveHttp2", n = {}, s = {})
/* loaded from: classes.dex */
final class NetworkOrchestrator$resolveHttp2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkOrchestrator$resolveHttp2$1(NetworkOrchestrator networkOrchestrator, Continuation<? super NetworkOrchestrator$resolveHttp2$1> continuation) {
        super(continuation);
        this.this$0 = networkOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resolveHttp2(false, null, this);
    }
}
