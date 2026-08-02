package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzyo {
    private final zzabd zza;
    private final zzes zzb = new zzes(32);
    private zzyn zzc;
    private zzyn zzd;
    private zzyn zze;
    private long zzf;

    public zzyo(zzabd zzabdVar) {
        this.zza = zzabdVar;
        zzyn zzynVar = new zzyn(0L, 65536);
        this.zzc = zzynVar;
        this.zzd = zzynVar;
        this.zze = zzynVar;
    }

    private final int zzi(int i) {
        zzyn zzynVar = this.zze;
        if (zzynVar.zzc == null) {
            zzabb zza = this.zza.zza();
            zzyn zzynVar2 = new zzyn(this.zze.zzb, 65536);
            zzynVar.zzc = zza;
            zzynVar.zzd = zzynVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + i;
        this.zzf = j;
        zzyn zzynVar = this.zze;
        if (j == zzynVar.zzb) {
            this.zze = zzynVar.zzd;
        }
    }

    private static zzyn zzk(zzyn zzynVar, zzip zzipVar, zzyp zzypVar, zzes zzesVar) {
        zzyn zzynVar2;
        if (zzipVar.zzk()) {
            long j = zzypVar.zzb;
            int i = 1;
            zzesVar.zza(1);
            zzyn zzm = zzm(zzynVar, j, zzesVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzesVar.zzi()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzim zzimVar = zzipVar.zzb;
            byte[] bArr = zzimVar.zza;
            if (bArr == null) {
                zzimVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzynVar2 = zzm(zzm, j2, zzimVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzesVar.zza(2);
                zzynVar2 = zzm(zzynVar2, j3, zzesVar.zzi(), 2);
                j3 += 2;
                i = zzesVar.zzt();
            }
            int i4 = i;
            int[] iArr = zzimVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzimVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzesVar.zza(i5);
                zzynVar2 = zzm(zzynVar2, j3, zzesVar.zzi(), i5);
                j3 += i5;
                zzesVar.zzh(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzesVar.zzt();
                    iArr4[i6] = zzesVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzypVar.zza - ((int) (j3 - zzypVar.zzb));
            }
            zzaha zzahaVar = zzypVar.zzc;
            String str = zzfk.zza;
            zzimVar.zza(i4, iArr2, iArr4, zzahaVar.zzb, zzimVar.zza, zzahaVar.zza, zzahaVar.zzc, zzahaVar.zzd);
            long j4 = zzypVar.zzb;
            int i7 = (int) (j3 - j4);
            zzypVar.zzb = j4 + i7;
            zzypVar.zza -= i7;
        } else {
            zzynVar2 = zzynVar;
        }
        if (!zzipVar.zze()) {
            zzipVar.zzj(zzypVar.zza);
            return zzl(zzynVar2, zzypVar.zzb, zzipVar.zzc, zzypVar.zza);
        }
        zzesVar.zza(4);
        zzyn zzm2 = zzm(zzynVar2, zzypVar.zzb, zzesVar.zzi(), 4);
        int zzH = zzesVar.zzH();
        zzypVar.zzb += 4;
        zzypVar.zza -= 4;
        zzipVar.zzj(zzH);
        zzyn zzl = zzl(zzm2, zzypVar.zzb, zzipVar.zzc, zzH);
        zzypVar.zzb += zzH;
        int i8 = zzypVar.zza - zzH;
        zzypVar.zza = i8;
        ByteBuffer byteBuffer = zzipVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzipVar.zzf = ByteBuffer.allocate(i8);
        } else {
            zzipVar.zzf.clear();
        }
        return zzl(zzl, zzypVar.zzb, zzipVar.zzf, zzypVar.zza);
    }

    private static zzyn zzl(zzyn zzynVar, long j, ByteBuffer byteBuffer, int i) {
        zzyn zzn = zzn(zzynVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzyn zzm(zzyn zzynVar, long j, byte[] bArr, int i) {
        zzyn zzn = zzn(zzynVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j));
            System.arraycopy(zzn.zzc.zza, zzn.zzb(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzyn zzn(zzyn zzynVar, long j) {
        while (j >= zzynVar.zzb) {
            zzynVar = zzynVar.zzd;
        }
        return zzynVar;
    }

    public final void zza() {
        zzyn zzynVar = this.zzc;
        if (zzynVar.zzc != null) {
            this.zza.zzc(zzynVar);
            zzynVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyn zzynVar2 = this.zzc;
        this.zzd = zzynVar2;
        this.zze = zzynVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzip zzipVar, zzyp zzypVar) {
        this.zzd = zzk(this.zzd, zzipVar, zzypVar, this.zzb);
    }

    public final void zzd(zzip zzipVar, zzyp zzypVar) {
        zzk(this.zzd, zzipVar, zzypVar, this.zzb);
    }

    public final void zze(long j) {
        zzyn zzynVar;
        if (j != -1) {
            while (true) {
                zzynVar = this.zzc;
                if (j < zzynVar.zzb) {
                    break;
                }
                this.zza.zzb(zzynVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzynVar.zza) {
                this.zzd = zzynVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzyn zzynVar = this.zze;
        int zza = zzjVar.zza(zzynVar.zzc.zza, zzynVar.zzb(this.zzf), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzes zzesVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzyn zzynVar = this.zze;
            zzesVar.zzm(zzynVar.zzc.zza, zzynVar.zzb(this.zzf), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
