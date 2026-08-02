package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jw7 implements pw7 {
    public final int a;
    public final boolean b;

    public jw7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw7)) {
            return false;
        }
        jw7 jw7Var = (jw7) obj;
        return this.a == jw7Var.a && this.b == jw7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + dmi.e(Integer.hashCode(this.a) * 31, 31, true);
    }

    public final String toString() {
        return "OpenTeamAction(teamId=" + this.a + ", positionOnMatches=true, isGroupCard=" + this.b + ")";
    }
}
