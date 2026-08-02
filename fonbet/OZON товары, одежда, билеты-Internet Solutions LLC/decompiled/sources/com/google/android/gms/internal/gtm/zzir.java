package com.google.android.gms.internal.gtm;

import N3.C3660k;
import android.content.Context;
import android.os.Bundle;
import java.util.Queue;

/* loaded from: classes9.dex */
final class zzir implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzis zzf;
    private boolean zzg = false;

    zzir(zzis zzisVar, String str, Bundle bundle, String str2, long j11, String str3) {
        this.zzf = zzisVar;
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
        this.zzd = j11;
        this.zze = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        Queue queue;
        int i13;
        int i14;
        int i15;
        Context context;
        zzjn zzjnVar;
        i11 = this.zzf.zza.zzo;
        if (i11 == 3) {
            zzjnVar = this.zzf.zza.zzg;
            zzjnVar.zzb(this.zza, this.zzb, this.zzc, this.zzd, false);
            return;
        }
        i12 = this.zzf.zza.zzo;
        if (i12 != 1) {
            i13 = this.zzf.zza.zzo;
            if (i13 != 2) {
                i14 = this.zzf.zza.zzo;
                if (i14 == 4) {
                    String str = this.zza;
                    String str2 = this.zze;
                    Bundle bundle = this.zzb;
                    StringBuilder d11 = C3660k.d("Container failed to load: skipping event listener by ignoring the event: name = ", str, ", origin = ", str2, ", params = ");
                    d11.append(bundle);
                    d11.append(".");
                    zzhl.zzd(d11.toString());
                    return;
                }
                i15 = this.zzf.zza.zzo;
                StringBuilder sb2 = new StringBuilder(28);
                sb2.append("Unexpected state:");
                sb2.append(i15);
                String sb3 = sb2.toString();
                context = this.zzf.zza.zzd;
                zzgt.zzc(sb3, context);
                return;
            }
        }
        if (this.zzg) {
            zzhl.zze("Invalid state - not expecting to see a deferred event during container loading.");
            return;
        }
        String str3 = this.zza;
        String str4 = this.zze;
        Bundle bundle2 = this.zzb;
        StringBuilder d12 = C3660k.d("Container not loaded yet: deferring event listener by enqueuing the event: name = ", str3, ", origin = ", str4, ", params = ");
        d12.append(bundle2);
        d12.append(".");
        zzhl.zzd(d12.toString());
        this.zzg = true;
        queue = this.zzf.zza.zzp;
        queue.add(this);
    }
}
