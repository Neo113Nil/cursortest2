package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzut;
import com.google.android.gms.internal.gtm.zzuz;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public abstract class zzuz<MessageType extends zzuz<MessageType, BuilderType>, BuilderType extends zzut<MessageType, BuilderType>> extends zzsh<MessageType, BuilderType> {
    private static final Map<Object, zzuz<?, ?>> zza = new ConcurrentHashMap();
    protected zzxp zzc = zzxp.zzc();
    protected int zzd = -1;

    public static <ContainingType extends zzwk, Type> zzux<ContainingType, Type> zzaa(ContainingType containingtype, Type type, zzwk zzwkVar, zzvc zzvcVar, int i11, zzye zzyeVar, Class cls) {
        return new zzux<>(containingtype, type, zzwkVar, new zzuw(zzvcVar, i11, zzyeVar, false, false), cls);
    }

    static <T extends zzuz> T zzab(Class<T> cls) {
        Map<Object, zzuz<?, ?>> map = zza;
        zzuz<?, ?> zzuzVar = map.get(cls);
        if (zzuzVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzuzVar = map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzuzVar != null) {
            return zzuzVar;
        }
        zzuz<?, ?> zzuzVar2 = (zzuz) ((zzuz) zzxy.zze(cls)).zzb(6, null, null);
        if (zzuzVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzuzVar2);
        return zzuzVar2;
    }

    protected static <T extends zzuz<T, ?>> T zzac(T t2, InputStream inputStream, zzuj zzujVar) throws zzvk {
        zzth zzthVar = new zzth(inputStream, 4096, null);
        T t11 = (T) t2.zzb(4, null, null);
        try {
            zzwx zzb = zzwt.zza().zzb(t11.getClass());
            zzb.zzh(t11, zztk.zzp(zzthVar), zzujVar);
            zzb.zzf(t11);
            zzc(t11);
            return t11;
        } catch (zzvk e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzvk(e);
            }
            e.zzh(t11);
            throw e;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzvk) {
                throw ((zzvk) e12.getCause());
            }
            zzvk zzvkVar = new zzvk(e12);
            zzvkVar.zzh(t11);
            throw zzvkVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzvk) {
                throw ((zzvk) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends zzuz<T, ?>> T zzad(T t2, byte[] bArr, zzuj zzujVar) throws zzvk {
        T t11 = (T) zzae(t2, bArr, 0, bArr.length, zzujVar);
        zzc(t11);
        return t11;
    }

    static <T extends zzuz<T, ?>> T zzae(T t2, byte[] bArr, int i11, int i12, zzuj zzujVar) throws zzvk {
        T t11 = (T) t2.zzb(4, null, null);
        try {
            zzwx zzb = zzwt.zza().zzb(t11.getClass());
            zzb.zzi(t11, bArr, 0, i12, new zzsl(zzujVar));
            zzb.zzf(t11);
            if (t11.zzb == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (zzvk e11) {
            zzvk zzvkVar = e11;
            if (zzvkVar.zzl()) {
                zzvkVar = new zzvk(zzvkVar);
            }
            zzvkVar.zzh(t11);
            throw zzvkVar;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzvk) {
                throw ((zzvk) e12.getCause());
            }
            zzvk zzvkVar2 = new zzvk(e12);
            zzvkVar2.zzh(t11);
            throw zzvkVar2;
        } catch (IndexOutOfBoundsException unused) {
            zzvk zzj = zzvk.zzj();
            zzj.zzh(t11);
            throw zzj;
        }
    }

    protected static zzve zzaf() {
        return zzva.zzf();
    }

    protected static <E> zzvh<E> zzag() {
        return zzwu.zze();
    }

    protected static <E> zzvh<E> zzah(zzvh<E> zzvhVar) {
        int size = zzvhVar.size();
        return zzvhVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzai(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzaj(zzwk zzwkVar, String str, Object[] objArr) {
        return new zzwv(zzwkVar, str, objArr);
    }

    protected static <T extends zzuz> void zzak(Class<T> cls, T t2) {
        zza.put(cls, t2);
    }

    private static <T extends zzuz<T, ?>> T zzc(T t2) throws zzvk {
        if (t2 == null || t2.zzas()) {
            return t2;
        }
        zzvk zzvkVar = new zzvk(new zzxn(t2).getMessage());
        zzvkVar.zzh(t2);
        throw zzvkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzwt.zza().zzb(getClass()).zzj(this, (zzuz) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zzb;
        if (i11 != 0) {
            return i11;
        }
        int zzb = zzwt.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzwm.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzsh
    final int zzQ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzsh
    final void zzT(int i11) {
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzwk
    public final int zzX() {
        int i11 = this.zzd;
        if (i11 != -1) {
            return i11;
        }
        int zza2 = zzwt.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    protected final <MessageType extends zzuz<MessageType, BuilderType>, BuilderType extends zzut<MessageType, BuilderType>> BuilderType zzY() {
        return (BuilderType) zzb(5, null, null);
    }

    public final BuilderType zzZ() {
        BuilderType buildertype = (BuilderType) zzb(5, null, null);
        buildertype.zzz(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.gtm.zzwk
    public final /* bridge */ /* synthetic */ zzwj zzao() {
        return (zzut) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzwk
    public final /* bridge */ /* synthetic */ zzwj zzap() {
        zzut zzutVar = (zzut) zzb(5, null, null);
        zzutVar.zzz(this);
        return zzutVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzwk
    public final void zzaq(zzto zztoVar) throws IOException {
        zzwt.zza().zzb(getClass()).zzn(this, zztp.zza(zztoVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzwl
    public final /* bridge */ /* synthetic */ zzwk zzar() {
        return (zzuz) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzwl
    public final boolean zzas() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzwt.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    protected abstract Object zzb(int i11, Object obj, Object obj2);
}
