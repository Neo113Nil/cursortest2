package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vv7 implements pw7 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public vv7(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv7)) {
            return false;
        }
        vv7 vv7Var = (vv7) obj;
        return Intrinsics.c(this.a, vv7Var.a) && Intrinsics.c(this.b, vv7Var.b) && Intrinsics.c(this.c, vv7Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return vxd.n(wv8.k(this.a, "CustomAnnouncementPostAction(eventId=", ", tournamentId=", ", stageId=", this.b), this.c, ")");
    }
}
