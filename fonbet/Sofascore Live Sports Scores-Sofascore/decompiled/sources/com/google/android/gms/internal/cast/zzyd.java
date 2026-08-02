package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzya;
import com.google.android.gms.internal.cast.zzyd;
import defpackage.a70;
import defpackage.bgp;
import defpackage.f5n;
import defpackage.fn0;
import defpackage.mxn;
import defpackage.sw9;
import defpackage.ufp;
import defpackage.vp2;
import defpackage.x5n;
import defpackage.yhk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzyd<MessageType extends zzyd<MessageType, BuilderType>, BuilderType extends zzya<MessageType, BuilderType>> extends zzwz<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaae zzc = zzaae.e;

    public static zzyd f(Class cls) {
        Map map = zzd;
        zzyd zzydVar = (zzyd) map.get(cls);
        if (zzydVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzydVar = (zzyd) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzydVar != null) {
            return zzydVar;
        }
        try {
            zzyd zzydVar2 = (zzyd) ((zzyd) f5n.a.allocateInstance(cls)).i(6, null);
            if (zzydVar2 != null) {
                map.put(cls, zzydVar2);
                return zzydVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static void g(Class cls, zzyd zzydVar) {
        zzydVar.l();
        zzd.put(cls, zzydVar);
    }

    public static Object h(Method method, zzyd zzydVar, Object... objArr) {
        try {
            return method.invoke(zzydVar, objArr);
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

    public static final boolean j(zzyd zzydVar, boolean z) {
        byte byteValue = ((Byte) zzydVar.i(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = ufp.c.a(zzydVar.getClass()).b(zzydVar);
        if (z) {
            zzydVar.i(2, true == b ? zzydVar : null);
        }
        return b;
    }

    @Override // com.google.android.gms.internal.cast.zzwz
    public final int a(bgp bgpVar) {
        if (k()) {
            int e = bgpVar.e(this);
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
        int e2 = bgpVar.e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        a70.r(x5n.l(fn0.a(e2, 42), e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void c() {
        ufp.c.a(getClass()).g(this);
        l();
    }

    public final zzya d() {
        return (zzya) i(5, null);
    }

    public final void e() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ufp.c.a(getClass()).c(this, (zzyd) obj);
    }

    public final int hashCode() {
        if (k()) {
            return ufp.c.a(getClass()).f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int f = ufp.c.a(getClass()).f(this);
        this.zza = f;
        return f;
    }

    public abstract Object i(int i, zzyd zzydVar);

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final /* synthetic */ zzya m() {
        return (zzya) i(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = c.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        c.b(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final void u(zzxp zzxpVar) {
        bgp a = ufp.c.a(getClass());
        mxn mxnVar = zzxpVar.a;
        if (mxnVar == null) {
            mxnVar = new mxn(zzxpVar);
        }
        a.d(this, mxnVar);
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final int zzE() {
        if (k()) {
            int e = ufp.c.a(getClass()).e(this);
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
        int e2 = ufp.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        a70.r(x5n.l(fn0.a(e2, 42), e2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzzj
    public final boolean zzr() {
        return j(this, true);
    }

    @Override // com.google.android.gms.internal.cast.zzzj
    public final /* synthetic */ zzyd zzx() {
        return (zzyd) i(6, null);
    }
}
