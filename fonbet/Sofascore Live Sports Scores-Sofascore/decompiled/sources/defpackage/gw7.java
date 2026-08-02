package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gw7 implements pw7 {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;

    public gw7(Integer num, int i, int i2, Integer num2) {
        num = (i2 & 2) != 0 ? null : num;
        num2 = (i2 & 4) != 0 ? null : num2;
        boolean z = (i2 & 8) == 0;
        boolean z2 = (i2 & 16) == 0;
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw7)) {
            return false;
        }
        gw7 gw7Var = (gw7) obj;
        return this.a == gw7Var.a && Intrinsics.c(this.b, gw7Var.b) && Intrinsics.c(this.c, gw7Var.c) && this.d == gw7Var.d && this.e == gw7Var.e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return Boolean.hashCode(this.e) + dmi.e((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder r = fc6.r("OpenPlayerAction(playerId=", ", teamId=", ", eventId=", this.b, this.a);
        r.append(this.c);
        r.append(", positionOnMatches=");
        r.append(this.d);
        r.append(", isGroupCard=");
        return wt3.p(r, this.e, ")");
    }
}
