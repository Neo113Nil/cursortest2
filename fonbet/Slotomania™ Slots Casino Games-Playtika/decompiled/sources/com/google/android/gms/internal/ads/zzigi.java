package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzigi {
    private static final zzigi zza = new zzigi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzigi() {
        this(0, new int[8], new Object[8], true);
    }

    private zzigi(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzigi zza() {
        return zza;
    }

    static zzigi zzb() {
        return new zzigi();
    }

    static zzigi zzc(zzigi zzigiVar, zzigi zzigiVar2) {
        int i = zzigiVar.zzb + zzigiVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzigiVar.zzc, i);
        System.arraycopy(zzigiVar2.zzc, 0, copyOf, zzigiVar.zzb, zzigiVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzigiVar.zzd, i);
        System.arraycopy(zzigiVar2.zzd, 0, copyOf2, zzigiVar.zzb, zzigiVar2.zzb);
        return new zzigi(i, copyOf, copyOf2, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzigi)) {
            return false;
        }
        zzigi zzigiVar = (zzigi) obj;
        int i = this.zzb;
        if (i == zzigiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzigiVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzigiVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzigw zzigwVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzigwVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzigw zzigwVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzigwVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzigwVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzigwVar.zzn(i4, (zzicn) obj);
                } else if (i3 == 3) {
                    zzigwVar.zzt(i4);
                    ((zzigi) obj).zzg(zzigwVar);
                    zzigwVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzief("Protocol message tag had invalid wire type."));
                    }
                    zzigwVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzicn zzicnVar = (zzicn) this.zzd[i3];
            int zzF = zzicw.zzF(8);
            int zzF2 = zzicw.zzF(16) + zzicw.zzF(i4);
            int zzF3 = zzicw.zzF(24);
            int zzb = zzicnVar.zzb();
            i2 += zzF + zzF + zzF2 + zzF3 + zzicw.zzF(zzb) + zzb;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzF;
        int zzG;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzicw.zzF(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzicn zzicnVar = (zzicn) this.zzd[i4];
                    int zzF2 = zzicw.zzF(i8);
                    int zzb = zzicnVar.zzb();
                    i = zzF2 + zzicw.zzF(zzb) + zzb;
                } else if (i7 == 3) {
                    int zzF3 = zzicw.zzF(i6 << 3);
                    zzF = zzF3 + zzF3;
                    zzG = ((zzigi) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzief("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzicw.zzF(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzF = zzicw.zzF(i9);
                zzG = zzicw.zzG(longValue);
            }
            i = zzF + zzG;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzife.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final boolean zzl(int i, zzicr zzicrVar) throws IOException {
        int zza2;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zzicrVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zzicrVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zzicrVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zzicrVar.zzK();
                return false;
            }
            if (i2 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zzicrVar.zzj()));
            return true;
        }
        zzigi zzigiVar = new zzigi();
        do {
            zza2 = zzicrVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zzigiVar.zzl(zza2, zzicrVar));
        zzicrVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zzigiVar);
        return true;
    }

    final zzigi zzm(zzigi zzigiVar) {
        if (zzigiVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzigiVar.zzb;
        zzn(i);
        System.arraycopy(zzigiVar.zzc, 0, this.zzc, this.zzb, zzigiVar.zzb);
        System.arraycopy(zzigiVar.zzd, 0, this.zzd, this.zzb, zzigiVar.zzb);
        this.zzb = i;
        return this;
    }
}
