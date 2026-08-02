package bo.app;

import com.braze.events.IEventSubscriber;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IEventSubscriber f25948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(IEventSubscriber iEventSubscriber, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f25948a = iEventSubscriber;
        this.f25949b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q7(this.f25948a, this.f25949b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q7(this.f25948a, this.f25949b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f25948a.trigger(this.f25949b);
        return Unit.INSTANCE;
    }
}
