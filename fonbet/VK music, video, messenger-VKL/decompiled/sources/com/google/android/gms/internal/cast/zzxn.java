package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.Locale;
import xsna.efz;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzxn extends zzxp {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzxn(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(efz.a(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzb(int i, int i2) throws IOException {
        zzo((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzc(int i, int i2) throws IOException {
        zzo(i << 3);
        zzn(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzd(int i, int i2) throws IOException {
        zzo(i << 3);
        zzo(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zze(int i, int i2) throws IOException {
        zzo((i << 3) | 5);
        zzp(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzf(int i, long j) throws IOException {
        zzo(i << 3);
        zzq(j);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzg(int i, long j) throws IOException {
        zzo((i << 3) | 1);
        zzr(j);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzh(int i, boolean z) throws IOException {
        zzo(i << 3);
        zzm(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzi(int i, String str) throws IOException {
        zzo((i << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzj(int i, zzxk zzxkVar) throws IOException {
        zzo((i << 3) | 2);
        zzo(zzxkVar.zzc());
        zzxkVar.zze(this);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzk(int i, zzzi zzziVar) throws IOException {
        zzo(11);
        zzd(2, i);
        zzo(26);
        zzo(zzziVar.zzE());
        zzziVar.zzD(this);
        zzo(12);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzl(int i, zzxk zzxkVar) throws IOException {
        zzo(11);
        zzd(2, i);
        zzj(3, zzxkVar);
        zzo(12);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzm(byte b) throws IOException {
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzxo(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzn(int i) throws IOException {
        if (i >= 0) {
            zzo(i);
        } else {
            zzq(i);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzo(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzxo(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzxo(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzp(int i) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzq(long j) throws IOException {
        boolean z;
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        z = zzxp.zzc;
        int i2 = this.zze;
        if (!z || this.zzd - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zzc[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i3;
                        throw new zzxo(i2, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zzc[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new zzxo(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzaak.zzp(this.zzc, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzaak.zzp(this.zzc, i2, (byte) j);
        }
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void zzr(long j) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i, this.zzd, 8, e);
        }
    }

    public final void zzs(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(this.zze, this.zzd, i2, e);
        }
    }

    public final void zzt(String str) throws IOException {
        int i = this.zze;
        try {
            int zzv = zzxp.zzv(str.length() * 3);
            int zzv2 = zzxp.zzv(str.length());
            if (zzv2 != zzv) {
                zzo(zzaao.zza(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzaao.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzv2;
            this.zze = i3;
            int zzb = zzaao.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzo((zzb - i) - zzv2);
            this.zze = zzb;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final int zzu() {
        return this.zzd - this.zze;
    }
}
