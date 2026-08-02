package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m1 extends d3 {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f5503b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5504c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5505d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5506e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5507f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f5508g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new l1());
        }
        try {
            f5505d = unsafe.objectFieldOffset(o1.class.getDeclaredField("c"));
            f5504c = unsafe.objectFieldOffset(o1.class.getDeclaredField("b"));
            f5506e = unsafe.objectFieldOffset(o1.class.getDeclaredField("a"));
            f5507f = unsafe.objectFieldOffset(n1.class.getDeclaredField("a"));
            f5508g = unsafe.objectFieldOffset(n1.class.getDeclaredField("b"));
            f5503b = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(o1 o1Var, g1 g1Var, g1 g1Var2) {
        return r1.a(f5503b, o1Var, f5504c, g1Var, g1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(o1 o1Var, Object obj, Object obj2) {
        return r1.a(f5503b, o1Var, f5506e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(o1 o1Var, n1 n1Var, n1 n1Var2) {
        return r1.a(f5503b, o1Var, f5505d, n1Var, n1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final g1 e(o1 o1Var) {
        g1 g1Var;
        g1 g1Var2 = g1.f5456d;
        do {
            g1Var = o1Var.f5533b;
            if (g1Var2 == g1Var) {
                break;
            }
        } while (!A(o1Var, g1Var, g1Var2));
        return g1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final n1 p(o1 o1Var) {
        n1 n1Var;
        n1 n1Var2 = n1.f5521c;
        do {
            n1Var = o1Var.f5534c;
            if (n1Var2 == n1Var) {
                break;
            }
        } while (!G(o1Var, n1Var, n1Var2));
        return n1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(n1 n1Var, n1 n1Var2) {
        f5503b.putObject(n1Var, f5508g, n1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(n1 n1Var, Thread thread) {
        f5503b.putObject(n1Var, f5507f, thread);
    }
}
