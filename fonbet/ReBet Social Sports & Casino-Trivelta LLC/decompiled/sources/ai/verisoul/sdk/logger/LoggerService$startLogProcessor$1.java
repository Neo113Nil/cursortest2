package ai.verisoul.sdk.logger;

import Ph.P;
import Ph.Q;
import Ph.h1;
import Rh.j;
import Rh.n;
import com.plaid.internal.EnumC3631g;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.logger.LoggerService$startLogProcessor$1", f = "LoggerService.kt", i = {0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nLoggerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService$startLogProcessor$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1#2:264\n1855#3,2:265\n*S KotlinDebug\n*F\n+ 1 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService$startLogProcessor$1\n*L\n156#1:265,2\n*E\n"})
/* loaded from: classes.dex */
public final class LoggerService$startLogProcessor$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoggerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerService$startLogProcessor$1(LoggerService loggerService, Continuation<? super LoggerService$startLogProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = loggerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LoggerService$startLogProcessor$1 loggerService$startLogProcessor$1 = new LoggerService$startLogProcessor$1(this.this$0, continuation);
        loggerService$startLogProcessor$1.L$0 = obj;
        return loggerService$startLogProcessor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((LoggerService$startLogProcessor$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x005c */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[LOOP:1: B:20:0x007e->B:22:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        P p10;
        long j10;
        j jVar;
        LinkedBlockingQueue linkedBlockingQueue;
        String str;
        LinkedBlockingQueue linkedBlockingQueue2;
        j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            p10 = (P) this.L$0;
            if (Q.i(p10)) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p10 = (P) this.L$0;
            ResultKt.throwOnFailure(obj);
            ChildLogData childLogData = (ChildLogData) obj;
            ArrayList<ChildLogData> arrayList = new ArrayList();
            if (childLogData != null) {
                Boxing.boxBoolean(arrayList.add(childLogData));
            }
            while (!jVar.isEmpty()) {
                jVar2 = this.this$0.logChannel;
                ChildLogData childLogData2 = (ChildLogData) n.f(jVar2.i());
                if (childLogData2 != null) {
                    Boxing.boxBoolean(arrayList.add(childLogData2));
                }
            }
            LoggerService loggerService = this.this$0;
            for (ChildLogData childLogData3 : arrayList) {
                linkedBlockingQueue2 = loggerService.batch;
                linkedBlockingQueue2.put(childLogData3);
            }
            linkedBlockingQueue = this.this$0.batch;
            if (!linkedBlockingQueue.isEmpty()) {
                str = this.this$0.sessionId;
                if (str.length() > 0) {
                    this.this$0.flushLogs();
                }
            }
            if (Q.i(p10)) {
                j10 = this.this$0.logQueueDelay;
                LoggerService$startLogProcessor$1$logItem$1 loggerService$startLogProcessor$1$logItem$1 = new LoggerService$startLogProcessor$1$logItem$1(this.this$0, null);
                this.L$0 = p10;
                this.label = 1;
                obj = h1.d(j10, loggerService$startLogProcessor$1$logItem$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ChildLogData childLogData4 = (ChildLogData) obj;
                ArrayList<ChildLogData> arrayList2 = new ArrayList();
                if (childLogData4 != null) {
                }
                while (!jVar.isEmpty()) {
                }
                LoggerService loggerService2 = this.this$0;
                while (r3.hasNext()) {
                }
                linkedBlockingQueue = this.this$0.batch;
                if (!linkedBlockingQueue.isEmpty()) {
                }
                if (Q.i(p10)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
