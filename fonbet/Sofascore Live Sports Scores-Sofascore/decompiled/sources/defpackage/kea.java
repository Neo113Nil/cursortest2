package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class kea implements yda, e9e {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = rh0.a;
        b = unsafe.objectFieldOffset(kea.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(kea.class.getDeclaredField("_parentHandle$volatile"));
    }

    public kea(boolean z) {
        this._state$volatile = z ? lea.g : lea.f;
    }

    public static kt2 Y(iib iibVar) {
        while (iibVar.j()) {
            iibVar = iibVar.i();
        }
        while (true) {
            iibVar = iibVar.h();
            if (!iibVar.j()) {
                if (iibVar instanceof kt2) {
                    return (kt2) iibVar;
                }
                if (iibVar instanceof ydd) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof gea)) {
            return obj instanceof k0a ? ((k0a) obj).isActive() ? "Active" : "New" : obj instanceof eb3 ? "Cancelled" : "Completed";
        }
        gea geaVar = (gea) obj;
        return geaVar.d() ? "Cancelling" : geaVar.e() ? "Completing" : "Active";
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && J();
    }

    @Override // defpackage.yda
    public final jt2 C(kea keaVar) {
        kea keaVar2;
        kt2 kt2Var = new kt2(keaVar);
        kt2Var.d = this;
        loop0: while (true) {
            Object O = this.O();
            if (O instanceof xl5) {
                xl5 xl5Var = (xl5) O;
                if (xl5Var.a) {
                    while (true) {
                        Unsafe unsafe = rh0.a;
                        long j = b;
                        keaVar2 = this;
                        if (unsafe.compareAndSwapObject(keaVar2, j, O, kt2Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(keaVar2, j) != O) {
                            break;
                        }
                        this = keaVar2;
                    }
                } else {
                    keaVar2 = this;
                    keaVar2.d0(xl5Var);
                }
                this = keaVar2;
            } else {
                keaVar2 = this;
                boolean z = O instanceof k0a;
                ged gedVar = ged.a;
                if (!z) {
                    Object O2 = keaVar2.O();
                    eb3 eb3Var = O2 instanceof eb3 ? (eb3) O2 : null;
                    kt2Var.m(eb3Var != null ? eb3Var.a : null);
                    return gedVar;
                }
                ydd b2 = ((k0a) O).b();
                if (b2 == null) {
                    keaVar2.e0((cea) O);
                    this = keaVar2;
                } else if (!b2.c(kt2Var, 7)) {
                    boolean c2 = b2.c(kt2Var, 3);
                    Object O3 = keaVar2.O();
                    if (O3 instanceof gea) {
                        r0 = ((gea) O3).c();
                    } else {
                        eb3 eb3Var2 = O3 instanceof eb3 ? (eb3) O3 : null;
                        if (eb3Var2 != null) {
                            r0 = eb3Var2.a;
                        }
                    }
                    kt2Var.m(r0);
                    if (c2) {
                        break loop0;
                    }
                    return gedVar;
                }
            }
        }
        return kt2Var;
    }

    public final void D(k0a k0aVar, Object obj) {
        Unsafe unsafe = rh0.a;
        long j = a;
        jt2 jt2Var = (jt2) unsafe.getObjectVolatile(this, j);
        if (jt2Var != null) {
            jt2Var.d();
            unsafe.putObjectVolatile(this, j, ged.a);
        }
        fb3 fb3Var = null;
        eb3 eb3Var = obj instanceof eb3 ? (eb3) obj : null;
        Throwable th = eb3Var != null ? eb3Var.a : null;
        if (k0aVar instanceof cea) {
            try {
                ((cea) k0aVar).m(th);
                return;
            } catch (Throwable th2) {
                Q(new fb3(0, "Exception in completion handler " + k0aVar + " for " + this, th2));
                return;
            }
        }
        ydd b2 = k0aVar.b();
        if (b2 != null) {
            b2.c(new acb(1), 1);
            Object g = b2.g();
            g.getClass();
            for (iib iibVar = (iib) g; !iibVar.equals(b2); iibVar = iibVar.h()) {
                if (iibVar instanceof cea) {
                    try {
                        ((cea) iibVar).m(th);
                    } catch (Throwable th3) {
                        if (fb3Var != null) {
                            de6.a(fb3Var, th3);
                        } else {
                            fb3Var = new fb3(0, "Exception in completion handler " + iibVar + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (fb3Var != null) {
                Q(fb3Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable E(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        kea keaVar = (kea) ((e9e) obj);
        Object O = keaVar.O();
        if (O instanceof gea) {
            cancellationException = ((gea) O).c();
        } else if (O instanceof eb3) {
            cancellationException = ((eb3) O).a;
        } else {
            if (O instanceof k0a) {
                cp4.g(O, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new zda("Parent job is ".concat(g0(O)), cancellationException, keaVar) : cancellationException2;
    }

    public final Object F(gea geaVar, Object obj) {
        gea geaVar2;
        Throwable th;
        Throwable I;
        kea keaVar;
        gea geaVar3;
        eb3 eb3Var = obj instanceof eb3 ? (eb3) obj : null;
        Throwable th2 = eb3Var != null ? eb3Var.a : null;
        synchronized (geaVar) {
            try {
                geaVar.d();
                ArrayList<Throwable> f = geaVar.f(th2);
                I = I(geaVar, f);
                if (I != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            for (Throwable th3 : f) {
                                if (th3 != I && th3 != I && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    de6.a(I, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        geaVar2 = geaVar;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                geaVar2 = geaVar;
                th = th5;
            }
        }
        if (I != null && I != th2) {
            obj = new eb3(I, false);
        }
        if (I != null && (z(I) || P(I))) {
            obj.getClass();
            rh0.a.compareAndSwapInt((eb3) obj, eb3.b, 0, 1);
        }
        b0(obj);
        Object o0aVar = obj instanceof k0a ? new o0a((k0a) obj) : obj;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = b;
            keaVar = this;
            geaVar3 = geaVar;
            if (!unsafe.compareAndSwapObject(keaVar, j, geaVar3, o0aVar) && unsafe.getObjectVolatile(keaVar, j) == geaVar3) {
                this = keaVar;
                geaVar = geaVar3;
            }
        }
        keaVar.D(geaVar3, obj);
        return obj;
    }

    public final Object G() {
        Object O = O();
        if (O instanceof k0a) {
            a70.r("This job has not completed yet");
            return null;
        }
        if (O instanceof eb3) {
            throw ((eb3) O).a;
        }
        return lea.a(O);
    }

    @Override // defpackage.yda
    public final q55 H(Function1 function1, boolean z, boolean z2) {
        return S(z2, z ? new eba(function1) : new fba(function1));
    }

    public final Throwable I(gea geaVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (geaVar.d()) {
                return new zda(A(), null, this);
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
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof qij) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof qij)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean J() {
        return true;
    }

    public final ujg K() {
        iea ieaVar = iea.b;
        i5k.e(3, ieaVar);
        jea jeaVar = jea.b;
        i5k.e(3, jeaVar);
        return new ujg(20, this, ieaVar, jeaVar, null, false);
    }

    public boolean L() {
        return this instanceof qa3;
    }

    public final ydd N(k0a k0aVar) {
        ydd b2 = k0aVar.b();
        if (b2 != null) {
            return b2;
        }
        if (k0aVar instanceof xl5) {
            return new ydd();
        }
        if (k0aVar instanceof cea) {
            e0((cea) k0aVar);
            return null;
        }
        cp4.g(k0aVar, "State should have list: ");
        return null;
    }

    public final Object O() {
        return rh0.a.getObjectVolatile(this, b);
    }

    public boolean P(Throwable th) {
        return false;
    }

    public final void R(yda ydaVar) {
        long j = a;
        ged gedVar = ged.a;
        if (ydaVar == null) {
            rh0.a.putObjectVolatile(this, j, gedVar);
            return;
        }
        ydaVar.start();
        jt2 C = ydaVar.C(this);
        Unsafe unsafe = rh0.a;
        unsafe.putObjectVolatile(this, j, C);
        if (t()) {
            C.d();
            unsafe.putObjectVolatile(this, j, gedVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q55 S(boolean z, cea ceaVar) {
        kea keaVar;
        cea ceaVar2;
        ged gedVar;
        boolean c2;
        ceaVar.d = this;
        loop0: while (true) {
            Object O = this.O();
            if (O instanceof xl5) {
                xl5 xl5Var = (xl5) O;
                if (xl5Var.a) {
                    while (true) {
                        Unsafe unsafe = rh0.a;
                        long j = b;
                        keaVar = this;
                        ceaVar2 = ceaVar;
                        if (unsafe.compareAndSwapObject(keaVar, j, O, ceaVar2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(keaVar, j) != O) {
                            break;
                        }
                        this = keaVar;
                        ceaVar = ceaVar2;
                    }
                } else {
                    keaVar = this;
                    ceaVar2 = ceaVar;
                    keaVar.d0(xl5Var);
                }
                this = keaVar;
                ceaVar = ceaVar2;
            } else {
                keaVar = this;
                ceaVar2 = ceaVar;
                boolean z2 = O instanceof k0a;
                gedVar = ged.a;
                if (z2) {
                    k0a k0aVar = (k0a) O;
                    ydd b2 = k0aVar.b();
                    if (b2 == null) {
                        keaVar.e0((cea) O);
                    } else {
                        if (ceaVar2.l()) {
                            gea geaVar = k0aVar instanceof gea ? (gea) k0aVar : null;
                            Throwable c3 = geaVar != null ? geaVar.c() : null;
                            if (c3 == null) {
                                c2 = b2.c(ceaVar2, 5);
                            } else if (z) {
                                ceaVar2.m(c3);
                                return gedVar;
                            }
                        } else {
                            c2 = b2.c(ceaVar2, 1);
                        }
                        if (c2) {
                            break;
                        }
                    }
                    this = keaVar;
                    ceaVar = ceaVar2;
                } else if (z) {
                    Object O2 = keaVar.O();
                    eb3 eb3Var = O2 instanceof eb3 ? (eb3) O2 : null;
                    ceaVar2.m(eb3Var != null ? eb3Var.a : null);
                }
            }
        }
        return gedVar;
    }

    public boolean U() {
        return this instanceof my1;
    }

    public final boolean V(Object obj) {
        Object h0;
        do {
            h0 = h0(O(), obj);
            if (h0 == lea.a) {
                return false;
            }
            if (h0 == lea.b) {
                return true;
            }
        } while (h0 == lea.c);
        u(h0);
        return true;
    }

    public final Object W(Object obj) {
        Object h0;
        do {
            h0 = h0(O(), obj);
            if (h0 == lea.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                eb3 eb3Var = obj instanceof eb3 ? (eb3) obj : null;
                throw new IllegalStateException(str, eb3Var != null ? eb3Var.a : null);
            }
        } while (h0 == lea.c);
        return h0;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.yda
    public final Object Z(rq3 rq3Var) {
        Object O;
        do {
            O = O();
            if (!(O instanceof k0a)) {
                bea.u(rq3Var.getContext());
                return Unit.a;
            }
        } while (f0(O) < 0);
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        lj2Var.w(new dj2(bea.A(this, true, new b3g(lj2Var)), 2));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        if (q != lu3Var) {
            q = Unit.a;
        }
        return q == lu3Var ? q : Unit.a;
    }

    public final void a0(ydd yddVar, Throwable th) {
        yddVar.c(new acb(4), 4);
        Object g = yddVar.g();
        g.getClass();
        fb3 fb3Var = null;
        for (iib iibVar = (iib) g; !iibVar.equals(yddVar); iibVar = iibVar.h()) {
            if ((iibVar instanceof cea) && ((cea) iibVar).l()) {
                try {
                    ((cea) iibVar).m(th);
                } catch (Throwable th2) {
                    if (fb3Var != null) {
                        de6.a(fb3Var, th2);
                    } else {
                        fb3Var = new fb3(0, "Exception in completion handler " + iibVar + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (fb3Var != null) {
            Q(fb3Var);
        }
        z(th);
    }

    public final void d0(xl5 xl5Var) {
        ydd yddVar = new ydd();
        Object wy9Var = xl5Var.a ? yddVar : new wy9(yddVar);
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = b;
            kea keaVar = this;
            xl5 xl5Var2 = xl5Var;
            if (unsafe.compareAndSwapObject(keaVar, j, xl5Var2, wy9Var) || unsafe.getObjectVolatile(keaVar, j) != xl5Var2) {
                return;
            }
            this = keaVar;
            xl5Var = xl5Var2;
        }
    }

    @Override // defpackage.yda
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new zda(A(), null, this);
        }
        y(cancellationException);
    }

    public final void e0(cea ceaVar) {
        cea ceaVar2;
        kea keaVar;
        ydd yddVar = new ydd();
        Unsafe unsafe = rh0.a;
        unsafe.putObjectVolatile(yddVar, iib.b, ceaVar);
        long j = iib.a;
        unsafe.putObjectVolatile(yddVar, j, ceaVar);
        loop0: while (true) {
            if (ceaVar.g() != ceaVar) {
                ceaVar2 = ceaVar;
                break;
            }
            while (true) {
                Unsafe unsafe2 = rh0.a;
                ceaVar2 = ceaVar;
                if (unsafe2.compareAndSwapObject(ceaVar2, iib.a, ceaVar, yddVar)) {
                    yddVar.f(ceaVar2);
                    break loop0;
                }
                keaVar = this;
                ceaVar = ceaVar2;
                if (unsafe2.getObjectVolatile(ceaVar2, j) != ceaVar2) {
                    break;
                } else {
                    this = keaVar;
                }
            }
            this = keaVar;
        }
        iib h = ceaVar2.h();
        while (true) {
            Unsafe unsafe3 = rh0.a;
            long j2 = b;
            kea keaVar2 = this;
            if (unsafe3.compareAndSwapObject(keaVar2, j2, ceaVar2, h) || unsafe3.getObjectVolatile(keaVar2, j2) != ceaVar2) {
                return;
            } else {
                this = keaVar2;
            }
        }
    }

    public final int f0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof xl5;
        long j = b;
        if (!z) {
            kea keaVar = this;
            Object obj2 = obj;
            if (!(obj2 instanceof wy9)) {
                return 0;
            }
            ydd yddVar = ((wy9) obj2).a;
            do {
                kea keaVar2 = keaVar;
                unsafe = rh0.a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe.compareAndSwapObject(keaVar2, b, obj3, yddVar);
                keaVar = keaVar2;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    keaVar.c0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(keaVar, j) == obj2);
            return -1;
        }
        if (((xl5) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = rh0.a;
            kea keaVar3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(keaVar3, b, obj4, lea.g)) {
                keaVar3.c0();
                return 1;
            }
            if (unsafe2.getObjectVolatile(keaVar3, j) != obj4) {
                return -1;
            }
            this = keaVar3;
            obj = obj4;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return uic.g;
    }

    public Object h() {
        return G();
    }

    public final Object h0(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof k0a)) {
            return lea.a;
        }
        if ((!(obj instanceof xl5) && !(obj instanceof cea)) || (obj instanceof kt2) || (obj2 instanceof eb3)) {
            kea keaVar = this;
            k0a k0aVar = (k0a) obj;
            ydd N = keaVar.N(k0aVar);
            if (N == null) {
                return lea.c;
            }
            gea geaVar = k0aVar instanceof gea ? (gea) k0aVar : null;
            if (geaVar == null) {
                geaVar = new gea(N, null);
            }
            gea geaVar2 = geaVar;
            synchronized (geaVar2) {
                if (geaVar2.e()) {
                    return lea.a;
                }
                rh0.a.putIntVolatile(geaVar2, gea.c, 1);
                if (geaVar2 != k0aVar) {
                    do {
                        unsafe = rh0.a;
                        j = b;
                        kea keaVar2 = keaVar;
                        keaVar = keaVar2;
                        if (unsafe.compareAndSwapObject(keaVar2, j, k0aVar, geaVar2)) {
                        }
                    } while (unsafe.getObjectVolatile(keaVar, j) == k0aVar);
                    return lea.c;
                }
                boolean d = geaVar2.d();
                eb3 eb3Var = obj2 instanceof eb3 ? (eb3) obj2 : null;
                if (eb3Var != null) {
                    geaVar2.a(eb3Var.a);
                }
                Throwable c2 = d ? null : geaVar2.c();
                Unit unit = Unit.a;
                if (c2 != null) {
                    keaVar.a0(N, c2);
                }
                kt2 Y = Y(N);
                if (Y != null && keaVar.i0(geaVar2, Y, obj2)) {
                    return lea.b;
                }
                N.c(new acb(2), 2);
                kt2 Y2 = Y(N);
                return (Y2 == null || !keaVar.i0(geaVar2, Y2, obj2)) ? keaVar.F(geaVar2, obj2) : lea.b;
            }
        }
        k0a k0aVar2 = (k0a) obj;
        Object o0aVar = obj2 instanceof k0a ? new o0a((k0a) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = rh0.a;
            long j2 = b;
            kea keaVar3 = this;
            if (unsafe2.compareAndSwapObject(keaVar3, j2, k0aVar2, o0aVar)) {
                keaVar3.b0(obj2);
                keaVar3.D(k0aVar2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(keaVar3, j2) != k0aVar2) {
                return lea.c;
            }
            this = keaVar3;
        }
    }

    public final boolean i0(gea geaVar, kt2 kt2Var, Object obj) {
        while (bea.A(kt2Var.e, false, new fea(this, geaVar, kt2Var, obj)) == ged.a) {
            kt2Var = Y(kt2Var);
            if (kt2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.yda
    public boolean isActive() {
        Object O = O();
        return (O instanceof k0a) && ((k0a) O).isActive();
    }

    @Override // defpackage.yda
    public final boolean isCancelled() {
        Object O = O();
        if (O instanceof eb3) {
            return true;
        }
        return (O instanceof gea) && ((gea) O).d();
    }

    @Override // defpackage.yda
    public final CancellationException k() {
        CancellationException cancellationException;
        Object O = O();
        if (O instanceof gea) {
            Throwable c2 = ((gea) O).c();
            if (c2 == null) {
                cp4.g(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
            return cancellationException == null ? new zda(concat, c2, this) : cancellationException;
        }
        if (O instanceof k0a) {
            cp4.g(this, "Job is still new or active: ");
            return null;
        }
        if (!(O instanceof eb3)) {
            return new zda(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((eb3) O).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new zda(A(), th, this) : cancellationException;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.c(this, fVar);
    }

    @Override // defpackage.yda
    public final q55 n(Function1 function1) {
        return S(true, new fba(function1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }

    @Override // defpackage.yda
    public final boolean start() {
        int f0;
        do {
            f0 = f0(O());
            if (f0 == 0) {
                return false;
            }
        } while (f0 != 1);
        return true;
    }

    @Override // defpackage.yda
    public final boolean t() {
        return !(O() instanceof k0a);
    }

    public final String toString() {
        return (X() + '{' + g0(O()) + '}') + '@' + ml4.X(this);
    }

    public void v(Object obj) {
        u(obj);
    }

    public final Object w(rq3 rq3Var) {
        Object O;
        do {
            O = O();
            if (!(O instanceof k0a)) {
                if (O instanceof eb3) {
                    throw ((eb3) O).a;
                }
                return lea.a(O);
            }
        } while (f0(O) < 0);
        eea eeaVar = new eea(z9a.b(rq3Var), this);
        eeaVar.t();
        eeaVar.w(new dj2(bea.A(this, true, new a3g(eeaVar)), 2));
        Object q = eeaVar.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == defpackage.lea.b) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(Object obj) {
        kea keaVar;
        ih2 ih2Var;
        Object obj2;
        Object obj3 = lea.a;
        if (L()) {
            do {
                Object O = O();
                if (!(O instanceof k0a) || ((O instanceof gea) && ((gea) O).e())) {
                    obj3 = lea.a;
                    break;
                }
                obj3 = h0(O, new eb3(E(obj), false));
            } while (obj3 == lea.c);
        }
        if (obj3 == lea.a) {
            Throwable th = null;
            loop1: while (true) {
                Object O2 = this.O();
                if (!(O2 instanceof gea)) {
                    if (!(O2 instanceof k0a)) {
                        keaVar = this;
                        obj2 = lea.d;
                        break;
                    }
                    if (th == null) {
                        th = this.E(obj);
                    }
                    k0a k0aVar = (k0a) O2;
                    if (k0aVar.isActive()) {
                        ydd N = this.N(k0aVar);
                        if (N == null) {
                            keaVar = this;
                        } else {
                            gea geaVar = new gea(N, th);
                            while (true) {
                                Unsafe unsafe = rh0.a;
                                long j = b;
                                keaVar = this;
                                if (unsafe.compareAndSwapObject(keaVar, j, k0aVar, geaVar)) {
                                    keaVar.a0(N, th);
                                    obj2 = lea.a;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(keaVar, j) != k0aVar) {
                                    break;
                                }
                                this = keaVar;
                            }
                        }
                        this = keaVar;
                    } else {
                        keaVar = this;
                        obj2 = keaVar.h0(O2, new eb3(th, false));
                        if (obj2 == lea.a) {
                            cp4.g(O2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != lea.c) {
                            break;
                        }
                        this = keaVar;
                    }
                } else {
                    synchronized (O2) {
                        if (rh0.a.getObjectVolatile((gea) O2, gea.b) == lea.e) {
                            ih2Var = lea.d;
                        } else {
                            boolean d = ((gea) O2).d();
                            if (th == null) {
                                th = this.E(obj);
                            }
                            ((gea) O2).a(th);
                            Throwable c2 = d ? null : ((gea) O2).c();
                            if (c2 != null) {
                                this.a0(((gea) O2).a, c2);
                            }
                            ih2Var = lea.a;
                        }
                    }
                    keaVar = this;
                    obj3 = ih2Var;
                }
            }
            obj3 = obj2;
        } else {
            keaVar = this;
        }
        if (obj3 != lea.a && obj3 != lea.b) {
            if (obj3 == lea.d) {
                return false;
            }
            keaVar.u(obj3);
            return true;
        }
        return true;
    }

    public void y(CancellationException cancellationException) {
        x(cancellationException);
    }

    public final boolean z(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        jt2 jt2Var = (jt2) rh0.a.getObjectVolatile(this, a);
        return (jt2Var == null || jt2Var == ged.a) ? z : jt2Var.a(th) || z;
    }

    public void c0() {
    }

    public void Q(fb3 fb3Var) {
        throw fb3Var;
    }

    public void b0(Object obj) {
    }

    public void u(Object obj) {
    }
}
