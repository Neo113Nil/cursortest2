package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b2j {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final sui e;
    public final av3 f;
    public final gv9 g;
    public final r9k h;
    public final String i;
    public final String j;
    public final String k;
    public final r9k l;
    public final r9k m;
    public final Integer n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final boolean s;
    public final String t;
    public final String u;
    public final String v;
    public final Player w;

    public b2j(int i, String str, String str2, String str3, sui suiVar, av3 av3Var, gv9 gv9Var, p9k p9kVar, String str4, String str5, String str6, q9k q9kVar, q9k q9kVar2, Integer num, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, Player player) {
        str.getClass();
        gv9Var.getClass();
        str8.getClass();
        str9.getClass();
        player.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = suiVar;
        this.f = av3Var;
        this.g = gv9Var;
        this.h = p9kVar;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = q9kVar;
        this.m = q9kVar2;
        this.n = num;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = z;
        this.t = str11;
        this.u = str12;
        this.v = str13;
        this.w = player;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2j)) {
            return false;
        }
        b2j b2jVar = (b2j) obj;
        return this.a == b2jVar.a && Intrinsics.c(this.b, b2jVar.b) && Intrinsics.c(this.c, b2jVar.c) && Intrinsics.c(this.d, b2jVar.d) && Intrinsics.c(this.e, b2jVar.e) && Intrinsics.c(this.f, b2jVar.f) && Intrinsics.c(this.g, b2jVar.g) && Intrinsics.c(this.h, b2jVar.h) && Intrinsics.c(this.i, b2jVar.i) && Intrinsics.c(this.j, b2jVar.j) && Intrinsics.c(this.k, b2jVar.k) && Intrinsics.c(this.l, b2jVar.l) && Intrinsics.c(this.m, b2jVar.m) && Intrinsics.c(this.n, b2jVar.n) && Intrinsics.c(this.o, b2jVar.o) && Intrinsics.c(this.p, b2jVar.p) && Intrinsics.c(this.q, b2jVar.q) && Intrinsics.c(this.r, b2jVar.r) && this.s == b2jVar.s && this.t.equals(b2jVar.t) && Intrinsics.c(this.u, b2jVar.u) && Intrinsics.c(this.v, b2jVar.v) && Intrinsics.c(this.w, b2jVar.w);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        sui suiVar = this.e;
        int hashCode3 = (hashCode2 + (suiVar == null ? 0 : suiVar.hashCode())) * 31;
        av3 av3Var = this.f;
        int d = ljg.d((hashCode3 + (av3Var == null ? 0 : av3Var.hashCode())) * 31, 31, this.g);
        r9k r9kVar = this.h;
        int hashCode4 = (d + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31;
        String str3 = this.i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        r9k r9kVar2 = this.l;
        int hashCode8 = (hashCode7 + (r9kVar2 == null ? 0 : r9kVar2.hashCode())) * 31;
        r9k r9kVar3 = this.m;
        int hashCode9 = (hashCode8 + (r9kVar3 == null ? 0 : r9kVar3.hashCode())) * 31;
        Integer num = this.n;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.o;
        int c2 = dmi.c(dmi.c((hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.p), 31, this.q);
        String str7 = this.r;
        int c3 = dmi.c(dmi.e((c2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.s), 31, this.t);
        String str8 = this.u;
        int hashCode11 = (c3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.v;
        return this.w.hashCode() + ((hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TeamSquadPlayerUiModel(playerId=", ", name=", this.b, ", jerseyNumber=");
        bf3.v(t, this.c, ", position=", this.d, ", teamBadge=");
        t.append(this.e);
        t.append(", countryBadge=");
        t.append(this.f);
        t.append(", absences=");
        t.append(this.g);
        t.append(", age=");
        t.append(this.h);
        t.append(", birthday=");
        bf3.v(t, this.i, ", height=", this.j, ", marketValue=");
        t.append(this.k);
        t.append(", contractInfo=");
        t.append(this.l);
        t.append(", salary=");
        t.append(this.m);
        t.append(", previousTeamId=");
        t.append(this.n);
        t.append(", previousTeamName=");
        bf3.v(t, this.o, ", nationalAppearances=", this.p, ", nationalGoals=");
        bf3.v(t, this.q, ", nationalDebut=", this.r, ", canFollow=");
        t.append(this.s);
        t.append(", sportSlug=");
        t.append(this.t);
        t.append(", rawPosition=");
        bf3.v(t, this.u, ", primaryPosition=", this.v, ", player=");
        t.append(this.w);
        t.append(")");
        return t.toString();
    }
}
