package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xgn implements vgn {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public xgn(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.vgn
    public final long a(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int s = zzfm.s(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (s * j3) / 100;
        long j5 = jArr[s];
        int i = s + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (s == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        double d;
        double d2;
        boolean zzb = zzb();
        int i = this.b;
        long j2 = this.a;
        if (!zzb) {
            zzahl zzahlVar = new zzahl(0L, j2 + i);
            return new zzahi(zzahlVar, zzahlVar);
        }
        String str = zzfm.a;
        long j3 = this.c;
        long max = Math.max(0L, Math.min(j, j3));
        double d3 = (max * 100.0d) / j3;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        zzahl zzahlVar2 = new zzahl(max, j2 + Math.max(i, Math.min(Math.round((d4 / d) * j4), j4 - 1)));
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.g != null;
    }

    @Override // defpackage.vgn
    public final long zzg() {
        return this.f;
    }

    @Override // defpackage.vgn
    public final int zzh() {
        return this.d;
    }
}
