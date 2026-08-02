package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class azj implements bzj {
    public final int a;
    public final String b;
    public final dxi c;
    public final dxi d;
    public final int e;
    public final phh f;
    public final qxb g;
    public final phh h;
    public final r9k i;

    public azj(int i, String str, dxi dxiVar, dxi dxiVar2, int i2, phh phhVar, qxb qxbVar, phh phhVar2, r9k r9kVar) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = dxiVar;
        this.d = dxiVar2;
        this.e = i2;
        this.f = phhVar;
        this.g = qxbVar;
        this.h = phhVar2;
        this.i = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azj)) {
            return false;
        }
        azj azjVar = (azj) obj;
        return this.a == azjVar.a && Intrinsics.c(this.b, azjVar.b) && this.c.equals(azjVar.c) && this.d.equals(azjVar.d) && this.e == azjVar.e && this.f.equals(azjVar.f) && this.g.equals(azjVar.g) && Intrinsics.c(this.h, azjVar.h) && Intrinsics.c(this.i, azjVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + wv8.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31)) * 31)) * 31;
        phh phhVar = this.h;
        int hashCode2 = (hashCode + (phhVar == null ? 0 : phhVar.hashCode())) * 31;
        r9k r9kVar = this.i;
        return hashCode2 + (r9kVar != null ? r9kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TrendingEventData(eventId=", ", sportSlug=", this.b, ", homeTeamInfo=");
        t.append(this.c);
        t.append(", awayTeamInfo=");
        t.append(this.d);
        t.append(", uniqueTournamentId=");
        t.append(this.e);
        t.append(", matchScore=");
        t.append(this.f);
        t.append(", status=");
        t.append(this.g);
        t.append(", aggregateScore=");
        t.append(this.h);
        t.append(", tournamentSuffix=");
        t.append(this.i);
        t.append(")");
        return t.toString();
    }
}
