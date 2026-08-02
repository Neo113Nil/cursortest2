package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class iib {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = rh0.a;
        a = unsafe.objectFieldOffset(iib.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(iib.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(iib.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(iib iibVar, int i) {
        iib iibVar2;
        iib iibVar3;
        while (true) {
            iib i2 = this.i();
            if (i2 instanceof acb) {
                return (((acb) i2).d & i) == 0 && i2.c(iibVar, i);
            }
            Unsafe unsafe = rh0.a;
            unsafe.putObjectVolatile(iibVar, b, i2);
            long j = a;
            unsafe.putObjectVolatile(iibVar, j, this);
            while (true) {
                Unsafe unsafe2 = rh0.a;
                iibVar2 = this;
                iibVar3 = iibVar;
                if (unsafe2.compareAndSwapObject(i2, a, iibVar2, iibVar3)) {
                    iibVar3.f(iibVar2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(i2, j) != iibVar2) {
                    break;
                }
                this = iibVar2;
                iibVar = iibVar3;
            }
            this = iibVar2;
            iibVar = iibVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iib e() {
        iib iibVar;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = rh0.a;
            long j = b;
            iib iibVar2 = (iib) unsafe2.getObjectVolatile(this, j);
            iib iibVar3 = null;
            iib iibVar4 = iibVar2;
            while (iibVar4 != null) {
                Unsafe unsafe3 = rh0.a;
                long j2 = a;
                Object objectVolatile = unsafe3.getObjectVolatile(iibVar4, j2);
                if (objectVolatile != this) {
                    iib iibVar5 = iibVar2;
                    iibVar = this;
                    if (iibVar.j()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof jyf)) {
                        objectVolatile.getClass();
                        iibVar3 = iibVar4;
                        iibVar4 = (iib) objectVolatile;
                    } else if (iibVar3 != null) {
                        iib iibVar6 = ((jyf) objectVolatile).a;
                        do {
                            iib iibVar7 = iibVar4;
                            unsafe = rh0.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(iibVar3, a, iibVar7, iibVar6);
                            iibVar4 = iibVar7;
                            if (compareAndSwapObject) {
                                this = iibVar;
                                iibVar4 = iibVar3;
                                iibVar2 = iibVar5;
                                iibVar3 = null;
                            }
                        } while (unsafe.getObjectVolatile(iibVar3, j2) == iibVar4);
                    } else {
                        if (iibVar4 == null) {
                            pvd.j();
                            return null;
                        }
                        iibVar4 = (iib) unsafe3.getObjectVolatile(iibVar4, j);
                    }
                    this = iibVar;
                    iibVar2 = iibVar5;
                } else {
                    if (iibVar2 == iibVar4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = rh0.a;
                        iib iibVar8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(iibVar8, b, iibVar2, iibVar4);
                        iib iibVar9 = iibVar2;
                        iibVar = iibVar8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(iibVar, j) != iibVar9) {
                            break;
                        }
                        this = iibVar;
                        iibVar2 = iibVar9;
                    }
                }
                this = iibVar;
            }
            pvd.j();
            return null;
        }
    }

    public final void f(iib iibVar) {
        iib iibVar2;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = b;
            iib iibVar3 = (iib) unsafe.getObjectVolatile(iibVar, j);
            if (this.g() != iibVar) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = rh0.a;
                iibVar2 = this;
                iib iibVar4 = iibVar;
                if (unsafe2.compareAndSwapObject(iibVar4, b, iibVar3, iibVar2)) {
                    if (iibVar2.j()) {
                        iibVar4.e();
                        return;
                    }
                    return;
                } else {
                    iibVar = iibVar4;
                    if (unsafe2.getObjectVolatile(iibVar4, j) != iibVar3) {
                        break;
                    } else {
                        this = iibVar2;
                    }
                }
            }
            this = iibVar2;
        }
    }

    public final Object g() {
        return rh0.a.getObjectVolatile(this, a);
    }

    public final iib h() {
        Object g = g();
        jyf jyfVar = g instanceof jyf ? (jyf) g : null;
        if (jyfVar != null) {
            return jyfVar.a;
        }
        g.getClass();
        return (iib) g;
    }

    public final iib i() {
        iib e = e();
        if (e != null) {
            return e;
        }
        Unsafe unsafe = rh0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            iib iibVar = (iib) objectVolatile;
            if (!iibVar.j()) {
                return iibVar;
            }
            objectVolatile = rh0.a.getObjectVolatile(iibVar, j);
        }
    }

    public boolean j() {
        return g() instanceof jyf;
    }

    public String toString() {
        return new apa(1, 3, ml4.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + ml4.X(this);
    }
}
