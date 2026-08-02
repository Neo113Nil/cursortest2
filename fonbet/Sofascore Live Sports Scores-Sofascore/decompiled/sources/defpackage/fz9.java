package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fz9 extends iz9 {
    public final Integer c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final boolean j;

    public fz9(Integer num, String str, boolean z, String str2, String str3, Integer num2, Integer num3, boolean z2) {
        str.getClass();
        this.c = num;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = num2;
        this.i = num3;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz9)) {
            return false;
        }
        fz9 fz9Var = (fz9) obj;
        return Intrinsics.c(this.c, fz9Var.c) && Intrinsics.c(this.d, fz9Var.d) && this.e == fz9Var.e && Intrinsics.c(this.f, fz9Var.f) && Intrinsics.c(this.g, fz9Var.g) && Intrinsics.c(this.h, fz9Var.h) && Intrinsics.c(this.i, fz9Var.i) && this.j == fz9Var.j;
    }

    public final int hashCode() {
        Integer num = this.c;
        int e = dmi.e(dmi.c((num == null ? 0 : num.hashCode()) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        return Boolean.hashCode(this.j) + ((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = wv8.m("PeriodIncident(id=", this.c, ", text=", this.d, ", isLive=");
        m.append(this.e);
        m.append(", sport=");
        m.append(this.f);
        m.append(", period=");
        me4.o(this.h, this.g, ", homeScore=", ", awayScore=", m);
        m.append(this.i);
        m.append(", expanded=");
        m.append(this.j);
        m.append(")");
        return m.toString();
    }
}
