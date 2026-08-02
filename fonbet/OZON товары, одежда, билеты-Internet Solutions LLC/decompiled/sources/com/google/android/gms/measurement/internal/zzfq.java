package com.google.android.gms.measurement.internal;

import N3.C3661l;
import T7.E;
import U7.C4056a;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zznw;

/* loaded from: classes9.dex */
final class zzfq implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfr zzc;

    zzfq(zzfr zzfrVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfrVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzfr zzfrVar = this.zzc;
        zzfs zzfsVar = zzfrVar.zza;
        str = zzfrVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfsVar.zza.zzaz().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e11) {
            zzfsVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e11.getMessage());
        }
        if (bundle == null) {
            zzfsVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzfsVar.zza.zzaz().zzg();
        zzgk.zzO();
        if (bundle != null) {
            long j11 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j11 == 0) {
                C4056a.a(zzfsVar.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    C3661l.b(zzfsVar.zza, "No referrer defined in Install Referrer response");
                } else {
                    zzfsVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    zzlt zzv = zzfsVar.zza.zzv();
                    Uri parse = Uri.parse("?".concat(string));
                    zznw.zzc();
                    boolean zzs = zzfsVar.zza.zzf().zzs(null, zzen.zzau);
                    zznw.zzc();
                    Bundle zzs2 = zzv.zzs(parse, zzs, zzfsVar.zza.zzf().zzs(null, zzen.zzax));
                    if (zzs2 == null) {
                        C3661l.b(zzfsVar.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j12 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j12 == 0) {
                                C3661l.b(zzfsVar.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs2.putLong("click_timestamp", j12);
                            }
                        }
                        if (j11 == zzfsVar.zza.zzm().zzd.zza()) {
                            E.g(zzfsVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfsVar.zza.zzJ()) {
                            zzfsVar.zza.zzm().zzd.zzb(j11);
                            zzfsVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs2.putString("_cis", "referrer API v2");
                            zzfsVar.zza.zzq().zzG("auto", "_cmp", zzs2, str);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfsVar.zza.zzau(), serviceConnection);
    }
}
