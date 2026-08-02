package com.google.android.gms.internal.gtm;

import android.net.Uri;
import android.util.Pair;
import java.util.Queue;

/* loaded from: classes9.dex */
final class zziy implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ zzje zzb;

    zziy(zzje zzjeVar, Uri uri) {
        this.zzb = zzjeVar;
        this.zza = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i11;
        Pair zzp;
        zzhs zzhsVar;
        boolean z11;
        zzjn zzjnVar;
        Queue queue;
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
        sb2.append("Preview requested to uri ");
        sb2.append(valueOf);
        zzhl.zzd(sb2.toString());
        obj = this.zzb.zzl;
        synchronized (obj) {
            try {
                i11 = this.zzb.zzo;
                if (i11 == 2) {
                    zzhl.zzd("Still initializing. Defer preview container loading.");
                    queue = this.zzb.zzp;
                    queue.add(this);
                    return;
                }
                zzp = this.zzb.zzp(null);
                String str = (String) zzp.first;
                if (str == null) {
                    zzhl.zze("Preview failed (no container found)");
                    return;
                }
                zzhsVar = this.zzb.zzj;
                if (!zzhsVar.zzf(str, this.zza)) {
                    String valueOf2 = String.valueOf(this.zza);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 73);
                    sb3.append("Cannot preview the app with the uri: ");
                    sb3.append(valueOf2);
                    sb3.append(". Launching current version instead.");
                    zzhl.zze(sb3.toString());
                    return;
                }
                z11 = this.zzb.zzq;
                if (!z11) {
                    String valueOf3 = String.valueOf(this.zza);
                    StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
                    sb4.append("Deferring container loading for preview uri: ");
                    sb4.append(valueOf3);
                    sb4.append("(Tag Manager has not been initialized).");
                    zzhl.zzd(sb4.toString());
                    return;
                }
                String valueOf4 = String.valueOf(this.zza);
                StringBuilder sb5 = new StringBuilder(valueOf4.length() + 36);
                sb5.append("Starting to load preview container: ");
                sb5.append(valueOf4);
                zzhl.zzc(sb5.toString());
                zzjnVar = this.zzb.zzg;
                if (!zzjnVar.zze()) {
                    zzhl.zze("Failed to reset TagManager service for preview");
                    return;
                }
                this.zzb.zzq = false;
                this.zzb.zzo = 1;
                this.zzb.zzm(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
