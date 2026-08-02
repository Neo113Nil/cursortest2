package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import defpackage.a70;
import defpackage.ewm;
import defpackage.fn0;
import defpackage.hbo;
import defpackage.jdn;
import defpackage.men;
import defpackage.odn;
import defpackage.sw9;
import defpackage.tg0;
import defpackage.vp2;
import defpackage.x5n;
import defpackage.yhk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzadu<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaga zzc = zzaga.f;

    public static zzadu j(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) {
        int length = bArr.length;
        if (length != 0) {
            zzadu n = zzaduVar.n();
            try {
                odn a = jdn.c.a(n.getClass());
                a.e(n, bArr, 0, length, new tg0(zzadfVar));
                a.c(n);
                zzaduVar = n;
            } catch (zzaeh e) {
                if (e.a) {
                    throw new zzaeh(e.getMessage(), e);
                }
                throw e;
            } catch (zzafy e2) {
                throw e2.d();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e3.getCause());
                }
                throw new zzaeh(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        w(zzaduVar);
        return zzaduVar;
    }

    public static zzadu s(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaduVar != null) {
            return zzaduVar;
        }
        try {
            zzadu zzaduVar2 = (zzadu) ((zzadu) men.a.allocateInstance(cls)).x(6);
            if (zzaduVar2 != null) {
                map.put(cls, zzaduVar2);
                return zzaduVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static void t(Class cls, zzadu zzaduVar) {
        zzaduVar.l();
        zze.put(cls, zzaduVar);
    }

    public static Object u(Method method, zzadu zzaduVar, Object... objArr) {
        try {
            return method.invoke(zzaduVar, objArr);
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

    public static final boolean v(zzadu zzaduVar, boolean z) {
        byte byteValue = ((Byte) zzaduVar.x(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = jdn.c.a(zzaduVar.getClass()).b(zzaduVar);
        if (z) {
            zzaduVar.x(2);
        }
        return b;
    }

    public static void w(zzadu zzaduVar) {
        if (zzaduVar != null && !v(zzaduVar, true)) {
            throw new zzafy().d();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final /* synthetic */ zzadu a() {
        return (zzadu) x(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final /* synthetic */ zzafb b() {
        return (zzadp) x(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final boolean c() {
        return v(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final int e() {
        if (k()) {
            int h = jdn.c.a(getClass()).h(this);
            if (h >= 0) {
                return h;
            }
            a70.r(x5n.l(fn0.a(h, 42), h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int h2 = jdn.c.a(getClass()).h(this);
        if (h2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | h2;
            return h2;
        }
        a70.r(x5n.l(fn0.a(h2, 42), h2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return jdn.c.a(getClass()).i(this, (zzadu) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void f(zzada zzadaVar) {
        odn a = jdn.c.a(getClass());
        ewm ewmVar = zzadaVar.a;
        if (ewmVar == null) {
            ewmVar = new ewm(zzadaVar);
        }
        a.d(this, ewmVar);
    }

    public final int hashCode() {
        if (k()) {
            return jdn.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = jdn.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    public final int i(odn odnVar) {
        if (k()) {
            int h = odnVar.h(this);
            if (h >= 0) {
                return h;
            }
            a70.r(x5n.l(fn0.a(h, 42), h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int h2 = odnVar.h(this);
        if (h2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | h2;
            return h2;
        }
        a70.r(x5n.l(fn0.a(h2, 42), h2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final zzafj m() {
        return (zzafj) x(7);
    }

    public final zzadu n() {
        return (zzadu) x(4);
    }

    public final void o() {
        jdn.c.a(getClass()).c(this);
        l();
    }

    public final zzadp p() {
        return (zzadp) x(5);
    }

    public final zzadp q() {
        zzadp zzadpVar = (zzadp) x(5);
        zzadpVar.n(this);
        return zzadpVar;
    }

    public final void r() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = a.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        a.b(this, sb, 0);
        return sb.toString();
    }

    public abstract Object x(int i);
}
