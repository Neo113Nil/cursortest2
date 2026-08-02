package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uza implements qnj {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final lnj d;
    public final gv9 e;
    public final pnj f;
    public final String g;
    public final String h;

    public uza(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, lnj lnjVar, gv9 gv9Var4, pnj pnjVar, String str) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = lnjVar;
        this.e = gv9Var4;
        this.f = pnjVar;
        this.g = str;
        this.h = str;
    }

    public static uza d(uza uzaVar, gv9 gv9Var, lnj lnjVar, gv9 gv9Var2, pnj pnjVar, String str, int i) {
        gv9 gv9Var3 = uzaVar.a;
        gv9 gv9Var4 = uzaVar.b;
        if ((i & 4) != 0) {
            gv9Var = uzaVar.c;
        }
        gv9 gv9Var5 = gv9Var;
        if ((i & 8) != 0) {
            lnjVar = uzaVar.d;
        }
        lnj lnjVar2 = lnjVar;
        if ((i & 16) != 0) {
            gv9Var2 = uzaVar.e;
        }
        gv9 gv9Var6 = gv9Var2;
        if ((i & 32) != 0) {
            pnjVar = uzaVar.f;
        }
        pnj pnjVar2 = pnjVar;
        if ((i & 64) != 0) {
            str = uzaVar.g;
        }
        uzaVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        return new uza(gv9Var3, gv9Var4, gv9Var5, lnjVar2, gv9Var6, pnjVar2, str);
    }

    @Override // defpackage.qnj
    public final String a() {
        return this.h;
    }

    @Override // defpackage.qnj
    public final lnj b() {
        return this.d;
    }

    @Override // defpackage.qnj
    public final pnj c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uza)) {
            return false;
        }
        uza uzaVar = (uza) obj;
        return Intrinsics.c(this.a, uzaVar.a) && Intrinsics.c(this.b, uzaVar.b) && Intrinsics.c(this.c, uzaVar.c) && Intrinsics.c(this.d, uzaVar.d) && Intrinsics.c(this.e, uzaVar.e) && Intrinsics.c(this.f, uzaVar.f) && Intrinsics.c(this.g, uzaVar.g);
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        lnj lnjVar = this.d;
        int d2 = ljg.d((d + (lnjVar == null ? 0 : lnjVar.hashCode())) * 31, 31, this.e);
        pnj pnjVar = this.f;
        int hashCode = (d2 + (pnjVar == null ? 0 : pnjVar.hashCode())) * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = wv8.l("LeagueTopStatsHeaders(topStatsTypes=", this.a, ", subSeasonTypes=", this.b, ", chipFilterItems=");
        l.append(this.c);
        l.append(", selectedChipFilter=");
        l.append(this.d);
        l.append(", spinnerFilterItems=");
        l.append(this.e);
        l.append(", selectedSpinnerFilter=");
        l.append(this.f);
        l.append(", subSeasonType=");
        return mz1.o(l, this.g, ")");
    }
}
