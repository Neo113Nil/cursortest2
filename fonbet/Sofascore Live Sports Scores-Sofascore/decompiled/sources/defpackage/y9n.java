package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class y9n extends k7n {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected fdn zzc = fdn.f;

    public static y9n f(Class cls) {
        Map map = zzd;
        y9n y9nVar = (y9n) map.get(cls);
        if (y9nVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                y9nVar = (y9n) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (y9nVar != null) {
            return y9nVar;
        }
        try {
            y9n y9nVar2 = (y9n) ((y9n) qdn.a.allocateInstance(cls)).r(6);
            if (y9nVar2 != null) {
                map.put(cls, y9nVar2);
                return y9nVar2;
            }
            zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static void g(Class cls, y9n y9nVar) {
        y9nVar.l();
        zzd.put(cls, y9nVar);
    }

    public static Object h(Method method, y9n y9nVar, Object... objArr) {
        try {
            return method.invoke(y9nVar, objArr);
        } catch (IllegalAccessException e) {
            vp2.e("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vp2.e("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static y9n i(y9n y9nVar, g8n g8nVar, z8n z8nVar) {
        m8n r = g8nVar.r();
        y9n m = y9nVar.m();
        try {
            pcn a = gcn.c.a(m.getClass());
            zz0 zz0Var = r.b;
            if (zz0Var == null) {
                zz0Var = new zz0(r);
            }
            a.i(m, zz0Var, z8nVar);
            a.c(m);
            r.h();
            q(m);
            return m;
        } catch (cdn e) {
            hbo.m(e.getMessage());
            return null;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof lan) {
                throw ((lan) e2.getCause());
            }
            throw e2;
        } catch (lan e3) {
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof lan) {
                throw ((lan) e4.getCause());
            }
            throw new lan(e4.getMessage(), e4);
        }
    }

    public static y9n j(y9n y9nVar, byte[] bArr, z8n z8nVar) {
        int length = bArr.length;
        if (length != 0) {
            y9n m = y9nVar.m();
            try {
                pcn a = gcn.c.a(m.getClass());
                a.f(m, bArr, 0, length, new p7n(z8nVar));
                a.c(m);
                y9nVar = m;
            } catch (cdn e) {
                hbo.m(e.getMessage());
                return null;
            } catch (lan e2) {
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof lan) {
                    throw ((lan) e3.getCause());
                }
                throw new lan(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        q(y9nVar);
        return y9nVar;
    }

    public static final boolean p(y9n y9nVar, boolean z) {
        byte byteValue = ((Byte) y9nVar.r(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = gcn.c.a(y9nVar.getClass()).b(y9nVar);
        if (z) {
            y9nVar.r(2);
        }
        return b;
    }

    public static void q(y9n y9nVar) {
        if (y9nVar == null || p(y9nVar, true)) {
            return;
        }
        hbo.m(new cdn().getMessage());
    }

    @Override // defpackage.k7n
    public final int c(pcn pcnVar) {
        if (k()) {
            int e = pcnVar.e(this);
            if (e >= 0) {
                return e;
            }
            a70.r(x5n.l(fn0.a(e, 42), e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = pcnVar.e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        a70.r(x5n.l(fn0.a(e2, 42), e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d(r8n r8nVar) {
        pcn a = gcn.c.a(getClass());
        b1l b1lVar = r8nVar.a;
        if (b1lVar == null) {
            b1lVar = new b1l(r8nVar);
        }
        a.d(this, b1lVar);
    }

    public final int e() {
        if (k()) {
            int e = gcn.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            a70.r(x5n.l(fn0.a(e, 42), e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = gcn.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        a70.r(x5n.l(fn0.a(e2, 42), e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return gcn.c.a(getClass()).h(this, (y9n) obj);
    }

    public final int hashCode() {
        if (k()) {
            return gcn.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = gcn.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final y9n m() {
        return (y9n) r(4);
    }

    public final r9n n() {
        return (r9n) r(5);
    }

    public final void o() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public abstract Object r(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ubn.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ubn.b(this, sb, 0);
        return sb.toString();
    }
}
