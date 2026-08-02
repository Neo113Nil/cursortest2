package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d43 extends f43 {
    public final String a;
    public final int b;

    public d43(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d43)) {
            return false;
        }
        d43 d43Var = (d43) obj;
        return Intrinsics.c(this.a, d43Var.a) && this.b == d43Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return vxd.k(this.b, "ListHeader(text=", this.a, ", topPadding=", ")");
    }
}
