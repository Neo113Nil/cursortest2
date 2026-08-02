package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c6 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f25320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(g6 g6Var, long j10, Continuation continuation) {
        super(1, continuation);
        this.f25320a = g6Var;
        this.f25321b = j10;
    }

    public static final String a(long j10) {
        return "TTL of " + j10 + " expired, reconnecting";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new c6(this.f25320a, this.f25321b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new c6(this.f25320a, this.f25321b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        g6 g6Var = this.f25320a;
        final long j10 = this.f25321b;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c6.a(j10);
            }
        }, 7, (Object) null);
        this.f25320a.f25474c.b();
        this.f25320a.a(false);
        return Unit.INSTANCE;
    }
}
