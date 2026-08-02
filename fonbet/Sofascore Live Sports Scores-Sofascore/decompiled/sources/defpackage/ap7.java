package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ap7 implements bp7 {
    public final oz6 a;

    public ap7(oz6 oz6Var) {
        this.a = oz6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap7) && this.a.equals(((ap7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.a + ")";
    }
}
