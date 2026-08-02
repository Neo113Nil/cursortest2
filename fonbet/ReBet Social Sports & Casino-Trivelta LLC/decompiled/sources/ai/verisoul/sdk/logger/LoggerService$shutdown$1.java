package ai.verisoul.sdk.logger;

import Ph.C0;
import Ph.F0;
import Ph.P;
import Rh.B;
import Rh.j;
import com.plaid.internal.EnumC3631g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.logger.LoggerService$shutdown$1", f = "LoggerService.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLoggerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService$shutdown$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1855#2,2:264\n*S KotlinDebug\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService$shutdown$1\n*L\n253#1:264,2\n*E\n"})
/* loaded from: classes.dex */
public final class LoggerService$shutdown$1 extends SuspendLambda implements Function2<P, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ LoggerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerService$shutdown$1(LoggerService loggerService, Continuation<? super LoggerService$shutdown$1> continuation) {
        super(2, continuation);
        this.this$0 = loggerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LoggerService$shutdown$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Boolean> continuation) {
        return ((LoggerService$shutdown$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C0 c02;
        List list;
        List<C0> list2;
        List list3;
        j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c02 = this.this$0.processorJob;
            if (c02 != null) {
                this.label = 1;
                if (F0.f(c02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.processorJob = null;
        list = this.this$0.managedJobs;
        LoggerService loggerService = this.this$0;
        synchronized (list) {
            try {
                list2 = loggerService.managedJobs;
                for (C0 c03 : list2) {
                    if (c03 != null) {
                        C0.a.b(c03, null, 1, null);
                    }
                }
                list3 = loggerService.managedJobs;
                list3.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.this$0.closeWebSocket();
        jVar = this.this$0.logChannel;
        return Boxing.boxBoolean(B.a.a(jVar, null, 1, null));
    }
}
