package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mnj implements pnj {
    public final wj1 a;

    public mnj(wj1 wj1Var) {
        wj1Var.getClass();
        this.a = wj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnj) && this.a == ((mnj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseballStatFilter(value=" + this.a + ")";
    }
}
