package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class va2 implements db2, hc2 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile int flushBufferSize;
    public final w52 b = new w52();
    public final Object c = new Object();

    @NotNull
    volatile /* synthetic */ Object suspensionSlot = la2.b;
    public final w52 d = new w52();
    public final w52 e = new w52();

    @NotNull
    volatile /* synthetic */ Object _closedCause = null;

    static {
        Unsafe unsafe = rh0.a;
        g = unsafe.objectFieldOffset(va2.class.getDeclaredField("suspensionSlot"));
        f = unsafe.objectFieldOffset(va2.class.getDeclaredField("_closedCause"));
    }

    @Override // defpackage.db2
    public final void a(Throwable th) {
        va2 va2Var;
        if (this._closedCause != null) {
            return;
        }
        gz2 gz2Var = new gz2(th);
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            va2Var = this;
            if (!unsafe.compareAndSwapObject(va2Var, j, (Object) null, gz2Var) && unsafe.getObjectVolatile(va2Var, j) == null) {
                this = va2Var;
            }
        }
        va2Var.i(gz2Var.a(fz2.b));
    }

    @Override // defpackage.db2
    public final Throwable b() {
        gz2 gz2Var = (gz2) this._closedCause;
        if (gz2Var != null) {
            return gz2Var.a(fz2.b);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[LOOP:1: B:17:0x0074->B:21:0x0091, LOOP_START, PHI: r2
      0x0074: PHI (r2v21 va2) = (r2v5 va2), (r2v24 va2) binds: [B:16:0x0072, B:21:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:11:0x004f->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.hc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        ra2 ra2Var;
        lu3 lu3Var;
        int i;
        ra2 ra2Var2;
        va2 va2Var;
        pa2 pa2Var;
        boolean z;
        va2 va2Var2;
        pa2 pa2Var2;
        lj2 lj2Var;
        Object q;
        la2 la2Var = la2.b;
        if (sq3Var instanceof ra2) {
            ra2Var = (ra2) sq3Var;
            int i2 = ra2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ra2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ra2Var.s;
                lu3Var = lu3.a;
                i = ra2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    Throwable b = b();
                    if (b != null) {
                        throw b;
                    }
                    j();
                    if (this.flushBufferSize < 1048576) {
                        return Unit.a;
                    }
                    ra2Var2 = ra2Var;
                    va2Var = this;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    va2 va2Var3 = ra2Var.r;
                    y6a.M(obj);
                    ra2Var2 = ra2Var;
                    va2Var = va2Var3;
                }
                while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
                    ra2Var2.r = va2Var;
                    ra2Var2.u = 1;
                    lj2 lj2Var2 = new lj2(1, z9a.b(ra2Var2));
                    lj2Var2.t();
                    oa2 oa2Var = new oa2(lj2Var2);
                    pa2Var = (pa2) va2Var.suspensionSlot;
                    z = pa2Var instanceof ja2;
                    if (z) {
                        while (true) {
                            Unsafe unsafe = rh0.a;
                            long j = g;
                            va2Var2 = va2Var;
                            if (unsafe.compareAndSwapObject(va2Var2, j, pa2Var, oa2Var)) {
                                break;
                            }
                            if (unsafe.getObjectVolatile(va2Var2, j) != pa2Var) {
                                oa2Var.b();
                                break;
                            }
                            va2Var = va2Var2;
                        }
                        lj2Var = lj2Var2;
                        va2Var = va2Var2;
                        q = lj2Var.q();
                        lu3 lu3Var2 = lu3.a;
                        if (q == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        va2Var2 = va2Var;
                    }
                    if (!(pa2Var instanceof oa2)) {
                        na2 na2Var = (na2) pa2Var;
                        na2Var.a(new kx2("write", na2Var.c()));
                    } else if (pa2Var instanceof na2) {
                        ((na2) pa2Var).b();
                    } else if (z) {
                        oa2Var.a(((ja2) pa2Var).b);
                        lj2Var = lj2Var2;
                        va2Var = va2Var2;
                        q = lj2Var.q();
                        lu3 lu3Var22 = lu3.a;
                        if (q == lu3Var) {
                        }
                    } else if (!Intrinsics.c(pa2Var, la2Var)) {
                        zzl.b();
                        return null;
                    }
                    if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                        pa2Var2 = (pa2) va2Var2.suspensionSlot;
                        if (pa2Var2 instanceof oa2) {
                            lj2 lj2Var3 = lj2Var2;
                            while (true) {
                                Unsafe unsafe2 = rh0.a;
                                long j2 = g;
                                lj2Var = lj2Var3;
                                va2Var = va2Var2;
                                if (unsafe2.compareAndSwapObject(va2Var, j2, pa2Var2, la2Var)) {
                                    ((na2) pa2Var2).b();
                                    break;
                                }
                                if (unsafe2.getObjectVolatile(va2Var, j2) != pa2Var2) {
                                    break;
                                }
                                va2Var2 = va2Var;
                                lj2Var3 = lj2Var;
                            }
                            q = lj2Var.q();
                            lu3 lu3Var222 = lu3.a;
                            if (q == lu3Var) {
                            }
                        }
                    }
                    lj2Var = lj2Var2;
                    va2Var = va2Var2;
                    q = lj2Var.q();
                    lu3 lu3Var2222 = lu3.a;
                    if (q == lu3Var) {
                    }
                }
                return Unit.a;
            }
        }
        ra2Var = new ra2(this, sq3Var);
        Object obj2 = ra2Var.s;
        lu3Var = lu3.a;
        i = ra2Var.u;
        if (i != 0) {
        }
        while (this.flushBufferSize >= 1048576) {
            ra2Var2.r = va2Var;
            ra2Var2.u = 1;
            lj2 lj2Var22 = new lj2(1, z9a.b(ra2Var2));
            lj2Var22.t();
            oa2 oa2Var2 = new oa2(lj2Var22);
            pa2Var = (pa2) va2Var.suspensionSlot;
            z = pa2Var instanceof ja2;
            if (z) {
            }
            if (!(pa2Var instanceof oa2)) {
            }
            if (this.flushBufferSize >= 1048576) {
            }
            pa2Var2 = (pa2) va2Var2.suspensionSlot;
            if (pa2Var2 instanceof oa2) {
            }
            lj2Var = lj2Var22;
            va2Var = va2Var2;
            q = lj2Var.q();
            lu3 lu3Var22222 = lu3.a;
            if (q == lu3Var) {
            }
        }
        return Unit.a;
    }

    @Override // defpackage.hc2
    public final w52 d() {
        Throwable a;
        if (this._closedCause == null) {
            return this.e;
        }
        gz2 gz2Var = (gz2) this._closedCause;
        if (gz2Var == null || (a = gz2Var.a(ua2.b)) == null) {
            throw new qz2(null, null);
        }
        throw a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:26|27))(3:28|29|(1:31))|11|12|(2:13|(3:22|23|24)(2:15|(3:18|19|20)(1:17)))))|33|6|7|(0)(0)|11|12|(3:13|(0)(0)|17)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        r11 = defpackage.w2g.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.hc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rq3 rq3Var) {
        sa2 sa2Var;
        int i;
        gz2 gz2Var;
        Unsafe unsafe;
        long j;
        va2 va2Var;
        if (rq3Var instanceof sa2) {
            sa2Var = (sa2) rq3Var;
            int i2 = sa2Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa2Var.t = i2 - Integer.MIN_VALUE;
                Object obj = sa2Var.r;
                lu3 lu3Var = lu3.a;
                i = sa2Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    sa2Var.t = 1;
                    if (c(sa2Var) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Unit unit = Unit.a;
                p2g p2gVar2 = w2g.b;
                gz2Var = c6o.b;
                while (true) {
                    unsafe = rh0.a;
                    j = f;
                    va2Var = this;
                    if (!unsafe.compareAndSwapObject(va2Var, j, (Object) null, gz2Var)) {
                        va2Var.i(null);
                        return Unit.a;
                    }
                    if (unsafe.getObjectVolatile(va2Var, j) != null) {
                        return Unit.a;
                    }
                    this = va2Var;
                }
            }
        }
        sa2Var = new sa2(this, rq3Var);
        Object obj2 = sa2Var.r;
        lu3 lu3Var2 = lu3.a;
        i = sa2Var.t;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        p2g p2gVar22 = w2g.b;
        gz2Var = c6o.b;
        while (true) {
            unsafe = rh0.a;
            j = f;
            va2Var = this;
            if (!unsafe.compareAndSwapObject(va2Var, j, (Object) null, gz2Var)) {
            }
            this = va2Var;
        }
    }

    @Override // defpackage.db2
    public final w52 f() {
        Throwable a;
        gz2 gz2Var = (gz2) this._closedCause;
        if (gz2Var != null && (a = gz2Var.a(ta2.b)) != null) {
            throw a;
        }
        if (this.d.w()) {
            k();
        }
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x012d -> B:10:0x0130). Please report as a decompilation issue!!! */
    @Override // defpackage.db2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        qa2 qa2Var;
        int i2;
        va2 va2Var;
        int i3;
        qa2 qa2Var2;
        long j;
        ma2 ma2Var;
        boolean z;
        pa2 pa2Var;
        lj2 lj2Var;
        Object q;
        la2 la2Var = la2.b;
        if (sq3Var instanceof qa2) {
            qa2Var = (qa2) sq3Var;
            int i4 = qa2Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qa2Var.v = i4 - Integer.MIN_VALUE;
                Object obj = qa2Var.t;
                lu3 lu3Var = lu3.a;
                i2 = qa2Var.v;
                Object obj2 = null;
                int i5 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    Throwable b = b();
                    if (b != null) {
                        throw b;
                    }
                    if (this.d.c >= i) {
                        return Boolean.TRUE;
                    }
                    va2Var = this;
                    i3 = i;
                    qa2Var2 = qa2Var;
                    j = i3;
                    if (this.flushBufferSize + this.d.c < j) {
                    }
                    if (this.d.c < 1048576) {
                    }
                    return Boolean.valueOf(this.d.c < j);
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = qa2Var.r;
                va2 va2Var2 = qa2Var.s;
                y6a.M(obj);
                qa2Var2 = qa2Var;
                i3 = i6;
                va2Var = va2Var2;
                Object obj3 = null;
                obj2 = obj3;
                i5 = 1;
                j = i3;
                if (this.flushBufferSize + this.d.c < j || this._closedCause != null) {
                    if (this.d.c < 1048576) {
                        k();
                    }
                    return Boolean.valueOf(this.d.c < j);
                }
                qa2Var2.s = va2Var;
                qa2Var2.r = i3;
                qa2Var2.v = i5;
                lj2 lj2Var2 = new lj2(i5, z9a.b(qa2Var2));
                lj2Var2.t();
                ma2 ma2Var2 = new ma2(lj2Var2);
                pa2 pa2Var2 = (pa2) va2Var.suspensionSlot;
                boolean z2 = pa2Var2 instanceof ja2;
                if (!z2) {
                    boolean z3 = z2;
                    while (true) {
                        Unsafe unsafe = rh0.a;
                        boolean z4 = z3;
                        long j2 = g;
                        ma2 ma2Var3 = ma2Var2;
                        z = z4;
                        pa2 pa2Var3 = pa2Var2;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(va2Var, j2, pa2Var3, ma2Var3);
                        obj3 = obj2;
                        pa2Var = pa2Var3;
                        ma2Var = ma2Var3;
                        if (compareAndSwapObject) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(va2Var, j2) != pa2Var) {
                            ma2Var.b();
                            break;
                        }
                        obj2 = obj3;
                        pa2Var2 = pa2Var;
                        z3 = z;
                        ma2Var2 = ma2Var;
                    }
                    lj2Var = lj2Var2;
                    q = lj2Var.q();
                    lu3 lu3Var2 = lu3.a;
                    if (q == lu3Var) {
                        return lu3Var;
                    }
                    obj2 = obj3;
                    i5 = 1;
                    j = i3;
                    if (this.flushBufferSize + this.d.c < j) {
                    }
                    if (this.d.c < 1048576) {
                    }
                    return Boolean.valueOf(this.d.c < j);
                }
                ma2Var = ma2Var2;
                z = z2;
                pa2Var = pa2Var2;
                obj3 = obj2;
                if (pa2Var instanceof ma2) {
                    na2 na2Var = (na2) pa2Var;
                    na2Var.a(new kx2("read", na2Var.c()));
                } else if (pa2Var instanceof na2) {
                    ((na2) pa2Var).b();
                } else {
                    if (z) {
                        ma2Var.a(((ja2) pa2Var).b);
                        lj2Var = lj2Var2;
                        q = lj2Var.q();
                        lu3 lu3Var22 = lu3.a;
                        if (q == lu3Var) {
                        }
                        obj2 = obj3;
                        i5 = 1;
                        j = i3;
                        if (this.flushBufferSize + this.d.c < j) {
                        }
                        if (this.d.c < 1048576) {
                        }
                        return Boolean.valueOf(this.d.c < j);
                    }
                    if (!Intrinsics.c(pa2Var, la2Var)) {
                        zzl.b();
                        return obj3;
                    }
                }
                if (this.flushBufferSize + this.d.c >= j || this._closedCause != null) {
                    pa2 pa2Var4 = (pa2) va2Var.suspensionSlot;
                    if (pa2Var4 instanceof ma2) {
                        lj2 lj2Var3 = lj2Var2;
                        while (true) {
                            Unsafe unsafe2 = rh0.a;
                            long j3 = g;
                            lj2Var = lj2Var3;
                            if (unsafe2.compareAndSwapObject(va2Var, j3, pa2Var4, la2Var)) {
                                ((na2) pa2Var4).b();
                                break;
                            }
                            if (unsafe2.getObjectVolatile(va2Var, j3) != pa2Var4) {
                                break;
                            }
                            lj2Var3 = lj2Var;
                        }
                        q = lj2Var.q();
                        lu3 lu3Var222 = lu3.a;
                        if (q == lu3Var) {
                        }
                        obj2 = obj3;
                        i5 = 1;
                        j = i3;
                        if (this.flushBufferSize + this.d.c < j) {
                        }
                        if (this.d.c < 1048576) {
                        }
                        return Boolean.valueOf(this.d.c < j);
                    }
                }
                lj2Var = lj2Var2;
                q = lj2Var.q();
                lu3 lu3Var2222 = lu3.a;
                if (q == lu3Var) {
                }
                obj2 = obj3;
                i5 = 1;
                j = i3;
                if (this.flushBufferSize + this.d.c < j) {
                }
                if (this.d.c < 1048576) {
                }
                return Boolean.valueOf(this.d.c < j);
            }
        }
        qa2Var = new qa2(this, sq3Var);
        Object obj4 = qa2Var.t;
        lu3 lu3Var3 = lu3.a;
        i2 = qa2Var.v;
        Object obj22 = null;
        int i52 = 1;
        if (i2 != 0) {
        }
    }

    @Override // defpackage.db2
    public final boolean h() {
        if (b() == null) {
            return this._closedCause != null && this.flushBufferSize == 0 && this.d.w();
        }
        return true;
    }

    public final void i(Throwable th) {
        ja2 ja2Var;
        if (th != null) {
            ja2Var = new ja2(th);
        } else {
            pa2.a.getClass();
            ja2Var = ka2.b;
        }
        pa2 pa2Var = (pa2) rh0.a.getAndSetObject(this, g, ja2Var);
        if (pa2Var instanceof na2) {
            ((na2) pa2Var).a(th);
        }
    }

    public final void j() {
        if (this.e.w()) {
            return;
        }
        synchronized (this.c) {
            w52 w52Var = this.e;
            int i = (int) w52Var.c;
            this.b.i(w52Var);
            this.flushBufferSize += i;
            Unit unit = Unit.a;
        }
        pa2 pa2Var = (pa2) this.suspensionSlot;
        if (!(pa2Var instanceof ma2)) {
            return;
        }
        la2 la2Var = la2.b;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            va2 va2Var = this;
            if (unsafe.compareAndSwapObject(va2Var, j, pa2Var, la2Var)) {
                ((na2) pa2Var).b();
                return;
            } else if (unsafe.getObjectVolatile(va2Var, j) != pa2Var) {
                return;
            } else {
                this = va2Var;
            }
        }
    }

    public final void k() {
        synchronized (this.c) {
            this.b.j(this.d);
            this.flushBufferSize = 0;
            Unit unit = Unit.a;
        }
        pa2 pa2Var = (pa2) this.suspensionSlot;
        if (!(pa2Var instanceof oa2)) {
            return;
        }
        la2 la2Var = la2.b;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            va2 va2Var = this;
            if (unsafe.compareAndSwapObject(va2Var, j, pa2Var, la2Var)) {
                ((na2) pa2Var).b();
                return;
            } else if (unsafe.getObjectVolatile(va2Var, j) != pa2Var) {
                return;
            } else {
                this = va2Var;
            }
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
