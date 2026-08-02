package com.usercentrics.sdk.v2.async.dispatcher;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.async.dispatcher.Dispatcher$dispatchWithTimeout$1", f = "Dispatcher.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Dispatcher$dispatchWithTimeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<DispatcherScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ DispatcherCallback<T> $dispatcherCallback;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ Dispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Dispatcher$dispatchWithTimeout$1(long j, Dispatcher dispatcher, Function2<? super DispatcherScope, ? super Continuation<? super T>, ? extends Object> function2, DispatcherCallback<T> dispatcherCallback, Continuation<? super Dispatcher$dispatchWithTimeout$1> continuation) {
        super(2, continuation);
        this.$timeout = j;
        this.this$0 = dispatcher;
        this.$block = function2;
        this.$dispatcherCallback = dispatcherCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Dispatcher$dispatchWithTimeout$1(this.$timeout, this.this$0, this.$block, this.$dispatcherCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Dispatcher$dispatchWithTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (TimeoutKt.withTimeoutOrNull(this.$timeout, new AnonymousClass1(this.this$0, this.$block, this.$dispatcherCallback, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Dispatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.usercentrics.sdk.v2.async.dispatcher.Dispatcher$dispatchWithTimeout$1$1", f = "Dispatcher.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
    /* renamed from: com.usercentrics.sdk.v2.async.dispatcher.Dispatcher$dispatchWithTimeout$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ Function2<DispatcherScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ DispatcherCallback<T> $dispatcherCallback;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ Dispatcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Dispatcher dispatcher, Function2<? super DispatcherScope, ? super Continuation<? super T>, ? extends Object> function2, DispatcherCallback<T> dispatcherCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dispatcher;
            this.$block = function2;
            this.$dispatcherCallback = dispatcherCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, this.$dispatcherCallback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Job launch$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Dispatcher dispatcher = this.this$0;
            Function2<DispatcherScope, Continuation<? super T>, Object> function2 = this.$block;
            DispatcherCallback<T> dispatcherCallback = this.$dispatcherCallback;
            this.L$0 = coroutineScope;
            this.L$1 = dispatcher;
            this.L$2 = function2;
            this.L$3 = dispatcherCallback;
            this.label = 1;
            AnonymousClass1 anonymousClass1 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Dispatcher$dispatchWithTimeout$1$1$1$job$1(dispatcher, function2, dispatcherCallback, null), 3, null);
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.v2.async.dispatcher.Dispatcher$dispatchWithTimeout$1$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Job.DefaultImpls.cancel$default(Job.this, (CancellationException) null, 1, (Object) null);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }
}
