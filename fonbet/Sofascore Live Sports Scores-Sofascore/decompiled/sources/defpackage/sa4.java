package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sa4 {
    public final oif a;
    public final boolean b;

    public sa4(oif oifVar, boolean z) {
        this.a = oifVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sa4) {
            sa4 sa4Var = (sa4) obj;
            if (sa4Var.a.equals(this.a) && sa4Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
