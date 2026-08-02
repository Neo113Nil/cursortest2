package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j2d extends f4h implements h2d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(j2d.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = rh0.a.objectFieldOffset(j2d.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public j2d() {
        super(1);
        this.owner$volatile = k2d.a;
    }

    public final boolean d() {
        return Math.max(rh0.a.getIntVolatile(this, f4h.f), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.i(kotlin.Unit.a, r3.b);
     */
    @Override // defpackage.h2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rq3 rq3Var) {
        if (g()) {
            return Unit.a;
        }
        lj2 o0 = k53.o0(z9a.b(rq3Var));
        try {
            i2d i2dVar = new i2d(this, o0);
            while (true) {
                int andDecrement = f4h.e.getAndDecrement(this);
                if (andDecrement <= this.a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (b(i2dVar)) {
                        break;
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

    @Override // defpackage.h2d
    public final void f(Object obj) {
        while (this.d()) {
            Unsafe unsafe = rh0.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            ih2 ih2Var = k2d.a;
            if (objectVolatile != ih2Var) {
                if (objectVolatile != obj && obj != null) {
                    i3c.k("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    j2d j2dVar = this;
                    if (rh0.a.compareAndSwapObject(j2dVar, j, objectVolatile, ih2Var)) {
                        j2dVar.c();
                        return;
                    } else {
                        if (rh0.a.getObjectVolatile(j2dVar, j2) != objectVolatile) {
                            this = j2dVar;
                            break;
                        }
                        this = j2dVar;
                    }
                }
            }
        }
        a70.r("This mutex is not locked");
    }

    public final boolean g() {
        j2d j2dVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j2 = f4h.f;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    long j3 = f4h.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j3);
                    int i2 = this.a;
                    if (intVolatile2 <= i2) {
                        j2dVar = this;
                        break;
                    }
                    j2d j2dVar2 = this;
                    j2dVar = j2dVar2;
                    if (unsafe2.compareAndSwapInt(j2dVar2, j3, intVolatile2, i2)) {
                        break;
                    }
                    this = j2dVar;
                }
            } else {
                j2dVar = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(j2dVar, j2, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(j2dVar, j, (Object) null);
                    return true;
                }
            }
            this = j2dVar;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(ml4.X(this));
        sb.append("[isLocked=");
        sb.append(d());
        sb.append(",owner=");
        return lnb.p(sb, rh0.a.getObjectVolatile(this, j), ']');
    }
}
