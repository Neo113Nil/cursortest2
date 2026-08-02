package com.braze;

import Ph.P;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f29296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f29297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f29298g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, boolean z11, boolean z12, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f29293b = z10;
        this.f29294c = z11;
        this.f29295d = z12;
        this.f29296e = braze;
        this.f29297f = function0;
        this.f29298g = function02;
    }

    public static final String a(Function0 function0) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + function0.invoke();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f29293b, this.f29294c, this.f29295d, this.f29296e, this.f29297f, this.f29298g, continuation);
        cVar.f29292a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f29292a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f29293b && Braze.INSTANCE.isDisabled()) {
            return Unit.INSTANCE;
        }
        if (this.f29294c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return Unit.INSTANCE;
        }
        if (!this.f29295d || this.f29296e.udm != null) {
            this.f29297f.invoke();
            return Unit.INSTANCE;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
        final Function0 function0 = this.f29298g;
        BrazeLogger.brazelog$default(brazeLogger, (Object) p10, priority, (Throwable) null, false, new Function0() { // from class: H3.T4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.c.a(Function0.this);
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
