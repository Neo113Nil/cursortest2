package com.google.android.gms.internal.cast;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzeb implements zzaw {
    final /* synthetic */ zzee zza;

    public /* synthetic */ zzeb(zzee zzeeVar, byte[] bArr) {
        Objects.requireNonNull(zzeeVar);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzaw
    public final void zza() {
        zzee zzeeVar = this.zza;
        zzeeVar.zze();
        zzeeVar.zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzaw
    public final void zzb() {
        zzee zzeeVar = this.zza;
        zzeeVar.zze();
        zzeeVar.zzc();
    }
}
