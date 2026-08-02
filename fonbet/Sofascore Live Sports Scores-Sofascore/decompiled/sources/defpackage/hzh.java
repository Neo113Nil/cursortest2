package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hzh {
    public final nzh a;
    public final boolean b;
    public final r9k c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final r9k g;

    public hzh(nzh nzhVar, boolean z, r9k r9kVar, int i, Integer num, Integer num2, q9k q9kVar) {
        this.a = nzhVar;
        this.b = z;
        this.c = r9kVar;
        this.d = i;
        this.e = num;
        this.f = num2;
        this.g = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzh)) {
            return false;
        }
        hzh hzhVar = (hzh) obj;
        return Intrinsics.c(this.a, hzhVar.a) && this.b == hzhVar.b && Intrinsics.c(this.c, hzhVar.c) && this.d == hzhVar.d && Intrinsics.c(this.e, hzhVar.e) && Intrinsics.c(this.f, hzhVar.f) && Intrinsics.c(this.g, hzhVar.g);
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        r9k r9kVar = this.c;
        int a = wv8.a(this.d, (e + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        r9k r9kVar2 = this.g;
        return hashCode2 + (r9kVar2 != null ? r9kVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportPickerItemUIModel(type=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", sportName=");
        sb.append(this.c);
        sb.append(", sportIcon=");
        sb.append(this.d);
        sb.append(", liveCount=");
        vxd.r(this.e, this.f, ", totalCount=", ", sportInfoText=", sb);
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
