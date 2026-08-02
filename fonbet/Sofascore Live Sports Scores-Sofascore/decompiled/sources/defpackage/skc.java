package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class skc {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public skc(int i, int i2, int i3, int i4, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skc)) {
            return false;
        }
        skc skcVar = (skc) obj;
        return this.a == skcVar.a && this.b.equals(skcVar.b) && this.c == skcVar.c && this.d == skcVar.d && this.e == skcVar.e && this.f == skcVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dmi.e(wv8.a(this.d, wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "MissingPlayerUiModel(playerId=", ", name=", this.b, ", iconRes=");
        me4.q(t, this.c, ", colorRes=", this.d, ", tintIcon=");
        t.append(this.e);
        t.append(", reasonRes=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
