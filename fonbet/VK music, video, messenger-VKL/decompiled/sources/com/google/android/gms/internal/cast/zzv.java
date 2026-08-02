package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaStatus;
import java.util.Objects;
import xsna.pp01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzv implements pp01 {
    final /* synthetic */ zzy zza;

    public /* synthetic */ zzv(zzy zzyVar, byte[] bArr) {
        Objects.requireNonNull(zzyVar);
        this.zza = zzyVar;
    }

    @Override // xsna.pp01
    public final void zza() {
        this.zza.zza(new zzcs(new zzcr(3)));
    }

    @Override // xsna.pp01
    public final void zzb(String str, long j, int i, long j2, long j3) {
        zzaa zzb = this.zza.zzb();
        zzcp zzcpVar = new zzcp(str);
        zzcpVar.zza(j);
        zzcpVar.zzb(i);
        zzcpVar.zzc(j2);
        zzcpVar.zzd(j3);
        zzb.zzd(new zzcq(zzcpVar));
    }

    @Override // xsna.pp01
    public final void zzc(@Nullable MediaStatus mediaStatus) {
        if (mediaStatus == null) {
            return;
        }
        this.zza.zzb().zze(new zzt(new zzs(mediaStatus)));
    }

    @Override // xsna.pp01
    public final void zzd() {
        this.zza.zzb().zzf();
    }
}
