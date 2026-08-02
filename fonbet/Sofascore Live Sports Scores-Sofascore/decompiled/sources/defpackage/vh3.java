package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class vh3 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = rh0.a;
        a = unsafe.objectFieldOffset(vh3.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(vh3.class.getDeclaredField("_prev$volatile"));
    }

    public vh3(z0h z0hVar) {
        this._prev$volatile = z0hVar;
    }

    public final void b() {
        rh0.a.putObjectVolatile(this, b, (Object) null);
    }

    public final vh3 c() {
        Object objectVolatile = rh0.a.getObjectVolatile(this, a);
        if (objectVolatile == uh3.a) {
            return null;
        }
        return (vh3) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        vh3 vh3Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = rh0.a;
            long j = b;
            vh3 vh3Var2 = (vh3) unsafe2.getObjectVolatile(this, j);
            while (vh3Var2 != null && vh3Var2.d()) {
                vh3Var2 = (vh3) rh0.a.getObjectVolatile(vh3Var2, j);
            }
            vh3 c2 = c();
            c2.getClass();
            do {
                vh3Var = c2;
                if (!vh3Var.d()) {
                    break;
                } else {
                    c2 = vh3Var.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = rh0.a.getObjectVolatile(vh3Var, j);
                vh3 vh3Var3 = ((vh3) objectVolatile) == null ? null : vh3Var2;
                do {
                    unsafe = rh0.a;
                    if (unsafe.compareAndSwapObject(vh3Var, b, objectVolatile, vh3Var3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(vh3Var, j) == objectVolatile);
            }
            if (vh3Var2 != null) {
                unsafe.putObjectVolatile(vh3Var2, a, vh3Var);
            }
            if (!vh3Var.d() || vh3Var.c() == null) {
                if (vh3Var2 == null || !vh3Var2.d()) {
                    return;
                }
            }
        }
    }
}
