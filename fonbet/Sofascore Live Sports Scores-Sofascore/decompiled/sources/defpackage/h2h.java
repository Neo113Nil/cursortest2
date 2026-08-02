package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h2h implements ej2, kzk {
    public static final /* synthetic */ long f = rh0.a.objectFieldOffset(h2h.class.getDeclaredField("state$volatile"));
    public final CoroutineContext a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = j2h.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = j2h.d;

    public h2h(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public static Object d(h2h h2hVar, hoi hoiVar) {
        return rh0.a.getObjectVolatile(h2hVar, f) instanceof f2h ? h2hVar.c(hoiVar) : h2hVar.e(hoiVar);
    }

    @Override // defpackage.ej2
    public final void a(Throwable th) {
        h2h h2hVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == j2h.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = rh0.a;
                h2hVar = this;
                if (unsafe2.compareAndSwapObject(h2hVar, f, objectVolatile, j2h.c)) {
                    ArrayList arrayList = h2hVar.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f2h) it.next()).a();
                    }
                    h2hVar.e = j2h.d;
                    h2hVar.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(h2hVar, j) != objectVolatile) {
                    break;
                } else {
                    this = h2hVar;
                }
            }
            this = h2hVar;
        }
    }

    @Override // defpackage.kzk
    public final void b(z0h z0hVar, int i) {
        this.c = z0hVar;
        this.d = i;
    }

    public final Object c(sq3 sq3Var) {
        Unsafe unsafe = rh0.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        f2h f2hVar = (f2h) objectVolatile;
        Object obj = f2hVar.d;
        Object obj2 = this.e;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f2h f2hVar2 = (f2h) it.next();
                if (f2hVar2 != f2hVar) {
                    f2hVar2.a();
                }
            }
            rh0.a.putObjectVolatile(this, j, j2h.b);
            this.e = j2h.d;
            this.b = null;
        }
        Object invoke = f2hVar.c.invoke(f2hVar.a, obj, obj2);
        mt8 mt8Var = f2hVar.e;
        return obj == j2h.e ? ((Function1) mt8Var).invoke(sq3Var) : ((Function2) mt8Var).invoke(invoke, sq3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r0 == r7) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        g2h g2hVar;
        int i;
        lj2 lj2Var;
        if (sq3Var instanceof g2h) {
            g2hVar = (g2h) sq3Var;
            int i2 = g2hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g2hVar.t = i2 - Integer.MIN_VALUE;
                g2h g2hVar2 = g2hVar;
                Object obj = g2hVar2.r;
                Object obj2 = lu3.a;
                i = g2hVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    g2hVar2.t = 1;
                    lj2 lj2Var2 = new lj2(1, z9a.b(g2hVar2));
                    lj2Var2.t();
                    loop0: while (true) {
                        Unsafe unsafe = rh0.a;
                        long j = f;
                        Object objectVolatile = unsafe.getObjectVolatile(this, j);
                        lj2 lj2Var3 = lj2Var2;
                        ih2 ih2Var = j2h.a;
                        if (objectVolatile == ih2Var) {
                            lj2 lj2Var4 = lj2Var3;
                            while (true) {
                                Unsafe unsafe2 = rh0.a;
                                lj2Var = lj2Var4;
                                if (unsafe2.compareAndSwapObject(this, f, objectVolatile, lj2Var4)) {
                                    lj2Var.w(this);
                                    break loop0;
                                }
                                if (unsafe2.getObjectVolatile(this, j) != objectVolatile) {
                                    break;
                                }
                                lj2Var4 = lj2Var;
                            }
                            lj2Var2 = lj2Var;
                        } else {
                            lj2Var = lj2Var3;
                            if (objectVolatile instanceof List) {
                                while (true) {
                                    Unsafe unsafe3 = rh0.a;
                                    if (unsafe3.compareAndSwapObject(this, f, objectVolatile, ih2Var)) {
                                        Iterator it = ((Iterable) objectVolatile).iterator();
                                        while (it.hasNext()) {
                                            f2h f2 = f(it.next());
                                            f2.getClass();
                                            f2.g = null;
                                            f2.h = -1;
                                            h(f2, true);
                                        }
                                    } else if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                                        break;
                                    }
                                }
                                lj2Var2 = lj2Var;
                            } else {
                                if (!(objectVolatile instanceof f2h)) {
                                    cp4.g(objectVolatile, "unexpected state: ");
                                    return null;
                                }
                                Unit unit = Unit.a;
                                f2h f2hVar = (f2h) objectVolatile;
                                Object obj3 = this.e;
                                ct8 ct8Var = f2hVar.f;
                                lj2Var.i(unit, ct8Var != null ? (ct8) ct8Var.invoke(this, f2hVar.d, obj3) : null);
                            }
                        }
                    }
                    Object q = lj2Var.q();
                    if (q != lu3.a) {
                        q = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                g2hVar2.t = 2;
                Object c = c(g2hVar2);
                return c != obj2 ? obj2 : c;
            }
        }
        g2hVar = new g2h(this, sq3Var);
        g2h g2hVar22 = g2hVar;
        Object obj4 = g2hVar22.r;
        Object obj22 = lu3.a;
        i = g2hVar22.t;
        if (i != 0) {
        }
        g2hVar22.t = 2;
        Object c2 = c(g2hVar22);
        if (c2 != obj22) {
        }
    }

    public final f2h f(Object obj) {
        Object obj2;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((f2h) obj2).a == obj) {
                break;
            }
        }
        f2h f2hVar = (f2h) obj2;
        if (f2hVar != null) {
            return f2hVar;
        }
        pvd.p(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ujg ujgVar, Function2 function2) {
        h(new f2h(this, ujgVar.b, (ct8) ujgVar.c, (ct8) ujgVar.d, null, (hoi) function2, (ct8) ujgVar.e), false);
    }

    public final void h(f2h f2hVar, boolean z) {
        Object obj = f2hVar.a;
        Unsafe unsafe = rh0.a;
        long j = f;
        if (unsafe.getObjectVolatile(this, j) instanceof f2h) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((f2h) it.next()).a == obj) {
                        hc5.f(mz1.m(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        f2hVar.b.invoke(obj, this, f2hVar.d);
        if (this.e != j2h.d) {
            rh0.a.putObjectVolatile(this, j, f2hVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(f2hVar);
        }
        f2hVar.g = this.c;
        f2hVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int i(Object obj, Object obj2) {
        h2h h2hVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = rh0.a;
            long j = f;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof kj2) {
                f2h f2 = this.f(obj);
                if (f2 != null) {
                    ct8 ct8Var = f2.f;
                    ct8 ct8Var2 = ct8Var != null ? (ct8) ct8Var.invoke(this, f2.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = rh0.a;
                        h2hVar = this;
                        if (unsafe4.compareAndSwapObject(h2hVar, f, objectVolatile, f2)) {
                            kj2 kj2Var = (kj2) objectVolatile;
                            h2hVar.e = obj2;
                            ih2 c = kj2Var.c(Unit.a, ct8Var2);
                            if (c == null) {
                                h2hVar.e = j2h.d;
                                return 2;
                            }
                            kj2Var.s(c);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(h2hVar, j) != objectVolatile) {
                            break;
                        }
                        this = h2hVar;
                    }
                } else {
                    continue;
                }
            } else {
                h2hVar = this;
                if (Intrinsics.c(objectVolatile, j2h.b) || (objectVolatile instanceof f2h)) {
                    return 3;
                }
                if (Intrinsics.c(objectVolatile, j2h.c)) {
                    return 2;
                }
                if (Intrinsics.c(objectVolatile, j2h.a)) {
                    List c2 = a.c(obj);
                    do {
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(h2hVar, f, objectVolatile, c2)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(h2hVar, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        cp4.g(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList x0 = CollectionsKt.x0((Collection) objectVolatile, obj);
                    do {
                        unsafe = rh0.a;
                        if (unsafe.compareAndSwapObject(h2hVar, f, objectVolatile, x0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(h2hVar, j) == objectVolatile);
                }
            }
            this = h2hVar;
        }
    }
}
