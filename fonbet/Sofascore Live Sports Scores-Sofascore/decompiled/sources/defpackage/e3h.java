package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e3h {
    public final k69 a;
    public final long b;
    public final d3h c;
    public final boolean d;

    public e3h(k69 k69Var, long j, d3h d3hVar, boolean z) {
        this.a = k69Var;
        this.b = j;
        this.c = d3hVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3h)) {
            return false;
        }
        e3h e3hVar = (e3h) obj;
        return this.a == e3hVar.a && dnd.c(this.b, e3hVar.b) && this.c == e3hVar.c && this.d == e3hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ljg.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) dnd.k(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return lnb.r(sb, this.d, ')');
    }
}
