package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class d extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f815a;
    public final /* synthetic */ com.braze.triggers.actions.a b;
    public final /* synthetic */ com.braze.triggers.events.b c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.braze.triggers.actions.a aVar, com.braze.triggers.events.b bVar, long j, long j2, Continuation continuation) {
        super(1, continuation);
        this.f815a = fVar;
        this.b = aVar;
        this.c = bVar;
        this.d = j;
        this.e = j2;
    }

    public static final String a(long j) {
        return "Performing triggered action after a delay of " + j + " ms.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new d(this.f815a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        f fVar = this.f815a;
        final long j = this.e;
        BrazeLogger.brazelog$default(brazeLogger, (Object) fVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.a(j);
            }
        }, 7, (Object) null);
        com.braze.triggers.actions.a aVar = this.b;
        f fVar2 = this.f815a;
        aVar.a(fVar2.f817a, fVar2.c, this.c, this.d);
        return Unit.INSTANCE;
    }
}
