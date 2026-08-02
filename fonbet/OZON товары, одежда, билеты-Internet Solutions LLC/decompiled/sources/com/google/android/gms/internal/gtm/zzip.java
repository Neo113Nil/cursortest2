package com.google.android.gms.internal.gtm;

import N3.C3660k;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Queue;

/* loaded from: classes9.dex */
final class zzip implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zziq zzf;
    private boolean zzg = false;

    zzip(zziq zziqVar, String str, Bundle bundle, String str2, long j11, String str3) {
        this.zzf = zziqVar;
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
        int i13;
        Context context;
        Queue queue;
        int i14;
        int i15;
        Context context2;
        Context context3;
        com.google.android.gms.tagmanager.zzcp zzcpVar;
        zzjn zzjnVar;
        i11 = this.zzf.zza.zzo;
        if (i11 == 3) {
            zzjnVar = this.zzf.zza.zzg;
            zzjnVar.zzb(this.zza, this.zzb, this.zzc, this.zzd, true);
            return;
        }
        i12 = this.zzf.zza.zzo;
        if (i12 == 4) {
            String str = this.zza;
            String str2 = this.zzc;
            Bundle bundle = this.zzb;
            StringBuilder d11 = C3660k.d("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = ", str, ", origin = ", str2, ", params = ");
            d11.append(bundle);
            d11.append(".");
            zzhl.zzd(d11.toString());
            try {
                zzcpVar = this.zzf.zza.zze;
                zzcpVar.zzc(this.zzc, this.zza, this.zzb, this.zzd);
                return;
            } catch (RemoteException e11) {
                context3 = this.zzf.zza.zzd;
                zzgt.zzb("Error logging event on measurement proxy: ", e11, context3);
                return;
            }
        }
        i13 = this.zzf.zza.zzo;
        if (i13 != 1) {
            i14 = this.zzf.zza.zzo;
            if (i14 != 2) {
                i15 = this.zzf.zza.zzo;
                StringBuilder sb2 = new StringBuilder(28);
                sb2.append("Unexpected state:");
                sb2.append(i15);
                String sb3 = sb2.toString();
                context2 = this.zzf.zza.zzd;
                zzgt.zzc(sb3, context2);
                return;
            }
        }
        if (this.zzg) {
            context = this.zzf.zza.zzd;
            zzgt.zzc("Invalid state - not expecting to see a deferredevent during container loading.", context);
            return;
        }
        String str3 = this.zza;
        String str4 = this.zze;
        Bundle bundle2 = this.zzb;
        StringBuilder d12 = C3660k.d("Container not loaded yet: deferring event interceptor by enqueuing the event: name = ", str3, ", origin = ", str4, ", params = ");
        d12.append(bundle2);
        d12.append(".");
        zzhl.zzd(d12.toString());
        this.zzg = true;
        queue = this.zzf.zza.zzp;
        queue.add(this);
    }
}
