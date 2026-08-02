package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hq9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public hq9(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hq9)) {
            return false;
        }
        hq9 hq9Var = (hq9) obj;
        long j = hq9Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, hq9Var.b) && e8k.a(this.c, hq9Var.c) && e8k.a(this.d, hq9Var.d);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.d) + ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
