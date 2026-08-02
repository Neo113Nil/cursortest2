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
public final class s0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f26034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f26035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f26034b = iValueCallback;
        this.f26035c = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s0(this.f26034b, this.f26035c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s0(this.f26034b, this.f26035c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26033a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            com.braze.a aVar = new com.braze.a(this.f26034b, this.f26035c, null);
            this.f26033a = 1;
            if (AbstractC1455i.g(coroutineContext, aVar, this) == coroutine_suspended) {
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
