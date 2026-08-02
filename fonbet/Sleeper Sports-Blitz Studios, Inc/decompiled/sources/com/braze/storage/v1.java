package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class v1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f760a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ w1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Function0 function0, w1 w1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = function0;
        this.c = w1Var;
        this.d = str;
    }

    public static final String a(String str) {
        return "Failed to " + str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v1 v1Var = new v1(this.b, this.c, this.d, continuation);
        v1Var.f760a = obj;
        return v1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f760a;
        try {
            this.b.invoke();
        } catch (Exception e) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.E;
            final String str = this.d;
            BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, priority, (Throwable) e, false, new Function0() { // from class: com.braze.storage.v1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v1.a(str);
                }
            }, 4, (Object) null);
            this.c.a(e);
        }
        return Unit.INSTANCE;
    }
}
