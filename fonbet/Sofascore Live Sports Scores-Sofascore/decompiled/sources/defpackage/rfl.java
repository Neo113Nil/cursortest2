package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rfl {
    public final gv9 a;
    public final boolean b;
    public final boolean c;
    public final sfl d;
    public final agl e;
    public final gv9 f;
    public final gv9 g;
    public final ajl h;
    public final ifl i;

    static {
        ypa.a(ysa.c, new wel(3));
    }

    public rfl(gv9 gv9Var, boolean z, boolean z2, sfl sflVar, agl aglVar, gv9 gv9Var2, gv9 gv9Var3, ajl ajlVar, ifl iflVar) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
        this.c = z2;
        this.d = sflVar;
        this.e = aglVar;
        this.f = gv9Var2;
        this.g = gv9Var3;
        this.h = ajlVar;
        this.i = iflVar;
    }

    public static rfl a(rfl rflVar, sfl sflVar, gv9 gv9Var, ajl ajlVar, int i) {
        gv9 gv9Var2 = rflVar.a;
        boolean z = rflVar.b;
        boolean z2 = rflVar.c;
        if ((i & 8) != 0) {
            sflVar = rflVar.d;
        }
        sfl sflVar2 = sflVar;
        agl aglVar = rflVar.e;
        gv9 gv9Var3 = rflVar.f;
        if ((i & 64) != 0) {
            gv9Var = rflVar.g;
        }
        gv9 gv9Var4 = gv9Var;
        if ((i & 128) != 0) {
            ajlVar = rflVar.h;
        }
        ifl iflVar = rflVar.i;
        rflVar.getClass();
        gv9Var2.getClass();
        return new rfl(gv9Var2, z, z2, sflVar2, aglVar, gv9Var3, gv9Var4, ajlVar, iflVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfl)) {
            return false;
        }
        rfl rflVar = (rfl) obj;
        return Intrinsics.c(this.a, rflVar.a) && this.b == rflVar.b && this.c == rflVar.c && this.d == rflVar.d && Intrinsics.c(this.e, rflVar.e) && Intrinsics.c(this.f, rflVar.f) && Intrinsics.c(this.g, rflVar.g) && Intrinsics.c(this.h, rflVar.h) && Intrinsics.c(this.i, rflVar.i);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        sfl sflVar = this.d;
        int hashCode = (e + (sflVar == null ? 0 : sflVar.hashCode())) * 31;
        agl aglVar = this.e;
        int hashCode2 = (hashCode + (aglVar == null ? 0 : aglVar.hashCode())) * 31;
        gv9 gv9Var = this.f;
        int hashCode3 = (hashCode2 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.g;
        int hashCode4 = (hashCode3 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31;
        ajl ajlVar = this.h;
        int hashCode5 = (hashCode4 + (ajlVar == null ? 0 : ajlVar.hashCode())) * 31;
        ifl iflVar = this.i;
        return hashCode5 + (iflVar != null ? iflVar.hashCode() : 0);
    }

    public final String toString() {
        return "WorldCupMyTeamData(buttons=" + this.a + ", isCollapsable=" + this.b + ", showWidgetCta=" + this.c + ", selectedFilter=" + this.d + ", selectedTeamData=" + this.e + ", teamMatches=" + this.f + ", teamVideos=" + this.g + ", teamLeaders=" + this.h + ", matchStatusReport=" + this.i + ")";
    }
}
