package bo.app;

import bo.app.kg;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kg extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg f25675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y9 f25676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f25677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(mg mgVar, y9 y9Var, v9 v9Var, long j10, long j11, Continuation continuation) {
        super(1, continuation);
        this.f25675a = mgVar;
        this.f25676b = y9Var;
        this.f25677c = v9Var;
        this.f25678d = j10;
        this.f25679e = j11;
    }

    public static final String a(long j10) {
        return "Performing triggered action after a delay of " + j10 + " ms.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new kg(this.f25675a, this.f25676b, this.f25677c, this.f25678d, this.f25679e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((kg) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        mg mgVar = this.f25675a;
        final long j10 = this.f25679e;
        BrazeLogger.brazelog$default(brazeLogger, (Object) mgVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kg.a(j10);
            }
        }, 7, (Object) null);
        y9 y9Var = this.f25676b;
        mg mgVar2 = this.f25675a;
        y9Var.a(mgVar2.f25764a, mgVar2.f25766c, this.f25677c, this.f25678d);
        return Unit.INSTANCE;
    }
}
