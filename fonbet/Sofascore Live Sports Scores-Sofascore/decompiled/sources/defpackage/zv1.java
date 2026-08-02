package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zv1 implements b0h {
    public final cw1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zv1(cw1 cw1Var, long j, long j2, long j3, long j4, long j5) {
        this.a = cw1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.b;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        f0h f0hVar = new f0h(j, aw1.b(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
