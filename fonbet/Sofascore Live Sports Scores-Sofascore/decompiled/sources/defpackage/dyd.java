package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dyd {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;

    public dyd(String str, String str2, boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyd)) {
            return false;
        }
        dyd dydVar = (dyd) obj;
        return this.a == dydVar.a && this.b == dydVar.b && this.c == dydVar.c && this.d.equals(dydVar.d) && this.e == dydVar.e && Intrinsics.c(this.f, dydVar.f) && this.g == dydVar.g;
    }

    public final int hashCode() {
        int a = wv8.a(this.e, dmi.c(wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "OverSummaryData(over=", ", runs=", ", wickets=");
        vxd.p(this.c, ", score=", this.d, ", battingTeamId=", s);
        vxd.p(this.e, ", battingTeamNameCode=", this.f, ", isSuperOver=", s);
        return wt3.p(s, this.g, ")");
    }
}
