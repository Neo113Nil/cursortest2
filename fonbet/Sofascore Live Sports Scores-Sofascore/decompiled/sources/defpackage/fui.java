package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fui {
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public fui(String str, int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fui)) {
            return false;
        }
        fui fuiVar = (fui) obj;
        return this.a == fuiVar.a && this.b.equals(fuiVar.b) && this.c == fuiVar.c && this.d == fuiVar.d && this.e == fuiVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "UniqueTournamentWins(id=", ", name=", this.b, ", wins=");
        t.append(this.c);
        t.append(", isMajor=");
        t.append(this.d);
        t.append(", isClickable=");
        return wt3.p(t, this.e, ")");
    }
}
