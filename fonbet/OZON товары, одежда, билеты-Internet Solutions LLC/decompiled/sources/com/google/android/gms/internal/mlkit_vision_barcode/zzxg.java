package com.google.android.gms.internal.mlkit_vision_barcode;

import B4.V;

/* loaded from: classes9.dex */
final class zzxg extends zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    zzxg(float f7, float f11, float f12, float f13, float f14) {
        this.zza = f7;
        this.zzb = f11;
        this.zzc = f12;
        this.zzd = f13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxn) {
            zzxn zzxnVar = (zzxn) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxnVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxnVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxnVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxnVar.zzd())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzxnVar.zza();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PredictedArea{xMin=");
        sb2.append(this.zza);
        sb2.append(", yMin=");
        sb2.append(this.zzb);
        sb2.append(", xMax=");
        sb2.append(this.zzc);
        sb2.append(", yMax=");
        return V.b(this.zzd, ", confidenceScore=0.0}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zza() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zze() {
        return this.zzb;
    }
}
