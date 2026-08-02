package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class afl {
    public final int a;
    public final String b;
    public final double c;
    public final String d;
    public final String e;

    static {
        ypa.a(ysa.c, new wel(1));
    }

    public afl(int i, String str, double d, String str2, String str3) {
        me4.p(str, str2, str3);
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afl)) {
            return false;
        }
        afl aflVar = (afl) obj;
        return this.a == aflVar.a && Intrinsics.c(this.b, aflVar.b) && Double.compare(this.c, aflVar.c) == 0 && Intrinsics.c(this.d, aflVar.d) && Intrinsics.c(this.e, aflVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.c(dmi.b(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupKeyPlayerUiModel(id=", ", name=", this.b, ", rating=");
        t.append(this.c);
        t.append(", countryAlpha2=");
        t.append(this.d);
        return wt3.m(", countryName=", this.e, t, ")");
    }
}
