package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzsx extends zzta {
    private final int zzc;
    private final int zzd;

    zzsx(byte[] bArr, int i11, int i12) {
        super(bArr);
        zztd.zzk(i11, i11 + i12, bArr.length);
        this.zzc = i11;
        this.zzd = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final byte zza(int i11) {
        int i12 = this.zzd;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.zza[this.zzc + i11];
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(i12);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    final byte zzb(int i11) {
        return this.zza[this.zzc + i11];
    }

    @Override // com.google.android.gms.internal.gtm.zzta
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    protected final void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i13);
    }
}
