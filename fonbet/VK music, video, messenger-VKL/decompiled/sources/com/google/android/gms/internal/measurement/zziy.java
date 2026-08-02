package com.google.android.gms.internal.measurement;

import xsna.efz;
import xsna.lhg;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
final class zziy extends zzjb {
    private final int zzc;

    public zziy(byte[] bArr, int i, int i2) {
        super(bArr);
        zzje.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(lhg.a(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(efz.a(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final int zzd() {
        return this.zzc;
    }
}
