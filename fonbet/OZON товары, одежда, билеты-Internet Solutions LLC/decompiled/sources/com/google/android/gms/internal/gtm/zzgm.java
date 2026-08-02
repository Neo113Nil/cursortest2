package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes9.dex */
final class zzgm implements Runnable {
    final /* synthetic */ zzgq zza;
    private final zzgx zzb;

    public zzgm(zzgq zzgqVar, zzgx zzgxVar) {
        this.zza = zzgqVar;
        this.zzb = zzgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        Context context;
        com.google.android.gms.tagmanager.zzcp zzcpVar;
        List list;
        zzhz zzhzVar;
        i11 = this.zza.zzm;
        if (i11 == 2) {
            String valueOf = String.valueOf(this.zzb.zzb());
            zzhl.zzd(valueOf.length() != 0 ? "Evaluating tags for event ".concat(valueOf) : new String("Evaluating tags for event "));
            zzhzVar = this.zza.zzl;
            zzhzVar.zzf(this.zzb);
            return;
        }
        i12 = this.zza.zzm;
        if (i12 == 1) {
            list = this.zza.zzn;
            list.add(this.zzb);
            String zzb = this.zzb.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 30);
            sb2.append("Added event ");
            sb2.append(zzb);
            sb2.append(" to pending queue.");
            zzhl.zzd(sb2.toString());
            return;
        }
        i13 = this.zza.zzm;
        if (i13 == 3) {
            String zzb2 = this.zzb.zzb();
            StringBuilder sb3 = new StringBuilder(String.valueOf(zzb2).length() + 61);
            sb3.append("Failed to evaluate tags for event ");
            sb3.append(zzb2);
            sb3.append(" (container failed to load)");
            zzhl.zzd(sb3.toString());
            if (!this.zzb.zzf()) {
                String valueOf2 = String.valueOf(this.zzb.zzb());
                zzhl.zzd(valueOf2.length() != 0 ? "Discarded non-passthrough event ".concat(valueOf2) : new String("Discarded non-passthrough event "));
                return;
            }
            try {
                zzcpVar = this.zza.zzi;
                zzcpVar.zzc("app", this.zzb.zzb(), this.zzb.zza(), this.zzb.currentTimeMillis());
                String zzb3 = this.zzb.zzb();
                StringBuilder sb4 = new StringBuilder(String.valueOf(zzb3).length() + 38);
                sb4.append("Logged passthrough event ");
                sb4.append(zzb3);
                sb4.append(" to Firebase.");
                zzhl.zzd(sb4.toString());
            } catch (RemoteException e11) {
                context = this.zza.zza;
                zzgt.zzb("Error logging event with measurement proxy:", e11, context);
            }
        }
    }
}
