package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0l implements b0h {
    public final k9e a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public a0l(k9e k9eVar, int i, long j, long j2) {
        this.a = k9eVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / k9eVar.c;
        this.d = j3;
        this.e = d(j3);
    }

    public final long d(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = nik.a;
        return nik.b0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.e;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        k9e k9eVar = this.a;
        long j2 = this.d - 1;
        long k = nik.k((k9eVar.b * j) / (this.b * 1000000), 0L, j2);
        int i = k9eVar.c;
        long j3 = this.c;
        long d = d(k);
        f0h f0hVar = new f0h(d, (i * k) + j3);
        if (d >= j || k == j2) {
            return new zzg(f0hVar, f0hVar);
        }
        long j4 = k + 1;
        return new zzg(f0hVar, new f0h(d(j4), (i * j4) + j3));
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
