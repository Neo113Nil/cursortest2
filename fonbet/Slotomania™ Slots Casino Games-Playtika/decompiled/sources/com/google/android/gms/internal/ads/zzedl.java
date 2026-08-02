package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzedl implements zzart {
    final /* synthetic */ zzedm zza;

    zzedl(zzedm zzedmVar) {
        Objects.requireNonNull(zzedmVar);
        this.zza = zzedmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzart
    public final void zza(int i) {
        zzaru zzd;
        try {
            zzfqf zza = zzfqg.zza();
            zza.zzh(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i == 0 && (zzd = this.zza.zzc().zzd()) != null) {
                zza.zzb(zzd.zzb());
                zza.zzc(zzd.zzc());
                zza.zzd(zzd.zzd());
                zza.zze(zzd.zze());
                zza.zzf(zzd.zzf());
                if (!TextUtils.isEmpty(zzd.zza())) {
                    zza.zza(zzd.zza());
                }
                if (!TextUtils.isEmpty(zzd.zzg())) {
                    zza.zzg(zzd.zzg());
                }
            }
            zzedm zzedmVar = this.zza;
            zzedmVar.zzc().zzc();
            zzdyz zzd2 = zzedmVar.zzd();
            String encodeToString = Base64.encodeToString(((zzfqg) zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfP)).booleanValue()) {
                zzdyy zza2 = zzd2.zza();
                zza2.zzc("action", "irda");
                zza2.zzc("irdd", encodeToString);
                zza2.zzf();
            }
            zzedmVar.zze().zzQ(true);
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfQ)).booleanValue()) {
                zzedm zzedmVar2 = this.zza;
                if (zzedmVar2.zzb == null) {
                    zzedmVar2.zzb = zzbzm.zzc(zzedmVar2.zzb());
                }
                zzedmVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzedm zzedmVar3 = this.zza;
            if (zzedmVar3.zza == null) {
                zzedmVar3.zza = zzbzm.zza(zzedmVar3.zzb());
            }
            zzedmVar3.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
