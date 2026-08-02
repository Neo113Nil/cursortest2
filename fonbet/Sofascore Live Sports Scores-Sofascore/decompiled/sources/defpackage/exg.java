package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class exg implements nxg {
    public final e93 a;

    public exg(e93 e93Var) {
        e93Var.getClass();
        this.a = e93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exg) && this.a == ((exg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnEntityCardClick(slotIndex=" + this.a + ")";
    }
}
