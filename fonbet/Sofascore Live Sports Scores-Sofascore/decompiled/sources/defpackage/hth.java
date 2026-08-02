package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hth {
    public final gv9 a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final boolean f;

    public hth(gv9 gv9Var, int i, int i2, float f, boolean z, boolean z2) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = z;
        this.f = z2;
    }

    public static hth a(hth hthVar, gv9 gv9Var, int i, int i2, float f, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            gv9Var = hthVar.a;
        }
        gv9 gv9Var2 = gv9Var;
        if ((i3 & 2) != 0) {
            i = hthVar.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = hthVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            f = hthVar.d;
        }
        float f2 = f;
        if ((i3 & 16) != 0) {
            z = hthVar.e;
        }
        boolean z3 = z;
        if ((i3 & 32) != 0) {
            z2 = hthVar.f;
        }
        hthVar.getClass();
        gv9Var2.getClass();
        return new hth(gv9Var2, i4, i5, f2, z3, z2);
    }

    public final fm8 b() {
        gv9 e;
        tfi c = c();
        if (c == null || (e = c.e()) == null) {
            return null;
        }
        return (fm8) CollectionsKt.a0(this.c, e);
    }

    public final tfi c() {
        return (tfi) CollectionsKt.a0(this.b, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hth)) {
            return false;
        }
        hth hthVar = (hth) obj;
        return Intrinsics.c(this.a, hthVar.a) && this.b == hthVar.b && this.c == hthVar.c && Float.compare(this.d, hthVar.d) == 0 && this.e == hthVar.e && this.f == hthVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dmi.e(fc6.a(this.d, wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SofaSeasonState(segments=");
        sb.append(this.a);
        sb.append(", currentSegmentIndex=");
        sb.append(this.b);
        sb.append(", currentCardIndex=");
        sb.append(this.c);
        sb.append(", currentSegmentProgress=");
        sb.append(this.d);
        sb.append(", isPaused=");
        return w1l.i(", isSegmentTransitioning=", ")", sb, this.e, this.f);
    }
}
