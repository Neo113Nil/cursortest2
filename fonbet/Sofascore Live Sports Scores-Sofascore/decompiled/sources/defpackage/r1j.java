package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r1j implements z1j {
    public final String a;
    public final String b;
    public final gv9 c;
    public final gv9 d;
    public final bfe e;

    public r1j(String str, String str2, gv9 gv9Var, b7 b7Var, bfe bfeVar) {
        str2.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = gv9Var;
        this.d = b7Var;
        this.e = bfeVar;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1j)) {
            return false;
        }
        r1j r1jVar = (r1j) obj;
        return Intrinsics.c(this.a, r1jVar.a) && Intrinsics.c(this.b, r1jVar.b) && Intrinsics.c(this.c, r1jVar.c) && Intrinsics.c(this.d, r1jVar.d) && Intrinsics.c(this.e, r1jVar.e);
    }

    public final int hashCode() {
        int d = ljg.d(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        gv9 gv9Var = this.d;
        return this.e.hashCode() + ((d + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("IceHockeyDepthChartCard(label=", this.a, ", title=", this.b, ", data=");
        vxd.u(s, this.c, ", positions=", this.d, ", visibleForChips=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
