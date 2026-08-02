package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzya;
import com.google.android.gms.internal.cast.zzyd;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzyd<MessageType extends zzyd<MessageType, BuilderType>, BuilderType extends zzya<MessageType, BuilderType>> extends zzwz<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaae zzc = zzaae.zza();

    public static zzyd zzF(Class cls) {
        Map map = zzd;
        zzyd zzydVar = (zzyd) map.get(cls);
        if (zzydVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzydVar = (zzyd) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzydVar != null) {
            return zzydVar;
        }
        zzyd zzydVar2 = (zzyd) ((zzyd) zzaak.zzc(cls)).zzb(6, null, null);
        if (zzydVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzydVar2);
        return zzydVar2;
    }

    public static void zzG(Class cls, zzyd zzydVar) {
        zzydVar.zzw();
        zzd.put(cls, zzydVar);
    }

    public static Object zzH(zzzi zzziVar, String str, Object[] objArr) {
        return new zzzr(zzziVar, str, objArr);
    }

    public static Object zzI(Method method, Object obj, Object... objArr) {
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

    public static zzyj zzJ() {
        return zzye.zzd();
    }

    public static zzyk zzK() {
        return zzyx.zzd();
    }

    public static zzyi zzL() {
        return zzxy.zzd();
    }

    public static zzyl zzM() {
        return zzzq.zzd();
    }

    public static zzyl zzN(zzyl zzylVar) {
        int size = zzylVar.size();
        return zzylVar.zzf(size + size);
    }

    private final int zza(zzzs zzzsVar) {
        return zzzp.zza().zzb(getClass()).zze(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzyd zzydVar, boolean z) {
        byte byteValue = ((Byte) zzydVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzh = zzzp.zza().zzb(zzydVar.getClass()).zzh(zzydVar);
        if (z) {
            zzydVar.zzb(2, true != zzh ? null : zzydVar, null);
        }
        return zzh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzzp.zza().zzb(getClass()).zzb(this, (zzyd) obj);
    }

    public final int hashCode() {
        if (zzv()) {
            return zzz();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzz = zzz();
        this.zza = zzz;
        return zzz;
    }

    public final String toString() {
        return zzzk.zza(this, super.toString());
    }

    public final void zzA() {
        zzzp.zza().zzb(getClass()).zzg(this);
        zzw();
    }

    public final zzya zzB() {
        return (zzya) zzb(5, null, null);
    }

    public final void zzC(int i) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final void zzD(zzxp zzxpVar) throws IOException {
        zzzp.zza().zzb(getClass()).zzf(this, zzxq.zza(zzxpVar));
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final int zzE() {
        if (zzv()) {
            int zza = zza(null);
            if (zza >= 0) {
                return zza;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zza);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(null);
        if (zza2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(zza2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zza2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final /* synthetic */ zzzh zzO() {
        return (zzya) zzb(5, null, null);
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.cast.zzzj
    public final boolean zzr() {
        return zzc(this, true);
    }

    @Override // com.google.android.gms.internal.cast.zzwz
    public final int zzt(zzzs zzzsVar) {
        if (zzv()) {
            int zze = zzzsVar.zze(this);
            if (zze >= 0) {
                return zze;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(zze).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zze);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze2 = zzzsVar.zze(this);
        if (zze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zze2;
            return zze2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(zze2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zze2);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean zzv() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void zzw() {
        this.zzb &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.cast.zzzj
    public final /* synthetic */ zzzi zzx() {
        return (zzyd) zzb(6, null, null);
    }

    public final zzyd zzy() {
        return (zzyd) zzb(4, null, null);
    }

    public final int zzz() {
        return zzzp.zza().zzb(getClass()).zzc(this);
    }
}
