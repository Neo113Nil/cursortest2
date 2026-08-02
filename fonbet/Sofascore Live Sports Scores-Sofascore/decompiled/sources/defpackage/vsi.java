package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vsi {
    public final String a;
    public final String b;
    public final String c;

    public vsi(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsi)) {
            return false;
        }
        vsi vsiVar = (vsi) obj;
        return Intrinsics.c(this.a, vsiVar.a) && Intrinsics.c(this.b, vsiVar.b) && Intrinsics.c(this.c, vsiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.o(mz1.s("StickyData(hits=", this.a, ", errors=", this.b, ", runs="), this.c, ")");
    }
}
