package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xsi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public xsi(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsi)) {
            return false;
        }
        xsi xsiVar = (xsi) obj;
        return Intrinsics.c(this.a, xsiVar.a) && Intrinsics.c(this.b, xsiVar.b) && this.c.equals(xsiVar.c) && this.d.equals(xsiVar.d) && this.e == xsiVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = mz1.s("Period(key=", this.a, ", title=", this.b, ", homeScore=");
        bf3.v(s, this.c, ", awayScore=", this.d, ", isCurrent=");
        return wt3.p(s, this.e, ")");
    }
}
