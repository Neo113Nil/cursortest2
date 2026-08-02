package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pb implements vb {
    public final long a;
    public final long b;
    public final sb c;
    public final int d;

    public pb(long j, long j2, sb sbVar, int i) {
        this.a = j;
        this.b = j2;
        this.c = sbVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return dnd.c(this.a, pbVar.a) && dnd.c(this.b, pbVar.b) && this.c == pbVar.c && this.d == pbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ljg.c(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("ArrowUiModel(start=", dnd.k(this.a), ", end=", dnd.k(this.b), ", lineStyle=");
        s.append(this.c);
        s.append(", colorResId=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
