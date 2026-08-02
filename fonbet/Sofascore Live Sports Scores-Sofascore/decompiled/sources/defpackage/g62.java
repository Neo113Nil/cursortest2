package defpackage;

import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class g62 implements ln2 {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(g62.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final Function1 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final kr1 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = rh0.a;
        r = unsafe.objectFieldOffset(g62.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(g62.class, "receivers$volatile");
        p = unsafe.objectFieldOffset(g62.class.getDeclaredField("receivers$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(g62.class, "bufferEnd$volatile");
        k = unsafe.objectFieldOffset(g62.class.getDeclaredField("bufferEnd$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(g62.class, "completedExpandBuffersAndPauseFlag$volatile");
        n = unsafe.objectFieldOffset(g62.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(g62.class, Object.class, "sendSegment$volatile");
        q = unsafe.objectFieldOffset(g62.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(g62.class, Object.class, "receiveSegment$volatile");
        o = unsafe.objectFieldOffset(g62.class.getDeclaredField("receiveSegment$volatile"));
        l = unsafe.objectFieldOffset(g62.class.getDeclaredField("bufferEndSegment$volatile"));
        j = unsafe.objectFieldOffset(g62.class.getDeclaredField("_closeCause$volatile"));
        m = unsafe.objectFieldOffset(g62.class.getDeclaredField("closeHandler$volatile"));
    }

    public g62(int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
        if (i2 < 0) {
            ogj.h(lnb.k(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        ho2 ho2Var = i62.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = n();
        ho2 ho2Var2 = new ho2(0L, null, this, 3);
        this.sendSegment$volatile = ho2Var2;
        this.receiveSegment$volatile = ho2Var2;
        if (D()) {
            ho2Var2 = i62.a;
            ho2Var2.getClass();
        }
        this.bufferEndSegment$volatile = ho2Var2;
        this.c = function1 != null ? new kr1(this, 17) : null;
        this._closeCause$volatile = i62.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object H(g62 g62Var, sq3 sq3Var) {
        e62 e62Var;
        int i2;
        ho2 ho2Var;
        if (sq3Var instanceof e62) {
            e62Var = (e62) sq3Var;
            int i3 = e62Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e62Var.t = i3 - Integer.MIN_VALUE;
                e62 e62Var2 = e62Var;
                Object obj = e62Var2.r;
                lu3 lu3Var = lu3.a;
                i2 = e62Var2.t;
                if (i2 == 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return ((go2) obj).a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ho2 ho2Var2 = (ho2) rh0.a.getObjectVolatile(g62Var, o);
                while (!g62Var.A()) {
                    long andIncrement = e.getAndIncrement(g62Var);
                    long j2 = i62.b;
                    long j3 = andIncrement / j2;
                    int i4 = (int) (andIncrement % j2);
                    if (ho2Var2.d != j3) {
                        ho2 k2 = g62Var.k(j3, ho2Var2);
                        if (k2 == null) {
                            continue;
                        } else {
                            ho2Var = k2;
                        }
                    } else {
                        ho2Var = ho2Var2;
                    }
                    g62 g62Var2 = g62Var;
                    Object M = g62Var2.M(ho2Var, i4, andIncrement, null);
                    if (M == i62.m) {
                        a70.r("unexpected");
                        return null;
                    }
                    if (M != i62.o) {
                        if (M != i62.n) {
                            ho2Var.b();
                            return M;
                        }
                        e62Var2.t = 1;
                        Object I = g62Var2.I(ho2Var, i4, andIncrement, e62Var2);
                        return I == lu3Var ? lu3Var : I;
                    }
                    if (andIncrement < g62Var2.v()) {
                        ho2Var.b();
                    }
                    g62Var = g62Var2;
                    ho2Var2 = ho2Var;
                }
                return new eo2(g62Var.p());
            }
        }
        e62Var = new e62(g62Var, sq3Var);
        e62 e62Var22 = e62Var;
        Object obj2 = e62Var22.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e62Var22.t;
        if (i2 == 0) {
        }
    }

    public final boolean A() {
        return z(rh0.a.getLongVolatile(this, r), true);
    }

    public final boolean B() {
        return z(rh0.a.getLongVolatile(this, r), false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long n2 = n();
        return n2 == 0 || n2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.f() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j2, ho2 ho2Var) {
        g62 g62Var;
        ho2 ho2Var2;
        ho2 ho2Var3;
        while (ho2Var.d < j2 && (ho2Var3 = (ho2) ho2Var.c()) != null) {
            ho2Var = ho2Var3;
        }
        while (true) {
            ho2 ho2Var4 = ho2Var;
            while (ho2Var4.d() && (ho2Var2 = (ho2) ho2Var4.c()) != null) {
                ho2Var4 = ho2Var2;
            }
            while (true) {
                Unsafe unsafe = rh0.a;
                long j3 = l;
                z0h z0hVar = (z0h) unsafe.getObjectVolatile(this, j3);
                if (z0hVar.d >= ho2Var4.d) {
                    return;
                }
                if (!ho2Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    g62Var = this;
                    if (unsafe2.compareAndSwapObject(g62Var, l, z0hVar, ho2Var4)) {
                        if (z0hVar.f()) {
                            z0hVar.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(g62Var, j3) != z0hVar) {
                        break;
                    } else {
                        this = g62Var;
                    }
                }
                this = g62Var;
            }
            ho2Var = ho2Var4;
        }
    }

    public final Object F(rq3 rq3Var, Object obj) {
        fb3 w;
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        Function1 function1 = this.b;
        if (function1 == null || (w = y6a.w(function1, obj, null)) == null) {
            Throwable u = u();
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(u));
        } else {
            de6.a(w, u());
            p2g p2gVar2 = w2g.b;
            lj2Var.resumeWith(new u2g(w));
        }
        Object q2 = lj2Var.q();
        return q2 == lu3.a ? q2 : Unit.a;
    }

    public final void G(lj2 lj2Var, Object obj) {
        Function1 function1 = this.b;
        if (function1 != null) {
            y6a.v(function1, obj, lj2Var.e);
        }
        Throwable u = u();
        p2g p2gVar = w2g.b;
        lj2Var.resumeWith(new u2g(u));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(ho2 ho2Var, int i2, long j2, sq3 sq3Var) {
        f62 f62Var;
        int i3;
        go2 go2Var;
        py pyVar;
        if (sq3Var instanceof f62) {
            f62Var = (f62) sq3Var;
            int i4 = f62Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f62Var.t = i4 - Integer.MIN_VALUE;
                Object obj = f62Var.r;
                lu3 lu3Var = lu3.a;
                i3 = f62Var.t;
                py pyVar2 = null;
                if (i3 != 0) {
                    y6a.M(obj);
                    f62Var.t = 1;
                    lj2 o0 = k53.o0(z9a.b(f62Var));
                    try {
                        tpf tpfVar = new tpf(o0);
                        Object M = M(ho2Var, i2, j2, tpfVar);
                        if (M == i62.m) {
                            tpfVar.b(ho2Var, i2);
                        } else {
                            Object obj2 = i62.o;
                            Function1 function1 = this.b;
                            if (M == obj2) {
                                if (j2 < v()) {
                                    ho2Var.b();
                                }
                                ho2 ho2Var2 = (ho2) rh0.a.getObjectVolatile(this, o);
                                while (true) {
                                    if (A()) {
                                        p2g p2gVar = w2g.b;
                                        o0.resumeWith(new go2(new eo2(p())));
                                        break;
                                    }
                                    long andIncrement = e.getAndIncrement(this);
                                    long j3 = i62.b;
                                    long j4 = andIncrement / j3;
                                    int i5 = (int) (andIncrement % j3);
                                    if (ho2Var2.d != j4) {
                                        ho2 k2 = k(j4, ho2Var2);
                                        if (k2 != null) {
                                            ho2Var2 = k2;
                                        }
                                    }
                                    Object M2 = M(ho2Var2, i5, andIncrement, tpfVar);
                                    if (M2 == i62.m) {
                                        tpfVar.b(ho2Var2, i5);
                                        break;
                                    }
                                    if (M2 == i62.o) {
                                        if (andIncrement < v()) {
                                            ho2Var2.b();
                                        }
                                    } else {
                                        if (M2 == i62.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ho2Var2.b();
                                        go2Var = new go2(M2);
                                        if (function1 != null) {
                                            pyVar = new py(3, this, g62.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
                                        }
                                    }
                                }
                            } else {
                                ho2Var.b();
                                go2Var = new go2(M);
                                if (function1 != null) {
                                    pyVar = new py(3, this, g62.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
                                    pyVar2 = pyVar;
                                }
                                o0.i(go2Var, pyVar2);
                            }
                        }
                        obj = o0.q();
                        lu3 lu3Var2 = lu3.a;
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } catch (Throwable th) {
                        o0.B();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((go2) obj).a;
            }
        }
        f62Var = new f62(this, sq3Var);
        Object obj3 = f62Var.r;
        lu3 lu3Var3 = lu3.a;
        i3 = f62Var.t;
        py pyVar22 = null;
        if (i3 != 0) {
        }
        return ((go2) obj3).a;
    }

    public final void J(kzk kzkVar, boolean z) {
        if (kzkVar instanceof kj2) {
            rq3 rq3Var = (rq3) kzkVar;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(new u2g(z ? s() : u()));
            return;
        }
        if (kzkVar instanceof tpf) {
            lj2 lj2Var = ((tpf) kzkVar).a;
            p2g p2gVar2 = w2g.b;
            lj2Var.resumeWith(new go2(new eo2(p())));
            return;
        }
        if (!(kzkVar instanceof b62)) {
            if (kzkVar instanceof h2h) {
                ((h2h) kzkVar).i(this, i62.l);
                return;
            } else {
                cp4.g(kzkVar, "Unexpected waiter: ");
                return;
            }
        }
        b62 b62Var = (b62) kzkVar;
        lj2 lj2Var2 = b62Var.b;
        lj2Var2.getClass();
        b62Var.b = null;
        b62Var.a = i62.l;
        Throwable p2 = b62Var.c.p();
        if (p2 == null) {
            p2g p2gVar3 = w2g.b;
            lj2Var2.resumeWith(Boolean.FALSE);
        } else {
            p2g p2gVar4 = w2g.b;
            lj2Var2.resumeWith(new u2g(p2));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        ct8 pyVar;
        if (obj instanceof h2h) {
            return ((h2h) obj).i(this, obj2) == 0;
        }
        boolean z = obj instanceof tpf;
        Function1 function1 = this.b;
        if (z) {
            lj2 lj2Var = ((tpf) obj).a;
            go2 go2Var = new go2(obj2);
            pyVar = function1 != null ? new py(3, this, g62.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2) : null;
            ho2 ho2Var = i62.a;
            ih2 c = lj2Var.c(go2Var, pyVar);
            if (c == null) {
                return false;
            }
            lj2Var.s(c);
            return true;
        }
        if (!(obj instanceof b62)) {
            if (!(obj instanceof kj2)) {
                cp4.g(obj, "Unexpected receiver type: ");
                return false;
            }
            kj2 kj2Var = (kj2) obj;
            pyVar = function1 != null ? new py(3, this, g62.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1) : null;
            ho2 ho2Var2 = i62.a;
            ih2 c2 = kj2Var.c(obj2, pyVar);
            if (c2 == null) {
                return false;
            }
            kj2Var.s(c2);
            return true;
        }
        b62 b62Var = (b62) obj;
        lj2 lj2Var2 = b62Var.b;
        lj2Var2.getClass();
        b62Var.b = null;
        b62Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = b62Var.c.b;
        pyVar = function12 != null ? new hl6(19, obj2, function12) : null;
        ho2 ho2Var3 = i62.a;
        ih2 c3 = lj2Var2.c(bool, pyVar);
        if (c3 == null) {
            return false;
        }
        lj2Var2.s(c3);
        return true;
    }

    public final boolean L(Object obj, ho2 ho2Var, int i2) {
        x1k x1kVar;
        if (obj instanceof kj2) {
            kj2 kj2Var = (kj2) obj;
            Unit unit = Unit.a;
            ho2 ho2Var2 = i62.a;
            ih2 c = kj2Var.c(unit, null);
            if (c == null) {
                return false;
            }
            kj2Var.s(c);
            return true;
        }
        if (!(obj instanceof h2h)) {
            cp4.g(obj, "Unexpected waiter: ");
            return false;
        }
        int i3 = ((h2h) obj).i(this, Unit.a);
        if (i3 == 0) {
            x1kVar = x1k.a;
        } else if (i3 == 1) {
            x1kVar = x1k.b;
        } else if (i3 == 2) {
            x1kVar = x1k.c;
        } else {
            if (i3 != 3) {
                pvd.l(i3, "Unexpected internal result: ");
                return false;
            }
            x1kVar = x1k.d;
        }
        if (x1kVar == x1k.b) {
            ho2Var.n(i2, null);
        }
        return x1kVar == x1k.a;
    }

    public final Object M(ho2 ho2Var, int i2, long j2, Object obj) {
        Object l2 = ho2Var.l(i2);
        AtomicReferenceArray atomicReferenceArray = ho2Var.h;
        long j3 = r;
        if (l2 == null) {
            if (j2 >= (rh0.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return i62.n;
                }
                if (ho2Var.k(i2, l2, obj)) {
                    j();
                    return i62.m;
                }
            }
        } else if (l2 == i62.d && ho2Var.k(i2, l2, i62.i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            ho2Var.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l3 = ho2Var.l(i2);
            if (l3 == null || l3 == i62.e) {
                if (j2 < (rh0.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (ho2Var.k(i2, l3, i62.h)) {
                        j();
                        return i62.o;
                    }
                } else {
                    if (obj == null) {
                        return i62.n;
                    }
                    if (ho2Var.k(i2, l3, obj)) {
                        j();
                        return i62.m;
                    }
                }
            } else if (l3 != i62.d) {
                ih2 ih2Var = i62.j;
                if (l3 == ih2Var) {
                    return i62.o;
                }
                if (l3 == i62.h) {
                    return i62.o;
                }
                if (l3 == i62.l) {
                    j();
                    return i62.o;
                }
                if (l3 != i62.g && ho2Var.k(i2, l3, i62.f)) {
                    boolean z = l3 instanceof lzk;
                    if (z) {
                        l3 = ((lzk) l3).a;
                    }
                    if (L(l3, ho2Var, i2)) {
                        ho2Var.o(i2, i62.i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        ho2Var.n(i2, null);
                        return obj3;
                    }
                    ho2Var.o(i2, ih2Var);
                    ho2Var.i();
                    if (z) {
                        j();
                    }
                    return i62.o;
                }
            } else if (ho2Var.k(i2, l3, i62.i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                ho2Var.n(i2, null);
                return obj4;
            }
        }
    }

    public final int N(ho2 ho2Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        ho2Var.n(i2, obj);
        if (z) {
            return O(ho2Var, i2, obj, j2, obj2, z);
        }
        Object l2 = ho2Var.l(i2);
        if (l2 == null) {
            if (a(j2)) {
                if (ho2Var.k(i2, null, i62.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ho2Var.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l2 instanceof kzk) {
            ho2Var.n(i2, null);
            if (K(l2, obj)) {
                ho2Var.o(i2, i62.i);
                return 0;
            }
            ih2 ih2Var = i62.k;
            if (ho2Var.h.getAndSet((i2 * 2) + 1, ih2Var) == ih2Var) {
                return 5;
            }
            ho2Var.m(i2, true);
            return 5;
        }
        return O(ho2Var, i2, obj, j2, obj2, z);
    }

    public final int O(ho2 ho2Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object l2 = ho2Var.l(i2);
            if (l2 == null) {
                if (!a(j2) || z) {
                    if (z) {
                        if (ho2Var.k(i2, null, i62.j)) {
                            ho2Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ho2Var.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ho2Var.k(i2, null, i62.d)) {
                    break;
                }
            } else {
                if (l2 != i62.e) {
                    ih2 ih2Var = i62.k;
                    if (l2 == ih2Var) {
                        ho2Var.n(i2, null);
                        return 5;
                    }
                    if (l2 == i62.h) {
                        ho2Var.n(i2, null);
                        return 5;
                    }
                    if (l2 == i62.l) {
                        ho2Var.n(i2, null);
                        B();
                        return 4;
                    }
                    ho2Var.n(i2, null);
                    if (l2 instanceof lzk) {
                        l2 = ((lzk) l2).a;
                    }
                    if (K(l2, obj)) {
                        ho2Var.o(i2, i62.i);
                        return 0;
                    }
                    if (ho2Var.h.getAndSet((i2 * 2) + 1, ih2Var) != ih2Var) {
                        ho2Var.m(i2, true);
                    }
                    return 5;
                }
                if (ho2Var.k(i2, l2, i62.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j2) {
        g62 g62Var = this;
        if (g62Var.D()) {
            return;
        }
        while (g62Var.n() <= j2) {
            g62Var = this;
        }
        int i2 = i62.c;
        int i3 = 0;
        while (true) {
            long j3 = n;
            if (i3 < i2) {
                long n2 = g62Var.n();
                if (n2 == (rh0.a.getLongVolatile(g62Var, j3) & 4611686018427387903L) && n2 == g62Var.n()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = rh0.a;
                    long longVolatile = unsafe.getLongVolatile(g62Var, j3);
                    if (unsafe.compareAndSwapLong(g62Var, n, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        g62Var = this;
                    }
                }
                while (true) {
                    long n3 = g62Var.n();
                    Unsafe unsafe2 = rh0.a;
                    long longVolatile2 = unsafe2.getLongVolatile(g62Var, j3);
                    long j4 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (n3 == j4 && n3 == g62Var.n()) {
                        break;
                    }
                    if (z) {
                        g62Var = this;
                    } else {
                        g62Var = this;
                        unsafe2.compareAndSwapLong(g62Var, n, longVolatile2, j4 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = rh0.a;
                    long longVolatile3 = unsafe3.getLongVolatile(g62Var, j3);
                    if (unsafe3.compareAndSwapLong(g62Var, n, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        g62Var = this;
                    }
                }
            }
        }
    }

    public final boolean a(long j2) {
        return j2 < n() || j2 < t() + ((long) this.a);
    }

    @Override // defpackage.l4h
    public final void b(Function1 function1) {
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = rh0.a;
            g62 g62Var = this;
            if (unsafe2.compareAndSwapObject(g62Var, m, (Object) null, function1)) {
                return;
            }
            long j2 = m;
            if (unsafe2.getObjectVolatile(g62Var, j2) != null) {
                while (true) {
                    Object objectVolatile = rh0.a.getObjectVolatile(g62Var, j2);
                    ih2 ih2Var = i62.q;
                    if (objectVolatile != ih2Var) {
                        if (objectVolatile == i62.r) {
                            a70.r("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            cp4.g(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    ih2 ih2Var2 = i62.r;
                    do {
                        g62 g62Var2 = g62Var;
                        unsafe = rh0.a;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(g62Var2, m, ih2Var, ih2Var2);
                        g62Var = g62Var2;
                        if (compareAndSwapObject) {
                            function1.invoke(g62Var.p());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(g62Var, j2) == ih2Var);
                }
            } else {
                this = g62Var;
            }
        }
    }

    public final boolean c(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        g62 g62Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = rh0.a;
                long j5 = r;
                long longVolatile3 = unsafe4.getLongVolatile(g62Var, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                ho2 ho2Var = i62.a;
                if (unsafe4.compareAndSwapLong(g62Var, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                g62Var = this;
            }
        }
        ih2 ih2Var = i62.s;
        while (true) {
            Unsafe unsafe5 = rh0.a;
            long j6 = j;
            if (unsafe5.compareAndSwapObject(this, j6, ih2Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != ih2Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = rh0.a;
                j4 = r;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = rh0.a;
                j2 = r;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        B();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = rh0.a;
                long j7 = m;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                ih2 ih2Var2 = objectVolatile == null ? i62.q : i62.r;
                do {
                    unsafe2 = rh0.a;
                    if (unsafe2.compareAndSwapObject(this, m, objectVolatile, ih2Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                i5k.e(1, objectVolatile);
                ((Function1) objectVolatile).invoke(p());
                return z2;
            }
        }
        return z2;
    }

    @Override // defpackage.l4h
    public Object d(Object obj) {
        g62 g62Var = this;
        Unsafe unsafe = rh0.a;
        long j2 = 1152921504606846975L;
        boolean z = g62Var.z(unsafe.getLongVolatile(g62Var, r), false) ? false : !g62Var.a(r2 & 1152921504606846975L);
        fo2 fo2Var = go2.b;
        if (z) {
            return fo2Var;
        }
        Object obj2 = i62.j;
        ho2 ho2Var = (ho2) unsafe.getObjectVolatile(g62Var, q);
        while (true) {
            long andIncrement = d.getAndIncrement(g62Var);
            long j3 = andIncrement & j2;
            boolean z2 = g62Var.z(andIncrement, false);
            int i2 = i62.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (ho2Var.d != j5) {
                ho2 m2 = g62Var.m(j5, ho2Var);
                if (m2 != null) {
                    ho2Var = m2;
                } else {
                    if (z2) {
                        return new eo2(g62Var.u());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int N = g62Var.N(ho2Var, i3, obj, j3, obj2, z2);
            if (N == 0) {
                ho2Var.b();
                return Unit.a;
            }
            if (N == 1) {
                return Unit.a;
            }
            if (N == 2) {
                if (z2) {
                    ho2Var.i();
                    return new eo2(u());
                }
                kzk kzkVar = obj2 instanceof kzk ? (kzk) obj2 : null;
                if (kzkVar != null) {
                    kzkVar.b(ho2Var, i3 + i2);
                }
                ho2Var.i();
                return fo2Var;
            }
            if (N == 3) {
                a70.r("unexpected");
                return null;
            }
            if (N == 4) {
                if (j3 < t()) {
                    ho2Var.b();
                }
                return new eo2(u());
            }
            if (N == 5) {
                ho2Var.b();
            }
            j2 = 1152921504606846975L;
            g62Var = this;
        }
    }

    @Override // defpackage.ln2
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.ln2
    public final Object f(rq3 rq3Var) {
        ho2 ho2Var;
        Throwable th;
        lj2 lj2Var;
        lj2 lj2Var2;
        py pyVar;
        ho2 ho2Var2;
        Unsafe unsafe = rh0.a;
        ?? r1 = o;
        ho2 ho2Var3 = (ho2) unsafe.getObjectVolatile(this, (long) r1);
        while (!this.A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = i62.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (ho2Var3.d != j3) {
                ho2 k2 = this.k(j3, ho2Var3);
                if (k2 == null) {
                    continue;
                } else {
                    ho2Var = k2;
                }
            } else {
                ho2Var = ho2Var3;
            }
            g62 g62Var = this;
            Object M = g62Var.M(ho2Var, i2, andIncrement, null);
            ih2 ih2Var = i62.m;
            py pyVar2 = null;
            if (M == ih2Var) {
                a70.r("unexpected");
                return null;
            }
            ih2 ih2Var2 = i62.o;
            if (M == ih2Var2) {
                if (andIncrement < g62Var.v()) {
                    ho2Var.b();
                }
                this = g62Var;
                ho2Var3 = ho2Var;
            } else {
                if (M != i62.n) {
                    ho2Var.b();
                    return M;
                }
                lj2 o0 = k53.o0(z9a.b(rq3Var));
                try {
                    Object M2 = g62Var.M(ho2Var, i2, andIncrement, o0);
                    try {
                        if (M2 == ih2Var) {
                            o0.b(ho2Var, i2);
                        } else {
                            Function1 function1 = g62Var.b;
                            try {
                                if (M2 == ih2Var2) {
                                    if (andIncrement < g62Var.v()) {
                                        ho2Var.b();
                                    }
                                    ho2 ho2Var4 = (ho2) rh0.a.getObjectVolatile(g62Var, (long) r1);
                                    while (!g62Var.A()) {
                                        lj2 lj2Var3 = o0;
                                        try {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(g62Var);
                                            long j4 = i62.b;
                                            long j5 = andIncrement2 / j4;
                                            int i3 = (int) (andIncrement2 % j4);
                                            if (ho2Var4.d != j5) {
                                                try {
                                                    ho2 k3 = g62Var.k(j5, ho2Var4);
                                                    if (k3 == null) {
                                                        o0 = lj2Var3;
                                                    } else {
                                                        ho2Var2 = k3;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    lj2Var = lj2Var3;
                                                    lj2Var.B();
                                                    throw th;
                                                }
                                            } else {
                                                ho2Var2 = ho2Var4;
                                            }
                                            g62 g62Var2 = g62Var;
                                            M2 = g62Var2.M(ho2Var2, i3, andIncrement2, lj2Var3);
                                            g62Var = g62Var2;
                                            ho2 ho2Var5 = ho2Var2;
                                            lj2Var2 = lj2Var3;
                                            if (M2 == i62.m) {
                                                lj2Var2.b(ho2Var5, i3);
                                                break;
                                            }
                                            if (M2 == i62.o) {
                                                if (andIncrement2 < g62Var.v()) {
                                                    ho2Var5.b();
                                                }
                                                ho2Var4 = ho2Var5;
                                                o0 = lj2Var2;
                                            } else {
                                                if (M2 == i62.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                ho2Var5.b();
                                                if (function1 != null) {
                                                    pyVar = new py(3, g62Var, g62.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
                                                    pyVar2 = pyVar;
                                                }
                                                lj2Var2.i(M2, pyVar2);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r1 = lj2Var3;
                                            th = th;
                                            lj2Var = r1;
                                            lj2Var.B();
                                            throw th;
                                        }
                                    }
                                    p2g p2gVar = w2g.b;
                                    o0.resumeWith(new u2g(g62Var.s()));
                                } else {
                                    lj2Var2 = o0;
                                    ho2Var.b();
                                    if (function1 != null) {
                                        pyVar = new py(3, g62Var, g62.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
                                        pyVar2 = pyVar;
                                    }
                                    lj2Var2.i(M2, pyVar2);
                                }
                                Object q2 = lj2Var2.q();
                                lu3 lu3Var = lu3.a;
                                return q2;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        lj2Var2 = o0;
                        Object q22 = lj2Var2.q();
                        lu3 lu3Var2 = lu3.a;
                        return q22;
                    } catch (Throwable th5) {
                        th = th5;
                        lj2Var = o0;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r1 = o0;
                }
            }
        }
        Throwable s = this.s();
        int i4 = x0i.a;
        throw s;
    }

    @Override // defpackage.ln2
    public final Object g(hoi hoiVar) {
        return H(this, hoiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (defpackage.ho2) ((defpackage.vh3) defpackage.rh0.a.getObjectVolatile(r0, defpackage.vh3.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ho2 h(long j2) {
        vh3 vh3Var;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = rh0.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, l);
        ho2 ho2Var = (ho2) unsafe2.getObjectVolatile(this, q);
        if (ho2Var.d > ((ho2) objectVolatile).d) {
            objectVolatile = ho2Var;
        }
        ho2 ho2Var2 = (ho2) unsafe2.getObjectVolatile(this, o);
        if (ho2Var2.d > ((ho2) objectVolatile).d) {
            objectVolatile = ho2Var2;
        }
        vh3 vh3Var2 = (vh3) objectVolatile;
        loop0: while (true) {
            vh3Var = vh3Var2;
            while (true) {
                int i2 = vh3.c;
                vh3Var.getClass();
                Object objectVolatile2 = rh0.a.getObjectVolatile(vh3Var, vh3.a);
                ih2 ih2Var = uh3.a;
                if (objectVolatile2 == ih2Var) {
                    break loop0;
                }
                vh3Var2 = (vh3) objectVolatile2;
                if (vh3Var2 == null) {
                    do {
                        unsafe = rh0.a;
                        j4 = vh3.a;
                        if (unsafe.compareAndSwapObject(vh3Var, j4, (Object) null, ih2Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(vh3Var, j4) == null);
                }
            }
        }
        ho2 ho2Var3 = (ho2) vh3Var;
        if (C()) {
            ho2 ho2Var4 = ho2Var3;
            loop3: do {
                int i3 = i62.b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j3 = (ho2Var4.d * i62.b) + i3;
                    if (j3 < t()) {
                        break loop3;
                    }
                    while (true) {
                        Object l2 = ho2Var4.l(i3);
                        if (l2 != null && l2 != i62.e) {
                            if (l2 == i62.d) {
                                break loop3;
                            }
                        } else {
                            if (ho2Var4.k(i3, l2, i62.l)) {
                                ho2Var4.i();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (ho2Var4 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        Object obj = null;
        loop6: for (ho2 ho2Var5 = ho2Var3; ho2Var5 != null; ho2Var5 = (ho2) ((vh3) rh0.a.getObjectVolatile(ho2Var5, vh3.b))) {
            for (int i4 = i62.b - 1; -1 < i4; i4--) {
                if ((ho2Var5.d * i62.b) + i4 < j2) {
                    break loop6;
                }
                while (true) {
                    Object l3 = ho2Var5.l(i4);
                    if (l3 != null && l3 != i62.e) {
                        if (!(l3 instanceof lzk)) {
                            if (!(l3 instanceof kzk)) {
                                break;
                            }
                            if (ho2Var5.k(i4, l3, i62.l)) {
                                obj = w3a.M(obj, l3);
                                ho2Var5.m(i4, true);
                                break;
                            }
                        } else {
                            if (ho2Var5.k(i4, l3, i62.l)) {
                                obj = w3a.M(obj, ((lzk) l3).a);
                                ho2Var5.m(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (ho2Var5.k(i4, l3, i62.l)) {
                            ho2Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                J((kzk) obj, true);
                return ho2Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((kzk) arrayList.get(size), true);
            }
        }
        return ho2Var3;
    }

    public final void i(long j2) {
        fb3 w;
        ho2 ho2Var = (ho2) rh0.a.getObjectVolatile(this, o);
        while (true) {
            Unsafe unsafe = rh0.a;
            long j3 = p;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(this.a + longVolatile, this.n())) {
                return;
            }
            g62 g62Var = this;
            if (unsafe.compareAndSwapLong(g62Var, j3, longVolatile, 1 + longVolatile)) {
                long j4 = i62.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (ho2Var.d != j5) {
                    ho2 k2 = g62Var.k(j5, ho2Var);
                    if (k2 != null) {
                        ho2Var = k2;
                    }
                }
                ho2 ho2Var2 = ho2Var;
                Object M = g62Var.M(ho2Var2, i2, longVolatile, null);
                if (M != i62.o) {
                    ho2Var2.b();
                    Function1 function1 = g62Var.b;
                    if (function1 != null && (w = y6a.w(function1, M, null)) != null) {
                        throw w;
                    }
                } else if (longVolatile < g62Var.v()) {
                    ho2Var2.b();
                }
                this = g62Var;
                ho2Var = ho2Var2;
            }
            this = g62Var;
        }
    }

    @Override // defpackage.ln2
    public final b62 iterator() {
        return new b62(this);
    }

    public final void j() {
        Object a;
        Unsafe unsafe;
        if (D()) {
            return;
        }
        Unsafe unsafe2 = rh0.a;
        long j2 = l;
        ho2 ho2Var = (ho2) unsafe2.getObjectVolatile(this, j2);
        loop0: while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j3 = andIncrement / i62.b;
            if (v() <= andIncrement) {
                if (ho2Var.d < j3 && ho2Var.c() != null) {
                    E(j3, ho2Var);
                }
                x(1L);
                return;
            }
            if (ho2Var.d != j3) {
                h62 h62Var = h62.b;
                while (true) {
                    a = uh3.a(ho2Var, j3, h62Var);
                    if (!jca.L(a)) {
                        z0h I = jca.I(a);
                        while (true) {
                            z0h z0hVar = (z0h) rh0.a.getObjectVolatile(this, j2);
                            if (z0hVar.d >= I.d) {
                                break;
                            }
                            if (!I.j()) {
                                break;
                            }
                            do {
                                unsafe = rh0.a;
                                if (unsafe.compareAndSwapObject(this, l, z0hVar, I)) {
                                    if (z0hVar.f()) {
                                        z0hVar.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == z0hVar);
                            if (I.f()) {
                                I.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                ho2 ho2Var2 = null;
                if (jca.L(a)) {
                    B();
                    E(j3, ho2Var);
                    x(1L);
                } else {
                    ho2 ho2Var3 = (ho2) jca.I(a);
                    long j4 = ho2Var3.d;
                    if (j4 > j3) {
                        long j5 = i62.b * j4;
                        if (rh0.a.compareAndSwapLong(this, k, 1 + andIncrement, j5)) {
                            x(j5 - andIncrement);
                        } else {
                            x(1L);
                        }
                    } else {
                        ho2Var2 = ho2Var3;
                    }
                }
                if (ho2Var2 == null) {
                    continue;
                } else {
                    ho2Var = ho2Var2;
                }
            }
            int i2 = (int) (andIncrement % i62.b);
            Object l2 = ho2Var.l(i2);
            boolean z = l2 instanceof kzk;
            long j6 = p;
            if (!z || andIncrement < rh0.a.getLongVolatile(this, j6) || !ho2Var.k(i2, l2, i62.g)) {
                while (true) {
                    Object l3 = ho2Var.l(i2);
                    if (!(l3 instanceof kzk)) {
                        if (l3 != i62.j) {
                            if (l3 != null) {
                                if (l3 == i62.d || l3 == i62.h || l3 == i62.i || l3 == i62.k || l3 == i62.l) {
                                    break loop0;
                                } else if (l3 != i62.f) {
                                    cp4.g(l3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (ho2Var.k(i2, l3, i62.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < rh0.a.getLongVolatile(this, j6)) {
                        if (ho2Var.k(i2, l3, new lzk((kzk) l3))) {
                            break loop0;
                        }
                    } else if (ho2Var.k(i2, l3, i62.g)) {
                        if (L(l3, ho2Var, i2)) {
                            ho2Var.o(i2, i62.d);
                            break;
                        } else {
                            ho2Var.o(i2, i62.j);
                            ho2Var.i();
                        }
                    }
                }
            } else if (L(l2, ho2Var, i2)) {
                ho2Var.o(i2, i62.d);
                break;
            } else {
                ho2Var.o(i2, i62.j);
                ho2Var.i();
                x(1L);
            }
        }
        x(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.f() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ho2 k(long j2, ho2 ho2Var) {
        Object a;
        ho2 ho2Var2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        ho2 ho2Var3 = i62.a;
        h62 h62Var = h62.b;
        loop0: while (true) {
            a = uh3.a(ho2Var, j2, h62Var);
            if (!jca.L(a)) {
                z0h I = jca.I(a);
                while (true) {
                    Unsafe unsafe3 = rh0.a;
                    long j4 = o;
                    z0h z0hVar = (z0h) unsafe3.getObjectVolatile(this, j4);
                    if (z0hVar.d >= I.d) {
                        break loop0;
                    }
                    if (!I.j()) {
                        break;
                    }
                    do {
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(this, o, z0hVar, I)) {
                            if (z0hVar.f()) {
                                z0hVar.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == z0hVar);
                    if (I.f()) {
                        I.e();
                    }
                }
            } else {
                break;
            }
        }
        if (jca.L(a)) {
            B();
            if (ho2Var.d * i62.b < v()) {
                ho2Var.b();
                return null;
            }
        } else {
            ho2 ho2Var4 = (ho2) jca.I(a);
            long j5 = ho2Var4.d;
            if (!D() && j2 <= n() / i62.b) {
                while (true) {
                    Unsafe unsafe4 = rh0.a;
                    long j6 = l;
                    z0h z0hVar2 = (z0h) unsafe4.getObjectVolatile(this, j6);
                    if (z0hVar2.d >= j5 || !ho2Var4.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = rh0.a;
                        ho2Var2 = ho2Var4;
                        if (unsafe5.compareAndSwapObject(this, l, z0hVar2, ho2Var4)) {
                            if (z0hVar2.f()) {
                                z0hVar2.e();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j6) != z0hVar2) {
                                break;
                            }
                            ho2Var4 = ho2Var2;
                        }
                    }
                    ho2Var4 = ho2Var2;
                }
            }
            ho2Var2 = ho2Var4;
            if (j5 <= j2) {
                return ho2Var2;
            }
            long j7 = j5 * i62.b;
            do {
                unsafe = rh0.a;
                j3 = p;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * i62.b < v()) {
                ho2Var2.b();
            }
        }
        return null;
    }

    @Override // defpackage.ln2
    public final ujg l() {
        c62 c62Var = c62.b;
        i5k.e(3, c62Var);
        d62 d62Var = d62.b;
        i5k.e(3, d62Var);
        return new ujg(20, this, c62Var, d62Var, this.c, false);
    }

    public final ho2 m(long j2, ho2 ho2Var) {
        Object a;
        ho2 ho2Var2;
        long j3;
        Unsafe unsafe;
        g62 g62Var = this;
        ho2 ho2Var3 = i62.a;
        h62 h62Var = h62.b;
        loop0: while (true) {
            a = uh3.a(ho2Var, j2, h62Var);
            if (!jca.L(a)) {
                z0h I = jca.I(a);
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    long j4 = q;
                    z0h z0hVar = (z0h) unsafe2.getObjectVolatile(g62Var, j4);
                    if (z0hVar.d >= I.d) {
                        break loop0;
                    }
                    if (!I.j()) {
                        break;
                    }
                    do {
                        unsafe = rh0.a;
                        if (unsafe.compareAndSwapObject(g62Var, q, z0hVar, I)) {
                            if (z0hVar.f()) {
                                z0hVar.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(g62Var, j4) == z0hVar);
                    if (I.f()) {
                        I.e();
                    }
                }
            } else {
                break;
            }
        }
        ho2 ho2Var4 = null;
        if (jca.L(a)) {
            g62Var.B();
            if (ho2Var.d * i62.b >= g62Var.t()) {
                return null;
            }
            ho2Var.b();
            return null;
        }
        ho2 ho2Var5 = (ho2) jca.I(a);
        long j5 = ho2Var5.d;
        if (j5 <= j2) {
            return ho2Var5;
        }
        long j6 = j5 * i62.b;
        while (true) {
            Unsafe unsafe3 = rh0.a;
            long j7 = r;
            long longVolatile = unsafe3.getLongVolatile(g62Var, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                ho2Var2 = ho2Var4;
                j3 = j5;
                break;
            }
            ho2Var2 = ho2Var4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(g62Var, j7, longVolatile, j8 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            g62Var = this;
            ho2Var4 = ho2Var2;
            j5 = j3;
        }
        if (j3 * i62.b >= t()) {
            return ho2Var2;
        }
        ho2Var5.b();
        return ho2Var2;
    }

    public final long n() {
        return rh0.a.getLongVolatile(this, k);
    }

    @Override // defpackage.ln2
    public final Object o() {
        ho2 ho2Var;
        Unsafe unsafe = rh0.a;
        long longVolatile = unsafe.getLongVolatile(this, p);
        long longVolatile2 = unsafe.getLongVolatile(this, r);
        if (z(longVolatile2, true)) {
            return new eo2(p());
        }
        long j2 = longVolatile2 & 1152921504606846975L;
        fo2 fo2Var = go2.b;
        if (longVolatile >= j2) {
            return fo2Var;
        }
        Object obj = i62.k;
        ho2 ho2Var2 = (ho2) unsafe.getObjectVolatile(this, o);
        while (!this.A()) {
            long andIncrement = e.getAndIncrement(this);
            long j3 = i62.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (ho2Var2.d != j4) {
                ho2 k2 = this.k(j4, ho2Var2);
                if (k2 == null) {
                    continue;
                } else {
                    ho2Var = k2;
                }
            } else {
                ho2Var = ho2Var2;
            }
            g62 g62Var = this;
            Object M = g62Var.M(ho2Var, i2, andIncrement, obj);
            ho2Var2 = ho2Var;
            if (M == i62.m) {
                kzk kzkVar = obj instanceof kzk ? (kzk) obj : null;
                if (kzkVar != null) {
                    kzkVar.b(ho2Var2, i2);
                }
                g62Var.P(andIncrement);
                ho2Var2.i();
                return fo2Var;
            }
            if (M != i62.o) {
                if (M != i62.n) {
                    ho2Var2.b();
                    return M;
                }
                a70.r("unexpected");
                return null;
            }
            if (andIncrement < g62Var.v()) {
                ho2Var2.b();
            }
            this = g62Var;
        }
        return new eo2(this.p());
    }

    public final Throwable p() {
        return (Throwable) rh0.a.getObjectVolatile(this, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c A[RETURN] */
    @Override // defpackage.l4h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(rq3 rq3Var, Object obj) {
        Object q2;
        Object obj2;
        String str;
        int i2;
        g62 g62Var = this;
        Unsafe unsafe = rh0.a;
        long j2 = q;
        ho2 ho2Var = (ho2) unsafe.getObjectVolatile(g62Var, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(g62Var);
            long j3 = andIncrement & 1152921504606846975L;
            boolean z = g62Var.z(andIncrement, false);
            int i3 = i62.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (ho2Var.d != j5) {
                ho2 m2 = g62Var.m(j5, ho2Var);
                if (m2 != null) {
                    ho2Var = m2;
                } else if (z) {
                    Object F = F(rq3Var, obj);
                    if (F == lu3.a) {
                        return F;
                    }
                }
            }
            int N = g62Var.N(ho2Var, i4, obj, j3, null, z);
            if (N == 0) {
                ho2Var.b();
                break;
            }
            if (N == 1) {
                break;
            }
            if (N != 2) {
                if (N == 3) {
                    lj2 o0 = k53.o0(z9a.b(rq3Var));
                    try {
                        int N2 = N(ho2Var, i4, obj, j3, o0, false);
                        if (N2 == 0) {
                            ho2Var.b();
                            p2g p2gVar = w2g.b;
                        } else if (N2 != 1) {
                            if (N2 != 2) {
                                if (N2 != 4) {
                                    String str2 = "unexpected";
                                    if (N2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    ho2Var.b();
                                    ho2 ho2Var2 = (ho2) rh0.a.getObjectVolatile(this, j2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean z2 = z(andIncrement2, false);
                                        int i5 = i62.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i5;
                                        long j8 = j6 / j7;
                                        int i6 = (int) (j6 % j7);
                                        if (ho2Var2.d != j8) {
                                            ho2 m3 = m(j8, ho2Var2);
                                            if (m3 != null) {
                                                str = str2;
                                                i2 = i6;
                                                ho2Var2 = m3;
                                            } else {
                                                if (z2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                            }
                                        } else {
                                            str = str2;
                                            i2 = i6;
                                        }
                                        int N3 = N(ho2Var2, i2, obj, j6, o0, z2);
                                        if (N3 == 0) {
                                            ho2Var2.b();
                                            p2g p2gVar2 = w2g.b;
                                            break;
                                        }
                                        if (N3 == 1) {
                                            p2g p2gVar3 = w2g.b;
                                            break;
                                        }
                                        if (N3 != 2) {
                                            if (N3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (N3 != 4) {
                                                if (N3 == 5) {
                                                    ho2Var2.b();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                            } else if (j6 < t()) {
                                                ho2Var2.b();
                                            }
                                        } else if (z2) {
                                            ho2Var2.i();
                                        } else {
                                            o0.b(ho2Var2, i2 + i5);
                                        }
                                    }
                                } else if (j3 < t()) {
                                    ho2Var.b();
                                }
                                G(o0, obj);
                            } else {
                                o0.b(ho2Var, i4 + i3);
                            }
                            q2 = o0.q();
                            obj2 = lu3.a;
                            if (q2 != obj2) {
                                q2 = Unit.a;
                            }
                            if (q2 == obj2) {
                                return q2;
                            }
                        } else {
                            p2g p2gVar4 = w2g.b;
                        }
                        o0.resumeWith(Unit.a);
                        q2 = o0.q();
                        obj2 = lu3.a;
                        if (q2 != obj2) {
                        }
                        if (q2 == obj2) {
                        }
                    } catch (Throwable th) {
                        o0.B();
                        throw th;
                    }
                } else if (N != 4) {
                    if (N == 5) {
                        ho2Var.b();
                    }
                    g62Var = this;
                } else {
                    if (j3 < t()) {
                        ho2Var.b();
                    }
                    Object F2 = F(rq3Var, obj);
                    if (F2 == lu3.a) {
                        return F2;
                    }
                }
            } else if (z) {
                ho2Var.i();
                Object F3 = F(rq3Var, obj);
                if (F3 == lu3.a) {
                    return F3;
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.l4h
    public final boolean r(Throwable th) {
        return c(th, false);
    }

    public final Throwable s() {
        Throwable p2 = p();
        return p2 == null ? new oz2("Channel was closed") : p2;
    }

    public final long t() {
        return rh0.a.getLongVolatile(this, p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b6, code lost:
    
        r3 = (defpackage.ho2) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bd, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = rh0.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, r) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i2 = 0;
        List j2 = b.j(unsafe.getObjectVolatile(this, o), unsafe.getObjectVolatile(this, q), unsafe.getObjectVolatile(this, l));
        ArrayList arrayList = new ArrayList();
        for (Object obj : j2) {
            if (((ho2) obj) != i62.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            yhk.d();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((ho2) next).d;
            do {
                Object next2 = it.next();
                long j4 = ((ho2) next2).d;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        ho2 ho2Var = (ho2) next;
        long t = t();
        long v = v();
        loop2: while (true) {
            int i3 = i62.b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j5 = (ho2Var.d * i62.b) + i4;
                if (j5 >= v && j5 >= t) {
                    break loop2;
                }
                Object l2 = ho2Var.l(i4);
                Object obj2 = ho2Var.h.get(i4 * 2);
                if (l2 instanceof kj2) {
                    str = (v > j5 || j5 >= t) ? (t > j5 || j5 >= v) ? "cont" : "send" : "receive";
                } else if (l2 instanceof h2h) {
                    str = (v > j5 || j5 >= t) ? (t > j5 || j5 >= v) ? "select" : "onSend" : "onReceive";
                } else if (l2 instanceof tpf) {
                    str = "receiveCatching";
                } else if (l2 instanceof lzk) {
                    str = "EB(" + l2 + ')';
                } else if (Intrinsics.c(l2, i62.f) || Intrinsics.c(l2, i62.g)) {
                    str = "resuming_sender";
                } else {
                    if (l2 != null && !l2.equals(i62.e) && !l2.equals(i62.i) && !l2.equals(i62.h) && !l2.equals(i62.k) && !l2.equals(i62.j) && !l2.equals(i62.l)) {
                        str = l2.toString();
                    }
                    i4++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (iii.G(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public final Throwable u() {
        Throwable p2 = p();
        return p2 == null ? new pz2("Channel was closed") : p2;
    }

    public final long v() {
        return rh0.a.getLongVolatile(this, r) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            Unsafe unsafe = rh0.a;
            long j2 = o;
            ho2 ho2Var = (ho2) unsafe.getObjectVolatile(this, j2);
            long t = t();
            if (v() <= t) {
                return false;
            }
            int i2 = i62.b;
            long j3 = t / i2;
            if (ho2Var.d == j3 || (ho2Var = k(j3, ho2Var)) != null) {
                ho2Var.b();
                int i3 = (int) (t % i2);
                while (true) {
                    Object l2 = ho2Var.l(i3);
                    if (l2 == null || l2 == i62.e) {
                        if (ho2Var.k(i3, l2, i62.h)) {
                            j();
                            break;
                        }
                    } else {
                        if (l2 == i62.d) {
                            return true;
                        }
                        if (l2 != i62.j && l2 != i62.l && l2 != i62.i && l2 != i62.h) {
                            if (l2 == i62.g) {
                                return true;
                            }
                            if (l2 != i62.f && t == t()) {
                                return true;
                            }
                        }
                    }
                }
                rh0.a.compareAndSwapLong(this, p, t, t + 1);
            } else if (((ho2) rh0.a.getObjectVolatile(this, j2)).d < j3) {
                return false;
            }
        }
    }

    public final void x(long j2) {
        if ((g.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((rh0.a.getLongVolatile(this, n) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c1, code lost:
    
        r1 = (defpackage.ho2) ((defpackage.vh3) defpackage.rh0.a.getObjectVolatile(r1, defpackage.vh3.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                h(j2 & 1152921504606846975L);
                if (!z || !w()) {
                }
            } else {
                if (i2 != 3) {
                    hc5.f(ljg.j(i2, "unexpected close status: "));
                    return false;
                }
                ho2 h2 = h(j2 & 1152921504606846975L);
                fb3 fb3Var = null;
                Object obj = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = h2.h;
                    int i3 = i62.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j3 = (h2.d * i62.b) + i3;
                        while (true) {
                            Object l2 = h2.l(i3);
                            if (l2 == i62.i) {
                                break loop0;
                            }
                            ih2 ih2Var = i62.d;
                            Function1 function1 = this.b;
                            if (l2 == ih2Var) {
                                if (j3 < t()) {
                                    break loop0;
                                }
                                if (h2.k(i3, l2, i62.l)) {
                                    if (function1 != null) {
                                        fb3Var = y6a.w(function1, atomicReferenceArray.get(i3 * 2), fb3Var);
                                    }
                                    h2.n(i3, null);
                                    h2.i();
                                }
                            } else if (l2 == i62.e || l2 == null) {
                                if (h2.k(i3, l2, i62.l)) {
                                    h2.i();
                                    break;
                                }
                            } else if (!(l2 instanceof kzk) && !(l2 instanceof lzk)) {
                                ih2 ih2Var2 = i62.g;
                                if (l2 == ih2Var2 || l2 == i62.f) {
                                    break loop0;
                                }
                                if (l2 != ih2Var2) {
                                    break;
                                }
                            } else {
                                if (j3 < t()) {
                                    break loop0;
                                }
                                kzk kzkVar = l2 instanceof lzk ? ((lzk) l2).a : (kzk) l2;
                                if (h2.k(i3, l2, i62.l)) {
                                    if (function1 != null) {
                                        fb3Var = y6a.w(function1, atomicReferenceArray.get(i3 * 2), fb3Var);
                                    }
                                    obj = w3a.M(obj, kzkVar);
                                    h2.n(i3, null);
                                    h2.i();
                                }
                            }
                        }
                        i3--;
                    }
                } while (h2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            J((kzk) arrayList.get(size), false);
                        }
                    } else {
                        J((kzk) obj, false);
                    }
                }
                if (fb3Var != null) {
                    throw fb3Var;
                }
            }
            return true;
        }
        return false;
    }
}
