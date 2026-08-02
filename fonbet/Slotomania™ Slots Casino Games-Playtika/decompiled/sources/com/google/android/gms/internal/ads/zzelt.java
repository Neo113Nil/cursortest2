package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzelt implements zzdnc {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfjt zzc;
    private final zzcki zzd;
    private final zzfkm zze;
    private final zzbph zzf;
    private final boolean zzg;
    private final zzekf zzh;
    private final zzdyz zzi;

    zzelt(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfjt zzfjtVar, zzcki zzckiVar, zzfkm zzfkmVar, boolean z, zzbph zzbphVar, zzekf zzekfVar, zzdyz zzdyzVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfjtVar;
        this.zzd = zzckiVar;
        this.zze = zzfkmVar;
        this.zzg = z;
        this.zzf = zzbphVar;
        this.zzh = zzekfVar;
        this.zzi = zzdyzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzdnc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        int i;
        zzcuk zzcukVar = (zzcuk) zzhbi.zzt(this.zzb);
        zzcki zzckiVar = this.zzd;
        zzckiVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = false;
        if (z3) {
            if (!this.zzf.zzd()) {
                z2 = false;
                z4 = true;
                float zze = !z4 ? this.zzf.zze() : 0.0f;
                zzfjt zzfjtVar = this.zzc;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze, -1, z, zzfjtVar.zzO, false);
                if (zzdcsVar != null) {
                    zzdcsVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                zzdmr zzj = zzcukVar.zzj();
                i = zzfjtVar.zzQ;
                if (i == -1) {
                    com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
                    if (zzxVar != null) {
                        int i2 = zzxVar.zza;
                        if (i2 == 1) {
                            i = 7;
                        } else if (i2 == 2) {
                            i = 6;
                        }
                    }
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
                VersionInfoParcel versionInfoParcel = this.zza;
                String str = zzfjtVar.zzB;
                zzfjy zzfjyVar = zzfjtVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzckiVar, i, versionInfoParcel, str, zzlVar, zzfjyVar.zzb, zzfjyVar.zza, this.zze.zzg, zzdcsVar, !zzfjtVar.zzb() ? this.zzh : null, zzckiVar.zzn()), true, this.zzi);
            }
            z4 = true;
        }
        z2 = z4;
        float zze2 = !z4 ? this.zzf.zze() : 0.0f;
        zzfjt zzfjtVar2 = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze2, -1, z, zzfjtVar2.zzO, false);
        if (zzdcsVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdmr zzj2 = zzcukVar.zzj();
        i = zzfjtVar2.zzQ;
        if (i == -1) {
        }
        VersionInfoParcel versionInfoParcel2 = this.zza;
        String str2 = zzfjtVar2.zzB;
        zzfjy zzfjyVar2 = zzfjtVar2.zzs;
        if (!zzfjtVar2.zzb()) {
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzckiVar, i, versionInfoParcel2, str2, zzlVar2, zzfjyVar2.zzb, zzfjyVar2.zza, this.zze.zzg, zzdcsVar, !zzfjtVar2.zzb() ? this.zzh : null, zzckiVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzc;
    }
}
