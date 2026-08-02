package com.braze;

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
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f664a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Braze e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z, boolean z2, boolean z3, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = braze;
        this.f = function0;
        this.g = function02;
    }

    public static final String a(Function0 function0) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + function0.invoke();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        oVar.f664a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f664a;
        if (this.b && Braze.INSTANCE.isDisabled()) {
            return Unit.INSTANCE;
        }
        if (this.c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return Unit.INSTANCE;
        }
        if (!this.d || this.e.udm != null) {
            this.f.invoke();
            return Unit.INSTANCE;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        final Function0 function0 = this.g;
        BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, priority, (Throwable) null, false, new Function0() { // from class: com.braze.o$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.a(Function0.this);
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
