package bo.app;

import Ph.P;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ca extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f25349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a9 f25350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(String str, InAppMessageBase inAppMessageBase, a9 a9Var, Continuation continuation) {
        super(2, continuation);
        this.f25348a = str;
        this.f25349b = inAppMessageBase;
        this.f25350c = a9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ca(this.f25348a, this.f25349b, this.f25350c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ca) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y8 m10 = k1.f25630g.m(this.f25348a, this.f25349b.getMessageExtras());
        if (m10 != null) {
            ((e2) this.f25350c).a(m10);
        }
        return Unit.INSTANCE;
    }
}
