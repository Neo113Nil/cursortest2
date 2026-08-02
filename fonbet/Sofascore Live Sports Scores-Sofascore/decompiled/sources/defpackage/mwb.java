package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mwb {
    public final int a;
    public final int b;
    public final String c;
    public final swb d;
    public final swb e;
    public final String f;
    public final String g;
    public final String h;

    public mwb(int i, int i2, String str, swb swbVar, swb swbVar2, String str2, String str3, String str4) {
        me4.p(str2, str3, str4);
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = swbVar;
        this.e = swbVar2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwb)) {
            return false;
        }
        mwb mwbVar = (mwb) obj;
        return this.a == mwbVar.a && this.b == mwbVar.b && this.c.equals(mwbVar.c) && this.d.equals(mwbVar.d) && this.e.equals(mwbVar.e) && Intrinsics.c(this.f, mwbVar.f) && Intrinsics.c(this.g, mwbVar.g) && Intrinsics.c(this.h, mwbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dmi.c(dmi.c((this.e.hashCode() + ((this.d.hashCode() + dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "MatchOfTheWeekEvent(id=", ", uniqueTournamentId=", ", headerLabel=");
        s.append(this.c);
        s.append(", homeTeam=");
        s.append(this.d);
        s.append(", awayTeam=");
        s.append(this.e);
        s.append(", upperLabel=");
        s.append(this.f);
        s.append(", lowerLabel=");
        return fc6.o(s, this.g, ", sport=", this.h, ")");
    }
}
