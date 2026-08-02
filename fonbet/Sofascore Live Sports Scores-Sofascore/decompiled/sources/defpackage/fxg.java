package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fxg implements nxg {
    public final e93 a;
    public final int b;

    public fxg(e93 e93Var, int i) {
        e93Var.getClass();
        this.a = e93Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxg)) {
            return false;
        }
        fxg fxgVar = (fxg) obj;
        return this.a == fxgVar.a && this.b == fxgVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnEntitySelected(slotIndex=" + this.a + ", entityId=" + this.b + ")";
    }
}
