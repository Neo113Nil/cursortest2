package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q91 {
    public final wj1 a;

    public q91(wj1 wj1Var) {
        this.a = wj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q91) && this.a == ((q91) obj).a;
    }

    public final int hashCode() {
        wj1 wj1Var = this.a;
        if (wj1Var == null) {
            return 0;
        }
        return wj1Var.hashCode();
    }

    public final String toString() {
        return "OnSeeAllClick(currentType=" + this.a + ")";
    }
}
