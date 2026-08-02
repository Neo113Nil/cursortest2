package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.TeamSelection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bq9 extends w31 implements kre, axi, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final ux7 m;
    public final fy7 n;
    public final gv9 o;
    public final TeamSelection p;
    public final x43 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq9(int i, String str, String str2, long j, bx7 bx7Var, String str3, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, TeamSelection teamSelection, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        gv9Var.getClass();
        teamSelection.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = gv9Var;
        this.p = teamSelection;
        this.q = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        gv9 gv9Var = this.o;
        gv9Var.getClass();
        TeamSelection teamSelection = this.p;
        teamSelection.getClass();
        return new bq9(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, gv9Var, teamSelection, x43Var);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq9)) {
            return false;
        }
        bq9 bq9Var = (bq9) obj;
        return this.g == bq9Var.g && Intrinsics.c(this.h, bq9Var.h) && Intrinsics.c(this.i, bq9Var.i) && this.j == bq9Var.j && this.k.equals(bq9Var.k) && this.l.equals(bq9Var.l) && this.m.equals(bq9Var.m) && this.n.equals(bq9Var.n) && Intrinsics.c(this.o, bq9Var.o) && this.p == bq9Var.p && this.q.equals(bq9Var.q);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.q;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.i;
    }

    @Override // defpackage.kre
    public final ux7 getPlayer() {
        return this.m;
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
        return this.q.hashCode() + ((this.p.hashCode() + ljg.d((this.n.hashCode() + ((this.m.hashCode() + dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31), 31, this.l)) * 31)) * 31, 31, this.o)) * 31);
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
        StringBuilder t = dmi.t(this.g, "IceHockeyPlayerShotmapFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", shotmap=");
        t.append(this.o);
        t.append(", teamSelection=");
        t.append(this.p);
        t.append(", additionalData=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }
}
