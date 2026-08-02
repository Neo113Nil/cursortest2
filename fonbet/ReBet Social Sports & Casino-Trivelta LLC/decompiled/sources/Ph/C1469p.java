package Ph;

import Ph.InterfaceC1463m;
import Sh.C1571i;
import f0.AbstractC4221b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: Ph.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1469p extends AbstractC1446d0 implements InterfaceC1465n, CoroutineStackFrame, l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9122f = AtomicIntegerFieldUpdater.newUpdater(C1469p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9123g = AtomicReferenceFieldUpdater.newUpdater(C1469p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9124h = AtomicReferenceFieldUpdater.newUpdater(C1469p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f9125d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f9126e;

    public C1469p(Continuation continuation, int i10) {
        super(i10);
        this.f9125d = continuation;
        this.f9126e = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1445d.f9065a;
    }

    public static final Unit P(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void R(C1469p c1469p, Object obj, int i10, Function3 function3, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function3 = null;
        }
        c1469p.Q(obj, i10, function3);
    }

    private final boolean T() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9122f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9122f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9122f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9122f.compareAndSet(this, i10, PKIFailureInfo.duplicateCertReq + (536870911 & i10)));
        return true;
    }

    public final Object A() {
        return f9123g.get(this);
    }

    public final String B() {
        Object A10 = A();
        return A10 instanceof Q0 ? "Active" : A10 instanceof C1474s ? "Cancelled" : "Completed";
    }

    public void F() {
        InterfaceC1456i0 G10 = G();
        if (G10 != null && isCompleted()) {
            G10.dispose();
            f9124h.set(this, P0.f9046a);
        }
    }

    public final InterfaceC1456i0 G() {
        C0 c02 = (C0) get$context().get(C0.f9001U2);
        if (c02 == null) {
            return null;
        }
        InterfaceC1456i0 p10 = G0.p(c02, false, new C1476t(this), 1, null);
        AbstractC4221b.a(f9124h, this, null, p10);
        return p10;
    }

    public final void H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9123g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C1445d) {
                if (AbstractC4221b.a(f9123g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC1463m) || (obj2 instanceof Sh.D)) {
                K(obj, obj2);
            } else {
                if (obj2 instanceof C) {
                    C c10 = (C) obj2;
                    if (!c10.c()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof C1474s) {
                        Throwable th2 = c10.f9000a;
                        if (obj instanceof InterfaceC1463m) {
                            p((InterfaceC1463m) obj, th2);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            s((Sh.D) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (b10.f8994b != null) {
                        K(obj, obj2);
                    }
                    if (obj instanceof Sh.D) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC1463m interfaceC1463m = (InterfaceC1463m) obj;
                    if (b10.c()) {
                        p(interfaceC1463m, b10.f8997e);
                        return;
                    } else {
                        if (AbstractC4221b.a(f9123g, this, obj2, B.b(b10, null, interfaceC1463m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Sh.D) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC4221b.a(f9123g, this, obj2, new B(obj2, (InterfaceC1463m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void I(InterfaceC1463m interfaceC1463m) {
        H(interfaceC1463m);
    }

    public final boolean J() {
        if (!AbstractC1448e0.c(this.f9066c)) {
            return false;
        }
        Continuation continuation = this.f9125d;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1571i) continuation).t();
    }

    public final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th2) {
        if (t(th2)) {
            return;
        }
        cancel(th2);
        v();
    }

    public final void N() {
        Throwable w10;
        Continuation continuation = this.f9125d;
        C1571i c1571i = continuation instanceof C1571i ? (C1571i) continuation : null;
        if (c1571i == null || (w10 = c1571i.w(this)) == null) {
            return;
        }
        u();
        cancel(w10);
    }

    public final boolean O() {
        Object obj = f9123g.get(this);
        if ((obj instanceof B) && ((B) obj).f8996d != null) {
            u();
            return false;
        }
        f9122f.set(this, 536870911);
        f9123g.set(this, C1445d.f9065a);
        return true;
    }

    public final void Q(Object obj, int i10, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9123g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof Q0)) {
                Object obj3 = obj;
                Function3 function32 = function3;
                if (obj2 instanceof C1474s) {
                    C1474s c1474s = (C1474s) obj2;
                    if (c1474s.e()) {
                        if (function32 != null) {
                            r(function32, c1474s.f9000a, obj3);
                            return;
                        }
                        return;
                    }
                }
                o(obj3);
                throw new KotlinNothingValueException();
            }
            Object obj4 = obj;
            int i11 = i10;
            Function3 function33 = function3;
            if (AbstractC4221b.a(f9123g, this, obj2, S((Q0) obj2, obj4, i11, function33, null))) {
                v();
                w(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                function3 = function33;
            }
        }
    }

    public final Object S(Q0 q02, Object obj, int i10, Function3 function3, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if ((AbstractC1448e0.b(i10) || obj2 != null) && !(function3 == null && !(q02 instanceof InterfaceC1463m) && obj2 == null)) {
            return new B(obj, q02 instanceof InterfaceC1463m ? (InterfaceC1463m) q02 : null, function3, obj2, null, 16, null);
        }
        return obj;
    }

    public final Sh.G U(Object obj, Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9123g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof Q0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof B) && obj4 != null && ((B) obj3).f8996d == obj4) {
                    return AbstractC1471q.f9127a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            Function3 function32 = function3;
            if (AbstractC4221b.a(f9123g, this, obj3, S((Q0) obj3, obj5, this.f9066c, function32, obj6))) {
                v();
                return AbstractC1471q.f9127a;
            }
            obj = obj5;
            function3 = function32;
            obj2 = obj6;
        }
    }

    @Override // Ph.l1
    public void a(Sh.D d10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9122f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        H(d10);
    }

    @Override // Ph.InterfaceC1465n
    public void b(L l10, Object obj) {
        Continuation continuation = this.f9125d;
        C1571i c1571i = continuation instanceof C1571i ? (C1571i) continuation : null;
        R(this, obj, (c1571i != null ? c1571i.f10789d : null) == l10 ? 4 : this.f9066c, null, 4, null);
    }

    @Override // Ph.InterfaceC1465n
    public void c(Function1 function1) {
        r.c(this, new InterfaceC1463m.a(function1));
    }

    @Override // Ph.InterfaceC1465n
    public boolean cancel(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9123g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof Q0)) {
                return false;
            }
        } while (!AbstractC4221b.a(f9123g, this, obj, new C1474s(this, th2, (obj instanceof InterfaceC1463m) || (obj instanceof Sh.D))));
        Q0 q02 = (Q0) obj;
        if (q02 instanceof InterfaceC1463m) {
            p((InterfaceC1463m) obj, th2);
        } else if (q02 instanceof Sh.D) {
            s((Sh.D) obj, th2);
        }
        v();
        w(this.f9066c);
        return true;
    }

    @Override // Ph.AbstractC1446d0
    public void d(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9123g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Q0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b10 = (B) obj2;
                if (b10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (AbstractC4221b.a(f9123g, this, obj2, B.b(b10, null, null, null, null, th4, 15, null))) {
                    b10.d(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (AbstractC4221b.a(f9123g, this, obj2, new B(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // Ph.InterfaceC1465n
    public Object e(Throwable th2) {
        return U(new C(th2, false, 2, null), null, null);
    }

    @Override // Ph.InterfaceC1465n
    public void f(Object obj, final Function1 function1) {
        Q(obj, this.f9066c, function1 != null ? new Function3() { // from class: Ph.o
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Unit P10;
                P10 = C1469p.P(Function1.this, (Throwable) obj2, obj3, (CoroutineContext) obj4);
                return P10;
            }
        } : null);
    }

    @Override // Ph.AbstractC1446d0
    public final Continuation g() {
        return this.f9125d;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f9125d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        return this.f9126e;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Ph.AbstractC1446d0
    public Throwable h(Object obj) {
        Throwable h10 = super.h(obj);
        if (h10 != null) {
            return h10;
        }
        return null;
    }

    @Override // Ph.AbstractC1446d0
    public Object i(Object obj) {
        return obj instanceof B ? ((B) obj).f8993a : obj;
    }

    @Override // Ph.InterfaceC1465n
    public boolean isActive() {
        return A() instanceof Q0;
    }

    @Override // Ph.InterfaceC1465n
    public boolean isCancelled() {
        return A() instanceof C1474s;
    }

    @Override // Ph.InterfaceC1465n
    public boolean isCompleted() {
        return !(A() instanceof Q0);
    }

    @Override // Ph.AbstractC1446d0
    public Object k() {
        return A();
    }

    @Override // Ph.InterfaceC1465n
    public void l(Object obj, Function3 function3) {
        Q(obj, this.f9066c, function3);
    }

    @Override // Ph.InterfaceC1465n
    public Object n(Object obj, Object obj2, Function3 function3) {
        return U(obj, obj2, function3);
    }

    public final Void o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void p(InterfaceC1463m interfaceC1463m, Throwable th2) {
        try {
            interfaceC1463m.b(th2);
        } catch (Throwable th3) {
            N.a(get$context(), new D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // Ph.InterfaceC1465n
    public void q(Object obj) {
        w(this.f9066c);
    }

    public final void r(Function3 function3, Throwable th2, Object obj) {
        try {
            function3.invoke(th2, obj, get$context());
        } catch (Throwable th3) {
            N.a(get$context(), new D("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        R(this, E.c(obj, this), this.f9066c, null, 4, null);
    }

    public final void s(Sh.D d10, Throwable th2) {
        int i10 = f9122f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            d10.s(i10, th2, get$context());
        } catch (Throwable th3) {
            N.a(get$context(), new D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final boolean t(Throwable th2) {
        if (!J()) {
            return false;
        }
        Continuation continuation = this.f9125d;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1571i) continuation).u(th2);
    }

    public String toString() {
        return L() + '(' + U.c(this.f9125d) + "){" + B() + "}@" + U.b(this);
    }

    public final void u() {
        InterfaceC1456i0 y10 = y();
        if (y10 == null) {
            return;
        }
        y10.dispose();
        f9124h.set(this, P0.f9046a);
    }

    public final void v() {
        if (J()) {
            return;
        }
        u();
    }

    public final void w(int i10) {
        if (T()) {
            return;
        }
        AbstractC1448e0.a(this, i10);
    }

    public Throwable x(C0 c02) {
        return c02.getCancellationException();
    }

    public final InterfaceC1456i0 y() {
        return (InterfaceC1456i0) f9124h.get(this);
    }

    public final Object z() {
        C0 c02;
        boolean J10 = J();
        if (V()) {
            if (y() == null) {
                G();
            }
            if (J10) {
                N();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (J10) {
            N();
        }
        Object A10 = A();
        if (A10 instanceof C) {
            throw ((C) A10).f9000a;
        }
        if (!AbstractC1448e0.b(this.f9066c) || (c02 = (C0) get$context().get(C0.f9001U2)) == null || c02.isActive()) {
            return i(A10);
        }
        CancellationException cancellationException = c02.getCancellationException();
        d(A10, cancellationException);
        throw cancellationException;
    }
}
