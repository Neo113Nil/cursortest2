package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzdb;
import com.google.android.gms.internal.wearable.zzdg;
import defpackage.a70;
import defpackage.d6o;
import defpackage.e3c;
import defpackage.fn0;
import defpackage.n9o;
import defpackage.s6o;
import defpackage.sw9;
import defpackage.vp2;
import defpackage.x5n;
import defpackage.yhk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzdg<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdb<MessageType, BuilderType>> extends zzbr<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzfj zzc = zzfj.f;

    public static zzdg j(Class cls) {
        Map map = zze;
        zzdg zzdgVar = (zzdg) map.get(cls);
        if (zzdgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdgVar = (zzdg) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzdgVar != null) {
            return zzdgVar;
        }
        try {
            zzdg zzdgVar2 = (zzdg) ((zzdg) n9o.a.allocateInstance(cls)).d(6, null);
            if (zzdgVar2 != null) {
                map.put(cls, zzdgVar2);
                return zzdgVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static void k(Class cls, zzdg zzdgVar) {
        zzdgVar.h();
        zze.put(cls, zzdgVar);
    }

    public static Object l(Method method, zzdg zzdgVar, Object... objArr) {
        try {
            return method.invoke(zzdgVar, objArr);
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

    public static final boolean m(zzdg zzdgVar, boolean z) {
        byte byteValue = ((Byte) zzdgVar.d(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = d6o.c.a(zzdgVar.getClass()).b(zzdgVar);
        if (z) {
            zzdgVar.d(2, true == b ? zzdgVar : null);
        }
        return b;
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final void a(zzcn zzcnVar) {
        s6o a = d6o.c.a(getClass());
        e3c e3cVar = zzcnVar.a;
        if (e3cVar == null) {
            e3cVar = new e3c(zzcnVar);
        }
        a.d(this, e3cVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzbr
    public final int b(s6o s6oVar) {
        if (e()) {
            int h = s6oVar.h(this);
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
        int h2 = s6oVar.h(this);
        if (h2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | h2;
            return h2;
        }
        a70.r(x5n.l(fn0.a(h2, 42), h2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final boolean c() {
        return m(this, true);
    }

    public abstract Object d(int i, zzdg zzdgVar);

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
        return d6o.c.a(getClass()).f(this, (zzdg) obj);
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final /* synthetic */ zzek f() {
        return (zzdb) d(5, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final /* synthetic */ zzdg g() {
        return (zzdg) d(6, null);
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (e()) {
            return d6o.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = d6o.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final void i() {
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

    @Override // com.google.android.gms.internal.wearable.zzel
    public final zzes zzN() {
        return (zzes) d(7, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final int zzT() {
        if (e()) {
            int h = d6o.c.a(getClass()).h(this);
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
        int h2 = d6o.c.a(getClass()).h(this);
        if (h2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | h2;
            return h2;
        }
        a70.r(x5n.l(fn0.a(h2, 42), h2, "serialized size must be non-negative, was "));
        return 0;
    }
}
