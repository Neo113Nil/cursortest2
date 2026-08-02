package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzmz extends zzav {
    private final /* synthetic */ zzmw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmz(zzmw zzmwVar, zzil zzilVar) {
        super(zzilVar);
        this.zza = zzmwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    public final void zzb() {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzw();
    }
}
