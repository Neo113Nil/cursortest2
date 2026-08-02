package com.usercentrics.sdk.v2.async.dispatcher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Dispatcher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.async.dispatcher.Dispatcher", f = "Dispatcher.kt", i = {0, 0}, l = {55}, m = "runAsyncScope", n = {"this", "dispatcherCallback"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class Dispatcher$runAsyncScope$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Dispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dispatcher$runAsyncScope$1(Dispatcher dispatcher, Continuation<? super Dispatcher$runAsyncScope$1> continuation) {
        super(continuation);
        this.this$0 = dispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runAsyncScope;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runAsyncScope = this.this$0.runAsyncScope(null, null, this);
        return runAsyncScope;
    }
}
