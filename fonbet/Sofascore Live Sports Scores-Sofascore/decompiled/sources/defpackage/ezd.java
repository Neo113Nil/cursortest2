package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ezd implements gzd {
    public final wj1 a;

    public ezd(wj1 wj1Var) {
        this.a = wj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezd) && this.a == ((ezd) obj).a;
    }

    public final int hashCode() {
        wj1 wj1Var = this.a;
        if (wj1Var == null) {
            return 0;
        }
        return wj1Var.hashCode();
    }

    public final String toString() {
        return "Baseball(type=" + this.a + ")";
    }
}
