package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class l26 extends g26 implements iv4 {
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ int j = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = rh0.a;
        i = unsafe.objectFieldOffset(l26.class.getDeclaredField("_queue$volatile"));
        g = unsafe.objectFieldOffset(l26.class.getDeclaredField("_delayed$volatile"));
        h = unsafe.objectFieldOffset(l26.class.getDeclaredField("_isCompleted$volatile"));
    }

    public void B0(Runnable runnable) {
        E0();
        if (!H0(runnable)) {
            yo4.k.B0(runnable);
            return;
        }
        Thread I0 = I0();
        if (Thread.currentThread() != I0) {
            LockSupport.unpark(I0);
        }
    }

    public final void E0() {
        j26 j26Var;
        k26 k26Var = (k26) rh0.a.getObjectVolatile(this, g);
        if (k26Var == null || k26Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (k26Var) {
                try {
                    j26[] j26VarArr = k26Var.a;
                    j26Var = null;
                    j26 j26Var2 = j26VarArr != null ? j26VarArr[0] : null;
                    if (j26Var2 != null) {
                        if (nanoTime - j26Var2.a >= 0 ? H0(j26Var2) : false) {
                            j26Var = k26Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (j26Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            Unsafe unsafe4 = rh0.a;
            long j2 = i;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j2);
            if (unsafe4.getIntVolatile(this, h) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = rh0.a;
                    if (unsafe.compareAndSwapObject(this, i, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == null);
            } else if (objectVolatile instanceof lib) {
                lib libVar = (lib) objectVolatile;
                int a = libVar.a(runnable);
                if (a == 0) {
                    break;
                }
                if (a == 1) {
                    lib c = libVar.c();
                    do {
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(this, i, objectVolatile, c)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
                } else if (a == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == m26.b) {
                    return false;
                }
                lib libVar2 = new lib(8, true);
                libVar2.a((Runnable) objectVolatile);
                libVar2.a(runnable);
                do {
                    unsafe3 = rh0.a;
                    if (unsafe3.compareAndSwapObject(this, i, objectVolatile, libVar2)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public abstract Thread I0();

    public final boolean P0() {
        vg0 vg0Var = this.e;
        if (vg0Var != null ? vg0Var.isEmpty() : true) {
            Unsafe unsafe = rh0.a;
            k26 k26Var = (k26) unsafe.getObjectVolatile(this, g);
            if (k26Var != null && k26Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, i);
            if (objectVolatile != null) {
                if (objectVolatile instanceof lib) {
                    long longVolatile = unsafe.getLongVolatile((lib) objectVolatile, lib.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == m26.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void Q0(long j2, j26 j26Var) {
        yo4.k.X0(j2, j26Var);
    }

    public final void X0(long j2, j26 j26Var) {
        l26 l26Var;
        int b;
        Unsafe unsafe;
        Thread I0;
        long j3 = g;
        Unsafe unsafe2 = rh0.a;
        if (unsafe2.getIntVolatile(this, h) == 1) {
            l26Var = this;
            b = 1;
        } else {
            k26 k26Var = (k26) unsafe2.getObjectVolatile(this, j3);
            if (k26Var == null) {
                k26 k26Var2 = new k26();
                k26Var2.c = j2;
                while (true) {
                    unsafe = rh0.a;
                    l26Var = this;
                    if (!unsafe.compareAndSwapObject(l26Var, g, (Object) null, k26Var2) && unsafe.getObjectVolatile(l26Var, j3) == null) {
                        this = l26Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(l26Var, j3);
                objectVolatile.getClass();
                k26Var = (k26) objectVolatile;
                unsafe2 = unsafe;
            } else {
                l26Var = this;
            }
            b = j26Var.b(j2, k26Var, l26Var);
        }
        if (b != 0) {
            if (b == 1) {
                l26Var.Q0(j2, j26Var);
                return;
            } else {
                if (b == 2) {
                    return;
                }
                a70.r("unexpected result");
                return;
            }
        }
        k26 k26Var3 = (k26) unsafe2.getObjectVolatile(l26Var, j3);
        if (k26Var3 != null) {
            synchronized (k26Var3) {
                j26[] j26VarArr = k26Var3.a;
                r12 = j26VarArr != null ? j26VarArr[0] : null;
            }
        }
        if (r12 != j26Var || Thread.currentThread() == (I0 = l26Var.I0())) {
            return;
        }
        LockSupport.unpark(I0);
    }

    @Override // defpackage.iv4
    public final void f(long j2, lj2 lj2Var) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            h26 h26Var = new h26(this, j3 + nanoTime, lj2Var);
            X0(nanoTime, h26Var);
            lj2Var.w(new dj2(h26Var, 2));
        }
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        B0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.g26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r0() {
        Unsafe unsafe;
        l26 l26Var;
        Unsafe unsafe2;
        Runnable runnable;
        j26 j26Var;
        ih2 ih2Var = m26.b;
        long j2 = i;
        if (!u0()) {
            E0();
            loop0: while (true) {
                unsafe = rh0.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                if (objectVolatile == null) {
                    l26Var = this;
                    break;
                }
                if (objectVolatile instanceof lib) {
                    lib libVar = (lib) objectVolatile;
                    Object d = libVar.d();
                    if (d != lib.e) {
                        Runnable runnable2 = (Runnable) d;
                        l26Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    lib c = libVar.c();
                    while (true) {
                        Unsafe unsafe3 = rh0.a;
                        l26Var = this;
                        if (!unsafe3.compareAndSwapObject(l26Var, i, objectVolatile, c) && unsafe3.getObjectVolatile(l26Var, j2) == objectVolatile) {
                            this = l26Var;
                        }
                    }
                    this = l26Var;
                } else {
                    l26Var = this;
                    if (objectVolatile == ih2Var) {
                        break;
                    }
                    do {
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(l26Var, i, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(l26Var, j2) == objectVolatile);
                    this = l26Var;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            vg0 vg0Var = l26Var.e;
            if (((vg0Var == null || vg0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(l26Var, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof lib) {
                        long longVolatile = unsafe2.getLongVolatile((lib) objectVolatile2, lib.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == ih2Var) {
                        return Long.MAX_VALUE;
                    }
                }
                k26 k26Var = (k26) unsafe.getObjectVolatile(l26Var, g);
                if (k26Var != null) {
                    synchronized (k26Var) {
                        j26[] j26VarArr = k26Var.a;
                        j26Var = j26VarArr != null ? j26VarArr[0] : null;
                    }
                    if (j26Var != null) {
                        long nanoTime = j26Var.a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // defpackage.g26
    public void shutdown() {
        ih2 ih2Var;
        Unsafe unsafe;
        j26 c;
        cgj.a.set(null);
        rh0.a.putIntVolatile(this, h, 1);
        ih2 ih2Var2 = m26.b;
        long j2 = i;
        loop0: while (true) {
            Object objectVolatile = rh0.a.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    ih2Var = ih2Var2;
                    if (unsafe2.compareAndSwapObject(this, i, (Object) null, ih2Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    } else {
                        ih2Var2 = ih2Var;
                    }
                }
                ih2Var2 = ih2Var;
            } else {
                ih2Var = ih2Var2;
                if (objectVolatile instanceof lib) {
                    ((lib) objectVolatile).b();
                    break;
                }
                if (objectVolatile == ih2Var) {
                    break;
                }
                lib libVar = new lib(8, true);
                libVar.a((Runnable) objectVolatile);
                do {
                    unsafe = rh0.a;
                    if (unsafe.compareAndSwapObject(this, i, objectVolatile, libVar)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                ih2Var2 = ih2Var;
            }
        }
        while (r0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            k26 k26Var = (k26) rh0.a.getObjectVolatile(this, g);
            if (k26Var == null) {
                return;
            }
            synchronized (k26Var) {
                c = k26Var.b() > 0 ? k26Var.c(0) : null;
            }
            if (c == null) {
                return;
            } else {
                Q0(nanoTime, c);
            }
        }
    }
}
