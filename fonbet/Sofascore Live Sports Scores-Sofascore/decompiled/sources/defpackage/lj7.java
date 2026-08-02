package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lj7 {
    public final int a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final gv9 f;
    public final boolean g;
    public final boolean h;

    public lj7(int i, String str, int i2, float f, int i3, gv9 gv9Var, boolean z, boolean z2) {
        str.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = f;
        this.e = i3;
        this.f = gv9Var;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj7)) {
            return false;
        }
        lj7 lj7Var = (lj7) obj;
        return this.a == lj7Var.a && Intrinsics.c(this.b, lj7Var.b) && this.c == lj7Var.c && Float.compare(this.d, lj7Var.d) == 0 && this.e == lj7Var.e && Intrinsics.c(this.f, lj7Var.f) && this.g == lj7Var.g && this.h == lj7Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + dmi.e(ljg.d(wv8.a(this.e, fc6.a(this.d, wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyRoundTransfersData(roundId=", ", roundName=", this.b, ", roundSequence=");
        t.append(this.c);
        t.append(", balanceChange=");
        t.append(this.d);
        t.append(", penalty=");
        t.append(this.e);
        t.append(", transfers=");
        t.append(this.f);
        t.append(", rebuildSquadPlayed=");
        return w1l.i(", quickFixPlayed=", ")", t, this.g, this.h);
    }
}
