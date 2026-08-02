package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class en1 {
    public final q9k a;
    public final q9k b;
    public final Boolean c;
    public final Integer d;
    public final boolean e;
    public final gv9 f;

    public en1(q9k q9kVar, q9k q9kVar2, Boolean bool, Integer num, boolean z, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = q9kVar;
        this.b = q9kVar2;
        this.c = bool;
        this.d = num;
        this.e = z;
        this.f = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en1)) {
            return false;
        }
        en1 en1Var = (en1) obj;
        return Intrinsics.c(this.a, en1Var.a) && Intrinsics.c(this.b, en1Var.b) && Intrinsics.c(this.c, en1Var.c) && Intrinsics.c(this.d, en1Var.d) && this.e == en1Var.e && Intrinsics.c(this.f, en1Var.f);
    }

    public final int hashCode() {
        q9k q9kVar = this.a;
        int hashCode = (q9kVar == null ? 0 : q9kVar.hashCode()) * 31;
        q9k q9kVar2 = this.b;
        int hashCode2 = (hashCode + (q9kVar2 == null ? 0 : q9kVar2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        return this.f.hashCode() + dmi.e((hashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "BaseballWeatherConditionInfo(title=" + this.a + ", weatherType=" + this.b + ", isLiveEvent=" + this.c + ", weatherIconRes=" + this.d + ", tintWeatherIcon=" + this.e + ", weatherStats=" + this.f + ")";
    }
}
