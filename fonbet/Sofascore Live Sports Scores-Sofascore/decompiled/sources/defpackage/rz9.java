package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rz9 {
    public final int a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public rz9(int i, Integer num, boolean z, boolean z2, String str, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        str = (i2 & 16) != 0 ? null : str;
        this.a = i;
        this.b = num;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz9)) {
            return false;
        }
        rz9 rz9Var = (rz9) obj;
        return this.a == rz9Var.a && Intrinsics.c(this.b, rz9Var.b) && this.c == rz9Var.c && this.d == rz9Var.d && Intrinsics.c(this.e, rz9Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int e = dmi.e(dmi.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = fc6.r("IncidentIcon(resId=", ", tint=", ", mirrorHorizontally=", this.b, this.a);
        vxd.t(", mirrorVertically=", ", bottomText=", r, this.c, this.d);
        return mz1.o(r, this.e, ")");
    }
}
