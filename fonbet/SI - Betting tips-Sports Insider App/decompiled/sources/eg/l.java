package eg;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class l extends k0 implements j, mf.d, f2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9190f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9191g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9192h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f9193d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f9194e;

    public l(int i5, Continuation continuation) {
        super(i5);
        this.f9193d = continuation;
        this.f9194e = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f9145a;
    }

    public static Object D(r1 r1Var, Object obj, int i5, vf.a aVar) {
        if (obj instanceof t) {
            return obj;
        }
        if (i5 != 1 && i5 != 2) {
            return obj;
        }
        if (aVar != null || (r1Var instanceof i)) {
            return new s(obj, r1Var instanceof i ? (i) r1Var : null, aVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        Continuation continuation = this.f9193d;
        Throwable th2 = null;
        jg.g gVar = continuation instanceof jg.g ? (jg.g) continuation : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.g.f18497h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                com.android.billingclient.api.a aVar = jg.h.f18503b;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            o();
            n(th2);
        }
    }

    public final void B(Object obj, int i5, vf.a aVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9191g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof r1) {
                Object D = D((r1) obj2, obj, i5, aVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i5);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.f9200c.compareAndSet(mVar, 0, 1)) {
                    if (aVar != null) {
                        l(aVar, mVar.f9223a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(w wVar, Unit unit) {
        Continuation continuation = this.f9193d;
        jg.g gVar = continuation instanceof jg.g ? (jg.g) continuation : null;
        B(unit, (gVar != null ? gVar.f18498d : null) == wVar ? 4 : this.f9185c, null);
    }

    public final com.android.billingclient.api.a E(Object obj, vf.a aVar) {
        com.android.billingclient.api.a aVar2 = c0.f9150a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9191g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof r1)) {
                return null;
            }
            Object D = D((r1) obj2, obj, this.f9185c, aVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return aVar2;
        }
    }

    @Override // eg.j
    public final void a(Object obj, vf.a aVar) {
        B(obj, this.f9185c, aVar);
    }

    @Override // eg.f2
    public final void b(jg.u uVar, int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f9190f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i5));
        v(uVar);
    }

    @Override // eg.k0
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9191g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof r1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof t) {
                return;
            }
            if (!(obj instanceof s)) {
                cancellationException2 = cancellationException;
                s sVar = new s(obj, (i) null, (vf.a) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.f9220e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            s a7 = s.a(sVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            i iVar = sVar2.f9217b;
            if (iVar != null) {
                k(iVar, cancellationException);
            }
            vf.a aVar = sVar2.f9218c;
            if (aVar != null) {
                l(aVar, cancellationException, sVar2.f9216a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // eg.k0
    public final Continuation d() {
        return this.f9193d;
    }

    @Override // eg.k0
    public final Throwable e(Object obj) {
        Throwable e7 = super.e(obj);
        if (e7 != null) {
            return e7;
        }
        return null;
    }

    @Override // eg.j
    public final com.android.billingclient.api.a f(Object obj, vf.a aVar) {
        return E(obj, aVar);
    }

    @Override // eg.k0
    public final Object g(Object obj) {
        return obj instanceof s ? ((s) obj).f9216a : obj;
    }

    @Override // mf.d
    public final mf.d getCallerFrame() {
        Continuation continuation = this.f9193d;
        if (continuation instanceof mf.d) {
            return (mf.d) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f9194e;
    }

    @Override // eg.j
    public final void i(Object obj) {
        p(this.f9185c);
    }

    @Override // eg.k0
    public final Object j() {
        return f9191g.get(this);
    }

    public final void k(i iVar, Throwable th2) {
        try {
            iVar.a(th2);
        } catch (Throwable th3) {
            c0.q(new androidx.fragment.app.i0("Exception in invokeOnCancellation handler for " + this, th3), this.f9194e);
        }
    }

    public final void l(vf.a aVar, Throwable th2, Object obj) {
        CoroutineContext coroutineContext = this.f9194e;
        try {
            aVar.invoke(th2, obj, coroutineContext);
        } catch (Throwable th3) {
            c0.q(new androidx.fragment.app.i0("Exception in resume onCancellation handler for " + this, th3), coroutineContext);
        }
    }

    public final void m(jg.u uVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f9194e;
        int i5 = f9190f.get(this) & 536870911;
        if (i5 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.h(i5, coroutineContext);
        } catch (Throwable th3) {
            c0.q(new androidx.fragment.app.i0("Exception in invokeOnCancellation handler for " + this, th3), coroutineContext);
        }
    }

    public final boolean n(Throwable th2) {
        Throwable th3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9191g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r1)) {
                return false;
            }
            boolean z5 = (obj instanceof i) || (obj instanceof jg.u);
            if (th2 == null) {
                th3 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th3 = th2;
            }
            m mVar = new m(th3, z5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            r1 r1Var = (r1) obj;
            if (r1Var instanceof i) {
                k((i) obj, th2);
            } else if (r1Var instanceof jg.u) {
                m((jg.u) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f9185c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9192h;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.b();
        atomicReferenceFieldUpdater.set(this, q1.f9213a);
    }

    public final void p(int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f9190f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i5 == 4;
                Continuation continuation = this.f9193d;
                if (!z5 && (continuation instanceof jg.g)) {
                    boolean z7 = i5 == 1 || i5 == 2;
                    int i12 = this.f9185c;
                    if (z7 == (i12 == 1 || i12 == 2)) {
                        jg.g gVar = (jg.g) continuation;
                        w wVar = gVar.f18498d;
                        CoroutineContext context = gVar.f18499e.getContext();
                        if (jg.h.h(wVar, context)) {
                            jg.h.g(wVar, context, this);
                            return;
                        }
                        w0 a7 = w1.a();
                        if (a7.f9232c >= 4294967296L) {
                            a7.j0(this);
                            return;
                        }
                        a7.l0(true);
                        try {
                            c0.v(this, continuation, true);
                            do {
                            } while (a7.q0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                c0.v(this, continuation, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(m1 m1Var) {
        return m1Var.y();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        e1 e1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f9190f;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i10 = i5 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x10) {
                    A();
                }
                Object obj = f9191g.get(this);
                if (obj instanceof t) {
                    throw ((t) obj).f9223a;
                }
                int i11 = this.f9185c;
                if ((i11 != 1 && i11 != 2) || (e1Var = (e1) this.f9194e.r(x.f9237b)) == null || e1Var.c()) {
                    return g(obj);
                }
                CancellationException y5 = e1Var.y();
                c(y5);
                throw y5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 536870912 + (536870911 & i5)));
        if (((o0) f9192h.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return lf.a.f20034a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a7 = gf.q.a(obj);
        if (a7 != null) {
            obj = new t(a7, false);
        }
        B(obj, this.f9185c, null);
    }

    public final void s() {
        o0 t3 = t();
        if (t3 == null || (f9191g.get(this) instanceof r1)) {
            return;
        }
        t3.b();
        f9192h.set(this, q1.f9213a);
    }

    public final o0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = (e1) this.f9194e.r(x.f9237b);
        if (e1Var == null) {
            return null;
        }
        o0 r5 = c0.r(e1Var, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = f9192h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, r5)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return r5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(c0.y(this.f9193d));
        sb2.append("){");
        Object obj = f9191g.get(this);
        sb2.append(obj instanceof r1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(c0.n(this));
        return sb2.toString();
    }

    public final void u(Function1 function1) {
        v(new h(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(r1 r1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9191g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof i) || (obj instanceof jg.u)) {
                break;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!t.f9222b.compareAndSet(tVar, 0, 1)) {
                    y(r1Var, obj);
                    throw null;
                }
                if (obj instanceof m) {
                    Throwable th2 = tVar.f9223a;
                    if (r1Var instanceof i) {
                        k((i) r1Var, th2);
                        return;
                    } else {
                        Intrinsics.checkNotNull(r1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((jg.u) r1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof s)) {
                if (r1Var instanceof jg.u) {
                    return;
                }
                Intrinsics.checkNotNull(r1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                s sVar = new s(obj, (i) r1Var, (vf.a) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.f9217b != null) {
                y(r1Var, obj);
                throw null;
            }
            if (r1Var instanceof jg.u) {
                return;
            }
            Intrinsics.checkNotNull(r1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            i iVar = (i) r1Var;
            Throwable th3 = sVar2.f9220e;
            if (th3 != null) {
                k(iVar, th3);
                return;
            }
            s a7 = s.a(sVar2, iVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        return f9191g.get(this) instanceof r1;
    }

    public final boolean x() {
        if (this.f9185c != 2) {
            return false;
        }
        Continuation continuation = this.f9193d;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        jg.g gVar = (jg.g) continuation;
        gVar.getClass();
        return jg.g.f18497h.get(gVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
