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
public final class c0 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f578a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, long j, Continuation continuation) {
        super(1, continuation);
        this.f578a = g0Var;
        this.b = j;
    }

    public static final String a(long j) {
        return "TTL of " + j + " expired, reconnecting";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new c0(this.f578a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new c0(this.f578a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        g0 g0Var = this.f578a;
        final long j = this.b;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.a(j);
            }
        }, 7, (Object) null);
        ((com.braze.communication.dust.i) this.f578a.c).b();
        this.f578a.a(false);
        return Unit.INSTANCE;
    }
}
