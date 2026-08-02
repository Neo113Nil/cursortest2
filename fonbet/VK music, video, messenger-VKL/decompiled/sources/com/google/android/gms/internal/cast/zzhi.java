package com.google.android.gms.internal.cast;

import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzhi implements zzhg {
    private static final zzhg zzb = zzhh.zza;
    private final zzhk zza = new zzhk();
    private volatile zzhg zzc;
    private Object zzd;

    public zzhi(zzhg zzhgVar) {
        this.zzc = zzhgVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zzb) {
            String valueOf = String.valueOf(this.zzd);
            obj = tdj.a(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return tdj.a(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // com.google.android.gms.internal.cast.zzhg
    public final Object zza() {
        zzhg zzhgVar = this.zzc;
        zzhg zzhgVar2 = zzb;
        if (zzhgVar != zzhgVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzhgVar2) {
                        Object zza = this.zzc.zza();
                        this.zzd = zza;
                        this.zzc = zzhgVar2;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
