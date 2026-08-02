package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mxi {
    public final int a;
    public final boolean b;
    public final jxi c;
    public final Long d;
    public final ixi e;
    public final Integer f;
    public final kxi g;
    public final lxi h;

    public mxi(int i, boolean z, jxi jxiVar, Long l, ixi ixiVar, Integer num, kxi kxiVar, lxi lxiVar) {
        this.a = i;
        this.b = z;
        this.c = jxiVar;
        this.d = l;
        this.e = ixiVar;
        this.f = num;
        this.g = kxiVar;
        this.h = lxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxi)) {
            return false;
        }
        mxi mxiVar = (mxi) obj;
        return this.a == mxiVar.a && this.b == mxiVar.b && Intrinsics.c(this.c, mxiVar.c) && Intrinsics.c(this.d, mxiVar.d) && Intrinsics.c(this.e, mxiVar.e) && Intrinsics.c(this.f, mxiVar.f) && Intrinsics.c(this.g, mxiVar.g) && Intrinsics.c(this.h, mxiVar.h);
    }

    public final int hashCode() {
        int e = dmi.e(Integer.hashCode(this.a) * 31, 31, this.b);
        jxi jxiVar = this.c;
        int hashCode = (e + (jxiVar == null ? 0 : jxiVar.hashCode())) * 31;
        Long l = this.d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ixi ixiVar = this.e;
        int hashCode3 = (hashCode2 + (ixiVar == null ? 0 : ixiVar.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        kxi kxiVar = this.g;
        int hashCode5 = (hashCode4 + (kxiVar == null ? 0 : kxiVar.hashCode())) * 31;
        lxi lxiVar = this.h;
        return hashCode5 + (lxiVar != null ? lxiVar.hashCode() : 0);
    }

    public final String toString() {
        return "TeamInfoUiModel(id=" + this.a + ", isNational=" + this.b + ", manager=" + this.c + ", foundationDateTimestamp=" + this.d + ", country=" + this.e + ", superbowlWins=" + this.f + ", ranking=" + this.g + ", venue=" + this.h + ")";
    }
}
