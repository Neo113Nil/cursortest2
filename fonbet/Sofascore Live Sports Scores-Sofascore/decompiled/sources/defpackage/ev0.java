package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ev0 {
    public final fv0 a;
    public final hv0 b;
    public final gv0 c;

    public ev0(fv0 fv0Var, hv0 hv0Var, gv0 gv0Var) {
        this.a = fv0Var;
        this.b = hv0Var;
        this.c = gv0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return this.a.equals(ev0Var.a) && this.b.equals(ev0Var.b) && this.c.equals(ev0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
