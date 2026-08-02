package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rd extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xd f25991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(xd xdVar, Continuation continuation) {
        super(2, continuation);
        this.f25991b = xdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new rd(this.f25991b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rd(this.f25991b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25990a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            xd xdVar = this.f25991b;
            this.f25990a = 1;
            if (xdVar.a() == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
