package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uk7 {
    public final q9k a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final boolean e;

    public uk7(q9k q9kVar, String str, Integer num, Integer num2, boolean z) {
        str.getClass();
        this.a = q9kVar;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk7)) {
            return false;
        }
        uk7 uk7Var = (uk7) obj;
        return Intrinsics.c(this.a, uk7Var.a) && Intrinsics.c(this.b, uk7Var.b) && Intrinsics.c(this.c, uk7Var.c) && Intrinsics.c(this.d, uk7Var.d) && this.e == uk7Var.e;
    }

    public final int hashCode() {
        int c = dmi.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyStatisticsOverviewData(text=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", rank=");
        vxd.r(this.c, this.d, ", count=", ", isAvgRating=", sb);
        return wt3.p(sb, this.e, ")");
    }
}
