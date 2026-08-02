package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class clf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public clf(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof clf)) {
            return false;
        }
        clf clfVar = (clf) obj;
        long j = clfVar.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, clfVar.b) && e8k.a(this.c, clfVar.c) && e8k.a(this.d, clfVar.d);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.d) + ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
