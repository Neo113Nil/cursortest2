package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes9.dex */
final class zzgj implements Runnable {
    final /* synthetic */ zzgq zza;

    /* synthetic */ zzgj(zzgq zzgqVar, zzgi zzgiVar) {
        this.zza = zzgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        List list;
        List<zzgx> list2;
        Context context;
        com.google.android.gms.tagmanager.zzcp zzcpVar;
        this.zza.zzm = 3;
        str = this.zza.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append("Container ");
        sb2.append(str);
        sb2.append(" loading failed.");
        zzhl.zze(sb2.toString());
        list = this.zza.zzn;
        if (list != null) {
            list2 = this.zza.zzn;
            for (zzgx zzgxVar : list2) {
                if (zzgxVar.zzf()) {
                    try {
                        zzcpVar = this.zza.zzi;
                        zzcpVar.zzc("app", zzgxVar.zzb(), zzgxVar.zza(), zzgxVar.currentTimeMillis());
                        String zzb = zzgxVar.zzb();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zzb).length() + 50);
                        sb3.append("Logged event ");
                        sb3.append(zzb);
                        sb3.append(" to Firebase (marked as passthrough).");
                        zzhl.zzd(sb3.toString());
                    } catch (RemoteException e11) {
                        context = this.zza.zza;
                        zzgt.zzb("Error logging event with measurement proxy:", e11, context);
                    }
                } else {
                    String zzb2 = zzgxVar.zzb();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzb2).length() + 45);
                    sb4.append("Discarded event ");
                    sb4.append(zzb2);
                    sb4.append(" (marked as non-passthrough).");
                    zzhl.zzd(sb4.toString());
                }
            }
            this.zza.zzn = null;
        }
    }
}
