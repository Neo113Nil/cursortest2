package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzala implements zzakx {
    private final int zza;
    private final int zzb;
    private final zzes zzc;

    public zzala(zzfx zzfxVar, zzv zzvVar) {
        zzes zzesVar = zzfxVar.zza;
        this.zzc = zzesVar;
        zzesVar.zzh(12);
        int zzH = zzesVar.zzH();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzp)) {
            int zzF = zzfk.zzF(zzvVar.zzJ) * zzvVar.zzH;
            if (zzH % zzF != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzF).length() + 66 + String.valueOf(zzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzF);
                sb.append(", stsz sample size: ");
                sb.append(zzH);
                zzef.zzc("BoxParsers", sb.toString());
                zzH = zzF;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzesVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
