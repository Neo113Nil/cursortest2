package bo.app;

import Ph.AbstractC1455i;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f26066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f26067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f26066b = iValueCallback;
        this.f26067c = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t0(this.f26066b, this.f26067c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t0(this.f26066b, this.f26067c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26065a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            com.braze.b bVar = new com.braze.b(this.f26066b, this.f26067c, null);
            this.f26065a = 1;
            if (AbstractC1455i.g(coroutineContext, bVar, this) == coroutine_suspended) {
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
