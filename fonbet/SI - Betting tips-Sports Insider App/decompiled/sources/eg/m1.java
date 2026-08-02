package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class m1 implements e1, s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9202a = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9203b = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public m1(boolean z5) {
        this._state$volatile = z5 ? c0.j : c0.f9158i;
    }

    public static p V(jg.m mVar) {
        while (mVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.m.f18512b;
            jg.m f6 = mVar.f();
            if (f6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (jg.m) obj;
                    if (!mVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = f6;
            }
        }
        while (true) {
            mVar = mVar.h();
            if (!mVar.i()) {
                if (mVar instanceof p) {
                    return (p) mVar;
                }
                if (mVar instanceof o1) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof l1)) {
            return obj instanceof b1 ? ((b1) obj).c() ? "Active" : "New" : obj instanceof t ? "Cancelled" : "Completed";
        }
        l1 l1Var = (l1) obj;
        return l1Var.e() ? "Cancelling" : l1.f9196b.get(l1Var) == 1 ? "Completing" : "Active";
    }

    public final Object A(l1 l1Var, Object obj) {
        Throwable D;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f9223a : null;
        synchronized (l1Var) {
            l1Var.e();
            ArrayList<Throwable> f6 = l1Var.f(th2);
            D = D(l1Var, f6);
            if (D != null && f6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f6.size()));
                for (Throwable th3 : f6) {
                    if (th3 != D && th3 != D && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        gf.d.a(D, th3);
                    }
                }
            }
        }
        if (D != null && D != th2) {
            obj = new t(D, false);
        }
        if (D != null && (q(D) || H(D))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t tVar2 = (t) obj;
            tVar2.getClass();
            t.f9222b.compareAndSet(tVar2, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == l1Var) {
        }
        v(l1Var, obj);
        return obj;
    }

    public final Object B() {
        Object obj = f9202a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof t) {
            throw ((t) obj).f9223a;
        }
        return c0.z(obj);
    }

    public final Throwable D(l1 l1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l1Var.e()) {
                return new f1(s(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof y1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof y1)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof r;
    }

    public final o1 G(b1 b1Var) {
        o1 d10 = b1Var.d();
        if (d10 != null) {
            return d10;
        }
        if (b1Var instanceof q0) {
            return new o1();
        }
        if (b1Var instanceof i1) {
            c0((i1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public boolean H(Throwable th2) {
        return false;
    }

    @Override // eg.e1
    public final o0 J(Function1 function1) {
        return M(true, new p0(1, function1));
    }

    @Override // eg.e1
    public final o0 K(boolean z5, boolean z7, h1 h1Var) {
        return M(z7, z5 ? new d1(h1Var) : new p0(1, h1Var));
    }

    public final void L(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9203b;
        q1 q1Var = q1.f9213a;
        if (e1Var == null) {
            atomicReferenceFieldUpdater.set(this, q1Var);
            return;
        }
        e1Var.start();
        o Y = e1Var.Y(this);
        atomicReferenceFieldUpdater.set(this, Y);
        if (N()) {
            Y.b();
            atomicReferenceFieldUpdater.set(this, q1Var);
        }
    }

    public final o0 M(boolean z5, i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q1 q1Var;
        boolean z7;
        boolean e7;
        i1Var.f9180d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f9202a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof q0;
            q1Var = q1.f9213a;
            z7 = true;
            if (!z10) {
                if (!(obj instanceof b1)) {
                    z7 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                o1 d10 = b1Var.d();
                if (d10 == null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((i1) obj);
                } else {
                    if (i1Var.k()) {
                        l1 l1Var = b1Var instanceof l1 ? (l1) b1Var : null;
                        Throwable b10 = l1Var != null ? l1Var.b() : null;
                        if (b10 == null) {
                            e7 = d10.e(i1Var, 5);
                        } else if (z5) {
                            i1Var.l(b10);
                            return q1Var;
                        }
                    } else {
                        e7 = d10.e(i1Var, 1);
                    }
                    if (e7) {
                        break;
                    }
                }
            } else {
                q0 q0Var = (q0) obj;
                if (q0Var.f9212a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            }
        }
        if (z7) {
            return i1Var;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            i1Var.l(tVar != null ? tVar.f9223a : null);
        }
        return q1Var;
    }

    public final boolean N() {
        return !(f9202a.get(this) instanceof b1);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    public boolean P() {
        return this instanceof f;
    }

    public final boolean Q(Object obj) {
        Object f02;
        do {
            f02 = f0(f9202a.get(this), obj);
            if (f02 == c0.f9153d) {
                return false;
            }
            if (f02 == c0.f9154e) {
                return true;
            }
        } while (f02 == c0.f9155f);
        j(f02);
        return true;
    }

    public final Object S(Object obj) {
        Object f02;
        do {
            f02 = f0(f9202a.get(this), obj);
            if (f02 == c0.f9153d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                t tVar = obj instanceof t ? (t) obj : null;
                throw new IllegalStateException(str, tVar != null ? tVar.f9223a : null);
            }
        } while (f02 == c0.f9155f);
        return f02;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void X(o1 o1Var, Throwable th2) {
        o1Var.e(new jg.j(4), 4);
        Object obj = jg.m.f18511a.get(o1Var);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        androidx.fragment.app.i0 i0Var = null;
        for (jg.m mVar = (jg.m) obj; !Intrinsics.areEqual(mVar, o1Var); mVar = mVar.h()) {
            if ((mVar instanceof i1) && ((i1) mVar).k()) {
                try {
                    ((i1) mVar).l(th2);
                } catch (Throwable th3) {
                    if (i0Var != null) {
                        gf.d.a(i0Var, th3);
                    } else {
                        i0Var = new androidx.fragment.app.i0("Exception in completion handler " + mVar + " for " + this, th3);
                        Unit unit = Unit.f19194a;
                    }
                }
            }
        }
        if (i0Var != null) {
            I(i0Var);
        }
        q(th2);
    }

    @Override // eg.e1
    public final o Y(m1 m1Var) {
        p pVar = new p(m1Var);
        pVar.f9180d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                if (q0Var.f9212a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            } else {
                boolean z5 = obj instanceof b1;
                q1 q1Var = q1.f9213a;
                if (!z5) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    t tVar = obj2 instanceof t ? (t) obj2 : null;
                    pVar.l(tVar != null ? tVar.f9223a : null);
                    return q1Var;
                }
                o1 d10 = ((b1) obj).d();
                if (d10 == null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((i1) obj);
                } else if (!d10.e(pVar, 7)) {
                    boolean e7 = d10.e(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof l1) {
                        r4 = ((l1) obj3).b();
                    } else {
                        t tVar2 = obj3 instanceof t ? (t) obj3 : null;
                        if (tVar2 != null) {
                            r4 = tVar2.f9223a;
                        }
                    }
                    pVar.l(r4);
                    if (e7) {
                        break loop0;
                    }
                    return q1Var;
                }
            }
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [eg.a1] */
    public final void b0(q0 q0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = new o1();
        if (!q0Var.f9212a) {
            o1Var = new a1(o1Var);
        }
        do {
            atomicReferenceFieldUpdater = f9202a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, o1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q0Var);
    }

    @Override // eg.e1
    public boolean c() {
        Object obj = f9202a.get(this);
        return (obj instanceof b1) && ((b1) obj).c();
    }

    public final void c0(i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = new o1();
        i1Var.getClass();
        jg.m.f18512b.set(o1Var, i1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = jg.m.f18511a;
        atomicReferenceFieldUpdater2.set(o1Var, i1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(i1Var) == i1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(i1Var, i1Var, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(i1Var) != i1Var) {
                        break;
                    }
                }
                o1Var.g(i1Var);
                break loop0;
            }
            break;
        }
        jg.m h10 = i1Var.h();
        do {
            atomicReferenceFieldUpdater = f9202a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i1Var, h10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i1Var);
    }

    public final int d0(Object obj) {
        boolean z5 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202a;
        if (z5) {
            if (((q0) obj).f9212a) {
                return 0;
            }
            q0 q0Var = c0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            a0();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        o1 o1Var = ((a1) obj).f9141a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        a0();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object f0(Object obj, Object obj2) {
        if (!(obj instanceof b1)) {
            return c0.f9153d;
        }
        if (((obj instanceof q0) || (obj instanceof i1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return c0.f9155f;
                }
            }
            Z(obj2);
            v(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        o1 G = G(b1Var2);
        if (G == null) {
            return c0.f9155f;
        }
        l1 l1Var = b1Var2 instanceof l1 ? (l1) b1Var2 : null;
        if (l1Var == null) {
            l1Var = new l1(G, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (l1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l1.f9196b;
            if (atomicIntegerFieldUpdater.get(l1Var) == 1) {
                return c0.f9153d;
            }
            atomicIntegerFieldUpdater.set(l1Var, 1);
            if (l1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9202a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, l1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return c0.f9155f;
                    }
                }
            }
            boolean e7 = l1Var.e();
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                l1Var.a(tVar.f9223a);
            }
            ?? b10 = e7 ? 0 : l1Var.b();
            objectRef.element = b10;
            Unit unit = Unit.f19194a;
            if (b10 != 0) {
                X(G, b10);
            }
            p V = V(G);
            if (V != null && g0(l1Var, V, obj2)) {
                return c0.f9154e;
            }
            G.e(new jg.j(2), 2);
            p V2 = V(G);
            return (V2 == null || !g0(l1Var, V2, obj2)) ? A(l1Var, obj2) : c0.f9154e;
        }
    }

    public final boolean g0(l1 l1Var, p pVar, Object obj) {
        while (pVar.f9208e.M(false, new k1(this, l1Var, pVar, obj)) == q1.f9213a) {
            pVar = V(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return x.f9237b;
    }

    @Override // eg.e1
    public final boolean isCancelled() {
        Object obj = f9202a.get(this);
        if (obj instanceof t) {
            return true;
        }
        return (obj instanceof l1) && ((l1) obj).e();
    }

    @Override // eg.e1
    public void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new f1(s(), null, this);
        }
        p(cancellationException);
    }

    public void l(Object obj) {
        j(obj);
    }

    public final Object m(Continuation frame) {
        Object obj;
        do {
            obj = f9202a.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof t) {
                    throw ((t) obj).f9223a;
                }
                return c0.z(obj);
            }
        } while (d0(obj) < 0);
        j1 j1Var = new j1(lf.d.b(frame), this);
        j1Var.s();
        j1Var.v(new h(2, c0.r(this, new p0(2, j1Var))));
        Object r5 = j1Var.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public Object n() {
        return B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == eg.c0.f9154e) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        com.android.billingclient.api.a aVar;
        Object obj2 = c0.f9153d;
        if (F()) {
            do {
                Object obj3 = f9202a.get(this);
                if (obj3 instanceof b1) {
                    if (obj3 instanceof l1) {
                        if (l1.f9196b.get((l1) obj3) == 1) {
                        }
                    }
                    obj2 = f0(obj3, new t(x(obj), false));
                }
                obj2 = c0.f9153d;
                break;
            } while (obj2 == c0.f9155f);
        }
        if (obj2 == c0.f9153d) {
            Throwable th2 = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202a;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof l1)) {
                    if (!(obj4 instanceof b1)) {
                        aVar = c0.f9156g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = x(obj);
                    }
                    b1 b1Var = (b1) obj4;
                    if (b1Var.c()) {
                        o1 G = G(b1Var);
                        if (G != null) {
                            l1 l1Var = new l1(G, th2);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, l1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                    break;
                                }
                            }
                            X(G, th2);
                            aVar = c0.f9153d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object f02 = f0(obj4, new t(th2, false));
                        if (f02 == c0.f9153d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (f02 != c0.f9155f) {
                            obj2 = f02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (l1.f9198d.get((l1) obj4) == c0.f9157h) {
                            aVar = c0.f9156g;
                        } else {
                            boolean e7 = ((l1) obj4).e();
                            if (obj != null || !e7) {
                                if (th2 == null) {
                                    th2 = x(obj);
                                }
                                ((l1) obj4).a(th2);
                            }
                            Throwable b10 = e7 ? null : ((l1) obj4).b();
                            if (b10 != null) {
                                X(((l1) obj4).f9199a, b10);
                            }
                            aVar = c0.f9153d;
                        }
                    }
                }
            }
            obj2 = aVar;
        }
        if (obj2 != c0.f9153d && obj2 != c0.f9154e) {
            if (obj2 == c0.f9156g) {
                return false;
            }
            j(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th2) {
        if (P()) {
            return true;
        }
        boolean z5 = th2 instanceof CancellationException;
        o oVar = (o) f9203b.get(this);
        return (oVar == null || oVar == q1.f9213a) ? z5 : oVar.a(th2) || z5;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    public String s() {
        return "Job was cancelled";
    }

    @Override // eg.e1
    public final boolean start() {
        int d02;
        do {
            d02 = d0(f9202a.get(this));
            if (d02 == 0) {
                return false;
            }
        } while (d02 != 1);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext t(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(T() + '{' + e0(f9202a.get(this)) + '}');
        sb2.append('@');
        sb2.append(c0.n(this));
        return sb2.toString();
    }

    public boolean u(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return o(th2) && E();
    }

    public final void v(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9203b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.b();
            atomicReferenceFieldUpdater.set(this, q1.f9213a);
        }
        androidx.fragment.app.i0 i0Var = null;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f9223a : null;
        if (b1Var instanceof i1) {
            try {
                ((i1) b1Var).l(th2);
                return;
            } catch (Throwable th3) {
                I(new androidx.fragment.app.i0("Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        o1 d10 = b1Var.d();
        if (d10 != null) {
            d10.e(new jg.j(1), 1);
            Object obj2 = jg.m.f18511a.get(d10);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (jg.m mVar = (jg.m) obj2; !Intrinsics.areEqual(mVar, d10); mVar = mVar.h()) {
                if (mVar instanceof i1) {
                    try {
                        ((i1) mVar).l(th2);
                    } catch (Throwable th4) {
                        if (i0Var != null) {
                            gf.d.a(i0Var, th4);
                        } else {
                            i0Var = new androidx.fragment.app.i0("Exception in completion handler " + mVar + " for " + this, th4);
                            Unit unit = Unit.f19194a;
                        }
                    }
                }
            }
            if (i0Var != null) {
                I(i0Var);
            }
        }
    }

    @Override // eg.e1
    public final Object w(mf.c frame) {
        Object obj;
        do {
            obj = f9202a.get(this);
            if (!(obj instanceof b1)) {
                c0.k(frame.getContext());
                return Unit.f19194a;
            }
        } while (d0(obj) < 0);
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        lVar.v(new h(2, c0.r(this, new n(lVar, 1))));
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r5 != aVar) {
            r5 = Unit.f19194a;
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new f1(s(), null, this) : th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        m1 m1Var = (m1) ((s1) obj);
        m1Var.getClass();
        Object obj2 = f9202a.get(m1Var);
        if (obj2 instanceof l1) {
            cancellationException = ((l1) obj2).b();
        } else if (obj2 instanceof t) {
            cancellationException = ((t) obj2).f9223a;
        } else {
            if (obj2 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new f1("Parent job is ".concat(e0(obj2)), cancellationException, m1Var) : cancellationException2;
    }

    @Override // eg.e1
    public final CancellationException y() {
        CancellationException cancellationException;
        Object obj = f9202a.get(this);
        if (!(obj instanceof l1)) {
            if (obj instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof t)) {
                return new f1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((t) obj).f9223a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new f1(s(), th2, this) : cancellationException;
        }
        Throwable b10 = ((l1) obj).b();
        if (b10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b10 instanceof CancellationException ? (CancellationException) b10 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = s();
        }
        return new f1(concat, b10, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public void a0() {
    }

    public void I(androidx.fragment.app.i0 i0Var) {
        throw i0Var;
    }

    public void Z(Object obj) {
    }

    public void j(Object obj) {
    }
}
