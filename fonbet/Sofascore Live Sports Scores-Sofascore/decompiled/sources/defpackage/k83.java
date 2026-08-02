package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k83 {
    public final int a;
    public final String b;
    public final String c;

    public k83(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k83)) {
            return false;
        }
        k83 k83Var = (k83) obj;
        return this.a == k83Var.a && Intrinsics.c(this.b, k83Var.b) && Intrinsics.c(this.c, k83Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.o(dmi.t(this.a, "TeamUiModel(id=", ", name=", this.b, ", shortName="), this.c, ")");
    }
}
