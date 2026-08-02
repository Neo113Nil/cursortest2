package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzhu implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzij zzd;

    zzhu(zzij zzijVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zzijVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzt.zzt().zzw(this.zza, null, this.zzb, this.zzc);
    }
}
