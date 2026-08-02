package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l7g {
    public final long a;
    public final long b;

    public l7g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7g)) {
            return false;
        }
        l7g l7gVar = (l7g) obj;
        return this.a == l7gVar.a && this.b == l7gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.l(this.b, ")", ljg.o("RoundTimeframe(start=", this.a, ", end="));
    }
}
