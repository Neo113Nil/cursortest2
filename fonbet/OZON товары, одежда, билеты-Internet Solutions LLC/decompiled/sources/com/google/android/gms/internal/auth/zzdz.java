package com.google.android.gms.internal.auth;

import B0.A0;
import Ej.b;

/* loaded from: classes9.dex */
final class zzdz extends zzec {
    private final int zzc;

    zzdz(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzef.zzi(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
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

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    final byte zzb(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
