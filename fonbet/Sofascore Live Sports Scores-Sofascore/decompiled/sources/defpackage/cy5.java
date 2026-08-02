package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cy5 {
    public final String a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final boolean f;
    public final int g;

    public cy5(String str, String str2, String str3, float f, float f2, boolean z, int i) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy5)) {
            return false;
        }
        cy5 cy5Var = (cy5) obj;
        return Intrinsics.c(this.a, cy5Var.a) && Intrinsics.c(this.b, cy5Var.b) && Intrinsics.c(this.c, cy5Var.c) && Float.compare(this.d, cy5Var.d) == 0 && Float.compare(this.e, cy5Var.e) == 0 && this.f == cy5Var.f && this.g == cy5Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + dmi.e(fc6.a(this.e, fc6.a(this.d, dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder s = mz1.s("EventStatisticsSummaryItem(name=", this.a, ", homeDisplay=", this.b, ", awayDisplay=");
        s.append(this.c);
        s.append(", homeProgress=");
        s.append(this.d);
        s.append(", awayProgress=");
        s.append(this.e);
        s.append(", isNegativeStatistic=");
        s.append(this.f);
        s.append(", compareCode=");
        return fc6.h(this.g, ")", s);
    }
}
