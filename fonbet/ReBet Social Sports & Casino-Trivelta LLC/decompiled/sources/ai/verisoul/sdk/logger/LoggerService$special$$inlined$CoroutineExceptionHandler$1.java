package ai.verisoul.sdk.logger;

import Ph.M;
import android.util.Log;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ai/verisoul/sdk/logger/LoggerService$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "LPh/M;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 LoggerService.kt\nai/verisoul/sdk/logger/LoggerService\n*L\n1#1,110:1\n37#2,2:111\n*E\n"})
/* loaded from: classes.dex */
public final class LoggerService$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements M {
    public LoggerService$special$$inlined$CoroutineExceptionHandler$1(M.a aVar) {
        super(aVar);
    }

    @Override // Ph.M
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Log.e("Verisoul-LoggerService", "Uncaught exception in LoggerService scope: " + exception.getMessage(), exception);
    }
}
