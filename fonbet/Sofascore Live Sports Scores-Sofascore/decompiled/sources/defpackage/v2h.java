package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v2h {
    public final d1g a;
    public final int b;
    public final long c;

    public v2h(d1g d1gVar, int i, long j) {
        this.a = d1gVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h)) {
            return false;
        }
        v2h v2hVar = (v2h) obj;
        return this.a == v2hVar.a && this.b == v2hVar.b && this.c == v2hVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return fn0.n(sb, this.c, ')');
    }
}
