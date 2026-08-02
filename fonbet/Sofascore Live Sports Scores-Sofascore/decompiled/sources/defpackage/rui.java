package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rui {
    public final gv9 a;
    public final Integer b;
    public final gv9 c;

    public rui(gv9 gv9Var, Integer num, gv9 gv9Var2) {
        this.a = gv9Var;
        this.b = num;
        this.c = gv9Var2;
    }

    public static rui a(rui ruiVar, Integer num, gv9 gv9Var, int i) {
        gv9 gv9Var2 = ruiVar.a;
        if ((i & 2) != 0) {
            num = ruiVar.b;
        }
        if ((i & 4) != 0) {
            gv9Var = ruiVar.c;
        }
        ruiVar.getClass();
        return new rui(gv9Var2, num, gv9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rui)) {
            return false;
        }
        rui ruiVar = (rui) obj;
        return this.a.equals(ruiVar.a) && Intrinsics.c(this.b, ruiVar.b) && this.c.equals(ruiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "TeamAwardsDataUIModel(awardedPeriods=" + this.a + ", selectedPeriod=" + this.b + ", teamOfThePeriodData=" + this.c + ")";
    }
}
