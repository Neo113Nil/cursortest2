package com.google.android.gms.internal.appset;

import K9.h;
import android.content.Context;

/* loaded from: classes2.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long zza = this.zza.zza();
        if (zza == -1 || h.c().a() <= zza) {
            return;
        }
        context = this.zza.zzb;
        zzl.zze(context);
    }
}
