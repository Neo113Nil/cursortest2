package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lxg implements nxg {
    public final e93 a;
    public final String b;

    public lxg(e93 e93Var, String str) {
        e93Var.getClass();
        this.a = e93Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxg)) {
            return false;
        }
        lxg lxgVar = (lxg) obj;
        return this.a == lxgVar.a && this.b.equals(lxgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSecondaryPickerSelected(slotIndex=" + this.a + ", key=" + this.b + ")";
    }
}
