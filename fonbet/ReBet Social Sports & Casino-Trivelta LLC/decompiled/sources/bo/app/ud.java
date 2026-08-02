package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ud extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xd f26121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(xd xdVar, Continuation continuation) {
        super(1, continuation);
        this.f26121b = xdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ud(this.f26121b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ud(this.f26121b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26120a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            xd xdVar = this.f26121b;
            this.f26120a = 1;
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
