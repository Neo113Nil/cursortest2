package bo.app;

import Ph.AbstractC1440a0;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f25900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(q2 q2Var, Continuation continuation) {
        super(2, continuation);
        this.f25900b = q2Var;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p2(this.f25900b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p2(this.f25900b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25899a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            long j10 = q2.f25925o;
            this.f25899a = 1;
            if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q2.f25924n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.p2.a();
            }
        }, 14, (Object) null);
        Braze.INSTANCE.getInstance(this.f25900b.f25927a).requestImmediateDataFlush();
        return Unit.INSTANCE;
    }
}
