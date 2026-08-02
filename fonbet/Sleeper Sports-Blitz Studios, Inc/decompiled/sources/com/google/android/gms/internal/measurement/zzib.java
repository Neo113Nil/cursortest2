package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzib extends zzik {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.measurement.zzik, com.google.android.gms.internal.measurement.zzhx
    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzik, com.google.android.gms.internal.measurement.zzhx
    final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzik, com.google.android.gms.internal.measurement.zzhx
    public final int zzb() {
        return this.zzd;
    }

    zzib(byte[] bArr, int i, int i2) {
        super(bArr);
        zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }
}
