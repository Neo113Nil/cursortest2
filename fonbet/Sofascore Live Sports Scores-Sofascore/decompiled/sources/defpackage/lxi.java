package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lxi {
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;

    public lxi(int i, Integer num, String str, String str2, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxi)) {
            return false;
        }
        lxi lxiVar = (lxi) obj;
        return this.a == lxiVar.a && Intrinsics.c(this.b, lxiVar.b) && Intrinsics.c(this.c, lxiVar.c) && Intrinsics.c(this.d, lxiVar.d) && this.e == lxiVar.e;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "VenueUiModel(id=", ", name=", this.b, ", city=");
        me4.o(this.d, this.c, ", capacity=", ", enabled=", t);
        return wt3.p(t, this.e, ")");
    }
}
