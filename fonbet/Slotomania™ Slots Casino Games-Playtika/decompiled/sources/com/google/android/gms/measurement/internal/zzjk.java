package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzjk extends zzap {
    final /* synthetic */ zzjy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjk(zzjy zzjyVar, zzgz zzgzVar) {
        super(zzgzVar);
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zzt.zzaA().zzk().zza("Tasks have been queued for a long time");
    }
}
