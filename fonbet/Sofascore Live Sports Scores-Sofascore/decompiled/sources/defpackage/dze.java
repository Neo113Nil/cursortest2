package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dze {
    public final gv9 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;

    public dze(gv9 gv9Var, int i, int i2, boolean z, int i3, int i4, boolean z2) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dze)) {
            return false;
        }
        dze dzeVar = (dze) obj;
        return Intrinsics.c(this.a, dzeVar.a) && this.b == dzeVar.b && this.c == dzeVar.c && this.d == dzeVar.d && this.e == dzeVar.e && this.f == dzeVar.f && this.g == dzeVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + wv8.a(this.f, wv8.a(this.e, dmi.e(wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointGraphUiModel(points=");
        sb.append(this.a);
        sb.append(", topScore=");
        sb.append(this.b);
        sb.append(", bottomScore=");
        sb.append(this.c);
        sb.append(", isLive=");
        sb.append(this.d);
        sb.append(", yRange=");
        me4.q(sb, this.e, ", maxSequence=", this.f, ", useValueColors=");
        return wt3.p(sb, this.g, ")");
    }
}
