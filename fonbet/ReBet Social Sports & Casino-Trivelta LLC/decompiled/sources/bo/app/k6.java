package bo.app;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.Q;
import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25653a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f25655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(BufferedReader bufferedReader, Continuation continuation) {
        super(2, continuation);
        this.f25655c = bufferedReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k6 k6Var = new k6(this.f25655c, continuation);
        k6Var.f25654b = obj;
        return k6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k6 k6Var = new k6(this.f25655c, (Continuation) obj2);
        k6Var.f25654b = (Rh.y) obj;
        return k6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Rh.y yVar = (Rh.y) this.f25654b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25653a;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (Q.i(yVar)) {
            L b10 = C1452g0.b();
            j6 j6Var = new j6(this.f25655c, yVar, null);
            this.f25654b = yVar;
            this.f25653a = 1;
            if (AbstractC1455i.g(b10, j6Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
