package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sk1 {
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public sk1(int i, Integer num, Integer num2, String str, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk1)) {
            return false;
        }
        sk1 sk1Var = (sk1) obj;
        return this.a == sk1Var.a && Intrinsics.c(this.b, sk1Var.b) && Intrinsics.c(this.c, sk1Var.c) && Intrinsics.c(this.d, sk1Var.d) && Intrinsics.c(this.e, sk1Var.e);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "BaseballPrematchLineupsPlayerUiModel(playerId=", ", upperText=", this.b, ", lowerText=");
        me4.o(this.d, this.c, ", lowerTextColor=", ", lowerTextIcon=", t);
        return vxd.n(t, this.e, ")");
    }

    public /* synthetic */ sk1(int i, String str, String str2, int i2) {
        this(i, null, null, str, (i2 & 4) != 0 ? null : str2);
    }
}
