package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g5 extends q4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected l6 zzc;

    public g5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = l6.f5126f;
    }

    public static g5 l(Class cls) {
        Map map = zzd;
        g5 g5Var = (g5) map.get(cls);
        if (g5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g5Var = (g5) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (g5Var != null) {
            return g5Var;
        }
        g5 g5Var2 = (g5) ((g5) q6.e(cls)).o(6);
        if (g5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g5Var2);
        return g5Var2;
    }

    public static void m(Class cls, g5 g5Var) {
        g5Var.f();
        zzd.put(cls, g5Var);
    }

    public static Object n(Method method, g5 g5Var, Object... objArr) {
        try {
            return method.invoke(g5Var, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public final int b(h6 h6Var) {
        if (e()) {
            int d10 = h6Var.d(this);
            if (d10 >= 0) {
                return d10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(d10);
            throw new IllegalStateException(sb2.toString());
        }
        int i5 = this.zzb & Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int d11 = h6Var.d(this);
        if (d11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d11;
            return d11;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(d11);
        throw new IllegalStateException(sb3.toString());
    }

    public final void d(x4 x4Var) {
        h6 a7 = e6.f5030c.a(getClass());
        u5 u5Var = x4Var.f5355b;
        if (u5Var == null) {
            u5Var = new u5(x4Var);
        }
        a7.e(this, u5Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return e6.f5030c.a(getClass()).f(this, (g5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        e6.f5030c.a(getClass()).g(this);
        f();
    }

    public final f5 h() {
        return (f5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return e6.f5030c.a(getClass()).i(this);
        }
        int i5 = this.zza;
        if (i5 != 0) {
            return i5;
        }
        int i10 = e6.f5030c.a(getClass()).i(this);
        this.zza = i10;
        return i10;
    }

    public final f5 i() {
        f5 f5Var = (f5) o(5);
        f5Var.g(this);
        return f5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int d10 = e6.f5030c.a(getClass()).d(this);
            if (d10 >= 0) {
                return d10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(d10);
            throw new IllegalStateException(sb2.toString());
        }
        int i5 = this.zzb & Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int d11 = e6.f5030c.a(getClass()).d(this);
        if (d11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d11;
            return d11;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(d11);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object o(int i5);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = z5.f5379a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        z5.b(this, sb2, 0);
        return sb2.toString();
    }
}
