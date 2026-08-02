package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzmd implements Runnable {
    private final /* synthetic */ zzlw zza;

    zzmd(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzap();
    }
}
