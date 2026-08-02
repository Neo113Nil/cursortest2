package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzafx implements zzahk {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public zzafx(long j, long j2, int i, int i2, boolean z) {
        long max;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            max = C.TIME_UNSET;
        } else {
            long j3 = j - j2;
            this.d = j3;
            max = (Math.max(0L, j3) * 8000000) / i;
        }
        this.f = max;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1) {
            zzahl zzahlVar = new zzahl(0L, j3);
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        zzahl zzahlVar2 = new zzahl(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new zzahi(zzahlVar2, new zzahl((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.d != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzj() {
        return this.g;
    }
}
