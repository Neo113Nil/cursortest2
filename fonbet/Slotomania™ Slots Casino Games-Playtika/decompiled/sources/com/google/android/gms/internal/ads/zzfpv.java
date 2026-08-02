package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfpv implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdwn zzj;
    private final List zzk;
    private final zzcmu zzl;
    private final zzcaz zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfpz zzg = zzfqc.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfpv(Context context, VersionInfoParcel versionInfoParcel, zzdwn zzdwnVar, zzeib zzeibVar, zzcaz zzcazVar, zzcmu zzcmuVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdwnVar;
        this.zzn = zzcazVar;
        this.zzl = zzcmuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkc)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = zzgvz.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbjx.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbjx.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzfpz zzfpzVar = this.zzg;
                        zzaN = ((zzfqc) zzfpzVar.zzbu()).zzaN();
                        zzfpzVar.zzc();
                    }
                    zzehy zzehyVar = new zzehy((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjW), 60000, new HashMap(), zzaN, CommonGatewayClient.HEADER_PROTOBUF, false);
                    zzehy zzehyVar2 = zzehyVar;
                    new zzeia(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(zzehyVar);
                } catch (Exception e) {
                    if ((e instanceof zzedr) && ((zzedr) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfpl zzfplVar) {
        zzcff.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfpv.this.zzc(zzfplVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfpl zzfplVar) {
        synchronized (zzd) {
            if (!this.zzm) {
                this.zzm = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjX)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzno)).booleanValue()) {
                        long j = intValue;
                        zzcff.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzcff.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue()) {
                        this.zzl.zza();
                    }
                }
            }
        }
        if (zza() && zzfplVar != null) {
            synchronized (zzc) {
                zzfpz zzfpzVar = this.zzg;
                if (zzfpzVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjY)).intValue()) {
                    return;
                }
                zzfpw zza2 = zzfpy.zza();
                zza2.zzv(zzfplVar.zzm());
                zza2.zza(zzfplVar.zzb());
                zza2.zzb(zzfplVar.zza());
                zza2.zzw(3);
                zza2.zzd(this.zzf.afmaVersion);
                zza2.zze(this.zzh);
                zza2.zzf(Build.VERSION.RELEASE);
                zza2.zzg(Build.VERSION.SDK_INT);
                zza2.zzx(zzfplVar.zzo());
                zza2.zzi(zzfplVar.zzc());
                zza2.zzj(this.zzi);
                zza2.zzy(zzfplVar.zzn());
                zza2.zzk(zzfplVar.zzd());
                zza2.zzl(zzfplVar.zze());
                zza2.zzm(zzfplVar.zzf());
                zza2.zzn(this.zzj.zzd(zzfplVar.zzf()));
                zza2.zzo(zzfplVar.zzg());
                zza2.zzs(zzfplVar.zzh());
                zza2.zzr(zzfplVar.zzk());
                zza2.zzp(zzfplVar.zzi());
                zza2.zzq(zzfplVar.zzj());
                zza2.zzc(zzfplVar.zzl());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkc)).booleanValue()) {
                    zza2.zzh(this.zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue()) {
                    zzcmu zzcmuVar = this.zzl;
                    zzihh zzd2 = zzcmuVar.zzd();
                    String zzc2 = zzcmuVar.zzc();
                    if (zzd2 != null) {
                        zza2.zzt(zzd2);
                    }
                    if (zzc2 != null) {
                        zza2.zzu(zzc2);
                    }
                }
                zzfqa zza3 = zzfqb.zza();
                zza3.zza(zza2);
                zzfpzVar.zzb(zza3);
            }
        }
    }
}
