package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ul1 implements jl1 {
    public final tee a;
    public final nl1 b;
    public final nl1 c;
    public final String d;

    public ul1(tee teeVar, nl1 nl1Var, nl1 nl1Var2, String str) {
        teeVar.getClass();
        this.a = teeVar;
        this.b = nl1Var;
        this.c = nl1Var2;
        this.d = str;
    }

    @Override // defpackage.jl1
    public final nl1 a() {
        return this.b;
    }

    @Override // defpackage.jl1
    public final nl1 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul1)) {
            return false;
        }
        ul1 ul1Var = (ul1) obj;
        return Intrinsics.c(this.a, ul1Var.a) && this.b.equals(ul1Var.b) && Intrinsics.c(this.c, ul1Var.c) && this.d.equals(ul1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        nl1 nl1Var = this.c;
        return this.d.hashCode() + ((hashCode + (nl1Var == null ? 0 : nl1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ZoneGraphData(zoneValues=" + this.a + ", primaryFilterState=" + this.b + ", secondaryFilterState=" + this.c + ", emptyZoneDisplayValue=" + this.d + ")";
    }
}
