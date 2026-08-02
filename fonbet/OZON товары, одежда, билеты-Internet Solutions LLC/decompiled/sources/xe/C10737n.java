package xe;

import De.C2857A;
import De.C2866i;
import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.InterfaceC10731k;

/* renamed from: xe.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10737n<T> extends AbstractC10714b0<T> implements InterfaceC10733l<T>, kotlin.coroutines.jvm.internal.d, j1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105487f = AtomicIntegerFieldUpdater.newUpdater(C10737n.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105488g = AtomicReferenceFieldUpdater.newUpdater(C10737n.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105489h = AtomicReferenceFieldUpdater.newUpdater(C10737n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<T> f105490d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f105491e;

    public C10737n(int i11, @NotNull kotlin.coroutines.d dVar) {
        super(i11);
        this.f105490d = dVar;
        this.f105491e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C10713b.f105426a;
    }

    private static Object H(P0 p02, Object obj, int i11, InterfaceC6511n interfaceC6511n) {
        if (obj instanceof C10760z) {
            return obj;
        }
        if (i11 != 1 && i11 != 2) {
            return obj;
        }
        if (interfaceC6511n != null || (p02 instanceof InterfaceC10731k)) {
            return new C10758y(obj, p02 instanceof InterfaceC10731k ? (InterfaceC10731k) p02 : null, interfaceC6511n, (CancellationException) null, 16);
        }
        return obj;
    }

    private final C2857A I(Object obj, InterfaceC6511n interfaceC6511n) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj2 instanceof P0;
            C2857A c2857a = C10739o.f105494a;
            if (!z11) {
                boolean z12 = obj2 instanceof C10758y;
                return null;
            }
            Object H11 = H((P0) obj2, obj, this.f105427c, interfaceC6511n);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, H11)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                k();
            }
            return c2857a;
        }
    }

    private final void j(De.x<?> xVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f105491e;
        int i11 = f105487f.get(this) & 536870911;
        if (i11 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            xVar.l(i11, coroutineContext);
        } catch (Throwable th3) {
            K.a(coroutineContext, new C10709A("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final void l(int i11) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f105487f;
            i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = i12 >> 29;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z11 = i11 == 4;
                kotlin.coroutines.d<T> dVar = this.f105490d;
                if (!z11 && (dVar instanceof C2866i)) {
                    boolean z12 = i11 == 1 || i11 == 2;
                    int i14 = this.f105427c;
                    if (z12 == (i14 == 1 || i14 == 2)) {
                        C2866i c2866i = (C2866i) dVar;
                        I i15 = c2866i.f6623d;
                        CoroutineContext context = c2866i.f6624e.getContext();
                        if (i15.t(context)) {
                            i15.q(context, this);
                            return;
                        }
                        AbstractC10732k0 b11 = Z0.b();
                        if (b11.H0()) {
                            b11.z(this);
                            return;
                        }
                        b11.E0(true);
                        try {
                            C10716c0.a(this, dVar, true);
                            do {
                            } while (b11.M0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                C10716c0.a(this, dVar, z11);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, 1073741824 + (536870911 & i12)));
    }

    private final InterfaceC10724g0 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) this.f105491e.get(B0.a.f105375a);
        if (b02 == null) {
            return null;
        }
        InterfaceC10724g0 h11 = E0.h(b02, new r(this));
        do {
            atomicReferenceFieldUpdater = f105489h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, h11)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return h11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void r(P0 p02) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C10713b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC10731k) || (obj instanceof De.x)) {
                break;
            }
            if (obj instanceof C10760z) {
                C10760z c10760z = (C10760z) obj;
                if (!c10760z.b()) {
                    w(p02, obj);
                    throw null;
                }
                if (obj instanceof C10743q) {
                    if (obj == null) {
                        c10760z = null;
                    }
                    Throwable th2 = c10760z != null ? c10760z.f105510a : null;
                    if (p02 instanceof InterfaceC10731k) {
                        h((InterfaceC10731k) p02, th2);
                        return;
                    } else {
                        Intrinsics.g(p02, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        j((De.x) p02, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C10758y)) {
                if (p02 instanceof De.x) {
                    return;
                }
                Intrinsics.g(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C10758y c10758y = new C10758y(obj, (InterfaceC10731k) p02, (InterfaceC6511n) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10758y)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C10758y c10758y2 = (C10758y) obj;
            if (c10758y2.f105505b != null) {
                w(p02, obj);
                throw null;
            }
            if (p02 instanceof De.x) {
                return;
            }
            Intrinsics.g(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC10731k interfaceC10731k = (InterfaceC10731k) p02;
            Throwable th3 = c10758y2.f105508e;
            if (th3 != null) {
                h(interfaceC10731k, th3);
                return;
            }
            C10758y a11 = C10758y.a(c10758y2, interfaceC10731k, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a11)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    private final boolean v() {
        if (this.f105427c != 2) {
            return false;
        }
        kotlin.coroutines.d<T> dVar = this.f105490d;
        Intrinsics.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2866i) dVar).i();
    }

    private static void w(P0 p02, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + p02 + ", already has " + obj).toString());
    }

    @Override // xe.InterfaceC10733l
    public final boolean A(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof P0)) {
                return false;
            }
            C10743q c10743q = new C10743q(this, th2, (obj instanceof InterfaceC10731k) || (obj instanceof De.x));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10743q)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            P0 p02 = (P0) obj;
            if (p02 instanceof InterfaceC10731k) {
                h((InterfaceC10731k) obj, th2);
            } else if (p02 instanceof De.x) {
                j((De.x) obj, th2);
            }
            if (!v()) {
                k();
            }
            l(this.f105427c);
            return true;
        }
    }

    public final boolean B() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C10758y) && ((C10758y) obj).f105507d != null) {
            k();
            return false;
        }
        f105487f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C10713b.f105426a);
        return true;
    }

    public final <R> void C(R r11, int i11, InterfaceC6511n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC6511n) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                Object H11 = H((P0) obj, r11, i11, interfaceC6511n);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, H11)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!v()) {
                    k();
                }
                l(i11);
                return;
            }
            if (obj instanceof C10743q) {
                C10743q c10743q = (C10743q) obj;
                if (c10743q.c()) {
                    if (interfaceC6511n != null) {
                        i(interfaceC6511n, c10743q.f105510a, r11);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + r11).toString());
        }
    }

    @Override // xe.InterfaceC10733l
    public final C2857A D(Object obj, InterfaceC6511n interfaceC6511n) {
        return I(obj, interfaceC6511n);
    }

    @Override // xe.InterfaceC10733l
    public final void E(@NotNull Object obj) {
        l(this.f105427c);
    }

    public final void F(@NotNull I i11, T t2) {
        kotlin.coroutines.d<T> dVar = this.f105490d;
        C2866i c2866i = dVar instanceof C2866i ? (C2866i) dVar : null;
        C(t2, (c2866i != null ? c2866i.f6623d : null) == i11 ? 4 : this.f105427c, null);
    }

    @Override // xe.InterfaceC10733l
    public final <R extends T> void G(R r11, InterfaceC6511n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC6511n) {
        C(r11, this.f105427c, interfaceC6511n);
    }

    public final C2857A J(@NotNull Throwable th2) {
        return I(new C10760z(false, th2), null);
    }

    @Override // xe.j1
    public final void a(@NotNull De.x<?> xVar, int i11) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f105487f;
            i12 = atomicIntegerFieldUpdater.get(this);
            if ((i12 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, ((i12 >> 29) << 29) + i11));
        r(xVar);
    }

    @Override // xe.AbstractC10714b0
    public final void b(@NotNull CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105488g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C10760z) {
                return;
            }
            if (!(obj instanceof C10758y)) {
                cancellationException2 = cancellationException;
                C10758y c10758y = new C10758y(obj, (InterfaceC10731k) null, (InterfaceC6511n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10758y)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C10758y c10758y2 = (C10758y) obj;
            if (c10758y2.f105508e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C10758y a11 = C10758y.a(c10758y2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a11)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC10731k interfaceC10731k = c10758y2.f105505b;
            if (interfaceC10731k != null) {
                h(interfaceC10731k, cancellationException);
            }
            InterfaceC6511n<Throwable, R, CoroutineContext, Unit> interfaceC6511n = c10758y2.f105506c;
            if (interfaceC6511n != 0) {
                i(interfaceC6511n, cancellationException, c10758y2.f105504a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // xe.AbstractC10714b0
    @NotNull
    public final kotlin.coroutines.d<T> c() {
        return this.f105490d;
    }

    @Override // xe.AbstractC10714b0
    public final Throwable d(Object obj) {
        Throwable d11 = super.d(obj);
        if (d11 != null) {
            return d11;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xe.AbstractC10714b0
    public final <T> T e(Object obj) {
        return obj instanceof C10758y ? (T) ((C10758y) obj).f105504a : obj;
    }

    @Override // xe.AbstractC10714b0
    public final Object g() {
        return f105488g.get(this);
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f105490d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f105491e;
    }

    public final void h(@NotNull InterfaceC10731k interfaceC10731k, Throwable th2) {
        try {
            interfaceC10731k.b(th2);
        } catch (Throwable th3) {
            K.a(this.f105491e, new C10709A("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void i(@NotNull InterfaceC6511n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC6511n, @NotNull Throwable th2, R r11) {
        CoroutineContext coroutineContext = this.f105491e;
        try {
            interfaceC6511n.invoke(th2, r11, coroutineContext);
        } catch (Throwable th3) {
            K.a(coroutineContext, new C10709A("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // xe.InterfaceC10733l
    public final boolean isActive() {
        return f105488g.get(this) instanceof P0;
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105489h;
        InterfaceC10724g0 interfaceC10724g0 = (InterfaceC10724g0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC10724g0 == null) {
            return;
        }
        interfaceC10724g0.dispose();
        atomicReferenceFieldUpdater.set(this, O0.f105413a);
    }

    @NotNull
    public Throwable m(@NotNull H0 h02) {
        return h02.Z();
    }

    public final Object n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean v11 = v();
        do {
            atomicIntegerFieldUpdater = f105487f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v11) {
                    z();
                }
                Object obj = f105488g.get(this);
                if (obj instanceof C10760z) {
                    throw ((C10760z) obj).f105510a;
                }
                int i13 = this.f105427c;
                if (i13 == 1 || i13 == 2) {
                    B0.a aVar = B0.f105374o0;
                    B0 b02 = (B0) this.f105491e.get(B0.a.f105375a);
                    if (b02 != null && !b02.isActive()) {
                        CancellationException Z11 = b02.Z();
                        b(Z11);
                        throw Z11;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 536870912 + (536870911 & i11)));
        if (((InterfaceC10724g0) f105489h.get(this)) == null) {
            p();
        }
        if (v11) {
            z();
        }
        return Wc.a.COROUTINE_SUSPENDED;
    }

    public final void o() {
        InterfaceC10724g0 p11 = p();
        if (p11 != null && t()) {
            p11.dispose();
            f105489h.set(this, O0.f105413a);
        }
    }

    public final void q(@NotNull Function1<? super Throwable, Unit> function1) {
        s(new InterfaceC10731k.a(function1));
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        Throwable b11 = Sc.r.b(obj);
        if (b11 != null) {
            obj = new C10760z(false, b11);
        }
        C(obj, this.f105427c, null);
    }

    public final void s(@NotNull InterfaceC10731k interfaceC10731k) {
        r(interfaceC10731k);
    }

    public final boolean t() {
        return !(f105488g.get(this) instanceof P0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(x());
        sb2.append('(');
        sb2.append(Q.b(this.f105490d));
        sb2.append("){");
        Object obj = f105488g.get(this);
        sb2.append(obj instanceof P0 ? "Active" : obj instanceof C10743q ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(Q.a(this));
        return sb2.toString();
    }

    @Override // xe.InterfaceC10733l
    public final void u(T t2, final Function1<? super Throwable, Unit> function1) {
        C(t2, this.f105427c, function1 != null ? new InterfaceC6511n() { // from class: xe.m
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Function1.this.invoke((Throwable) obj);
                return Unit.f71690a;
            }
        } : null);
    }

    @NotNull
    protected String x() {
        return "CancellableContinuation";
    }

    public final void y(@NotNull Throwable th2) {
        boolean j11;
        if (v()) {
            kotlin.coroutines.d<T> dVar = this.f105490d;
            Intrinsics.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            j11 = ((C2866i) dVar).j(th2);
        } else {
            j11 = false;
        }
        if (j11) {
            return;
        }
        A(th2);
        if (v()) {
            return;
        }
        k();
    }

    public final void z() {
        Throwable l11;
        kotlin.coroutines.d<T> dVar = this.f105490d;
        C2866i c2866i = dVar instanceof C2866i ? (C2866i) dVar : null;
        if (c2866i == null || (l11 = c2866i.l(this)) == null) {
            return;
        }
        k();
        A(l11);
    }
}
