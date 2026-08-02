package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbhj;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdnh implements zzdcf, zzdjr {
    private final zzcdk zza;
    private final Context zzb;
    private final zzcdn zzc;
    private final View zzd;
    private String zze;
    private final zzbhj.zza.EnumC0126zza zzf;
    private final zzfjt zzg;

    public zzdnh(zzcdk zzcdkVar, Context context, zzcdn zzcdnVar, View view, zzbhj.zza.EnumC0126zza enumC0126zza, zzfjt zzfjtVar) {
        this.zza = zzcdkVar;
        this.zzb = context;
        this.zzc = zzcdnVar;
        this.zzd = view;
        this.zzf = enumC0126zza;
        this.zzg = zzfjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    @ParametersAreNonnullByDefault
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
        zzcdn zzcdnVar = this.zzc;
        Context context = this.zzb;
        if (zzcdnVar.zza(context) && this.zzg.zzaG) {
            try {
                zzcdnVar.zzo(context, zzcdnVar.zzj(context), this.zza.zzb(), zzcbdVar.zzb(), zzcbdVar.zzc());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
        zzbhj.zza.EnumC0126zza enumC0126zza = this.zzf;
        if (enumC0126zza != zzbhj.zza.EnumC0126zza.APP_OPEN && this.zzg.zzaG) {
            String zzf = this.zzc.zzf(this.zzb);
            this.zze = zzf;
            zzbhj.zza.EnumC0126zza enumC0126zza2 = zzbhj.zza.EnumC0126zza.REWARD_BASED_VIDEO_AD;
            String.valueOf(zzf);
            this.zze = String.valueOf(zzf).concat(enumC0126zza == enumC0126zza2 ? "/Rewarded" : "/Interstitial");
        }
    }
}
