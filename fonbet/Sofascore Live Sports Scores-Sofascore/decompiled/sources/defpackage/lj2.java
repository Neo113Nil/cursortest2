package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class lj2 extends v45 implements kj2, mu3, kzk {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final rq3 d;
    public final CoroutineContext e;

    static {
        Unsafe unsafe = rh0.a;
        f = unsafe.objectFieldOffset(lj2.class.getDeclaredField("_decisionAndIndex$volatile"));
        h = unsafe.objectFieldOffset(lj2.class.getDeclaredField("_state$volatile"));
        g = unsafe.objectFieldOffset(lj2.class.getDeclaredField("_parentHandle$volatile"));
    }

    public lj2(int i, rq3 rq3Var) {
        super(i);
        this.d = rq3Var;
        this.e = rq3Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = nc.a;
    }

    public static Object E(oed oedVar, Object obj, int i, ct8 ct8Var) {
        if (obj instanceof eb3) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (ct8Var != null || (oedVar instanceof ej2)) {
            return new cb3(obj, oedVar instanceof ej2 ? (ej2) oedVar : null, ct8Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(oed oedVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + oedVar + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.n();
        r9.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        lj2 lj2Var;
        Unsafe unsafe;
        rq3 rq3Var = this.d;
        Throwable th = null;
        s45 s45Var = rq3Var instanceof s45 ? (s45) rq3Var : null;
        if (s45Var == null) {
            return;
        }
        long j = s45.h;
        loop0: while (true) {
            Object objectVolatile = rh0.a.getObjectVolatile(s45Var, j);
            ih2 ih2Var = t45.b;
            if (objectVolatile != ih2Var) {
                lj2Var = this;
                if (!(objectVolatile instanceof Throwable)) {
                    cp4.g(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = rh0.a;
                    if (unsafe.compareAndSwapObject(s45Var, s45.h, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(s45Var, j) == objectVolatile);
                a70.p("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = rh0.a;
                lj2 lj2Var2 = this;
                lj2Var = lj2Var2;
                if (unsafe2.compareAndSwapObject(s45Var, s45.h, ih2Var, lj2Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(s45Var, j) != ih2Var) {
                    break;
                } else {
                    this = lj2Var;
                }
            }
            this = lj2Var;
        }
    }

    public final void C(Object obj, int i, ct8 ct8Var) {
        lj2 lj2Var;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof oed)) {
                lj2 lj2Var2 = this;
                if (objectVolatile instanceof sj2) {
                    sj2 sj2Var = (sj2) objectVolatile;
                    if (unsafe.compareAndSwapInt(sj2Var, sj2.c, 0, 1)) {
                        if (ct8Var != null) {
                            lj2Var2.l(ct8Var, sj2Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                cp4.g(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object E = E((oed) objectVolatile, obj, i, ct8Var);
            while (true) {
                Unsafe unsafe2 = rh0.a;
                lj2Var = this;
                if (unsafe2.compareAndSwapObject(lj2Var, h, objectVolatile, E)) {
                    if (!lj2Var.y()) {
                        lj2Var.n();
                    }
                    lj2Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(lj2Var, j) != objectVolatile) {
                    break;
                } else {
                    this = lj2Var;
                }
            }
            this = lj2Var;
        }
    }

    public final void D(au3 au3Var, Unit unit) {
        rq3 rq3Var = this.d;
        s45 s45Var = rq3Var instanceof s45 ? (s45) rq3Var : null;
        C(unit, (s45Var != null ? s45Var.d : null) == au3Var ? 4 : this.c, null);
    }

    public final ih2 F(Object obj, ct8 ct8Var) {
        lj2 lj2Var;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof oed)) {
                return null;
            }
            Object E = E((oed) objectVolatile, obj, this.c, ct8Var);
            while (true) {
                Unsafe unsafe2 = rh0.a;
                lj2Var = this;
                if (unsafe2.compareAndSwapObject(lj2Var, h, objectVolatile, E)) {
                    boolean y = lj2Var.y();
                    ih2 ih2Var = mj2.a;
                    if (!y) {
                        lj2Var.n();
                    }
                    return ih2Var;
                }
                if (unsafe2.getObjectVolatile(lj2Var, j) != objectVolatile) {
                    break;
                }
                this = lj2Var;
            }
            this = lj2Var;
        }
    }

    @Override // defpackage.kj2
    public final boolean a(Throwable th) {
        Throwable th2;
        lj2 lj2Var;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof oed)) {
                return false;
            }
            boolean z = (objectVolatile instanceof ej2) || (objectVolatile instanceof z0h);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            sj2 sj2Var = new sj2(th2, z);
            while (true) {
                Unsafe unsafe2 = rh0.a;
                lj2Var = this;
                if (unsafe2.compareAndSwapObject(lj2Var, h, objectVolatile, sj2Var)) {
                    oed oedVar = (oed) objectVolatile;
                    if (oedVar instanceof ej2) {
                        lj2Var.k((ej2) objectVolatile, th);
                    } else if (oedVar instanceof z0h) {
                        lj2Var.m((z0h) objectVolatile, th);
                    }
                    if (!lj2Var.y()) {
                        lj2Var.n();
                    }
                    lj2Var.o(lj2Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(lj2Var, j) != objectVolatile) {
                    break;
                }
                this = lj2Var;
            }
            this = lj2Var;
        }
    }

    @Override // defpackage.kzk
    public final void b(z0h z0hVar, int i) {
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                a70.r("invokeOnCancellation should be called at most once");
                return;
            }
            lj2 lj2Var = this;
            if (unsafe.compareAndSwapInt(lj2Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                lj2Var.w(z0hVar);
                return;
            }
            this = lj2Var;
        }
    }

    @Override // defpackage.kj2
    public final ih2 c(Object obj, ct8 ct8Var) {
        return F(obj, ct8Var);
    }

    @Override // defpackage.v45
    public final void d(CancellationException cancellationException) {
        CancellationException cancellationException2;
        lj2 lj2Var;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof oed) {
                a70.r("Not completed");
                return;
            }
            if (objectVolatile instanceof eb3) {
                return;
            }
            if (objectVolatile instanceof cb3) {
                cb3 cb3Var = (cb3) objectVolatile;
                if (cb3Var.e != null) {
                    a70.r("Must be called at most once");
                    return;
                }
                cb3 a = cb3.a(cb3Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    lj2 lj2Var2 = this;
                    if (unsafe2.compareAndSwapObject(lj2Var2, h, objectVolatile, a)) {
                        ej2 ej2Var = cb3Var.b;
                        if (ej2Var != null) {
                            lj2Var2.k(ej2Var, cancellationException);
                        }
                        ct8 ct8Var = cb3Var.c;
                        if (ct8Var != null) {
                            lj2Var2.l(ct8Var, cancellationException, cb3Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(lj2Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        lj2Var = lj2Var2;
                        break;
                    }
                    this = lj2Var2;
                }
            } else {
                lj2 lj2Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                cb3 cb3Var2 = new cb3(objectVolatile, (ej2) null, (ct8) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    cb3 cb3Var3 = cb3Var2;
                    Unsafe unsafe3 = rh0.a;
                    lj2Var = lj2Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(lj2Var, h, objectVolatile, cb3Var3);
                    cb3Var2 = cb3Var3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(lj2Var, j) != objectVolatile) {
                        break;
                    } else {
                        lj2Var3 = lj2Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = lj2Var;
        }
    }

    @Override // defpackage.v45
    public final rq3 e() {
        return this.d;
    }

    @Override // defpackage.v45
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override // defpackage.v45
    public final Object g(Object obj) {
        return obj instanceof cb3 ? ((cb3) obj).a : obj;
    }

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        rq3 rq3Var = this.d;
        if (rq3Var instanceof mu3) {
            return (mu3) rq3Var;
        }
        return null;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.kj2
    public final void i(Object obj, ct8 ct8Var) {
        C(obj, this.c, ct8Var);
    }

    @Override // defpackage.kj2
    public final boolean isActive() {
        return r() instanceof oed;
    }

    @Override // defpackage.v45
    public final Object j() {
        return r();
    }

    public final void k(ej2 ej2Var, Throwable th) {
        try {
            ej2Var.a(th);
        } catch (Throwable th2) {
            qx9.A(this.e, new fb3(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(ct8 ct8Var, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.e;
        try {
            ct8Var.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            qx9.A(coroutineContext, new fb3(0, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(z0h z0hVar, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int intVolatile = rh0.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            a70.r("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            z0hVar.h(intVolatile, coroutineContext);
        } catch (Throwable th2) {
            qx9.A(coroutineContext, new fb3(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        Unsafe unsafe = rh0.a;
        long j = g;
        q55 q55Var = (q55) unsafe.getObjectVolatile(this, j);
        if (q55Var == null) {
            return;
        }
        q55Var.d();
        unsafe.putObjectVolatile(this, j, ged.a);
    }

    public final void o(int i) {
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    a70.r("Already resumed");
                    return;
                }
                boolean z = i == 4;
                rq3 rq3Var = this.d;
                if (!z && (rq3Var instanceof s45)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        s45 s45Var = (s45) rq3Var;
                        au3 au3Var = s45Var.d;
                        CoroutineContext context = s45Var.e.getContext();
                        if (t45.c(au3Var, context)) {
                            t45.b(au3Var, context, this);
                            return;
                        }
                        g26 a = cgj.a();
                        if (a.c >= 4294967296L) {
                            a.j0(this);
                            return;
                        }
                        a.n0(true);
                        try {
                            zm2.G(this, rq3Var, true);
                            do {
                            } while (a.u0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                zm2.G(this, rq3Var, z);
                return;
            }
            lj2 lj2Var = this;
            if (unsafe.compareAndSwapInt(lj2Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = lj2Var;
            }
        }
    }

    public Throwable p(kea keaVar) {
        return keaVar.k();
    }

    public final Object q() {
        yda ydaVar;
        boolean y = y();
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    a70.r("Already suspended");
                    return null;
                }
                if (y) {
                    this.B();
                }
                Object r = this.r();
                if (r instanceof eb3) {
                    throw ((eb3) r).a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (ydaVar = (yda) this.e.get(uic.g)) == null || ydaVar.isActive()) {
                    return this.g(r);
                }
                CancellationException k = ydaVar.k();
                this.d(k);
                throw k;
            }
            lj2 lj2Var = this;
            if (unsafe.compareAndSwapInt(lj2Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((q55) unsafe.getObjectVolatile(lj2Var, g)) == null) {
                    lj2Var.u();
                }
                if (y) {
                    lj2Var.B();
                }
                return lu3.a;
            }
            this = lj2Var;
        }
    }

    public final Object r() {
        return rh0.a.getObjectVolatile(this, h);
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        Throwable a = w2g.a(obj);
        if (a != null) {
            obj = new eb3(a, false);
        }
        C(obj, this.c, null);
    }

    @Override // defpackage.kj2
    public final void s(Object obj) {
        o(this.c);
    }

    public final void t() {
        q55 u = u();
        if (u != null && x()) {
            u.d();
            rh0.a.putObjectVolatile(this, g, ged.a);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(A());
        sb.append('(');
        sb.append(ml4.s0(this.d));
        sb.append("){");
        Object r = r();
        sb.append(r instanceof oed ? "Active" : r instanceof sj2 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(ml4.X(this));
        return sb.toString();
    }

    public final q55 u() {
        yda ydaVar = (yda) this.e.get(uic.g);
        if (ydaVar == null) {
            return null;
        }
        q55 A = bea.A(ydaVar, true, new it2(this));
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            lj2 lj2Var = this;
            if (!unsafe.compareAndSwapObject(lj2Var, j, (Object) null, A) && unsafe.getObjectVolatile(lj2Var, j) == null) {
                this = lj2Var;
            }
        }
        return A;
    }

    public final void v(Function1 function1) {
        w(new dj2(function1, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        z(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(oed oedVar) {
        oed oedVar2;
        lj2 lj2Var;
        lj2 lj2Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = rh0.a;
            long j = h;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof nc) {
                while (true) {
                    Unsafe unsafe3 = rh0.a;
                    lj2 lj2Var3 = this;
                    oed oedVar3 = oedVar;
                    lj2Var = lj2Var3;
                    oedVar2 = oedVar3;
                    if (unsafe3.compareAndSwapObject(lj2Var3, h, objectVolatile, oedVar3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(lj2Var, j) != objectVolatile) {
                        break;
                    }
                    this = lj2Var;
                    oedVar = oedVar2;
                }
            } else {
                oedVar2 = oedVar;
                lj2Var = this;
                if ((objectVolatile instanceof ej2) || (objectVolatile instanceof z0h)) {
                    break;
                }
                if (objectVolatile instanceof eb3) {
                    eb3 eb3Var = (eb3) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(eb3Var, eb3.b, 0, 1)) {
                        z(oedVar2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof sj2) {
                        Throwable th = eb3Var.a;
                        if (oedVar2 instanceof ej2) {
                            lj2Var.k((ej2) oedVar2, th);
                            return;
                        } else {
                            lj2Var.m((z0h) oedVar2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof cb3) {
                    cb3 cb3Var = (cb3) objectVolatile;
                    if (cb3Var.b != null) {
                        z(oedVar2, objectVolatile);
                        throw null;
                    }
                    if (oedVar2 instanceof z0h) {
                        return;
                    }
                    ej2 ej2Var = (ej2) oedVar2;
                    Throwable th2 = cb3Var.e;
                    if (th2 != null) {
                        lj2Var.k(ej2Var, th2);
                        return;
                    }
                    cb3 a = cb3.a(cb3Var, ej2Var, null, 29);
                    do {
                        unsafe = rh0.a;
                        if (unsafe.compareAndSwapObject(lj2Var, h, objectVolatile, a)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(lj2Var, j) == objectVolatile);
                } else {
                    if (oedVar2 instanceof z0h) {
                        return;
                    }
                    cb3 cb3Var2 = new cb3(objectVolatile, (ej2) oedVar2, (ct8) null, (Throwable) null, 28);
                    while (true) {
                        cb3 cb3Var3 = cb3Var2;
                        Unsafe unsafe4 = rh0.a;
                        lj2Var2 = lj2Var;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(lj2Var2, h, objectVolatile, cb3Var3);
                        cb3Var2 = cb3Var3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(lj2Var2, j) != objectVolatile) {
                            break;
                        } else {
                            lj2Var = lj2Var2;
                        }
                    }
                    this = lj2Var2;
                    oedVar = oedVar2;
                }
            }
            lj2Var2 = lj2Var;
            this = lj2Var2;
            oedVar = oedVar2;
        }
    }

    public final boolean x() {
        return !(r() instanceof oed);
    }

    public final boolean y() {
        if (this.c != 2) {
            return false;
        }
        rq3 rq3Var = this.d;
        rq3Var.getClass();
        return rh0.a.getObjectVolatile((s45) rq3Var, s45.h) != null;
    }
}
