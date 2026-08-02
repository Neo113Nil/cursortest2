package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzms extends zzmu {
    zzms(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(zzk(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(zzj(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzmv.zzE(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j11, b11);
        } else {
            zzmv.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zze(Object obj, long j11, double d11) {
        zzo(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzf(Object obj, long j11, float f7) {
        zzn(obj, j11, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzg(Object obj, long j11) {
        return zzmv.zzb ? zzmv.zzt(obj, j11) : zzmv.zzu(obj, j11);
    }
}
