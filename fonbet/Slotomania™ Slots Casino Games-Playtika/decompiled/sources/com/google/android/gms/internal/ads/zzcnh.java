package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcnh implements zzimi {
    private final zzcmz zza;

    private zzcnh(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnh zzc(zzcmz zzcmzVar) {
        return new zzcnh(zzcmzVar);
    }

    public static WeakReference zzd(zzcmz zzcmzVar) {
        WeakReference zzc = zzcmzVar.zzc();
        zzimq.zzb(zzc);
        return zzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
