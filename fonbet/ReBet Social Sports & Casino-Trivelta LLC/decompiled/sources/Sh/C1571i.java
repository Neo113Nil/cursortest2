package Sh;

import Ph.AbstractC1446d0;
import Ph.AbstractC1464m0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.a1;
import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sh.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1571i extends AbstractC1446d0 implements CoroutineStackFrame, Continuation {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10788h = AtomicReferenceFieldUpdater.newUpdater(C1571i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Ph.L f10789d;

    /* renamed from: e, reason: collision with root package name */
    public final Continuation f10790e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10791f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10792g;

    public C1571i(Ph.L l10, Continuation continuation) {
        super(-1);
        G g10;
        this.f10789d = l10;
        this.f10790e = continuation;
        g10 = AbstractC1572j.f10793a;
        this.f10791f = g10;
        this.f10792g = N.g(get$context());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f10790e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        return this.f10790e.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Ph.AbstractC1446d0
    public Object k() {
        G g10;
        Object obj = this.f10791f;
        g10 = AbstractC1572j.f10793a;
        this.f10791f = g10;
        return obj;
    }

    public final void m() {
        while (f10788h.get(this) == AbstractC1572j.f10794b) {
        }
    }

    public final C1469p o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10788h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f10788h.set(this, AbstractC1572j.f10794b);
                return null;
            }
            if (obj instanceof C1469p) {
                if (AbstractC4221b.a(f10788h, this, obj, AbstractC1572j.f10794b)) {
                    return (C1469p) obj;
                }
            } else if (obj != AbstractC1572j.f10794b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void p(CoroutineContext coroutineContext, Object obj) {
        this.f10791f = obj;
        this.f9066c = 1;
        this.f10789d.Z1(coroutineContext, this);
    }

    public final C1469p r() {
        Object obj = f10788h.get(this);
        if (obj instanceof C1469p) {
            return (C1469p) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object b10 = Ph.E.b(obj);
        if (AbstractC1572j.d(this.f10789d, get$context())) {
            this.f10791f = b10;
            this.f9066c = 0;
            AbstractC1572j.c(this.f10789d, get$context(), this);
            return;
        }
        AbstractC1464m0 b11 = a1.f9061a.b();
        if (b11.l2()) {
            this.f10791f = b10;
            this.f9066c = 0;
            b11.h2(this);
            return;
        }
        b11.j2(true);
        try {
            CoroutineContext coroutineContext = get$context();
            Object i10 = N.i(coroutineContext, this.f10792g);
            try {
                this.f10790e.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (b11.o2()) {
                }
            } finally {
                N.f(coroutineContext, i10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t() {
        return f10788h.get(this) != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f10789d + ", " + Ph.U.c(this.f10790e) + ']';
    }

    public final boolean u(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10788h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            G g10 = AbstractC1572j.f10794b;
            if (Intrinsics.areEqual(obj, g10)) {
                if (AbstractC4221b.a(f10788h, this, g10, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC4221b.a(f10788h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        m();
        C1469p r10 = r();
        if (r10 != null) {
            r10.u();
        }
    }

    public final Throwable w(InterfaceC1465n interfaceC1465n) {
        G g10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10788h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g10 = AbstractC1572j.f10794b;
            if (obj != g10) {
                if (obj instanceof Throwable) {
                    if (AbstractC4221b.a(f10788h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC4221b.a(f10788h, this, g10, interfaceC1465n));
        return null;
    }

    @Override // Ph.AbstractC1446d0
    public Continuation g() {
        return this;
    }
}
