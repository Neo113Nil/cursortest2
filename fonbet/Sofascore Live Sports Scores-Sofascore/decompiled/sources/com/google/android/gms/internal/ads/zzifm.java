package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import defpackage.a70;
import defpackage.b1l;
import defpackage.hbo;
import defpackage.jqo;
import defpackage.me4;
import defpackage.nqo;
import defpackage.rqo;
import defpackage.sw9;
import defpackage.tg0;
import defpackage.vp2;
import defpackage.yhk;
import defpackage.zz0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzifm<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidr<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zzifm<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zziib zzt = zziib.f;

    public static final boolean A(zzifm zzifmVar, boolean z) {
        byte byteValue = ((Byte) zzifmVar.z(zzifl.a, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = jqo.c.a(zzifmVar.getClass()).b(zzifmVar);
        if (z) {
            zzifmVar.z(zzifl.b, true == b ? zzifmVar : null);
        }
        return b;
    }

    public static zzifm B(zzifm zzifmVar, byte[] bArr, int i, zziew zziewVar) {
        if (i == 0) {
            return zzifmVar;
        }
        zzifm t = zzifmVar.t();
        try {
            nqo a = jqo.c.a(t.getClass());
            a.d(t, bArr, 0, i, new tg0(zziewVar));
            a.c(t);
            return t;
        } catch (zzige e) {
            if (e.a) {
                throw new zzige(e.getMessage(), e);
            }
            throw e;
        } catch (zzihz e2) {
            hbo.i(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzige) {
                throw ((zzige) e3.getCause());
            }
            throw new zzige(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void C(zzifm zzifmVar) {
        if (zzifmVar == null || A(zzifmVar, true)) {
            return;
        }
        hbo.i(new zzihz().getMessage());
    }

    public static Object p(Method method, zzifm zzifmVar, Object... objArr) {
        try {
            return method.invoke(zzifmVar, objArr);
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

    public static zzifm q(zzifm zzifmVar, zziem zziemVar, zziew zziewVar) {
        zzifm t = zzifmVar.t();
        try {
            nqo a = jqo.c.a(t.getClass());
            zz0 zz0Var = zziemVar.c;
            if (zz0Var == null) {
                zz0Var = new zz0(zziemVar);
            }
            a.e(t, zz0Var, zziewVar);
            a.c(t);
            return t;
        } catch (zzige e) {
            if (e.a) {
                throw new zzige(e.getMessage(), e);
            }
            throw e;
        } catch (zzihz e2) {
            hbo.i(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzige) {
                throw ((zzige) e3.getCause());
            }
            throw new zzige(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzige) {
                throw ((zzige) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzifm r(zzifm zzifmVar, zziei zzieiVar, zziew zziewVar) {
        zziem x = zzieiVar.x();
        zzifm q = q(zzifmVar, x, zziewVar);
        x.k(0);
        C(q);
        return q;
    }

    public static zzifm s(zzifm zzifmVar, byte[] bArr, zziew zziewVar) {
        zzifm B = B(zzifmVar, bArr, bArr.length, zziewVar);
        C(B);
        return B;
    }

    public static zzifm x(Class cls) {
        Map<Class<?>, zzifm<?, ?>> map = zzd;
        zzifm<?, ?> zzifmVar = map.get(cls);
        if (zzifmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzifmVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzifmVar != null) {
            return zzifmVar;
        }
        try {
            zzifm<?, ?> zzifmVar2 = (zzifm) ((zzifm) rqo.a.allocateInstance(cls)).z(zzifl.f, null);
            if (zzifmVar2 != null) {
                map.put(cls, zzifmVar2);
                return zzifmVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static void y(Class cls, zzifm zzifmVar) {
        zzifmVar.o();
        zzd.put(cls, zzifmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean a() {
        return A(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void c(zzier zzierVar) {
        nqo a = jqo.c.a(getClass());
        b1l b1lVar = zzierVar.a;
        if (b1lVar == null) {
            b1lVar = new b1l(zzierVar);
        }
        a.f(this, b1lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return jqo.c.a(getClass()).g(this, (zzifm) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final int f() {
        return k(null);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final zzifm g() {
        return (zzifm) z(zzifl.f, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public final int h() {
        return this.zzc & Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (n()) {
            return jqo.c.a(getClass()).i(this);
        }
        int i = this.zzq;
        if (i != 0) {
            return i;
        }
        int i2 = jqo.c.a(getClass()).i(this);
        this.zzq = i2;
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final zzigv i() {
        return (zzifg) z(zzifl.e, null);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final zzihe j() {
        return (zzihe) z(zzifl.g, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public final int k(nqo nqoVar) {
        int h;
        int h2;
        if (n()) {
            if (nqoVar == null) {
                h2 = jqo.c.a(getClass()).h(this);
            } else {
                h2 = nqoVar.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            a70.r(me4.g(h2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(h2).length() + 42)));
            return 0;
        }
        if (h() != Integer.MAX_VALUE) {
            return h();
        }
        if (nqoVar == null) {
            h = jqo.c.a(getClass()).h(this);
        } else {
            h = nqoVar.h(this);
        }
        m(h);
        return h;
    }

    public final void m(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
        } else {
            a70.r(me4.g(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
    }

    public final boolean n() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final zzifm t() {
        return (zzifm) z(zzifl.d, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = u.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        u.b(this, sb, 0);
        return sb.toString();
    }

    public final void u() {
        jqo.c.a(getClass()).c(this);
        o();
    }

    public final zzifg v() {
        return (zzifg) z(zzifl.e, null);
    }

    public final zzifg w() {
        zzifg zzifgVar = (zzifg) z(zzifl.e, null);
        zzifgVar.p(this);
        return zzifgVar;
    }

    public abstract Object z(zzifl zziflVar, zzifm zzifmVar);
}
