package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzfn<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfl<V> zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzf;
    private volatile V zzg;

    public final V zza(V v) {
        List<zzfn> list;
        synchronized (this.zze) {
        }
        if (v != null) {
            return v;
        }
        if (zzfk.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzad.zza()) {
                return this.zzg == null ? this.zzd : this.zzg;
            }
            try {
                list = zzbh.zzdf;
                for (zzfn zzfnVar : list) {
                    if (zzad.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        zzfl<V> zzflVar = zzfnVar.zzc;
                        if (zzflVar != null) {
                            v2 = zzflVar.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (zza) {
                        zzfnVar.zzg = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzfl<V> zzflVar2 = this.zzc;
            if (zzflVar2 == null) {
                return this.zzd;
            }
            try {
                return zzflVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    private zzfn(String str, V v, V v2, zzfl<V> zzflVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v;
        this.zzc = zzflVar;
    }
}
