package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zo6 {
    public final boolean a;
    public final m73 b;
    public final m73 c;
    public final gv9 d;
    public final gv9 e;
    public final gv9 f;
    public final boolean g;

    public zo6(boolean z, m73 m73Var, m73 m73Var2, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, boolean z2) {
        this.a = z;
        this.b = m73Var;
        this.c = m73Var2;
        this.d = gv9Var;
        this.e = gv9Var2;
        this.f = gv9Var3;
        this.g = z2;
    }

    public static zo6 a(zo6 zo6Var, boolean z, m73 m73Var, m73 m73Var2, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = zo6Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            m73Var = zo6Var.b;
        }
        m73 m73Var3 = m73Var;
        if ((i & 4) != 0) {
            m73Var2 = zo6Var.c;
        }
        m73 m73Var4 = m73Var2;
        if ((i & 8) != 0) {
            gv9Var = zo6Var.d;
        }
        gv9 gv9Var4 = gv9Var;
        if ((i & 16) != 0) {
            gv9Var2 = zo6Var.e;
        }
        gv9 gv9Var5 = gv9Var2;
        if ((i & 32) != 0) {
            gv9Var3 = zo6Var.f;
        }
        gv9 gv9Var6 = gv9Var3;
        if ((i & 64) != 0) {
            z2 = zo6Var.g;
        }
        zo6Var.getClass();
        return new zo6(z3, m73Var3, m73Var4, gv9Var4, gv9Var5, gv9Var6, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo6)) {
            return false;
        }
        zo6 zo6Var = (zo6) obj;
        return this.a == zo6Var.a && Intrinsics.c(this.b, zo6Var.b) && Intrinsics.c(this.c, zo6Var.c) && Intrinsics.c(this.d, zo6Var.d) && Intrinsics.c(this.e, zo6Var.e) && Intrinsics.c(this.f, zo6Var.f) && this.g == zo6Var.g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        m73 m73Var = this.b;
        int hashCode2 = (hashCode + (m73Var == null ? 0 : m73Var.hashCode())) * 31;
        m73 m73Var2 = this.c;
        int hashCode3 = (hashCode2 + (m73Var2 == null ? 0 : m73Var2.hashCode())) * 31;
        gv9 gv9Var = this.d;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.e;
        int hashCode5 = (hashCode4 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31;
        gv9 gv9Var3 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode5 + (gv9Var3 != null ? gv9Var3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyComparisonScreenState(isLoading=");
        sb.append(this.a);
        sb.append(", playerFirstData=");
        sb.append(this.b);
        sb.append(", playerSecondData=");
        sb.append(this.c);
        sb.append(", generalComparisonData=");
        sb.append(this.d);
        sb.append(", formComparisonData=");
        vxd.u(sb, this.e, ", fixtureComparisonData=", this.f, ", showSuggestions=");
        return wt3.p(sb, this.g, ")");
    }
}
