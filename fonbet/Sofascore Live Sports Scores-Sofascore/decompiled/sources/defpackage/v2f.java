package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v2f {
    public final gv9 a;
    public final boolean b;

    public v2f(gv9 gv9Var, boolean z) {
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2f)) {
            return false;
        }
        v2f v2fVar = (v2f) obj;
        return this.a.equals(v2fVar.a) && this.b == v2fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PowerRankingsCompactState(rankings=" + this.a + ", isDiffEnabled=" + this.b + ")";
    }
}
