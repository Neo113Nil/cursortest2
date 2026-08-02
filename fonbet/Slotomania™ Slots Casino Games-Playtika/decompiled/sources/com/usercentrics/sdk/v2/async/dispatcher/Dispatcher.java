package com.usercentrics.sdk.v2.async.dispatcher;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J@\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011JH\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0013\u001a\u00020\u00142'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002JK\u0010\u0019\u001a\u00020\u0010\"\u0004\b\u0000\u0010\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0002\b\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "asyncDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "dispatch", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherCallback;", "T", "block", "Lkotlin/Function2;", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherCallback;", "dispatchMain", "", "Lkotlin/Function0;", "dispatchWithTimeout", "timeout", "", "(JLkotlin/jvm/functions/Function2;)Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherCallback;", "rethrowAssertion", "cause", "", "runAsyncScope", "dispatcherCallback", "(Lkotlin/jvm/functions/Function2;Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Dispatcher {
    private final CoroutineDispatcher asyncDispatcher;
    private final CoroutineDispatcher mainDispatcher;

    public Dispatcher(CoroutineDispatcher mainDispatcher, CoroutineDispatcher asyncDispatcher) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(asyncDispatcher, "asyncDispatcher");
        this.mainDispatcher = mainDispatcher.limitedParallelism(1);
        this.asyncDispatcher = asyncDispatcher.limitedParallelism(1);
    }

    public final <T> DispatcherCallback<T> dispatch(Function2<? super DispatcherScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DispatcherCallback<T> dispatcherCallback = new DispatcherCallback<>();
        BuildersKt__Builders_commonKt.launch$default(DispatcherKt.scope(this.asyncDispatcher), null, null, new Dispatcher$dispatch$1(this, block, dispatcherCallback, null), 3, null);
        return dispatcherCallback;
    }

    public final void dispatchMain(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt__Builders_commonKt.launch$default(DispatcherKt.scope(this.mainDispatcher), null, null, new Dispatcher$dispatchMain$1(block, null), 3, null);
    }

    public final <T> DispatcherCallback<T> dispatchWithTimeout(long timeout, Function2<? super DispatcherScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DispatcherCallback<T> dispatcherCallback = new DispatcherCallback<>();
        BuildersKt__Builders_commonKt.launch$default(DispatcherKt.scope(this.asyncDispatcher), null, null, new Dispatcher$dispatchWithTimeout$1(timeout, this, block, dispatcherCallback, null), 3, null);
        return dispatcherCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object runAsyncScope(Function2<? super DispatcherScope, ? super Continuation<? super T>, ? extends Object> function2, DispatcherCallback<T> dispatcherCallback, Continuation<? super Unit> continuation) {
        Dispatcher$runAsyncScope$1 dispatcher$runAsyncScope$1;
        int i;
        Dispatcher dispatcher;
        Object m11180constructorimpl;
        if (continuation instanceof Dispatcher$runAsyncScope$1) {
            dispatcher$runAsyncScope$1 = (Dispatcher$runAsyncScope$1) continuation;
            if ((dispatcher$runAsyncScope$1.label & Integer.MIN_VALUE) != 0) {
                dispatcher$runAsyncScope$1.label -= Integer.MIN_VALUE;
                Object obj = dispatcher$runAsyncScope$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dispatcher$runAsyncScope$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DispatcherScope dispatcherScope = new DispatcherScope(this.asyncDispatcher);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Dispatcher dispatcher2 = this;
                        dispatcher$runAsyncScope$1.L$0 = this;
                        dispatcher$runAsyncScope$1.L$1 = dispatcherCallback;
                        dispatcher$runAsyncScope$1.label = 1;
                        obj = function2.invoke(dispatcherScope, dispatcher$runAsyncScope$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dispatcher = this;
                    } catch (Throwable th) {
                        th = th;
                        dispatcher = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        dispatcher.rethrowAssertion(Result.m11183exceptionOrNullimpl(m11180constructorimpl));
                        dispatcherCallback.setResult$usercentrics_release(m11180constructorimpl);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dispatcherCallback = (DispatcherCallback) dispatcher$runAsyncScope$1.L$1;
                    dispatcher = (Dispatcher) dispatcher$runAsyncScope$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        dispatcher.rethrowAssertion(Result.m11183exceptionOrNullimpl(m11180constructorimpl));
                        dispatcherCallback.setResult$usercentrics_release(m11180constructorimpl);
                        return Unit.INSTANCE;
                    }
                }
                m11180constructorimpl = Result.m11180constructorimpl(obj);
                dispatcher.rethrowAssertion(Result.m11183exceptionOrNullimpl(m11180constructorimpl));
                dispatcherCallback.setResult$usercentrics_release(m11180constructorimpl);
                return Unit.INSTANCE;
            }
        }
        dispatcher$runAsyncScope$1 = new Dispatcher$runAsyncScope$1(this, continuation);
        Object obj2 = dispatcher$runAsyncScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dispatcher$runAsyncScope$1.label;
        if (i != 0) {
        }
        m11180constructorimpl = Result.m11180constructorimpl(obj2);
        dispatcher.rethrowAssertion(Result.m11183exceptionOrNullimpl(m11180constructorimpl));
        dispatcherCallback.setResult$usercentrics_release(m11180constructorimpl);
        return Unit.INSTANCE;
    }

    private final void rethrowAssertion(Throwable cause) {
        if (cause instanceof AssertionError) {
            throw cause;
        }
    }
}
