package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iel {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ejl h;

    static {
        ypa.a(ysa.c, new g0l(19));
    }

    public iel(int i, String str, long j, String str2, String str3, String str4, String str5, ejl ejlVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ejlVar.getClass();
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = ejlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iel)) {
            return false;
        }
        iel ielVar = (iel) obj;
        return this.a == ielVar.a && Intrinsics.c(this.b, ielVar.b) && this.c == ielVar.c && Intrinsics.c(this.d, ielVar.d) && Intrinsics.c(this.e, ielVar.e) && Intrinsics.c(this.f, ielVar.f) && Intrinsics.c(this.g, ielVar.g) && Intrinsics.c(this.h, ielVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dmi.c(dmi.c(dmi.c(dmi.c(ljg.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupDetailsUiModel(id=", ", translatedName=", this.b, ", startTimestamp=");
        t.append(this.c);
        t.append(", startDate=");
        t.append(this.d);
        bf3.v(t, ", endDate=", this.e, ", categorySlug=", this.f);
        t.append(", tournamentSlug=");
        t.append(this.g);
        t.append(", timelineData=");
        t.append(this.h);
        t.append(")");
        return t.toString();
    }
}
