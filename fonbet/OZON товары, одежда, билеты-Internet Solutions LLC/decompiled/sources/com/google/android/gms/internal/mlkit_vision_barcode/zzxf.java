package com.google.android.gms.internal.mlkit_vision_barcode;

import B4.V;

/* loaded from: classes9.dex */
final class zzxf extends zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    /* synthetic */ zzxf(int i11, int i12, float f7, float f11, boolean z11, float f12, float f13, long j11, long j12, boolean z12, float f14, float f15, zzxe zzxeVar) {
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = f7;
        this.zze = f11;
        this.zzf = z11;
        this.zzg = f12;
        this.zzh = f13;
        this.zzi = j11;
        this.zzj = j12;
        this.zzk = z12;
        this.zzl = f14;
        this.zzm = f15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxm) {
            zzxm zzxmVar = (zzxm) obj;
            if (this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxmVar.zzd()) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxmVar.zzb()) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxmVar.zze()) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxmVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.zzb ^ 1000003) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003) ^ Float.floatToIntBits(this.zzm);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoZoomOptions{recentFramesToCheck=");
        sb2.append(this.zzb);
        sb2.append(", recentFramesContainingPredictedArea=");
        sb2.append(this.zzc);
        sb2.append(", recentFramesIou=");
        sb2.append(this.zzd);
        sb2.append(", maxCoverage=");
        sb2.append(this.zze);
        sb2.append(", useConfidenceScore=");
        sb2.append(this.zzf);
        sb2.append(", lowerConfidenceScore=");
        sb2.append(this.zzg);
        sb2.append(", higherConfidenceScore=");
        sb2.append(this.zzh);
        sb2.append(", zoomIntervalInMillis=");
        sb2.append(this.zzi);
        sb2.append(", resetIntervalInMillis=");
        sb2.append(this.zzj);
        sb2.append(", enableZoomThreshold=");
        sb2.append(this.zzk);
        sb2.append(", zoomInThreshold=");
        sb2.append(this.zzl);
        sb2.append(", zoomOutThreshold=");
        return V.b(this.zzm, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final boolean zzl() {
        return this.zzf;
    }
}
