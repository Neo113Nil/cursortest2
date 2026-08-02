package ai.verisoul.sdk.logger;

import Ph.AbstractC1440a0;
import Ph.P;
import ai.verisoul.sdk.VerisoulEnvironment;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.logger.LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1", f = "LoggerService.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ VerisoulEnvironment $environment;
    int label;
    final /* synthetic */ LoggerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1(LoggerService loggerService, VerisoulEnvironment verisoulEnvironment, Continuation<? super LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1> continuation) {
        super(2, continuation);
        this.this$0 = loggerService;
        this.$environment = verisoulEnvironment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1(this.this$0, this.$environment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((LoggerService$initializeWebSocket$1$onFailure$reconnectJob$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long j10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            j10 = this.this$0.oneSecond;
            this.label = 1;
            if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.initializeWebSocket(this.$environment);
        return Unit.INSTANCE;
    }
}
