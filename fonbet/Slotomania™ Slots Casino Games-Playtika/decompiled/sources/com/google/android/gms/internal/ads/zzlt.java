package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzlt {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlt() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    /* synthetic */ zzlt(zzlu zzluVar, byte[] bArr) {
        this.zza = zzluVar.zza;
        this.zzb = zzluVar.zzb;
        this.zzc = zzluVar.zzc;
    }

    public final zzlt zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzlt zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzgsw.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzlt zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzgsw.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzlu zzd() {
        return new zzlu(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }
}
