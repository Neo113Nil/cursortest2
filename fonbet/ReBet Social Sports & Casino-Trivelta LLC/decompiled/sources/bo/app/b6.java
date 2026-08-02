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
public final class b6 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f25291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(g6 g6Var, Continuation continuation) {
        super(1, continuation);
        this.f25291a = g6Var;
    }

    public static final String a() {
        return "DDR delay elapsed, reconnecting";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new b6(this.f25291a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new b6(this.f25291a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f25291a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.b6.a();
            }
        }, 7, (Object) null);
        this.f25291a.a(false);
        return Unit.INSTANCE;
    }
}
