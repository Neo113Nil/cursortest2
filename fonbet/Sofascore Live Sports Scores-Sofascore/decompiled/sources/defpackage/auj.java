package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class auj {
    public final int a;
    public final int b;
    public final String c;
    public final Integer d;
    public final long e;
    public final long f;

    public auj(int i, int i2, String str, Integer num, long j, long j2, int i3) {
        num = (i3 & 8) != 0 ? null : num;
        j = (i3 & 16) != 0 ? 0L : j;
        j2 = (i3 & 32) != 0 ? 0L : j2;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = num;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auj)) {
            return false;
        }
        auj aujVar = (auj) obj;
        return this.a == aujVar.a && this.b == aujVar.b && Intrinsics.c(this.c, aujVar.c) && Intrinsics.c(this.d, aujVar.d) && this.e == aujVar.e && this.f == aujVar.f;
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return Long.hashCode(this.f) + ljg.c((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "TrackerRound(id=", ", number=", ", name=");
        me4.o(this.d, this.c, ", roundType=", ", timeframeStart=", s);
        s.append(this.e);
        return fn0.l(this.f, ", timeframeEnd=", ")", s);
    }
}
