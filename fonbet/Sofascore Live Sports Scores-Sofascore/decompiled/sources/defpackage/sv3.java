package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sv3 {
    public final String a;
    public final String b;

    public sv3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3)) {
            return false;
        }
        sv3 sv3Var = (sv3) obj;
        return this.a.equals(sv3Var.a) && this.b.equals(sv3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("SuffixMatch(baseName=", this.a, ", suffix=", this.b, ")");
    }
}
