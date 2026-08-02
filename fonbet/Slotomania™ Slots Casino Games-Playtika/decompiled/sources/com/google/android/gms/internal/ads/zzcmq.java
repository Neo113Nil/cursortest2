package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcmq {
    private final zzcmh zza;
    private final zzdyz zzb;

    zzcmq(zzcmh zzcmhVar, zzdyz zzdyzVar) {
        this.zza = zzcmhVar;
        this.zzb = zzdyzVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpq)).booleanValue()) {
            Executor executor = zzcff.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzps)).booleanValue()) {
                zzcmp zzcmpVar = new zzcmp(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpu)).intValue(), null);
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpt)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcmpVar);
            }
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmq.this.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpr)).booleanValue()) {
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            zzdyy zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpx)).booleanValue()) {
            zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmq.this.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcml(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ zzdyz zzd() {
        return this.zzb;
    }
}
