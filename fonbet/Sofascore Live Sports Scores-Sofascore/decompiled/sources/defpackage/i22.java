package defpackage;

import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Player;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i22 extends n4o implements Serializable {
    public final Double A;
    public final Integer B;
    public final Boolean C;
    public final m22 m;
    public final Player n;
    public final String o;
    public final List p;
    public final String q;
    public final Boolean r;
    public final Boolean s;
    public final Boolean t;
    public final ArrayList u;
    public x12 v;
    public final Integer w;
    public final Integer x;
    public int y;
    public boolean z;

    public i22(m22 m22Var, Player player, String str, List list, String str2, Boolean bool, Boolean bool2, Boolean bool3, ArrayList arrayList, x12 x12Var, Integer num, Integer num2, Double d, Integer num3, Boolean bool4, int i) {
        num = (i & 1024) != 0 ? null : num;
        num2 = (i & a.o) != 0 ? null : num2;
        player.getClass();
        this.m = m22Var;
        this.n = player;
        this.o = str;
        this.p = list;
        this.q = str2;
        this.r = bool;
        this.s = bool2;
        this.t = bool3;
        this.u = arrayList;
        this.v = x12Var;
        this.w = num;
        this.x = num2;
        this.y = 0;
        this.z = false;
        this.A = d;
        this.B = num3;
        this.C = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i22)) {
            return false;
        }
        i22 i22Var = (i22) obj;
        return this.m.equals(i22Var.m) && Intrinsics.c(this.n, i22Var.n) && Intrinsics.c(this.o, i22Var.o) && Intrinsics.c(this.p, i22Var.p) && Intrinsics.c(this.q, i22Var.q) && Intrinsics.c(this.r, i22Var.r) && Intrinsics.c(this.s, i22Var.s) && Intrinsics.c(this.t, i22Var.t) && this.u.equals(i22Var.u) && Intrinsics.c(this.v, i22Var.v) && Intrinsics.c(this.w, i22Var.w) && Intrinsics.c(this.x, i22Var.x) && this.y == i22Var.y && this.z == i22Var.z && Intrinsics.c(this.A, i22Var.A) && Intrinsics.c(this.B, i22Var.B) && Intrinsics.c(this.C, i22Var.C);
    }

    public final int hashCode() {
        int hashCode = (this.n.hashCode() + (this.m.hashCode() * 31)) * 31;
        String str = this.o;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.p;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.q;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.r;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.s;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.t;
        int d = vxd.d(this.u, (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31);
        x12 x12Var = this.v;
        int hashCode7 = (d + (x12Var == null ? 0 : x12Var.hashCode())) * 31;
        Integer num = this.w;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.x;
        int e = dmi.e(wv8.a(this.y, (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 29791, 31), 31, this.z);
        Double d2 = this.A;
        int hashCode9 = (e + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num3 = this.B;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.C;
        return hashCode10 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        x12 x12Var = this.v;
        int i = this.y;
        boolean z = this.z;
        StringBuilder sb = new StringBuilder("BoxScorePlayerData(section=");
        sb.append(this.m);
        sb.append(", player=");
        sb.append(this.n);
        sb.append(", jerseyNumber=");
        sb.append(this.o);
        sb.append(", allPositions=");
        sb.append(this.p);
        sb.append(", position=");
        sb.append(this.q);
        sb.append(", isSubstitute=");
        sb.append(this.r);
        sb.append(", isCaptain=");
        i.q(sb, this.s, ", inPlay=", this.t, ", columnsWithValues=");
        sb.append(this.u);
        sb.append(", sortedByColumn=");
        sb.append(x12Var);
        sb.append(", battingListIndex=");
        vxd.r(this.w, this.x, ", pitchingListIndex=", ", batterNote=null, pitcherNote=null, numberOfVisibleColumns=", sb);
        sb.append(i);
        sb.append(", isLongViewActive=");
        sb.append(z);
        sb.append(", rating=");
        mz1.x(this.A, this.B, ", teamId=", ", isEjected=", sb);
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }
}
