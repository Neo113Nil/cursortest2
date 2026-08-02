package com.google.android.gms.internal.measurement;

import B0.A0;
import Ej.b;

/* loaded from: classes9.dex */
final class zziv extends zziy {
    private final int zzc;

    zziv(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzjb.zzj(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.zza[i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(b.a(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    final byte zzb(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final int zzd() {
        return this.zzc;
    }
}
