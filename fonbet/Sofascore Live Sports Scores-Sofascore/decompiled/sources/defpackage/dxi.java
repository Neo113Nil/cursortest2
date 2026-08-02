package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dxi {
    public final int a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public dxi(int i, String str, Integer num, Integer num2) {
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxi)) {
            return false;
        }
        dxi dxiVar = (dxi) obj;
        return this.a == dxiVar.a && Intrinsics.c(this.b, dxiVar.b) && Intrinsics.c(this.c, dxiVar.c) && Intrinsics.c(this.d, dxiVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return fc6.l(this.c, this.d, ", subTeam2Id=", ")", dmi.t(this.a, "TeamInfo(teamId=", ", alpha2=", this.b, ", subTeam1Id="));
    }
}
