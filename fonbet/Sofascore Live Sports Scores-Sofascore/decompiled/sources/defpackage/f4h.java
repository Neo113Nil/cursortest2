package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class f4h {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final pte b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = rh0.a;
        g = unsafe.objectFieldOffset(f4h.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(f4h.class, "deqIdx$volatile");
        h = unsafe.objectFieldOffset(f4h.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(f4h.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(f4h.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(f4h.class.getDeclaredField("_availablePermits$volatile"));
    }

    public f4h(int i) {
        this.a = i;
        if (i <= 0) {
            ogj.h(ljg.j(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            ogj.h(ljg.j(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        i4h i4hVar = new i4h(0L, null, 2);
        this.head$volatile = i4hVar;
        this.tail$volatile = i4hVar;
        this._availablePermits$volatile = i;
        this.b = new pte(this, 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.i(kotlin.Unit.a, r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.a;
        }
        lj2 o0 = k53.o0(z9a.b(sq3Var));
        try {
            if (!b(o0)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (b(o0)) {
                            break;
                        }
                    }
                }
            }
            Object q = o0.q();
            lu3 lu3Var = lu3.a;
            if (q != lu3Var) {
                q = Unit.a;
            }
            return q == lu3Var ? q : Unit.a;
        } catch (Throwable th) {
            o0.B();
            throw th;
        }
    }

    public final boolean b(kzk kzkVar) {
        Object a;
        Unsafe unsafe;
        f4h f4hVar = this;
        Unsafe unsafe2 = rh0.a;
        long j = h;
        i4h i4hVar = (i4h) unsafe2.getObjectVolatile(f4hVar, j);
        long andIncrement = d.getAndIncrement(f4hVar);
        d4h d4hVar = d4h.b;
        long j2 = andIncrement / h4h.f;
        loop0: while (true) {
            a = uh3.a(i4hVar, j2, d4hVar);
            if (jca.L(a)) {
                break;
            }
            z0h I = jca.I(a);
            while (true) {
                z0h z0hVar = (z0h) rh0.a.getObjectVolatile(f4hVar, j);
                if (z0hVar.d >= I.d) {
                    f4hVar = this;
                    break loop0;
                }
                if (!I.j()) {
                    break;
                }
                do {
                    unsafe = rh0.a;
                    f4hVar = this;
                    if (unsafe.compareAndSwapObject(f4hVar, h, z0hVar, I)) {
                        if (z0hVar.f()) {
                            z0hVar.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(f4hVar, j) == z0hVar);
                if (I.f()) {
                    I.e();
                }
            }
            f4hVar = this;
        }
        i4h i4hVar2 = (i4h) jca.I(a);
        AtomicReferenceArray atomicReferenceArray = i4hVar2.g;
        int i = (int) (andIncrement % h4h.f);
        while (!atomicReferenceArray.compareAndSet(i, null, kzkVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ih2 ih2Var = h4h.b;
                ih2 ih2Var2 = h4h.c;
                while (!atomicReferenceArray.compareAndSet(i, ih2Var, ih2Var2)) {
                    if (atomicReferenceArray.get(i) != ih2Var) {
                        return false;
                    }
                }
                ((kj2) kzkVar).i(Unit.a, f4hVar.b);
                return true;
            }
        }
        kzkVar.b(i4hVar2, i);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object a;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    unsafe = rh0.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                pvd.l(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = rh0.a;
            long j2 = g;
            i4h i4hVar = (i4h) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / h4h.f;
            e4h e4hVar = e4h.b;
            while (true) {
                a = uh3.a(i4hVar, j3, e4hVar);
                if (jca.L(a)) {
                    break;
                }
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
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(this, g, z0hVar, I)) {
                            if (z0hVar.f()) {
                                z0hVar.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == z0hVar);
                    if (I.f()) {
                        I.e();
                    }
                }
            }
            i4h i4hVar2 = (i4h) jca.I(a);
            AtomicReferenceArray atomicReferenceArray = i4hVar2.g;
            i4hVar2.b();
            z = false;
            if (i4hVar2.d <= j3) {
                int i3 = (int) (andIncrement2 % h4h.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, h4h.b);
                if (andSet == null) {
                    int i4 = h4h.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == h4h.c) {
                            z = true;
                            break;
                        }
                    }
                    ih2 ih2Var = h4h.b;
                    ih2 ih2Var2 = h4h.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, ih2Var, ih2Var2)) {
                            if (atomicReferenceArray.get(i3) != ih2Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != h4h.e) {
                    if (!(andSet instanceof kj2)) {
                        if (!(andSet instanceof h2h)) {
                            cp4.g(andSet, "unexpected: ");
                            return;
                        }
                        if (((h2h) andSet).i(this, Unit.a) != 0) {
                        }
                        z = true;
                        break;
                        break;
                    }
                    kj2 kj2Var = (kj2) andSet;
                    ih2 c2 = kj2Var.c(Unit.a, this.b);
                    if (c2 != null) {
                        kj2Var.s(c2);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
