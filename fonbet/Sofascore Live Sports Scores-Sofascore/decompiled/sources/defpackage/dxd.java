package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dxd extends pea {
    public final oqf g;

    public dxd(oqf oqfVar) {
        this.g = oqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dxd) {
            return this.g.equals(((dxd) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.pea
    public final oqf v() {
        return this.g;
    }
}
