package com.braze.managers;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class b0 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, Continuation continuation) {
        super(1, continuation);
        this.f575a = g0Var;
    }

    public static final String a() {
        return "DDR delay elapsed, reconnecting";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new b0(this.f575a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new b0(this.f575a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f575a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.b0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.a();
            }
        }, 7, (Object) null);
        this.f575a.a(false);
        return Unit.INSTANCE;
    }
}
