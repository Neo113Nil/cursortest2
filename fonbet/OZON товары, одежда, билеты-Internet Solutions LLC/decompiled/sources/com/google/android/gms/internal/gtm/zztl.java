package com.google.android.gms.internal.gtm;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes9.dex */
final class zztl extends zzto {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zztl(byte[] bArr, int i11, int i12) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzb(byte b11) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    public final void zzc(byte[] bArr, int i11, int i12) throws IOException {
        try {
            System.arraycopy(bArr, i11, this.zzb, this.zzd, i12);
            this.zzd += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i12)), e11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzd(int i11, boolean z11) throws IOException {
        zzq(i11 << 3);
        zzb(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zze(int i11, zztd zztdVar) throws IOException {
        zzq((i11 << 3) | 2);
        zzq(zztdVar.zzd());
        zztdVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzf(int i11, int i12) throws IOException {
        zzq((i11 << 3) | 5);
        zzg(i12);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzg(int i11) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.zzd = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.zzd = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.zzd = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzh(int i11, long j11) throws IOException {
        zzq((i11 << 3) | 1);
        zzi(j11);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzi(long j11) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) j11) & 255);
            int i13 = i11 + 2;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
            int i14 = i11 + 3;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
            int i15 = i11 + 4;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
            int i16 = i11 + 5;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.zzd = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.zzd = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzj(int i11, int i12) throws IOException {
        zzq(i11 << 3);
        zzk(i12);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzk(int i11) throws IOException {
        if (i11 >= 0) {
            zzq(i11);
        } else {
            zzs(i11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzl(byte[] bArr, int i11, int i12) throws IOException {
        zzc(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzm(int i11, String str) throws IOException {
        zzq((i11 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i11 = this.zzd;
        try {
            int zzD = zzto.zzD(str.length() * 3);
            int zzD2 = zzto.zzD(str.length());
            if (zzD2 != zzD) {
                zzq(zzyd.zzc(str));
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = zzyd.zzb(str, bArr, i12, this.zzc - i12);
                return;
            }
            int i13 = i11 + zzD2;
            this.zzd = i13;
            int zzb = zzyd.zzb(str, this.zzb, i13, this.zzc - i13);
            this.zzd = i11;
            zzq((zzb - i11) - zzD2);
            this.zzd = zzb;
        } catch (zzyc e11) {
            this.zzd = i11;
            zzH(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zztm(e12);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzo(int i11, int i12) throws IOException {
        zzq((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzp(int i11, int i12) throws IOException {
        zzq(i11 << 3);
        zzq(i12);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzq(int i11) throws IOException {
        boolean z11;
        z11 = zzto.zzc;
        if (z11) {
            int i12 = zzsk.zza;
        }
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                bArr[i13] = (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
            }
        }
        byte[] bArr2 = this.zzb;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        bArr2[i14] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzr(int i11, long j11) throws IOException {
        zzq(i11 << 3);
        zzs(j11);
    }

    @Override // com.google.android.gms.internal.gtm.zzto
    public final void zzs(long j11) throws IOException {
        boolean z11;
        z11 = zzto.zzc;
        if (z11 && this.zzc - this.zzd >= 10) {
            while ((j11 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzxy.zzn(bArr, i11, (byte) ((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j11 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            zzxy.zzn(bArr2, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                bArr3[i13] = (byte) ((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zztm(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
            }
        }
        byte[] bArr4 = this.zzb;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        bArr4[i14] = (byte) j11;
    }
}
