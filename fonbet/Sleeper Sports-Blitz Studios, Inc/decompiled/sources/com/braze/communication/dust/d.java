package com.braze.communication.dust;

import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f477a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BufferedReader c;
    public final /* synthetic */ ProducerScope d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BufferedReader bufferedReader, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.c = bufferedReader;
        this.d = producerScope;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.c, this.d, continuation);
        dVar.b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.f477a;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                String readLine = this.c.readLine();
                if (readLine == null) {
                    return Unit.INSTANCE;
                }
                ProducerScope producerScope = this.d;
                this.b = coroutineScope;
                this.f477a = 1;
                if (producerScope.send(readLine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            if (CoroutineScopeKt.isActive(r1)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, BrazeLogger.Priority.D, (Throwable) e, false, new Function0() { // from class: com.braze.communication.dust.d$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.a();
                    }
                }, 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.d$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.a(e);
                    }
                }, 14, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(Exception exc) {
        return "Stream producer job cancelled " + exc;
    }
}
