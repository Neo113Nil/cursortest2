package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v75 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public v75(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v75)) {
            return false;
        }
        v75 v75Var = (v75) obj;
        return this.a == v75Var.a && this.b.equals(v75Var.b) && this.c.equals(v75Var.c) && this.d.equals(v75Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return fc6.o(dmi.t(this.a, "DraftLotteryData(teamId=", ", teamName=", this.b, ", probability="), this.c, ", tradedFrom=", this.d, ")");
    }
}
