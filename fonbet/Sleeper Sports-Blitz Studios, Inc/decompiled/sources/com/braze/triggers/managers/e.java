package com.braze.triggers.managers;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class e extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f816a;
    public final /* synthetic */ f b;
    public final /* synthetic */ com.braze.triggers.events.b c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.braze.triggers.actions.a aVar, f fVar, com.braze.triggers.events.b bVar, long j, Continuation continuation) {
        super(1, continuation);
        this.f816a = aVar;
        this.b = fVar;
        this.c = bVar;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new e(this.f816a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.braze.triggers.actions.a aVar = this.f816a;
        f fVar = this.b;
        aVar.a(fVar.f817a, fVar.c, this.c, this.d);
        return Unit.INSTANCE;
    }
}
