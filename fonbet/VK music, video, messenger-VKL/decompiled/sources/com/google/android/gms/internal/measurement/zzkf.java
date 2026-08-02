package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.lhg;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
public abstract class zzkf<MessageType extends zzkf<MessageType, BuilderType>, BuilderType extends zzkb<MessageType, BuilderType>> extends zzio<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzmp zzc = zzmp.zzc();

    private final int zza(zzlx zzlxVar) {
        return zzlxVar == null ? zzlu.zza().zzb(getClass()).zza(this) : zzlxVar.zza(this);
    }

    public static zzkk zzbB() {
        return zzkg.zzf();
    }

    public static zzkl zzbC() {
        return zzlb.zzf();
    }

    public static zzkl zzbD(zzkl zzklVar) {
        int size = zzklVar.size();
        return zzklVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzkm zzbE() {
        return zzlv.zze();
    }

    public static zzkm zzbF(zzkm zzkmVar) {
        int size = zzkmVar.size();
        return zzkmVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzbH(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbI(zzlm zzlmVar, String str, Object[] objArr) {
        return new zzlw(zzlmVar, str, objArr);
    }

    public static void zzbL(Class cls, zzkf zzkfVar) {
        zza.put(cls, zzkfVar);
        zzkfVar.zzbJ();
    }

    public static zzkf zzbz(Class cls) {
        Map map = zza;
        zzkf zzkfVar = (zzkf) map.get(cls);
        if (zzkfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkfVar = (zzkf) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkfVar != null) {
            return zzkfVar;
        }
        zzkf zzkfVar2 = (zzkf) ((zzkf) zzmy.zze(cls)).zzl(6, null, null);
        if (zzkfVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzkfVar2);
        return zzkfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlu.zza().zzb(getClass()).zzj(this, (zzkf) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzbO()) {
            return zzbv();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzbv = zzbv();
        this.zzb = zzbv;
        return zzbv;
    }

    public final String toString() {
        return zzlo.zza(this, super.toString());
    }

    public final zzkf zzbA() {
        return (zzkf) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbG() {
        return (zzkb) zzl(5, null, null);
    }

    public final void zzbJ() {
        zzlu.zza().zzb(getClass()).zzf(this);
        zzbK();
    }

    public final void zzbK() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzbM(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzbN(zzjm zzjmVar) throws IOException {
        zzlu.zza().zzb(getClass()).zzi(this, zzjn.zza(zzjmVar));
    }

    public final boolean zzbO() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final /* synthetic */ zzlm zzbS() {
        return (zzkf) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzbr(zzlx zzlxVar) {
        if (zzbO()) {
            int zza2 = zza(zzlxVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(lhg.a(zza2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza3 = zza(zzlxVar);
        if (zza3 < 0) {
            throw new IllegalStateException(lhg.a(zza3, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
        return zza3;
    }

    public final int zzbv() {
        return zzlu.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzbw() {
        if (zzbO()) {
            int zza2 = zza(null);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(lhg.a(zza2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza3 = zza(null);
        if (zza3 < 0) {
            throw new IllegalStateException(lhg.a(zza3, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
        return zza3;
    }

    public final zzkb zzbx() {
        return (zzkb) zzl(5, null, null);
    }

    public final zzkb zzby() {
        zzkb zzkbVar = (zzkb) zzl(5, null, null);
        zzkbVar.zzaA(this);
        return zzkbVar;
    }

    public abstract Object zzl(int i, Object obj, Object obj2);
}
