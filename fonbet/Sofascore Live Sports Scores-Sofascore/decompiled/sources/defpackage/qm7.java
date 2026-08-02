package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qm7 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;

    public qm7(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm7)) {
            return false;
        }
        qm7 qm7Var = (qm7) obj;
        return this.a == qm7Var.a && this.b == qm7Var.b && this.c == qm7Var.c && this.d == qm7Var.d && this.e == qm7Var.e && this.f == qm7Var.f && Intrinsics.c(this.g, qm7Var.g) && Intrinsics.c(this.h, qm7Var.h);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(dmi.e(dmi.e(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "FantasyTransferHistoryOverview(totalTransfers=", ", totalPenalty=", ", quickFixAllowed=");
        vxd.t(", rebuildSquadAllowed=", ", quickFixAvailable=", s, this.c, this.d);
        vxd.t(", rebuildSquadAvailable=", ", quickFixPlayedRoundShortname=", s, this.e, this.f);
        return fc6.o(s, this.g, ", rebuildSquadPlayedRoundShortname=", this.h, ")");
    }
}
