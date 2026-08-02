package ai.verisoul.sdk.logger;

import Ph.P;
import Rh.j;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lai/verisoul/sdk/logger/ChildLogData;", "<anonymous>", "(LPh/P;)Lai/verisoul/sdk/logger/ChildLogData;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.logger.LoggerService$startLogProcessor$1$logItem$1", f = "LoggerService.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LoggerService$startLogProcessor$1$logItem$1 extends SuspendLambda implements Function2<P, Continuation<? super ChildLogData>, Object> {
    int label;
    final /* synthetic */ LoggerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerService$startLogProcessor$1$logItem$1(LoggerService loggerService, Continuation<? super LoggerService$startLogProcessor$1$logItem$1> continuation) {
        super(2, continuation);
        this.this$0 = loggerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LoggerService$startLogProcessor$1$logItem$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super ChildLogData> continuation) {
        return ((LoggerService$startLogProcessor$1$logItem$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        jVar = this.this$0.logChannel;
        this.label = 1;
        Object m10 = jVar.m(this);
        return m10 == coroutine_suspended ? coroutine_suspended : m10;
    }
}
