package com.braze.communication.dust;

import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f478a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BufferedReader c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BufferedReader bufferedReader, Continuation continuation) {
        super(2, continuation);
        this.c = bufferedReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.c, continuation);
        eVar.b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e eVar = new e(this.c, (Continuation) obj2);
        eVar.b = (ProducerScope) obj;
        return eVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f478a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = (ProducerScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(producerScope)) {
            CoroutineDispatcher io2 = Dispatchers.getIO();
            d dVar = new d(this.c, producerScope, null);
            this.b = producerScope;
            this.f478a = 1;
            if (BuildersKt.withContext(io2, dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
