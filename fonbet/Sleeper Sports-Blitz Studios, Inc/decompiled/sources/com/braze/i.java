package com.braze;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes6.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f547a;
    public final /* synthetic */ IValueCallback b;
    public final /* synthetic */ Braze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.b = iValueCallback;
        this.c = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f547a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            h hVar = new h(this.b, this.c, null);
            this.f547a = 1;
            if (BuildersKt.withContext(coroutineContext, hVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
