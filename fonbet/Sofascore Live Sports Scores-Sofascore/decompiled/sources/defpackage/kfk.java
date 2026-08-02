package defpackage;

import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.model.profile.ContributionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kfk {
    public final int a;
    public final String b;
    public final String c;
    public final ms3 d;
    public final ms3 e;
    public final boolean f;
    public final long g;
    public final String h;
    public final gv9 i;
    public final ContributionType j;
    public final ContributionStatus k;
    public final int l;
    public final Integer m;

    public kfk(int i, String str, String str2, ms3 ms3Var, ms3 ms3Var2, boolean z, long j, String str3, gv9 gv9Var, ContributionType contributionType, ContributionStatus contributionStatus, int i2, Integer num) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = ms3Var;
        this.e = ms3Var2;
        this.f = z;
        this.g = j;
        this.h = str3;
        this.i = gv9Var;
        this.j = contributionType;
        this.k = contributionStatus;
        this.l = i2;
        this.m = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfk)) {
            return false;
        }
        kfk kfkVar = (kfk) obj;
        return this.a == kfkVar.a && Intrinsics.c(this.b, kfkVar.b) && Intrinsics.c(this.c, kfkVar.c) && this.d.equals(kfkVar.d) && this.e.equals(kfkVar.e) && this.f == kfkVar.f && this.g == kfkVar.g && Intrinsics.c(this.h, kfkVar.h) && Intrinsics.c(this.i, kfkVar.i) && this.j == kfkVar.j && this.k == kfkVar.k && this.l == kfkVar.l && Intrinsics.c(this.m, kfkVar.m);
    }

    public final int hashCode() {
        int d = ljg.d(dmi.c(ljg.c(dmi.e((this.e.hashCode() + ((this.d.hashCode() + dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        ContributionType contributionType = this.j;
        int hashCode = (d + (contributionType == null ? 0 : contributionType.hashCode())) * 31;
        ContributionStatus contributionStatus = this.k;
        int a = wv8.a(this.l, (hashCode + (contributionStatus == null ? 0 : contributionStatus.hashCode())) * 31, 31);
        Integer num = this.m;
        return a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "UserContributionsEventData(eventId=", ", eventStatus=", this.b, ", eventTime=");
        t.append(this.c);
        t.append(", homeTeam=");
        t.append(this.d);
        t.append(", awayTeam=");
        t.append(this.e);
        t.append(", shouldSetCrowdsourcingColor=");
        t.append(this.f);
        t.append(", eventStartTimestamp=");
        t.append(this.g);
        t.append(", sportSlug=");
        t.append(this.h);
        t.append(", contributions=");
        t.append(this.i);
        t.append(", contributionType=");
        t.append(this.j);
        t.append(", contributionStatus=");
        t.append(this.k);
        t.append(", contributionCount=");
        t.append(this.l);
        t.append(", winnerCode=");
        t.append(this.m);
        t.append(")");
        return t.toString();
    }
}
