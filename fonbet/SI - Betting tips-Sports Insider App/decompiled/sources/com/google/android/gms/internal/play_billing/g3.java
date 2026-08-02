package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g3 extends t2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected h4 zzc;
    private int zzd;

    public g3() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = h4.f5474f;
    }

    public static g3 h(Class cls) {
        Map map = zzb;
        g3 g3Var = (g3) map.get(cls);
        if (g3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g3Var = (g3) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (g3Var != null) {
            return g3Var;
        }
        g3 g3Var2 = (g3) ((g3) m4.g(cls)).d(6);
        if (g3Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g3Var2);
        return g3Var2;
    }

    public static Object i(Method method, g3 g3Var, Object... objArr) {
        try {
            return method.invoke(g3Var, objArr);
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

    public static void k(Class cls, g3 g3Var) {
        g3Var.j();
        zzb.put(cls, g3Var);
    }

    public static final boolean m(g3 g3Var, boolean z5) {
        byte byteValue = ((Byte) g3Var.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b10 = a4.f5397c.a(g3Var.getClass()).b(g3Var);
        if (z5) {
            g3Var.d(2);
        }
        return b10;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final int a(d4 d4Var) {
        if (c()) {
            int d10 = d4Var.d(this);
            if (d10 >= 0) {
                return d10;
            }
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(d10, "serialized size must be non-negative, was "));
        }
        int i5 = this.zzd & Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int d11 = d4Var.d(this);
        if (d11 < 0) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(d11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | d11;
        return d11;
    }

    public final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object d(int i5);

    public final int e() {
        if (c()) {
            int d10 = a4.f5397c.a(getClass()).d(this);
            if (d10 >= 0) {
                return d10;
            }
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(d10, "serialized size must be non-negative, was "));
        }
        int i5 = this.zzd & Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int d11 = a4.f5397c.a(getClass()).d(this);
        if (d11 < 0) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(d11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | d11;
        return d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a4.f5397c.a(getClass()).g(this, (g3) obj);
    }

    public final f3 f() {
        return (f3) d(5);
    }

    public final f3 g() {
        f3 f3Var = (f3) d(5);
        if (!f3Var.f5449a.equals(this)) {
            if (!f3Var.f5450b.c()) {
                g3 g3Var = (g3) f3Var.f5449a.d(4);
                a4.f5397c.a(g3Var.getClass()).e(g3Var, f3Var.f5450b);
                f3Var.f5450b = g3Var;
            }
            g3 g3Var2 = f3Var.f5450b;
            a4.f5397c.a(g3Var2.getClass()).e(g3Var2, this);
        }
        return f3Var;
    }

    public final int hashCode() {
        if (c()) {
            return a4.f5397c.a(getClass()).f(this);
        }
        int i5 = this.zza;
        if (i5 != 0) {
            return i5;
        }
        int f6 = a4.f5397c.a(getClass()).f(this);
        this.zza = f6;
        return f6;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = v3.f5609a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        v3.c(this, sb2, 0);
        return sb2.toString();
    }
}
