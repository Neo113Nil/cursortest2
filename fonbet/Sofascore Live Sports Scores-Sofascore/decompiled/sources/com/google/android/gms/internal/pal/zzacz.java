package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzacv;
import com.google.android.gms.internal.pal.zzacz;
import defpackage.acn;
import defpackage.sdn;
import defpackage.sw9;
import defpackage.vp2;
import defpackage.yhk;
import defpackage.zzl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzacz<MessageType extends zzacz<MessageType, BuilderType>, BuilderType extends zzacv<MessageType, BuilderType>> extends zzabi<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzafj zzc = zzafj.f;
    protected int zzd = -1;

    public static Object d(Method method, zzacz zzaczVar, Object... objArr) {
        try {
            return method.invoke(zzaczVar, objArr);
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

    public static void e(Class cls, zzacz zzaczVar) {
        zzb.put(cls, zzaczVar);
    }

    public static zzacz h(Class cls) {
        Map map = zzb;
        zzacz zzaczVar = (zzacz) map.get(cls);
        if (zzaczVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaczVar = (zzacz) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaczVar != null) {
            return zzaczVar;
        }
        try {
            zzacz zzaczVar2 = (zzacz) ((zzacz) sdn.a.allocateInstance(cls)).i(6);
            if (zzaczVar2 != null) {
                map.put(cls, zzaczVar2);
                return zzaczVar2;
            }
            zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final int b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final void c(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return acn.c.a(getClass()).f(this, (zzacz) obj);
        }
        return false;
    }

    public final zzacv f() {
        return (zzacv) i(5);
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzacv g() {
        zzacv zzacvVar = (zzacv) i(5);
        zzacvVar.d(this);
        return zzacvVar;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = acn.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public abstract Object i(int i);

    @Override // com.google.android.gms.internal.pal.zzaef
    public final int k() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = acn.c.a(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaeg
    public final /* synthetic */ zzaef n() {
        return (zzacz) i(6);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        b.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzacv x() {
        return (zzacv) i(5);
    }
}
