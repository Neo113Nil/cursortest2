package Wh;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.L;
import Ph.U;
import Ph.l1;
import Ph.r;
import Sh.D;
import Sh.G;
import Wh.f;
import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public class f extends j implements Wh.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13289i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    public final Function3 f13290h;
    private volatile /* synthetic */ Object owner$volatile;

    public final class a implements InterfaceC1465n, l1 {

        /* renamed from: a, reason: collision with root package name */
        public final C1469p f13291a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f13292b;

        public a(C1469p c1469p, Object obj) {
            this.f13291a = c1469p;
            this.f13292b = obj;
        }

        public static final Unit j(f fVar, a aVar, Throwable th2) {
            fVar.g(aVar.f13292b);
            return Unit.INSTANCE;
        }

        public static final Unit o(f fVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            f.z().set(fVar, aVar.f13292b);
            fVar.g(aVar.f13292b);
            return Unit.INSTANCE;
        }

        @Override // Ph.l1
        public void a(D d10, int i10) {
            this.f13291a.a(d10, i10);
        }

        @Override // Ph.InterfaceC1465n
        public void c(Function1 function1) {
            this.f13291a.c(function1);
        }

        @Override // Ph.InterfaceC1465n
        public boolean cancel(Throwable th2) {
            return this.f13291a.cancel(th2);
        }

        @Override // Ph.InterfaceC1465n
        public Object e(Throwable th2) {
            return this.f13291a.e(th2);
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public CoroutineContext get$context() {
            return this.f13291a.get$context();
        }

        @Override // Ph.InterfaceC1465n
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void f(Unit unit, Function1 function1) {
            this.f13291a.f(unit, function1);
        }

        @Override // Ph.InterfaceC1465n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void l(Unit unit, Function3 function3) {
            f.z().set(f.this, this.f13292b);
            C1469p c1469p = this.f13291a;
            final f fVar = f.this;
            c1469p.f(unit, new Function1() { // from class: Wh.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit j10;
                    j10 = f.a.j(f.this, this, (Throwable) obj);
                    return j10;
                }
            });
        }

        @Override // Ph.InterfaceC1465n
        public boolean isActive() {
            return this.f13291a.isActive();
        }

        @Override // Ph.InterfaceC1465n
        public boolean isCancelled() {
            return this.f13291a.isCancelled();
        }

        @Override // Ph.InterfaceC1465n
        public boolean isCompleted() {
            return this.f13291a.isCompleted();
        }

        @Override // Ph.InterfaceC1465n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(L l10, Unit unit) {
            this.f13291a.b(l10, unit);
        }

        @Override // Ph.InterfaceC1465n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object n(Unit unit, Object obj, Function3 function3) {
            final f fVar = f.this;
            Object n10 = this.f13291a.n(unit, obj, new Function3() { // from class: Wh.d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit o10;
                    o10 = f.a.o(f.this, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                    return o10;
                }
            });
            if (n10 != null) {
                f.z().set(f.this, this.f13292b);
            }
            return n10;
        }

        @Override // Ph.InterfaceC1465n
        public void q(Object obj) {
            this.f13291a.q(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f13291a.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f13294a;
        this.f13290h = new Function3() { // from class: Wh.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Function3 D10;
                D10 = f.D(f.this, (Vh.f) obj, obj2, obj3);
                return D10;
            }
        };
    }

    public static /* synthetic */ Object B(f fVar, Object obj, Continuation continuation) {
        if (fVar.c(obj)) {
            return Unit.INSTANCE;
        }
        Object C10 = fVar.C(obj, continuation);
        return C10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? C10 : Unit.INSTANCE;
    }

    public static final Function3 D(final f fVar, Vh.f fVar2, final Object obj, Object obj2) {
        return new Function3() { // from class: Wh.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Unit E10;
                E10 = f.E(f.this, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return E10;
            }
        };
    }

    public static final Unit E(f fVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        fVar.g(obj);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f13289i;
    }

    public final int A(Object obj) {
        G g10;
        while (d()) {
            Object obj2 = f13289i.get(this);
            g10 = g.f13294a;
            if (obj2 != g10) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object C(Object obj, Continuation continuation) {
        C1469p b10 = r.b(IntrinsicsKt.intercepted(continuation));
        try {
            j(new a(b10, obj));
            Object z10 = b10.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
        } catch (Throwable th2) {
            b10.N();
            throw th2;
        }
    }

    public final int F(Object obj) {
        while (!b()) {
            if (obj == null) {
                return 1;
            }
            int A10 = A(obj);
            if (A10 == 1) {
                return 2;
            }
            if (A10 == 2) {
                return 1;
            }
        }
        f13289i.set(this, obj);
        return 0;
    }

    @Override // Wh.a
    public boolean c(Object obj) {
        int F10 = F(obj);
        if (F10 == 0) {
            return true;
        }
        if (F10 == 1) {
            return false;
        }
        if (F10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // Wh.a
    public boolean d() {
        return a() == 0;
    }

    @Override // Wh.a
    public Object f(Object obj, Continuation continuation) {
        return B(this, obj, continuation);
    }

    @Override // Wh.a
    public void g(Object obj) {
        G g10;
        G g11;
        while (d()) {
            Object obj2 = f13289i.get(this);
            g10 = g.f13294a;
            if (obj2 != g10) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13289i;
                g11 = g.f13294a;
                if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, obj2, g11)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + U.b(this) + "[isLocked=" + d() + ",owner=" + f13289i.get(this) + ']';
    }
}
