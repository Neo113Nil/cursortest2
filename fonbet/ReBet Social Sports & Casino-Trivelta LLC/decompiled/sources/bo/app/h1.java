package bo.app;

import Ph.P;
import Ph.Q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25500a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Number f25502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f25503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Number number, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f25502c = number;
        this.f25503d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h1 h1Var = new h1(this.f25502c, this.f25503d, continuation);
        h1Var.f25501b = obj;
        return h1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r8.invoke(r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (Ph.AbstractC1440a0.a(r5, r7) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25501b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25500a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = this.f25502c.longValue();
            this.f25501b = p10;
            this.f25500a = 1;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (Q.i(p10)) {
            Function1 function1 = this.f25503d;
            this.f25501b = SpillingKt.nullOutSpilledVariable(p10);
            this.f25500a = 2;
        }
        return Unit.INSTANCE;
    }
}
