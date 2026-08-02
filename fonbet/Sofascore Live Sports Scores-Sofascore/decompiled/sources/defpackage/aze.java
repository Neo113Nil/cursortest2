package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aze implements cze {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public aze(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aze)) {
            return false;
        }
        aze azeVar = (aze) obj;
        return this.a == azeVar.a && this.b.equals(azeVar.b) && this.c == azeVar.c && this.d == azeVar.d && this.e == azeVar.e && this.f == azeVar.f && this.g == azeVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + dmi.e(dmi.e(dmi.e(dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "ExpandableSet(set=", ", duration=", this.b, ", isLive=");
        vxd.t(", isExpanded=", ", showDivider=", t, this.c, this.d);
        vxd.t(", isFirstItem=", ", isLastItem=", t, this.e, this.f);
        return wt3.p(t, this.g, ")");
    }
}
