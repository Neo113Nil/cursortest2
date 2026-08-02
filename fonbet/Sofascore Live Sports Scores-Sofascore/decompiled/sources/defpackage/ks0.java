package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ks0 extends nx2 {
    public final hs0 a;

    public ks0(hs0 hs0Var) {
        this.a = hs0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nx2)) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        Object obj2 = mx2.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((ks0) nx2Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((mx2.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + mx2.a + ", androidClientInfo=" + this.a + "}";
    }
}
