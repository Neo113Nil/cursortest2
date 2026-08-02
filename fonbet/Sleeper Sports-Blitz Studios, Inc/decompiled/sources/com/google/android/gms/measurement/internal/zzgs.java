package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzok;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzgs implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzbz zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzgt zzc;

    zzgs(zzgt zzgtVar, com.google.android.gms.internal.measurement.zzbz zzbzVar, ServiceConnection serviceConnection) {
        this.zza = zzbzVar;
        this.zzb = serviceConnection;
        this.zzc = zzgtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzgq zzgqVar = this.zzc.zza;
        str = this.zzc.zzb;
        com.google.android.gms.internal.measurement.zzbz zzbzVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzgqVar.zza(str, zzbzVar);
        zzgqVar.zza.zzl().zzt();
        zzgqVar.zza.zzy();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzgqVar.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzgqVar.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                } else {
                    zzgqVar.zza.zzj().zzp().zza("InstallReferrer API result", string);
                    Bundle zza2 = zzgqVar.zza.zzt().zza(Uri.parse("?" + string), zzok.zza() && zzgqVar.zza.zzf().zza(zzbh.zzcp));
                    if (zza2 == null) {
                        zzgqVar.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zza2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzgqVar.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzgqVar.zza.zzn().zzd.zza()) {
                            zzgqVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzgqVar.zza.zzac()) {
                            zzgqVar.zza.zzn().zzd.zza(j);
                            zzgqVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zza2.putString("_cis", "referrer API v2");
                            zzgqVar.zza.zzp().zza("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza2, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzgqVar.zza.zza(), serviceConnection);
        }
    }
}
