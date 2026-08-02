package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mp6 {
    public final int a;
    public final String b;
    public final FantasyCompetitionType c;
    public final Integer d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final lp6 h;
    public final Long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public mp6(int i, String str, FantasyCompetitionType fantasyCompetitionType, Integer num, int i2, boolean z, boolean z2, lp6 lp6Var, Long l, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        fantasyCompetitionType.getClass();
        this.a = i;
        this.b = str;
        this.c = fantasyCompetitionType;
        this.d = num;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = lp6Var;
        this.i = l;
        this.j = z3;
        this.k = z4;
        this.l = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp6)) {
            return false;
        }
        mp6 mp6Var = (mp6) obj;
        return this.a == mp6Var.a && Intrinsics.c(this.b, mp6Var.b) && this.c == mp6Var.c && Intrinsics.c(this.d, mp6Var.d) && this.e == mp6Var.e && this.f == mp6Var.f && this.g == mp6Var.g && this.h == mp6Var.h && Intrinsics.c(this.i, mp6Var.i) && this.j == mp6Var.j && this.k == mp6Var.k && this.l == mp6Var.l;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (this.h.hashCode() + dmi.e(dmi.e(wv8.a(this.e, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f), 31, this.g)) * 31;
        Long l = this.i;
        return Boolean.hashCode(this.l) + dmi.e(dmi.e((hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyCompetitionBasicUiModel(id=", ", name=", this.b, ", type=");
        t.append(this.c);
        t.append(", uniqueTournamentId=");
        t.append(this.d);
        t.append(", categoryId=");
        t.append(this.e);
        t.append(", isOfficialCompetition=");
        t.append(this.f);
        t.append(", isAlpha=");
        t.append(this.g);
        t.append(", status=");
        t.append(this.h);
        t.append(", playerCount=");
        t.append(this.i);
        t.append(", creationRoundIsPlaceholder=");
        t.append(this.j);
        t.append(", isWeeklyAndNotRevealed=");
        return w1l.i(", creationRoundLocked=", ")", t, this.k, this.l);
    }
}
