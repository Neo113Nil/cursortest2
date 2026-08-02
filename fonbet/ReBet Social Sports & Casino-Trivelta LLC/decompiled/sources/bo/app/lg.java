package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lg extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y9 f25737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mg f25738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f25739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(y9 y9Var, mg mgVar, v9 v9Var, long j10, Continuation continuation) {
        super(1, continuation);
        this.f25737a = y9Var;
        this.f25738b = mgVar;
        this.f25739c = v9Var;
        this.f25740d = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new lg(this.f25737a, this.f25738b, this.f25739c, this.f25740d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lg) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y9 y9Var = this.f25737a;
        mg mgVar = this.f25738b;
        y9Var.a(mgVar.f25764a, mgVar.f25766c, this.f25739c, this.f25740d);
        return Unit.INSTANCE;
    }
}
