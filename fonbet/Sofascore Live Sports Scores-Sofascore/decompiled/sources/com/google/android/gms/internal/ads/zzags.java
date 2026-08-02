package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzags implements zzahk {
    public final zzagu a;
    public final long b;

    public zzags(zzagu zzaguVar, long j) {
        this.a = zzaguVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzagu zzaguVar = this.a;
        zzagt zzagtVar = zzaguVar.k;
        zzagtVar.getClass();
        String str = zzfm.a;
        long max = Math.max(0L, Math.min((zzaguVar.e * j) / 1000000, zzaguVar.j - 1));
        long[] jArr = zzagtVar.a;
        int s = zzfm.s(jArr, max, false);
        long j2 = s == -1 ? 0L : jArr[s];
        long[] jArr2 = zzagtVar.b;
        long j3 = s != -1 ? jArr2[s] : 0L;
        int i = zzaguVar.e;
        long j4 = (j2 * 1000000) / i;
        long j5 = this.b;
        zzahl zzahlVar = new zzahl(j4, j3 + j5);
        if (j4 == j || s == jArr.length - 1) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i2 = s + 1;
        return new zzahi(zzahlVar, new zzahl((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
