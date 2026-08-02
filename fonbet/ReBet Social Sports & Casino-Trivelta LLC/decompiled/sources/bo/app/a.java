package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Wh.h f25237a;

    /* renamed from: b, reason: collision with root package name */
    public int f25238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f25239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f25239c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f25239c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f25239c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Wh.h hVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25238b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Wh.h hVar2 = this.f25239c.f25285a;
            this.f25237a = hVar2;
            this.f25238b = 1;
            if (hVar2.e(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = hVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.f25237a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return Unit.INSTANCE;
        } finally {
            hVar.release();
        }
    }
}
