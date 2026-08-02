package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class zzth extends zztj {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzth(InputStream inputStream, int i11, zztg zztgVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        zzvi.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List<byte[]> zzu(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int min = Math.min(i11, 4096);
            byte[] bArr = new byte[min];
            int i12 = 0;
            while (i12 < min) {
                int read = this.zze.read(bArr, i12, min - i12);
                if (read == -1) {
                    throw zzvk.zzj();
                }
                this.zzk += read;
                i12 += read;
            }
            i11 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzv() {
        int i11 = this.zzg + this.zzh;
        this.zzg = i11;
        int i12 = this.zzk + i11;
        int i13 = this.zzl;
        if (i12 <= i13) {
            this.zzh = 0;
            return;
        }
        int i14 = i12 - i13;
        this.zzh = i14;
        this.zzg = i11 - i14;
    }

    private final void zzw(int i11) throws IOException {
        if (zzx(i11)) {
            return;
        }
        if (i11 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzvk.zzj();
        }
        throw zzvk.zzi();
    }

    private final boolean zzx(int i11) throws IOException {
        int i12 = this.zzi;
        int i13 = this.zzg;
        if (i12 + i11 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = this.zzk;
        if (i11 > (Integer.MAX_VALUE - i14) - i12 || i14 + i12 + i11 > this.zzl) {
            return false;
        }
        if (i12 > 0) {
            if (i13 > i12) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
            }
            i14 = this.zzk + i12;
            this.zzk = i14;
            i13 = this.zzg - i12;
            this.zzg = i13;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (read == 0 || read < -1 || read > 4096) {
                String valueOf = String.valueOf(this.zze.getClass());
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 91);
                sb3.append(valueOf);
                sb3.append("#read(byte[]) returned invalid result: ");
                sb3.append(read);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzv();
            if (this.zzg >= i11) {
                return true;
            }
            return zzx(i11);
        } catch (zzvk e11) {
            e11.zzk();
            throw e11;
        }
    }

    private final byte[] zzy(int i11, boolean z11) throws IOException {
        byte[] zzz = zzz(i11);
        if (zzz != null) {
            return zzz;
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(i11 - i14);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : zzu) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return bArr;
    }

    private final byte[] zzz(int i11) throws IOException {
        if (i11 == 0) {
            return zzvi.zzc;
        }
        if (i11 < 0) {
            throw zzvk.zzf();
        }
        int i12 = this.zzk;
        int i13 = this.zzi;
        int i14 = i12 + i13 + i11;
        if ((-2147483647) + i14 > 0) {
            throw zzvk.zzi();
        }
        int i15 = this.zzl;
        if (i14 > i15) {
            zzr((i15 - i12) - i13);
            throw zzvk.zzj();
        }
        int i16 = this.zzg - i13;
        int i17 = i11 - i16;
        if (i17 >= 4096) {
            try {
                if (i17 > this.zze.available()) {
                    return null;
                }
            } catch (zzvk e11) {
                e11.zzk();
                throw e11;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i16);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i16 < i11) {
            try {
                int read = this.zze.read(bArr, i16, i11 - i16);
                if (read == -1) {
                    throw zzvk.zzj();
                }
                this.zzk += read;
                i16 += read;
            } catch (zzvk e12) {
                e12.zzk();
                throw e12;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zza() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzb(int i11) throws zzvk {
        if (i11 < 0) {
            throw zzvk.zzf();
        }
        int i12 = this.zzk + this.zzi + i11;
        int i13 = this.zzl;
        if (i12 > i13) {
            throw zzvk.zzj();
        }
        this.zzl = i12;
        zzv();
        return i13;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzc() throws IOException {
        if (zzi()) {
            this.zzj = 0;
            return 0;
        }
        int zzn = zzn();
        this.zzj = zzn;
        if ((zzn >>> 3) != 0) {
            return zzn;
        }
        throw zzvk.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final zztd zzd() throws IOException {
        int zzn = zzn();
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (zzn <= i11 - i12 && zzn > 0) {
            zztd zzn2 = zztd.zzn(this.zzf, i12, zzn);
            this.zzi += zzn;
            return zzn2;
        }
        if (zzn == 0) {
            return zztd.zzb;
        }
        byte[] zzz = zzz(zzn);
        if (zzz != null) {
            return zztd.zzm(zzz);
        }
        int i13 = this.zzi;
        int i14 = this.zzg;
        int i15 = i14 - i13;
        this.zzk += i14;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(zzn - i15);
        byte[] bArr = new byte[zzn];
        System.arraycopy(this.zzf, i13, bArr, 0, i15);
        for (byte[] bArr2 : zzu) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i15, length);
            i15 += length;
        }
        return zztd.zzp(bArr);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zze() throws IOException {
        int zzn = zzn();
        if (zzn > 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (zzn <= i11 - i12) {
                String str = new String(this.zzf, i12, zzn, zzvi.zza);
                this.zzi += zzn;
                return str;
            }
        }
        if (zzn == 0) {
            return "";
        }
        if (zzn > this.zzg) {
            return new String(zzy(zzn, false), zzvi.zza);
        }
        zzw(zzn);
        String str2 = new String(this.zzf, this.zzi, zzn, zzvi.zza);
        this.zzi += zzn;
        return str2;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zzf() throws IOException {
        byte[] zzy;
        int zzn = zzn();
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (zzn <= i12 - i11 && zzn > 0) {
            zzy = this.zzf;
            this.zzi = i11 + zzn;
        } else {
            if (zzn == 0) {
                return "";
            }
            i11 = 0;
            if (zzn <= i12) {
                zzw(zzn);
                zzy = this.zzf;
                this.zzi = zzn;
            } else {
                zzy = zzy(zzn, false);
            }
        }
        return zzyd.zzd(zzy, i11, zzn);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzg(int i11) throws zzvk {
        if (this.zzj != i11) {
            throw zzvk.zzb();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzh(int i11) {
        this.zzl = i11;
        zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzi() throws IOException {
        return this.zzi == this.zzg && !zzx(1);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzj() throws IOException {
        return zzp() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzk(int i11) throws IOException {
        int zzc;
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i13 < 10) {
                    if (zzl() < 0) {
                        i13++;
                    }
                }
                throw zzvk.zze();
            }
            while (i13 < 10) {
                byte[] bArr = this.zzf;
                int i14 = this.zzi;
                this.zzi = i14 + 1;
                if (bArr[i14] < 0) {
                    i13++;
                }
            }
            throw zzvk.zze();
            return true;
        }
        if (i12 == 1) {
            zzr(8);
            return true;
        }
        if (i12 == 2) {
            zzr(zzn());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw zzvk.zza();
            }
            zzr(4);
            return true;
        }
        do {
            zzc = zzc();
            if (zzc == 0) {
                break;
            }
        } while (zzk(zzc));
        zzg(((i11 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zzl() throws IOException {
        if (this.zzi == this.zzg) {
            zzw(1);
        }
        byte[] bArr = this.zzf;
        int i11 = this.zzi;
        this.zzi = i11 + 1;
        return bArr[i11];
    }

    public final int zzm() throws IOException {
        int i11 = this.zzi;
        if (this.zzg - i11 < 4) {
            zzw(4);
            i11 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final int zzn() throws IOException {
        int i11;
        int i12 = this.zzi;
        int i13 = this.zzg;
        if (i13 != i12) {
            byte[] bArr = this.zzf;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.zzi = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b12 = bArr[i19];
                            int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.zzi = i15;
                return i11;
            }
        }
        return (int) zzq();
    }

    public final long zzo() throws IOException {
        int i11 = this.zzi;
        if (this.zzg - i11 < 8) {
            zzw(8);
            i11 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    public final long zzp() throws IOException {
        long j11;
        long j12;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.zzi = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b11;
                if (i15 < 0) {
                    j11 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j11 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j13 = (-2080896) ^ i19;
                            i14 = i18;
                            j11 = j13;
                        } else {
                            i16 = i11 + 5;
                            long j14 = i19 ^ (bArr[i18] << 28);
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i14 = i11 + 6;
                                long j15 = (bArr[i16] << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i21 = i11 + 7;
                                    long j16 = j15 ^ (bArr[i14] << 42);
                                    if (j16 >= 0) {
                                        j11 = j16 ^ 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j15 = j16 ^ (bArr[i21] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i21 = i11 + 9;
                                            long j17 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i14 = i11 + 10;
                                                if (bArr[i21] >= 0) {
                                                    j11 = j17;
                                                }
                                            } else {
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    i14 = i21;
                                }
                                j11 = j15 ^ j12;
                            }
                        }
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return j11;
            }
        }
        return zzq();
    }

    final long zzq() throws IOException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((zzl() & 128) == 0) {
                return j11;
            }
        }
        throw zzvk.zze();
    }

    public final void zzr(int i11) throws IOException {
        int i12 = this.zzg;
        int i13 = this.zzi;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.zzi = i13 + i11;
            return;
        }
        if (i11 < 0) {
            throw zzvk.zzf();
        }
        int i15 = this.zzk;
        int i16 = i15 + i13;
        int i17 = this.zzl;
        if (i16 + i11 > i17) {
            zzr((i17 - i15) - i13);
            throw zzvk.zzj();
        }
        this.zzk = i16;
        this.zzg = 0;
        this.zzi = 0;
        while (i14 < i11) {
            try {
                long j11 = i11 - i14;
                try {
                    long skip = this.zze.skip(j11);
                    if (skip < 0 || skip > j11) {
                        String valueOf = String.valueOf(this.zze.getClass());
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 92);
                        sb2.append(valueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(skip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i14 += (int) skip;
                    }
                } catch (zzvk e11) {
                    e11.zzk();
                    throw e11;
                }
            } catch (Throwable th2) {
                this.zzk += i14;
                zzv();
                throw th2;
            }
        }
        this.zzk += i14;
        zzv();
        if (i14 >= i11) {
            return;
        }
        int i18 = this.zzg;
        int i19 = i18 - this.zzi;
        this.zzi = i18;
        zzw(1);
        while (true) {
            int i21 = i11 - i19;
            int i22 = this.zzg;
            if (i21 <= i22) {
                this.zzi = i21;
                return;
            } else {
                i19 += i22;
                this.zzi = i22;
                zzw(1);
            }
        }
    }
}
