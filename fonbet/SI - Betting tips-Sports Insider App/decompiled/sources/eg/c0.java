package eg;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9150a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9151b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9152c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9153d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9154e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9155f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9156g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.android.billingclient.api.a f9157h;

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f9158i = new q0(false);
    public static final q0 j = new q0(true);

    static {
        int i5 = 9;
        f9150a = new com.android.billingclient.api.a("RESUME_TOKEN", i5);
        f9151b = new com.android.billingclient.api.a("REMOVED_TASK", i5);
        f9152c = new com.android.billingclient.api.a("CLOSED_EMPTY", i5);
        f9153d = new com.android.billingclient.api.a("COMPLETING_ALREADY", i5);
        f9154e = new com.android.billingclient.api.a("COMPLETING_WAITING_CHILDREN", i5);
        f9155f = new com.android.billingclient.api.a("COMPLETING_RETRY", i5);
        f9156g = new com.android.billingclient.api.a("TOO_LATE_TO_CANCEL", i5);
        f9157h = new com.android.billingclient.api.a("SEALED", i5);
    }

    public static final Object A(CoroutineContext coroutineContext, Function2 function2, Continuation frame) {
        Object z5;
        CoroutineContext context = frame.getContext();
        CoroutineContext t3 = !((Boolean) coroutineContext.O(Boolean.FALSE, new c1.k(1))).booleanValue() ? context.t(coroutineContext) : u.a(context, coroutineContext, false);
        k(t3);
        if (t3 == context) {
            jg.t tVar = new jg.t(frame, t3);
            z5 = rh.g.I(tVar, true, tVar, function2);
        } else {
            kf.d dVar = kotlin.coroutines.d.f19226f0;
            if (Intrinsics.areEqual(t3.r(dVar), context.r(dVar))) {
                d2 d2Var = new d2(frame, t3);
                CoroutineContext coroutineContext2 = d2Var.f9135c;
                Object c2 = jg.y.c(coroutineContext2, null);
                try {
                    Object I = rh.g.I(d2Var, true, d2Var, function2);
                    jg.y.a(coroutineContext2, c2);
                    z5 = I;
                } catch (Throwable th2) {
                    jg.y.a(coroutineContext2, c2);
                    throw th2;
                }
            } else {
                j0 j0Var = new j0(frame, t3);
                m4.g.z(function2, j0Var, j0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.f9181e;
                while (true) {
                    int i5 = atomicIntegerFieldUpdater.get(j0Var);
                    if (i5 != 0) {
                        if (i5 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        z5 = z(m1.f9202a.get(j0Var));
                        if (z5 instanceof t) {
                            throw ((t) z5).f9223a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(j0Var, 0, 1)) {
                        z5 = lf.a.f20034a;
                        break;
                    }
                }
            }
        }
        if (z5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return z5;
    }

    public static r a() {
        r rVar = new r(true);
        rVar.L(null);
        return rVar;
    }

    public static final jg.d b(CoroutineContext coroutineContext) {
        if (coroutineContext.r(x.f9237b) == null) {
            coroutineContext = coroutineContext.t(c());
        }
        return new jg.d(coroutineContext);
    }

    public static g1 c() {
        return new g1(null);
    }

    public static u1 d() {
        return new u1(null);
    }

    public static g0 e(z zVar, CoroutineContext coroutineContext, Function2 function2, int i5) {
        if ((i5 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f19227a;
        }
        a0 a0Var = a0.f9136a;
        CoroutineContext b10 = u.b(zVar, coroutineContext);
        a0 a0Var2 = a0.f9136a;
        g0 g0Var = new g0(b10, true);
        g0Var.j0(a0Var, g0Var, function2);
        return g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object f(f0[] f0VarArr, mf.c frame) {
        if (f0VarArr.length == 0) {
            return kotlin.collections.e0.f19204a;
        }
        e eVar = new e(f0VarArr);
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        int length = f0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i5 = 0; i5 < length; i5++) {
            p1 p1Var = f0VarArr[i5];
            ((m1) p1Var).start();
            c cVar = new c(eVar, lVar);
            cVar.f9148f = r(p1Var, cVar);
            Unit unit = Unit.f19194a;
            cVarArr[i5] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.f9146h.set(cVar2, dVar);
        }
        if (l.f9191g.get(lVar) instanceof r1) {
            lVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public static final void g(z zVar, CancellationException cancellationException) {
        e1 e1Var = (e1) zVar.C().r(x.f9237b);
        if (e1Var != null) {
            e1Var.k(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + zVar).toString());
        }
    }

    public static void h(CoroutineContext coroutineContext) {
        e1 e1Var = (e1) coroutineContext.r(x.f9237b);
        if (e1Var != null) {
            e1Var.k(null);
        }
    }

    public static final Object i(Function2 function2, Continuation frame) {
        jg.t tVar = new jg.t(frame, frame.getContext());
        Object I = rh.g.I(tVar, true, tVar, function2);
        if (I == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return I;
    }

    public static final Object j(long j6, Continuation frame) {
        if (j6 <= 0) {
            return Unit.f19194a;
        }
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        if (j6 < LongCompanionObject.MAX_VALUE) {
            m(lVar.f9194e).N(j6, lVar);
        }
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    public static final void k(CoroutineContext coroutineContext) {
        e1 e1Var = (e1) coroutineContext.r(x.f9237b);
        if (e1Var != null && !e1Var.c()) {
            throw e1Var.y();
        }
    }

    public static final w l(Executor executor) {
        w wVar;
        l0 l0Var = executor instanceof l0 ? (l0) executor : null;
        return (l0Var == null || (wVar = l0Var.f9195a) == null) ? new y0(executor) : wVar;
    }

    public static final h0 m(CoroutineContext coroutineContext) {
        CoroutineContext.Element r5 = coroutineContext.r(kotlin.coroutines.d.f19226f0);
        h0 h0Var = r5 instanceof h0 ? (h0) r5 : null;
        return h0Var == null ? e0.f9168a : h0Var;
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final e1 o(CoroutineContext coroutineContext) {
        e1 e1Var = (e1) coroutineContext.r(x.f9237b);
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final l p(Continuation continuation) {
        l lVar;
        l lVar2;
        if (!(continuation instanceof jg.g)) {
            return new l(1, continuation);
        }
        jg.g gVar = (jg.g) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.g.f18497h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            lVar = null;
            com.android.billingclient.api.a aVar = jg.h.f18503b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, aVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f9191g;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof s) || ((s) obj2).f9219d == null) {
                l.f9190f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f9145a);
                lVar = lVar2;
            } else {
                lVar2.o();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, continuation);
    }

    public static final void q(Throwable th2, CoroutineContext coroutineContext) {
        if (th2 instanceof i0) {
            th2 = ((i0) th2).f9179a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.r(x.f9236a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.W(th2, coroutineContext);
            } else {
                jg.h.c(th2, coroutineContext);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                gf.d.a(runtimeException, th2);
                th2 = runtimeException;
            }
            jg.h.c(th2, coroutineContext);
        }
    }

    public static o0 r(e1 e1Var, i1 i1Var) {
        if (e1Var instanceof m1) {
            return ((m1) e1Var).M(true, i1Var);
        }
        return e1Var.K(i1Var.k(), true, new h1(1, i1Var, i1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final t1 s(z zVar, CoroutineContext coroutineContext, a0 a0Var, Function2 function2) {
        CoroutineContext b10 = u.b(zVar, coroutineContext);
        a0Var.getClass();
        t1 n1Var = a0Var == a0.f9137b ? new n1(b10, function2) : new t1(b10, true);
        n1Var.j0(a0Var, n1Var, function2);
        return n1Var;
    }

    public static /* synthetic */ t1 t(z zVar, CoroutineContext coroutineContext, a0 a0Var, Function2 function2, int i5) {
        if ((i5 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f19227a;
        }
        if ((i5 & 2) != 0) {
            a0Var = a0.f9136a;
        }
        return s(zVar, coroutineContext, a0Var, function2);
    }

    public static final Object u(Object obj) {
        if (obj instanceof t) {
            gf.o oVar = gf.q.f10031a;
            return h8.b.h(((t) obj).f9223a);
        }
        gf.o oVar2 = gf.q.f10031a;
        return obj;
    }

    public static final void v(l lVar, Continuation continuation, boolean z5) {
        Object g10;
        Object obj = l.f9191g.get(lVar);
        Throwable e7 = lVar.e(obj);
        if (e7 != null) {
            gf.o oVar = gf.q.f10031a;
            g10 = h8.b.h(e7);
        } else {
            gf.o oVar2 = gf.q.f10031a;
            g10 = lVar.g(obj);
        }
        if (!z5) {
            continuation.resumeWith(g10);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        jg.g gVar = (jg.g) continuation;
        mf.c cVar = gVar.f18499e;
        Object obj2 = gVar.f18501g;
        CoroutineContext context = cVar.getContext();
        Object c2 = jg.y.c(context, obj2);
        d2 c8 = c2 != jg.y.f18531a ? u.c(cVar, context, c2) : null;
        try {
            gVar.f18499e.resumeWith(g10);
            Unit unit = Unit.f19194a;
            if (c8 == null || c8.l0()) {
                jg.y.a(context, c2);
            }
        } catch (Throwable th2) {
            if (c8 == null || c8.l0()) {
                jg.y.a(context, c2);
            }
            throw th2;
        }
    }

    public static final Object w(CoroutineContext coroutineContext, Function2 function2) {
        w0 w0Var;
        CoroutineContext a7;
        long o02;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.f19226f0;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.r(fVar);
        if (dVar == null) {
            w0Var = w1.a();
            a7 = u.a(kotlin.coroutines.g.f19227a, coroutineContext.t(w0Var), true);
            lg.e eVar = m0.f9201a;
            if (a7 != eVar && a7.r(fVar) == null) {
                a7 = a7.t(eVar);
            }
        } else {
            if (dVar instanceof w0) {
            }
            w0Var = (w0) w1.f9235a.get();
            a7 = u.a(kotlin.coroutines.g.f19227a, coroutineContext, true);
            lg.e eVar2 = m0.f9201a;
            if (a7 != eVar2 && a7.r(fVar) == null) {
                a7 = a7.t(eVar2);
            }
        }
        f fVar2 = new f(a7, currentThread, w0Var);
        fVar2.j0(a0.f9136a, fVar2, function2);
        w0 w0Var2 = fVar2.f9171e;
        if (w0Var2 != null) {
            int i5 = w0.f9231f;
            w0Var2.l0(false);
        }
        while (true) {
            if (w0Var2 != null) {
                try {
                    o02 = w0Var2.o0();
                } catch (Throwable th2) {
                    if (w0Var2 != null) {
                        int i10 = w0.f9231f;
                        w0Var2.i0(false);
                    }
                    throw th2;
                }
            } else {
                o02 = LongCompanionObject.MAX_VALUE;
            }
            if (fVar2.N()) {
                break;
            }
            LockSupport.parkNanos(fVar2, o02);
            if (Thread.interrupted()) {
                fVar2.o(new InterruptedException());
            }
        }
        if (w0Var2 != null) {
            int i11 = w0.f9231f;
            w0Var2.i0(false);
        }
        Object z5 = z(m1.f9202a.get(fVar2));
        t tVar = z5 instanceof t ? (t) z5 : null;
        if (tVar == null) {
            return z5;
        }
        throw tVar.f9223a;
    }

    public static Object x(Function0 function0, mf.c cVar) {
        return A(kotlin.coroutines.g.f19227a, new ab.b(function0, (Continuation) null, 6), cVar);
    }

    public static final String y(Continuation continuation) {
        Object h10;
        if (continuation instanceof jg.g) {
            return ((jg.g) continuation).toString();
        }
        try {
            gf.o oVar = gf.q.f10031a;
            h10 = continuation + '@' + n(continuation);
        } catch (Throwable th2) {
            gf.o oVar2 = gf.q.f10031a;
            h10 = h8.b.h(th2);
        }
        if (gf.q.a(h10) != null) {
            h10 = continuation.getClass().getName() + '@' + n(continuation);
        }
        return (String) h10;
    }

    public static final Object z(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f9159a) == null) ? obj : b1Var;
    }
}
