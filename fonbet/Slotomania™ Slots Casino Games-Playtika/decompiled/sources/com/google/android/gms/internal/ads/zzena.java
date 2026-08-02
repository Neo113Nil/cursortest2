package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzena implements zzdnc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfjt zzd;
    private final zzcki zze;
    private final zzfkm zzf;
    private final zzbph zzg;
    private final boolean zzh;
    private final zzekf zzi;
    private final zzdyz zzj;

    zzena(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfjt zzfjtVar, zzcki zzckiVar, zzfkm zzfkmVar, boolean z, zzbph zzbphVar, zzekf zzekfVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfjtVar;
        this.zze = zzckiVar;
        this.zzf = zzfkmVar;
        this.zzg = zzbphVar;
        this.zzh = z;
        this.zzi = zzekfVar;
        this.zzj = zzdyzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // com.google.android.gms.internal.ads.zzdnc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        zzdlo zzdloVar = (zzdlo) zzhbi.zzt(this.zzc);
        zzcki zzckiVar = this.zze;
        zzckiVar.zzag(true);
        boolean z3 = this.zzh;
        boolean z4 = false;
        boolean zzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        if (z3) {
            if (!this.zzg.zzd()) {
                z2 = false;
                z4 = true;
                float zze = !z4 ? this.zzg.zze() : 0.0f;
                zzfjt zzfjtVar = this.zzd;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfjtVar.zzO, false);
                if (zzdcsVar != null) {
                    zzdcsVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                zzdmr zzj = zzdloVar.zzj();
                int i = zzfjtVar.zzQ;
                VersionInfoParcel versionInfoParcel = this.zzb;
                String str = zzfjtVar.zzB;
                zzfjy zzfjyVar = zzfjtVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzckiVar, i, versionInfoParcel, str, zzlVar, zzfjyVar.zzb, zzfjyVar.zza, this.zzf.zzg, zzdcsVar, !zzfjtVar.zzb() ? this.zzi : null, zzckiVar.zzn()), true, this.zzj);
            }
            z4 = true;
        }
        z2 = z4;
        float zze2 = !z4 ? this.zzg.zze() : 0.0f;
        zzfjt zzfjtVar2 = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze2, -1, z, zzfjtVar2.zzO, false);
        if (zzdcsVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdmr zzj2 = zzdloVar.zzj();
        int i2 = zzfjtVar2.zzQ;
        VersionInfoParcel versionInfoParcel2 = this.zzb;
        String str2 = zzfjtVar2.zzB;
        zzfjy zzfjyVar2 = zzfjtVar2.zzs;
        if (!zzfjtVar2.zzb()) {
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzckiVar, i2, versionInfoParcel2, str2, zzlVar2, zzfjyVar2.zzb, zzfjyVar2.zza, this.zzf.zzg, zzdcsVar, !zzfjtVar2.zzb() ? this.zzi : null, zzckiVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzd;
    }
}
