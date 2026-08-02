package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xjc {
    public static final joa h = ypa.a(ysa.c, new b1c(14));
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Integer g;

    public xjc(int i, int i2, int i3, Integer num, Integer num2, String str, Integer num3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjc)) {
            return false;
        }
        xjc xjcVar = (xjc) obj;
        return this.a == xjcVar.a && this.b == xjcVar.b && this.c == xjcVar.c && Intrinsics.c(this.d, xjcVar.d) && Intrinsics.c(this.e, xjcVar.e) && Intrinsics.c(this.f, xjcVar.f) && Intrinsics.c(this.g, xjcVar.g);
    }

    public final int hashCode() {
        int a = wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.g;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "MiniEventDataUiModel(id=", ", firstTeamId=", ", secondTeamId=");
        s.append(this.c);
        s.append(", firstTeamDisplayScore=");
        s.append(this.d);
        s.append(", secondTeamDisplayScore=");
        vxd.s(this.e, ", penaltiesDescription=", this.f, ", winnerCode=", s);
        return vxd.n(s, this.g, ")");
    }
}
