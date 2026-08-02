package com.google.android.gms.internal.gtm;

import android.content.Context;

/* loaded from: classes9.dex */
final class zzit implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzje zzc;

    zzit(zzje zzjeVar, String str, String str2, String str3) {
        this.zzc = zzjeVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        zzjn zzjnVar;
        Context context;
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 28);
        sb2.append("Starting to load container ");
        sb2.append(str);
        sb2.append(".");
        zzhl.zzd(sb2.toString());
        i11 = this.zzc.zzo;
        if (i11 != 1) {
            context = this.zzc.zzd;
            zzgt.zzc("Unexpected state - container loading already initiated.", context);
        } else {
            this.zzc.zzo = 2;
            zzjnVar = this.zzc.zzg;
            zzjnVar.zzc(this.zza, this.zzb, null, new zzjc(this.zzc, null));
        }
    }
}
