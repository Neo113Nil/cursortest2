package ai.verisoul.sdk.utils;

import Ph.h1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001an\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032N\u0010\u0004\u001aJ\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"suspendWithTimeout", "T", "timeoutMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "resume", "", "resumeWithException", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendCancellableCoroutineKt {
    @Nullable
    public static final <T> Object suspendWithTimeout(long j10, @NotNull Function2<? super Function1<? super T, Unit>, ? super Function1<? super Throwable, Unit>, Unit> function2, @NotNull Continuation<? super T> continuation) {
        return h1.c(j10, new SuspendCancellableCoroutineKt$suspendWithTimeout$2(function2, null), continuation);
    }

    public static /* synthetic */ Object suspendWithTimeout$default(long j10, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 10000;
        }
        return suspendWithTimeout(j10, function2, continuation);
    }
}
