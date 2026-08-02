package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzepp implements zzdnc {
    private final Context zza;
    private final zzdvw zzb;
    private final zzfkm zzc;
    private final VersionInfoParcel zzd;
    private final zzfjt zze;
    private final ListenableFuture zzf;
    private final zzcki zzg;
    private final zzbph zzh;
    private final boolean zzi;
    private final zzekf zzj;
    private final zzdyu zzk;
    private final zzdyz zzl;

    zzepp(Context context, zzdvw zzdvwVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel, zzfjt zzfjtVar, ListenableFuture listenableFuture, zzcki zzckiVar, zzbph zzbphVar, boolean z, zzekf zzekfVar, zzdyu zzdyuVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = zzdvwVar;
        this.zzc = zzfkmVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfjtVar;
        this.zzf = listenableFuture;
        this.zzg = zzckiVar;
        this.zzh = zzbphVar;
        this.zzi = z;
        this.zzj = zzekfVar;
        this.zzk = zzdyuVar;
        this.zzl = zzdyzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzdnc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        zzdvb zzdvbVar = (zzdvb) zzhbi.zzt(this.zzf);
        try {
            zzfjt zzfjtVar = this.zze;
            final zzcki zzckiVar = this.zzg;
            if (zzckiVar.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzby)).booleanValue()) {
                    zzckiVar = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbpx.zzb(zzckiVar, zzdvbVar.zzk());
                    final zzdwa zzdwaVar = new zzdwa();
                    zzdvbVar.zzl().zzi(zzckiVar, true, this.zzi ? this.zzh : null, this.zzk);
                    zzckiVar.zzP().zzG(new zzcme(zzdwaVar, zzckiVar) { // from class: com.google.android.gms.internal.ads.zzepo
                        private final /* synthetic */ zzcki zza;

                        {
                            this.zza = zzckiVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcme
                        public final /* synthetic */ void zza(boolean z3, int i, String str, String str2) {
                            zzcki zzckiVar2 = this.zza;
                            zzckiVar2.zzJ();
                            zzckiVar2.zzP().zzq();
                        }
                    });
                    zzcmg zzP = zzckiVar.zzP();
                    Objects.requireNonNull(zzckiVar);
                    zzP.zzH(new zzcmf() { // from class: com.google.android.gms.internal.ads.zzepn
                        @Override // com.google.android.gms.internal.ads.zzcmf
                        public final /* synthetic */ void zza() {
                            zzcki.this.zzI();
                        }
                    });
                    zzfjy zzfjyVar = zzfjtVar.zzs;
                    zzckiVar.zzau(zzfjyVar.zzb, zzfjyVar.zza, null);
                }
            }
            zzcki zzckiVar2 = zzckiVar;
            zzckiVar2.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (z3) {
                if (!this.zzh.zzd()) {
                    z2 = false;
                    z4 = true;
                    float zze = !z4 ? this.zzh.zze() : 0.0f;
                    zzfjt zzfjtVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfjtVar2.zzO, zzfjtVar2.zzP);
                    if (zzdcsVar != null) {
                        zzdcsVar.zzb();
                    }
                    com.google.android.gms.ads.internal.zzt.zzb();
                    zzdmr zzj = zzdvbVar.zzj();
                    int i = zzfjtVar2.zzQ;
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = zzfjtVar2.zzB;
                    zzfjy zzfjyVar2 = zzfjtVar2.zzs;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzckiVar2, i, versionInfoParcel, str, zzlVar, zzfjyVar2.zzb, zzfjyVar2.zza, this.zzc.zzg, zzdcsVar, zzfjtVar2.zzb() ? this.zzj : null, zzckiVar2.zzn()), true, this.zzl);
                }
                z4 = true;
            }
            z2 = z4;
            float zze2 = !z4 ? this.zzh.zze() : 0.0f;
            zzfjt zzfjtVar22 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze2, -1, z, zzfjtVar22.zzO, zzfjtVar22.zzP);
            if (zzdcsVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdmr zzj2 = zzdvbVar.zzj();
            int i2 = zzfjtVar22.zzQ;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            String str2 = zzfjtVar22.zzB;
            zzfjy zzfjyVar22 = zzfjtVar22.zzs;
            if (zzfjtVar22.zzb()) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzckiVar2, i2, versionInfoParcel2, str2, zzlVar2, zzfjyVar22.zzb, zzfjyVar22.zza, this.zzc.zzg, zzdcsVar, zzfjtVar22.zzb() ? this.zzj : null, zzckiVar2.zzn()), true, this.zzl);
        } catch (zzckx e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zze;
    }
}
