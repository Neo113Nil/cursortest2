package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d8l {
    public final List a;
    public final List b;
    public final Integer c;
    public final Integer d;

    public d8l(List list, List list2, Integer num, Integer num2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8l)) {
            return false;
        }
        d8l d8lVar = (d8l) obj;
        return Intrinsics.c(this.a, d8lVar.a) && Intrinsics.c(this.b, d8lVar.b) && Intrinsics.c(this.c, d8lVar.c) && Intrinsics.c(this.d, d8lVar.d);
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return fc6.l(this.c, this.d, ", periodCount=", ")", fc6.s("GraphDataGroup(graphPoints=", ", incidents=", ", periodTime=", this.a, this.b));
    }
}
