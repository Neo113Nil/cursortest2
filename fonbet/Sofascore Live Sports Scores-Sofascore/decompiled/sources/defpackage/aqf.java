package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aqf implements cqf {
    public final int a;
    public final String b;
    public final int c;
    public final String d;

    public aqf(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf)) {
            return false;
        }
        aqf aqfVar = (aqf) obj;
        return this.a == aqfVar.a && this.b.equals(aqfVar.b) && this.c == aqfVar.c && this.d.equals(aqfVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "Doubles(subTeam1Id=", ", subTeam1Name=", this.b, ", subTeam2Id=");
        t.append(this.c);
        t.append(", subTeam2Name=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
