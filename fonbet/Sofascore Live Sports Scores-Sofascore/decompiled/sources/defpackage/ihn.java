package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzamz;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ihn implements zzahk {
    public final long a;
    public final jhn[] b;
    public final int c;

    public ihn(long j, jhn[] jhnVarArr, int i) {
        this.a = j;
        this.b = jhnVarArr;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int b;
        long j7 = j;
        jhn[] jhnVarArr = this.b;
        int length = jhnVarArr.length;
        zzahl zzahlVar = zzahl.c;
        if (length == 0) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = this.c;
        if (i != -1) {
            zzamz zzamzVar = jhnVarArr[i].b;
            int i2 = zzamp.G;
            int a = zzamzVar.a(j7);
            if (a == -1) {
                a = zzamzVar.b(j7);
            }
            if (a == -1) {
                return new zzahi(zzahlVar, zzahlVar);
            }
            long[] jArr = zzamzVar.f;
            long j8 = jArr[a];
            long[] jArr2 = zzamzVar.c;
            j2 = jArr2[a];
            if (j8 >= j7 || a >= zzamzVar.b - 1 || (b = zzamzVar.b(j7)) == -1 || b == a) {
                j5 = C.TIME_UNSET;
                j6 = -1;
            } else {
                long j9 = jArr[b];
                j6 = jArr2[b];
                j5 = j9;
            }
            j4 = j6;
            j3 = j5;
            j7 = j8;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = C.TIME_UNSET;
            j4 = -1;
        }
        long j10 = j2;
        long j11 = j4;
        for (int i3 = 0; i3 < jhnVarArr.length; i3++) {
            if (i3 != i) {
                zzamz zzamzVar2 = jhnVarArr[i3].b;
                long[] jArr3 = zzamzVar2.c;
                int i4 = zzamp.G;
                int a2 = zzamzVar2.a(j7);
                if (a2 == -1) {
                    a2 = zzamzVar2.b(j7);
                }
                if (a2 != -1) {
                    j10 = Math.min(jArr3[a2], j10);
                }
                if (j3 != C.TIME_UNSET) {
                    int a3 = zzamzVar2.a(j3);
                    if (a3 == -1) {
                        a3 = zzamzVar2.b(j3);
                    }
                    if (a3 != -1) {
                        j11 = Math.min(jArr3[a3], j11);
                    }
                }
            }
        }
        zzahl zzahlVar2 = new zzahl(j7, j10);
        return j3 == C.TIME_UNSET ? new zzahi(zzahlVar2, zzahlVar2) : new zzahi(zzahlVar2, new zzahl(j3, j11));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
