package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzxv extends zzxx {
    zzxv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(zzk(obj, j11));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(zzj(obj, j11));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzxy.zzE(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j11, b11);
        } else {
            zzxy.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zze(Object obj, long j11, double d11) {
        zzo(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzf(Object obj, long j11, float f7) {
        zzn(obj, j11, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final boolean zzg(Object obj, long j11) {
        return zzxy.zzb ? zzxy.zzt(obj, j11) : zzxy.zzu(obj, j11);
    }
}
