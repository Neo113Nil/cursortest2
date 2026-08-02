package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zkj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zkj(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zkj)) {
            return false;
        }
        zkj zkjVar = (zkj) obj;
        long j = zkjVar.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, zkjVar.b) && e8k.a(this.c, zkjVar.c) && e8k.a(this.d, zkjVar.d) && e8k.a(this.e, zkjVar.e) && e8k.a(this.f, zkjVar.f);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.f) + ljg.c(ljg.c(ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
