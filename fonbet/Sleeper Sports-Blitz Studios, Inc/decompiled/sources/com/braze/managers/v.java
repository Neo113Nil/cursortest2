package com.braze.managers;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes6.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f609a;
    public final /* synthetic */ w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f609a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = w.o;
            this.f609a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w.n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.v$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.a();
            }
        }, 14, (Object) null);
        Braze.INSTANCE.getInstance(this.b.f611a).requestImmediateDataFlush();
        return Unit.INSTANCE;
    }
}
