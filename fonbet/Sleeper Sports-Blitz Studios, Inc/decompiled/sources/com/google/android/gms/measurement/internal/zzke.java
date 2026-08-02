package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzke implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zziz zzb;

    zzke(zziz zzizVar, Boolean bool) {
        this.zza = bool;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
