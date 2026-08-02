package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lrj implements Serializable, mrj {
    public final Tournament a;
    public boolean b;
    public jfj c;
    public jfj d;
    public jfj e;
    public jfj f;
    public wu g;
    public boolean h;
    public pv5 i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final int n;

    public lrj(Tournament tournament) {
        tournament.getClass();
        this.a = tournament;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = tournament.getId();
    }

    @Override // defpackage.mrj
    public final void a(boolean z) {
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrj)) {
            return false;
        }
        lrj lrjVar = (lrj) obj;
        return Intrinsics.c(this.a, lrjVar.a) && this.b == lrjVar.b && Intrinsics.c(this.c, lrjVar.c) && Intrinsics.c(this.d, lrjVar.d) && Intrinsics.c(this.e, lrjVar.e) && Intrinsics.c(this.f, lrjVar.f) && this.g == lrjVar.g && this.h == lrjVar.h && Intrinsics.c(this.i, lrjVar.i) && Intrinsics.c(this.j, lrjVar.j) && this.k == lrjVar.k && this.l == lrjVar.l && this.m == lrjVar.m;
    }

    @Override // defpackage.mrj
    public final int getTournamentId() {
        return this.n;
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        jfj jfjVar = this.c;
        int hashCode = (e + (jfjVar == null ? 0 : jfjVar.hashCode())) * 31;
        jfj jfjVar2 = this.d;
        int hashCode2 = (hashCode + (jfjVar2 == null ? 0 : jfjVar2.hashCode())) * 31;
        jfj jfjVar3 = this.e;
        int hashCode3 = (hashCode2 + (jfjVar3 == null ? 0 : jfjVar3.hashCode())) * 31;
        jfj jfjVar4 = this.f;
        int hashCode4 = (hashCode3 + (jfjVar4 == null ? 0 : jfjVar4.hashCode())) * 31;
        wu wuVar = this.g;
        int e2 = dmi.e((hashCode4 + (wuVar == null ? 0 : wuVar.hashCode())) * 31, 31, this.h);
        pv5 pv5Var = this.i;
        int hashCode5 = (e2 + (pv5Var == null ? 0 : pv5Var.hashCode())) * 31;
        String str = this.j;
        return Boolean.hashCode(this.m) + dmi.e(dmi.e((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        boolean z = this.b;
        jfj jfjVar = this.c;
        jfj jfjVar2 = this.d;
        jfj jfjVar3 = this.e;
        jfj jfjVar4 = this.f;
        wu wuVar = this.g;
        boolean z2 = this.h;
        pv5 pv5Var = this.i;
        String str = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        StringBuilder sb = new StringBuilder("TournamentListItem(tournament=");
        sb.append(this.a);
        sb.append(", topDividerVisible=");
        sb.append(z);
        sb.append(", textUpper1=");
        sb.append(jfjVar);
        sb.append(", textUpper2=");
        sb.append(jfjVar2);
        sb.append(", textLower=");
        sb.append(jfjVar3);
        sb.append(", textLower2=");
        sb.append(jfjVar4);
        sb.append(", bellButtonLocation=");
        sb.append(wuVar);
        sb.append(", isEditorOrCrowdsourcing=");
        sb.append(z2);
        sb.append(", brandColors=");
        sb.append(pv5Var);
        sb.append(", tennisSurfaceType=");
        sb.append(str);
        sb.append(", roundTop=");
        vxd.t(", roundBottom=", ", isPinned=", sb, z3, z4);
        return wt3.p(sb, z5, ")");
    }
}
