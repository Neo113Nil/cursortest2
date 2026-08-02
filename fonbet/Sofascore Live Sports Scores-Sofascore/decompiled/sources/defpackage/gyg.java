package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gyg {
    public final e73 a;
    public final String b;
    public final boolean c;
    public final tee d;
    public final tee e;
    public final gv9 f;
    public final gv9 g;
    public final String h;

    public gyg(e73 e73Var, String str, boolean z, tee teeVar, tee teeVar2, gv9 gv9Var, gv9 gv9Var2, String str2) {
        e73Var.getClass();
        str.getClass();
        teeVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = e73Var;
        this.b = str;
        this.c = z;
        this.d = teeVar;
        this.e = teeVar2;
        this.f = gv9Var;
        this.g = gv9Var2;
        this.h = str2;
    }

    public static gyg a(gyg gygVar, tee teeVar, tee teeVar2, gv9 gv9Var, gv9 gv9Var2, String str, int i) {
        e73 e73Var = gygVar.a;
        String str2 = gygVar.b;
        boolean z = gygVar.c;
        if ((i & 8) != 0) {
            teeVar = gygVar.d;
        }
        tee teeVar3 = teeVar;
        if ((i & 16) != 0) {
            teeVar2 = gygVar.e;
        }
        tee teeVar4 = teeVar2;
        if ((i & 32) != 0) {
            gv9Var = gygVar.f;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 64) != 0) {
            gv9Var2 = gygVar.g;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 128) != 0) {
            str = gygVar.h;
        }
        gygVar.getClass();
        e73Var.getClass();
        str2.getClass();
        teeVar3.getClass();
        teeVar4.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new gyg(e73Var, str2, z, teeVar3, teeVar4, gv9Var3, gv9Var4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg)) {
            return false;
        }
        gyg gygVar = (gyg) obj;
        return this.a == gygVar.a && Intrinsics.c(this.b, gygVar.b) && this.c == gygVar.c && Intrinsics.c(this.d, gygVar.d) && this.e.equals(gygVar.e) && Intrinsics.c(this.f, gygVar.f) && Intrinsics.c(this.g, gygVar.g) && Intrinsics.c(this.h, gygVar.h);
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d((this.e.hashCode() + ((this.d.hashCode() + dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SeasonComparisonState(entityType=" + this.a + ", sport=" + this.b + ", canAddSlots=" + this.c + ", headerSlots=" + this.d + ", tournamentSeasonsBySlot=" + this.e + ", rowItems=" + this.f + ", filterChipItems=" + this.g + ", selectedFilterKey=" + this.h + ")";
    }
}
