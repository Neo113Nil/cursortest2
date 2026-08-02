package com.google.android.gms.internal.fido;

import B0.A0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
class zzgu extends zzgt {
    protected final byte[] zza;

    zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgx) || zzd() != ((zzgx) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgu)) {
            return obj.equals(this);
        }
        zzgu zzguVar = (zzgu) obj;
        int zzk = zzk();
        int zzk2 = zzguVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException(A0.a(zzd, zzguVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzguVar.zza;
        int zzc = zzc() + zzd;
        int zzc2 = zzc();
        int zzc3 = zzguVar.zzc();
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    byte zzb(int i11) {
        return this.zza[i11];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zza, 0, bArr, 0, i13);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected final int zzf(int i11, int i12, int i13) {
        int zzc = zzc();
        byte[] bArr = zzhc.zzd;
        for (int i14 = zzc; i14 < zzc + i13; i14++) {
            i11 = (i11 * 31) + this.zza[i14];
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final zzgx zzg(int i11, int i12) {
        int zzj = zzgx.zzj(i11, i12, zzd());
        return zzj == 0 ? zzgx.zzb : new zzgr(this.zza, zzc() + i11, zzj);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}
