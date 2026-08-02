package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzk implements a0h {
    public final k9e a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public zzk(k9e k9eVar, int i, long j, long j2) {
        this.a = k9eVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / k9eVar.c;
        this.d = j3;
        this.e = lik.D(j3 * i, 1000000L, k9eVar.b);
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.e;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        k9e k9eVar = this.a;
        int i = this.b;
        long j2 = this.d - 1;
        long i2 = lik.i((k9eVar.b * j) / (i * 1000000), 0L, j2);
        int i3 = k9eVar.c;
        long j3 = this.c;
        long D = lik.D(i2 * i, 1000000L, k9eVar.b);
        e0h e0hVar = new e0h(D, (i3 * i2) + j3);
        if (D >= j || i2 == j2) {
            return new yzg(e0hVar, e0hVar);
        }
        long j4 = i2 + 1;
        return new yzg(e0hVar, new e0h(lik.D(j4 * i, 1000000L, k9eVar.b), (i3 * j4) + j3));
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }
}
