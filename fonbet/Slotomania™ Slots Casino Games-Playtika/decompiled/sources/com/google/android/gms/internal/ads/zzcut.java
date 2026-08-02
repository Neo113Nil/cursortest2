package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcut extends zzcxh {
    private final zzcki zzc;
    private final int zzd;
    private final Context zze;
    private final zzcuh zzf;
    private final zzdnc zzg;
    private final zzdjq zzh;
    private final zzdcs zzi;
    private final boolean zzj;
    private final zzcew zzk;
    private final zzdyz zzl;
    private boolean zzm;

    zzcut(zzcxg zzcxgVar, Context context, zzcki zzckiVar, int i, zzcuh zzcuhVar, zzdnc zzdncVar, zzdjq zzdjqVar, zzdcs zzdcsVar, zzcew zzcewVar, zzdyz zzdyzVar) {
        super(zzcxgVar);
        this.zzm = false;
        this.zzc = zzckiVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcuhVar;
        this.zzg = zzdncVar;
        this.zzh = zzdjqVar;
        this.zzi = zzdcsVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgv)).booleanValue();
        this.zzk = zzcewVar;
        this.zzl = zzdyzVar;
    }

    public final void zza(zzbfr zzbfrVar) {
        zzcki zzckiVar = this.zzc;
        if (zzckiVar != null) {
            zzckiVar.zzay(zzbfrVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    public final void zzb(Activity activity, zzbge zzbgeVar, boolean z) throws RemoteException {
        zzcki zzckiVar;
        zzfjt zzC;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z2 = this.zzj;
        if (z2) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnc zzdncVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdncVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpa)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(activity2, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(activity2)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbo)).booleanValue()) {
                        new zzfxa(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue() && (zzckiVar = this.zzc) != null && (zzC = zzckiVar.zzC()) != null && zzC.zzar && zzC.zzas != this.zzk.zzj()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzflo.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzflo.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdncVar.zza(z, activity2, this.zzi);
            if (z2) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdnb e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzd() {
        super.zzd();
        zzcki zzckiVar = this.zzc;
        if (zzckiVar != null) {
            zzckiVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
