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
public final class z5 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f26346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(g6 g6Var, Continuation continuation) {
        super(1, continuation);
        this.f26346a = g6Var;
    }

    public static final String a() {
        return "Ending subscription after delay";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new z5(this.f26346a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new z5(this.f26346a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f26346a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Hd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.z5.a();
            }
        }, 7, (Object) null);
        this.f26346a.a();
        return Unit.INSTANCE;
    }
}
