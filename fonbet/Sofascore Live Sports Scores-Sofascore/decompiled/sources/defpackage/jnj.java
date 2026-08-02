package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jnj implements lnj {
    public final gz3 a;

    public jnj(gz3 gz3Var) {
        gz3Var.getClass();
        this.a = gz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnj) && this.a == ((jnj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CricketFilter(value=" + this.a + ")";
    }
}
