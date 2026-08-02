package io.ktor.network.util;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", i = {}, l = {55, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class Timeout$initTimeoutJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ Timeout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Timeout$initTimeoutJob$1(Timeout timeout, Continuation<? super Timeout$initTimeoutJob$1> continuation) {
        super(2, continuation);
        this.this$0 = timeout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Timeout$initTimeoutJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Timeout$initTimeoutJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Function0 function0;
        Function0 function02;
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                function1 = this.this$0.onTimeout;
                this.label = 3;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            if (this.this$0.isStarted == 0) {
                Timeout timeout = this.this$0;
                function02 = timeout.clock;
                timeout.lastActivityTime = ((Number) function02.invoke()).longValue();
            }
            long j2 = this.this$0.lastActivityTime;
            j = this.this$0.timeoutMs;
            function0 = this.this$0.clock;
            long longValue = (j2 + j) - ((Number) function0.invoke()).longValue();
            if (longValue > 0 || this.this$0.isStarted == 0) {
                this.label = 1;
                if (DelayKt.delay(longValue, this) == coroutine_suspended) {
                    break;
                }
            } else {
                this.label = 2;
                if (YieldKt.yield(this) == coroutine_suspended) {
                }
            }
        }
        return coroutine_suspended;
    }
}
