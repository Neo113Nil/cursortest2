package com.google.android.gms.internal.play_billing;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;
import xsna.b4q;
import xsna.lr;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzjk zzc() {
        return zza;
    }

    public static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
        int i = zzjkVar.zzb + zzjkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzjkVar.zzc, i);
        System.arraycopy(zzjkVar2.zzc, 0, copyOf, zzjkVar.zzb, zzjkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjkVar.zzd, i);
        System.arraycopy(zzjkVar2.zzd, 0, copyOf2, zzjkVar.zzb, zzjkVar2.zzb);
        return new zzjk(i, copyOf, copyOf2, true);
    }

    public static zzjk zzf() {
        return new zzjk(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
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
        if (obj == null || !(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        int i = this.zzb;
        if (i == zzjkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjkVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjkVar.zzd;
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

    public final int zza() {
        int zzz;
        int zzA;
        int zzz2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).getClass();
                    zzz2 = zzgr.zzz(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzgk zzgkVar = (zzgk) this.zzd[i3];
                    int zzz3 = zzgr.zzz(i7);
                    int zzd = zzgkVar.zzd();
                    i2 = zzgr.zzz(zzd) + zzd + zzz3 + i2;
                } else if (i6 == 3) {
                    int zzz4 = zzgr.zzz(i5 << 3);
                    zzz = zzz4 + zzz4;
                    zzA = ((zzjk) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i3]).getClass();
                    zzz2 = zzgr.zzz(i5 << 3) + 4;
                }
                i2 = zzz2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.zzd[i3]).longValue();
                zzz = zzgr.zzz(i8);
                zzA = zzgr.zzA(longValue);
            }
            i2 = zzA + zzz + i2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzgk zzgkVar = (zzgk) this.zzd[i3];
            int zzz = zzgr.zzz(8);
            int zzz2 = zzgr.zzz(i4) + zzgr.zzz(16);
            int zzz3 = zzgr.zzz(24);
            int zzd = zzgkVar.zzd();
            i2 = lr.a(zzz + zzz, zzz2, b4q.a(zzd, zzd, zzz3), i2);
        }
        this.zze = i2;
        return i2;
    }

    public final zzjk zzd(zzjk zzjkVar) {
        if (zzjkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzjkVar.zzb;
        zzm(i);
        System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
        System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzio.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzjw zzjwVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzjwVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzjw zzjwVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzjwVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzjwVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzjwVar.zzd(i4, (zzgk) obj);
                } else if (i3 == 3) {
                    zzjwVar.zzF(i4);
                    ((zzjk) obj).zzl(zzjwVar);
                    zzjwVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    zzjwVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzjk() {
        this(0, new int[8], new Object[8], true);
    }
}
