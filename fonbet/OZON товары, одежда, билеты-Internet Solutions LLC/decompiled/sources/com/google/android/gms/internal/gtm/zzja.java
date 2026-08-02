package com.google.android.gms.internal.gtm;

import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzja implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjc zzc;

    zzja(zzjc zzjcVar, boolean z11, String str) {
        this.zzc = zzjcVar;
        this.zza = z11;
        this.zzb = str;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x006c */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i11;
        Queue queue;
        ExecutorService executorService;
        Queue queue2;
        i11 = this.zzc.zza.zzo;
        if (i11 != 2) {
            zzhl.zze("Container load callback completed after timeout");
            return;
        }
        if (this.zza) {
            this.zzc.zza.zzo = 3;
            String str = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18);
            sb2.append("Container ");
            sb2.append(str);
            sb2.append(" loaded.");
            zzhl.zzd(sb2.toString());
        } else {
            this.zzc.zza.zzo = 4;
            String valueOf = String.valueOf(this.zzb);
            zzhl.zza(valueOf.length() != 0 ? "Error loading container:".concat(valueOf) : new String("Error loading container:"));
        }
        while (!queue.isEmpty()) {
            executorService = this.zzc.zza.zzh;
            queue2 = this.zzc.zza.zzp;
            executorService.execute((Runnable) queue2.remove());
        }
    }
}
