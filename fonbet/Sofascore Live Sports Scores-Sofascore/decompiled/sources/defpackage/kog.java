package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kog extends sq3 implements b98 {
    public final b98 r;
    public final CoroutineContext s;
    public final int t;
    public CoroutineContext u;
    public rq3 v;

    public kog(b98 b98Var, CoroutineContext coroutineContext) {
        super(gdd.a, g.a);
        this.r = b98Var;
        this.s = coroutineContext;
        this.t = ((Number) coroutineContext.fold(0, new eee((byte) 0, 29))).intValue();
    }

    public final Object e(rq3 rq3Var, Object obj) {
        CoroutineContext context = rq3Var.getContext();
        bea.u(context);
        CoroutineContext coroutineContext = this.u;
        if (coroutineContext != context) {
            if (coroutineContext instanceof o75) {
                throw new IllegalStateException(dii.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o75) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new t1d(this, 29))).intValue() != this.t) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.s + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.u = context;
        }
        this.v = rq3Var;
        ct8 ct8Var = mog.a;
        b98 b98Var = this.r;
        b98Var.getClass();
        Object invoke = ct8Var.invoke(b98Var, obj, this);
        if (!Intrinsics.c(invoke, lu3.a)) {
            this.v = null;
        }
        return invoke;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        try {
            Object e = e(rq3Var, obj);
            return e == lu3.a ? e : Unit.a;
        } catch (Throwable th) {
            this.u = new o75(rq3Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.h21, defpackage.mu3
    public final mu3 getCallerFrame() {
        rq3 rq3Var = this.v;
        if (rq3Var instanceof mu3) {
            return (mu3) rq3Var;
        }
        return null;
    }

    @Override // defpackage.sq3, defpackage.rq3
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.u;
        return coroutineContext == null ? g.a : coroutineContext;
    }

    @Override // defpackage.h21
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Throwable a = w2g.a(obj);
        if (a != null) {
            this.u = new o75(getContext(), a);
        }
        rq3 rq3Var = this.v;
        if (rq3Var != null) {
            rq3Var.resumeWith(obj);
        }
        return lu3.a;
    }
}
