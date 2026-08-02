package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class da extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f25394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(InAppMessageBase inAppMessageBase, Continuation continuation) {
        super(2, continuation);
        this.f25394a = inAppMessageBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new da(this.f25394a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new da(this.f25394a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        a9 brazeManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        atomicBoolean = this.f25394a.clickLogged;
        if (atomicBoolean.get() && (brazeManager = this.f25394a.getBrazeManager()) != null) {
            fa triggerEvent = new fa(this.f25394a.getTriggerId());
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            ((e2) brazeManager).f25408d.b(new hg(triggerEvent), hg.class);
        }
        return Unit.INSTANCE;
    }
}
