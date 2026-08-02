package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vl4 {
    public final nr9 a;
    public final boolean b;

    public vl4(nr9 nr9Var, boolean z) {
        this.a = nr9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl4)) {
            return false;
        }
        vl4 vl4Var = (vl4) obj;
        return this.a.equals(vl4Var.a) && this.b == vl4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
