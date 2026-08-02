package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yv1 implements a0h {
    public final bw1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public yv1(bw1 bw1Var, long j, long j2, long j3, long j4, long j5) {
        this.a = bw1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.b;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        e0h e0hVar = new e0h(j, aw1.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new yzg(e0hVar, e0hVar);
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }
}
