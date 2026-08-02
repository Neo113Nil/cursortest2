package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbcy implements Callable {
    protected final zzbbl zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaxf zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbcy(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzbblVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaxfVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzbbl zzbblVar = this.zza;
            Method zzo = zzbblVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            zzbac zzh = zzbblVar.zzh();
            if (zzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzh.zza(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
