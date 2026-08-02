package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hzd implements Serializable {
    public final Integer a;
    public final Integer b;
    public List c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final String h;
    public final int i;
    public final Boolean j;
    public final long k;
    public final mzd l;
    public final wj1 m;

    public hzd(Integer num, Integer num2, List list, String str, boolean z, boolean z2, int i, String str2, int i2, Boolean bool, long j, mzd mzdVar, wj1 wj1Var) {
        list.getClass();
        str.getClass();
        this.a = num;
        this.b = num2;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = str2;
        this.i = i2;
        this.j = bool;
        this.k = j;
        this.l = mzdVar;
        this.m = wj1Var;
    }

    public final Gender d() {
        Team team;
        xoe xoeVar = (xoe) CollectionsKt.firstOrNull(this.c);
        if (xoeVar == null || (team = xoeVar.e) == null) {
            return null;
        }
        return team.getGender();
    }

    public final xoe e(Integer num) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int id = ((xoe) obj).a.getId();
            if (num != null && id == num.intValue()) {
                break;
            }
        }
        xoe xoeVar = (xoe) obj;
        return xoeVar == null ? (xoe) CollectionsKt.Y(this.c) : xoeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzd)) {
            return false;
        }
        hzd hzdVar = (hzd) obj;
        return Intrinsics.c(this.a, hzdVar.a) && Intrinsics.c(this.b, hzdVar.b) && Intrinsics.c(this.c, hzdVar.c) && Intrinsics.c(this.d, hzdVar.d) && this.e == hzdVar.e && this.f == hzdVar.f && this.g == hzdVar.g && Intrinsics.c(this.h, hzdVar.h) && this.i == hzdVar.i && Intrinsics.c(this.j, hzdVar.j) && this.k == hzdVar.k && this.l == hzdVar.l && this.m == hzdVar.m;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int a = wv8.a(this.g, dmi.e(dmi.e(dmi.c(dmi.d((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        String str = this.h;
        int a2 = wv8.a(this.i, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.j;
        int c = ljg.c((a2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.k);
        mzd mzdVar = this.l;
        int hashCode2 = (c + (mzdVar == null ? 0 : mzdVar.hashCode())) * 31;
        wj1 wj1Var = this.m;
        return hashCode2 + (wj1Var != null ? wj1Var.hashCode() : 0);
    }

    public final String toString() {
        List list = this.c;
        StringBuilder k = wv8.k(this.a, "PESMData(eventId=", ", seasonId=", ", players=", this.b);
        k.append(list);
        k.append(", sport=");
        k.append(this.d);
        k.append(", isPreviousMatchesDialog=");
        vxd.t(", isTotwDialog=", ", selectedPlayerId=", k, this.e, this.f);
        vxd.p(this.g, ", statusType=", this.h, ", uniqueTournamentId=", k);
        k.append(this.i);
        k.append(", hasXg=");
        k.append(this.j);
        k.append(", eventTimestamp=");
        k.append(this.k);
        k.append(", selectedFootballStatsCategory=");
        k.append(this.l);
        k.append(", selectedBaseballStatsCategory=");
        k.append(this.m);
        k.append(")");
        return k.toString();
    }
}
