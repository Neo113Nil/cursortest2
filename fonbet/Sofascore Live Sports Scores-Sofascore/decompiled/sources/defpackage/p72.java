package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p72 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public p72(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final p72 a(long j, long j2, long j3, long j4) {
        return new p72(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p72)) {
            return false;
        }
        p72 p72Var = (p72) obj;
        long j = p72Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, p72Var.b) && e8k.a(this.c, p72Var.c) && e8k.a(this.d, p72Var.d);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.d) + ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
