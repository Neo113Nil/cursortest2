package ai.verisoul.sdk.logger;

import Ph.P;
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
@DebugMetadata(c = "ai.verisoul.sdk.logger.LoggerService$initialize$sessionTimeoutJob$1", f = "LoggerService.kt", i = {}, l = {60, 64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LoggerService$initialize$sessionTimeoutJob$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoggerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerService$initialize$sessionTimeoutJob$1(LoggerService loggerService, Continuation<? super LoggerService$initialize$sessionTimeoutJob$1> continuation) {
        super(2, continuation);
        this.this$0 = loggerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LoggerService$initialize$sessionTimeoutJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((LoggerService$initialize$sessionTimeoutJob$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (Ph.AbstractC1440a0.a(r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (Ph.AbstractC1440a0.a(r4, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        long j10;
        String str;
        String str2;
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            j10 = this.this$0.sessionIdFetchTimeout;
            this.label = 1;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.closeWebSocket();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        str = this.this$0.sessionId;
        if (str.length() == 0) {
            LoggerService loggerService = this.this$0;
            str2 = loggerService.defaultSessionIdValue;
            loggerService.updateSessionId(str2);
            this.this$0.flushLogs();
            j11 = this.this$0.twoSeconds;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
