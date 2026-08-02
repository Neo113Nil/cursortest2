package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e4 extends hkg {
    public static final long A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final Unsafe z;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new d4(0));
            }
            try {
                B = unsafe.objectFieldOffset(g4.class.getDeclaredField(a.q));
                A = unsafe.objectFieldOffset(g4.class.getDeclaredField("b"));
                C = unsafe.objectFieldOffset(g4.class.getDeclaredField("a"));
                D = unsafe.objectFieldOffset(f4.class.getDeclaredField("a"));
                E = unsafe.objectFieldOffset(f4.class.getDeclaredField("b"));
                z = unsafe;
            } catch (NoSuchFieldException e) {
                is8.h(e);
            }
        } catch (PrivilegedActionException e2) {
            vp2.e("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.hkg
    public final x3 M(g4 g4Var) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        do {
            x3Var = g4Var.b;
            if (x3Var2 == x3Var) {
                break;
            }
        } while (!w(g4Var, x3Var, x3Var2));
        return x3Var;
    }

    @Override // defpackage.hkg
    public final f4 N(g4 g4Var) {
        f4 f4Var;
        f4 f4Var2 = f4.c;
        do {
            f4Var = g4Var.c;
            if (f4Var2 == f4Var) {
                break;
            }
        } while (!y(g4Var, f4Var, f4Var2));
        return f4Var;
    }

    @Override // defpackage.hkg
    public final void m0(f4 f4Var, f4 f4Var2) {
        z.putObject(f4Var, E, f4Var2);
    }

    @Override // defpackage.hkg
    public final void n0(f4 f4Var, Thread thread) {
        z.putObject(f4Var, D, thread);
    }

    @Override // defpackage.hkg
    public final boolean w(g4 g4Var, x3 x3Var, x3 x3Var2) {
        while (true) {
            Unsafe unsafe = z;
            long j = A;
            g4 g4Var2 = g4Var;
            x3 x3Var3 = x3Var;
            x3 x3Var4 = x3Var2;
            if (unsafe.compareAndSwapObject(g4Var2, j, x3Var3, x3Var4)) {
                return true;
            }
            if (unsafe.getObject(g4Var2, j) != x3Var3) {
                return false;
            }
            g4Var = g4Var2;
            x3Var = x3Var3;
            x3Var2 = x3Var4;
        }
    }

    @Override // defpackage.hkg
    public final boolean x(g4 g4Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = z;
            long j = C;
            g4 g4Var2 = g4Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(g4Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(g4Var2, j) != obj3) {
                return false;
            }
            g4Var = g4Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // defpackage.hkg
    public final boolean y(g4 g4Var, f4 f4Var, f4 f4Var2) {
        while (true) {
            Unsafe unsafe = z;
            long j = B;
            g4 g4Var2 = g4Var;
            f4 f4Var3 = f4Var;
            f4 f4Var4 = f4Var2;
            if (unsafe.compareAndSwapObject(g4Var2, j, f4Var3, f4Var4)) {
                return true;
            }
            if (unsafe.getObject(g4Var2, j) != f4Var3) {
                return false;
            }
            g4Var = g4Var2;
            f4Var = f4Var3;
            f4Var2 = f4Var4;
        }
    }
}
