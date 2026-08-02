package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tj5 implements uj5 {
    public final String a;
    public final int b;

    public tj5(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj5)) {
            return false;
        }
        tj5 tj5Var = (tj5) obj;
        return Intrinsics.c(this.a, tj5Var.a) && this.b == tj5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return vxd.k(this.b, "League(name=", this.a, ", categoryId=", ")");
    }
}
