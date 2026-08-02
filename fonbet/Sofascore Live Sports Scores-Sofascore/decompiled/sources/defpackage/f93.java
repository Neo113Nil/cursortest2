package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f93 {
    public final String a;
    public final String b;
    public final nc7 c;
    public final String d;
    public final int e;

    public f93(String str, String str2, nc7 nc7Var, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = nc7Var;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93)) {
            return false;
        }
        f93 f93Var = (f93) obj;
        return Intrinsics.c(this.a, f93Var.a) && Intrinsics.c(this.b, f93Var.b) && this.c == f93Var.c && this.d.equals(f93Var.d) && this.e == f93Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        nc7 nc7Var = this.c;
        return Integer.hashCode(this.e) + dmi.c((hashCode2 + (nc7Var != null ? nc7Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder s = mz1.s("ComparisonStatisticData(valueFirst=", this.a, ", valueSecond=", this.b, ", highlightIndex=");
        s.append(this.c);
        s.append(", label=");
        s.append(this.d);
        s.append(", stringRes=");
        return fc6.h(this.e, ")", s);
    }
}
