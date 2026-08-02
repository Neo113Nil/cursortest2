package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class as1 {
    public final String a;
    public final boolean b;

    public as1(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as1)) {
            return false;
        }
        as1 as1Var = (as1) obj;
        return Intrinsics.c(this.a, as1Var.a) && this.b == as1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BasketballPlayerShotmapPeriod(period=" + this.a + ", hasStatistics=" + this.b + ")";
    }
}
