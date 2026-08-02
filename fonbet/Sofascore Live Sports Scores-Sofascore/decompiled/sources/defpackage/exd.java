package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class exd extends pea {
    public final e7g g;
    public final b20 h;

    public exd(e7g e7gVar) {
        b20 b20Var;
        this.g = e7gVar;
        if (uaa.t(e7gVar)) {
            b20Var = null;
        } else {
            b20Var = e20.a();
            b20.c(b20Var, e7gVar);
        }
        this.h = b20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof exd) {
            return this.g.equals(((exd) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.pea
    public final oqf v() {
        e7g e7gVar = this.g;
        return new oqf(e7gVar.a, e7gVar.b, e7gVar.c, e7gVar.d);
    }
}
