package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import defpackage.nco;
import defpackage.omo;
import defpackage.sw9;
import defpackage.vp2;
import defpackage.yhk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.e;

    public static zzev a(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzevVar != null) {
            return zzevVar;
        }
        try {
            zzev zzevVar2 = (zzev) ((zzev) omo.a.allocateInstance(cls)).g(6);
            if (zzevVar2 != null) {
                map.put(cls, zzevVar2);
                return zzevVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static Object b(Method method, zzev zzevVar, Object... objArr) {
        try {
            return method.invoke(zzevVar, objArr);
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

    public static void d(zzhs zzhsVar) {
        zzhsVar.c();
        zzb.put(zzhs.class, zzhsVar);
    }

    public final void c() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void e() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return nco.c.a(getClass()).c(this, (zzev) obj);
    }

    public final boolean f() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object g(int i);

    public final int hashCode() {
        if (f()) {
            return nco.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = nco.c.a(getClass()).d(this);
        this.zza = d;
        return d;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = a.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        a.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzev zze() {
        return (zzev) g(6);
    }
}
