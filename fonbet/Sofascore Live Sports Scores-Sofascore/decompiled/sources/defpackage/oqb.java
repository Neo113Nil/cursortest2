package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oqb {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final Map e;

    public oqb(String str, String str2, Map map, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqb)) {
            return false;
        }
        oqb oqbVar = (oqb) obj;
        return this.a.equals(oqbVar.a) && this.b.equals(oqbVar.b) && this.c == oqbVar.c && this.d == oqbVar.d && this.e.equals(oqbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + wv8.a(this.d, wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("AppliedFilterValue(queryToday=", this.a, ", queryOtherDays=", this.b, ", activeFiltersToday=");
        me4.q(s, this.c, ", activeFiltersOtherDays=", this.d, ", appliedFilters=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
