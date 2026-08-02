package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yd7 {
    public final tee a;
    public final float b;
    public final float c;
    public final String d;
    public final float e;
    public final String f;
    public final int g;
    public final Integer h;

    public yd7(tee teeVar, float f, float f2, String str, float f3, String str2, int i, Integer num) {
        teeVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = teeVar;
        this.b = f;
        this.c = f2;
        this.d = str;
        this.e = f3;
        this.f = str2;
        this.g = i;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd7)) {
            return false;
        }
        yd7 yd7Var = (yd7) obj;
        return Intrinsics.c(this.a, yd7Var.a) && Float.compare(this.b, yd7Var.b) == 0 && Float.compare(this.c, yd7Var.c) == 0 && Intrinsics.c(this.d, yd7Var.d) && Float.compare(this.e, yd7Var.e) == 0 && Intrinsics.c(this.f, yd7Var.f) && this.g == yd7Var.g && Intrinsics.c(this.h, yd7Var.h);
    }

    public final int hashCode() {
        int a = wv8.a(this.g, dmi.c(fc6.a(this.e, dmi.c(fc6.a(this.c, fc6.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31, this.f), 31);
        Integer num = this.h;
        return (a + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        return "FantasyPlayerPriceGraphData(prices=" + this.a + ", avgPrice=" + this.b + ", minPrice=" + this.c + ", minPriceRoundShortname=" + this.d + ", maxPrice=" + this.e + ", maxPriceRoundShortname=" + this.f + ", totalRounds=" + this.g + ", joinedInRound=" + this.h + ", leftInRound=null)";
    }
}
