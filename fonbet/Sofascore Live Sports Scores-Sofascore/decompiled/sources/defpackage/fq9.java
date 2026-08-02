package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.TeamSelection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fq9 extends w31 implements axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final fy7 m;
    public final gv9 n;
    public final TeamSelection o;
    public final x43 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq9(int i, String str, String str2, long j, bx7 bx7Var, String str3, fy7 fy7Var, gv9 gv9Var, TeamSelection teamSelection, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        gv9Var.getClass();
        teamSelection.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = fy7Var;
        this.n = gv9Var;
        this.o = teamSelection;
        this.p = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.n;
        gv9Var.getClass();
        TeamSelection teamSelection = this.o;
        teamSelection.getClass();
        return new fq9(this.g, this.h, this.i, this.j, this.k, this.l, this.m, gv9Var, teamSelection, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq9)) {
            return false;
        }
        fq9 fq9Var = (fq9) obj;
        return this.g == fq9Var.g && Intrinsics.c(this.h, fq9Var.h) && Intrinsics.c(this.i, fq9Var.i) && this.j == fq9Var.j && Intrinsics.c(this.k, fq9Var.k) && this.l.equals(fq9Var.l) && this.m.equals(fq9Var.m) && Intrinsics.c(this.n, fq9Var.n) && this.o == fq9Var.o && this.p.equals(fq9Var.p);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.p;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.i;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int c = ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        bx7 bx7Var = this.k;
        return this.p.hashCode() + ((this.o.hashCode() + ljg.d((this.m.hashCode() + dmi.c((c + (bx7Var != null ? bx7Var.hashCode() : 0)) * 31, 31, this.l)) * 31, 31, this.n)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.l;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "IceHockeyTeamShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", team=");
        t.append(this.m);
        t.append(", shotmap=");
        t.append(this.n);
        t.append(", teamSelection=");
        t.append(this.o);
        t.append(", additionalData=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
