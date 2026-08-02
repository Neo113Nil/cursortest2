package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdln extends zzcxh {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjq zze;
    private final zzdnc zzf;
    private final zzcyc zzg;
    private final zzfxa zzh;
    private final zzdcs zzi;
    private final zzcew zzj;
    private final zzdyz zzk;
    private boolean zzl;

    zzdln(zzcxg zzcxgVar, Context context, @Nullable zzcki zzckiVar, zzdjq zzdjqVar, zzdnc zzdncVar, zzcyc zzcycVar, zzfxa zzfxaVar, zzdcs zzdcsVar, zzcew zzcewVar, zzdyz zzdyzVar) {
        super(zzcxgVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzckiVar);
        this.zze = zzdjqVar;
        this.zzf = zzdncVar;
        this.zzg = zzcycVar;
        this.zzh = zzfxaVar;
        this.zzi = zzdcsVar;
        this.zzj = zzcewVar;
        this.zzk = zzdyzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcki zzckiVar = (zzcki) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhG)).booleanValue()) {
                if (!this.zzl && zzckiVar != null) {
                    zzhbs zzhbsVar = zzcff.zzf;
                    Objects.requireNonNull(zzckiVar);
                    zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcki.this.destroy();
                        }
                    });
                }
            } else if (zzckiVar != null) {
                zzckiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        zzfjt zzC;
        zzdjq zzdjqVar = this.zze;
        zzdjqVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnc zzdncVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdncVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpa)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbo)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        zzcki zzckiVar = (zzcki) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue() || zzckiVar == null || (zzC = zzckiVar.zzC()) == null || !zzC.zzar || zzC.zzas == this.zzj.zzj()) {
            if (this.zzl) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                this.zzi.zzc(zzflo.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzl) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    zzdncVar.zza(z, activity2, this.zzi);
                    zzdjqVar.zzb();
                    this.zzl = true;
                    return true;
                } catch (zzdnb e) {
                    this.zzi.zzd(e);
                }
            }
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
            this.zzi.zzc(zzflo.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
