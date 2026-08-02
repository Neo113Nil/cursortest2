package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzalb implements zzakx {
    private final zzes zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalb(zzfx zzfxVar) {
        zzes zzesVar = zzfxVar.zza;
        this.zza = zzesVar;
        zzesVar.zzh(12);
        this.zzc = zzesVar.zzH() & 255;
        this.zzb = zzesVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzs = this.zza.zzs();
        this.zze = zzs;
        return (zzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
