package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s47 implements u47 {
    public final String a;
    public final int b;

    public s47(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s47)) {
            return false;
        }
        s47 s47Var = (s47) obj;
        return this.a.equals(s47Var.a) && this.b == s47Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return vxd.k(this.b, "OnTeamClick(userId=", this.a, ", roundId=", ")");
    }
}
