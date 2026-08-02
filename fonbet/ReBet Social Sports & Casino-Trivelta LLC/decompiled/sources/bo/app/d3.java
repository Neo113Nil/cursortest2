package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f25386a = brazeUser;
        this.f25387b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d3(this.f25386a, this.f25387b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d3(this.f25386a, this.f25387b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25386a.userCache;
        String str = this.f25387b;
        synchronized (xgVar) {
            xgVar.c("phone", str);
        }
        return Unit.INSTANCE;
    }
}
